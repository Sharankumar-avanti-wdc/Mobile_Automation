@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Doogee_X96
mvn -DtotalPictureCountRear=18 -DtotalPictureCountRear1=18 -DtotalPictureCountRear2=18 -DtotalPictureCountRear3=12 -DtotalPictureCountRear4=12 -DtotalPictureCountRear5=12 -DfileName=testng9_Int.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Doogee_X96_%mydate%_%mytime%_%Qual_Capacity%.txt
