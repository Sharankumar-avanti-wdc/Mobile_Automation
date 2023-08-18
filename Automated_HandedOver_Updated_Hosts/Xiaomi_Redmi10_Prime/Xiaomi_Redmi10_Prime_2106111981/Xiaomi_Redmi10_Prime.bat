
 



@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c%%a%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
echo %mydate%_%mytime%

cd C:\Users\7336135\Android11\eclipse-workspace\Xiaomi_Redmi10_Prime_2106111981
REM mvn -DtotalPictureCountRear=3 -DtotalPictureCountRear1=3 -DtotalPictureCountRear2=3 -DtotalPictureCountRear3=3 -DTolerance_Level=%Tolerance_Level% -DfileName=testng9.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\ABC\Xiaomi_Redmi10_Prime_%mydate%_%mytime%_%Qual_Capacity%.txt
REM mvn -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DfileName=testng10F.xml clean install >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_POCO_M3_Pro_5G_%mydate%_%mytime%.txt
REM mvn -DmountUnmountCycle=1 -DrecordingDurationRearExt=180 -DrecordingDurationRearExt1=180 -DrecordingDurationfront=180 -DrecordingDurationfront1=180  -DtotalPictureCountRear=12 -DtotalPictureCountRear1=12  -DtotalPictureCountRear2=12 -DtotalPictureCountRear3=12 -DtotalPictureCountFront=12 -DtotalPictureCountFront1=12 -DtotalPictureCountFront2=12 -DtotalPictureCountFront3=12 -DfileName=testngMain.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Xiaomi_RedmiNote10T_5G_%mydate%_%mytime%_%Qual_Capacity%.txt
mvn -DrecordingDurationRearExt=120 -DrecordingDurationRearExt1=120  -DfileName=testng10.xml clean install  >> C:\Users\7336135\Android11\eclipse-workspace\External_Logs\Test\Xiaomi_Redmi10_Prime_%mydate%_%mytime%_%Qual_Capacity%.txt

