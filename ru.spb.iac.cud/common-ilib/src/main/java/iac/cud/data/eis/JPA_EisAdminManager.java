package iac.cud.data.eis;

import java.math.BigDecimal;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javaw.util.PassBy;
import javaw.util.Tuple;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import ru.spb.iac.cud.core.data.XAttribute;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.OrganisationAttribute;
import ru.spb.iac.cud.items.OrganisationAttributes;

import java.util.UUID;

public class JPA_EisAdminManager {
	public static OrganisationAttributes MakeOrgAttrsFromOrgCode(String organizationCode, List<Attribute> organizationAttributes) throws GeneralFailure {
		OrganisationAttributes oa = new OrganisationAttributes(organizationAttributes);
		OrganisationAttribute oaOrgCode = OrganisationAttribute.oaOrgCode(organizationCode);
		oaOrgCode.useCondition = true;
		oa.add(oaOrgCode);
		return oa;
	}	
	public static Long getNxtISP_EXT_BSS_SEQ(EntityManager em) {
		return ((BigDecimal)em.createNativeQuery("select ISP_EXT_BSS_SEQ.NEXTVAL from dual").getResultList().get(0)).longValue();
	}
	public static boolean isAllowedAttribute(String attrName) {
		return allowedFields_ISP_EXT_BSS_T.findByName(attrName, true, false).size()>0;
	}	
	private static abstract class IActorFixAttributes /* extends javaw.util.Actor<T> */ {
		abstract public Collection<? extends OrganisationAttribute> fixAttribute(OrganisationAttribute source, UUID[] targetAttrNames);
	}
	private static Map<String, Tuple.T2<IActorFixAttributes, UUID[]>> magicConvert = null;
	public static OrganisationAttributes checkAllowedAttributes(Iterable<OrganisationAttribute> orgAttrs) throws GeneralFailure  {
		if( magicConvert == null) {
			magicConvert = new HashMap<String, Tuple.T2<IActorFixAttributes, UUID[]>>();
			String n = OrganisationAttribute.oaFullName(null).getName();
			magicConvert.put(n, new Tuple.T2<JPA_EisAdminManager.IActorFixAttributes, UUID[]>(
				// 	oaFullName
				new IActorFixAttributes() {
					@Override public Collection<? extends OrganisationAttribute> fixAttribute(
							OrganisationAttribute srcAttr,
							UUID[] targetAttrNames) {
						List<OrganisationAttribute> la = new ArrayList<OrganisationAttribute>();
						OrganisationAttribute fixOA;
						String v = srcAttr.getValue();
						if(srcAttr.useCondition) {  // conditional (both on ... 
							la.add(srcAttr);		// ... table ISP_EXT_BSS_T ...
							fixOA = new OrganisationAttribute(targetAttrNames[0], v); // ... and ISP_BSS_T)
							fixOA.useCondition = true;
							fixOA.ignoreOutput = true;
							la.add(fixOA);
						} else if(v!=null) { //  writable
							la.add(srcAttr);							
						} else { // read-only: defaulted
							fixOA = new OrganisationAttribute(targetAttrNames[1], null);
							la.add(fixOA);
						}
						return la;
					}
				}, new UUID[]{ idFullName_ISP_BSS_T, idFullName_ReadDefault }
				)); // oaFullName_ISP_BSS_T(null).getName(),  oaFullName_ReadDefault(null).getName()
			n = OrganisationAttribute.oaOrgCode(null).getName();
			/*JPA_EisAdminManager
			magicConvert.put(n, new T2<JPA_EisAdminManager.IActorFixAttributes, UUID[]>(
				new IActorFixAttributes() {
					// oaOrgCode
					@Override
					public Collection<? extends OrganisationAttribute> fixAttribute(
							OrganisationAttribute srcAttr, UUID[] targetAttrNames) {
						List<OrganisationAttribute> la = new ArrayList<OrganisationAttribute>();
						OrganisationAttribute fixOA = new OrganisationAttribute(targetAttrNames[0], srcAttr.getValue());
						fixOA.useCondition = srcAttr.useCondition;
						la.add(fixOA);
						return la;
					}
				}, new UUID[]{ idOrgCode_ }));
			*/
		}
		OrganisationAttributes oaChk = new OrganisationAttributes();
		for (OrganisationAttribute oa : orgAttrs) {
			String n = oa.getName();
			if(!isAllowedAttribute(n))
				throw new GeneralFailure("Illegal attribute: "+oa.getName());
			// convert to magic attributes, if needed
			Tuple.T2<IActorFixAttributes, UUID[]> convData = magicConvert.get(n);
			if (convData!=null) {
				oaChk.addAll(convData.item1.fixAttribute(oa, convData.item2));
			} else {
				oaChk.add(oa);
			}
		}
		return oaChk;
	}
	public static OrganisationAttribute oaSTATUS(Long value, boolean useCondition) {
		OrganisationAttribute oaSTATUS = oaSTATUS(value);
		oaSTATUS.useCondition = useCondition;
		oaSTATUS.ignoreOutput = true;
		return oaSTATUS;
	}

