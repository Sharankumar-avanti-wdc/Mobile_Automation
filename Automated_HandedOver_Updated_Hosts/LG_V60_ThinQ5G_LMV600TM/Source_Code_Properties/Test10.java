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

public class Test10
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
	public void rearVideoRec() throws InterruptedException, SecurityException, IOException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test10.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10 Scenario is as follows");
		logger.info("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10 Scenario is as follows");
		System.out.println("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		TimeUnit.SECONDS.sleep(5);
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
		//Launch Camera Application for rear camera video recording
		logger.info("Launch Camera Application for rear camera video recording");
		System.out.println("Launch Camera Application for rear camera video recording");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));

			//If Permission reuest pop-up exists allow permissons
			try 
			{ 
				logger.info("clcik on next");
				System.out.println("clcik on next");
				driver.findElement(By.xpath("//*[@text='Next']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("clcik on done");
				System.out.println("clcik on done");
				driver.findElement(By.xpath("//*[@text='Done']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("clcik on later");
				System.out.println("clcik on later");
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("clcik on later");
				System.out.println("clcik on later");
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp);

			}
			try 
			{ 
				logger.info("clcik on later");
				System.out.println("clcik on later");
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);	
			} 
			catch(Exception exp)
			{ 

				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp);

			}
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			TimeUnit.SECONDS.sleep(2);
			logger.info("Test10_Bcam_res: 8 resolutions supported");
			System.out.println("Test10_Bcam_res: 8 resolutions supported");
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings and set uSD card as storage option
			logger.info("Click On Settings and set uSD card as storage option");
			System.out.println("Click On Settings and set uSD card as storage option");
			TouchAction touchAction0 = new TouchAction(driver);
			touchAction0.tap(PointOption.point(106, 137)).perform();
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
			//Click On Settings and set uSD card as storage option
			logger.info("Click On Settings and set uSD card as storage option");
			System.out.println("Click On Settings and set uSD card as storage option");
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear video resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select First back video Resolution: FHD 16:9 1920x1080");
			System.out.println("Select First Back video resolution: FHD 16:9 1920x1080");
			driver.findElement(By.xpath("//*[@bounds='[179,833][641,899]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			System.out.println("recordingDurationRearExt = "+ recordingDurationRear);
			int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TouchAction touchAction11 = new TouchAction(driver);
			touchAction11.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRearInt);
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
			//Select 2nd Resolution
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction2 = new TouchAction(driver);
			touchAction2.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select second back video Resolution: 16:9 HD 1280x720");
			System.out.println("Select second Back video resolution: 16:9 HD 1280x720");
			driver.findElement(By.xpath("//*[@bounds='[179,976][586,1042]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			System.out.println("recordingDurationRear1 = "+ recordingDurationRear1);
			int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			TouchAction touchAction12 = new TouchAction(driver);
			touchAction12.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
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
			//Select 2nd Resolution
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction3 = new TouchAction(driver);
			touchAction3.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Third back video Resolution:FullVision FHD 2460x1080");
			System.out.println("Select Third Back video resolution: FullVision FHD 2460x1080");
			driver.findElement(By.xpath("//*[@bounds='[179,1119][758,1185]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			System.out.println("recordingDurationRear2 = "+ recordingDurationRear2);
			int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			TouchAction touchAction13 = new TouchAction(driver);
			touchAction13.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear2Int);
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
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction4 = new TouchAction(driver);
			touchAction4.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select 4th back video Resolution:FullVision HD 1640x720");
			System.out.println("Select 4th Back video resolution: FullVision HD 1640x720");
			driver.findElement(By.xpath("//*[@bounds='[179,1262][703,1328]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear3 = prop.getProperty("recordingDurationRear3");  
			System.out.println("recordingDurationRear3 = "+ recordingDurationRear3);
			int recordingDurationRear3Int=Integer.parseInt(recordingDurationRear3);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			TouchAction touchAction14 = new TouchAction(driver);
			touchAction14.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			TimeUnit.SECONDS.sleep(recordingDurationRear3Int);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
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
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction5 = new TouchAction(driver);
			touchAction5.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);

			logger.info("Select 5th back video Resolution:16:9 FHD (60fps) 1920x1080");
			System.out.println("Select 5th Back video resolution: 16:9 FHD (60fps) 1920x1080");
			driver.findElement(By.xpath("//*[@bounds='[179,690][813,756]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear4 = prop.getProperty("recordingDurationRear4");  
			System.out.println("recordingDurationRear4 = "+ recordingDurationRear4);
			int recordingDurationRear4Int=Integer.parseInt(recordingDurationRear4);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			TouchAction touchAction15 = new TouchAction(driver);
			touchAction15.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear4Int);
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
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction6 = new TouchAction(driver);
			touchAction6.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select 6th back video Resolution:16:9 4K 3840x2160");
			System.out.println("Select 6th Back video resolution: 16:9 4K 3840x2160");
			driver.findElement(By.xpath("//*[@bounds='[179,547][606,613]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear5 = prop.getProperty("recordingDurationRear5");  
			System.out.println("recordingDurationRear5 = "+ recordingDurationRear5);
			int recordingDurationRear5Int=Integer.parseInt(recordingDurationRear5);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			TouchAction touchAction16 = new TouchAction(driver);
			touchAction16.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear5Int);
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
			TouchAction touchAction26 = new TouchAction(driver);
			touchAction26.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction7 = new TouchAction(driver);
			touchAction7.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select 7th back video Resolution:16:9 4K (60fps) 3840x2160");
			System.out.println("Select 7th Back video resolution: 16:9 4K (60fps) 3840x2160");
			driver.findElement(By.xpath("//*[@bounds='[179,404][778,470]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear6 = prop.getProperty("recordingDurationRear6");  
			System.out.println("recordingDurationRear6 = "+ recordingDurationRear6);
			int recordingDurationRear6Int=Integer.parseInt(recordingDurationRear6);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			TouchAction touchAction17 = new TouchAction(driver);
			touchAction17.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear6Int);
			//MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StopRecording1.click();
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
			TouchAction touchAction27 = new TouchAction(driver);
			touchAction27.tap(PointOption.point(322, 1867)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			TouchAction touchAction8 = new TouchAction(driver);
			touchAction8.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select 8th back video Resolution:16:9 8K 7680x4320");
			System.out.println("Select 8th Back video resolution: 16:9 8K 7680x4320");
			driver.findElement(By.xpath("//*[@bounds='[179,261][606,327]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear7 = prop.getProperty("recordingDurationRear7");  
			System.out.println("recordingDurationRear7 = "+ recordingDurationRear7);
			int recordingDurationRear7Int=Integer.parseInt(recordingDurationRear7);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			TouchAction touchAction18 = new TouchAction(driver);
			touchAction18.tap(PointOption.point(548, 2067)).perform();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear7Int);
			//MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StopRecording1.click();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
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
			logger.info("Pass: Rear camera video recording is successfull");
			System.out.println("Pass: Rear camera video recording is successfull");
			//launch file manager application and verify recorded video files in uSD card
			logger.info("Launch File Manager Application to verify captured videos");
			System.out.println("Launch File Manager Application to verify captured videos");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Scroll up and select uSD Card
			logger.info("swipe up and search for sd card");
			System.out.println("swipe up and search for sd card");
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
			//Click on Select All 
			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='8 selected']"));
			TotalFiles.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Test10_Bcam_video: 8 Videos captured successfull");
			System.out.println("Test10_Bcam_video: 8 Videos captured successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
			System.out.println("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
			RecordedVideoPlayback();
		}
		catch (Exception e) {
			logger.info("Fail: Test10 Fail for Rear camera video recording ");
			System.out.println("Fail: Test10 Fail for Rear camera video recording ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("==================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================="); 
			//Calling Datamoveoperation()
			logger.info("Calling Data move operation");
			System.out.println("Calling Data move operation");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Fail Test10 Fail for Rear camera video recording");
			System.out.println("Final Message: Fail Test10 Fail for Rear camera video recording");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

	}

	//Calling video playback() for Playing Highest record video, fast forward video play back
	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		//Clearing Recent Apps
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
		try {
			//Launch Camera Application for rear camera video recording
			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//Scroll Up to find SD card option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External Storage");
			System.out.println("Select External Storage");		
			MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
			Ext.click();
			TimeUnit.SECONDS.sleep(5);
			//Scroll Up to find DCIM Folder
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));

			//Select DCIM folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM folder");
			MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select camera folder
			logger.info("Select Camera folder");
			System.out.println("Select Camera folder");
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
			logger.info("Select Largest first");
			System.out.println("Select Largest first");   
			MobileElement Largest = driver.findElement(By.xpath("//*[@text='Largest first']")); 
			Largest.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Highest resolution video file to play
			logger.info("Click on first file to play highest recorded resolution video file");
			System.out.println("Click on first file to play highest recorded resolution video file");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started video playback");
			TimeUnit.SECONDS.sleep(20);

			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();

			//Click Fast forward button
			logger.info("Fast forward video for 10 seconds");
			System.out.println("Fast forward video for 10 seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			logger.info("Pause video playback");
			System.out.println("Pause video playback");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Recorded Video play back and fast forward successfull ");
			System.out.println("Pass: Recorded Video play back and fast forward successfull ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder ");
			logger.info("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
				logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
			}
			else {
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				logger.info("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				CopiedvideosPlayBack();	
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test10 Fail for RecordedVideoPlayBack()");
			System.out.println("Fail: Test10 Fail for RecordedVideoPlayBack()");
			System.out.println("Calling DataMoveOperation() to move all rear camera recorded video files to Test10 folder");
			logger.info("Calling DataMoveOperation() to move all rear camera recorded video files to Test10 folder");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
			System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		//Clearing Recent Apps
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
		try {
			//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
			logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			////Scroll Up to find SD card
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select external storage");
			System.out.println("Select external storage");	
			MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
			TimeUnit.SECONDS.sleep(5);
			Ext.click();

			//MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			//      "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			//     ".scrollIntoView(new UiSelector().text(\"Test1\"))"));
			//Select Test1 folder
			logger.info("Select Test1 folder");
			System.out.println("Select Test1 folder");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test1 folder folder
			logger.info("Select test_filefolder");
			System.out.println("Select test_file folder");
			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
			TestFile.click();
			TimeUnit.SECONDS.sleep(3);
			//Select OneGB folder
			logger.info("Select OneGB folder");
			System.out.println("Select OneGB folder");
			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
			oneGB.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Video folder
			logger.info("Select video folder");
			System.out.println("Select video folder");
			MobileElement Video = driver.findElement(By.xpath("//*[@text='Video']")); 
			Video.click();
			TimeUnit.SECONDS.sleep(3);
			try {
				//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
				System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
				logger.info("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
				MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4\"))"));

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
				logger.info("Started video playback");
				System.out.println("Started video playback");
				TimeUnit.SECONDS.sleep(20);
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
				//Click Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				System.out.println("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				TimeUnit.SECONDS.sleep(20);
				logger.info("Pause video playback");
				System.out.println("Pause video playback");
				logger.info("Pass: 4K Video play back and fast forward is successful ");
				System.err.println("Pass: 4K Video play back and fast forward is successful ");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				
			}
			catch(Exception exp)
			{ 
				logger.info("Fail: Test10 Fail for 4K video play back "+exp); 
				System.out.println("Fail: Test10 Fail for 4K video play back: "+exp); 
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
			TimeUnit.SECONDS.sleep(20);
			try {
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/quick_seek_overlay']")).click();
				//Click Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				System.out.println("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				logger.info("Click pause button to stop video");
				System.out.println("Click pause button to stop video");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: FHD Video play back and fast forward is successful ");
				System.out.println("Pass: FHD Video play back and fast forward is successful ");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
				System.out.println("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");

			}
			catch(Exception exp)
			{ 
				logger.info("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
				System.out.println("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			logger.info("Test:End");
			System.out.println("Test: End");
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
		} 
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Final message: Fail Test10 Fail for Playing Copied Video files  and fast forward video play back scenario ");
			System.out.println("Final message: Fail Test10 Fail for Playing Copied Video files and fast forward video play back scenario ");
			logger.info("Test:End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
	} 
	public void DataMoveOperation() throws  IOException, InterruptedException {
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
			logger.info("Name folder as Test10");
			System.out.println("Name folder as Test10");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10");
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
			logger.info("Test10: Data move operation completed successfully");
			System.out.println("Test10: Data move operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			Result = "Pass";
			if (Result == "Pass")
			{
				logger.info("Pass: Test10 Pass for data move operation successfully");	
				System.out.println("Pass: Test10 Pass for data move operation successfully");	
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			if (Result == "Fail")
			{
				logger.info("Fail: Test10 Fail for data move operation ");
				System.out.println("Fail: Test10 Fail for data move operation");	
			}

		}

	}  	
}




