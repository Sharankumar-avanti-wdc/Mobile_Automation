
@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%
 
cd C:\Users\sandisk\Android11\Samsung_GalaxyA72

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationRear2=300 -DrecordingDurationRear3=300 -DrecordingDurationfront=300 -DrecordingDurationfront1=300 -DrecordingDurationfront2=300 -DrecordingDurationfront3=200 -DtotalPictureCountRear=30 -DtotalPictureCountRear1=30 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DtotalPictureCountRear4=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=30 -DtotalPictureCountFront1=30 -DtotalPictureCountFront2=30 -DtotalPictureCountFront3=30 -DtotalPictureCountFront4=30 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Avanti\Samsung_Galaxy_A72SMA725F_DS_%mydate%_%mytime%_%Qual_Capacity%.txt