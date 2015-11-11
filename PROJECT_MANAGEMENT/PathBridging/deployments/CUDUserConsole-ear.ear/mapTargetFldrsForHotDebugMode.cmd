SET ntfslink="C:\WINDOWS\ntfslink.exe"

SET srcconsolejar=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\user-ejb\target\classes
SET dstconsolejar=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments_devtst\CUDUserConsole-ear.ear\CUDUserConsole-ejb.jar

IF NOT EXIST %dstconsolejar% %ntfslink% %srcconsolejar% %dstconsolejar%

SET srcwebapp=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\user-web\src\main\webapp
SET dstwebapp=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments_devtst\CUDUserConsole-ear.ear\CUDUserConsole-war.war



IF NOT EXIST %dstwebapp% %ntfslink% %srcwebapp% %dstwebapp%
IF EXIST %dstwebapp% GOTO MapClassFiles
echo Failed creating %dstwebapp%!
pause
GOTO EXIT

:MapClassFiles
SET TARGETBASE=%dstwebapp%\Web-inf\
SET TARGET_CLASSES="%TARGETBASE%classes" 
SET TARGET_LIB="%TARGETBASE%lib" 
rd %TARGET_CLASSES%
IF EXIST %TARGET_CLASSES% ren %TARGET_CLASSES% "classes.originalAB"
%ntfslink% "C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\user-web\target\classes" %TARGET_CLASSES%
rd %TARGET_LIB%
IF EXIST %TARGET_LIB% ren %TARGET_LIB% "lib.originalAB"
%ntfslink% "C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\ru.spb.iac.cud\user-web\target\user-web-1.0\WEB-INF\lib" %TARGET_LIB%
rem pause

:EXIT