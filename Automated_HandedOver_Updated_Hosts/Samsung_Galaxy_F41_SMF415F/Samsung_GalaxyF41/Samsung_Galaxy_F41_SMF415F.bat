@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%



cd C:\Users\7336135\Android11\eclipse-workspace\Samsung_GalaxyF41
 mvn   -DfileName=testng0.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Samsung_Galaxy_F41_SMF415F_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DmountUnmountCycle=1 -DrecordingDurationRear=180 -DrecordingDurationRear1=180 -DrecordingDurationRear2=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180 -DrecordingDurationfront2=180 -DtotalPictureCountRear=10 -DtotalPictureCountRear1=10 -DtotalPictureCountRear2=10 -DtotalPictureCountRear3=30 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=10 -DtotalPictureCountFront1=10 -DtotalPictureCountFront2=10 -DtotalPictureCountFront3=30 -DTolerance_Level=%Tolerance_Level%  -DfileName=testngMain.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Samsung_Galaxy_F41_SMF415F_%mydate%_%mytime%_%Qual_Capacity%.txt