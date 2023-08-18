@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Xiaomi_Redmi10_Prime_2106111981
mvn mvn -DmountUnmountCycle=1 -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12  -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DTolerance_Level=%Tolerance_Level%% -DtotalPictureCountFront=3 -DtotalPictureCountFront1=3 -DtotalPictureCountFront2=3 -DtotalPictureCountFront3=3 -DTolerance_Level=%Tolerance_Level%  -DfileName=testng9F.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Xiaomi_Redmi10_Prime_%mydate%_%mytime%_%Qual_Capacity%.txt

