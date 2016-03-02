@ECHO OFF

SET BridgeDir=%~1
IF "%BridgeDir%"=="" GOTO ERR_NOBRIDGE
IF NOT EXIST "%BridgeDir%" GOTO ERR_NOBRIDGE

echo BridgeDir: %BridgeDir%
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET pathPAA=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\


SET srcwebapp="%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\src\main\webapp"
SET dstwebapp="%BridgeDir%\picketlink-oauth-provider-wwwserver.war"
SET dstwebinf="%BridgeDir%\picketlink-oauth-provider-wwwserver.war\WEB-INF"

SET srcclasses="%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\target\classes"
SET dstclasses="%dstwebinf%\classes"

SET srclib="%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\target\picketlink-oauth-provider-wwwserver\WEB-INF\lib"
SET dstlib="%dstwebinf%\lib"

:ROOT
%ntfslink% "%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider\src\main\application\META-INF" "%BridgeDir%\META-INF"

:picketlink-oauth-provider-wwwserver.war
IF NOT EXIST %dstwebapp% %ntfslink% %srcwebapp% %dstwebapp%
IF NOT EXIST %dstwebinf% MD %dstwebinf%
IF NOT EXIST %dstclasses% %ntfslink% %srcclasses% %dstclasses%
IF NOT EXIST %dstlib% MD %dstlib%

:MapLibs

rem common-ilib-1.0.jar is already in MODULES, so delete it to avoid "ClassCastException"
rem SET DSTFILE="%dstlib%\common-ilib-1.0.jar"
rem IF EXIST %DSTFILE% DEL /Q %DSTFILE%


SET LIBFILE="commons-codec-1.4.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="commons-logging-1.1.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="deltaspike-core-api-0.5.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="deltaspike-core-impl-0.5.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="deltaspike-security-module-api-0.5.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="deltaspike-security-module-impl-0.5.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="guice-2.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="httpclient-4.1.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="httpcore-4.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jackson-core-asl-1.9.2.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jackson-jaxrs-1.9.2.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jackson-mapper-asl-1.9.2.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jcip-annotations-1.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="json-20090211.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="log4j-1.2.12.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="openid4java-nodeps-0.9.6.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="org.apache.oltu.commons.encodedtoken-1.0.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="org.apache.oltu.commons.json-1.0.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="org.apache.oltu.oauth2.authzserver-1.0.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="org.apache.oltu.oauth2.common-1.0.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="org.apache.oltu.oauth2.jwt-1.0.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="org.apache.oltu.oauth2.resourceserver-1.0.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-api-2.6.0.CR1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-common-2.6.0.CR1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-idm-api-2.6.0.CR1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-idm-impl-2.6.0.CR1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-idm-simple-schema-2.6.0.CR1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-impl-2.6.0.CR1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-social-standalone-2.0.0.2012sep25.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="slf4j-api-1.7.7.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="twitter4j-core-2.2.6.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
rem Appended list:
SET LIBFILE="ant-1.7.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="ant-launcher-1.7.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem Imported from module, so shouldn't be here!
rem SET LIBFILE="common-ilib-1.0.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

SET LIBFILE="commons-beanutils-1.8.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="dom4j-1.6.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="el-api-1.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="getopt-1.0.13.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="google-api-client-1.14.1-beta.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="google-api-services-oauth2-v2-rev36-1.14.2-beta.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="google-http-client-1.14.1-beta.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="google-http-client-jackson-1.14.1-beta.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="google-oauth-client-1.14.1-beta.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="javax.inject-1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jboss-el-1.0_02.CR5.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jboss-jacc-api_1.4_spec-1.0.2.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jboss-jaxb-intros-1.0.2.GA.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jboss-jaxws-api_2.2_spec-2.0.1.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jboss-seam-2.2.2.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jbossws-common-1.4.1.GA.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jbossws-spi-1.4.1.GA.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jbossxacml-2.0.8.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="JCPxml-1.0.53.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="jsr305-1.3.9.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="persistence-api-1.0.2.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketbox-4.0.7.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-common-2.7.0.CR3.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="picketlink-config-2.5.2.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem SET LIBFILE="picketlink-federation-2.5.2.Final.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

SET LIBFILE="picketlink-jbas7-single-2.5.2.Final.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem SET LIBFILE="picketlink-jbas-common-2.5.2.Final.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem SET LIBFILE="picketlink-social-2.5.2.Final.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem SET LIBFILE="picketlink-tomcat-common-2.5.2.Final.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

SET LIBFILE="slf4j-api-1.7.12.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="xml-apis-1.0.b2.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="XMLDSigRI-2.0.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%
SET LIBFILE="xmlsec-1.5.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem SET LIBFILE="xpp3-1.1.4c.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

rem SET LIBFILE="xpp3_min-1.1.3.4.O.jar"
rem SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
rem IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%

SET LIBFILE="xstream-1.3.1.jar"
SET SRCFILE="%srclib%\%LIBFILE%" && SET DSTFILE="%dstlib%\%LIBFILE%"
IF NOT EXIST %DSTFILE% %ntfslink% %SRCFILE% %DSTFILE%



rem pause
GOTO EXIT

:ERR_NOBRIDGE
echo Bridge directory not set or exist!

:EXIT
rem PAUSE


