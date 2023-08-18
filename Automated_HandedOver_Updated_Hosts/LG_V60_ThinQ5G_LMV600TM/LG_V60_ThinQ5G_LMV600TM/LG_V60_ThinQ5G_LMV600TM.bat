@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\LG_V60_ThinQ5G_LMV600TM


mvn -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580  -DrecordingDurationRear3=580 -DrecordingDurationRear4=580 -DrecordingDurationRear5=580 -DrecordingDurationRear6=580 -DrecordingDurationRear7=580 -DrecordingDurationRear8=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DrecordingDurationFront2=580 -DrecordingDurationFront3=580 -DrecordingDurationFront4=580 -DrecordingDurationFront5=580 -DrecordingDurationFront6=580 -DtotalPictureCountRear=35 -DtotalPictureCountRear1=35 -DtotalPictureCountRear2=35 -DtotalPictureCountRear3=35 -DtotalPictureCountRear4=35 -DtotalPictureCountRear5=35 -DtotalPictureCountRear6=30 -DtotalPictureCountRear7=30 -DtotalPictureCountRear8=30 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\LG_V60_ThinQ5G_LMV600TM_%mydate%_%mytime%_%Qual_Capacity%.txt
