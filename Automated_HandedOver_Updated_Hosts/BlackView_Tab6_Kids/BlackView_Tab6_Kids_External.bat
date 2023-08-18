@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Eclipse_Workspace\BlackView_Tab6_Kids
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DrecordingDurationfront2=580 -DtotalPictureCountRear=150 -DtotalPictureCountRear1=150 -DtotalPictureCountRear2=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=150 -DtotalPictureCountFront1=150 -DtotalPictureCountFront2=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Automatio_Testing_Logs\Blackview_Tab6_Kids_%mydate%_%mytime%_%Qual_Capacity%.txt