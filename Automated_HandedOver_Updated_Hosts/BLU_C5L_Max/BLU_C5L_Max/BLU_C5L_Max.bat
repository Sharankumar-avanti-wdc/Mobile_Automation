@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\BLU_C5L_Max


 
mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationFront=580 -DtotalPictureCountRear=300 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=300 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\BLU_C5L_Max_%mydate%_%mytime%_%Qual_Capacity%.txt
