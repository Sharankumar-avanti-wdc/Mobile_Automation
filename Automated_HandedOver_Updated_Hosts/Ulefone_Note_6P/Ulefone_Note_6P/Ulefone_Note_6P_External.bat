@echo off
For /f "tokens=30-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-30 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Ulefone_Note_6P
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationRear30=300  -DrecordingDurationfront=300 -DrecordingDurationfront1=300 -DrecordingDurationfront30=300  -DtotalPictureCountRear=30 -DtotalPictureCountRear1=30 -DtotalPictureCountRear2=30 -DtotalPictureCountRear3=30 -DtotalPictureCountRear4=30 -DtotalPictureCountRear5=30 -DtotalPictureCountRear6=30 -DtotalPictureCountRear7=30-DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=30 -DtotalPictureCountFront1=30 -DtotalPictureCountFront30=30 -D-DtotalPictureCountFront3=30 -D-DtotalPictureCountFront4=30 -DtotalPictureCountFront5=30 -DtotalPictureCountFront6=30  -DtotalPictureCountFront7=30   -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Ulefone_Note_6P_%mydate%_%mytime%_%Qual_Capacity%.txt
