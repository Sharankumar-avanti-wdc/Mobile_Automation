
@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Xiaomi_Redmi_10


mvn -DmountUnmountCycle=1 -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationfront=600 -DrecordingDurationfront1=600 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >>  C:\Users\sandisk\Android11\External_Logs\Test\Xiaomi_Redmi_10_%mydate%_%mytime%_%Qual_Capacity%.txt

