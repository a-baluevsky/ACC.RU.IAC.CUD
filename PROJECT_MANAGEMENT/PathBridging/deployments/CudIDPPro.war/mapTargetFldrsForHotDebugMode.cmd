SET NTFSLINK="C:\WINDOWS\ntfslink.exe"
SET webapp="C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\idp-web\src\main\webapp"
SET classes="C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\idp-web\target\classes"
IF EXIST webapp RD webapp
%NTFSLINK% %webapp% webapp
%NTFSLINK% %classes% webapp\WEB-INF\classes
