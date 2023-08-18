@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Nokia_G50_5G_TA_1390
mvn -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12 -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountRear4=12 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Nokia_G50_5G_TA_1390_%mydate%_%mytime%_%Qual_Capacity%.txt
