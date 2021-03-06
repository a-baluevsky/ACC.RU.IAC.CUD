package ru.spb.iac.cud.idp.valve;

import static org.picketlink.common.constants.GeneralConstants.CONFIG_FILE_LOCATION;
import static org.picketlink.common.constants.GeneralConstants.DEPRECATED_CONFIG_FILE_LOCATION;
import static org.picketlink.common.util.StringUtil.isNotNull;
import static org.picketlink.common.util.StringUtil.isNullOrEmpty;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Context;
import org.apache.catalina.Globals;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Session;
import org.apache.catalina.Valve;
import org.apache.catalina.authenticator.SSLAuthenticator;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.deploy.LoginConfig;
import org.apache.catalina.realm.GenericPrincipal;
import org.apache.catalina.valves.ValveBase;
import org.apache.coyote.ActionCode;
import org.jboss.security.audit.AuditLevel;
import org.picketlink.common.PicketLinkLogger;
import org.picketlink.common.PicketLinkLoggerFactory;
import org.picketlink.common.constants.GeneralConstants;
import org.picketlink.common.constants.JBossSAMLURIConstants;
import org.picketlink.common.exceptions.ConfigurationException;
import org.picketlink.common.exceptions.ParsingException;
import org.picketlink.common.exceptions.ProcessingException;
import org.picketlink.common.exceptions.fed.IssuerNotTrustedException;
import org.picketlink.common.util.StaxUtil;
import org.picketlink.common.util.StringUtil;
import org.picketlink.common.util.SystemPropertiesUtil;
import org.picketlink.config.federation.AuthPropertyType;
import org.picketlink.config.federation.IDPType;
import org.picketlink.config.federation.KeyProviderType;
import org.picketlink.config.federation.PicketLinkType;
import org.picketlink.config.federation.handler.Handlers;
import org.picketlink.identity.federation.api.saml.v2.request.SAML2Request;
import org.picketlink.identity.federation.api.saml.v2.response.SAML2Response;
import org.picketlink.identity.federation.api.saml.v2.sig.SAML2Signature;
import org.picketlink.identity.federation.bindings.tomcat.TomcatRoleGenerator;
import org.picketlink.identity.federation.core.audit.PicketLinkAuditEvent;
import org.picketlink.identity.federation.core.audit.PicketLinkAuditEventType;
import org.picketlink.identity.federation.core.audit.PicketLinkAuditHelper;
import org.picketlink.identity.federation.core.impl.DelegatedAttributeManager;
import org.picketlink.identity.federation.core.interfaces.AttributeManager;
import org.picketlink.identity.federation.core.interfaces.ProtocolContext;
import org.picketlink.identity.federation.core.interfaces.RoleGenerator;
import org.picketlink.identity.federation.core.interfaces.TrustKeyManager;
import org.picketlink.identity.federation.core.saml.v1.SAML11Constants;
import org.picketlink.identity.federation.core.saml.v1.SAML11ProtocolContext;
import org.picketlink.identity.federation.core.saml.v1.writers.SAML11ResponseWriter;
import org.picketlink.identity.federation.core.saml.v2.common.IDGenerator;
import org.picketlink.identity.federation.core.saml.v2.common.SAMLDocumentHolder;
import org.picketlink.identity.federation.core.saml.v2.factories.SAML2HandlerChainFactory;
import org.picketlink.identity.federation.core.saml.v2.holders.IssuerInfoHolder;
import org.picketlink.identity.federation.core.saml.v2.impl.DefaultSAML2HandlerChainConfig;
import org.picketlink.identity.federation.core.saml.v2.impl.DefaultSAML2HandlerRequest;
import org.picketlink.identity.federation.core.saml.v2.impl.DefaultSAML2HandlerResponse;
import org.picketlink.identity.federation.core.saml.v2.interfaces.SAML2Handler;
import org.picketlink.identity.federation.core.saml.v2.interfaces.SAML2Handler.HANDLER_TYPE;
import org.picketlink.identity.federation.core.saml.v2.interfaces.SAML2HandlerChain;
import org.picketlink.identity.federation.core.saml.v2.interfaces.SAML2HandlerChainConfig;
import org.picketlink.identity.federation.core.saml.v2.interfaces.SAML2HandlerRequest;
import org.picketlink.identity.federation.core.saml.v2.interfaces.SAML2HandlerResponse;
import org.picketlink.identity.federation.core.saml.v2.util.AssertionUtil;
import org.picketlink.identity.federation.core.saml.v2.util.HandlerUtil;
import org.picketlink.identity.federation.core.saml.v2.util.XMLTimeUtil;
import org.picketlink.identity.federation.core.sts.PicketLinkCoreSTS;
import org.picketlink.identity.federation.core.util.CoreConfigUtil;
import org.picketlink.identity.federation.core.util.XMLSignatureUtil;
import org.picketlink.identity.federation.core.wstrust.PicketLinkSTSConfiguration;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11AssertionType;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11AttributeStatementType;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11AttributeType;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11NameIdentifierType;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11SubjectType;
import org.picketlink.identity.federation.saml.v1.assertion.SAML11SubjectType.SAML11SubjectTypeChoice;
import org.picketlink.identity.federation.saml.v1.protocol.SAML11ResponseType;
import org.picketlink.identity.federation.saml.v1.protocol.SAML11StatusType;
import org.picketlink.identity.federation.saml.v2.SAML2Object;
import org.picketlink.identity.federation.saml.v2.metadata.EntityDescriptorType;
import org.picketlink.identity.federation.saml.v2.metadata.SPSSODescriptorType;
import org.picketlink.identity.federation.saml.v2.protocol.AuthnRequestType;
import org.picketlink.identity.federation.saml.v2.protocol.LogoutRequestType;
import org.picketlink.identity.federation.saml.v2.protocol.RequestAbstractType;
import org.picketlink.identity.federation.saml.v2.protocol.StatusCodeType;
import org.picketlink.identity.federation.saml.v2.protocol.StatusResponseType;
import org.picketlink.identity.federation.saml.v2.protocol.StatusType;
import org.picketlink.identity.federation.web.config.AbstractSAMLConfigurationProvider;
import org.picketlink.identity.federation.web.core.HTTPContext;
import org.picketlink.identity.federation.web.core.IdentityParticipantStack;
import org.picketlink.identity.federation.web.core.IdentityServer;
import org.picketlink.identity.federation.web.util.ConfigurationUtil;
import org.picketlink.identity.federation.web.util.IDPWebRequestUtil;
import org.picketlink.identity.federation.web.util.IDPWebRequestUtil.WebRequestUtilHolder;
import org.picketlink.identity.federation.web.util.PostBindingUtil;
import org.picketlink.identity.federation.web.util.RedirectBindingUtil;
import org.picketlink.identity.federation.web.util.SAMLConfigurationProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import ru.spb.iac.cud.idp.items.CUDRoleGenerator;
import ru.spb.iac.cud.idp.web.sig.GOSTSAML2Signature;
import ru.spb.iac.cud.idp.web.util.CUDIDPWebRequestUtil;

public abstract class CUDAbstractIDPValve extends ValveBase {

	private static final PicketLinkLogger LOGGER = PicketLinkLoggerFactory
			.getLogger();

	private static final Logger LOGGERSLF4J = LoggerFactory
			.getLogger(CUDAbstractIDPValve.class);

	protected boolean enableAudit = false;

	protected PicketLinkAuditHelper auditHelper = null;

	protected IDPType idpConfiguration = null;

	protected PicketLinkType picketLinkConfiguration = null;

	private RoleGenerator roleGenerator = new TomcatRoleGenerator();

	private TrustKeyManager keyManager;

	private transient DelegatedAttributeManager attribManager = new DelegatedAttributeManager();

	private final List<String> attributeKeys = new ArrayList<String>();

	private transient SAML2HandlerChain chain = null;

	/**
	 * The user can inject a fully qualified name of a
	 * {@link SAMLConfigurationProvider}
	 */
	protected SAMLConfigurationProvider configProvider = null;

	protected int timerInterval = -1;

	protected Timer timer = null;

	/**
	 * <p>
	 * Specifies a different location for the configuration file.
	 * </p>
	 */
	private String configFile;

	/**
	 * A Lock for Handler operations in the chain
	 */
	private final Lock chainLock = new ReentrantLock();

	private Map<String, SPSSODescriptorType> spSSOMetadataMap = new HashMap<String, SPSSODescriptorType>();
	private SSLAuthenticator sslAuthenticator;
	private Handlers handlers;

	public void setAttributeList(String attribList) {
		if (StringUtil.isNotNull(attribList)) {
			this.attributeKeys.clear();
			this.attributeKeys.addAll(StringUtil.tokenize(attribList));
		}
	}

	/**
	 * Set the Timer Value to reload the configuration
	 * 
	 * @param value
	 *            an integer value that represents timer value (in miliseconds)
	 */
	public void setTimerInterval(String value) {
		if (StringUtil.isNotNull(value)) {
			timerInterval = Integer.parseInt(value);
		}
	}

	public void setConfigProvider(String cp) {
		if (cp == null) {
			throw LOGGER.nullArgumentError("configProvider");
		}
		Class<?> clazz = SecurityActions.loadClass(getClass(), cp);
		if (clazz == null) {
			throw new RuntimeException(LOGGER.classNotLoadedError(cp));
		}
		try {
			configProvider = (SAMLConfigurationProvider) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(LOGGER.couldNotCreateInstance(cp, e));
		}
	}

