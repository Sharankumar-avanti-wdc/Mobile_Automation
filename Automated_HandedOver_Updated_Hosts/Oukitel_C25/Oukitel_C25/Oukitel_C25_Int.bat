@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Oukitel_C25






 mvn  -DmountUnmountCycle=1 -DrecordingDurationRear_Int=580 -DrecordingDurationRear_Int1=580 -DrecordingDurationRear_Int2=580 -DrecordingDurationFront_Int=580 -DrecordingDurationFront_Int1=580 -DrecordingDurationFront_Int2=580 -DtotalPictureCountRear_Int=50 -DtotalPictureCountRear_Int1=50 -DtotalPictureCountRear_Int2=50 -DtotalPictureCountRear_Int3=50 -DtotalPictureCountRear_Int4=50 -DtotalPictureCountRear_Int5=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront_Int=50 -DtotalPictureCountFront_Int1=50 -DtotalPictureCountFront_Int2=50 -DtotalPictureCountFront_Int3=50 -DtotalPictureCountFront_Int4=50 -DtotalPictureCountFront_Int5=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install >> C:\Users\sandisk\Android11\Internal_Logs\Test\Oukitel_C25_%mydate%_%mytime%_%Qual_Capacity%.txt

REM mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580 -DrecordingDurationFront=580 -DrecordingDurationFront1=580 -DrecordingDurationFront2=580 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DtotalPictureCountRear5=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=50 -DtotalPictureCountFront3=50 -DtotalPictureCountFront4=50 -DtotalPictureCountFront5=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Oukitel_C25_%mydate%_%mytime%_%Qual_Capacity%.txt
