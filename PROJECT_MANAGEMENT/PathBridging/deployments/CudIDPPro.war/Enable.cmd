rem ntfslink.exe source hardlink
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET TargetName=CudIDPPro.war
SET TargetDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments\%TargetName%
del /F /Q "%TargetDir%.undeployed"
call mapTargetFldrsForHotDebugMode.cmd
%ntfslink% webapp "%TargetDir%"
echo ! > "%TargetDir%.dodeploy"
sleep 5s