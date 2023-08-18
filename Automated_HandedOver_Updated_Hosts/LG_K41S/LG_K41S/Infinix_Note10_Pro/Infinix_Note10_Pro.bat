@echo off
 For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
 For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
 echo %mydate%_%mytime%




cd C:\Users\7340193\Android11Eclipse\Infinix_Note10_Pro

REM mvn -DfileName=testng0_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt
mvn -DmountUnmountCycle=1  -DfileName=testng3_Int.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DfileName=testng18.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DfileName=testng8.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationRear2=300 -DfileName=testng10.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationFront=300 -DrecordingDurationFront1=300 -DrecordingDurationFront2=300 -DfileName=testng10F.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DtotalPictureCountRear=4 -DtotalPictureCountRear1=4 -DtotalPictureCountRear2=4 -DtotalPictureCountRear3=4 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt 
REM mvn -DtotalPictureCountFront=4 -DtotalPictureCountFront1=4 -DtotalPictureCountFront2=4 -DtotalPictureCountFront3=4 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9F.xml clean install >> C:\Users\7340193\Android11Eclipse\External_Logs\Test\Infinix_Note10_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt

