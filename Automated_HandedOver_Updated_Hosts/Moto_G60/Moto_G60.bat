@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\7320612\Android11\eclipse-workspace\Moto_G60

 mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DrecordingDurationfront3=180 -DtotalPictureCountRear=10 -DtotalPictureCountRear1=10 -DtotalPictureCountRear2=10 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=10 -DtotalPictureCountFront1=10 -DtotalPictureCountFront2=10 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Motorola_Edge20_Fusion_%mydate%_%mytime%_%Qual_Capacity%.txt

