@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Samsung_Galaxy_Tab_A7_Lite

 mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationfront=300  -DtotalPictureCountRear=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_Tab_A7_Lite_%mydate%_%mytime%_%Qual_Capacity%.txt
