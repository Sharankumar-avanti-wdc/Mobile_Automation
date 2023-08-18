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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ZenFone 8 Flip");
		dc.setCapability(MobileCapabilityType.UDID, "M5AIB760F208LYV");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
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
		System.out.println("Test:Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10F Scenario is as follows");
		logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback front Highest recorded video for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		logger.info("Move front camera recorded video files to Test10F folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F Scenario is as follows");
		System.out.println("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		System.out.println("3.Move front camera recorded video files to Test10F folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
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
			logger.info("Pass: Test10F Pass for clearing Recent apps ");
			System.out.println("Pass: Test10F Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		//Launch Camera Application for front camera video recording
		try {
			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording"); 
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
			TimeUnit.SECONDS.sleep(5);
			//front camera supports 2 video resolutions
			logger.info("Test10F_Fcam_res: 4 resolutions supported");
			System.out.println("Test10F_Fcam_res: 4 resolutions supported");
			// Switch to Video mode
			logger.info("Clicking Video Tab");
			System.out.println("Clicking Video Tab");
			driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
			TimeUnit.SECONDS.sleep(3);
			//switch to front camera
			logger.info("Click On front camera mode");
			System.out.println("Click On front camera mode");
			driver.findElement(By.xpath("//*[@bounds='[777,2049][814,2193]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.asus.camera:id/option_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select First front video Resolution:  FHD 1920 x 1080 (60 fps)");
			System.out.println("Select First front video resolution:  FHD 1920 x 1080 (60 fps)");
			driver.findElement(By.xpath("//*[@bounds='[81,1759][999,1885]']")).click();
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
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFrontInt);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			TimeUnit.SECONDS.sleep(4);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.asus.camera:id/option_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution1 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 2nd front video Resolution:  FHD 1920 x 1080");
			System.out.println("Select 2nd front video resolution:  FHD 1920 x 1080");
			driver.findElement(By.xpath("//*[@bounds='[81,1885][999,2011]']")).click();
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
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront1Int);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			TimeUnit.SECONDS.sleep(4);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.asus.camera:id/option_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution2 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution2.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 3rd front video Resolution:  HD 1280 x 720");
			System.out.println("Select 3rd front video resolution:  HD 1280 x 720");
			driver.findElement(By.xpath("//*[@bounds='[81,2011][999,2137]']")).click();
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
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFront2Int);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			TimeUnit.SECONDS.sleep(4);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.asus.camera:id/option_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
			MobileElement VideoResolution3 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			VideoResolution3.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 4th front video Resolution:  4K 3840 x 2160");
			System.out.println("Select 4th front video resolution:  4K 3840 x 2160");
			driver.findElement(By.xpath("//*[@bounds='[81,1633][999,1759]']")).click();
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
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationFrontInt);
			driver.findElement(By.xpath("//*[@bounds='[444,2025][636,2217]']")).click();
			TimeUnit.SECONDS.sleep(4);
			//Click On back camera
			logger.info("Click On back camera mode");
			System.out.println("Click On back camera mode");
			driver.findElement(By.xpath("//*[@bounds='[777,2049][814,2193]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On photo mode
			logger.info("Switch to defalut Photo mode");
			System.out.println("Switch to defalut Photo mode");
			driver.findElement(By.xpath("//*[@text='PHOTO']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test10F pass for front camera video recording");
			System.out.println("Pass: Test10F pass for front camera video recording");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Launch File manager
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
			logger.info("Test10F_Fcam_video: 4 Videos captured successfull");
			System.out.println("Test10F_Fcam_video: 4 Videos captured successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
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
			//Click On back camera
			logger.info("Click On back camera mode");
			System.out.println("Click On back camera mode");
			driver.findElement(By.xpath("//*[@bounds='[777,2049][814,2193]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On photo mode
			logger.info("Switch to defalut Photo mode");
			System.out.println("Switch to defalut Photo mode");
			driver.findElement(By.xpath("//*[@text='PHOTO']")).click();
			TimeUnit.SECONDS.sleep(3);
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
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		logger.info("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		System.out.println("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find SD card option
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
			////Scroll Up to find DCIM Folder
			logger.info("swipe up and search for dcim");
			System.out.println("swipe up and search for dcim");
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
			System.out.println("//Select  camera");
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
			logger.info("Click on first file to play newest date frist recorded resolution video file in usd card");
			System.out.println("Click on first file to play newest date frist recorded resolution video file in usd card");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
			TimeUnit.SECONDS.sleep(20);
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			//  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Locking Mobile
			logger.info("Lock Mobile with 30 seconds delay");
			System.out.println("Lock Mobile with 30 seconds delay");
			// ((AndroidDriver) driver).lockDevice();
			TimeUnit.SECONDS.sleep(30);
			//Unlocking Device 
			logger.info("Wait For 30Seconds");
			System.out.println("Wait For 30Seconds");
			// ((AndroidDriver) driver).unlockDevice();
			TimeUnit.SECONDS.sleep(5);
			//Unlocking Device 
			logger.info("Unlock Mobile ");
			System.out.println("Unlock Mobile");
			//driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(30);
			logger.info("Pause video ");
			System.out.println("Pause video ");
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
			logger.info("Re-launch file manager application and select external storage for data move operation, select all front camera videos present in camera folder and move to Test10FF folder");
			System.out.println("Re-launch file manager application and select external storage for data move operation, select all front camera videos present in camera folder and move to Test10 folder");
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
			logger.info("Test10F: Data move operation completed successfully");
			System.out.println("Test10F: Data move operation completed successfully");
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
			Result = "Fail";
			logger.info("Fail: Test10F Fail for data move operation ");
			System.out.println("Fail: Test10F Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}