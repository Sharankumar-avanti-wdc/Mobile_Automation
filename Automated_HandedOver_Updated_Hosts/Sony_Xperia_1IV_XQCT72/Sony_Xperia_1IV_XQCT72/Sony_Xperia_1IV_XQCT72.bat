@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Sony_Xperia_1IV_XQCT72
mvn -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationRear4=180 -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DfileName=testng9F.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Sony_Xperia_%mydate%_%mytime%_%Qual_Capacity%.txt
REM -DmountUnmountCycle=1 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75  -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront=100 -DtotalPictureCountFront=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install
