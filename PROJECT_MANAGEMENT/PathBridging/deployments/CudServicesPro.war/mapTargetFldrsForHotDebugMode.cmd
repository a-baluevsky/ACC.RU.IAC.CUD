SET NTFSLINK="C:\WINDOWS\ntfslink.exe"
SET srcbase=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\web-services\target\CudServicesPro
SET metainf="%srcbase%\META-INF"
SET webinf="%srcbase%\WEB-INF"
SET classes=C:\jboss-as-7.1.3.Final-fighting-mvn\git\acc\ru.spb.iac.cud\web-services\target\classes

%NTFSLINK% %metainf% "META-INF"
rem IF EXIST "WEB-INF" REN "WEB-INF" "WEB-INF.OLD"
rem MD "WEB-INF"
IF NOT EXIST "WEB-INF" MD "WEB-INF"
IF NOT EXIST "WEB-INF\lib" MD "WEB-INF\lib"

rem %NTFSLINK% "C:\jboss-as-7.1.3.Final-fighting-mvn\maven\repository_cud\org\apache\cxf\cxf-api\2.7.3\cxf-api-2.7.3.jar" "WEB-INF\lib\cxf-api-2.7.3.jar"
rem %NTFSLINK% "C:\jboss-as-7.1.3.Final-fighting-mvn\maven\repository_cud\org\apache\cxf\cxf-rt-bindings-soap\2.7.3\cxf-rt-bindings-soap-2.7.3.jar" "WEB-INF\lib\cxf-rt-bindings-soap-2.7.3.jar"
rem %NTFSLINK% "C:\jboss-as-7.1.3.Final-fighting-mvn\modules\org\apache\cxf\impl\main\cxf-rt-bindings-soap-cud.jar" "WEB-INF\lib\cxf-rt-bindings-soap-cud.jar"
rem %NTFSLINK% "C:\jboss-as-7.1.3.Final-fighting-mvn\maven\repository_cud\org\jboss\jboss-jaxws\2.0.1.SP2\jboss-jaxws-2.0.1.SP2.jar" "WEB-INF\lib\jboss-jaxws-2.0.1.SP2.jar"
rem %NTFSLINK% "C:\jboss-as-7.1.3.Final-fighting-mvn\maven\repository_cud\org\jboss\ws\cxf\jbossws-cxf-server\4.2.0.Alpha1\jbossws-cxf-server-4.2.0.Alpha1.jar" "WEB-INF\lib\jbossws-cxf-server-4.2.0.Alpha1.jar"


%NTFSLINK% "%webinf%\jboss-web.xml" ".\WEB-INF\jboss-web.xml"
%NTFSLINK% "%webinf%\web.xml" ".\WEB-INF\web.xml"
rem %NTFSLINK% "%webinf%\lib" ".\WEB-INF\lib"
%NTFSLINK% "%classes%" ".\WEB-INF\classes"

rem %NTFSLINK% "C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\data\wsdl\picketlink-sts.war\PicketLinkSTS.wsdl" ".\WEB-INF\wsdl\PicketLinkSTS.wsdl"


