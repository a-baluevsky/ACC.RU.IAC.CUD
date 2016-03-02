rem ntfslink.exe source hardlink
SET sleep="C:\Program Files\Git\bin\sleep.exe"
SET ntfslink="C:\WINDOWS\ntfslink.exe"
SET TargetName=CUDUserConsole-ear.ear
SET TargetDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments\%TargetName%
SET BridgeDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments_devtst\%TargetName%

if exist "%TargetDir%" GOTO DELTARGETDIR
GOTO MAPBRIDGE
:DELTARGETDIR
del /Q "%TargetDir%" && sleep 5s
del /F /Q "%TargetDir%.undeployed"
:MAPBRIDGE
rem call mountBridge.cmd "%BridgeDir%"
%ntfslink% "%BridgeDir%" "%TargetDir%"
echo ! > "%TargetDir%.dodeploy"
%sleep% 5s
