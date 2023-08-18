@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Motorola_Moto_G22_XT22312
REM mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12 -DtotalPictureCountRear2=12 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=18 -DtotalPictureCountFront1=18 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Motorola_Moto_G22_XT22312_%mydate%_%mytime%_%Qual_Capacity%.txt
mvn -DmountUnmountCycle=1 -DfileName=testng3.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Motorola_Moto_G22_XT22312_%mydate%_%mytime%_%Qual_Capacity%.txt