	public void setConfigFile(final String configFile) {
		this.configFile = configFile;
	}

	public void setConfigProvider(
			SAMLConfigurationProvider configurationProvider) {
		this.configProvider = configurationProvider;
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public void setRoleGenerator(String rgName) {
		LOGGER.warn("Option 'roleGenerator' is deprecated and should not be used. This configuration is now set in picketlink.xml.");
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public void setSamlHandlerChainClass(String samlHandlerChainClass) {
		LOGGER.warn("Option 'samlHandlerChainClass' is deprecated and should not be used. This configuration is now set in picketlink.xml.");
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public void setIdentityParticipantStack(String fqn) {
		LOGGER.warn("Option 'identityParticipantStack' is deprecated and should not be used. This configuration is now set in picketlink.xml.");
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public void setStrictPostBinding(Boolean strictPostBinding) {
		LOGGER.warn("Option 'strictPostBinding' is deprecated and should not be used. This configuration is now set in picketlink.xml.");
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public Boolean getIgnoreIncomingSignatures() {
		LOGGER.warn("Option 'ignoreIncomingSignatures' is deprecated and should not be used. Signatures are verified if "
				+ "SAML2SignatureValidationHandler is available.");
		return false;
	}

   /**
	* @deprecated ()
	*/
	@Deprecated
	public void setIgnoreIncomingSignatures(Boolean ignoreIncomingSignature) {
		LOGGER.warn("Option 'ignoreIncomingSignatures' is deprecated and not used. Signatures are verified if "
				+ "SAML2SignatureValidationHandler is available.");
	}

	/**
	 * @deprecated (PLFED-248 Allows to validate the token's signature against the keystore
	 * using the token's issuer.)
	 */
	@Deprecated
	public void setValidatingAliasToTokenIssuer(
			Boolean validatingAliasToTokenIssuer) {
		LOGGER.warn("Option 'validatingAliasToTokenIssuer' is deprecated and not used. The IDP will always use the issuer host to validate signatures.");
	}

	/**
	 * IDP should not do any attributes such as generation of roles etc
	 * 
	 * @param ignoreAttributes
	 */
	public void setIgnoreAttributesGeneration(Boolean ignoreAttributes) {
		if (ignoreAttributes == Boolean.TRUE) {
			this.attribManager = null;
		}
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public Boolean getSignOutgoingMessages() {
		LOGGER.warn("Option signOutgoingMessages is used for signing of error messages. Normal SAML messages are "
				+ "signed by SAML2SignatureGenerationHandler.");
		return true;
	}

	/**
	* @deprecated ()
	*/
	@Deprecated
	public void setSignOutgoingMessages(Boolean signOutgoingMessages) {
		LOGGER.warn("Option signOutgoingMessages is used for signing of error messages. Normal SAML messages are "
				+ "signed by SAML2SignatureGenerationHandler.");
	}

	public PicketLinkType getConfiguration() {
		return this.picketLinkConfiguration;
	}

	public TrustKeyManager getKeyManager() {
		return this.keyManager;
	}

	@Override
	public void invoke(Request request, Response response) throws IOException,
			ServletException {
		// Look for unauthorized status
		if (isUnauthorized(response)) {
			handleUnauthorizedResponse(request, response);
			return;
		}

		LOGGERSLF4J.debug("invoke:01");

		if (isNotNull(request.getParameter(GeneralConstants.SAML_REQUEST_KEY))) {
			// �������, ��� ��� ����� ������ �� ��

			if (request.getSessionInternal().getNote("overauth") != null) {
				request.getSessionInternal().removeNote("overauth");
				// ��������� ��������
				request.getSessionInternal().setNote(
						GeneralConstants.SAML_REQUEST_KEY + "_overauth",
						request.getSessionInternal().getNote(
								GeneralConstants.SAML_REQUEST_KEY));

				LOGGERSLF4J.debug("invoke:02:"
						+ request.getSession().getAttribute(
								"incoming_http_method"));

				request.getSession().setAttribute(
						"incoming_http_method" + "_overauth",
						request.getSession().getAttribute(
								"incoming_http_method"));
			}
		}

		// first, we populate all required parameters sent into session for
		// later retrieval. If they exists.
		populateSessionWithSAMLParameters(request);

		// get an authenticated user or tries to authenticate if this is a
		// authentication request
		Principal userPrincipal = getUserPrincipal(request, response);

		LOGGERSLF4J.debug("invoke:03:" + userPrincipal);

		// we only handle SAML messages for authenticated users.
		
		if (userPrincipal != null
				&& request.getSessionInternal().getNote("overauth") == null) {
			handleSAMLMessage(request, response);
		} else if (isNotNull(request
				.getParameter(GeneralConstants.SAML_REQUEST_KEY))
				&& isLogout(request)) {
			// logout
			LOGGERSLF4J.debug("invoke:04");
			try {
				// !!!
				// ����� reset, �.�. � ������� ����� ���� ����� ���� ����������
				// sendRedirect
				// ���� � � ������� � ������ ����� �� logout, �� �� ������
				// ������ ����� reset() �����.
				response.reset();
				response.recycle();
				handleLogout(request, response);

			} finally {
				// cleanUpSessionNote(request);
				request.getSession().invalidate();
			}
		} else if (isIsPassiveFailed(request)) {
			// ��� �������� ������ ��� isPassive �������
			LOGGERSLF4J.debug("invoke:05");
			try {
				// response.reset();
				response.recycle();
				handleIsPassiveFailedResponse(request, response);

			} finally {
				resetIsPassiveFailed(request);
				cleanUpSessionNote(request);
			}
		}
		LOGGERSLF4J.debug("invoke:06");
	}

	private void handleSAMLMessage(Request request, Response response)
			throws IOException, ServletException {
		if (hasSAML11Target(request)) {
			// We have SAML 1.1 IDP first scenario. Now we need to create a
			// SAMLResponse and send back
			// to SP as per target
			handleSAML11(request, response);
		} else {
			Session session = request.getSessionInternal();

			String samlRequestMessage = (String) session
					.getNote(GeneralConstants.SAML_REQUEST_KEY);
			String samlResponseMessage = (String) session
					.getNote(GeneralConstants.SAML_RESPONSE_KEY);

			/**
			 * Since the container has finished the authentication, we can
			 * retrieve the original saml message as well as any relay state
			 * from the SP
			 */
			String relayState = (String) session
					.getNote(GeneralConstants.RELAY_STATE);
			String signature = (String) session
					.getNote(GeneralConstants.SAML_SIGNATURE_REQUEST_KEY);
			String sigAlg = (String) session
					.getNote(GeneralConstants.SAML_SIG_ALG_REQUEST_KEY);

			if (LOGGER.isTraceEnabled()) {
				StringBuilder builder = new StringBuilder();
				builder.append("Retrieved saml messages and relay state from session");
				builder.append("saml Request message=").append(
						samlRequestMessage);
				builder.append("::").append("SAMLResponseMessage=");
				builder.append(samlResponseMessage).append(":")
						.append("relay state=").append(relayState);

				builder.append("Signature=").append(signature)
						.append("::sigAlg=").append(sigAlg);
				LOGGER.trace(builder.toString());
			}

			if (isNotNull(samlRequestMessage)) {
				processSAMLRequestMessage(request, response);
			} else if (isNotNull(samlResponseMessage)) {
				processSAMLResponseMessage(request, response);
			} else if (request.getRequestURI().equals(
					request.getContextPath() + "/")) {
				// no SAML processing and the request is asking for /.
				forwardHosted(request, response);
			}
		}
	}

	/**
	 * <p>
	 * Checks if the given {@link Request} containes a SAML11 Target parameter.
	 * Usually this indicates that the given request is a SAML11 request.
	 * </p>
	 * 
	 * @param request
	 * @return
	 */
	private boolean hasSAML11Target(Request request) {
		return isNotNull(request.getParameter(SAML11Constants.TARGET));
	}

	private void forwardHosted(Request request, Response response)
			throws ServletException, IOException {
		LOGGER.trace("SAML 1.1::Proceeding to IDP index page");
		RequestDispatcher dispatch = getContext().getServletContext()
				.getRequestDispatcher(this.idpConfiguration.getHostedURI());

		recycle(response);

		try {
			includeResource(request, response, dispatch);
		} catch (ClassCastException cce) {
			// JBAS5.1 and 6 quirkiness
			includeResource(request.getRequest(), response, dispatch);
		}
	}

	/**
	 * <p>
	 * Before forwarding we need to know the content length of the target
	 * resource in order to configure the response properly. This is necessary
	 * because the valve already have written to the response, and we want to
	 * override with the target resource data.
	 * </p>
	 * 
	 * @param request
	 * @param response
	 * @param dispatch
	 * @throws ServletException
	 * @throws IOException
	 */
	private void includeResource(ServletRequest request, Response response,
			RequestDispatcher dispatch) throws ServletException, IOException {
		dispatch.include(request, response);

		// we need to re-configure the content length because Tomcat will
		// truncate the output with the size of the welcome page
		// (eg.: index.html).
		response.getCoyoteResponse().setContentLength(
				response.getContentCount());
	}

	/**
	 * <p>
	 * SAML parameters are also populated into session if they are present in
	 * the request. This allows the IDP to retrieve them later when handling a
	 * specific SAML request or response.
	 * </p>
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	private void populateSessionWithSAMLParameters(Request request)
			throws IOException {
		String samlRequestMessage = request
				.getParameter(GeneralConstants.SAML_REQUEST_KEY);
		String samlResponseMessage = request
				.getParameter(GeneralConstants.SAML_RESPONSE_KEY);

		boolean containsSAMLRequestMessage = isNotNull(samlRequestMessage);
		boolean containsSAMLResponseMessage = isNotNull(samlResponseMessage);

		String signature = request
				.getParameter(GeneralConstants.SAML_SIGNATURE_REQUEST_KEY);
		String sigAlg = request
				.getParameter(GeneralConstants.SAML_SIG_ALG_REQUEST_KEY);
		String relayState = request.getParameter(GeneralConstants.RELAY_STATE);

		if (isNotNull(relayState)) {
			relayState = RedirectBindingUtil.urlDecode(relayState);
		}

		Session session = request.getSessionInternal();

		if (containsSAMLRequestMessage || containsSAMLResponseMessage) {
			LOGGER.trace("Storing the SAMLRequest/SAMLResponse and RelayState in session");
			if (isNotNull(samlRequestMessage)) {
				session.setNote(GeneralConstants.SAML_REQUEST_KEY,
						samlRequestMessage);
			}
			if (isNotNull(samlResponseMessage)) {
				session.setNote(GeneralConstants.SAML_RESPONSE_KEY,
						samlResponseMessage);
			}
			if (isNotNull(relayState)) {
				session.setNote(GeneralConstants.RELAY_STATE, relayState.trim());
			}
			if (isNotNull(signature)) {
				session.setNote(GeneralConstants.SAML_SIGNATURE_REQUEST_KEY,
						signature.trim());
			}
			if (isNotNull(sigAlg)) {
				session.setNote(GeneralConstants.SAML_SIG_ALG_REQUEST_KEY,
						sigAlg.trim());
			}
		}
	}

	/**
	 * <p>
	 * Handles an unauthorized response returned by a service provider.
	 * </p>
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void handleUnauthorizedResponse(Request request, Response response)
			throws IOException, ServletException {
		IDPWebRequestUtil webRequestUtil = new IDPWebRequestUtil(request,
				idpConfiguration, keyManager);
		Document samlErrorResponse = null;
		String referer = request.getHeader("Referer");
		String relayState = request.getParameter(GeneralConstants.RELAY_STATE);

		if (isNotNull(relayState)) {
			relayState = RedirectBindingUtil.urlDecode(relayState);
		}

		try {
			samlErrorResponse = webRequestUtil.getErrorResponse(referer,
					JBossSAMLURIConstants.STATUS_AUTHNFAILED.get(),
					getIdentityURL(),
					this.idpConfiguration.isSupportsSignature());

			WebRequestUtilHolder holder = webRequestUtil.getHolder();
			holder.setResponseDoc(samlErrorResponse).setDestination(referer)
					.setRelayState(relayState).setAreWeSendingRequest(false)
					.setPrivateKey(null).setSupportSignature(false)
					.setServletResponse(response).setErrorResponse(true);
			holder.setPostBindingRequested(webRequestUtil
					.hasSAMLRequestInPostProfile());

			if (this.idpConfiguration.isSupportsSignature()) {
				holder.setSupportSignature(true).setPrivateKey(
						keyManager.getSigningKey());
			}

			holder.setStrictPostBinding(this.idpConfiguration
					.isStrictPostBinding());

			webRequestUtil.send(holder);
		} catch (GeneralSecurityException e) {
			throw new ServletException(e);
		}
	}

	private void handleIsPassiveFailedResponse(Request request,
			Response response) throws IOException, ServletException {

		LOGGERSLF4J.debug("handleIsPassiveFailedResponse:01");

		IDPWebRequestUtil webRequestUtil = new CUDIDPWebRequestUtil(request,
				idpConfiguration, keyManager);

		Document samlErrorResponse = null;
		String referer = request.getHeader("Referer");
		String relayState = request.getParameter(GeneralConstants.RELAY_STATE);

		String destination = null;

		try {
			String samlRequestMessage = request
					.getParameter(GeneralConstants.SAML_REQUEST_KEY);
			SAMLDocumentHolder samlDocumentHolder = webRequestUtil
					.getSAMLDocumentHolder(samlRequestMessage);
			SAML2Object samlObject = samlDocumentHolder.getSamlObject();
			AuthnRequestType authRequest = (AuthnRequestType) samlObject;
			destination = authRequest.getAssertionConsumerServiceURL()
					.toASCIIString();
		} catch (Exception e) {
			LOGGERSLF4J.error("handleIsPassiveFailedResponse:error:", e);
		}

		LOGGERSLF4J.debug("handleIsPassiveFailedResponse:02:" + destination);

		if (isNotNull(relayState)) {
			relayState = RedirectBindingUtil.urlDecode(relayState);
		}

		try {
			samlErrorResponse = webRequestUtil.getErrorResponse(
					referer,
					// JBossSAMLURIConstants.STATUS_AUTHNFAILED.get(),
					JBossSAMLURIConstants.STATUS_UNKNOWN_PRINCIPAL.get(),
					getIdentityURL(),
					this.idpConfiguration.isSupportsSignature());

			WebRequestUtilHolder holder = webRequestUtil.getHolder();
			holder.setResponseDoc(samlErrorResponse)
					.setDestination(destination)
					.setRelayState(relayState).setAreWeSendingRequest(false)
					.setPrivateKey(null).setSupportSignature(false)
					.setServletResponse(response).setErrorResponse(true);
			holder.setPostBindingRequested(webRequestUtil
					.hasSAMLRequestInPostProfile());

			if (this.idpConfiguration.isSupportsSignature()) {
				LOGGERSLF4J.debug("handleIsPassiveFailedResponse:02");

				holder.setSupportSignature(true).setPrivateKey(
						keyManager.getSigningKey());
			}

			holder.setStrictPostBinding(this.idpConfiguration
					.isStrictPostBinding());

			LOGGERSLF4J.debug("handleIsPassiveFailedResponse:03:"
					+ this.idpConfiguration.isStrictPostBinding());

			webRequestUtil.send(holder);

		} catch (GeneralSecurityException e) {
			throw new ServletException(e);
		}
	}

	private void handleLogout(Request request, Response response)
			throws IOException, ServletException {

		LOGGERSLF4J.debug("handleLogout:01");

		// IDPWebRequestUtil w/ebRequestUtil = /new /IDPWebRequestUtil/(request,
		// /idpConfiguration, /keyManager);
		IDPWebRequestUtil webRequestUtil = new CUDIDPWebRequestUtil(request,
				idpConfiguration, keyManager);

		Document samlResponseDoc = null;
		
		String relayState = request.getParameter(GeneralConstants.RELAY_STATE);

		URI destination = null;
		String logoutRequestID = null;
		String logoutBackUrl = null;
		try {
			String samlRequestMessage = request
					.getParameter(GeneralConstants.SAML_REQUEST_KEY);
			SAMLDocumentHolder samlDocumentHolder = webRequestUtil
					.getSAMLDocumentHolder(samlRequestMessage);
			SAML2Object samlObject = samlDocumentHolder.getSamlObject();
			LogoutRequestType logoutRequest = (LogoutRequestType) samlObject;

			logoutRequestID = logoutRequest.getID();

			// destination =
			// authRequest/.getAssertionConsumerServiceURL()/.toASCIIString();
			destination = logoutRequest.getDestination();

			if (destination != null) {
				logoutBackUrl = LocalWebUtil.getTokenValue(
						destination.toString(), "logoutBackUrl");
				logoutBackUrl = URLDecoder.decode(logoutBackUrl, "UTF-8");
			}

		} catch (Exception e) {
			LOGGERSLF4J.error("handleLogout:error:", e);
		}

		LOGGERSLF4J.debug("handleLogout:02:" + logoutBackUrl);

		if (isNotNull(relayState)) {
			relayState = RedirectBindingUtil.urlDecode(relayState);
		}

		try {
			StatusResponseType statusResponse = new StatusResponseType(
					IDGenerator.create("ID_"), XMLTimeUtil.getIssueInstant());

			// Status
			StatusType statusType = new StatusType();
			StatusCodeType statusCodeType = new StatusCodeType();
			statusCodeType.setValue(URI
					.create(JBossSAMLURIConstants.STATUS_SUCCESS.get()));
			statusType.setStatusCode(statusCodeType);

			statusResponse.setStatus(statusType);

			statusResponse.setInResponseTo(logoutRequestID);

			IssuerInfoHolder idpIssuer = new IssuerInfoHolder(getIdentityURL());

			statusResponse.setIssuer(idpIssuer.getIssuer());

			// !!!
			statusResponse.setDestination(logoutBackUrl);

			SAML2Signature samlSignature = new GOSTSAML2Signature();
			samlSignature
					.setSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411");
			samlSignature
					.setDigestMethod("http://www.w3.org/2001/04/xmldsig-more#gostr3411");

			SAML2Response saml2Response = new SAML2Response();
			samlResponseDoc = saml2Response.convert(statusResponse);

			 

			// /samlResponseDoc = /ss.sign/(statusResponse,
			// keyManager/.getSigningKeyPair());
			Node nextSibling = samlSignature
					.getNextSiblingOfIssuer(samlResponseDoc);
			samlSignature.setNextSibling(nextSibling);
			samlSignature.signSAMLDocument(samlResponseDoc,
					keyManager.getSigningKeyPair());

			 

			WebRequestUtilHolder holder = webRequestUtil.getHolder();
			holder.setResponseDoc(samlResponseDoc)
					.setDestination(logoutBackUrl/* referer */)
					.setRelayState(relayState).setAreWeSendingRequest(false)
					.setPrivateKey(null).setSupportSignature(false)
					.setServletResponse(response).setErrorResponse(true);
			holder.setPostBindingRequested(webRequestUtil
					.hasSAMLRequestInPostProfile());

			if (this.idpConfiguration.isSupportsSignature()) {
				LOGGERSLF4J.debug("handleLogout:05");

				holder.setSupportSignature(true).setPrivateKey(
						keyManager.getSigningKey());
			}

			holder.setStrictPostBinding(this.idpConfiguration
					.isStrictPostBinding());

			LOGGERSLF4J.debug("handleLogout:06:"
					+ this.idpConfiguration.isStrictPostBinding());

			webRequestUtil.send(holder);

			LOGGERSLF4J.debug("handleLogout:07");

		} catch (GeneralSecurityException e) {
			throw new ServletException(e);
		}
	}

	private boolean isUnauthorized(Response response) {
		return response.getStatus() == HttpServletResponse.SC_FORBIDDEN;
	}

	private boolean isIsPassiveFailed(Request request) {
		return "true".equals(request.getSession().getAttribute(
				"is_passive_failed"));
	}

	private void resetIsPassiveFailed(Request request) {
		request.getSession().removeAttribute("is_passive_failed");
	}

	private boolean isLogout(Request request) {
		boolean result = false;

		try {
			LOGGERSLF4J.debug("isLogout:01");

			String samlRequestMessage = (String) request.getSessionInternal()
					.getNote(GeneralConstants.SAML_REQUEST_KEY);
			// !!!
			// ��� logout �� �� ��������� incoming_http_method � ������
			// ������� ���� ����� ��� � ExtFilter �� �������
			// boolean begin_req_method =
			// "GET"/.equals((String/)request/.getSession()/.getAttribute(/"incoming_http_method"));
			boolean begin_req_method = "GET".equals((String) request
					.getMethod());

			LOGGERSLF4J.debug("isLogout:01+:" + begin_req_method);

			SAMLDocumentHolder samlDocumentHolder = getSAMLDocumentHolder(
					samlRequestMessage, begin_req_method);
			if (samlDocumentHolder != null) {
				LOGGERSLF4J.debug("isLogout:02:"
						+ (samlDocumentHolder.getSamlObject() == null));

				if (samlDocumentHolder.getSamlObject() != null) {
					// RequestAbstractType /requestAbstractType /=
					// (/RequestAbstractType)samlDocumentHolder/.getSamlObject(/);
					// AuthnRequestType requestAbstractType =
					// (AuthnRequestType)/samlDocumentHolder/.getSamlObject(/);

					if (samlDocumentHolder.getSamlObject() instanceof LogoutRequestType == true) {
						result = true;
					}
				}
			}
			LOGGERSLF4J.debug("isLogout:03:" + result);

		} catch (Exception e) {
			LOGGERSLF4J.error("isLogout:error:", e);
		}

		return result;
	}

	/**
	 * <p>
	 * Returns the authenticated principal. If there is no principal associated
	 * with the {@link Request}, null is returned.
	 * </p>
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws ServletException
	 */
	private Principal getUserPrincipal(Request request, Response response)
			throws IOException, ServletException {
		Principal userPrincipal = request.getPrincipal();

		if (userPrincipal == null) {
			if (this.idpConfiguration.isSSLClientAuthentication()) {
				if (request.isSecure()) {
					getSSLAuthenticator().invoke(request, response);

					// we always reset/recycle the response to remove any data
					// written to the response by the ssl
					// authenticator
					response.resetBuffer();
					response.recycle();
				}
			}

			userPrincipal = request.getPrincipal();

			// we always fall back to the configured authentication method.
			if (userPrincipal == null) {
				getNext().invoke(request, response);
			}

			userPrincipal = request.getPrincipal();
		}

		return userPrincipal;
	}

	public Principal authenticateSSL(Request request, Response response)
			throws IOException {
		// Retrieve the certificate chain for this client
		// if /(containerLog.isDebugEnabled(/))
		// containerLog.debug(" /Looking up certificates");

		X509Certificate certs[] = (X509Certificate[]) request
				.getAttribute(Globals.CERTIFICATES_ATTR);

		if ((certs == null) || (certs.length < 1)) {
			try {
				request.getCoyoteRequest().action(
						ActionCode.ACTION_REQ_SSL_CERTIFICATE, null);
			} catch (IllegalStateException ise) {
				// Request body was too large for save buffer
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
						sm.getString("authenticator.certificates"));
				return null;
			}
			certs = (X509Certificate[]) request
					.getAttribute(Globals.CERTIFICATES_ATTR);
		}

		if ((certs == null) || (certs.length < 1)) {
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
					sm.getString("authenticator.certificates"));
			return null;
		}

		// Authenticate the specified certificate chain
		Principal principal = getContext().getRealm().authenticate(certs);

		if (principal == null) {
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
					sm.getString("authenticator.unauthorized"));
			return null;
		}

		return principal;
	}

