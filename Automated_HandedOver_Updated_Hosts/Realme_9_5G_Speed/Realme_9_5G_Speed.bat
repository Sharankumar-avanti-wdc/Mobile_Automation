@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%


cd C:\Users\sandisk\eclipse-workspace\Realme_9_5G_Speed


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationRear2=600 -DrecordingDurationRear3=600 -DrecordingDurationFront=600 -DrecordingDurationFront1=600 -DtotalPictureCountRear=38 -DtotalPictureCountRear1=38 -DtotalPictureCountRear2=38 -DtotalPictureCountRear3=38 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=38 -DtotalPictureCountFront1=38 -DtotalPictureCountFront2=38 -DtotalPictureCountFront3=38 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Realme_9_5G_Speed_%mydate%_%mytime%_%Qual_Capacity%.txt

