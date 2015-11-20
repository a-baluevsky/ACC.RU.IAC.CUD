@ECHO OFF
SET sleep="C:\Program Files\Git\bin\sleep.exe"
SET TargetName=InfoS-ear.ear
SET TargetDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments\%TargetName%
SET BridgeDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments_devtst\%TargetName%

if exist "%TargetDir%.deployed" del /F /Q "%TargetDir%.deployed"
if not exist "%TargetDir%" GOTO CLNFLAGGILES
rd "%TargetDir%"
echo Wait for undeployment ends. Then delete 'undeployed' file
%sleep% 5s
:CLNFLAGGILES
if exist "%TargetDir%.undeployed" del /F /Q "%TargetDir%.undeployed"
if exist "%TargetDir%.dodeploy"   del /F /Q "%TargetDir%.dodeploy"
call unmountBridge.cmd "%BridgeDir%"

pause