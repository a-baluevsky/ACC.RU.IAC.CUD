SET DEFINE OFF;

INSERT INTO CUD_TEST.SETTINGS_KNL_T (ID_SRV,
                                     SIGN_OBJECT,
                                     VALUE_PARAM,
                                     CREATOR,
                                     CREATED,
                                     DATE_EVENT_SRV,
                                     ATTEMPT_SRV,
                                     DESCRIPTION,
									 NAME_PARAM)
     VALUES (9,
             'JASPER_SERVER',
             'http://192.168.68.37:8080/jasperserver/rest_v2/reports/',
             1,
             TO_DATE ('06/19/2015 00:00:00', 'MM/DD/YYYY HH24:MI:SS'),
             TO_DATE ('06/19/2015 00:00:00', 'MM/DD/YYYY HH24:MI:SS'),
             1,
             'Ѕазовый путь к отчЄтам JASPER SERVER ',
			 'JASPER_SERVER');

COMMIT;
