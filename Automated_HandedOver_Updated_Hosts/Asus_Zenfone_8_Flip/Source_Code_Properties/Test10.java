package Asus_Zenfone_8_Flip;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ZenFone 8 Flip");
		dc.setCapability(MobileCapabilityType.UDID, "M5AIB760F208LYV");
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
		((StartsActivity) driver).startActivity(new Activity("com.asus.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Clear all\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test10 Pass for clearing Recent apps ");
			System.out.println("Pass: Test10 Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		//Launch Camera Application for rear camera video recording
		logger.info("Launch Camera Application for rear camera video recording");
		System.out.println("Launch Camera Application for rear camera video recording");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.asus.camera", "com.asus.camera.CameraApp"));
			TimeUnit.SECONDS.sleep(4);
			//If Permission reuest pop-up exists allow permissons
			try
			{
				logger.info("camera permissions");
				System.out.println("camera permissions");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")").click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(3);
			try
			{
				logger.info("camera permissions");
				System.out.println("camera permissions");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Yes\")").click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(3);
			try
			{
				logger.info("camera permissions");
				System.out.println("camera permissions");
				driver.findElement(By.xpath("//*[@bounds='[541,2053][1000,2211]']")).click();
				//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().bounds(\"['[541,2053][1000,2211]']\")").click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(3);
			try
			{
				logger.info("camera permissions");
				System.out.println("camera permissions");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"WHILE USING THE APP\")").click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(3);
			try
			{
				logger.info("camera permissions");
				System.out.println("camera permissions");
				driver.findElement(By.xpath("//*[@bounds='[832,1304][895,1367]']")).click();
				//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().resource-id(\"com.asus.camera:id/button_free_angle_slider_tip_close\")").click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			TimeUnit.SECONDS.sleep(3);
			//back camera supports 2 video resolutions
			logger.info("Test10_Bcam_res: 4 resolutions supported");
			System.out.println("Test10_Bcam_res: 4 resolutions supported");
			// Switch to Video mode
			logger.info("Clicking Video Tab");
			System.out.println("Clicking Video Tab");
			driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[73,107][196,230]']")).click();
			TimeUnit.SECONDS.sleep(3);
			////Scroll Up to find external Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Save to\"))"));
			TimeUnit.SECONDS.sleep(3);
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Search for save to");
			System.out.println("Search for save to");
			String text = "Storage location";
			driver.findElement(By.xpath("//*[@text='Save to']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select sd card
			driver.findElement(By.xpath("//*[@text='MicroSD']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[73,107][196,230]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution.click();
			TimeUnit.SECONDS.sleep(2);
			logger.info("Select 1st Back Video Resolution:FHD 1920 x 1080 (60 fps)");
			System.out.println("Select 1st Back Video Resolution: FHD 1920 x 1080 (60 fps)");
			//Select 1st resolution
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[81,1759][999,1885]']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
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
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StartRecording.click();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[73,107][196,230]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution1 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution1.click();
			TimeUnit.SECONDS.sleep(2);
			logger.info("Select 2nd Back Video Resolution:FHD 1920 x 1080");
			System.out.println("Select 2nd Back Video Resolution: FHD 1920 x 1080");
			//Select 1st resolution
			MobileElement secondRes = driver.findElement(By.xpath("//*[@bounds='[81,1885][999,2011]']"));
			secondRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			System.out.println("recordingDurationRear1Ext = "+ recordingDurationRear1);
			int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StartRecording.click();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[73,107][196,230]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution2 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution2.click();
			TimeUnit.SECONDS.sleep(2);
			logger.info("Select 3rd Back Video Resolution:HD 1280 x 720");
			System.out.println("Select 3rd Back Video Resolution: HD 1280 x 720");
			//Select 1st resolution
			MobileElement thirdRes = driver.findElement(By.xpath("//*[@bounds='[81,2011][999,2137]']"));
			thirdRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			System.out.println("recordingDurationRear2Ext = "+ recordingDurationRear2);
			int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StartRecording.click();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear2Int);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[73,107][196,230]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution3 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution3.click();
			TimeUnit.SECONDS.sleep(2);
			logger.info("Select 4th Back Video Resolution:4K 3840 x 2160");
			System.out.println("Select 4th Back Video Resolution: 4K 3840 x 2160");
			//Select 1st resolution
			MobileElement FourthRes = driver.findElement(By.xpath("//*[@bounds='[81,1633][999,1759]']"));
			FourthRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear3 = prop.getProperty("recordingDurationRear3");  
			System.out.println("recordingDurationRear3Ext = "+ recordingDurationRear3);
			int recordingDurationRear3Int=Integer.parseInt(recordingDurationRear3);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StartRecording.click();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear3Int);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video Recording Button\"]"));
			//StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On photo mode
			logger.info("Switch to defalut Photo mode");
			System.out.println("Switch to defalut Photo mode");
			driver.findElement(By.xpath("//*[@text='PHOTO']")).click();
			TimeUnit.SECONDS.sleep(5);
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
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='4 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
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
			logger.info("Test10_Bcam_video: 4 Videos captured successfull");
			System.out.println("Test10_Bcam_video: 4 Videos captured successfull");
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
		//Launch Camera Application for rear camera video recording
		logger.info("Launch files Application select usd card ply highest resolution recorded video and fastforward same");
		System.out.println("Launch files Application select usd card ply highest resolution recorded video and fastforward same");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Scroll Up to find SD card option
			logger.info("swipe up and search for sd card");
			System.out.println("swipe up and search for sd card");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External Storage");
			System.out.println("Select External Storage");		
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Scroll Up to find DCIM Folder
			logger.info("swipe up and search for dcim");
			System.out.println("swipe up and search for dcim");
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
			logger.info("Click on first file to play highest recorded resolution video file from usd card");
			System.out.println("Click on first file to play highest recorded resolution video file from usd card");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
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
			logger.info("Pause video ");
			System.out.println("Pause video ");
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
		//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
		logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find SD card
			logger.info("swipe up and search for sd card");
			System.out.println("swipe up and search for sd card");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select external storage");
			System.out.println("Select external storage");	
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			//search for test1 folder
			String text = "Test1";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select test1folder");
			System.out.println("Select test1folder");
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
				System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file from uSD card(Test1-->videos) for video playback and fast forward");
				logger.info("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file from uSD card(Test1-->videos) for video playback and fast forward");
				MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4\"))"));

				//Tap Somewhere on Screen for contents to visible on Screen
				System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
				logger.info("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
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
				logger.info("Pause video ");
				System.out.println("Pause video ");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: 4K Video play back and fast forward is successful ");
				System.err.println("Pass: 4K Video play back and fast forward is successful ");
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("Fail:Test10 Fail for 4K video play back "+exp); 
				System.out.println("Fail:Test10 Fail for 4K video play back: "+exp); 
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}

			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file from uSD card(Test1-->videos) for video playback and fast forward");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file from uSD card(Test1-->videos) for video playback and fast forward");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
			try {
				logger.info("Started video playback");
				System.out.println("Started video playback");
				TimeUnit.SECONDS.sleep(20);

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/quick_seek_overlay']")).click();
				//Click Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				System.err.println("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				logger.info("Pause video ");
				System.out.println("Pause video ");
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



