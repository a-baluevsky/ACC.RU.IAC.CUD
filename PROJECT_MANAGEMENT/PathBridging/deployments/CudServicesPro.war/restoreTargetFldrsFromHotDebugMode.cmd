if exist "META-INF" rd "META-INF"
if exist ".\WEB-INF\classes" rd ".\WEB-INF\classes"
if exist ".\WEB-INF\lib" rd ".\WEB-INF\lib"
if exist ".\WEB-INF\jboss-web.xml" del ".\WEB-INF\jboss-web.xml"
if exist ".\WEB-INF\web.xml" del ".\WEB-INF\web.xml"
rem if exist ".\WEB-INF\wsdl\PicketLinkSTS.wsdl" del ".\WEB-INF\wsdl\PicketLinkSTS.wsdl"
rem del "WEB-INF\lib\cxf-api-2.7.3.jar"
rem del "WEB-INF\lib\cxf-rt-bindings-soap-2.7.3.jar"
rem del "WEB-INF\lib\cxf-rt-bindings-soap-cud.jar"
rem del "WEB-INF\lib\jboss-jaxws-2.0.1.SP2.jar"
rem del "WEB-INF\lib\jbossws-cxf-server-4.2.0.Alpha1.jar"

if exist "WEB-INF\lib" rd "WEB-INF\lib"

if exist ".\WEB-INF" RD ".\WEB-INF"
IF EXIST "META-INF" RD "META-INF"
