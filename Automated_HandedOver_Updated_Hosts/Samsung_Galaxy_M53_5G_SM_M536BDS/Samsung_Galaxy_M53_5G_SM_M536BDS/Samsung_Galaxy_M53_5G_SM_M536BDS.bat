@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\sandisk\Android11\Eclipse_Workspace\Samsung_Galaxy_M53_5G_SM_M536BDS
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=600 -DrecordingDurationRear1=600 -DrecordingDurationRear2=600 -DrecordingDurationRear3=600 -DrecordingDurationFront=600 -DrecordingDurationFront1=600 -DrecordingDurationFront2=600 -DrecordingDurationFront3=600 -DtotalPictureCountRear=30 -DtotalPictureCountRear1=30 -DtotalPictureCountRear2=30 -DtotalPictureCountRear3=30 -DtotalPictureCountRear4=30 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=30 -DtotalPictureCountFront1=30 -DtotalPictureCountFront2=30  -DtotalPictureCountFront3=30 -DtotalPictureCountFront4=30 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install  >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_M53_5G_SM_M536BDS_%mydate%_%mytime%_%Qual_Capacity%.txt
