@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\UMIDIGI_A11S
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=560 -DrecordingDurationRear1=560 -DrecordingDurationRear2=560 -DrecordingDurationfront=560 -DrecordingDurationfront1=560 -DrecordingDurationfront2=560 -DtotalPictureCountRear=34 -DtotalPictureCountRear2=34 -DtotalPictureCountRear3=34 -DtotalPictureCountRear4=34 -DtotalPictureCountRear5=34 -DtotalPictureCountRear6=34 -DtotalPictureCountRear7=34 -DtotalPictureCountRear8=34 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=44 -DtotalPictureCountFront1=44 -DtotalPictureCountFront2=44 -DtotalPictureCountFront3=44 -DtotalPictureCountFront4=44 -DtotalPictureCountFront5=44 -DtotalPictureCountFront6=44 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install  >> C:\Users\sandisk\Android11\Internal_Logs\AutomationTest\UMIDIGI_A11S_%mydate%_%mytime%_%Qual_Capacity%.txt