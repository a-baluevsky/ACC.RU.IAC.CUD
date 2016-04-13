set BASEPATH="C:\jboss-as-7.1.3.Final-fighting-mvn\"
SET NTFSLINK="C:\WINDOWS\ntfslink.exe"
set DEPLOYMENTS="%BASEPATH%standalone\deployments"

SET InfoS-ear_Ear="%BASEPATH%git\paa\ru.spb.iac.cud\admin-ear\target\InfoS-ear.ear"
SET TargetInfoS-ear.ear="%BASEPATH%standalone\deployments\InfoS-ear.ear"

IF EXIST %TargetInfoS-ear.ear% RD %TargetInfoS-ear.ear%
IF EXIST %TargetInfoS-ear.ear% DEL %TargetInfoS-ear.ear%
%NTFSLINK% %InfoS-ear_Ear% %TargetInfoS-ear.ear%

pause