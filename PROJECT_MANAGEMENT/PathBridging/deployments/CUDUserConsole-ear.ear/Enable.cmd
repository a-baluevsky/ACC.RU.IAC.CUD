rem ntfslink.exe source hardlink
SET sleep="C:\Program Files\Git\bin\sleep.exe"
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET TargetName=CUDUserConsole-ear.ear
SET TargetDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments\%TargetName%
if exist del /Q "%TargetDir%" && sleep 5s
del /F /Q "%TargetDir%.undeployed"
call mapTargetFldrsForHotDebugMode.cmd
%ntfslink% . "%TargetDir%"
echo ! > "%TargetDir%.dodeploy"
%sleep% 5s
pause