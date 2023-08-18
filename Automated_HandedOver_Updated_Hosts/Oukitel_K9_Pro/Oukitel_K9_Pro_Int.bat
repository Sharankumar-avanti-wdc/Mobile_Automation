@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Oukitel_K9_Pro






 mvn  -DmountUnmountCycle=1 -DrecordingDurationRear_Int=580 -DrecordingDurationRear_Int1=580 -DrecordingDurationRear_Int2=580 -DrecordingDurationRear_Int3=580 -DrecordingDurationFront_Int=580 -DrecordingDurationFront_Int1=580 -DrecordingDurationFront_Int2=580 -DrecordingDurationFront_Int3=580 -DtotalPictureCountRear_Int=75 -DtotalPictureCountRear_Int1=75 -DtotalPictureCountRear_Int2=75 -DtotalPictureCountRear_Int3=75 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront_Int=75 -DtotalPictureCountFront_Int1=75 -DtotalPictureCountFront_Int2=75 -DtotalPictureCountFront_Int3=75  -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install >> C:\Users\sandisk\Android11\Internal_Logs\Test\Oukitel_K9_Pro_%mydate%_%mytime%_%Qual_Capacity%.txt

