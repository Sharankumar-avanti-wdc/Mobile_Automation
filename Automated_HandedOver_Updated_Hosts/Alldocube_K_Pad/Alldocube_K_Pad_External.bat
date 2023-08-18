@echo off
For /f "tokens=6-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-6 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Alldocube_K_Pad
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180  -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180  -DtotalPictureCountRear=6 -DtotalPictureCountRear1=6 -DtotalPictureCountRear2=6 -DtotalPictureCountRear3=6 -DtotalPictureCountRear4=6 -DtotalPictureCountRear5=6  -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=6 -DtotalPictureCountFront1=6 -DtotalPictureCountFront2=6 -DtotalPictureCountFront3=6 -DtotalPictureCountFront4=6 -DtotalPictureCountFront5=6 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Alldocube_K_Pad_External_%mydate%_%mytime%_%Qual_Capacity%.txt
