@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Xiaomi_Poco_M4_Pro_5G
mvn -DtotalPictureCountFront=18 -DtotalPictureCountFront1=18 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DTolerance_Level=%Tolerance_Level%  -DfileName=testng9F.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Xiaomi_Poco_M4_Pro_5G_%mydate%_%mytime%_%Qual_Capacity%.txt
