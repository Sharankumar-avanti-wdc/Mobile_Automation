
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Xiaomi_RedmiNoteProMax
REM mvn -DfileName=testng18.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%.txt
rem mvn -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DfileName=testng10F.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%.txt
mvn  -DmountUnmountCycle=1 -DrecordingDurationRearExt=300 -DrecordingDurationRearExt1=300 -DrecordingDurationRearExt2=300 -DrecordingDurationRearExt3=300 -DrecordingDurationfront=300 -DrecordingDurationfront1=300 -DrecordingDurationfront2=300 -DtotalPictureCountRear=30 -DtotalPictureCountRear1=30 -DtotalPictureCountRear2=30 -DtotalPictureCountRear3=30 -DTolerance_Level=%Tolerance_Level%  -DtotalPictureCountFront=30 -DtotalPictureCountFront1=30 -DtotalPictureCountFront2=30 -DtotalPictureCountFront3=30 -DTolerance_Level=%Tolerance_Level%  -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Xiaomi_Redmi_Note10_ProMax_M2101K6I_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DmountUnmountCycle=1 -DfileName=testng3.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Avanti\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%_%Qual_Capacity%.txt