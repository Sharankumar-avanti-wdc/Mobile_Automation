
@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%
 
cd C:\Users\sandisk\Android11\Samsung_GalaxyNote20_Ultra5G

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationRear4=180 -DrecordingDurationRear5=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DrecordingDurationfront3=180 -DrecordingDurationfront4=180   -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=50 -DtotalPictureCountFront3=50   -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>C:\Users\sandisk\Android11\External_Logs\Tests\Samsung_Galaxy_Note20_Ultra_5G_%mydate%_%mytime%_%Qual_Capacity%.txt