	protected void handleSAML11(Request request, Response response)
			throws ServletException, IOException {
		try {
			IDPWebRequestUtil webRequestUtil = new IDPWebRequestUtil(request,
					idpConfiguration, keyManager);

			Principal userPrincipal = request.getPrincipal();
			String contextPath = getContextPath();

			String target = request.getParameter(SAML11Constants.TARGET);

			Session session = request.getSessionInternal();
			SAML11AssertionType saml11Assertion = (SAML11AssertionType) session
					.getNote("SAML11");
			if (saml11Assertion == null) {
				SAML11ProtocolContext saml11Protocol = new SAML11ProtocolContext();
				saml11Protocol.setIssuerID(getIdentityURL());
				SAML11SubjectType subject = new SAML11SubjectType();
				SAML11SubjectTypeChoice subjectChoice = new SAML11SubjectTypeChoice(
						new SAML11NameIdentifierType(userPrincipal.getName()));
				subject.setChoice(subjectChoice);
				saml11Protocol.setSubjectType(subject);

				PicketLinkCoreSTS.instance().issueToken(saml11Protocol);
				saml11Assertion = saml11Protocol.getIssuedAssertion();
				session.setNote("SAML11", saml11Assertion);

				if (AssertionUtil.hasExpired(saml11Assertion)) {
					saml11Protocol.setIssuedAssertion(saml11Assertion);
					PicketLinkCoreSTS.instance().renewToken(saml11Protocol);
					saml11Assertion = saml11Protocol.getIssuedAssertion();
					session.setNote("SAML11", saml11Assertion);
				}
			}
			GenericPrincipal genericPrincipal = (GenericPrincipal) userPrincipal;
			String[] roles = genericPrincipal.getRoles();
			SAML11AttributeStatementType attributeStatement = this
					.createAttributeStatement(Arrays.asList(roles));
			if (attributeStatement != null) {
				saml11Assertion.add(attributeStatement);
			}

			// Send it as SAMLResponse
			String id = IDGenerator.create("ID_");
			SAML11ResponseType saml11Response = new SAML11ResponseType(id,
					XMLTimeUtil.getIssueInstant());
			saml11Response.add(saml11Assertion);
			saml11Response.setStatus(SAML11StatusType.successType());

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			SAML11ResponseWriter writer = new SAML11ResponseWriter(
					StaxUtil.getXMLStreamWriter(baos));
			writer.write(saml11Response);

			Document samlResponse = org.picketlink.identity.federation.core.saml.v2.util.DocumentUtil
					.getDocument(new ByteArrayInputStream(baos.toByteArray()));

			WebRequestUtilHolder holder = webRequestUtil.getHolder();
			holder.setResponseDoc(samlResponse).setDestination(target)
					.setRelayState("").setAreWeSendingRequest(false)
					.setPrivateKey(null).setSupportSignature(false)
					.setServletResponse(response);

			if (enableAudit) {
				PicketLinkAuditEvent auditEvent = new PicketLinkAuditEvent(
						AuditLevel.INFO);
				auditEvent.setType(PicketLinkAuditEventType.RESPONSE_TO_SP);
				auditEvent.setDestination(target);
				auditEvent.setWhoIsAuditing(contextPath);
				auditHelper.audit(auditEvent);
			}

			response.getCoyoteResponse().recycle();

			webRequestUtil.send(holder);
		} catch (GeneralSecurityException e) {
			LOGGER.samlIDPHandlingSAML11Error(e);
			throw new ServletException();
		}
	}

