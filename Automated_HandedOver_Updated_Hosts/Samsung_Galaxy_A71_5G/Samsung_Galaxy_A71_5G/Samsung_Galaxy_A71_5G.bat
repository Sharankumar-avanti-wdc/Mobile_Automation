@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%


cd C:\Users\sandisk\Android11\Eclipse_Workspace\Samsung_Galaxy_A71_5G
mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationFront=180 -DrecordingDurationFront1=180 -DrecordingDurationFront2=180 -DrecordingDurationFront3=180 -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12 -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountRear4=12 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DtotalPictureCountFront4=12 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_A71_5G_%mydate%_%mytime%_%Qual_Capacity%.txt


