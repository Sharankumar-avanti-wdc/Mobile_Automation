@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Umidigi_Bison_GT2Pro_RP02
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationRear3=580 -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DrecordingDurationfront2=580 -DrecordingDurationfront3=580 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DtotalPictureCountRear5=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=18 -DtotalPictureCountFront1=18  -DtotalPictureCountFront2=18 -DtotalPictureCountFront3=18 -DtotalPictureCountFront4=12 -DtotalPictureCountFront5=12 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Umidigi_Bison_GT2Pro_RP02_%mydate%_%mytime%_%Qual_Capacity%.txt