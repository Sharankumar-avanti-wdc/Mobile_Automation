@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%


cd C:\Users\sandisk\Android11\Eclipse_Workspace\Sharp_Aquos_R3


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=400 -DrecordingDurationRear1=400 -DrecordingDurationRear2=400 -DrecordingDurationRear3=400 -DrecordingDurationRear4=240 -DrecordingDurationRear5=120 -DrecordingDurationRear6=120 -DrecordingDurationFront=400 -DrecordingDurationFront1=400 -DrecordingDurationFront2=400 -DrecordingDurationFront3=240 -DrecordingDurationFront4=120 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Sharp_Aquos_R3_%mydate%_%mytime%_%Qual_Capacity%.txt

