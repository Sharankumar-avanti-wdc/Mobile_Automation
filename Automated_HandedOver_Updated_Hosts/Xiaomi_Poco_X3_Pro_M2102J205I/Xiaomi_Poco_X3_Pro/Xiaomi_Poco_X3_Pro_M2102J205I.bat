
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Xiaomi_Poco_X3_Pro
mvn -DtotalPictureCountRear=3 -DtotalPictureCountRear1=3 -DtotalPictureCountRear2=3 -DtotalPictureCountRear3=3 -DfileName=testng9.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Xiaomi_Poco_X3_Pro_M2102J205I_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationRearExt=3 -DrecordingDurationRearExt1=3 -DrecordingDurationRearExt2=3 -DrecordingDurationRearExt3=3 -DfileName=testng10.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Xiaomi_Poco_X3_Pro_M2102J205I_%mydate%_%mytime%_%Qual_Capacity%.txt
rem mvn -DrecordingDurationfront=3 -DrecordingDurationfront1=3  -DfileName=testng10F.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%.txt
REM  mvn -DmountUnmountCycle=1 -DrecordingDurationRearExt=3 -DrecordingDurationRearExt1=3 -DrecordingDurationfront=3 -DrecordingDurationfront1=3  -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12  -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%_%Qual_Capacity%.txt