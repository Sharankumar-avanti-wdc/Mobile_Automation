@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Nokia_T20
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationfront=580 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DTolerance_Level=%Tolerance_Level%  -DfileName=testngMain_Int.xml clean install  >> C:\Users\sandisk\Android11\Internal_Logs\AutomationTest\Nokia_T20_%mydate%_%mytime%_%Qual_Capacity%.txt