
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Samsung_Galaxy_A23_SMA235F1DS
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationfront=300 -DrecordingDurationfront1=300 -DtotalPictureCountRear=18 -DtotalPictureCountRear1=18 -DtotalPictureCountRear2=3 -DtotalPictureCountRear3=3 -DtotalPictureCountRear4=3 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=12 -DtotalPictureCountFront1=3 -DtotalPictureCountFront2=3 -DtotalPictureCountFront3=3 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Samsung_Galaxy_A23_SMA235F1DS_%mydate%_%mytime%_%Qual_Capacity%.txt
