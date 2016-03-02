SET ntfslink="C:\WINDOWS\ntfslink.exe"

SET BridgeDir=%~1
IF "%BridgeDir%"=="" GOTO ERR_NOBRIDGE
IF NOT EXIST "%BridgeDir%" GOTO ERR_NOBRIDGE

echo BridgeDir: %BridgeDir%
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET pathPAA=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\


SET srcjar="%pathPAA%ru.spb.iac.cud\user-ejb\target\classes"
SET dstjar="%BridgeDir%\CUDUserConsole-ejb.jar"

SET srcwebapp="%pathPAA%ru.spb.iac.cud\user-web\src\main\webapp"
SET dstwebapp="%BridgeDir%\CUDUserConsole-war.war"

:ROOT




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

GOTO EXIT

:ERR_NOBRIDGE
echo Bridge directory not set or exist!

:EXIT
PAUSE