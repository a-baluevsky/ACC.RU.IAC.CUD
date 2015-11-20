@ECHO OFF
SET BridgeDir=%~1
IF "%BridgeDir%"=="" GOTO ERR_NOBRIDGE
IF NOT EXIST "%BridgeDir%" GOTO EXIT

echo BridgeDir: %BridgeDir%
SET pathPAA=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\

SET srcjar=%pathPAA%ru.spb.iac.cud\admin-ejb\target\classes
SET dstjar=%BridgeDir%\InfoS-ejb.jar

SET srcwebapp=%pathPAA%ru.spb.iac.cud\admin-web\src\main\webapp
SET dstwebapp=%BridgeDir%\InfoS-web.war

:webapp\WEB-INF\lib
SET RDFLDR="%srcwebapp%\WEB-INF\lib"
IF EXIST %RDFLDR% RD %RDFLDR%

:webapp\WEB-INF\classes
SET RDFLDR="%srcwebapp%\WEB-INF\classes"
IF EXIST %RDFLDR% RD %RDFLDR%

:InfoS-web.war
rem SET DELFILE="%BridgeDir%\InfoS-web.war"
rem IF EXIST %DELFILE% del /F /Q %DELFILE%
SET RDFLDR="%dstwebapp%"
IF EXIST %RDFLDR% RD %RDFLDR%

:InfoS-ejb.jar
rem SET DELFILE="%BridgeDir%\InfoS-ejb.jar"
rem IF EXIST %DELFILE% del /F /Q %DELFILE%
SET RDFLDR="%dstjar%"
IF EXIST %RDFLDR% RD %RDFLDR%

:ROOT
SET DELFILE="%BridgeDir%\jboss-seam-2.2.2.Final.jar"
IF EXIST %DELFILE% del /F /Q %DELFILE%

SET RDFLDR="%BridgeDir%\META-INF"
IF EXIST %RDFLDR% RD %RDFLDR%

SET RDFLDR="%BridgeDir%\lib"
IF EXIST %RDFLDR% RD %RDFLDR%

GOTO EXIT






SET dstconsolejar=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments_devtst\CUDUserConsole-ear.ear\CUDUserConsole-ejb.jar
IF EXIST %dstconsolejar% RD %dstconsolejar%


SET dstwebapp=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments_devtst\CUDUserConsole-ear.ear\CUDUserConsole-war.war
IF NOT EXIST %dstwebapp% GOTO EXIT

SET TARGETBASE=%dstwebapp%\Web-inf\
SET TARGET_CLASSES=%TARGETBASE%classes
SET TARGET_LIB=%TARGETBASE%lib
IF EXIST "%TARGET_CLASSES%" rd "%TARGET_CLASSES%"
IF EXIST "%TARGET_CLASSES%.originalAB" ren "%TARGET_CLASSES%.originalAB" "classes"
IF NOT EXIST "%TARGET_CLASSES%" md "%TARGET_CLASSES%"

IF EXIST "%TARGET_LIB%" rd "%TARGET_LIB%"
IF EXIST "%TARGET_LIB%.originalAB" ren "%TARGET_LIB%.originalAB" "lib"
IF NOT EXIST "%TARGET_LIB%" md "%TARGET_LIB%"

RD %dstwebapp%
GOTO EXIT

:ERR_NOBRIDGE
echo Bridge directory not set or exist!

:EXIT

rem pause