@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Blackview_Oscal_C20
mvn -DmountUnmountCycle=1 -DrecordingDurationRear=500 -DrecordingDurationRear1=500 -DrecordingDurationRear2=500 -DrecordingDurationfront=500 -DrecordingDurationfront1=500 -DrecordingDurationfront2=500 -DtotalPictureCountRear=50 -DtotalPictureCountRear1=50 -DtotalPictureCountRear2=50 -DtotalPictureCountRear3=50 -DtotalPictureCountRear4=50 -DtotalPictureCountRear5=50 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=50 -DtotalPictureCountFront1=50 -DtotalPictureCountFront2=50 -DtotalPictureCountFront3=50 -DtotalPictureCountFront4=50 -DtotalPictureCountFront5=50 -DTolerance_Level=%Tolerance_Level%  -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\TEST\Blackview_Oscal_C20_%mydate%_%mytime%_%Qual_Capacity%.txt