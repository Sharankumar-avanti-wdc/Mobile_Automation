package Nokia_G11_TA1401;

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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
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
	private static final String Result = null;
	// initializing the driver instance
	AppiumDriver<MobileElement> driver;
	private boolean isPaused;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia G11");
		dc.setCapability(MobileCapabilityType.UDID, "PT19655AA1222501419");
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
		logger.info("1.Launch Camera application and start rear camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10 Scenario is as follows");
		System.out.println("1.Launch Camera application and start rear camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		TimeUnit.SECONDS.sleep(5);
			
		//Unlock phone
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//launch camera application for rear camera video recording
			((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.CameraActivity"));
			TimeUnit.SECONDS.sleep(3);
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@text='DENY']")).click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 

			}
			TimeUnit.SECONDS.sleep(2);
			try {
				//Click Ok option
				driver.findElement(By.xpath("//*[@text='OK']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 

			}
			TimeUnit.SECONDS.sleep(2);
			//If location location permission request pop-up exists? select deny option
			System.out.println("If location location permission request pop-up exists? select deny option");
			logger.info("If location location permission request pop-up exists? select deny option");
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Click Ok option
				driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("No location access permission pop-up found : "+exp); 
				System.out.println("No location access permission pop-up found : "+exp); 
			}
			logger.info("Test10_Bcam_res: 2 resolutions supported");
			System.out.println("Test10_Bcam_res: 2 resolutions supported");
			//Switch to Video Tab
			System.out.println("Switch to video mode");
			logger.info("Switch to video mode");
			driver.findElement(By.xpath("//*[@text='Video']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Storage Path
			logger.info("select data storage option");
			System.out.println("select data storage option");
			driver.findElement(By.xpath("//*[@text='Data storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select uSD Card as Storage option
			logger.info("select uSD card as storage option");
			System.out.println("select uSD card as storage option");
			driver.findElement(By.xpath("//*[@text='Save in SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//click Back to settings option
			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe and Search for Video resolution
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video Resolution\"))"));

			//Click on Video Resolution
			logger.info("select video resolution option");
			System.out.println("select video resolution option");
			driver.findElement(By.xpath("//*[@text='Video Resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video from rear camera
			logger.info("select Video from rear camera option");
			System.out.println("select Video from rear camera option");
			driver.findElement(By.xpath("//*[@text='Video from rear camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution 
			logger.info("select first highest rear camera video resolution: FHD 1080P");
			System.out.println("select first highest rear camera video resolution: FHD 1080P");
			driver.findElement(By.xpath("//*[@bounds='[80,720][640,804]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			System.out.println("recordingDurationRear = "+ recordingDurationRear);
			int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
			//Start Recording
			logger.info("Start recording");
			System.out.println("Start recording");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			logger.info("Stop recodring");
			System.out.println("Stop recording");
			driver.findElement(By.xpath("//*[@content-desc='Shutter']")).click();
			TimeUnit.SECONDS.sleep(3);
			//click Back to settings option
			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe and Search for Video resolution
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video Resolution\"))"));

			//Click on Video Resolution
			logger.info("select video resolution option");
			System.out.println("select video resolution option");
			driver.findElement(By.xpath("//*[@text='Video Resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video from rear camera
			logger.info("select Video from rear camera option");
			System.out.println("select Video from rear camera option");
			driver.findElement(By.xpath("//*[@text='Video from rear camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution 
			logger.info("select second highest rear camera video resolution:HD 720P");
			System.out.println("select second highest rear camera video resolution: HD 720P");
			driver.findElement(By.xpath("//*[@bounds='[80,804][640,888]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			System.out.println("recordingDurationRear1 = "+ recordingDurationRear1);
			int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);	
			logger.info("Start Recording");
			System.out.println("Start recording");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			logger.info("Stop recodring");
			System.out.println("Stop recording");
			driver.findElement(By.xpath("//*[@content-desc='Shutter']")).click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(3);
			//Switch to photo mode 
			System.out.println("Switch to photo mode");
			logger.info("Switch to photo mode");
			driver.findElement(By.xpath("//*[@text='Photo']")).click();
			TimeUnit.SECONDS.sleep(3);
			//TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Rear video recording is successfull");
			System.out.println("Pass: Rear video recording is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			//Launch File manager
			logger.info("Launch file manager application and verify recorded video present  in uSD Card");
			System.out.println("Launch file manager application and verify recorded video present in uSD Card");
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
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
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
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@text='2 selected']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			logger.info("Test10_Bcam_video: 2 videos captured successfully");
			System.out.println("Test10_Bcam_video: 2 videos captured successfully");
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
			//Switch to photo mode 
			System.out.println("Switch to photo mode");
			logger.info("Switch to photo mode");
			driver.findElement(By.xpath("//*[@content-desc='Photo']")).click();
			TimeUnit.SECONDS.sleep(3);
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
	//Launch file manager application,sort highest resolutio recorded video, playback video file, fast forward video file and pause.
	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager for playing highest resolution recorded video from USD, fast forward and pause scenario
		logger.info("Launching file manager application");
		System.out.println("Launch file manager application");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe up and select uSD card
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(3);
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
			//Select Camera folder
			logger.info("Select camera folder");
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
			MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions1.click();
			//Select Sort By 
			logger.info("Select sort by largest file first");
			System.out.println("Select sort by largest file first");
			MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
			Sortby1.click();
			TimeUnit.SECONDS.sleep(3);
			MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Largest first']")); 
			Largest1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Highest resolution video file to play
			logger.info("Click on first file to play highest recorded resolution video file from uSD card");
			System.out.println("Click on first file to play highest recorded resolution video file from uSD card");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
			TimeUnit.SECONDS.sleep(30);
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Click Fast forward button
			logger.info("Fast forward video for 10 seconds");
			System.out.println("Fast forward video for 10 seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			logger.info("Continue video playback");
			System.out.println("Continue video playback");
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			logger.info("Pause video playback");
			System.out.println("Pause video playback");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Recorded Video play back and fast forward successfull ");
			System.out.println("Pass: Recorded Video play back and fast forward successfull ");
			logger.info("Pass: Recorded Video play back and fast forward successfull ");
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
		//Re-launch file manager application and select external storage
		logger.info("Re-launch file manager application and select external storage for playing copied video files");
		System.out.println("Re-launch file manager application and select external storage for playing copied video files");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select external storage");
			System.out.println("Select external storage");
			MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch grid view mode
			logger.info("switch to grid view mode to select Test1 folder");
			System.out.println("switch to grid view mode to select Test1 folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select Test1 folder
			logger.info("Select Test1 folder");
			System.out.println("Select Test1 folder");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select TestFile folder
			logger.info("Select tes_file folder");
			System.out.println("Select test_file folder");
			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
			TestFile.click();
			TimeUnit.SECONDS.sleep(3);
			//Select OneGB folder
			logger.info("Select 1GB folder");
			System.out.println("Select 1GB folder");
			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
			oneGB.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Video folder
			logger.info("Select video folder");
			System.out.println("Select video folder");
			MobileElement Video = driver.findElement(By.xpath("//*[@text='Video']")); 
			Video.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch list view mode
			logger.info("switch to list view mode to select Test1 folder");
			System.out.println("switch to list view mode to select Test1 folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			try {
				//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
				System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback from uSD card(Test-->Videos)");
				driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
				logger.info("Started video playback");
				System.out.println("Started video playback");
				TimeUnit.SECONDS.sleep(20);
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
				//Clikc Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				System.out.println("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				TimeUnit.SECONDS.sleep(20);
				logger.info("Pause video playback");
				System.out.println("Pause video playback");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Pass: 4K Video play back and fast forward is successful ");
				logger.info("Pass: 4K Video play back and fast forward is successful ");
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("Fail:Test10 Fail for 4K video play back "+exp); 
				System.out.println("Fail:Test10 Fail for 4K video play back: "+exp); 
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			try {
				//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
				System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback from uSD card(Test-->Videos)");
				logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback from uSD card(Test-->Videos)");
				driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
				logger.info("Started video playback");
				System.out.println("Started video playback");
				TimeUnit.SECONDS.sleep(20);
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
				//Clikc Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				System.out.println("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				TimeUnit.SECONDS.sleep(20);
				logger.info("Continue video playback");
				System.out.println("continue video playback");
				logger.info("Pause video playback");
				System.out.println("Pause video playback");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				logger.info("Pass: FHD Video play back and fast forward is successful ");
				System.out.println("Pass: FHD Video play back and fast forward is successful ");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			catch(Exception exp)
			{ 
				logger.info("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
				System.out.println("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			logger.info("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
			System.out.println("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	

		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("Final message: Fail Test10 Fail for Playing Copied Video files  and fast forward video play back scenario ");
			System.out.println("Final message: Fail Test10 Fail for Playing Copied Video files and fast forward video play back scenario ");
			logger.info("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
	} 
	public void DataMoveOperation() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		
		isPaused = true;
		String Result = null;
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