	protected void processSAMLRequestMessage(Request request, Response response)
			throws IOException {
		Principal userPrincipal = request.getPrincipal();
		Session session = request.getSessionInternal();
		SAMLDocumentHolder samlDocumentHolder = null;
		SAML2Object samlObject = null;

		Document samlResponse = null;
		boolean isErrorResponse = false;
		String destination = null;
		String destinationQueryStringWithSignature = null;

		Boolean requestedPostProfile = null;

		String samlRequestMessage = (String) session
				.getNote(GeneralConstants.SAML_REQUEST_KEY);

		String relayState = (String) session
				.getNote(GeneralConstants.RELAY_STATE);

		String contextPath = getContextPath();

		boolean willSendRequest = false;

		String referer = request.getHeader("Referer");

		cleanUpSessionNote(request);

		// Determine the transport mechanism
		//boolean isSecure = request isSecure 
		// String /loginType = /determineLoginType(isSecure) 

		String loginType = request.getAuthType();

		LOGGERSLF4J.debug("processSAMLRequestMessage:01:" + request.getMethod());
		LOGGERSLF4J.debug("processSAMLRequestMessage:02:" + loginType);
		 

		IDPWebRequestUtil webRequestUtil = new IDPWebRequestUtil(request,
				idpConfiguration, keyManager);

		try {

			samlDocumentHolder = webRequestUtil
					.getSAMLDocumentHolder(samlRequestMessage);
			samlObject = samlDocumentHolder.getSamlObject();

			if (!(samlObject instanceof RequestAbstractType)) {
				throw LOGGER.wrongTypeError(samlObject.getClass().getName());
			}

			// Get the SAML Request Message
			RequestAbstractType requestAbstractType = (RequestAbstractType) samlObject;
			String issuer = requestAbstractType.getIssuer().getValue();

			if (samlRequestMessage == null) {
				throw LOGGER.samlIDPValidationCheckFailed();
			}

			IssuerInfoHolder idpIssuer = new IssuerInfoHolder(getIdentityURL());
			ProtocolContext protocolContext = new HTTPContext(request,
					response, getContext().getServletContext());
			// Create the request/response
			SAML2HandlerRequest saml2HandlerRequest = new DefaultSAML2HandlerRequest(
					protocolContext, idpIssuer.getIssuer(), samlDocumentHolder,
					HANDLER_TYPE.IDP);
			saml2HandlerRequest.setRelayState(relayState);

			/*
			 * if /(StringUtil/.isNotNull(/loginType)) {
			 * saml2HandlerRequest/.addOption(GeneralConstants.LOGIN_TYPE,
			 * loginType/); }
			 */

			String assertionID = (String) session.getSession().getAttribute(
					GeneralConstants.ASSERTION_ID);

			// Set the options on the handler request
			Map<String, Object> requestOptions = new HashMap<String, Object>();

			if (StringUtil.isNotNull(loginType)) {
				requestOptions.put(GeneralConstants.LOGIN_TYPE, loginType);
			}

			requestOptions.put(GeneralConstants.IGNORE_SIGNATURES,
					willIgnoreSignatureOfCurrentRequest(issuer));
			requestOptions.put(GeneralConstants.SP_SSO_METADATA_DESCRIPTOR,
					spSSOMetadataMap.get(issuer));
			requestOptions.put(GeneralConstants.ROLE_GENERATOR, roleGenerator);
			requestOptions.put(GeneralConstants.CONFIGURATION,
					this.idpConfiguration);
			requestOptions.put(GeneralConstants.SAML_IDP_STRICT_POST_BINDING,
					this.idpConfiguration.isStrictPostBinding());
			requestOptions.put(GeneralConstants.SUPPORTS_SIGNATURES,
					this.idpConfiguration.isSupportsSignature());

			if (assertionID != null) {
				requestOptions.put(GeneralConstants.ASSERTION_ID, assertionID);
			}

			if (this.keyManager != null) {
				// PublicKey validatingKey = getIssuerPublicKey(request,
				// issuer);
				PublicKey validatingKey = getIssuerPublicKey(issuer);
				requestOptions.put(GeneralConstants.SENDER_PUBLIC_KEY,
						validatingKey);
				requestOptions.put(GeneralConstants.DECRYPTING_KEY,
						keyManager.getSigningKey());
			}

			// if this is a SAML AuthnRequest load the roles using the
			// generator.
			if (requestAbstractType instanceof AuthnRequestType) {

				AuthnRequestType so = (AuthnRequestType) saml2HandlerRequest
						.getSAML2Object();

				String codeSystem = so.getIssuer().getValue();
				LOGGERSLF4J.debug("handleRequestType:03:" + codeSystem);

				// session.getSession().setAttribute("CUD_CODE_SYSTEM",
				// codeSystem);

				((CUDRoleGenerator) roleGenerator).setSystemCode(codeSystem);

				List<String> roles = roleGenerator.generateRoles(userPrincipal);
				session.getSession().setAttribute(GeneralConstants.ROLES_ID,
						roles);

				// ����� ���������/���������� �������� �������� - ���������
				// ���� ����������������
				// List<String>/ resources =
				// ((CUDRoleGenerator/)roleGenerator)/.generateResources(userPrincipal);
				// session/.getSession()/.setAttribute("CUD_RESOURCES",
				// resources);

				Map<String, Object> attribs = this.attribManager.getAttributes(
						userPrincipal, attributeKeys);
				requestOptions.put(GeneralConstants.ATTRIBUTES, attribs);
			}

			if (auditHelper != null) {
				requestOptions.put(GeneralConstants.AUDIT_HELPER, auditHelper);
				requestOptions.put(GeneralConstants.CONTEXT_PATH, contextPath);
			}

			saml2HandlerRequest.setOptions(requestOptions);

			SAML2HandlerResponse saml2HandlerResponse = new DefaultSAML2HandlerResponse();

			Set<SAML2Handler> handlers = chain.handlers();

			LOGGER.trace("Handlers are=" + handlers);

			if (handlers != null) {
				try {
					if (getConfiguration().getHandlers().isLocking()) {
						chainLock.lock();
					}
					for (SAML2Handler handler : handlers) {
						handler.handleRequestType(saml2HandlerRequest,
								saml2HandlerResponse);
						willSendRequest = saml2HandlerResponse.getSendRequest();
					}
				} finally {
					if (getConfiguration().getHandlers().isLocking()) {
						chainLock.unlock();
					}
				}
			}

			samlResponse = saml2HandlerResponse.getResultingDocument();
			relayState = saml2HandlerResponse.getRelayState();

			destination = saml2HandlerResponse.getDestination();

			requestedPostProfile = saml2HandlerResponse
					.isPostBindingForResponse();

			LOGGERSLF4J.debug("processSAMLRequestMessage:04:"
					+ requestedPostProfile);

			destinationQueryStringWithSignature = saml2HandlerResponse
					.getDestinationQueryStringWithSignature();
		} catch (Exception e) {
			String status = JBossSAMLURIConstants.STATUS_AUTHNFAILED.get();
			if (e instanceof IssuerNotTrustedException
					|| e.getCause() instanceof IssuerNotTrustedException) {
				status = JBossSAMLURIConstants.STATUS_REQUEST_DENIED.get();
			}
			LOGGER.samlIDPRequestProcessingError(e);
			samlResponse = webRequestUtil.getErrorResponse(referer, status,
					getIdentityURL(),
					this.idpConfiguration.isSupportsSignature());
			isErrorResponse = true;
		} finally {
			try {
				// if the destination is null, probably because some error occur
				// during authentication, use the AuthnRequest
				// AssertionConsumerServiceURL as the destination
				if (destination == null
						&& samlObject instanceof AuthnRequestType) {
					AuthnRequestType authRequest = (AuthnRequestType) samlObject;

					destination = authRequest.getAssertionConsumerServiceURL()
							.toASCIIString();
				}

				// if destination is still empty redirect the user to the
				// identity url. If the user is already authenticated he
				// will be probably redirected to the idp hosted page.
				if (destination == null) {
					response.sendRedirect(getIdentityURL());
				} else {
					WebRequestUtilHolder holder = webRequestUtil.getHolder();
					holder.setResponseDoc(samlResponse)
							.setDestination(destination)
							.setRelayState(relayState)
							.setAreWeSendingRequest(willSendRequest)
							.setPrivateKey(null)
							.setSupportSignature(false)
							.setErrorResponse(isErrorResponse)
							.setServletResponse(response)
							.setDestinationQueryStringWithSignature(
									destinationQueryStringWithSignature);

					holder.setStrictPostBinding(this.idpConfiguration
							.isStrictPostBinding());

					if (requestedPostProfile != null) {
						holder.setPostBindingRequested(requestedPostProfile);
					} else {
						holder.setPostBindingRequested(webRequestUtil
								.hasSAMLRequestInPostProfile());
					}

					if (this.idpConfiguration.isSupportsSignature()) {
						holder.setPrivateKey(keyManager.getSigningKey())
								.setSupportSignature(true);
					}

					if (holder.isPostBinding()) {
						recycle(response);
					}

					if (enableAudit) {
						PicketLinkAuditEvent auditEvent = new PicketLinkAuditEvent(
								AuditLevel.INFO);
						auditEvent
								.setType(PicketLinkAuditEventType.RESPONSE_TO_SP);
						auditEvent.setDestination(destination);
						auditEvent.setWhoIsAuditing(contextPath);
						auditHelper.audit(auditEvent);
					}

					webRequestUtil.send(holder);
				}
			} catch (ParsingException e) {
				LOGGER.samlAssertionPasingFailed(e);
			} catch (GeneralSecurityException e) {
				LOGGER.trace("Security Exception:", e);
			} catch (Exception e) {
				LOGGER.error(e);
			}
		}
		return;
	}

