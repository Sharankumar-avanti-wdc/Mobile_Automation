@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%


cd C:\Users\sandisk\eclipse-workspace\Sharp_Aquos_R3


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=240 -DrecordingDurationRear2=240 -DrecordingDurationRear3=240 -DrecordingDurationRear4=240 -DrecordingDurationRear5=120 -DrecordingDurationRear6=120 -DrecordingDurationFront=300 -DrecordingDurationFront1=240 -DrecordingDurationFront2=240 -DrecordingDurationFront3=240 -DrecordingDurationFront4=120 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=50 -DtotalPictureCountFront3=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\Sharp_Aquos_R3_%mydate%_%mytime%_%Qual_Capacity%.txt

