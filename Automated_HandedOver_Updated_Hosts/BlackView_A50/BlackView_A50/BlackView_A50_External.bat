@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\BlackView_A50
mvn -DtotalPictureCountFront=18 -DtotalPictureCountFront1=18 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9F.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_A50_%mydate%_%mytime%_%Qual_Capacity%.txt