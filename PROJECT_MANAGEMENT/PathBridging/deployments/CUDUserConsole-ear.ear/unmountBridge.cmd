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

:EXIT