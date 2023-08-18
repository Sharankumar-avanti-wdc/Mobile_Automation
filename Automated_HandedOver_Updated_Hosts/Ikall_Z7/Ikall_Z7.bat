

@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7340193\Android11Eclipse\Ikall_Z7

mvn -DfileName=testng0_Int.xml clean install  >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DmountUnmountCycle=1  -DfileName=testng3_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn   -DfileName=testng18_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DfileName=testng8_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationRear=120 -DrecordingDurationRear1=120 -DrecordingDurationRear2=120 -DrecordingDurationRear3=120 -DfileName=testng10_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationFront=120 -DrecordingDurationFront1=120 -DrecordingDurationFront2=120 -DrecordingDurationFront3=120 -DfileName=testng10F_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DtotalPictureCountRear=4 -DtotalPictureCountRear1=4 -DtotalPictureCountRear2=4 -DtotalPictureCountRear3=4 -DtotalPictureCountRear4=4 -DtotalPictureCountRear5=4 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DtotalPictureCountFront=4 -DtotalPictureCountFront1=4 -DtotalPictureCountFront2=4 -DtotalPictureCountFront3=4 -DtotalPictureCountFront4=4 -DtotalPictureCountFront5=4 -DtotalPictureCountFront6=4 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9F_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Ikall_Z7_%mydate%_%mytime%_%Qual_Capacity%.txt