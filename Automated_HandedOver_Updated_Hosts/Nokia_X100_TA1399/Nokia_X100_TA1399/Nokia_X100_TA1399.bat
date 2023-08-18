@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Nokia_X100_TA1399


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=360 -DrecordingDurationRear1=360 -DrecordingDurationRear2=360  -DrecordingDurationRear3=360 -DrecordingDurationRear4=360 -DrecordingDurationRear5=360 -DrecordingDurationRear6=360 -DrecordingDurationRear7=360 -DrecordingDurationRear8=360 -DrecordingDurationFront=360 -DrecordingDurationFront1=360 -DrecordingDurationFront2=360  -DrecordingDurationFront3=360  -DtotalPictureCountRear=60 -DtotalPictureCountRear1=60 -DtotalPictureCountRear2=60 -DtotalPictureCountRear3=60 -DtotalPictureCountRear4=60 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=60 -DtotalPictureCountFront1=60 -DtotalPictureCountFront2=60 -DtotalPictureCountFront3=60 -DtotalPictureCountFront4=60 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Nokia_X100_TA1399_%mydate%_%mytime%_%Qual_Capacity%.txt
