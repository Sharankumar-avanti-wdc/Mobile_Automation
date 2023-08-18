@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%
 
cd C:\Users\sandisk\Android11\Realme_8s_5G_RMX3381


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationFront=300 -DrecordingDurationFront1=300 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=50 -DtotalPictureCountFront3=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Avanti\Realme_8s_5G_RMX3381_%mydate%_%mytime%_%Qual_Capacity%.txt

