@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Umidigi_A13S_MP05
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationRear2=580  -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DrecordingDurationfront2=580 -DtotalPictureCountRear=40 -DtotalPictureCountRear1=40 -DtotalPictureCountRear2=40 -DtotalPictureCountRear3=30 -DtotalPictureCountRear4=30 -DtotalPictureCountRear5=30 -DtotalPictureCountRear6=30 -DtotalPictureCountRear7=30 -DtotalPictureCountRear8=30 -DTolerance_Level=%Tolerance_Level%  -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=40 -DtotalPictureCountFront3=40 -DtotalPictureCountFront4=40 -DtotalPictureCountFront5=40 -DtotalPictureCountFront6=40 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\MobileTeam\Umidigi_A13S_MP05_%mydate%_%mytime%_%Qual_Capacity%.txt
