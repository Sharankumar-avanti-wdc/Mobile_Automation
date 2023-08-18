package Ikall_Z7;

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

public class Test10_Int
{
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z7");
		dc.setCapability(MobileCapabilityType.UDID, "0123456789ABCDEF");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void rearVideoRec() throws InterruptedException, SecurityException, IOException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test10_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10_Int Scenario is as follows");
		logger.info("1.Launch Camera application and start back camera video recording for all host applicable resolutions in Internal Storage");
		logger.info("2.Playback Highest resolution recorded video from Internal Storage, fast forward playback and pause video scenario ");
		logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		logger.info("4.Move recorded videos from Internal Storage-->DCIM-->Camera folder to Test10_Int folder in Internal Storage");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10_Int Scenario is as follows");
		System.out.println("1.Launch Camera application and start back camera video recording for all host applicable resolutions in Internal Storage");
		System.out.println("2.Playback Highest resolution recorded video from Internal Storage, fast forward playback and pause video scenario ");
		System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		System.out.println("4.Move recorded videos from Internal Storage-->DCIM-->Camera folder to Test10_Int folder in Internal Storage");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Launch Home screen and clear recent apps
		logger.info("Launch Home screen application and clear recent apps");
		System.out.println("Launch Home screen application and clear recent apps");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			logger.info("Record Rear camera videos for all Host resolutions in Internal Mount uSD Card");
			System.out.println("Record Rear camera videos for all Host resolutions in Internal Mount uSD Card");
			TimeUnit.SECONDS.sleep(5);
			//launch camera
			((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Switch to Video Tab
			driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"PhotoMode is previewing\"]/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video Tab");
			System.out.println("Select Video Tab");
			//click Back to settings option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video quality\")").click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video resolution");
			System.out.println("Select Video resolution");
			//Selecting 1st Highest resolution
			driver.findElement(By.xpath("//*[@bounds='[21,118][395,216]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Selecting 1st resolution HD");
			System.out.println("Selecting 1st resolution HD");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			System.out.println("recordingDurationRear = "+ recordingDurationRear);
			int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
			//Start Recording
			logger.info("start recording");
			System.out.println("start recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video\"]"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			//Stop Recording
			logger.info("stop recording");
			System.out.println("stop recording");
			driver.findElement(By.xpath("//*[@bounds='[187,843][292,907]']")).click();
			TimeUnit.SECONDS.sleep(8);
			//Select 2nd Resolution
			//click Back to settings option
			logger.info("Click settings option");
			System.out.println("Click settings option");
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click on Video Resolution
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video quality\")").click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video resolution");
			System.out.println("Select Video resolution");
			//Select 2nd resolution 
			//Selecting 2nd Highest resolution
			driver.findElement(By.xpath("//*[@bounds='[21,217][395,315]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			System.out.println("recordingDurationRear1 = "+ recordingDurationRear1);
			int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);		
			//logger.info("Select Video Tab");
			logger.info("start recording");
			System.out.println("start recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video\"]"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			//Stop Recording
			logger.info("stop recording");
			System.out.println("stop recording");
			driver.findElement(By.xpath("//*[@bounds='[187,843][292,907]']")).click();
			TimeUnit.SECONDS.sleep(8);
			//click Back to settings option
			logger.info("Click settings option");
			System.out.println("Click settings option");
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video quality\")").click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video resolution");
			System.out.println("Select Video resolution");
			//Select 3RD resolution 
			//Selecting 3RD Highest resolution
			driver.findElement(By.xpath("//*[@bounds='[21,316][395,414]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			System.out.println("recordingDurationRear2 = "+ recordingDurationRear2);
			int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);	
			//logger.info("Select Video Tab");
			logger.info("start recording");
			System.out.println("start recording");
			MobileElement StartRecording2 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video\"]"));
			StartRecording2.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear2Int);
			//Stop Recording
			logger.info("stop recording");
			System.out.println("stop recording");
			driver.findElement(By.xpath("//*[@bounds='[187,843][292,907]']")).click();
			TimeUnit.SECONDS.sleep(8);
			//click Back to settings option
			logger.info("Click settings option");
			System.out.println("Click settings option");
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click on Video Resolution
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video quality\")").click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video resolution");
			System.out.println("Select Video resolution");
			//Select 4TH resolution 
			//Selecting 4TH Highest resolution
			driver.findElement(By.xpath("//*[@bounds='[21,415][395,513]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			//logger.info("Select Video Tab");
			prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear3 = prop.getProperty("recordingDurationRear3");  
			System.out.println("recordingDurationRear3 = "+ recordingDurationRear3);
			int recordingDurationRear3Int=Integer.parseInt(recordingDurationRear3);	
			logger.info("start recording");
			System.out.println("start recording");
			MobileElement StartRecording3 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video\"]"));
			StartRecording3.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear3Int);
			//Stop Recording
			logger.info("stop recording");
			System.out.println("stop recording");
			driver.findElement(By.xpath("//*[@bounds='[187,843][292,907]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Rear video recording is successfull");
			System.out.println("Pass: Rear video recording is successfull");
			//launch file manager application and verify recorded video files in uInternal Storage
			logger.info("Launch File Manager Application to verify captured videos in Internal Storage");
			System.out.println("Launch File Manager Application to verify captured videos in Internal Storage");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal Storage");
			System.out.println("Swipe up to select Internal Storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			MobileElement element01 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			//Click External storage
			logger.info("Select Internal Storage");
			System.out.println("Select Internal Storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal Storage']"));
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
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Camera folder
			logger.info("Select camera folder");
			System.out.println("Select camera folder");
			MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
			Camera.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch back to List view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Test10_Int_Bcam_video: 4 Videos captured successfull");
			System.out.println("Test10_Int_Bcam_video: 4 Videos captured successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
			System.out.println("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
			RecordedVideoPlayback();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		}
		catch (Exception e) {
			logger.info("Fail: Test10_Int Fail for Rear camera video recording ");
			System.out.println("Fail: Test10_Int Fail for Rear camera video recording ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMovementOperation() to move recorded rear camer videos to Test10_Int Folder");
			System.out.println("Calling DataMovementOperation() to move recorded rear camer videos to Test10_Int Folder");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10_Int Fail for Rear camera video recording");
			System.out.println("Final Message: Fail Test10_Int Fail for Rear camera video recording");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		}
	}
	//Calling video play back() for Playing Highest record video, fast forward video play back
	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		String Result = "Pass";
		try {
			//Launch Camera Application for rear camera video recording
			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//Swipe up and select uInternal Storage
			logger.info("Swipe up and select Internal Storage");
			System.out.println("Swipe up and select Internal Storage");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select External Storage	
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement Ext = driver.findElement(By.xpath("//*[@text='Internal Storage']"));
			Ext.click();
			TimeUnit.SECONDS.sleep(5);
			//Switch back to grid view mode
			logger.info("switch to grid view mode ");
			System.out.println("switch to gird view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe and select DCIM folder
			logger.info("Swipe up and select DCIM folder");
			System.out.println("Swipe up and select DCIM folder");
			MobileElement element01 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select more options
			logger.info("select more options");
			System.out.println("select more options");
			MobileElement MoreOptions1 = driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Sort By 
			logger.info("Select Sort BY");
			System.out.println("Select Sort BY");
			MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
			TimeUnit.SECONDS.sleep(3);
			Sortby1.click();
			//Select Largest First
			logger.info("Select Largest first");
			System.out.println("Select Largest first");        	
			MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Size (largest first)']")); 
			Largest1.click();
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
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Click Fast forward button
			logger.info("Fast forward video for 10 seconds");
			System.out.println("Fast forward video for 10 seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			logger.info("Continue video playback");
			System.out.println("Continue video playback");
			TimeUnit.SECONDS.sleep(20);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Recorded Video playback and fast forward scenario successfull");
			System.out.println("Pass: Recorded Video playback and fast forward scenario successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			System.out.println("Calling DataMovementOperation() to move recorded rear camer videos to Test10_Int Folder ");
			logger.info("Calling DataMovementOperation() to move recorded rear camer videos to Test10_Int Folder");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test10_Int Fail for RecordedVideoPlayBAck()");
				logger.info("Final Message: Fail Test10_Int Fail for RecordedVideoPlayBAck()");
			}
			else {
				System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				logger.info("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				CopiedvideosPlayBack();	
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test10_Int Fail for RecordedVideoPlayBack()");
			System.out.println("Fail: Test10_Int Fail for RecordedVideoPlayBack()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Calling DataMoveOperation() to move all rear camera recorded video files to Test10_Int folder");
			logger.info("Calling DataMoveOperation() to move all rear camera recorded video files to Test10_Int folder");
			DataMoveOperation();
			System.out.println("Final Message: Fail Test10_Int Fail for RecordedVideoPlayBAck()");
			logger.info("Final Message: Fail Test10_Int Fail for RecordedVideoPlayBAck()");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch file manager application, select uInternal Storage, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
		logger.info("Launch file manager application, select Internal Storage, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		System.out.println("Launch file manager application, select Internal Storage, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find Internal Storage
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
		TimeUnit.SECONDS.sleep(8);
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
		TimeUnit.SECONDS.sleep(5);
		//Select External Storage	
		logger.info("Select external storage");
		System.out.println("Select external storage");	
		driver.findElement(By.xpath("//*[@text='Internal Storage']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Switch back to gird view mode
		logger.info("switch to gird view mode ");
		System.out.println("switch to gird view mode");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
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
		//Switch back to list view mode
		logger.info("switch to list view mode ");
		System.out.println("switch to list view mode");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		try {
			//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
			System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
			logger.info("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
			MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4\"))"));
			logger.info("Started video playback");
			System.out.println("Started video playback");
			driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
			TimeUnit.SECONDS.sleep(20);
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			//driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			//Click Fast forward button
			logger.info("Click fast forward button for 10 seconds video forward");
			System.out.println("Click fast forward button for 10 seconds video forward");
			//driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(10);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: 4K Video play back and fast forward is successful ");
			System.out.println("Pass: 4K Video play back and fast forward is successful ");
			TimeUnit.SECONDS.sleep(3);
		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test10_Int Fail for 4K video play back "+exp); 
			System.out.println("Fail: Test10_Int Fail for 4K video play back: "+exp); 
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		try {
			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
			TimeUnit.SECONDS.sleep(20);
			//Tap Somewhere on Screen for contents to visible on Screen
			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/quick_seek_overlay']")).click();
			//Click Fast forward button
			logger.info("Click fast forward button for 10 seconds video forward");
			System.out.println("Click fast forward button for 10 seconds video forward");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			//click on pause button 
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
			logger.info("Final Message: Pass Test10_Int Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
			System.out.println("Final Message: Pass Test10_Int Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	

		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test10_Int Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
			System.out.println("Fail: Test10_Int Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
			logger.info("Final Message: Fail Test10_Int Fail for CopiedvideosPlayBack()");
			System.out.println("Final Message: Fail Test10_Int Fail for CopiedvideosPlayBack()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
		logger.info("Test: End");
		System.out.println("Test: End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	} 
	public void DataMoveOperation() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//String Result= "Fail";
		isPaused = true;
		try {
			//launch file manager application select uInternal Storage-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
			logger.info("launch file manager application select Internal Storage-->DCIM folder-->Camera folder-->Select all rear camera videos create Test10_Int and cut paste all videos in Test10_Int folder");
			System.out.println("launch file manager application select Internal Storage-->DCIM folder-->Camera folder-->Select all rear camera videos create Test10_Int folder and cut paste all videos in Test10_Int folder");
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
			logger.info("Swipe up to select Internal Storage");
			System.out.println("Swipe up to select Internal Storage");
			MobileElement element0 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(5);

			//Click External storage
			logger.info("Select Internal Storage");
			System.out.println("Select Internal Storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal Storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM folder");
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
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
			logger.info("Select Internal Storage");
			System.out.println("select Internal Storage");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='Internal Storage']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Name folder as Test10_Int");
			System.out.println("Name folder as Test10_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10_Int");
			TimeUnit.SECONDS.sleep(5);
			//Click Create option
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
			Result = "Pass";
			if(Result == "Pass")
			{
				logger.info("Pass: Test10_Int Pass for data move operation successfully");	
				System.out.println("Pass: Test10_Int Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test10_Int Fail for data move operation ");
			System.out.println("Fail: Test10_Int Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}