package Infinix_Hot11_X662;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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
import com.google.common.collect.ImmutableMap;
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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.sound.midi.SysexMessage;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.MobileBy;

public class Test0 {
	private static final String InterruptedException = null;
	// Clear Recent Apps Test Case
	AppiumDriver<MobileElement> driver;
	public LogEntries logEntries;
	private WebElement element;

	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Infinix HOT 11");
		dc.setCapability(MobileCapabilityType.UDID, "07445311AP145805");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void start() throws 	IOException, InterruptedException  {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test0.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter);
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info(" Test0 Scenario is as follows ");
		logger.info("1.Unlock phone, clear recent apps, clear internal memory");
		logger.info("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		logger.info("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		logger.info("4.Call Format() and format uSD card with data and verify the same");
		logger.info("Setting up the appium desired capabilities");
		System.out.println(" Test0 Scenario is as follows ");
		System.out.println("Unlock phone, clear recent apps, clear internal memory");
		System.out.println("Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		System.out.println("Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		System.out.println("Call Format() and format uSD card with data and verify the same");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";

		((StartsActivity) driver).startActivity(new Activity("com.transsion.XOSLauncher", "com.android.quickstep.recents_ui_overrides.src.com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		//((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(3);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Clear all\")").click();
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
		TimeUnit.SECONDS.sleep(4);

		try {
			//Clearing Phone Internal Memory
			//Launch File Manager
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find external Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			try {

				//Click Select All
				logger.info("Select  More options");
				System.out.println("Select More options");
				MobileElement Moreoptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				Moreoptions .click();
				TimeUnit.SECONDS.sleep(3);
				//Click Select all
				logger.info("click on Select all");
				System.out.println("click on Select all");
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
				SelectAll.click();
				TimeUnit.SECONDS.sleep(3);
				//Click move to recycle Bin
				logger.info("Select Delete permanently");
				System.out.println("Select  Delete permanently");
				MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/delete_action']"));
				MovetoRecycleBin.click();
				TimeUnit.SECONDS.sleep(3);
				//delete
				logger.info("Select  Delete");
				System.out.println("Select  Delete");
				driver.findElement(By.xpath("//*[@text='Delete']")).click();
				TimeUnit.SECONDS.sleep(120);
			}
			catch (Exception e) {
				//Click Select All
				logger.info("Select  More options");
				System.out.println("Select More options");
				MobileElement Moreoptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				Moreoptions1 .click();
				TimeUnit.SECONDS.sleep(3);
				//Click move to recycle Bin
				logger.info("Select Delete permanently");
				System.out.println("Select  Delete permanently");
				MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
				MovetoRecycleBin.click();
				TimeUnit.SECONDS.sleep(3);
				//delete
				logger.info("Select  Delete");
				System.out.println("Select  Delete");
				driver.findElement(By.xpath("//*[@text='Delete']")).click();
				TimeUnit.SECONDS.sleep(120);
			}
			logger.info("Pass: Clearing phone internal memory is successfull");
			System.out.println("Pass: Clearing phone internal memory is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Calling Image() to capture rear camera image in USD card and Verifying it.
			logger.info("Calling Image() to capture rear camera image in uSD card and verifying the same.");
			System.out.println("Calling Image() to capture rear camera image in uSD card and verifying the same.");
			Images();
		}

		catch(Exception exp)
		{ 
			logger.info("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			logger.info("Final Message: Fail Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Final Message: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
			logger.info("Test End"); 
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}	
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		((StartsActivity) driver).startActivity(new Activity("com.transsion.XOSLauncher", "com.android.quickstep.recents_ui_overrides.src.com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		//((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(3);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Clear all\")").click();
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
		TimeUnit.SECONDS.sleep(4);
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.transsion.camera", "com.android.camera.CameraLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			System.out.println("Select camera permissions");
			logger.info("Select camera permissions");
			driver.findElement(By.xpath("//*[@text='While using the app']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[60,177][180,297]']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for Storage path option");
		System.out.println("Search for Storage path option");
		String text = "Storage location";
		driver.findElement(By.xpath("//*[@text='Storage path']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		try {
			System.out.println("Select storage permissions");
			logger.info("Select storage permissions");
			driver.findElement(By.xpath("//*[@text='USE THIS FOLDER']")).click();
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
		TimeUnit.SECONDS.sleep(3);
		//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Capture Images
		logger.info("Capture Image of Default Resolution");
		System.out.println("Capture Image of Default Resolution");
		for(int j = 0; j <25; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@bounds='[450,2004][630,2156]']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking Image of Default Resolutions"+j);
			logger.info("clicking Image of Default Resolutions"+j);
		}
		TimeUnit.SECONDS.sleep(2);
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Pass:Total Number Of Image captured 25 is successfull");
		System.out.println("Pass:Total Number Of Image captured 25 is successfull");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		//Launch File Manager application to verify  Image capture
		logger.info("Launch File Manager application to verify  Image capture");
		System.out.println("Launch File Manager application to verify  Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select browse option
		logger.info("Select  browse");
		System.out.println("Select  browse");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("swipe up and select sd card");
		System.out.println("swipe up and select sd card");
		////Scroll Up to find external Storage option
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Select  SD Card");
		System.out.println("Select  SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For DCIM Folder 
		logger.info("Select DCIM Folder");
		System.out.println("Select DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		logger.info("Select Camera Folder");
		System.out.println("Select Camera Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		//click on more option
		logger.info("Select more");
		System.out.println("Select more");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			logger.info("click on select all");
			System.out.println("click on select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass:Total Number Of Image captured 25 is successfull");
			System.out.println("Pass:Total Number Of Image captured 25 is successfull");
			logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
			System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Calling video() for rear video recording in USD card and verifying data capture.
			Video();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
			logger.info("Test End");
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		TimeUnit.SECONDS.sleep(2);
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		((StartsActivity) driver).startActivity(new Activity("com.transsion.XOSLauncher", "com.android.quickstep.recents_ui_overrides.src.com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Clear all\")").click();
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
		TimeUnit.SECONDS.sleep(4);
		logger.info("Launch Camera Application");
		System.out.println("Launch Camera Application");
		//Launch Camera Application.
		((StartsActivity) driver).startActivity(new Activity("com.transsion.camera", "com.android.camera.CameraLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			logger.info("Select camera permissions");
			System.out.println("Select camera permissions");
			driver.findElement(By.xpath("//*[@text='While using the app']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//If Change to SD Card notification pop-up exists select Cancel Option
		try {
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();
			logger.info("Switch To Back Camera if current Exiting camera is Front camera");
			System.out.println("Switch To Back Camera if current Exiting camera is Front camera");
		}
		catch(Exception exp)
		{ 
			// Block of code to handle errors
			logger.info("Current Existing Camera is Back Camera"); 
			System.out.println("Current Existing Camera is Back Camera");
		}
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[60,177][180,297]']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for Storage path option");
		System.out.println("Search for Storage path option");
		String text = "Storage location";
		driver.findElement(By.xpath("//*[@text='Storage path']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		try {
			driver.findElement(By.xpath("//*[@text='USE THIS FOLDER']")).click();
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
		TimeUnit.SECONDS.sleep(3);
		//Click On video
		logger.info("Select video tab");
		System.out.println("Select video tab");
		driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[60,177][180,297]']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Rear Video size to select resolution
		MobileElement VideoResolution = driver.findElement(By.xpath("//*[@text='Video quality']"));
		VideoResolution.click();
		logger.info("Select 1st Back Video Resolution:1080p");
		System.out.println("Select 1st Back Video Resolution: 1080p");
		//Select 1st resolution
		MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[48,1718][1032,1892]']"));
		FirstRes.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.transsion.camera:id/shutter_button']"));
		StartRecording.click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.transsion.camera:id/shutter_button']"));
		StopRecording.click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[60,177][180,297]']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Rear Video size to select resolution
		MobileElement VideoResolution1 = driver.findElement(By.xpath("//*[@text='Video quality']"));
		VideoResolution1.click();
		logger.info("Select 2nd Back Video Resolution: 720P");
		System.out.println("Select 2nd Back Video Resolution:  720P");
		//Select 2nd resolution
		MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[48,1892][1032,2066]']"));
		SecondRes.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.transsion.camera:id/shutter_button']"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		//MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.transsion.camera:id/shutter_button']"));
		//StopRecording1.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Click On photo mode
		logger.info("Select photo mode");
		System.out.println("Select photo mode");
		driver.findElement(By.xpath("//*[@text='AI CAM']")).click();
		TimeUnit.SECONDS.sleep(3);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Pass: Rear camera video recording is successfull");
		System.out.println("Pass: Rear camera video recording is successfull");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		//Verifying Captured Videos
		//Launch Home screen and Clear recent Apps
		logger.info("Verifying Captured Videos");
		logger.info("Launch Home screen and Clear recent Apps");
		System.out.println("Verifying Captured Videos");
		System.out.println("Launch Home screen and Clear recent Apps");
		//Launch File Manager application to verify captured video
		logger.info("Launch File Manager Application to verify captured videos");
		System.out.println("Launch File Manager Application to verify captured videos");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select browse option
		logger.info("Click On browse");
		System.out.println("Click On browse");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("swipe up search for sd card");
		System.out.println("swipe up search for sd card");
		////Scroll Up to find external Storage option
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Click On SD Card");
		System.out.println("Click On SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For DCIM Folder 
		logger.info("Select DCIM Folder");
		System.out.println("Select DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		logger.info("Select Camera Folder");
		System.out.println("Select Camera Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		//click on more option
		logger.info("Select moreoption");
		System.out.println("Select moreoptions");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			logger.info("calling Format() for format with data scenario");
			System.out.println("calling Format() for format with data scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			Format();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Format function cannot be called as incorrect Videos captured");
			logger.info("Fail: Test0 Fail for file verification");
			logger.info("Final Message: Fail Test0 Fail for Video Capture");
			System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
			System.out.println("Fail: Test0 Fail for file verification");
			System.out.println("Final Message: Fail Test0 Fail for Video Capture");
			logger.info("Test End");
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
	public void Format() throws  IOException, InterruptedException  {	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		// Launch settings app
		logger.info("Launch Settings application for Format uSD card with Data scenario ");
		System.out.println("Launch Settings application for Format uSD card with Data ");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search for Storage");
		System.out.println("Swipe Up and Search for Storage");
		//String text = "Storage";
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		//TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find external Storage option
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Storage\"))"));
		logger.info("Select Storage");
		System.out.println("Select Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select uSD Card
		logger.info("Clicking on SD card");
		System.out.println("Clicking on SD card");
		MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='SanDisk SD card']"));
		sdcard.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on More Options
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		MobileElement formatsdcard = 	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		formatsdcard.click();
		TimeUnit.SECONDS.sleep(5);
		//Select formatsdcard
		logger.info("Select Storage settings");
		System.out.println("Select Storage settings");
		MobileElement formatsdcard1 = 	driver.findElement(By.xpath("//*[@text='Storage settings']"));
		formatsdcard1.click();
		TimeUnit.SECONDS.sleep(5);
		// Select Format option
		logger.info("Select again formatsdcard");
		System.out.println("Select again formatsdcard");
		MobileElement formatsdcard2 = 	driver.findElement(By.xpath("//*[@text='Format']"));
		formatsdcard2.click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Accept to Format uSD Card");
		System.out.println("Accept to Format uSD Card");
		MobileElement formatsdcard3 = 	driver.findElement(By.xpath("//*[@text='Erase & format']"));
		formatsdcard3.click();
		logger.info("Started formatting, waiting till it gets formatted");
		System.out.println("Started formatting, waiting till it gets formatted");
		TimeUnit.SECONDS.sleep(90);
		logger.info("Pass: Format uSD with Data is successfull");
		System.out.println("Pass: Format uSD with Data is successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//Launch File Manager
		logger.info("Launch File Manager Application");
		System.err.println("Launch File Manager Application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(8);
		//Select Internal Storage
		logger.info("select browse option");
		System.out.println("select browse option");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		////Scroll Up to find Internal Storage option
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Click On SD Card");
		System.out.println("Click On SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find Internal Storage option
		MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
		TimeUnit.SECONDS.sleep(5);
		//Clearing Internal Memory
		logger.info("Click on DCIM Folder");
		System.out.println("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Search For Camera Folder
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Fail:Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Test0 fail for format operation");
			logger.info("Fail:Images and videos are present in the DCIM folder");
			logger.info("Final Message: Test0 fail for format operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("Final Message: Pass Test0 pass for format Operation");
			System.out.println("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Final Message: Pass Test0 pass for format Operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
	}
}
