@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Motorola_Moto_G22_XT22312
 mvn -DmountUnmountCycle=1 -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationRear2=600 -DrecordingDurationfront=600 -DrecordingDurationfront1=600 -DrecordingDurationfront2=600 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=150 -DtotalPictureCountFront1=150 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Motorola_Moto_G22_XT22312_%mydate%_%mytime%_%Qual_Capacity%.txt
REM -DfileName=testng8.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Motorola_Moto_G22_XT22312_%mydate%_%mytime%_%Qual_Capacity%.txt