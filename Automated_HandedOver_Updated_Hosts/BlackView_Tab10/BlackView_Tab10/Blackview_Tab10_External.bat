@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\BlackView_Tab10
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=120 -DrecordingDurationRear1=120 -DrecordingDurationRear2=120 -DrecordingDurationfront=120 -DrecordingDurationfront1=120 -DrecordingDurationfront2=120 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=18 -DtotalPictureCountFront1=18 -DtotalPictureCountFront2=18 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_Tab10_%mydate%_%mytime%_%Qual_Capacity%.txt