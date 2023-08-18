
 @echo off
 For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
 For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
 if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
  echo %mydate%_%mytime%
 
cd C:\Users\sandisk\Android11\Realme_8_RMX3085

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=300 -DrecordingDurationRear2=240 -DrecordingDurationFront=600 -DrecordingDurationFront1=540 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DtotalPictureCountRear3=100 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DtotalPictureCountFront3=100 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Test\Realme_8_RMX3085_%mydate%_%mytime%_%Qual_Capacity%.txt