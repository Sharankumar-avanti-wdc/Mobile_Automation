
@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7340193\Android11Eclipse\Oppo_F17

REM mvn -DfileName=testng0.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DmountUnmountCycle=1  -DfileName=testng3.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn   -DfileName=testng18.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DfileName=testng8.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DfileName=testng10.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationFront=300 -DrecordingDurationFront1=300 -DfileName=testng10F.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DtotalPictureCountRear=4 -DtotalPictureCountRear1=4 -DtotalPictureCountRear2=4 -DtotalPictureCountRear3=4 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt
mvn -DtotalPictureCountFront=4 -DtotalPictureCountFront1=4 -DtotalPictureCountFront2=4 -DtotalPictureCountFront3=4 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9F.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\ABC_Iteration1\Oppo_F17_%mydate%_%mytime%_%Qual_Capacity%.txt