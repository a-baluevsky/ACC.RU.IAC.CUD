package ru.spb.iac.pl.sp.key;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.SecretKey;

import org.picketlink.common.PicketLinkLogger;
import org.picketlink.common.PicketLinkLoggerFactory;
import org.picketlink.common.exceptions.TrustKeyConfigurationException;
import org.picketlink.common.exceptions.TrustKeyProcessingException;
import org.picketlink.config.federation.AuthPropertyType;
import org.picketlink.config.federation.KeyValueType;
import org.picketlink.identity.federation.core.interfaces.TrustKeyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextIDPUtilManager;

 public class KeyStoreKeyManager implements TrustKeyManager {
	private static final PicketLinkLogger LOGGER = PicketLinkLoggerFactory
			.getLogger();

	private static final Logger LOGGERSLF4J = LoggerFactory
			.getLogger(KeyStoreKeyManager.class);

	private final Map<String, Object> options = new HashMap();

	private final HashMap<String, String> domainAliasMap = new HashMap();

	private final HashMap<String, String> authPropsMap = new HashMap();

	private static KeyStore ks = null;
	private static PublicKey publicKey = null;

	private String keyStoreURL;
	private static char[] signingKeyPass;
	private static String signingAlias;
	private String keyStorePass;
	public static final String KEYSTORE_URL = "KeyStoreURL";
	public static final String KEYSTORE_PASS = "KeyStorePass";
	public static final String SIGNING_KEY_PASS = "SigningKeyPass";
	public static final String SIGNING_KEY_ALIAS = "SigningKeyAlias";

	private static PrivateKey privateKey = null;
	private static void initPrivateKey() 
			throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException {
		if(privateKey==null){
			privateKey=(PrivateKey) ks.getKey(signingAlias,
					signingKeyPass);
		}		
	}
	public PrivateKey getSigningKey() 
			throws TrustKeyConfigurationException, TrustKeyProcessingException {
		 return GetSigningKey(this.keyStoreURL, this.keyStorePass);
	}
	
	public static PrivateKey GetSigningKey(String KeyStoreURL, String KeyStorePass) throws TrustKeyConfigurationException,
			TrustKeyProcessingException {
		try {
			LOGGERSLF4J.debug("getSigningKey:01");

			initKeyStore(KeyStoreURL, KeyStorePass);
			initPrivateKey();
			
			return privateKey/*(PrivateKey) ks.getKey(signingAlias,
					signingKeyPass)*/;

		} catch (KeyStoreException e) {
			throw LOGGER.keyStoreConfigurationError(e);
		} catch (NoSuchAlgorithmException e) {
			throw LOGGER.keyStoreProcessingError(e);
		} catch (UnrecoverableKeyException e) {
			throw LOGGER.keyStoreProcessingError(e);
		} catch (GeneralSecurityException e) {
			throw LOGGER.keyStoreProcessingError(e);
		} catch (IOException e) {
			throw LOGGER.keyStoreProcessingError(e);
		}

	}

	// формирование подписи ЦУД
	public KeyPair getSigningKeyPair() throws TrustKeyConfigurationException,
			TrustKeyProcessingException {	
		return GetSigningKeyPair(this.keyStoreURL, this.keyStorePass);
	}
	
	public static KeyPair GetSigningKeyPair(String KeyStoreURL, String KeyStorePass) throws TrustKeyConfigurationException,
			TrustKeyProcessingException {
		try {
			
			LOGGERSLF4J.debug("getSigningKeyPair:01");
			initKeyStore(KeyStoreURL, KeyStorePass);
			if(privateKey==null) {
				privateKey = GetSigningKey(KeyStoreURL, KeyStorePass);
			}
			if (publicKey == null) {				 
				Certificate cert = ks.getCertificate(signingAlias);
				publicKey = cert.getPublicKey();
			}
			return new KeyPair(publicKey, privateKey);
		} catch (KeyStoreException e) {
			throw LOGGER.keyStoreConfigurationError(e);
		} catch (GeneralSecurityException e) {
			throw LOGGER.keyStoreProcessingError(e);
		} catch (IOException e) {
			throw LOGGER.keyStoreProcessingError(e);
		}

	}

	// есть вызовы, но дальше не использованные
	// поэтому чтобы эти вызовы не комментировать
	// будем здесь возвращать null
	public Certificate getCertificate(String alias)
			throws TrustKeyConfigurationException, TrustKeyProcessingException {

		LOGGERSLF4J.debug("getCertificate:01");
		
		return null;

	}

	// не используется
	public PublicKey getPublicKey(String alias)
			throws TrustKeyConfigurationException, TrustKeyProcessingException {
		LOGGERSLF4J.debug("getPublicKey:01");
		throw new TrustKeyConfigurationException("getPublicKey not used!");

	}

	// провверка подписи ИС
	public PublicKey getValidatingKey(String domain)
			throws TrustKeyConfigurationException, TrustKeyProcessingException {
		PublicKey publicKeySys = null;
		try {
			LOGGERSLF4J.debug("getValidatingKey:01:" + domain);

			X509Certificate certSys = null;
			try {

			
				certSys = (new ContextIDPUtilManager()).system_cert(domain);

				 

				if (certSys != null) {
					publicKeySys = certSys.getPublicKey();
				}

			} catch (Exception e) {
				LOGGERSLF4J.error("getValidatingKey:04:error", e);
			}

			 

		} catch (Exception e) {
			throw LOGGER.keyStoreProcessingError(e);
		}
		return publicKeySys;
	}

	private static void initKeyStore(String KeyStoreURL, String KeyStorePass) 
			throws GeneralSecurityException, IOException {

		LOGGERSLF4J.debug("initKeyStore:01");

		if (ks == null) {
			 
			LOGGER.keyStoreSetup();
			ks = LoadKeyStore(KeyStoreURL, KeyStorePass);
		}
		 

		if (ks == null) {
			throw LOGGER.keyStoreNullStore();
		}
	}

	private static void setSigningAlias(String newValue) {
		signingAlias = newValue;
	}
	private static void setSigningKeyPass(char[] newValue) {
		signingKeyPass = newValue;
	}	
	
	public void setAuthProperties(List<AuthPropertyType> authList)
			throws TrustKeyConfigurationException, TrustKeyProcessingException, IllegalArgumentException {
		if(authList==null) throw new IllegalArgumentException("authList can't be null!");
		
		for (AuthPropertyType auth : authList) {
			this.authPropsMap.put(auth.getKey(), auth.getValue());
		}

		this.keyStoreURL = ((String) this.authPropsMap.get("KeyStoreURL"));
		this.keyStorePass = ((String) this.authPropsMap.get("KeyStorePass"));
		setSigningAlias((String) this.authPropsMap.get("SigningKeyAlias"));

		String keypass = (String) this.authPropsMap.get("SigningKeyPass");
		if ((keypass == null) || (keypass.length() == 0)) {
			throw LOGGER.keyStoreNullSigningKeyPass();
		}
		setSigningKeyPass(keypass.toCharArray());
	}

	public void setValidatingAlias(List<KeyValueType> aliases)
			throws TrustKeyConfigurationException, TrustKeyProcessingException {
		for (KeyValueType alias : aliases) {
			this.domainAliasMap.put(alias.getKey(), alias.getValue());
		}
	}

	// не используется
	public SecretKey getEncryptionKey(String domain,
			String encryptionAlgorithm, int keyLength)
			throws TrustKeyConfigurationException, TrustKeyProcessingException {
		LOGGERSLF4J.debug("getEncryptionKey:01");
		throw new TrustKeyConfigurationException("getEncryptionKey not used!");

	}

	public void addAdditionalOption(String key, Object value) {
		this.options.put(key, value);
	}

	public Object getAdditionalOption(String key) {
		return this.options.get(key);
	}

	/*
	private void setUpKeyStore() throws GeneralSecurityException, IOException {
		LOGGERSLF4J.debug("setUpKeyStore:01");

		ks = LoadKeyStore(this.keyStoreURL, this.keyStorePass);		
		
	}
	*/
	

	public static KeyStore LoadKeyStore(String KeyStoreURL, String KeyStorePass) throws IOException {

		String keystoreType = "HDImageStore";
		String keystoreProvider = "JCP";

		FileInputStream inputStream = null;

		try {
			KeyStore keyStore = KeyStore.getInstance(keystoreType,
					keystoreProvider);

			inputStream = new FileInputStream(new File(KeyStoreURL));

			keyStore.load(inputStream, KeyStorePass.toCharArray());

			return keyStore;

		} catch (Exception ex) {

			throw new IOException(ex);

		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException ioe) {
					LOGGERSLF4J.debug("LoadKeyStore:close:IOException "+ioe);
				}
			}
		}

	}

}