	public static List<Attribute> fetchOrgAttrs(EntityManager em, OrganisationAttributes orgAttrs) {
		try {
			orgAttrs.fetch(em);
		} catch (NoResultException e) {
			//e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		}	
		return orgAttrs.toAttributeCopyList();
	}
	
	// (keyBmp, ActiveRecordId, ActiveRecord)
	public static Tuple.T4<Long, OrganisationAttribute, OrganisationAttributes, List<String>> getIspExtActiveHistoryRecord(OrganisationAttributes orgAttrs, EntityManager em) throws GeneralFailure {
	List<String> lstActiveRecordId = new ArrayList<String>();
		OrganisationAttributes activeRecord = new OrganisationAttributes(); 
		orgAttrs.getConditions(activeRecord, true);
		Long keyBmp = orgAttrs.getKeyBitmap(true).get("ISP_EXT_BSS_T");
		
		if(keyBmp == 0L) throw new GeneralFailure("No key bit set!");
		activeRecord.add(oaSTATUS(keyBmp, true));
		OrganisationAttribute oaId = oaUid_ISP_EXT_BSS_T(null);		
		oaId.orderBy = "ASC";
		activeRecord.add(oaId);
		activeRecord.mergeCopy(allowedFields_ISP_EXT_BSS_T);
		
		try {			
			activeRecord.fetch(em);
			lstActiveRecordId.add(oaId.getValue());
		} catch(NonUniqueResultException xNonUniqueResult) {
			//System.out.println("getIspExtActiveHistoryRecord: NonUniqueResultException!");
			try {
				for (Entry<String, Tuple.T2<String, List<XAttribute>>> e: activeRecord.getSelectQueryData().entrySet())
				if("ISP_EXT_BSS_T".equals(e.getKey()))
				{	Tuple.T2<String, List<XAttribute>> sqlData = e.getValue();
					String sqlString = sqlData.item1;
					String n = oaId.getName();		
					for(Object o: em.createNativeQuery(sqlString).getResultList()) {
						Object[] rec = (Object[])o;
						int i = 0;
						for (Iterator iterator = sqlData.item2.iterator(); iterator.hasNext(); i++) {
							XAttribute xa = (XAttribute) iterator.next();
							if(rec[i]!=null) {								
								String an = xa.getName(); 
								String av = rec[i].toString();
								xa.setValue(av);
								if(an.equals(n)) {
									lstActiveRecordId.add(av);
								}								
							};
						}
					}
				}
			} catch (InvalidAlgorithmParameterException e) { }
		}
		catch(NoResultException xNR ) {
			//System.out.println("No records to get oaId!");
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		}
		return new Tuple.T4<Long, OrganisationAttribute, OrganisationAttributes, List<String>>(keyBmp, oaId, activeRecord, lstActiveRecordId);
	}
	
	private static void appendTableCommand(PassBy.reference<Map<String, List<String>>> refTblCmdList, String tableName, String tblCmd) {
		Map<String, List<String>> tblCmdList = refTblCmdList.getValue();
		if (tblCmdList == null) {
			tblCmdList = new HashMap<String, List<String>>();
			refTblCmdList.setValue(tblCmdList);
		}
		List<String> lst = tblCmdList.get(tableName);
		if(lst == null) {
			lst = new ArrayList<String>();
			tblCmdList.put(tableName, lst);
		}
		lst.add(tblCmd);
	}	
	private static void appendTableCommands(PassBy.reference<Map<String, List<String>>> refTblCmdList, Map<String, String> tblCmds) {
		for (Entry<String, String> e : tblCmds.entrySet())
			appendTableCommand(refTblCmdList, e.getKey(), e.getValue());
	}
	
	// table => List<sqlString>
	public static Map<String, List<String>>  getStoreQueries(OrganisationAttributes orgAttrs,  Long CreatorId, EntityManager em) 
	throws GeneralFailure, InvalidAlgorithmParameterException {
		PassBy.reference<Map<String, List<String>>> mpResult = PassBy.reference(null);
		Tuple.T4<Long, OrganisationAttribute, OrganisationAttributes, List<String>> actRecInfo = getIspExtActiveHistoryRecord(orgAttrs, em);
	 	OrganisationAttribute oaId = actRecInfo.item2;
	 	boolean foundActiveRecords = oaId.getValue() != null;
		OrganisationAttributes ea = orgAttrs.clone();
	 	ea.add(oaCREATOR(CreatorId.toString()));	 	
		oaId.setValue(getNxtISP_EXT_BSS_SEQ(em).toString());
		ea.add(oaId).useCondition = false;
		if(foundActiveRecords) {
			// clear active record(s) flag
			for(String idClear: actRecInfo.item4) {
				OrganisationAttributes oaClear = getClearActiveRecordQuery(idClear);
				appendTableCommands(mpResult, oaClear.getUpdateQueries());
			}
			// make new active record			
			ea.merge(actRecInfo.item3); //mergeCopy
		}		
		// убрать статус условия, т.к. надо добавить в новую запись
		ea.findByName(OrganisationAttribute.oaOrgCode(null).getName(), true, true).get(0).useCondition = false;		
		appendTableCommands(mpResult, ea.getInsertQueries());
		return mpResult.getValue();
	}
	private static OrganisationAttributes getClearActiveRecordQuery(String id) {
		OrganisationAttributes oaClear = new OrganisationAttributes();
		oaClear.add(oaSTATUS(0L));
		oaClear.add(oaUid_ISP_EXT_BSS_T(id)).useCondition = true;
		return oaClear;
	}
	
	public static final UUID idFullName_ReadDefault 	= UUID.fromString("DDF57E77-3FFC-409F-9DE3-A6B04AD2D474");
	public static final UUID idUid_ISP_BSS_T 			= UUID.fromString("11AAE5F3-CCEC-4A8E-9A46-A2D1C6DC3613");
	public static final UUID idOrgCode_ISP_BSS_T 		= UUID.fromString("6FE278FF-50B5-4691-89F5-26828697C202");
	public static final UUID idOrgCode_ 				= UUID.fromString("2685AEA5-6C25-4FA9-928A-7BFEDEA3BD5A");	// множественный атрибут
	public static final UUID idFIO 						= UUID.fromString("A5CF792B-600D-4EFD-A033-A8D991089276");
	public static final UUID idPostalCode 				= UUID.fromString("14649E93-79B0-4D94-8642-D860D89BC2EE");
	public static final UUID idCountry 					= UUID.fromString("21F7325B-8087-4B07-937C-46F109E3F665");
	public static final UUID idRegion 					= UUID.fromString("835A266C-2987-4142-A52A-457DA3D81A6D");
	public static final UUID idFullName_ISP_BSS_T 		= UUID.fromString("B7428072-E18D-4CBB-B2B2-A60C43858527");
	public static final UUID idUid_ISP_EXT_BSS_T		= UUID.fromString("032AFE5C-9B0A-4C41-8BA9-083207EF0EB8");
	public static final UUID idCREATOR 					= UUID.fromString("496619F4-9A22-431C-8576-B40A0F24E980");
	public static final UUID idCREATED 					= UUID.fromString("94FD3136-03E7-4C6B-A2D0-46563961351E");
	public static final UUID idSTATUS 					= UUID.fromString("7DB36DE8-A283-4124-8EF2-1CA0BD3E3919");
	
	private static final Map<UUID, String> mapAttributeIdSpec = getMapAttributeIdSpec();
	private static Map<UUID, String> getMapAttributeIdSpec() {
		Map<UUID, String> mp = new HashMap<UUID, String>();
		//mp.put(UUID.fromString(""), );
		// OrganisationAttribute
		mp.put(OrganisationAttribute.idFullName, 	"ISP_EXT_BSS_T.FULLNAME");
		mp.put(OrganisationAttribute.idOrgCode, 	"<1>ISP_EXT_BSS_T.SIGN_OBJECT");
		mp.put(OrganisationAttribute.idAddress, 	"ISP_EXT_BSS_T.ADDRESS");
		mp.put(OrganisationAttribute.idPhone, 		"ISP_EXT_BSS_T.PHONE");
		mp.put(OrganisationAttribute.idEmail, 		"ISP_EXT_BSS_T.EMAIL");
		mp.put(OrganisationAttribute.idSite, 		"ISP_EXT_BSS_T.SITE");
		mp.put(OrganisationAttribute.idOKPO, 		"ISP_EXT_BSS_T.OKPO");
		mp.put(OrganisationAttribute.idOKOGU, 		"ISP_EXT_BSS_T.OKOGU");
		mp.put(OrganisationAttribute.idOGRN, 		"ISP_EXT_BSS_T.OGRN");
		mp.put(OrganisationAttribute.idINN, 		"ISP_EXT_BSS_T.INN");
		mp.put(OrganisationAttribute.idKPP, 		"ISP_EXT_BSS_T.KPP");
		// дополнительные (служебные) коды
		mp.put(idFullName_ReadDefault, 	"?ISP_EXT_BSS_T.FULLNAME:ISP_BSS_T.FULL_");
		mp.put(idUid_ISP_BSS_T, 		"ISP_BSS_T.ID_SRV");
		mp.put(idOrgCode_ISP_BSS_T, 	"<1>ISP_BSS_T.SIGN_OBJECT");
		mp.put(idOrgCode_, 				"*<1>ISP_BSS_T.SIGN_OBJECT:<1>ISP_EXT_BSS_T.SIGN_OBJECT");
		mp.put(idFIO, 					"ISP_BSS_T.FIO");
		mp.put(idPostalCode, 			"ISP_BSS_T.POSTAL_CODE");
		mp.put(idCountry, 				"ISP_BSS_T.COUNTRY");
		mp.put(idRegion, 				"ISP_BSS_T.REGION");
		mp.put(idFullName_ISP_BSS_T, 	"ISP_BSS_T.FULL_");
		mp.put(idUid_ISP_EXT_BSS_T, 	"ISP_EXT_BSS_T.ID_SRV");
		mp.put(idCREATOR, 				"ISP_EXT_BSS_T.CREATOR");
		mp.put(idCREATED, 				"ISP_EXT_BSS_T.CREATED");
		mp.put(idSTATUS, 				"ISP_EXT_BSS_T.STATUS");		
		return mp;
	}
	
	// row spec
	// dump all fields for a record in ISP_EXT_BSS_T
	public static final OrganisationAttributes fullRow_ISP_EXT_BSS_T, allowedFields_ISP_EXT_BSS_T;
	static {
		fullRow_ISP_EXT_BSS_T = new OrganisationAttributes();
			fullRow_ISP_EXT_BSS_T.add(oaUid_ISP_EXT_BSS_T(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOrgCode(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaFullName(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaAddress(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaPhone(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaEmail(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaSite(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOKPO(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOKOGU(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOGRN(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaINN(null));
			fullRow_ISP_EXT_BSS_T.add(OrganisationAttribute.oaKPP(null));
			fullRow_ISP_EXT_BSS_T.add(oaCREATOR(null));
			fullRow_ISP_EXT_BSS_T.add(oaCREATED(null));
			fullRow_ISP_EXT_BSS_T.add(oaSTATUS(null));
			
		allowedFields_ISP_EXT_BSS_T = new OrganisationAttributes();
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOrgCode(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaFullName(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaAddress(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaPhone(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaEmail(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaSite(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOKPO(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOKOGU(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaOGRN(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaINN(null));
			allowedFields_ISP_EXT_BSS_T.add(OrganisationAttribute.oaKPP(null));
	}

	public static String resolveGUIDOrgAtr(UUID idAtr) {		
		return mapAttributeIdSpec.get(idAtr);
	}
	public static String resolveGUIDOrgAtr(String name) {
		final String n = resolveGUIDOrgAtr(UUID.fromString(name));		
		return n!=null?n: name;
	}


	// служебные атрибуты (скрыты); открыте атрибуты в OrganisationAttribute
	//  FullName  Id  OrgCode  OrgCode	  FIO	  PostalCode  Country  Region	  FullName_	  Id  CREATOR  CREATED  STATUS
	public static OrganisationAttribute oaFullName_ReadDefault(String value) 	{	return new OrganisationAttribute(idFullName_ReadDefault, value);	}	// FullName_ReadDefault
	public static OrganisationAttribute oaUid_ISP_BSS_T(String value) 			{	return new OrganisationAttribute(idUid_ISP_BSS_T, value);	}	// Uid_ISP_BSS_T
	public static OrganisationAttribute oaOrgCode_ISP_BSS_T(String value) 		{	return new OrganisationAttribute(idOrgCode_ISP_BSS_T, value);	}	// OrgCode_ISP_BSS_T
	public static OrganisationAttribute oaOrgCode_(String value) 				{	return new OrganisationAttribute(idOrgCode_, value);	}	// OrgCode_
	public static OrganisationAttribute oaFIO(String value) 					{	return new OrganisationAttribute(idFIO, value);	}	// FIO
	public static OrganisationAttribute oaPostalCode(String value) 	{	return new OrganisationAttribute(idPostalCode, value);	}	// PostalCode
	public static OrganisationAttribute oaCountry(String value) 	{	return new OrganisationAttribute(idCountry, value);	}	// Country
	public static OrganisationAttribute oaRegion(String value) 		{	return new OrganisationAttribute(idRegion, value);	}	// Region
	public static OrganisationAttribute oaFullName_ISP_BSS_T(String value) 	{	return new OrganisationAttribute(idFullName_ISP_BSS_T, value);	}
	public static OrganisationAttribute oaUid_ISP_EXT_BSS_T(String value) 	{	return new OrganisationAttribute(idUid_ISP_EXT_BSS_T, value);	}	// Uid_ISP_EXT_BSS_T
	public static OrganisationAttribute oaCREATOR(String value) 	{	return new OrganisationAttribute(idCREATOR, value);	}	// CREATOR
	public static OrganisationAttribute oaCREATED(String value) 	{	return new OrganisationAttribute(idCREATED, value);	}	// CREATED
	public static OrganisationAttribute oaSTATUS(Long value) 		{	return new OrganisationAttribute(idSTATUS, value==null?null: value.toString());	}	// STATUS
}
	