	/**
	 * Returns the PublicKey to be used for the token's signature verification.
	 * This key is related with the issuer of the SAML message received by the
	 * IDP.
	 * 
	 * @param request
	 * @param issuer
	 * @return
	 * @throws ProcessingException
	 * @throws ConfigurationException
	 */
	private PublicKey getIssuerPublicKey(Request request, String issuer)
			throws ConfigurationException, ProcessingException {
		String issuerHost = null;
		PublicKey issuerPublicKey = null;

		try {
			issuerHost = new URL(issuer).getHost();
		} catch (MalformedURLException e) {
			LOGGER.trace("Token issuer is not a valid URL: " + issuer, e);
			issuerHost = issuer;
		}

		LOGGER.trace("Trying to find a PK for issuer: " + issuerHost);
		try {
			issuerPublicKey = CoreConfigUtil.getValidatingKey(keyManager,
					issuerHost);
		} catch (IllegalStateException ise) {
			LOGGER.trace("Token issuer is not found for: " + issuer, ise);
		}

		if (issuerPublicKey == null) {
			issuerHost = request.getRemoteAddr();

			LOGGER.trace("Trying to find a PK for issuer " + issuerHost);
			issuerPublicKey = CoreConfigUtil.getValidatingKey(keyManager,
					issuerHost);
		}

		LOGGER.trace("Using Validating Alias=" + issuerHost
				+ " to check signatures.");

		return issuerPublicKey;
	}

