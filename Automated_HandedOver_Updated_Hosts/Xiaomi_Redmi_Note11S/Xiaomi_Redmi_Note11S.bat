@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\7320612\Android11\eclipse-workspace\Xiaomi_Redmi_Note11S

mvn -DrecordingDurationfront=20 -DrecordingDurationfront1=120  -DfileName=testng10F.xml clean install >> C:\Users\7320612\Android11\eclipse-workspace\External_Logs\ABC_Iteration1\Xiaomi_Poco_M3_%mydate%.txt




REM mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=240 -DrecordingDurationfront=300 -DrecordingDurationfront1=240 -DtotalPictureCountRear=100 -DtotalPictureCountRear1=100 -DtotalPictureCountRear2=100 -DtotalPictureCountRear3=75 -DtotalPictureCountFront=100 -DtotalPictureCountFront1=100 -DtotalPictureCountFront2=100 -DtotalPictureCountFront3=75   -DfileName=testngMain.xml clean install