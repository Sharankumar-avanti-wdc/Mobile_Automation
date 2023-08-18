@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\UMIDIGI_A11S
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=100 -DrecordingDurationRear1=100 -DrecordingDurationRear2=100 -DrecordingDurationfront=100 -DrecordingDurationfront1=100 -DrecordingDurationfront2=100 -DtotalPictureCountRear=10 -DtotalPictureCountRear1=10 -DtotalPictureCountRear2=10 -DtotalPictureCountRear3=10 -DtotalPictureCountRear4=10 -DtotalPictureCountRear5=10 -DtotalPictureCountRear6=10 -DtotalPictureCountRear7=10 -DtotalPictureCountRear9=10 -DTolerance_Level=%Tolerance_level% -DtotalPictureCountFront=10 -DtotalPictureCountFront1=10 -DtotalPictureCountFront2=10 -DtotalPictureCountFront3=10 -DtotalPictureCountFront4=10 -DtotalPictureCountFront5=10 -DtotalPictureCountFront6=10 -DtotalPictureCountFront7=10 -DTolerance_Level=%Tolerance_level%  -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\UMIDIGI_A11S_MP01_%mydate%_%mytime%_%Qual_Capacity%.txt