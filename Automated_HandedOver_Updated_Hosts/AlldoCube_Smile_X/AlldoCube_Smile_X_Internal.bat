@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\AlldoCube_Smile_X
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12 -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountRear4=12 -DtotalPictureCountRear5=12 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=2 -DtotalPictureCountFront1=2 -DtotalPictureCountFront2=2 -DtotalPictureCountFront3=12 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9F_Int.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\AlldoCube_Smile_X_%mydate%_%mytime%_%Qual_Capacity%.txt
