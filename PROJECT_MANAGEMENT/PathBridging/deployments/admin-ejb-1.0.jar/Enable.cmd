rem ntfslink.exe source hardlink
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET TargetName=admin-ejb-1.0.jar
SET TargetDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments\%TargetName%
del /F /Q "%TargetDir%.undeployed"
call mapTargetFldrsForHotDebugMode.cmd
%ntfslink% "C:\jboss-as-7.1.3.Final-fighting-mvn\git\acc\ru.spb.iac.cud\admin-ejb\target\classes" "%TargetDir%"
echo ! > "%TargetDir%.dodeploy"
sleep 5s