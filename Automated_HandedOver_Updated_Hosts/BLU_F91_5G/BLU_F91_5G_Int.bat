@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\BLU_F91_5G


 
 mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationRear3=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DrecordingDurationFront2=580 -DrecordingDurationFront3=580 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\BLU_F91_5G_%mydate%_%mytime%_%Qual_Capacity%.txt
