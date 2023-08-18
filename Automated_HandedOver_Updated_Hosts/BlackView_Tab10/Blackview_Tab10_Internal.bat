@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Eclipse_Workspace\BlackView_Tab10
REM mvn -DrecordingDurationfront=1000 -DrecordingDurationfront1=1000 -DrecordingDurationfront2=1000 -DfileName=testng10F_Int.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_Tab10_%mydate%_%mytime%_%Qual_Capacity%.txt
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DrecordingDurationfront2=580 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install  >> C:\Users\sandisk\Android11\Internal_Logs\Test\Blackview_Tab10_%mydate%_%mytime%_%Qual_Capacity%.txt