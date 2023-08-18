package Oukitel_K9_Pro;

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
import Oukitel_K9_Pro.Test10;
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

public class Test10F_Int
{
	// initializing the driver instance and declared desired capabilities
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "K9 Pro");
		dc.setCapability(MobileCapabilityType.UDID, "OUKITELK9PRO02170");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void rearVideoRec() throws InterruptedException, SecurityException, IOException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test10F_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10F_Int Scenario is as follows");
		logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in Internal storage");
		logger.info("2.Playback Highest resolution recorded video from Internal storage, fast forward playback and pause video scenario ");
		logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F_Int Scenario is as follows");
		System.out.println("1.Launch Camera application and start front camera video recording for all host applicable resolutions in Internal storage");
		System.out.println("2.Playback Highest resolution recorded video from Internal storage, fast forward playback and pause video scenario ");
		System.out.println("3.Move front camera recorded videos from uInternal storage to Test10F_Int folder in uInternal storage");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		TimeUnit.SECONDS.sleep(5);
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch Home screen 
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
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
			//Launch Camera application for rear camera video recording.
			logger.info("Launch Camera application for front camera video recording");
			System.out.println("Launch Camera application for front camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
			TimeUnit.SECONDS.sleep(5);
			try 
			{ 
				logger.info("IF Change to uInternal storage notification pop-up exists select Cancel Option");
				System.out.println("IF Change to uInternal storage notification pop-up exists select Cancel Option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DENY\")").click();

			} 
			catch(Exception exp)
			{ 
				logger.info("change to Internal storage element not found : "+exp); 
				System.out.println("change to Internal storage element not found : "+exp); 

			}
			try 
			{ 	
				logger.info("if Location permisson Pop Exists Select Cancel Option");
				System.out.println("if Location permisson Pop Exists Select Cancel Option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"START CAPTURE\")").click();

			} 
			catch(Exception exp)
			{ 
				// Block of code to handle errors
				logger.info("Location permission access pop-up  not found : "+exp); 
				System.out.println("Location permission access pop-up  not found : "+exp); 
			}
			// Switch to Video mode
			logger.info("Switch to video recording mode");
			System.out.println("Switch to video recording mode");
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@text='Video']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Test10F_Int_Fcam_res: 4 resolutions supported");
			System.out.println("Test10F_Int_Fcam_res: 4 resolutions supported");
			//Switch to Front Video camera mode
			logger.info("Switch to front video camera mode");
			System.out.println("Switch to front video camera mode");
			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_switcher']"));
			SwitchToFrontCamera.click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[510,141][570,201]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video size
			logger.info("Select Video size option");
			System.out.println("Select Video size option");
			MobileElement Videosize = driver.findElement(By.xpath("//*[@text='Video quality']"));
			Videosize.click();
			TimeUnit.SECONDS.sleep(5);
			//Select 1st resolution
			logger.info("Select front camera first video resolution: 1920x1080");
			System.out.println("Select front camera first video resolution: 1920x1080");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='1920x1080']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file for video recording duration
			Properties prop = new Properties();
			prop.load(Test10F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront_Int = prop.getProperty("recordingDurationFront_Int");  
			System.out.println("recordingDurationFront_Int = "+ recordingDurationFront_Int + " Seconds");
			int recordingDurationFront_IntInt=Integer.parseInt(recordingDurationFront_Int);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@bounds='[290,1308][430,1448]']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(recordingDurationFront_IntInt);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/video_stop_shutter']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[510,141][570,201]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video size
			logger.info("Select Video size option");
			System.out.println("Select Video size option");
			MobileElement Videosize1 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			Videosize1.click();
			TimeUnit.SECONDS.sleep(5);
			//Select 2nd resolution
			logger.info("Select front camera second video resolution : 1280x720");
			System.out.println("Select front camera second video resolution : 1280x720");
			MobileElement secondRes = driver.findElement(By.xpath("//*[@text='1280x720']"));
			secondRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file for video recording duration
			Properties prop1 = new Properties();
			prop.load(Test10F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront_Int1 = prop.getProperty("recordingDurationFront_Int1");  
			System.out.println("recordingDurationFront_Int1 = "+ recordingDurationFront_Int1 + " Seconds");
			int recordingDurationFront_Int1Int=Integer.parseInt(recordingDurationFront_Int1);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@bounds='[290,1308][430,1448]']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(recordingDurationFront_Int1Int);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/video_stop_shutter']"));
			StopRecording1.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[510,141][570,201]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video size
			logger.info("Select Video size option");
			System.out.println("Select Video size option");
			MobileElement Videosize2 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			Videosize2.click();
			TimeUnit.SECONDS.sleep(5);
			//Select 2nd resolution
			logger.info("Select front camera 3rd video resolution : 640x480");
			System.out.println("Select front camera 3rd video resolution : 640x480");
			MobileElement thirdres = driver.findElement(By.xpath("//*[@text='640x480']"));
			thirdres.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file for video recording duration
			Properties prop2 = new Properties();
			prop.load(Test10F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront_Int2 = prop.getProperty("recordingDurationFront_Int2");  
			System.out.println("recordingDurationFront_Int2 = "+ recordingDurationFront_Int2 + " Seconds");
			int recordingDurationFront_Int2Int=Integer.parseInt(recordingDurationFront_Int2);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording2 = driver.findElement(By.xpath("//*[@bounds='[290,1308][430,1448]']"));
			StartRecording2.click();
			TimeUnit.SECONDS.sleep(recordingDurationFront_Int2Int);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/video_stop_shutter']"));
			StopRecording2.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[510,141][570,201]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video size
			logger.info("Select Video size option");
			System.out.println("Select Video size option");
			MobileElement Videosize3 = driver.findElement(By.xpath("//*[@text='Video quality']"));
			Videosize3.click();
			TimeUnit.SECONDS.sleep(5);
			//Select 2nd resolution
			logger.info("Select front camera second video resolution : 352x288");
			System.out.println("Select front camera second video resolution : 352x288");
			MobileElement fourthres = driver.findElement(By.xpath("//*[@text='352x288']"));
			fourthres.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file for video recording duration
			Properties prop3 = new Properties();
			prop.load(Test10F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationFront_Int3 = prop.getProperty("recordingDurationFront_Int3");  
			System.out.println("recordingDurationFront_Int3 = "+ recordingDurationFront_Int3 + " Seconds");
			int recordingDurationFront_Int3Int=Integer.parseInt(recordingDurationFront_Int3);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording3 = driver.findElement(By.xpath("//*[@bounds='[290,1308][430,1448]']"));
			StartRecording3.click();
			TimeUnit.SECONDS.sleep(recordingDurationFront_Int3Int);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording3 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/video_stop_shutter']"));
			StopRecording3.click();
			TimeUnit.SECONDS.sleep(5);
			//Switch to rear Video camera mode
			logger.info("Switch to rear video camera mode");
			System.out.println("Switch to rear video camera mode");
			MobileElement SwitchToFrontCamera1 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_switcher']"));
			SwitchToFrontCamera1.click();
			TimeUnit.SECONDS.sleep(3);
			// Switch to default photo mode
			logger.info("Clicking photo Tab");
			System.out.println("Clicking photo Tab");
			driver.findElement(By.xpath("//*[@text='Picture']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test10F_Int Pass for front camera video recording");
			System.out.println("Pass: Test10F_Int Pass for front camera video recording");
			//launch file manager application and verify recorded video files in uInternal storage
			logger.info("Launch file manager application and verify recorded video capture Internal storage");
			System.out.println("Launch file manager application and verify recorded video capture Internal storage");
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
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click Internal storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Camera folder
			logger.info("Select camera folder");
			System.out.println("Select camera folder");
			MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
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
			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='4 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Test10F_Int_Fcam_video: 4 Videos captured successfull");
			System.out.println("Test10F_Int_Fcam_video: 4 Videos captured successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling VideoPlayBack()
			logger.info("Calling VideoPlayBackForSleepWake()");
			System.out.println("Calling VideoPlayBackForSleepWake()");
			VideoPlayBackForSleepWake();
			TimeUnit.SECONDS.sleep(2);
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Test10F_Int Fail for front camera video recording ");
			System.out.println("Fail: Test10F_Int Fail for front camera video recording ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F_Int folder");
			System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F_Int folder");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10F_Int Fail for front camera video recording");
			System.out.println("Final Message: Fail Test10F_Int Fail for front camera video recording");
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		}
	}
	@SuppressWarnings("deprecation")
	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		String Result = "Pass";
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);

		try {
			//Re-launch files application
			logger.info("Launching file manager application");
			System.out.println("Launching file manager application");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select camera folder
			logger.info("Select Camera folder");
			System.out.println("Select Camera folder");
			MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
			Camera.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select more option
			logger.info("Select more options");
			System.out.println("Select more options");
			MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(5);
			//Select sort by	
			logger.info("Select Sort By option");
			System.out.println("Select Sort By option");
			MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
			Sortby1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Newest date first
			logger.info("Select Sort by Newest date first");
			System.out.println("Select Sort by Newest date first");
			MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Newest date first']")); 
			Largest1.click();
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
			//Click pause button
			logger.info("Click pause video button");
			System.out.println("Click pause video button");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);	
			//Locking Mobile
			logger.info("Lock Mobile with 30 seconds delay");
			System.out.println("Lock Mobile with 30 seconds delay");
			// ((AndroidDriver) driver).lockDevice();
			TimeUnit.SECONDS.sleep(120);
			//Unlocking Device 
			logger.info("Wait For 30Seconds");
			System.out.println("Wait For 30Seconds");
			// ((AndroidDriver) driver).unlockDevice();
			TimeUnit.SECONDS.sleep(5);
			//Unlocking Device 
			logger.info("Unlock Mobile ");
			System.out.println("Unlock Mobile");
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Click play button
			logger.info("Click pause video button");
			System.out.println("Click pause video button");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);	
			TimeUnit.SECONDS.sleep(30);
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Click pause button
			logger.info("Click pause video button");
			System.out.println("Click pause video button");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);	
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test10F_Int Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
			System.out.println("Pass: Test10F_Int Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling DataMoveOperation
			logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F_Int folder");
			System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F_Int folder");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test10F_Int Fail for Data Move Operation");
				logger.info("Final Message: Fail Test10F_Int Fail for Data Move Operation");
			}
			else {
				logger.info("Final Message: Pass Test10F_Int Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
				System.out.println("Final Message: Pass Test10F_Int Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch (Exception e) {
			logger.info("Fail: Test10F_Int Fail for VideoPlayBackForSleepWake()");
			System.out.println("Fail: Test10F_Int Fail for VideoPlayBackForSleepWake() ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10F_Int Fail for VideoPlayBackForSleepWake()");
			System.out.println("Final Message: Fail Test10F_Int Fail for VideoPlayBackForSleepWake()");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		isPaused = true;
		try {
			//launch file manager application select uInternal storage-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
			logger.info("launch file manager application select Internal storage-->DCIM folder-->Camera folder-->Select all front camera videos create Test10F_Int and cut paste all videos in Test10F_Int folder");
			System.out.println("launch file manager application select Internal storage-->DCIM folder-->Camera folder-->Select all front camera videos create Test10F_Int folder and cut paste all videos in Test10F_Int folder");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If file manager permission request access accept allow permission
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select camera folder
			logger.info("Select Camera folder");
			System.out.println("Select Camera folder");
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
			logger.info("Select Internal storage");
			System.out.println("select Internal storage");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Name folder as Test10F_Int");
			System.out.println("Name folder as Test10F_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10F_Int");
			TimeUnit.SECONDS.sleep(5);
			//Click Create option
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result = "Pass";
			if(Result == "Pass")
			{
				Result = "Pass";
				logger.info("Pass: Test10F_Int Pass for data move operation successfully");	
				System.out.println("Pass: Test10F_Int Pass for data move operation successfully");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test10F_Int Fail for data move operation ");
			System.out.println("Fail: Test10F_Int Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}

}