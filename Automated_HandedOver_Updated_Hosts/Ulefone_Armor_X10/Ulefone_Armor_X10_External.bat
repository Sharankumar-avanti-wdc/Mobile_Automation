@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Ulefone_Armor_X10
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DrecordingDurationfront3=180 -DtotalPictureCountRear=2 -DtotalPictureCountRear1=2 -DtotalPictureCountRear2=2 -DtotalPictureCountRear3=2 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=2 -DtotalPictureCountFront1=2 -DtotalPictureCountFront2=2 -DtotalPictureCountFront3=2 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9F_Int.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Ulefone_Armor_X10_%mydate%_%mytime%_%Qual_Capacity%.txt
