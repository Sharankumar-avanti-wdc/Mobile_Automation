@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\7320612\Android11\eclipse-workspace\Nokia_G10

mvn -DmountUnmountCycle=1  -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationfront=180  -DtotalPictureCountRear=10 -DtotalPictureCountRear1=10 -DtotalPictureCountRear2=10 -DtotalPictureCountRear3=10 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=10 -DtotalPictureCountFront1=10 -DtotalPictureCountFront2=10 -DtotalPictureCountFront3=10 -DTolerance_Level=%Tolerance_Level%  -DfileName=testng9F.xml clean install >> C:\Users\7320612\Android11\eclipse-workspace\External_Logs\ABC_Iteration\Nokia_G10_%mydate%_%mytime%_%Qual_Capacity%.txt

 