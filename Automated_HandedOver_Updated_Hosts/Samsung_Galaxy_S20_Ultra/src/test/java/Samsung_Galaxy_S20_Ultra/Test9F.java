package Samsung_Galaxy_S20_Ultra;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test9F
{
	// initializing the driver instance
	AppiumDriver<MobileElement> driver;
	private String Result;
	private boolean isPaused;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S20 Ultra LTE");
		dc.setCapability(MobileCapabilityType.UDID, "R5CN317QZVF");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void frontPictureCapture() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		//Log File Generating Script
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test9F.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9F Scenario is as follows:");
		logger.info("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		logger.info("2.Move Captured Rear camera images to Test9F folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F Scenario is as follows:");
		System.out.println("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		System.out.println("2.Move Captured Rear camera images to Test9F folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Unlocking Phone if locked
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch home screen
		logger.info("Launch Home screen");
		System.out.println("Launch Home screen");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		// open the recently opened apps screen
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try {
			//Launch Camera Application for Front camera picture Capture for all Host resolutions.
			logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
			//Declare number of front camera resolution
			logger.info("Test9F_Fcam_res: 5 resolutions supported");
			System.out.println("Test9F_Fcam_res: 5 resolutions supported");
			//If Change to SD Card notification pop-up exists select Cancel Option
			logger.info("If change to uSD card pop-up exists select Cancel");
			System.out.println("If change to uSD card pop-up exists select Cancel");
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
				TimeUnit.SECONDS.sleep(2);
			}
			catch(Exception exp)
			{
				// Block of code to handle errors
				logger.info("change to SD card element not found : "+exp);
				System.out.println("change to SD card element not found : "+exp);
			}

			//If Location access Permission appears Click Cancel Option
			logger.info("If Location access Permission Request Pop Exists Click on Cancel. ");
			System.out.println("If Location access Permission Request Pop Exists Click on Cancel. ");
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
				TimeUnit.SECONDS.sleep(2);
			}
			catch(Exception exp)
			{
				// Block of code to handle errors
				logger.info("Location access pop-up  not found : "+exp);
			}
			TimeUnit.SECONDS.sleep(5);
			//Switch to front camera mode
			logger.info("Switch to front camera mode");
			System.out.println("Switch to front camera mode");
			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@bounds='[761,2025][911,2175]']"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToFrontCamera.click();
			//Click settings options
			logger.info("Click Settings option");
			System.out.println("Click Settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@text='Go to Settings']"));
			TimeUnit.SECONDS.sleep(5);
			Settings.click();
			//Swipe Up and Search for Storage Option and Click
			logger.info("Swipe up and select storage location option");
			System.out.println("Swipe up and select storage location option");
			String text = "Storage location";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//1st resolution
			//Select Front Image size
			logger.info("Select Front Image size");
			System.out.println("Select Front Image size");
			MobileElement RearImage = driver.findElement(By.xpath("//*[@text='Ratio']"));
			RearImage.click();
			//Select 1st resolution
			logger.info("Select First front Image Resoution: 3:4 (40MP)");
			System.out.println("Select First front Image Resoution: 3:4 (40MP)");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[120,110][264,254]']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront = prop.getProperty("totalPictureCountFront");
			System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
			int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			int j=0;
			for(j = 0; j < totalPictureCountFrontInt; j++)
			{
				TimeUnit.SECONDS.sleep(2);
				MobileElement ShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
				ShutterButton.click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking First resolution Image: "+j);
				logger.info("clicking First resolution Image: "+j);
			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("front camera first resolution:" + j + " images Captured succesfull");
			System.out.println("front camera first resolution:" + j + " images Captured succesfull" );

			//2nd resolution
			//Select Front Image size
			logger.info("Select Front Image size");
			System.out.println("Select Front Image size");
			MobileElement RearImage1 = driver.findElement(By.xpath("//*[@text='Ratio']"));
			RearImage1.click();
			//Select second  resolution
			logger.info("Select Second resolution: 3:4");
			System.out.println("Select Second resolution 3:4");
			MobileElement SecRes = driver.findElement(By.xpath("//*[@bounds='[294,110][438,254]']"));
			SecRes.click();
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			Properties prop1 = new Properties();
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");
			System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1);
			int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);
			// capture  pics for the selected resolution
			int j1=0;
			logger.info("Start Front Image Capture");
			for(j1 = 0; j1 < totalPictureCountFront1Int; j1++)
			{
				TimeUnit.SECONDS.sleep(2);
				MobileElement ShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
				ShutterButton.click();
				TimeUnit.SECONDS.sleep(2);
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Second resolution Image: "+j1);
				logger.info("clicking Second resolution Image: "+j1);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Front camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("Front camera second resolution:" + j1 + " images Captured succesfull" );

			//3rd resolution
			//Select Front Image size
			logger.info("Select Front Image size");
			System.out.println("Select Front Image size");
			MobileElement RearImage2 = driver.findElement(By.xpath("//*[@text='Ratio']"));
			RearImage2.click();
			//Select third resolution
			logger.info("Select third Image Resoution: 9:16");
			System.out.println("Select third Image Resoution: 9:16");
			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@bounds='[468,110][612,254]']"));
			ThirdRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");
			System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
			int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront2Int; j2++)
			{
				TimeUnit.SECONDS.sleep(2);
				MobileElement ShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
				ShutterButton.click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Third resolution Image: "+j2);
				logger.info("clicking Third resolution Image:"+j2);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Front camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("Front camera third resolution:" + j2 + " images Captured succesfull" );

			//4th resolution
			//Select Front Image size
			logger.info("Select Front Image size");
			System.out.println("Select Front Image size");
			MobileElement RearImage3 = driver.findElement(By.xpath("//*[@text='Ratio']"));
			RearImage3.click();
			//Select fourth resolution
			logger.info("Select fourth resolution: 1:1");
			System.out.println("Select fourth resolution: 1:1");
			MobileElement FourthRes = driver.findElement(By.xpath("//*[@bounds='[642,110][786,254]']"));
			FourthRes.click();
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");
			System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3);
			int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountFront3Int; j3++)
			{
				TimeUnit.SECONDS.sleep(2);
				MobileElement ShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
				ShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking Fourth resolution Image: "+j3);
				logger.info("clicking Fourth resolution Image: "+j3);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera fourth resolution:" + j3 + " images Captured succesfull" );
			logger.info("front camera fourth resolution:" + j3 + " images Captured succesfull" );

			//5th resolution
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Front Image size");
			System.out.println("Select Front Image size");
			MobileElement RearImage4 = driver.findElement(By.xpath("//*[@text='Ratio']"));
			RearImage4.click();
			//Select fifth resolution
			logger.info("Select fifth resolution: Full");
			System.out.println("Select fifth resolution: Full");
			MobileElement FifthRes = driver.findElement(By.xpath("//*[@bounds='[816,110][960,254]']"));
			FifthRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront4 = prop.getProperty("totalPictureCountFront4");
			System.out.println("totalPictureCountFront4 = "+ totalPictureCountFront4);
			int totalPictureCountFront4Int=Integer.parseInt(totalPictureCountFront4);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			int j4=0;
			for(j4 = 0; j4 < totalPictureCountFront4Int; j4++)
			{
				TimeUnit.SECONDS.sleep(2);
				MobileElement ShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
				ShutterButton.click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking fifth resolution Image: "+j4);
				logger.info("clicking fifth resolution Image: "+j4);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera fourth resolution:" + j4 + " images Captured succesfull" );
			logger.info("front camera fourth resolution:" + j4 + " images Captured succesfull" );
			// switch to back camera
			logger.info("Switch to defalut back camera mode");
			System.out.println("Switch to defalut back camera  mode");
			driver.findElement(By.xpath("//*[@bounds='[761,2025][911,2175]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			int TotalCount = j+j1+j2+j3+j4;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			//	driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			Result ="Pass";
			logger.info("Launch file manager application and verify captured images present  in uSD Card");
			System.out.println("Launch file manager application and verify captured images present in uSD Card");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If file manager permission request access accept allow permission
			try
			{
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click Accept & continue");
				System.out.println("Click Accept & continue");
				driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element4 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='SD card']"));
			SDCard.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM2 =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM2.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Camera folder
			logger.info("Select camera folder");
			System.out.println("Select camera folder");
			MobileElement Camera2 =	driver.findElement(By.xpath("//*[@text='Camera']"));
			Camera2.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions4 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions4.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll3 =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll3.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Total Image captured");
			System.out.println("Total Image");
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
			TotalImage.click();
			System.out.print("Test9F_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3);
			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop5 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);
			double TolerancePercentage = Tolerance_LevelInt/100*TotalCount;
			//	System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>(Tolerance_LevelInt/100)*TotalCount)
			{
				logger.info("Pass: Test9F pass for rear Image capture");
				System.out.println("\nPass: Test9F pass for rear Image capture");
				System.out.println("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				//calling DataMoveOperation()
			}
			else {
				logger.info("Fail: Test9F Fail for front camera Image capture");
				System.out.println("\nFail: Test9F Fail for front camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9F Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9F Fail for Data Move Operation");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			else {
				Result= "Pass";
				logger.info("Final message: Pass Test9F Pass for Front camera image capture  successfully");
				System.out.println("Final message: Pass Test9F Pass for Front camera image capture  successfully");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		}
		catch (Exception e) {
			logger.info("Fail: Test9F fail for Fail Count Issue");
			System.out.println("\nFail: Test9F fail for Fail Count Issue");
			logger.info("Fail: Test9F fail for rear Image capture");
			System.out.println("\nFail: Test9F fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			System.out.println("Final message: Fail Test9F for rear camera image capture");
			logger.info("Final message: Fail TestF9 for rear camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException {		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
	isPaused = true;
	try {
		logger.info("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
		System.out.println("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		//Select External Storage
		logger.info("Select external storage");
		System.out.println("Select external storage");
		MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']"));
		Ext.click();
		TimeUnit.SECONDS.sleep(5);
		//Switch to grid view mode
		logger.info("switch to grid view mode and select DCIM  folder");
		System.out.println("switch to grid view mode and select DCIM folder");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select Test1 folder
		logger.info("Select DCIM folder");
		System.out.println("Select DCIM folder");
		MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']"));
		DCIM.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Test_file folder
		logger.info("Select camera  folder");
		System.out.println("Select camera folder");
		MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']"));
		Camera.click();
		TimeUnit.SECONDS.sleep(3);
		//Switch back to list view mode
		logger.info("switch to list view mode ");
		System.out.println("switch to list view mode");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Click More options
		logger.info("Click More options");
		System.out.println("Click More options");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(6);
		//Click Select All
		logger.info("Click Select all");
		System.out.println("Click select all");
		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
		SelectAll.click();
		TimeUnit.SECONDS.sleep(3);
		//Click More options
		logger.info("Click More options");
		System.out.println("Click More options");
		MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions1.click();
		TimeUnit.SECONDS.sleep(6);
		//Click  Move to Option
		logger.info("Select move to option");
		System.out.println("select move to option");
		MobileElement moveto =	driver.findElement(By.xpath("//*[@text='Move to']"));
		moveto.click();
		TimeUnit.SECONDS.sleep(6);
		//Click uSD Card
		logger.info("Select uSD Card");
		System.out.println("select uSD Card");
		MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
		uSD.click();
		TimeUnit.SECONDS.sleep(6);
		//Click ADD NEW Folder option
		logger.info("Select ADD NEW Folder option");
		System.out.println("Select ADD NEW Folder option");
		MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
		CreateFolder.click();
		TimeUnit.SECONDS.sleep(6);
		//set folder name
		logger.info("Name folder as Test9F");
		System.out.println("Name folder as Test9F");
		driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
		driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F");
		TimeUnit.SECONDS.sleep(5);
		//Click Create option
		logger.info("Accept create folder");
		System.out.println("Accept create folder");
		driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
		TimeUnit.SECONDS.sleep(30);
		logger.info("Cut paste  video files operation completed successfully");
		System.out.println("Cut paste  video files operation completed successfully");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		Result = "Pass";
		if(Result == "Pass")
		{
			logger.info("Pass: Test9F Pass for data move operation successfully");
			System.out.println("Pass: Test9F Pass for data move operation successfully");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	catch(Exception exp)
	{
		exp.printStackTrace();
		Result = "Fail";
		logger.info("Fail: Test9F Fail for data move operation ");
		System.out.println("Fail: Test9F Fail for data move operation");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
	}
}