	/**
	 * issuer - ��� ��� ������� ��� ����������
	 */
	private PublicKey getIssuerPublicKey(String issuer)
			throws ConfigurationException, ProcessingException {
		PublicKey issuerPublicKey = null;

		LOGGERSLF4J.debug("getIssuerPublicKey:01:" + issuer);

		try {
			issuerPublicKey = CoreConfigUtil.getValidatingKey(keyManager,
					issuer);
		} catch (IllegalStateException ise) {
			LOGGER.trace("Token issuer is not found for: " + issuer, ise);
		}
		LOGGER.trace("Using Validating Alias=" + issuer
				+ " to check signatures.");

		LOGGERSLF4J.debug("getIssuerPublicKey:02:" + issuerPublicKey);

		return issuerPublicKey;
	}

	protected void processSAMLResponseMessage(Request request, Response response)
			throws ServletException, IOException {
		Session session = request.getSessionInternal();
		SAMLDocumentHolder samlDocumentHolder = null;
		SAML2Object samlObject = null;

		Document samlResponse = null;
		boolean isErrorResponse = false;
		String destination = null;
		String destinationQueryStringWithSignature = null;

		String contextPath = getContextPath();

		boolean requestedPostProfile = false;

		// Get the SAML Response Message
		String samlResponseMessage = (String) session
				.getNote(GeneralConstants.SAML_RESPONSE_KEY);
		String relayState = (String) session
				.getNote(GeneralConstants.RELAY_STATE);

		boolean willSendRequest = false;

		String referer = request.getHeader("Referer");

		cleanUpSessionNote(request);

		IDPWebRequestUtil webRequestUtil = new IDPWebRequestUtil(request,
				idpConfiguration, keyManager);

		try {
			samlDocumentHolder = webRequestUtil
					.getSAMLDocumentHolder(samlResponseMessage);
			samlObject = samlDocumentHolder.getSamlObject();

			if (!(samlObject instanceof StatusResponseType)) {
				throw LOGGER.wrongTypeError(samlObject.getClass().getName());
			}

			StatusResponseType statusResponseType = (StatusResponseType) samlObject;
			String issuer = statusResponseType.getIssuer().getValue();

			boolean isValid = samlResponseMessage != null;

			if (!isValid) {
				throw LOGGER.samlIDPValidationCheckFailed();
			}

			IssuerInfoHolder idpIssuer = new IssuerInfoHolder(getIdentityURL());
			ProtocolContext protocolContext = new HTTPContext(request,
					response, getContext().getServletContext());
			// Create the request/response
			SAML2HandlerRequest saml2HandlerRequest = new DefaultSAML2HandlerRequest(
					protocolContext, idpIssuer.getIssuer(), samlDocumentHolder,
					HANDLER_TYPE.IDP);
			Map<String, Object> options = new HashMap<String, Object>();

			if (this.idpConfiguration.isSupportsSignature()
					|| this.idpConfiguration.isEncrypt()) {
				PublicKey publicKey = getIssuerPublicKey(request, issuer);
				options.put(GeneralConstants.SENDER_PUBLIC_KEY, publicKey);
			}

			options.put(GeneralConstants.SAML_IDP_STRICT_POST_BINDING,
					this.idpConfiguration.isStrictPostBinding());
			options.put(GeneralConstants.SUPPORTS_SIGNATURES,
					this.idpConfiguration.isSupportsSignature());
			if (auditHelper != null) {
				options.put(GeneralConstants.AUDIT_HELPER, auditHelper);
				options.put(GeneralConstants.CONTEXT_PATH, contextPath);
			}

			saml2HandlerRequest.setOptions(options);
			saml2HandlerRequest.setRelayState(relayState);

			SAML2HandlerResponse saml2HandlerResponse = new DefaultSAML2HandlerResponse();

			Set<SAML2Handler> handlers = chain.handlers();

			// the trusted domains is done by a handler
			// webRequestUtil.isTrusted(issuer);

			if (handlers != null) {
				try {
					chainLock.lock();
					for (SAML2Handler handler : handlers) {
						handler.reset();
						handler.handleStatusResponseType(saml2HandlerRequest,
								saml2HandlerResponse);
						willSendRequest = saml2HandlerResponse.getSendRequest();
					}
				} finally {
					chainLock.unlock();
				}
			}

			samlResponse = saml2HandlerResponse.getResultingDocument();
			relayState = saml2HandlerResponse.getRelayState();

			destination = saml2HandlerResponse.getDestination();
			requestedPostProfile = saml2HandlerResponse
					.isPostBindingForResponse();
			destinationQueryStringWithSignature = saml2HandlerResponse
					.getDestinationQueryStringWithSignature();
		} catch (Exception e) {
			String status = JBossSAMLURIConstants.STATUS_AUTHNFAILED.get();
			if (e instanceof IssuerNotTrustedException) {
				status = JBossSAMLURIConstants.STATUS_REQUEST_DENIED.get();
			}
			LOGGER.samlIDPRequestProcessingError(e);
			samlResponse = webRequestUtil.getErrorResponse(referer, status,
					getIdentityURL(),
					this.idpConfiguration.isSupportsSignature());
			isErrorResponse = true;
		} finally {
			try {
				WebRequestUtilHolder holder = webRequestUtil.getHolder();
				if (destination == null) {
					throw new ServletException(
							LOGGER.nullValueError("Destination"));
				}
				holder.setResponseDoc(samlResponse)
						.setDestination(destination)
						.setRelayState(relayState)
						.setAreWeSendingRequest(willSendRequest)
						.setPrivateKey(null)
						.setSupportSignature(false)
						.setErrorResponse(isErrorResponse)
						.setServletResponse(response)
						.setPostBindingRequested(requestedPostProfile)
						.setDestinationQueryStringWithSignature(
								destinationQueryStringWithSignature);

				/*
				 * if (/requestedPostProfile)
				 * holder/.setPostBindingRequested(requestedPostProfile/); else
				 * holder/.setPostBindingRequested(postProfile);
				 */

				if (this.idpConfiguration.isSupportsSignature()) {
					holder.setPrivateKey(keyManager.getSigningKey())
							.setSupportSignature(true);
				}

				holder.setStrictPostBinding(this.idpConfiguration
						.isStrictPostBinding());

				if (holder.isPostBinding()) {
					recycle(response);
				}

				if (enableAudit) {
					PicketLinkAuditEvent auditEvent = new PicketLinkAuditEvent(
							AuditLevel.INFO);
					auditEvent.setType(PicketLinkAuditEventType.RESPONSE_TO_SP);
					auditEvent.setWhoIsAuditing(contextPath);
					auditEvent.setDestination(destination);
					auditHelper.audit(auditEvent);
				}
				webRequestUtil.send(holder);
			} catch (ParsingException e) {
				LOGGER.samlAssertionPasingFailed(e);
			} catch (GeneralSecurityException e) {
				LOGGER.trace("Security Exception:", e);
			}
		}
		return;
	}

	protected void cleanUpSessionNote(Request request) {

		Session session = request.getSessionInternal();
		/**
		 * Since the container has finished the authentication, we can retrieve
		 * the original saml message as well as any relay state from the SP
		 */
		String samlRequestMessage = (String) session
				.getNote(GeneralConstants.SAML_REQUEST_KEY);

		String samlResponseMessage = (String) session
				.getNote(GeneralConstants.SAML_RESPONSE_KEY);
		String relayState = (String) session
				.getNote(GeneralConstants.RELAY_STATE);
		String signature = (String) session
				.getNote(GeneralConstants.SAML_SIGNATURE_REQUEST_KEY);
		String sigAlg = (String) session
				.getNote(GeneralConstants.SAML_SIG_ALG_REQUEST_KEY);

		if (LOGGER.isTraceEnabled()) {
			StringBuilder builder = new StringBuilder();
			builder.append("Retrieved saml messages and relay state from session");
			builder.append("saml Request message=").append(samlRequestMessage);
			builder.append("::").append("SAMLResponseMessage=");
			builder.append(samlResponseMessage).append(":")
					.append("relay state=").append(relayState);

			builder.append("Signature=").append(signature).append("::sigAlg=")
					.append(sigAlg);
			LOGGER.trace(builder.toString());
		}

		if (isNotNull(samlRequestMessage)) {
			session.removeNote(GeneralConstants.SAML_REQUEST_KEY);
		}
		if (isNotNull(samlResponseMessage)) {
			session.removeNote(GeneralConstants.SAML_RESPONSE_KEY);
		}

		if (isNotNull(relayState)) {
			session.removeNote(GeneralConstants.RELAY_STATE);
		}

		if (isNotNull(signature)) {
			session.removeNote(GeneralConstants.SAML_SIGNATURE_REQUEST_KEY);
		}
		if (isNotNull(sigAlg)) {
			session.removeNote(GeneralConstants.SAML_SIG_ALG_REQUEST_KEY);
		}
	}

