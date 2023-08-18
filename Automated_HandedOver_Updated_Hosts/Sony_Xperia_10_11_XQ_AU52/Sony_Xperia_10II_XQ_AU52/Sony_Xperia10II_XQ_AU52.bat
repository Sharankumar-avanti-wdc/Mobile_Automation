
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Sony_Xperia_10II_XQ_AU52
mvn -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationRear4=180 -DrecordingDurationRear5=180 -DfileName=testng10.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Sony_Xperia_10II_XQ_AU52_%mydate%_%mytime%_%Qual_Capacity%.txt
REM -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationRear3=180 -DrecordingDurationRear4=180 -DrecordingDurationRear5=180 -DrecordingDurationRear6=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DrecordingDurationfront3=180 -DtotalPictureCountRear=30 -DtotalPictureCountRear1=30 -DtotalPictureCountRear2=30 -DtotalPictureCountRear3=30 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=30 -DtotalPictureCountFront1=30 -DtotalPictureCountFront2=30 -DtotalPictureCountFront3=30 -DTolerance_Level=%Tolerance_Level%  