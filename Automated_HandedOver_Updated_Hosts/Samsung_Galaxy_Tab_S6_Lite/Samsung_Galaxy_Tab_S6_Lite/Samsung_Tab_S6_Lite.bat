
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Samsung_Galaxy_Tab_S6_Lite
mvn -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DfileName=testng8.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Samsung_Tab_S6_Lite_%mydate%_%mytime%_%Qual_Capacity%.txt
rem mvn -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DfileName=testng10F.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%.txt
REM  mvn -DmountUnmountCycle=1 -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12  -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%_%Qual_Capacity%.txt