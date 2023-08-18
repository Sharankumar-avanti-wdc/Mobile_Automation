


 @echo off
 For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
 For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
 echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Eclipse_Workspace\Infinix_Hot_11S_X6812

mvn  -DmountUnmountCycle=1 -DrecordingDurationRear_Int=300 -DrecordingDurationRear_Int1=300 -DrecordingDurationRear_Int2=300 -DrecordingDurationFront_Int=300 -DrecordingDurationFront_Int1=300 -DrecordingDurationFront_Int2=300 -DtotalPictureCountRear_Int=50 -DtotalPictureCountRear_Int1=50 -DtotalPictureCountRear_Int2=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront_Int=50 -DtotalPictureCountFront_Int1=50 -DtotalPictureCountFront_Int2=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain_Int.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Automatio_Testing_Logs\Infinix_Hot_11S_X6812_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn  -DmountUnmountCycle=1 -DrecordingDurationRear=300 -DrecordingDurationRear1=300 -DrecordingDurationRear2=300 -DrecordingDurationFront=300 -DrecordingDurationFront1=300 -DrecordingDurationFront2=300 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=50 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Automatio_Testing_Logs\Infinix_Hot_11S_X6812_%mydate%_%mytime%_%Qual_Capacity%.txt
