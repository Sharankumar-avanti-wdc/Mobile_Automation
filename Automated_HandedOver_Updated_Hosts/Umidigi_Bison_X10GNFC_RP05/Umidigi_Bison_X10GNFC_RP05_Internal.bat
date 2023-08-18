@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Umidigi_Bison_X10GNFC_RP05
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=560 -DrecordingDurationRear1=560 -DrecordingDurationRear2=560 -DrecordingDurationfront=560 -DrecordingDurationfront1=560 -DrecordingDurationfront2=560 -DtotalPictureCountRear=33 -DtotalPictureCountRear2=33 -DtotalPictureCountRear3=33 -DtotalPictureCountRear4=33 -DtotalPictureCountRear5=33 -DtotalPictureCountRear6=33 -DtotalPictureCountRear7=33 -DtotalPictureCountRear8=33 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=43 -DtotalPictureCountFront1=43 -DtotalPictureCountFront2=43 -DtotalPictureCountFront3=43 -DtotalPictureCountFront4=43 -DtotalPictureCountFront5=43 -DtotalPictureCountFront6=43 -DTolerance_Level=%Tolerance_Level%  -DfileName=testngMain_Int.xml clean install  >> C:\Users\sandisk\Android11\Internal_Logs\AutomationTest\Umidigi_Bison_X10GNFC_RP05_%mydate%_%mytime%_%Qual_Capacity%.txt