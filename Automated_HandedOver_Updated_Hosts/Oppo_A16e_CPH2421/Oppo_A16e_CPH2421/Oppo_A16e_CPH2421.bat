@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Oppo_A16e_CPH2421


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationFront=600 -DrecordingDurationFront1=600 -DtotalPictureCountRear=38 -DtotalPictureCountRear1=38 -DtotalPictureCountRear2=38 -DtotalPictureCountRear3=38 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=38 -DtotalPictureCountFront1=38 -DtotalPictureCountFront2=38 -DtotalPictureCountFront3=38 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Oppo_A16e_CPH2421_%mydate%_%mytime%_%Qual_Capacity%.txt


