
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Realme_Narzo50_RMX3286

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\VerificationHosts\Realme_Narzo50_RMX3286_%mydate%_%mytime%_%Qual_Capacity%.txt
