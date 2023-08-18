@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Blackview_Oscal_C20
mvn -DmountUnmountCycle=1  -DfileName=testng3_Int.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_Oscal_C20_%mydate%_%mytime%_%Qual_Capacity%.txt