


 @echo off
 For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
 For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
 echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Xiaomi_Poco_X4_Pro_5G_220111691

mvn  -DmountUnmountCycle=1 -DrecordingDurationRearExt=580 -DrecordingDurationRearExt1=580  -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test1\Xiaomi_Poco_X4_Pro_5G_220111691_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DfileName=testng10.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Xiaomi_Poco_X4_Pro_5G_220111691_%mydate%_%mytime%_%Qual_Capacity%.txt