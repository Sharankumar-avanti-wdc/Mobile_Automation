
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Xiaomi_Poco_X3_Pro
mvn -DmountUnmountCycle=1 -DfileName=testng3.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Tests\Xiaomi_Poco_X3_Pro_M2102J205I_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DmountUnmountCycle=1 -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DrecordingDurationRearExt2=180 -DrecordingDurationRearExt3=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Tests\Xiaomi_Poco_X3_Pro_M2102J205I_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DrecordingDurationRearExt2=180 -DrecordingDurationRearExt3=180 -DfileName=testng10.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Xiaomi_Poco_X3_Pro_M2102J205I_%mydate%_%mytime%_%Qual_Capacity%.txt
rem mvn -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DfileName=testng10F.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%.txt
REM  mvn -DmountUnmountCycle=1 -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12  -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%_%Qual_Capacity%.txt