@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Umidigi_Bison_X10GNFC_RP05
mvn -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DfileName=testng10F_Int.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Umidigi_Bison_X10GNFC_RP05_%mydate%_%mytime%_%Qual_Capacity%.txt