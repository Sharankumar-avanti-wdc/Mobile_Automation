@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Xiaomi_Redmi_10_21061119DG
mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=360 -DrecordingDurationRear1=360 -DrecordingDurationRear2=360 -DrecordingDurationFront=360 -DrecordingDurationFront1=360 -DrecordingDurationFront2=360 -DtotalPictureCountRear=75 -DtotalPictureCountRear1=75 -DtotalPictureCountRear2=75 -DtotalPictureCountRear3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testng0.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Xiaomi_Redmi_10_%mydate%_%mytime%_%Qual_Capacity%.txt