	protected void sendErrorResponseToSP(String referrer, Response response,
			String relayState, IDPWebRequestUtil webRequestUtil)
			throws ServletException, IOException, ConfigurationException {

		LOGGER.trace("About to send error response to SP:" + referrer);

		String contextPath = getContextPath();

		Document samlResponse = webRequestUtil.getErrorResponse(referrer,
				JBossSAMLURIConstants.STATUS_RESPONDER.get(), getIdentityURL(),
				this.idpConfiguration.isSupportsSignature());
		try {

			WebRequestUtilHolder holder = webRequestUtil.getHolder();
			holder.setResponseDoc(samlResponse).setDestination(referrer)
					.setRelayState(relayState).setAreWeSendingRequest(false)
					.setPrivateKey(null).setSupportSignature(false)
					.setServletResponse(response);
			holder.setPostBindingRequested(webRequestUtil
					.hasSAMLRequestInPostProfile());

			if (this.idpConfiguration.isSupportsSignature()) {
				holder.setPrivateKey(keyManager.getSigningKey())
						.setSupportSignature(true);
			}

			holder.setStrictPostBinding(this.idpConfiguration
					.isStrictPostBinding());

			if (holder.isPostBinding()) {
				recycle(response);
			}

			if (enableAudit) {
				PicketLinkAuditEvent auditEvent = new PicketLinkAuditEvent(
						AuditLevel.INFO);
				auditEvent
						.setType(PicketLinkAuditEventType.ERROR_RESPONSE_TO_SP);
				auditEvent.setWhoIsAuditing(contextPath);
				auditEvent.setDestination(referrer);
				auditHelper.audit(auditEvent);
			}
			webRequestUtil.send(holder);
		} catch (ParsingException e1) {
			throw new ServletException(e1);
		} catch (GeneralSecurityException e) {
			throw new ServletException(e);
		}
	}

	/**
	 * <p>
	 * Initializes the {@link IdentityServer}.
	 * </p>
	 */
	protected void initIdentityServer() {
		// The Identity Server on the servlet context gets set
		// in the implementation of IdentityServer
		// Create an Identity Server and set it on the context
		IdentityServer identityServer = (IdentityServer) getContext()
				.getServletContext().getAttribute(
						GeneralConstants.IDENTITY_SERVER);
		if (identityServer == null) {
			identityServer = new IdentityServer();
			getContext().getServletContext().setAttribute(
					GeneralConstants.IDENTITY_SERVER, identityServer);
			if (StringUtil.isNotNull(this.idpConfiguration
					.getIdentityParticipantStack())) {
				try {
					Class<?> clazz = SecurityActions
							.loadClass(getClass(), this.idpConfiguration
									.getIdentityParticipantStack());
					if (clazz == null) {
						throw LOGGER.classNotLoadedError(this.idpConfiguration
								.getIdentityParticipantStack());
					}

					identityServer.setStack((IdentityParticipantStack) clazz
							.newInstance());
				} catch (Exception e) {
					LOGGER.samlIDPUnableToSetParticipantStackUsingDefault(e);
				}
			}
		}
	}

	protected void initHandlersChain() throws LifecycleException {
		try {
			if (picketLinkConfiguration != null) {
				this.handlers = picketLinkConfiguration.getHandlers();
			} else {
				// Get the handlers
				String handlerConfigFileName = GeneralConstants.HANDLER_CONFIG_FILE_LOCATION;
				this.handlers = ConfigurationUtil.getHandlers(getContext()
						.getServletContext().getResourceAsStream(
								handlerConfigFileName));
			}

			// Get the chain from config
			String handlerChainClass = this.handlers.getHandlerChainClass();

			if (StringUtil.isNullOrEmpty(handlerChainClass)) {
				chain = SAML2HandlerChainFactory.createChain();
			} else {
				try {
					chain = SAML2HandlerChainFactory
							.createChain(handlerChainClass);
				} catch (ProcessingException e1) {
					throw new LifecycleException(e1);
				}
			}

			chain.addAll(HandlerUtil.getHandlers(this.handlers));

			Map<String, Object> chainConfigOptions = new HashMap<String, Object>();
			chainConfigOptions.put(GeneralConstants.ROLE_GENERATOR,
					roleGenerator);
			chainConfigOptions.put(GeneralConstants.CONFIGURATION,
					idpConfiguration);
			if (this.keyManager != null) {
				chainConfigOptions.put(GeneralConstants.KEYPAIR,
						keyManager.getSigningKeyPair());
			}

			SAML2HandlerChainConfig handlerChainConfig = new DefaultSAML2HandlerChainConfig(
					chainConfigOptions);

			Set<SAML2Handler> samlHandlers = chain.handlers();

			for (SAML2Handler handler : samlHandlers) {
				handler.initChainConfig(handlerChainConfig);
			}
		} catch (Exception e) {
			LOGGER.samlHandlerConfigurationError(e);
			throw new LifecycleException(e.getLocalizedMessage());
		}
	}

	protected void initKeyManager() throws LifecycleException {
		if (this.idpConfiguration.isSupportsSignature()
				|| this.idpConfiguration.isEncrypt()) {
			KeyProviderType keyProvider = this.idpConfiguration
					.getKeyProvider();
			if (keyProvider == null) {
				throw new LifecycleException(
						LOGGER.nullValueError("Key Provider is null for context="
								+ getContext().getName()));
			}

			try {
				this.keyManager = CoreConfigUtil
						.getTrustKeyManager(keyProvider);

				List<AuthPropertyType> authProperties = CoreConfigUtil
						.getKeyProviderProperties(keyProvider);
				keyManager.setAuthProperties(authProperties);
				keyManager.setValidatingAlias(keyProvider.getValidatingAlias());
			} catch (Exception e) {
				LOGGER.trustKeyManagerCreationError(e);
				throw new LifecycleException(e.getLocalizedMessage());
			}

			LOGGER.samlIDPSettingCanonicalizationMethod(idpConfiguration
					.getCanonicalizationMethod());

			XMLSignatureUtil.setCanonicalizationMethodType(idpConfiguration
					.getCanonicalizationMethod());

			LOGGER.trace("Key Provider=" + keyProvider.getClassName());
		}
	}

	@SuppressWarnings("deprecation")
	protected void initIDPConfiguration() {
		InputStream is = null;

		if (isNullOrEmpty(this.configFile)) {
			is = getContext().getServletContext().getResourceAsStream(
					CONFIG_FILE_LOCATION);
		} else {
			try {
				is = new FileInputStream(this.configFile);
			} catch (FileNotFoundException e) {
				throw LOGGER.samlIDPConfigurationError(e);
			}
		}

		// Work on the IDP Configuration
		if (configProvider != null) {
			try {
				if (is == null) {
					// Try the older version
					is = getContext().getServletContext().getResourceAsStream(
							DEPRECATED_CONFIG_FILE_LOCATION);

					// Additionally parse the deprecated config file
					if (is != null
							&& configProvider instanceof AbstractSAMLConfigurationProvider) {
						((AbstractSAMLConfigurationProvider) configProvider)
								.setConfigFile(is);
					}
				} else {
					// Additionally parse the consolidated config file
					if (is != null
							&& configProvider instanceof AbstractSAMLConfigurationProvider) {
						((AbstractSAMLConfigurationProvider) configProvider)
								.setConsolidatedConfigFile(is);
					}
				}

				picketLinkConfiguration = configProvider
						.getPicketLinkConfiguration();
				idpConfiguration = configProvider.getIDPConfiguration();
			} catch (ProcessingException e) {
				throw LOGGER.samlIDPConfigurationError(e);
			} catch (ParsingException e) {
				throw LOGGER.samlIDPConfigurationError(e);
			}
		}

		if (idpConfiguration == null) {
			if (is != null) {
				try {
					picketLinkConfiguration = ConfigurationUtil
							.getConfiguration(is);
					idpConfiguration = (IDPType) picketLinkConfiguration
							.getIdpOrSP();
				} catch (ParsingException e) {
					LOGGER.trace(e);
					LOGGER.samlIDPConfigurationError(e);
				}
			}

			if (is == null) {
				// Try the older version
				is = getContext().getServletContext().getResourceAsStream(
						DEPRECATED_CONFIG_FILE_LOCATION);
				if (is == null) {
					throw LOGGER
							.configurationFileMissing(DEPRECATED_CONFIG_FILE_LOCATION);
				}
				try {
					idpConfiguration = ConfigurationUtil
							.getIDPConfiguration(is);
				} catch (ParsingException e) {
					LOGGER.samlIDPConfigurationError(e);
				}
			}
		}

		try {
			if (this.picketLinkConfiguration != null) {
				enableAudit = picketLinkConfiguration.isEnableAudit();

				// See if we have the system property enabled
				if (!enableAudit) {
					String sysProp = SecurityActions.getSystemProperty(
							GeneralConstants.AUDIT_ENABLE, "NULL");
					if (!"NULL".equals(sysProp)) {
						enableAudit = Boolean.parseBoolean(sysProp);
					}
				}

				if (enableAudit) {
					if (auditHelper == null) {
						String securityDomainName = PicketLinkAuditHelper
								.getSecurityDomainName(getContext()
										.getServletContext());
						auditHelper = new PicketLinkAuditHelper(
								securityDomainName);
					}
				}
			}

			LOGGER.trace("Identity Provider URL=" + getIdentityURL());

			// Get the attribute manager
			String attributeManager = idpConfiguration.getAttributeManager();
			if (attributeManager != null && !"".equals(attributeManager)) {
				Class<?> clazz = SecurityActions.loadClass(getClass(),
						attributeManager);
				if (clazz == null) {
					throw new RuntimeException(
							LOGGER.classNotLoadedError(attributeManager));
				}
				AttributeManager delegate = (AttributeManager) clazz
						.newInstance();
				this.attribManager.setDelegate(delegate);
			}

			// Get the role generator
			String roleGeneratorAttribute = idpConfiguration.getRoleGenerator();

			if (roleGeneratorAttribute != null
					&& !"".equals(roleGeneratorAttribute)) {
				Class<?> clazz = SecurityActions.loadClass(getClass(),
						roleGeneratorAttribute);
				if (clazz == null) {
					throw new RuntimeException(
							LOGGER.classNotLoadedError(roleGeneratorAttribute));
				}
				roleGenerator = (RoleGenerator) clazz.newInstance();
			}

			// Read SP Metadata if provided
			List<EntityDescriptorType> entityDescriptors = CoreConfigUtil
					.getMetadataConfiguration(idpConfiguration, getContext()
							.getServletContext());
			if (entityDescriptors != null) {
				for (EntityDescriptorType entityDescriptorType : entityDescriptors) {
					SPSSODescriptorType spSSODescriptor = CoreConfigUtil
							.getSPDescriptor(entityDescriptorType);
					if (spSSODescriptor != null) {
						spSSOMetadataMap.put(
								entityDescriptorType.getEntityID(),
								spSSODescriptor);
					}
				}
			}
		} catch (Exception e) {
			throw LOGGER.samlIDPConfigurationError(e);
		}

		initHostedURI();
	}

