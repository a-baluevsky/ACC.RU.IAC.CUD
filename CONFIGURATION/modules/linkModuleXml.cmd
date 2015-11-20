@ECHO OFF
SET ntfslink="C:\WINDOWS\ntfslink.exe"

SET dstCUD=C:\jboss-as-7.1.3.Final-fighting-mvn\git\paa\CONFIGURATION\modules\ru\spb\iac\cud\
SET srcCUD=C:\jboss-as-7.1.3.Final-fighting-mvn\modules\ru\spb\iac\cud\

md "%dstCUD%crypto\main"
md "%dstCUD%idp\main"
md "%dstCUD%main"
md "%dstCUD%sp\main"
md "%dstCUD%sts\main"

%ntfslink% "%srcCUD%crypto\main\module.xml" "%dstCUD%crypto\main\module.xml"
%ntfslink% "%srcCUD%idp\main\module.xml" "%dstCUD%idp\main\module.xml"
%ntfslink% "%srcCUD%main\module.xml" "%dstCUD%main\module.xml"
%ntfslink% "%srcCUD%sp\main\module.xml" "%dstCUD%sp\main\module.xml"
%ntfslink% "%srcCUD%sts\main\module.xml" "%dstCUD%sts\main\module.xml"

