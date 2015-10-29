SET DEFINE OFF;
Insert into CUD_TEST.REPORTS_BSS_T
   (ID_SRV, REPORT_NAME, REPORT_CODE, CREATOR, CREATED, ORDER_NUM, DATE_REQUIRED, REPORT_PATH)
 Values
   (1, 
    'Отчёт по количеству входов в ТОРИС', 
    'Report1', 
    1, 
    TO_DATE('08/19/2014 16:12:33', 'MM/DD/YYYY HH24:MI:SS'), 
    2, 
    2, 
    'toris/urn_eis_cud/CUDReport1');
Insert into CUD_TEST.REPORTS_BSS_T
   (ID_SRV, REPORT_NAME, REPORT_CODE, CREATOR, CREATED, ORDER_NUM, DATE_REQUIRED, REPORT_PATH)
 Values
   (2, 
    'Отчёт по аудиту действий пользователей', 
    'Report2', 
    1, 
    TO_DATE('08/19/2014 16:13:09', 'MM/DD/YYYY HH24:MI:SS'), 
    1, 
    2, 
    'toris/urn_eis_cud/CUDReport2');
Insert into CUD_TEST.REPORTS_BSS_T
   (ID_SRV, REPORT_NAME, REPORT_CODE, CREATOR, CREATED, ORDER_NUM, DATE_REQUIRED, REPORT_PATH)
 Values
   (3, 
    'Проверка на число дат', 
    'Report3', 
    1, 
    TO_DATE('05/26/2015 16:39:39', 'MM/DD/YYYY HH24:MI:SS'), 
    3, 
    1, 
    'toris/urn_eis_cud/Report4_full');
COMMIT;
