@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%
cd C:\Users\sandisk\Android11\Eclipse_Workspace\Samsung_Galaxy_A03_SMA035FD
mvn -DrecordingDurationRear=580 -DrecordingDurationfront=580 -DtotalPictureCountRear=300  -DtotalPictureCountFront=300   -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_A03_SMA035FD_%mydate%_%mytime%_%Qual_Capacity%.txt
