@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Motorola_Moto_e20_XT210053


 
 mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DtotalPictureCountRear=300 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=300 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Motorola_Moto_e20_XT210053_%mydate%_%mytime%_%Qual_Capacity%.txt
