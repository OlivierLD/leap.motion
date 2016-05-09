@setlocal
set LMSDK_HOME=C:\LeapDeveloperKit_2.3.1+31549_win\LeapSDK
set CP=..\out\production\java.leap.motion
set CP=%CP%;%LMSDK_HOME%\lib\LeapJava.jar
::
set JAVA_OPTS=-Djava.library.path=%LMSDK_HOME%\lib\x64
::
java %JAVA_OPTS% -cp %CP% tutorial.one.Sample
::
@endlocal
