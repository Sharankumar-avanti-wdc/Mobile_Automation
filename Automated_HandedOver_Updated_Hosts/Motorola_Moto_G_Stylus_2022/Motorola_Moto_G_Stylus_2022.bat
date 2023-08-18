


 @echo off
 For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
 For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
 echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Motorola_Moto_G_Stylus_2022

mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DrecordingDurationFront2=580 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Motorola_Moto_G_Stylus_2022_%mydate%_%mytime%_%Qual_Capacity%.txt
