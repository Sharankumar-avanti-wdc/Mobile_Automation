package LG_V60_ThinQ5G_LMV600TM;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import io.appium.java_client.android.AndroidElement;

public class Test10F
{
	private static final String Pass = null;
	// initializing the driver instance and declarind desired capabilities
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "V60 ThinQ 5G");
		dc.setCapability(MobileCapabilityType.UDID, "LMV600TMf10a3580");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void frontVideoRec() throws InterruptedException, SecurityException, IOException {


		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test10F.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test:Start");  
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10F Scenario is as follows");
		logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback front Highest recorded video for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F Scenario is as follows");
		System.out.println("Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		TimeUnit.SECONDS.sleep(5);
		((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			//TimeUnit.SECONDS.sleep(5);
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test0 Pass for clearing Recent apps ");
			System.out.println("Pass: Test0 Pass for clearing Recent apps ");
		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch Camera Application for front camera video recording
		try {

			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording"); 
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));

			try 
			{ 
				driver.findElement(By.xpath("//*[@text='Next']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='Done']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 

			}
			try 
			{ 
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);	
			} 
			catch(Exception exp)
			{ 
				
				logger.info("change to SD card element not found : "+exp); 

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Test10F_Fcam_res: 6 resolutions supported");
			System.out.println("Test10F_Fcam_res: 6 resolutions supported");
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select front Camera
			logger.info("Click On Settings option to select front camera");
			System.out.println("Click On Settings option to select frontvideocamera");
			TouchAction touchAction0 = new TouchAction(driver);
			touchAction0.tap(PointOption.point(870, 2072)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings and set uSD card as storage option
			logger.info("Click On Settings and set uSD card as storage option");
			System.out.println("Click On Settings and set uSD card as storage option");
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);

			//select Data  storage option
			logger.info("Select storage location option");
			System.out.println("Select storage location option");
			driver.findElement(By.xpath("//*[@text='Storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			

			//Select uSD card as storage option
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Click On Settings option to select front video resolution
			logger.info("Click On Settings option to select front video resolution");
			System.out.println("Click On Settings option to select frontvideo resolution");
			TouchAction touchAction2 = new TouchAction(driver);
			touchAction2.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select 1st resolution
			logger.info("Select 1st front video Resolution: FHD 16:9 1920x1080");
			System.out.println("Select 1st front video resolution: FHD 16:9 1920x1080");
			driver.findElement(By.xpath("//*[@bounds='[179,690][641,756]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront = prop.getProperty("recordingDurationFront");  
			System.out.println("recordingDurationFront = "+ recordingDurationFront);
			int recordingDurationFrontInt=Integer.parseInt(recordingDurationFront);	

			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction11 = new TouchAction(driver);
			touchAction11.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);

			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFrontInt);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction21 = new TouchAction(driver);
			touchAction21.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select front video resolution
			logger.info("Click On Settings option to select front video resolution");
			System.out.println("Click On Settings option to select frontvideo resolution");
			TouchAction touchAction3 = new TouchAction(driver);
			touchAction3.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select 1st resolution
			logger.info("Select 2nd front video Resolution: HD FullVision 1600x720");
			System.out.println("Select 2nd front  video resolution: HD FullVision 1600x720");
			driver.findElement(By.xpath("//*[@bounds='[179,976][703,1042]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront1 = prop.getProperty("recordingDurationFront1");  
			System.out.println("recordingDurationFront1 = "+ recordingDurationFront1);
			int recordingDurationFront1Int=Integer.parseInt(recordingDurationFront1);	

			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction12 = new TouchAction(driver);
			touchAction12.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);

			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront1Int);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction22 = new TouchAction(driver);
			touchAction22.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select front video resolution
			logger.info("Click On Settings option to select front video resolution");
			System.out.println("Click On Settings option to select frontvideo resolution");
			TouchAction touchAction4 = new TouchAction(driver);
			touchAction4.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select 1st resolution
			logger.info("Select 3rd front video Resolution: HD 16:9 1280x720");
			System.out.println("Select 3rd front video resolution: HD 16:9 1280x720");
			driver.findElement(By.xpath("//*[@bounds='[179,833][586,899]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront2 = prop.getProperty("recordingDurationFront2");  
			System.out.println("recordingDurationFront2 = "+ recordingDurationFront2);
			int recordingDurationFront2Int=Integer.parseInt(recordingDurationFront2);	

			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction13 = new TouchAction(driver);
			touchAction13.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront2Int);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction23 = new TouchAction(driver);
			touchAction23.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select front video resolution
			logger.info("Click On Settings option to select front video resolution");
			System.out.println("Click On Settings option to select frontvideo resolution");
			TouchAction touchAction5 = new TouchAction(driver);
			touchAction5.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 4th front video Resolution: 16:9 FHD (60fps) 1920x1080");
			System.out.println("Select 4th front  video resolution: 16:9 FHD (60fps) 1920x1080");
			driver.findElement(By.xpath("//*[@bounds='[179,547][813,613]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront3 = prop.getProperty("recordingDurationFront3");  
			System.out.println("recordingDurationFront3 = "+ recordingDurationFront3);
			int recordingDurationFront3Int=Integer.parseInt(recordingDurationFront3);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction14 = new TouchAction(driver);
			touchAction14.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront3Int);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction24 = new TouchAction(driver);
			touchAction24.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select front video resolution
			logger.info("Click On Settings option to select front video resolution");
			System.out.println("Click On Settings option to select frontvideo resolution");
			TouchAction touchAction6 = new TouchAction(driver);
			touchAction6.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 5th front video Resolution: 16:9 4K 3840x2160");
			System.out.println("Select 5th front video resolution: 16:9 4K 3840x2160");
			driver.findElement(By.xpath("//*[@bounds='[179,404][606,470]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront4 = prop.getProperty("recordingDurationFront4");  
			System.out.println("recordingDurationFront4 = "+ recordingDurationFront4);
			int recordingDurationFront4Int=Integer.parseInt(recordingDurationFront4);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction15 = new TouchAction(driver);
			touchAction15.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront4Int);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction25 = new TouchAction(driver);
			touchAction25.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select front video resolution
			logger.info("Click On Settings option to select front video resolution");
			System.out.println("Click On Settings option to select frontvideo resolution");
			TouchAction touchAction7 = new TouchAction(driver);
			touchAction7.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 6th front video Resolution: 16:9 4K (60fps) 3840x2160");
			System.out.println("Select 6th front video resolution: 16:9 4K (60fps) 3840x2160");
			driver.findElement(By.xpath("//*[@bounds='[179,261][778,327]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop5 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront5 = prop.getProperty("recordingDurationFront5");  
			System.out.println("recordingDurationFront5 = "+ recordingDurationFront5);
			int recordingDurationFront5Int=Integer.parseInt(recordingDurationFront5);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction16 = new TouchAction(driver);
			touchAction16.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront5Int);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings option to select front Camera
			logger.info(" select back camera");
			System.out.println(" select back camera");
			TouchAction touchAction111 = new TouchAction(driver);
			touchAction111.tap(PointOption.point(870, 2072)).perform();
			TimeUnit.SECONDS.sleep(3);
			logger.info("select photo mode");
			System.out.println("select photo mode");
			TouchAction touchAction9 = new TouchAction(driver);
			touchAction9.tap(PointOption.point(766, 1870)).perform();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));

			logger.info("Pass: Test10F pass for front camera video recording");
			System.out.println("Pass: Test10F pass for front camera video recording");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Launch File manager
			//launch file manager application and verify recorded video files in uSD card
			logger.info("Launch File Manager Application to verify captured videos");
			System.out.println("Launch File Manager Application to verify captured videos");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Scroll up and select uSD Card
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Scroll Up to find DCIM Folder
			logger.info("swipe up and search for dcim");
			System.out.println("swipe up and search for dcim");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
			//Search For DCIM Folder 
			logger.info("Select DCIM Folder");
			System.out.println("Select DCIM Folder");
			driver.findElement(By.xpath("//*[@text='DCIM']")).click();
			TimeUnit.SECONDS.sleep(5);		
			//Search For Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			driver.findElement(By.xpath("//*[@text='Camera']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click More Options
			logger.info("Select More Options ");
			System.out.println("Select More Options ");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);

			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='6 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Test10F_Fcam_video: 6 Videos captured successfull");
			System.out.println("Test10F_Fcam_video: 6 Videos captured successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Calling VideoPlayBackForSleepWake()");
			System.out.println("Calling VideoPlayBackForSleepWake()");
			VideoPlayBackForSleepWake();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			TimeUnit.SECONDS.sleep(2);
		}
		catch (Exception e) {
			logger.info("Fail: Test10F for Front camera video recording");
			logger.info("Final Message: Fail Test10F Fail fro Front camera video recording");
			logger.info("Calling Data move operation");
			System.out.println("Calling Data move operation");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Fail: Test10F for Front camera video recording");
			System.out.println("Final Message: Fail Test10F Fail for Front camera video recording");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}	

	}
	@SuppressWarnings("deprecation")
	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException{	   

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test0 Pass for clearing Recent apps ");
			System.out.println("Pass: Test0 Pass for clearing Recent apps ");
		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		logger.info("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		System.out.println("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			////Scroll Up to find SD card option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
			TimeUnit.SECONDS.sleep(5);
			Ext.click();

			////Scroll Up to find DCIM Folder
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));

			//Select DCIM Folder	
			logger.info("Select DCIM Folder");
			System.out.println("//Select DCIM Folder");
			MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);

			//Select  Camera	
			logger.info("Select Camera");
			System.out.println("//Select camera");
			MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
			Camera.click();
			TimeUnit.SECONDS.sleep(3);

			//Select more options
			logger.info("select more options");
			System.out.println("select more options");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions.click();

			//Select Sort By 
			logger.info("Select Sort BY");
			System.out.println("Select Sort BY");
			MobileElement Sortby = driver.findElement(By.xpath("//*[@text='Sort by']")); 
			Sortby.click();
			TimeUnit.SECONDS.sleep(3);

			//Select Largest First
			logger.info("Select Newest date first");
			System.out.println("Select Newest date first");  
			MobileElement Largest = driver.findElement(By.xpath("//*[@text='Newest date first']")); 
			Largest.click();
			TimeUnit.SECONDS.sleep(3);

			//Select Highest resolution video file to play
			logger.info("Click on first file to play highest recorded resolution video file");
			System.out.println("Click on first file to play highest recorded resolution video file");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
			TimeUnit.SECONDS.sleep(20);

			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			//  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Locking Mobile
			//Locking Mobile
			logger.info("Lock Mobile with 30 seconds delay");
			System.out.println("Lock Mobile with 30 seconds delay");
			// ((AndroidDriver) driver).lockDevice();
			TimeUnit.SECONDS.sleep(30);

			//Unlocking Device 
			logger.info("Wait For 30Seconds");
			System.err.println("Wait For 30Seconds");
			// ((AndroidDriver) driver).unlockDevice();
			TimeUnit.SECONDS.sleep(5);
			//Unlocking Device 
			logger.info("Unlock Mobile ");
			System.out.println("Unlock Mobile");
			//driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(30);

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
			System.out.println("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling DataMoveOperation
			logger.info("Calling Data Move Operation");
			System.out.println("Calling Data Move Operation");
			DataMoveOperation();

			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test10 Fail for Data Move Operation");
				logger.info("Final Message: Fail Test10 Fail for Data Move Operation");
			}
			else {
				logger.info("Final Message: Pass Test10F Pass for Pause Video Playback");
				System.out.println("Final Message: Pass Test10F Pass for Pause Video Playback");
			}

		}
		catch (Exception e) {
			logger.info("Fail: Test10F Fail for VideoPlayBackForSleepWake()");
			System.out.println("Fail: Test10F Fail for VideoPlayBackForSleepWake() ");
			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
			System.out.println("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

		logger.info("Test: End");
		System.out.println("Test: End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
	public void DataMoveOperation() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		isPaused = true;
		try {
			logger.info("Re-launch file manager application and select external storage for data move operation, select all rear camera videos present in camera folder and move to Test10 folder");
			System.out.println("Re-launch file manager application and select external storage for data move operation, select all rear camera videos present in camera folder and move to Test10 folder");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
			//Click  Move to Option
			logger.info("Select uSD Card");
			System.out.println("select uSD Card");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Name folder as Test10F");
			System.out.println("Name folder as Test10F");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10F");
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
			logger.info("Test10F: Data move operation completed successfully");
			System.out.println("Test10F: Data move operation completed successfully");
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
				Result = "Pass";
				logger.info("Pass: Test10F Pass for data move operation successfully");	
				System.out.println("Pass: Test10F Pass for data move operation successfully");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			/*if(Result == "Pass")
				{
					logger.info("Pass: Test10 Datamove of videos files operation completed successfully");
					System.out.println("Pass: Test10 Datamove of videos files operation completed successfully");
				}
				else
				{*/
			Result = "Fail";
			logger.info("Fail: Test10F Fail for data move operation ");
			System.out.println("Fail: Test10F Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}




}


