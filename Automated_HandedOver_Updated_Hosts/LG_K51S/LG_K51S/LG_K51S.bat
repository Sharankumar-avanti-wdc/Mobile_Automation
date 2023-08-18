@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\LG_K51S

mvn  -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationRear2=600 -DrecordingDurationFront=600 -DrecordingDurationFront1=600 -DrecordingDurationFront2=600 -DtotalPictureCountRear=22 -DtotalPictureCountRear1=22 -DtotalPictureCountRear2=22 -DtotalPictureCountRear3=22 -DtotalPictureCountRear4=22 -DtotalPictureCountRear5=22 -DtotalPictureCountRear6=22 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=22 -DtotalPictureCountFront1=22 -DtotalPictureCountFront2=22 -DtotalPictureCountFront3=22  -DtotalPictureCountFront4=22 -DtotalPictureCountFront5=22 -DtotalPictureCountFront6=22 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\LG_K51S_%mydate%_%mytime%_%Qual_Capacity%.txt
