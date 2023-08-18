@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\LG_K41S


mvn -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationRear2=600 -DrecordingDurationFront=600 -DrecordingDurationFront1=600 -DrecordingDurationFront2=600 -DtotalPictureCountRear=35 -DtotalPictureCountRear1=35 -DtotalPictureCountRear2=35 -DtotalPictureCountRear3=35 -DtotalPictureCountRear4=35 -DtotalPictureCountRear5=35 -DtotalPictureCountRear6=35 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=35 -DtotalPictureCountFront1=35 -DtotalPictureCountFront2=35 -DtotalPictureCountFront3=35 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\LG_K41S_%mydate%_%mytime%_%Qual_Capacity%.txt
