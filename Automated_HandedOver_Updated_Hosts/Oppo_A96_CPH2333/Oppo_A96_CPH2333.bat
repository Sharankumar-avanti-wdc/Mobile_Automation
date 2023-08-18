@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Oppo_A96_CPH2333

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationFront=300 -DrecordingDurationFront1=300 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DtotalPictureCountRear3=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DtotalPictureCountFront3=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\Oppo_A96_CPH2333_%mydate%_%mytime%_%Qual_Capacity%.txt


