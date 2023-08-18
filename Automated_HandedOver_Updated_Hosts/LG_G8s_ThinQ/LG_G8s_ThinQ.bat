
@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\LG_G8s_ThinQ


mvn  -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationRear3=580 -DrecordingDurationRear4=580 -DrecordingDurationRear5=380 -DrecordingDurationfront=380 -DrecordingDurationfront1=580 -DrecordingDurationfront2=580 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=40 -DtotalPictureCountRear4=40 -DtotalPictureCountRear5=35 -DtotalPictureCountRear6=30 -DtotalPictureCountRear7=20 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75  -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\LG_G8s_ThinQ_%mydate%_%mytime%_%Qual_Capacity%.txt
