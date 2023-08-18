
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Samsung_Galaxy_A73_5G_SMA736BDS
mvn -DtotalPictureCountRear=3 -DtotalPictureCountRear1=3 -DtotalPictureCountRear2=3 -DtotalPictureCountRear3=3 -DtotalPictureCountRear4=3 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Test\Samsung_Galaxy_A73_5G_SMA736BDS_%mydate%_%mytime%_%Qual_Capacity%.txt
