@ECHO OFF

SET BridgeDir=%~1
IF "%BridgeDir%"=="" GOTO ERR_NOBRIDGE
IF NOT EXIST "%BridgeDir%" GOTO ERR_NOBRIDGE

echo BridgeDir: %BridgeDir%
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET pathPAA=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\

SET srcjar="%pathPAA%ru.spb.iac.cud\admin-ejb\target\classes"
SET dstjar="%BridgeDir%\InfoS-ejb.jar"

SET srcwebapp="%pathPAA%ru.spb.iac.cud\admin-web\src\main\webapp"
SET dstwebapp="%BridgeDir%\InfoS-web.war"


:ROOT
%ntfslink% "%pathPAA%ru.spb.iac.cud\admin-ear\target\admin-ear-1.0\lib" "%BridgeDir%\lib"
%ntfslink% "%pathPAA%ru.spb.iac.cud\admin-ear\target\admin-ear-1.0\META-INF" "%BridgeDir%\META-INF"
%ntfslink% "%pathPAA%ru.spb.iac.cud\admin-ear\target\admin-ear-1.0\jboss-seam-2.2.2.Final.jar" "%BridgeDir%\jboss-seam-2.2.2.Final.jar"


:InfoS-ejb.jar
rem %ntfslink% "%pathPAA%ru.spb.iac.cud\admin-ear\target\admin-ear-1.0\InfoS-ejb.jar" "%BridgeDir%\InfoS-ejb.jar"
IF NOT EXIST %dstjar% %ntfslink% %srcjar% %dstjar%

:InfoS-web.war
IF NOT EXIST %dstwebapp% %ntfslink% %srcwebapp% %dstwebapp%

:webapp\WEB-INF\
SET MDFLDR=%dstwebapp%\WEB-INF
IF NOT EXIST %MDFLDR% MD %MDFLDR%

:webapp\WEB-INF\classes
SET LINKSOURCE="%pathPAA%ru.spb.iac.cud\admin-web\target\classes"
SET LINKTARGET="%srcwebapp%\WEB-INF\classes"
IF NOT EXIST %LINKTARGET% %ntfslink% %LINKSOURCE% %LINKTARGET%

:webapp\WEB-INF\lib
SET LINKSOURCE="%pathPAA%ru.spb.iac.cud\admin-web\target\admin-web-1.0\WEB-INF\lib"
SET LINKTARGET="%srcwebapp%\WEB-INF\lib"
IF NOT EXIST %LINKTARGET% %ntfslink% %LINKSOURCE% %LINKTARGET%

GOTO EXIT

:MapClassFiles
SET TARGETBASE=%dstwebapp%\Web-inf\
SET TARGET_CLASSES="%TARGETBASE%classes" 
SET TARGET_LIB="%TARGETBASE%lib" 
rd %TARGET_CLASSES%
IF EXIST %TARGET_CLASSES% ren %TARGET_CLASSES% "classes.originalAB"
%ntfslink% "%pathPAA%ru.spb.iac.cud\user-web\target\classes" %TARGET_CLASSES%
rd %TARGET_LIB%
IF EXIST %TARGET_LIB% ren %TARGET_LIB% "lib.originalAB"
%ntfslink% "%pathPAA%ru.spb.iac.cud\user-web\target\admin-web-1.0\WEB-INF\lib" %TARGET_LIB%
rem pause
GOTO EXIT

:ERR_NOBRIDGE
echo Bridge directory not set or exist!

:EXIT
rem PAUSE