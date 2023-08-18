@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%


cd  C:\Users\sandisk\eclipse-workspace\Xiaomi_Poco_M3

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=240 -DrecordingDurationfront=300 -DrecordingDurationfront1=240 -DtotalPictureCountRear=40 -DtotalPictureCountRear1=40 -DtotalPictureCountRear2=30 -DtotalPictureCountRear3=25 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=40 -DtotalPictureCountFront2=30 -DtotalPictureCountFront3=25 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Xiaomi_Poco_M3_%mydate%_%mytime%_%Qual_Capacity%.txt

