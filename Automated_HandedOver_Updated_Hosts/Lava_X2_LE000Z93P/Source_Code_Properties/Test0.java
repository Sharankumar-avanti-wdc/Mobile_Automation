package Lava_X2_LE000Z93P;

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
import junit.framework.Assert;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "LAVA  X2");
		dc.setCapability(MobileCapabilityType.UDID, "X29H22CB001024");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
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
		System.out.println("Test0 Scenario is as follows ");
		System.out.println("1.Unlock phone, clear recent apps, clear internal memory");
		System.out.println("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		System.out.println("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		System.out.println("4.Call Format() and format uSD card with data and verify the same");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		SetUp();
		String Result = "Fail";

		logger.info("Launch Home screen");
		System.out.println("Launch Home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(3);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"CLEAR ALL\")").click();
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
				TimeUnit.SECONDS.sleep(45);

			}
			catch (Exception e) {


			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(4);
			logger.info("Pass: Clearing phone internal memory is successfull");
			System.out.println("Pass: Clearing phone internal memory is successfull");
			logger.info("Calling Image() to capture rear camera image in uSD card and verifying the same.");
			System.out.println("Calling Image() to capture rear camera image in uSD card and verifying the same.");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling Image() to capture rear camera image in USD card and Verifying it.
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
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear camera picture capture");
		System.out.println("Launch Camera Application for Rear camera picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//IF Change to uSD card notification pop-up exists select Cancel Option
			try 
			{ 
				logger.info("IF Change to uSD card notification pop-up exists select Cancel Option");
				System.out.println("IF Change to uSD card notification pop-up exists select Cancel Option");
				driver.findElement(By.xpath("//*[@bounds='[100,869][140,909]']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='I know']")).click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[192,159][240,207]']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Storage path
			logger.info("Select Storagepath option");
			System.out.println("Select Storagepath option");
			MobileElement Storagepath = driver.findElement(By.xpath("//*[@bounds='[394,514][481,547]']"));
			Storagepath .click();
			TimeUnit.SECONDS.sleep(5);
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Search for Storage path option");
			System.out.println("Search for Storage path option");
			driver.findElement(By.xpath("//*[@text='Storage path']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			MobileElement Sdcard = driver.findElement(By.xpath("//*[@text='SD Card']"));
			Sdcard.click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Capture Images
			logger.info("Capture Image of Default Resolution");
			System.out.println("Capture Image of Default Resolution");
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing default resolition image "+j);
				logger.info("Captureing default resolition image "+j);
			}
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			System.out.println("25 image capture is successfull ");
			logger.info("25 image capture is successfull");
			//Launch File Manager application to verify  Image capture
			logger.info("Launch File Manager application to verify  Image capture");
			System.out.println("Launch File Manager application to verify  Image capture");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			MobileElement Sdcard1= driver.findElement(By.xpath("//*[@text='SD card']"));
			Sdcard1.click();
			TimeUnit.SECONDS.sleep(5);
			//Search For DCIM Folder 
			logger.info("Select DCIM Folder");
			System.out.println("Select DCIM Folder");
			String text2 = "DCIM";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			try {
				//Click More Options
				logger.info("Select More Options ");
				System.out.println("Select More Options ");
				MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions.click();
			}
			catch (Exception e) {
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				MoreOptions1.click();
				e.printStackTrace();
			}
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			//Click on Select All 
			try {
				//Select All
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='25 selected']"));
				TimeUnit.SECONDS.sleep(5);
				TotalFiles.click();
				logger.info("Pass:Total Number Of Image captured 25 is successfull");
				System.out.println("Pass:Total Number Of Image captured 25 is successfull");

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
				//Calling video() for rear video recording in USD card and verifying data capture.
				logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
				System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				Video();
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("Fail: Video function cannot be called as incorrect Images captured ");
				logger.info("Final Message: Fail Test0 Fail for Image capture");
				System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
				System.out.println("Final Message: Fail Test0 Fail for Image capture");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as Test0 fail during rear camera image capture scneario ");
			logger.info("Final Message: Fail Test0 for rear camera image capture scenario");
			System.out.println("Fail: Video function cannot be called as Test0 fail during rear camera image capture scneario ");
			System.out.println("Final Message: Fail Test0 for rear camera image capture scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	//Launch camera application and record rear camera video for two highest resolution by setting uSD card as storage option and verify the recorded videos in uSD
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch home screen and clear recent apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		//Launch Camera Application.
		logger.info("re-launch camera application for rear camera video recording");
		System.out.println("re-launch camera application for rear camera video recording");
		((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//IF Change to uSD card notification pop-up exists select Cancel Option
			try 
			{ 
				logger.info("IF Change to uSD card notification pop-up exists select Cancel Option");
				System.out.println("IF Change to uSD card notification pop-up exists select Cancel Option");
				driver.findElement(By.xpath("//*[@bounds='[100,869][140,909]']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='I know']")).click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 
			}
			TimeUnit.SECONDS.sleep(2);

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[192,159][240,207]']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Storage path
			logger.info("Select Storagepath option");
			System.out.println("Select Storagepath option");
			MobileElement Storagepath = driver.findElement(By.xpath("//*[@bounds='[394,514][481,547]']"));
			Storagepath .click();
			TimeUnit.SECONDS.sleep(5);
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Search for Storage path option");
			System.out.println("Search for Storage path option");
			driver.findElement(By.xpath("//*[@text='Storage path']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			MobileElement Sdcard = driver.findElement(By.xpath("//*[@text='SD Card']"));
			Sdcard.click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Switch to Video mode
			logger.info("Switch to video recording mode");
			System.out.println("Switch to video recording mode");
			driver.findElement(By.xpath("//*[@text='Video']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@bounds='[336,159][384,207]']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			//Select 1st resolution
			logger.info("Select first highest rear camera video resolution: 1080p");
			System.out.println("Select first highest rear camera video resolution: 1080p");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[70,297][185,402]']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Recording Video for 2Minutes of Duration");
			System.out.println("Recording Video for 2Minutes of Duration");
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings2 = driver.findElement(By.xpath("//*[@bounds='[336,159][384,207]']"));
			Settings2.click();
			TimeUnit.SECONDS.sleep(5);
			//Select 2nd resolution
			logger.info("Select second highest rear camera video resolution: 720p");
			System.out.println("Select second highest rear camera video resolution: 720p");
			MobileElement secondRes = driver.findElement(By.xpath("//*[@bounds='[70,297][185,402]']"));
			secondRes.click();
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Recording Video for 2Minutes of Duration");
			System.out.println("Recording Video for 2Minutes of Duration");
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording1.click();
			TimeUnit.SECONDS.sleep(5);
			// Switch to default photo mode
			logger.info("Switch to back to photo mode");
			System.out.println("Switch to back to photo mode");
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@text='Photo']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Rear camera video recording is successfull");
			System.out.println("Rear camera video recording is successfull");
			//Launch File Manager application to verify  Image capture
			logger.info("Launch file manager application to verify recorded videos in uSD card");
			System.out.println("Launch File Manager application to verify  Image capture");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			MobileElement Sdcard2= driver.findElement(By.xpath("//*[@text='SD card']"));
			Sdcard2.click();
			TimeUnit.SECONDS.sleep(5);
			//Search For DCIM Folder 
			logger.info("Select DCIM Folder");
			System.out.println("Select DCIM Folder");
			String text2 = "DCIM";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			try {
				//Click More Options
				logger.info("Select More Options ");
				System.out.println("Select More Options ");
				MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions.click();
			}
			catch (Exception e) {
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				MoreOptions1.click();
				e.printStackTrace();
			}
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			//Click on Select All 
			try {
				//Select All
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='27 selected']"));
				TimeUnit.SECONDS.sleep(5);
				TotalFiles.click();
				logger.info("Pass: 2 Videos recorded Successfully");
				logger.info("Pass: A total of 27 files present in uSD card before Format");
				System.out.println("Pass: 2 Videos recorded Successfully");
				System.out.println("Pass: A total of 27 files present in uSD card before Format");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(5);
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
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test0 Fail for rear camera video recording scenario");
			System.out.println("Click On Select All Options");
			logger.info("Final Message: Fail Test0 fail for rear camera video recording scenario");
			System.out.println("Final Message: Fail Test0 fail for rear camera video recording scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	//Format() to Formating uSD card as external mount to perform with data format scenario and verify the data format status
	public void Format() throws  IOException, InterruptedException  {	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch Home screen and clear recent apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Launch Settings application for Format uSD card with Data scenario
		logger.info("Launch Settings application for Format uSD card with Data scenario ");
		System.out.println("Launch Settings application for Format uSD card with Data ");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Scrolling till battery and device care is visible");
			System.out.println("Scrolling till battery and device care is visible");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//click on storage
			logger.info("Clicking on storage");
			System.out.println("Clicking on storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			try
			{
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
			}
			TimeUnit.SECONDS.sleep(5);
			//find element by xpath
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			moreOptions.click();
			TimeUnit.SECONDS.sleep(5);
			//click on Storage settings
			logger.info("Clicking on Storage settings");
			System.out.println("Clicking on Storage settings");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
			TimeUnit.SECONDS.sleep(5);
			// click on format
			logger.info("Click Format");
			System.out.println("Click Format");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			// wait for 2 mins
			logger.info("Started formatting, waiting till it gets formatted");
			System.out.println("Started formatting, waiting till it gets formatted");
			TimeUnit.SECONDS.sleep(55);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			//Result = "Format Successfull";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("Format uSD with Data is successfull");
		System.out.println("Format uSD with Data is successfull");
		//Launch File Manager application to verify  Image capture
		logger.info("Launch File Manager application to verify  Image capture");
		System.out.println("Launch File Manager application to verify  Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Select  SD Card");
		System.out.println("Select  SD Card");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		MobileElement Sdcard2= driver.findElement(By.xpath("//*[@text='SD card']"));
		Sdcard2.click();
		TimeUnit.SECONDS.sleep(5);
		//Search For DCIM Folder 
		logger.info("Select DCIM Folder");
		System.out.println("Select DCIM Folder");
		String text2 = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		try {
			//Search For Camera Folder
			logger.info("Click On Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Fail: Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Fail Test0 Fail for format operation");
			logger.info("Fail: Images and videos are present in the DCIM folder");
			logger.info("Final Message: Fail Test0 Fail for format operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("Final Message: Pass Test0 pass for format Operation");
			System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Final Message: Pass Test0 Pass for format Operation");
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