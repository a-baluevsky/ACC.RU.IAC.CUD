SET TargetName=admin-ejb-1.0.jar
SET TargetDir=C:\jboss-as-7.1.3.Final-fighting-mvn\standalone\deployments\%TargetName%

del /F /Q "%TargetDir%.deployed"
rd "%TargetDir%"
echo Wait for undeployment ends. Then delete 'undeployed' file
sleep 5s
del /F /Q "%TargetDir%.undeployed"