	/**
	 * Initializes the STS configuration.
	 */
	protected void initSTSConfiguration() {
		// if the sts configuration is present in the picketlink.xml then load
		// it.
		if (this.picketLinkConfiguration != null
				&& this.picketLinkConfiguration.getStsType() != null) {
			PicketLinkCoreSTS sts = PicketLinkCoreSTS.instance();
			sts.initialize(new PicketLinkSTSConfiguration(
					this.picketLinkConfiguration.getStsType()));
		} else {
			// Try to load from /WEB-INF/picketlink-sts.xml.

			// Ensure that the Core STS has the SAML20 Token Provider
			PicketLinkCoreSTS sts = PicketLinkCoreSTS.instance();
			// Let us look for a file
			String configPath = getContext().getServletContext().getRealPath(
					"/WEB-INF/picketlink-sts.xml");
			File stsTokenConfigFile = configPath != null ? new File(configPath)
					: null;

			if (stsTokenConfigFile == null
					|| stsTokenConfigFile.exists() == false) {
				LOGGER.samlIDPInstallingDefaultSTSConfig();
				sts.installDefaultConfiguration();
			} else {
				sts.installDefaultConfiguration(stsTokenConfigFile.toURI()
						.toString());
			}
		}
	}

	protected String getIdentityURL() {
		return this.idpConfiguration.getIdentityURL();
	}

	protected Context getContext() {
		return (Context) getContainer();
	}

	protected abstract String getContextPath();

	protected void recycle(Response response) {
		/**
		 * Since the container finished authentication, it will try to locate
		 * index.jsp or index.html. We need to recycle whatever is in the
		 * response object such that we direct it to the html that is being
		 * created as part of the HTTP/POST binding
		 */
		response.recycle();
	}

	protected String determineLoginType(boolean isSecure) {

		String result = JBossSAMLURIConstants.AC_PASSWORD.get();
		LoginConfig loginConfig = getContext().getLoginConfig();
		if (loginConfig != null) {

			String auth = loginConfig.getAuthMethod();

			if (StringUtil.isNotNull(auth)) {
				if ("CLIENT-CERT".equals(auth)) {
					result = JBossSAMLURIConstants.AC_TLS_CLIENT.get();
				} else if (isSecure) {
					result = JBossSAMLURIConstants.AC_PASSWORD_PROTECTED_TRANSPORT
							.get();
				}
			}
		}
		return result;
	}

	protected void startPicketLink() throws LifecycleException {
		SystemPropertiesUtil.ensure();

		// Introduce a timer to reload configuration if desired
		if (timerInterval > 0) {
			if (timer == null) {
				timer = new Timer();
			}
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					initIDPConfiguration();
					try {
						initKeyManager();
					} catch (LifecycleException e) {
						LOGGER.trace(e.getMessage());
					}
				}
			}, timerInterval, timerInterval);
		}

		initIDPConfiguration();
		initSTSConfiguration();
		initKeyManager();
		initHandlersChain();
		initIdentityServer();

		// Add some keys to the attibutes
		String[] ak = new String[] { "mail", "cn", "commonname", "givenname",
				"surname", "employeeType", "employeeNumber",
				"facsimileTelephoneNumber" };

		this.attributeKeys.addAll(Arrays.asList(ak));

		if (this.picketLinkConfiguration == null) {
			this.picketLinkConfiguration = new PicketLinkType();

			this.picketLinkConfiguration.setIdpOrSP(this.idpConfiguration);
			this.picketLinkConfiguration.setHandlers(this.handlers);
		}
	}

	/**
	 * Given a set of roles, create an attribute statement
	 * 
	 * @param roles
	 * @return
	 */
	private SAML11AttributeStatementType createAttributeStatement(
			List<String> roles) {
		SAML11AttributeStatementType attrStatement = null;
		for (String role : roles) {
			if (attrStatement == null) {
				attrStatement = new SAML11AttributeStatementType();
			}
			SAML11AttributeType attr = new SAML11AttributeType("Role",
					URI.create("urn:picketlink:role"));
			attr.add(role);
			attrStatement.add(attr);
		}
		return attrStatement;
	}

	public void setAuditHelper(PicketLinkAuditHelper auditHelper) {
		this.auditHelper = auditHelper;
	}

	/**
	 * We will ignore signatures of current SAMLRequest if SP Metadata are
	 * provided for current SP and if metadata specifies that SAMLRequest is not
	 * signed for this SP.
	 * 
	 * @param spIssuer
	 * @return true if signature is not expected in SAMLRequest and so signature
	 *         validation should be ignored
	 */
	private Boolean willIgnoreSignatureOfCurrentRequest(String spIssuer) {
		SPSSODescriptorType currentSPMetadata = spSSOMetadataMap.get(spIssuer);

		if (currentSPMetadata == null) {
			return false;
		}

		Boolean isRequestSigned = currentSPMetadata.isAuthnRequestsSigned();

		LOGGER.trace("Issuer: " + spIssuer + ", isRequestSigned: "
				+ isRequestSigned);

		return !isRequestSigned;
	}

	private void initHostedURI() {
		String hostedURI = this.idpConfiguration.getHostedURI();

		if (isNullOrEmpty(hostedURI)) {
			hostedURI = "/hosted/";
		} else if (!hostedURI.contains(".") && !hostedURI.endsWith("/")) {
			// make sure the hosted uri have a slash at the end if it points to
			// a directory
			hostedURI = hostedURI + "/";
		}

		this.idpConfiguration.setHostedURI(hostedURI);
	}

	private SSLAuthenticator getSSLAuthenticator() {
		if (this.sslAuthenticator == null) {
			this.sslAuthenticator = new SSLAuthenticator() {
				@Override
				public Valve getNext() {
					return new ValveBase() {
						@Override
						public void invoke(Request request, Response response)
								throws IOException, ServletException {
							// no-op
						}
					};
				}
			};

			this.sslAuthenticator.setContainer(getContainer());

			try {
				this.sslAuthenticator.start();
			} catch (LifecycleException e) {
				throw new RuntimeException("Error starting SSL authenticator.",
						e);
			}
		}

		return this.sslAuthenticator;
	}

	public SAMLDocumentHolder getSAMLDocumentHolder(String samlMessage,
			boolean redirectProfile) throws Exception {
		LOGGERSLF4J.debug("getSAMLDocumentHolder:01:" + redirectProfile);

		InputStream is = null;
		SAML2Request saml2Request = new SAML2Request();
		try {
			if (redirectProfile) {
				is = RedirectBindingUtil.base64DeflateDecode(samlMessage);
			} else {
				byte[] samlBytes = PostBindingUtil.base64Decode(samlMessage);
				is = new ByteArrayInputStream(samlBytes);
			}
		} catch (Exception rte) {
			LOGGERSLF4J.error("getSAMLDocumentHolder:error:" + rte);
			throw rte;
		}

		saml2Request.getSAML2ObjectFromStream(is);

		return saml2Request.getSamlDocumentHolder();
	}

}
