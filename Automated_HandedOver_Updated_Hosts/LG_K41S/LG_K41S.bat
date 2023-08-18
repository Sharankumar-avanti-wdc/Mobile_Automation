@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%
  
cd C:\Users\sandisk\Android11\LG_K41S


mvn -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationRear2=300 -DrecordingDurationFront=300 -DrecordingDurationFront1=300 -DrecordingDurationFront2=300 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DtotalPictureCountRear5=50 -DtotalPictureCountRear6=50 -DtotalPictureCountRear7=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DtotalPictureCountFront3=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\LG_K41S_%mydate%_%mytime%_%Qual_Capacity%.txt
