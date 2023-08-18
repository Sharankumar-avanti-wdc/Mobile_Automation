
@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Realme_XT_RMX1921



mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=300 -DrecordingDurationRear2=300 -DrecordingDurationFront=580 -DrecordingDurationFront1=300 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=50 -DtotalPictureCountFront3=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\Realme_XT_RMX1921_%mydate%_%mytime%_%Qual_Capacity%.txt