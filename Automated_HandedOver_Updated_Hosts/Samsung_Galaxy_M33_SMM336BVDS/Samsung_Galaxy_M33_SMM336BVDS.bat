@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Eclipse_Workspace\Samsung_Galaxy_M33_SMM336BVDS
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationRear2=600 -DrecordingDurationRear3=600 -DrecordingDurationfront=600 -DrecordingDurationfront1=600 -DtotalPictureCountRear=35 -DtotalPictureCountRear1=35 -DtotalPictureCountRear2=35 -DtotalPictureCountRear3=35 -DtotalPictureCountRear4=35 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=35 -DtotalPictureCountFront1=35  -DtotalPictureCountFront2=35 -DtotalPictureCountFront3=35 -DTolerance_Level=%Tolerance_Level%  -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_M33_SMM336BVDS_%mydate%_%mytime%_%Qual_Capacity%.txt
