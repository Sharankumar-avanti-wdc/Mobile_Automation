@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
rem if not exist  "C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder\"   mkdir C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Folder
 echo %mydate%_%mytime%

cd C:\Users\sandisk\eclipse-workspace\Samsung_Galaxy_A13

mvn -DmountUnmountCycle=1 -DrecordingDurationRear=580 -DrecordingDurationRear1=580 -DrecordingDurationfront=580 -DrecordingDurationfront1=580 -DtotalPictureCountRear=70 -DtotalPictureCountRear1=70 -DtotalPictureCountRear2=70 -DtotalPictureCountRear3=45 -DtotalPictureCountRear4=45 -DTolerance_Level=%Tolerance_Level% -DtotalPictureCountFront=75 -DtotalPictureCountFront1=75 -DtotalPictureCountFront2=75 -DtotalPictureCountFront3=75 -DTolerance_Level=%Tolerance_Level% -DfileName=testngMain.xml clean install >> C:\Users\sandisk\Android11\External_Logs\Test\Samsung_Galaxy_A13_%mydate%_%mytime%_%Qual_Capacity%.txt
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     





 


