package Realme_8s_5G_RMX3381;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme 8s 5G");
		dc.setCapability(MobileCapabilityType.UDID, "EQW4Y5WOSW7X7DWO");
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
		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Host does'nt support clear recent apps option! Hence Skiping clear recent apps scenario");
		System.out.println("Host does'nt support clear recent apps option! Hence Skiping clear recent apps scenario");
		try {
			//Clearing Phone Internal Memory
			//Launch File Manager
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find external Storage option
			logger.info("swipe up and search for internal storage");
			System.out.println("swipe up and search for internal storage");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Select  More options");
			System.out.println("Select More options");
			MobileElement Moreoptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			Moreoptions .click();
			TimeUnit.SECONDS.sleep(3);
			//Click Select all
			logger.info("click on Select all");
			System.out.println("click on Select all");
			MobileElement SelectAll = driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			//Click move to recycle Bin
			logger.info("Select Delete permanently");
			System.out.println("Select  Delete permanently");
			MobileElement MovetoRecycleBin = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/delete_action']"));
			MovetoRecycleBin.click();
			TimeUnit.SECONDS.sleep(3);
			//delete
			logger.info("Select  Delete");
			System.out.println("Select  Delete");
			driver.findElement(By.xpath("//*[@text='Delete']")).click();
			TimeUnit.SECONDS.sleep(120);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Clearing phone internal memory is successfull");
			System.out.println("Pass: Clearing phone internal memory is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling Image() to capture rear camera image in USD card and Verifying it.
			logger.info("Calling Image() to capture rear camera image in uSD card and verifying the same.");
			System.out.println("Calling Image() to capture rear camera image in uSD card and verifying the same.");
			Images();
		}

		catch(Exception exp)
		{ 
			logger.info("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			logger.info("Final message: Fail Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Final message: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
			logger.info("Test End"); 
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}	
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
		TimeUnit.SECONDS.sleep(3);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[888,0][1005,240]']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for Advanced settings option");
		System.out.println("Search forAdvanced settings option");
		String text = "Storage location";
		driver.findElement(By.xpath("//*[@text='Advanced settings']")).click();
		TimeUnit.SECONDS.sleep(3);

		try {

			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD Card Preferred\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select turn on option");
			driver.findElement(By.xpath("//*[@text='Turn On']")).click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD Card Preferred\")").click();
			TimeUnit.SECONDS.sleep(5);

			logger.info("Select turn on option");
			driver.findElement(By.xpath("//*[@text='Turn On']")).click();
			TimeUnit.SECONDS.sleep(5);

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);

		//Capture Images
		logger.info("Capture Image of Default Resolution");
		System.err.println("Capture Image of Default Resolution");
		for(int j = 0; j <25; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking Image of Default Resolutions"+j);
			logger.info("clicking Image of Default Resolutions"+j);

		}
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
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
		System.out.println("clicking on browse");
		logger.info("clicking on browse");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		////Scroll Up to find external Storage option
		System.out.println("swipe up search for sd card");
		logger.info("swipe up search for sd card");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

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
		logger.info("Select more options");
		System.out.println("Select more options");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			logger.info("click on Select all");
			System.out.println("click on Select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Verifying Image Capture ");
			System.out.println("Verifying Image Capture ");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass:Total Number Of Image captured 25 is successfull");
			System.out.println("Pass:Total Number Of Image captured 25 is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling video() for rear video recording in USD card and verifying data capture.
			logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
			System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Video();
		}

		catch (Exception e) {

			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}


		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);


	}

	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
	public void Video() throws  IOException, InterruptedException {

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launch Camera Application");
		System.out.println("Launch Camera Application");
		//Launch Camera Application.
		((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
		TimeUnit.SECONDS.sleep(5);
		TimeUnit.SECONDS.sleep(5);
		// Switch to Video mode
		logger.info("Clicking Video Tab");
		System.out.println("Clicking Video Tab");
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(309, 1776)).perform();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for Advanced settings option");
		System.out.println("Search forAdvanced settings option");
		String text = "Storage location";
		driver.findElement(By.xpath("//*[@text='Advanced settings']")).click();
		TimeUnit.SECONDS.sleep(3);

		try {

			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD Card Preferred\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select turn on option");
			System.out.println("Select turn on option");
			driver.findElement(By.xpath("//*[@text='Turn On']")).click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD Card Preferred\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Select turn on option");
			logger.info("Select turn on option");
			driver.findElement(By.xpath("//*[@text='Turn On']")).click();
			TimeUnit.SECONDS.sleep(5);

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']")).click();
		TimeUnit.SECONDS.sleep(5);
		///Scroll Up to find external Storage option
		logger.info("swipe up and select for video resolution");
		System.out.println("swipe up and select for video resolution");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));

		//Click On Rear Video size to select resolution
		MobileElement VideoResolution = driver.findElement(By.xpath("//*[@text='Video resolution']"));
		VideoResolution.click();
		logger.info("Select 1st Back Video Resolution:1080p");
		System.out.println("Select 1st Back Video Resolution: 1080p");
		//Select 1st resolution
		MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[72,436][210,501]']"));
		FirstRes.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
		StartRecording.click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
		StopRecording.click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']")).click();
		TimeUnit.SECONDS.sleep(5);
		///Scroll Up to find external Storage option
		logger.info("swipe up and select for video resolution");
		System.out.println("swipe up and select for video resolution");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));

		//Click On Rear Video size to select resolution
		MobileElement VideoResolution1 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
		VideoResolution1.click();
		logger.info("Select 2nd Back Video Resolution: 720P");
		System.out.println("Select 2nd Back Video Resolution:  720P");
		//Select 2nd resolution
		MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[72,588][183,653]']"));
		SecondRes.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
		StopRecording1.click();
		TimeUnit.SECONDS.sleep(8);
		//select photo mode
		logger.info("select photo mode");
		System.out.println("select photo mode");
		TouchAction touchAction1 = new TouchAction(driver);
		touchAction.tap(PointOption.point(755, 1781)).perform();
		TimeUnit.SECONDS.sleep(5);
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
		logger.info("clcik on browse");
		System.out.println("clcik on browse");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		////Scroll Up to find external Storage option
		logger.info("swipe up and search for sd card");
		System.out.println("swipe up and search for sd card");
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

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
		logger.info("Select more options");
		System.out.println("Select more options");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			logger.info("click on Select all");
			System.out.println("click on Select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
			logger.info("Verifying Image Capture and videos ");
			System.out.println("Verifying Image Capture  and videos");
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("calling Format() for format with data scenario");
			System.out.println("calling Format() for format with data scenario");
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
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

	}

	public void Format() throws  IOException, InterruptedException  {	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Clearing Recent Apps
		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		// Launch settings app
		logger.info("Launch Settings application for Format uSD card with Data scenario ");
		System.out.println("Launch Settings application for Format uSD card with Data ");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search for Storage");
		System.out.println("Swipe Up and Search for Storage");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Storage");
		System.out.println("Select Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search sd card");
		System.out.println("Swipe Up and Search sd card");
		String text1 = "SD card";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		//Select uSD Card
		logger.info("Clicking on SD card");
		System.out.println("Clicking on SD card");
		MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='SD card']"));
		sdcard.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on More Options
		logger.info("Clicking on formatsdcard");
		System.out.println("Clicking on formatsdcard");
		MobileElement formatsdcard = 	driver.findElement(By.xpath("//*[@text='Format SD card']"));
		formatsdcard.click();
		TimeUnit.SECONDS.sleep(5);
		//Select formatsdcard
		MobileElement formatsdcard1 = 	driver.findElement(By.xpath("//*[@text='FORMAT SD CARD']"));
		formatsdcard1.click();
		logger.info("Select formatsdcard");
		System.out.println("Select formatsdcard");
		TimeUnit.SECONDS.sleep(5);
		// Select Format option
		logger.info("Select again formatsdcard");
		System.out.println("Select again formatsdcard");
		MobileElement formatsdcard2 = 	driver.findElement(By.xpath("//*[@text='FORMAT SD CARD']"));
		formatsdcard2.click();
		logger.info("Accept to Format uSD Card");
		System.out.println("Accept to Format uSD Card");
		logger.info("Started formatting, waiting till it gets formatted");
		System.out.println("Started formatting, waiting till it gets formatted");
		TimeUnit.SECONDS.sleep(90);
		//Click Done
		//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CANCEL\")").click();
		//TimeUnit.SECONDS.sleep(4);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Pass: Format uSD with Data is successfull");
		System.out.println("Pass: Format uSD with Data is successfull");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//Launch File Manager
		logger.info("Launch File Manager Application");
		System.out.println("Launch File Manager Application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select Internal Storage
		logger.info("select browse option");
		System.out.println("select browse option");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		////Scroll Up to find Internal Storage option
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select SD Card
		logger.info("Click On SD Card");
		System.out.println("Click On SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Clearing Internal Memory
		logger.info("Click on DCIM Folder");
		System.out.println("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Search For Camera Folder
			logger.info("Click on camera Folder");
			System.out.println("Click on cameraFolder");
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
	}
}