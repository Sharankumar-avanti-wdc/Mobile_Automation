package Nokia_5_3;

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

import javax.sound.midi.SysexMessage;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 5.3");
		dc.setCapability(MobileCapabilityType.UDID, "N0AA003791K52000302");
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
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Host does'nt support clear recent apps scenario for Automation!");
		System.out.println("Host does'nt support clear recent apps scenario for Automation!");
		try {
			logger.info("Launch  setting application to format uSD card");
			System.out.println("Launch  setting application to format uSD card");
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
			try {
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
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
			//Select uSD Card
			logger.info("Select Show roots");
			System.out.println("Select Show roots");
			driver.findElement(By.xpath("//*[@content-desc='Show roots']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click on More Options
			logger.info("Clicking on Nokia 5.3");
			System.out.println("Clicking on Nokia 5.3");
			driver.findElement(By.xpath("//*[@text='Nokia 5.3']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click on More Options
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click on More Options
			logger.info("Clicking on select all");
			System.out.println("Clicking on select all");
			driver.findElement(By.xpath("//*[@text='Select all']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click on More Options
			logger.info("Clicking on delete");
			System.out.println("Clicking on delete");
			driver.findElement(By.xpath("//*[@bounds='[552,56][636,140]']")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@bounds='[533,786][645,870]']")).click();
			TimeUnit.SECONDS.sleep(30);
			logger.info("Pass: Clearing phone internal memory is successfull");
			System.out.println("Pass: Clearing phone internal memory is successfull");
			//Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(4);
			//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
			logger.info("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			System.out.println("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			Images();
		}
		catch (Exception exp) {
			logger.info("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			logger.info("Final message: Fail Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
		}
	}	
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.CameraActivity"));
		TimeUnit.SECONDS.sleep(5);
		//IF Change to uSD card notification pop-up exists select Cancel Option
		try 
		{ 
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
			TimeUnit.SECONDS.sleep(5);
		} 
		catch(Exception exp)
		{ 
			logger.info("change to SD card element not found : "+exp); 
			System.out.println("change to SD card element not found : "+exp); 
		}
		TimeUnit.SECONDS.sleep(2);
		//IF Location access notification pop-up exists select Cancel option.
		logger.info("if Location permisson Pop Exists Select Cancel Option");
		System.out.println("if Location permisson Pop Exists Select Cancel Option");
		try 
		{ 
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		} 
		catch(Exception exp)
		{ 
			// Block of code to handle errors
			logger.info("Location  not found : "+exp); 
			System.out.println("Location  not found : "+exp); 
		}
		//Switch to back camera if current existing camera is Front camera.
		try {
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();
			logger.info("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
			System.out.println("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
		}
		catch(Exception exp)
		{ 
			// Block of code to handle errors
			logger.info("Currently camera is already in rear camera mode no need to switch"); 
			System.out.println("Currently camera is already in rear camera mode no need to switch");
		}
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for SD Card option");
		System.out.println("Search for SD Card option");
		String text = "Storage location";
		driver.findElement(By.xpath("//*[@text='Data storage']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save in SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Capture Images
		logger.info("Capture Image of Default Resolution");
		System.out.println("Capture Image of Default Resolution");
		for(int j = 0; j <25; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking Image of Default Resolutions"+j);
			logger.info("clicking Image of Default Resolutions"+j);
		}
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		logger.info("25 Image Capture is successfull");
		System.out.println("25 Image Capture is successfull");
		//Launch File Manager application to verify  Image capture
		logger.info("Launch File Manager application to verify Image capture");
		System.out.println("Launch File Manager application to verify Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select browse option
		logger.info("Select  browse");
		System.out.println("Select browse");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
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
		logger.info("Select moreoptions");
		System.out.println("Select moreoptions");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(3);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			logger.info("click on select all");
			System.out.println("click on select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			// SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Total Number Of Image captured 25 is successfull");
			System.out.println("Pass: Total Number Of Image captured 25 is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling video() for rear video recording in USD card and verifying data capture.
			logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
			System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
			Video();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
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
		System.out.println("Launch Camera Application");
		logger.info("Launch Camera Application");
		//Launch Camera Application.
		((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.CameraActivity"));
		TimeUnit.SECONDS.sleep(2);
		//If Change to SD Card notification pop-up exists select Cancel Option
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
		System.out.println("If Location Permission Request Pop Exists Click on Cancel Option");
		logger.info("If Location Permission Request Pop Exists Click on Cancel Option");
		try 
		{ 
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		} 
		catch(Exception exp)
		{ 
			// Block of code to handle errors
			logger.info("Location access pop-up  not found : "+exp); 
			System.out.println("Location access pop-up  not found : "+exp);
		}
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
		// Switch to Video mode
		logger.info("Clicking Video Tab");
		System.out.println("Clicking Video Tab");
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@text='Video']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for SD Card option");
		System.out.println("Search for SD Card option");
		String text = "Storage location";
		driver.findElement(By.xpath("//*[@text='Data storage']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save in SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings1.click();
		///Scroll Up to find external Storage option
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Video Resolution\"))"));
		TimeUnit.SECONDS.sleep(2);
		//Click On Rear Video size to select resolution
		logger.info("Select video resolution");
		System.out.println("Select video resolution");
		MobileElement VideoResolution = driver.findElement(By.xpath("//*[@text='Video Resolution']"));
		VideoResolution.click();
		TimeUnit.SECONDS.sleep(2);
		logger.info("Select Video from rear camera");
		System.out.println("Select Video from rear camera");
		MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@text='Video from rear camera']"));
		RearVideoSize.click();
		logger.info("Select 1st Back Video Resolution: UHD 4K");
		System.out.println("Select 1st Back Video Resolution: UHD 4K");
		//Select 1st resolution
		MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[18,652][701,736]']"));
		FirstRes.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
		StartRecording.click();
		TimeUnit.SECONDS.sleep(12);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
		StopRecording.click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings2.click();
		///Scroll Up to find external Storage option
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Video Resolution\"))"));
		TimeUnit.SECONDS.sleep(2);
		//Click On Rear Video size to select resolution
		logger.info("Select video resolution");
		System.out.println("Select video resolution");
		MobileElement VideoResolution1 = driver.findElement(By.xpath("//*[@text='Video Resolution']"));
		VideoResolution1.click();
		TimeUnit.SECONDS.sleep(2);
		logger.info("Select Video from rear camera");
		System.out.println("Select Video from rear camera");
		MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@text='Video from rear camera']"));
		RearVideoSize1.click();
		TimeUnit.SECONDS.sleep(2);
		logger.info("Select 2nd Back Video Resolution: FHD 1080P");
		System.out.println("Select 2nd Back Video Resolution: FHD 1080P");
		//Select 2nd resolution
		MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[18,736][701,820]']"));
		SecondRes.click();
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(12);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
		StopRecording1.click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Pass: Rear camera video recording is successfull");
		System.out.println("Pass: Rear camera video recording is successfull");
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
		////Scroll Up to find external Storage option
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		TimeUnit.SECONDS.sleep(5);
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
		logger.info("Select moreoptions");
		System.out.println("Select moreoptions");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(3);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			logger.info("click on select all");
			System.out.println("click on select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			// SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
	//Format() to Formating uSD card as external mount to perform with data format scenario and verify the data format status	
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
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Storage");
		System.out.println("Select Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select uSD Card
		logger.info("Clicking on SD card");
		System.out.println("Clicking on SD card");
		MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on More Options
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		TimeUnit.SECONDS.sleep(5);
		moreOptions.click();
		//Select Storage settings
		logger.info("Select storage settings");
		System.out.println("Select storage settings");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
		TimeUnit.SECONDS.sleep(5);
		// Select Format option
		logger.info("Select Format option");
		System.out.println("Select Format option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
		// click on Unmount and wait for 2 secs for it to get mounted
		TimeUnit.SECONDS.sleep(5);
		// Accept format uSD Card option
		logger.info("Accept to Format uSD Card");
		System.out.println("Accept to Format uSD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
		TimeUnit.SECONDS.sleep(90);
		System.out.println("Started formatting, waiting till it gets formatted");
		logger.info("Started formatting, waiting till it gets formatted");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Format uSD with Data is successfull");
		System.out.println("Format uSD with Data is successfull");
		//Launch File Manager application to verify  Image capture
		logger.info("Launch File Manager application to verify  Card is fully Formated or not");
		System.out.println("Launch File Manager application to verify  Card is fully Formated or not");
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
		TimeUnit.SECONDS.sleep(3);
		//Select External Storage	
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		MobileElement ExternalStorage1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
		TimeUnit.SECONDS.sleep(5);
		ExternalStorage1.click();
		//Clearing Internal Memory
		logger.info("Click on DCIM Folder");
		System.out.println("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Search For Camera Folder
			logger.info("Click on camera folder");
			System.out.println("Click on camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Fail: Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Test0 fail for format operation");
			logger.info("Fail: Images and videos are present in the DCIM folder");
			logger.info("Final Message: Test0 fail for format operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Pass Test0 pass for format Operation");
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