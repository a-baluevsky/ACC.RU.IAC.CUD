package iac.cud.infosweb.ws.classifierzip.clientsample;

import iac.cud.infosweb.dataitems.BaseParamItem;
import iac.cud.infosweb.local.service.IHLocal;
import iac.cud.infosweb.local.service.ServiceReestrAction;

import java.io.OutputStream;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import javax.ejb.TransactionManagementType;

import org.slf4j.LoggerFactory;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
 public class IHClassifLoad implements IHLocal {

	@PersistenceContext(unitName = "InfoSCUD-web")
	EntityManager em;

	@Resource
	UserTransaction utx;

	final static org.slf4j.Logger LOGGER = LoggerFactory
			.getLogger(IHClassifLoad.class);

	private static final ScheduledExecutorService scheduler = Executors
			.newScheduledThreadPool(1);

	public BaseParamItem run(BaseParamItem paramMap) throws Exception {

		BaseParamItem jpi = new BaseParamItem();

		String gactiontype = (String) paramMap.get("gactiontype");

		LOGGER.debug("IHClassifLoad:run:gactiontype:" + gactiontype);

		if (gactiontype.equals(ServiceReestrAction.TASK_RUN.name())) {
			jpi = task_run(paramMap);
		} else if (gactiontype.equals(ServiceReestrAction.TO_WORK.name())) {
			jpi = to_work(paramMap);
		}
		return jpi;
	}

	public BaseParamItem task_run(BaseParamItem paramMap) throws Exception {

		BaseParamItem jpi = new BaseParamItem();

		LOGGER.debug("IHClassifLoad:process_start:01");

		final Long seancact = (Long) paramMap.get("seancact");
		final Integer clVersion = (Integer) paramMap.get("clVersion");

		scheduler.schedule(new Runnable() {

			public void run() {

				try {

					LOGGER.debug("IHClassifLoad:process_start:run");

					Calendar cln = Calendar.getInstance();

					int day = cln.get(Calendar.DAY_OF_MONTH);

					LOGGER.debug("IHClassifLoad:process_start:run:day:" + day);

					process_start_content(seancact, clVersion);

				} catch (Exception e) {
					LOGGER.error("IHClassifLoad:process_start:run:error:", e);
				} finally {

				}
			}
		}, 0, TimeUnit.MILLISECONDS);

		return jpi;
	}

	private synchronized void process_start_content(Long seancact,
			Integer clVersion) throws Exception {
		boolean hit = true;
		LOGGER.debug("IHClassifLoad:process_start_content:01");
		try {
			if (ClassifLoadProcessor.getControls().containsKey("classif_load")) {
				LOGGER.debug("IHClassifLoad:process_start_content:return");
				return;
			}
			ClassifLoadProcessor.getControls().put("classif_load", "");
			utx.begin();
			ClientSample.run2(em, utx, seancact, clVersion);
			utx.commit();
		} catch (Exception e) {
			LOGGER.error("IHClassifLoad:process_start_content:error", e);
			utx.rollback();
			hit = false;
			throw e;
		} finally {
			try {
				ClassifLoadProcessor.getControls().remove("classif_load");
				LOGGER.debug("IHClassifLoad:process_start_content:finally:hit:"+hit);
			} catch (Exception e) {
				LOGGER.error("IHClassifLoad:process_start_content:error:2:", e);
			}
		}
	}

	public BaseParamItem to_work(BaseParamItem paramMap) throws Exception {

		BaseParamItem jpi = new BaseParamItem();

		LOGGER.debug("IHClassifLoad:to_work:01");

		//пока не задействовали
		//final/ Long /creator =/(Long) paramMap/.get("creator"/)
		

		try {

			utx.begin();

			// чистим архив
			// clear ISP_ARH_BSS_T
			em.createNativeQuery("TRUNCATE TABLE ISP_ARH_BSS_T")
					.executeUpdate();

			// копируем текущее в архив на случай отката
			// ISP_BSS_T -> ISP_ARH_BSS_T
			em.createNativeQuery(
					(new StringBuilder("insert /*+ APPEND */ into ISP_ARH_BSS_T( ID_SRV, ")
							) .append("SIGN_OBJECT, " ) .append("SIGN_OKOGY, " ) .append("FULL_, "
							) .append("POSITION, " ) .append("FIO, " ) .append("POSTAL_CODE, "
							) .append("COUNTRY, " ) .append("REGION, " ) .append("PLACE, " ) .append("PREFIX, "
							) .append("HOUSE, " ) .append("HOUSING, " ) .append("FLAT, " ) .append("PHONE, "
							) .append("FAX, " ) .append("EMAIL, " ) .append("STATUS, "
							) .append("DATE_IN_SRV, " ) .append("DATE_DEL_SRV, "
							) .append("DOC_IN_SRV, " ) .append("DOC_DEL_SRV, " ) .append("UNI_ID, "
							) .append("IS_EXTERNAL, " ) .append("SIGN_OKATO, "
							) .append("UP_ISP_LOAD, " ) .append("CREATED " ) .append(") select "
							) .append("ID_SRV, " ) .append("SIGN_OBJECT, " ) .append("SIGN_OKOGY, "
							) .append("FULL_, " ) .append("POSITION, " ) .append("FIO, "
							) .append("POSTAL_CODE, " ) .append("COUNTRY, " ) .append("REGION, "
							) .append("PLACE, " ) .append("PREFIX, " ) .append("HOUSE, " ) .append("HOUSING, "
							) .append("FLAT, " ) .append("PHONE, " ) .append("FAX, " ) .append("EMAIL, "
							) .append("STATUS, " ) .append("DATE_IN_SRV, " ) .append("DATE_DEL_SRV, "
							) .append("DOC_IN_SRV, " ) .append("DOC_DEL_SRV, " ) .append("UNI_ID, "
							) .append("IS_EXTERNAL, " ) .append("SIGN_OKATO, "
							) .append("UP_ISP_LOAD, " ) .append("sysdate ") 
							// " from ISP_TEST_BSS_T  ")
							.append(" from ISP_BSS_T  ").toString()
							).executeUpdate();

			// чистим текущее
			// clear ISP_BSS_T
			em.createNativeQuery(
			// "TRUNCATE TABLE ISP_TEST_BSS_T")
					"TRUNCATE TABLE ISP_BSS_T").executeUpdate();

			// копируем из технологич. т. в текущее
			// ISP_TEMP_BSS_T -> ISP_BSS_T
			em.createNativeQuery(
			// "insert /*+ APPEND */ into ISP_TEST_BSS_T( "
					(new StringBuilder("insert /*+ APPEND */ into ISP_BSS_T( "))
					  		.append("ID_SRV, ")				
							  .append("SIGN_OBJECT, ")   .append("SIGN_OKOGY, ")   .append("FULL_, ")
							  .append("POSITION, ")   .append("FIO, ")   .append("POSTAL_CODE, ")
							  .append("COUNTRY, ")   .append("REGION, ")   .append("PLACE, ")   .append("PREFIX, ")
							  .append("HOUSE, ")   .append("HOUSING, ")   .append("FLAT, ")   .append("PHONE, ")
							  .append("FAX, ")   .append("EMAIL, ")   .append("STATUS, ")
							  .append("DATE_IN_SRV, ")   .append("DATE_DEL_SRV, ")
							  .append("DOC_IN_SRV, ")   .append("DOC_DEL_SRV, ")   .append("UNI_ID, ")
							  .append("IS_EXTERNAL, ")   .append("SIGN_OKATO, ")
							  .append("UP_ISP_LOAD, ")   .append("CREATED ")   .append(") select ")
							  .append("ID_SRV, ")   .append("SIGN_OBJECT, ")   .append("SIGN_OKOGY, ")
							  .append("FULL_, ")   .append("POSITION, ")   .append("FIO, ")
							  .append("POSTAL_CODE, ")   .append("COUNTRY, ")   .append("REGION, ")
							  .append("PLACE, ")   .append("PREFIX, ")   .append("HOUSE, ")   .append("HOUSING, ")
							  .append("FLAT, ")   .append("PHONE, ")   .append("FAX, ")   .append("EMAIL, ")
							  .append("STATUS, ")   .append("DATE_IN_SRV, ")   .append("DATE_DEL_SRV, ")
							  .append("DOC_IN_SRV, ")   .append("DOC_DEL_SRV, ")   .append("UNI_ID, ")
							  .append("IS_EXTERNAL, ")   .append("SIGN_OKATO, ")
							  .append("UP_ISP_LOAD, ")   .append("sysdate ")
							  .append(" from ISP_TEMP_BSS_T  ")
							  	.toString()
							  ).executeUpdate();

			em.createNativeQuery("TRUNCATE TABLE ISP_TEMP_BSS_T")
					.executeUpdate();

			utx.commit();

		} catch (Exception e) {
			LOGGER.error("IHClassifLoad:to_work:error", e);

			utx.rollback();

			throw e;

		}

		return jpi;
	}

}
