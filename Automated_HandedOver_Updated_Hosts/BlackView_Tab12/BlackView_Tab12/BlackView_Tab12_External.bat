@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\BlackView_Tab150
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DtotalPictureCountRear=150 -DtotalPictureCountRear1=150 -DTolerance_Level=%Tolerance_Level%  -DtotalPictureCountFront=150 -DtotalPictureCountFront1=150 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_Tab150_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_Oscal_S60Pro_%mydate%_%mytime%_%Qual_Capacity%.txt