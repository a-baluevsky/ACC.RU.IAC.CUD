@ECHO OFF
SET BridgeDir=%~1
IF "%BridgeDir%"=="" GOTO ERR_NOBRIDGE
IF NOT EXIST "%BridgeDir%" GOTO EXIT

echo BridgeDir: %BridgeDir%
SET pathPAA=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\

SET srcwebapp="%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\src\main\webapp"
SET dstwebapp="%BridgeDir%\picketlink-oauth-provider-wwwserver.war"
SET dstwebinf="%BridgeDir%\picketlink-oauth-provider-wwwserver.war\WEB-INF"

SET srcclasses="%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\target\classes"
SET dstclasses="%dstwebinf%\classes"

SET srclib="%pathPAA%ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\target\picketlink-oauth-provider-wwwserver\WEB-INF\lib"
SET dstlib="%dstwebinf%\lib"


:RemoveLibs
SET DSTFILE="%dstlib%\commons-codec-1.4.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\commons-logging-1.1.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\deltaspike-core-api-0.5.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\deltaspike-core-impl-0.5.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\deltaspike-security-module-api-0.5.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\deltaspike-security-module-impl-0.5.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\guice-2.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\httpclient-4.1.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\httpcore-4.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jackson-core-asl-1.9.2.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jackson-jaxrs-1.9.2.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jackson-mapper-asl-1.9.2.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jcip-annotations-1.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\json-20090211.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\log4j-1.2.12.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\openid4java-nodeps-0.9.6.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\org.apache.oltu.commons.encodedtoken-1.0.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\org.apache.oltu.commons.json-1.0.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\org.apache.oltu.oauth2.authzserver-1.0.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\org.apache.oltu.oauth2.common-1.0.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\org.apache.oltu.oauth2.jwt-1.0.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\org.apache.oltu.oauth2.resourceserver-1.0.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-api-2.6.0.CR1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-common-2.6.0.CR1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-idm-api-2.6.0.CR1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-idm-impl-2.6.0.CR1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-idm-simple-schema-2.6.0.CR1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-impl-2.6.0.CR1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-social-standalone-2.0.0.2012sep25.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\slf4j-api-1.7.7.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\twitter4j-core-2.2.6.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
rem Appended list:
SET DSTFILE="%dstlib%\ant-1.7.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\ant-launcher-1.7.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%

rem common-ilib-1.0.jar shouldn't be there at all! See mountBridge.cmd for info
SET DSTFILE="%dstlib%\common-ilib-1.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%

SET DSTFILE="%dstlib%\commons-beanutils-1.8.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\dom4j-1.6.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\el-api-1.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\getopt-1.0.13.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\google-api-client-1.14.1-beta.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\google-api-services-oauth2-v2-rev36-1.14.2-beta.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\google-http-client-1.14.1-beta.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\google-http-client-jackson-1.14.1-beta.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\google-oauth-client-1.14.1-beta.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\javax.inject-1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jboss-el-1.0_02.CR5.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jboss-jacc-api_1.4_spec-1.0.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jboss-jaxb-intros-1.0.2.GA.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jboss-jaxws-api_2.2_spec-2.0.1.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jboss-seam-2.2.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jbossws-common-1.4.1.GA.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jbossws-spi-1.4.1.GA.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jbossxacml-2.0.8.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\JCPxml-1.0.53.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\jsr305-1.3.9.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\persistence-api-1.0.2.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketbox-4.0.7.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-common-2.7.0.CR3.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-config-2.5.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-federation-2.5.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-jbas7-single-2.5.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-jbas-common-2.5.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-social-2.5.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\picketlink-tomcat-common-2.5.2.Final.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\slf4j-api-1.7.12.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\xml-apis-1.0.b2.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\XMLDSigRI-2.0.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\xmlsec-1.5.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\xpp3-1.1.4c.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\xpp3_min-1.1.3.4.O.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%
SET DSTFILE="%dstlib%\xstream-1.3.1.jar"
IF EXIST %DSTFILE% DEL /Q %DSTFILE%

:picketlink-oauth-provider-wwwserver.war
SET RDFLDR="%dstlib%"
IF EXIST %RDFLDR% RD %RDFLDR%
SET RDFLDR="%dstclasses%"
IF EXIST %RDFLDR% RD %RDFLDR%
SET RDFLDR="%dstwebinf%"
IF EXIST %RDFLDR% RD %RDFLDR%
SET RDFLDR="%dstwebapp%"
IF EXIST %RDFLDR% RD %RDFLDR%

:ROOT
SET RDFLDR="%BridgeDir%\META-INF"
IF EXIST %RDFLDR% RD %RDFLDR%

GOTO EXIT

:ERR_NOBRIDGE
echo Bridge directory not set or exist!

:EXIT
rem pause