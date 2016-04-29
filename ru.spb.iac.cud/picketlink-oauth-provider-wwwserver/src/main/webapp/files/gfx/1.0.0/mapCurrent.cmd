SET VER=1.0.0
SET VERSUF=-%VER%
SET BASEPATH=C:\jboss-as-7.1.3.Final-fighting-mvn\git\acc\ru.spb.iac.cud\picketlink-oauth-provider-wwwserver\src\main\webapp\files\gfx
SET PATHCUR=%BASEPATH%\current\
SET PATHVER=%BASEPATH%\%VER%\

SET ntfslink="C:\WINDOWS\ntfslink.exe"

ECHO %PATHVER% --- %PATHCUR%

%ntfslink%  "%PATHVER%lib" "%PATHCUR%lib"
%ntfslink%  "%PATHVER%tester" "%PATHCUR%tester"

%ntfslink%  "%PATHVER%async%VERSUF%.js" "%PATHCUR%async.js"
%ntfslink%  "%PATHVER%CookieFX%VERSUF%.js" "%PATHCUR%CookieFX.js"
%ntfslink%  "%PATHVER%GaliaJSFX%VERSUF%.js" "%PATHCUR%GaliaJSFX.js"
%ntfslink%  "%PATHVER%GaliaJSFX_AuthRequest%VERSUF%.js" "%PATHCUR%GaliaJSFX_AuthRequest.js"
%ntfslink%  "%PATHVER%GaliaJSFX_ClientApp%VERSUF%.js" "%PATHCUR%GaliaJSFX_ClientApp.js"
%ntfslink%  "%PATHVER%GaliaJSFX_ClientAppUser%VERSUF%.js" "%PATHCUR%GaliaJSFX_ClientAppUser.js"
%ntfslink%  "%PATHVER%GaliaJSFX_OAuthProviderREST%VERSUF%.js" "%PATHCUR%GaliaJSFX_OAuthProviderREST.js"
%ntfslink%  "%PATHVER%HttpClient%VERSUF%.js" "%PATHCUR%HttpClient.js"



PAUSE