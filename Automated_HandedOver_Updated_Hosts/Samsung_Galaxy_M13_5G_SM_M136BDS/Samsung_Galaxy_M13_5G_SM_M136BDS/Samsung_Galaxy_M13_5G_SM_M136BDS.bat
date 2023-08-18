@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Eclipse_Workspace\Samsung_Galaxy_M13_5G_SM_M136BDS
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DtotalPictureCountRear=60 -DtotalPictureCountRear1=60 -DtotalPictureCountRear2=60 -DtotalPictureCountRear3=60 -DtotalPictureCountRear4=60 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75  -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_M13_5G_SM_M136BDS_%mydate%_%mytime%_%Qual_Capacity%.txt
