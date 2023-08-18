package Nokia_G10;

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
	// initializing the driver instance and declarind desired capabilities
	private static final String Pass = null;
	AppiumDriver<MobileElement> driver;
	private String Result;
	private boolean isPaused;
	private static final String True = null;
	private static final Object DataMoveOperation = null;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia G10");
		dc.setCapability(MobileCapabilityType.UDID, "PT99652EA1142600409");
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
		logger.info("4. Move recorded rear camera video files to Test10 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10 Scenario is as follows");
		System.out.println("1.Launch Camera application and start rear camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		System.out.println("4.Move recorded rear camera video files to Test10 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		TimeUnit.SECONDS.sleep(5);
		//Unlocking Phone if locked
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(2);
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		//Launch Camera Application for rear camera video recording
		logger.info("Launch Camera Application for rear camera video recording");
		System.out.println("Launch Camera Application for rear camera video recording");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.CameraActivity"));

			//If Permission request pop-up exists allow permissons
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Click Ok option
				driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
				TimeUnit.SECONDS.sleep(3);
				//driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
				//TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 

			}
			TimeUnit.SECONDS.sleep(2);
			//Mention default resolution
			logger.info("Test10_Bcam_res: 2 resolutions supported");
			System.out.println("Test10_Bcam_res: 2 resolutions supported");
			// Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			driver.findElement(By.xpath("//*[@text='Video']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings and set uSD card as storage option
			logger.info("Click On Settings and set uSD card as storage option");
			System.out.println("Click On Settings and set uSD card as storage option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select Data  storage option
			logger.info("Select storage location option");
			System.out.println("Select storage location option");
			driver.findElement(By.xpath("//*[@text='Data storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select uSD card as storage option
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			driver.findElement(By.xpath("//*[@text='Save in SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//1st resoulution
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe Up and select Video Resolution
			logger.info("Swipe Up and select Video Resolution option");
			System.out.println("Swipe Up and select Video Resolution option");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video Resolution\"))"));
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video Resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video from rear camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select First back video Resolution: FHD(60 fps)");
			System.out.println("Select First Back video resolution: FHD(60 fps)");
			driver.findElement(By.xpath("//*[@bounds='[80,722][640,806]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			System.out.println("recordingDurationRearExt = "+ recordingDurationRear + "Sec");
			int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			//StartRecording.click();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			//MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StopRecording.click();
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(2);
			
			//Select 2nd Resolution
			//Click On Settings option to select rear video resolution
			logger.info("Click On Settings option to select rear video resolution");
			System.out.println("Click On Settings option to select rear video resolution");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe Up and select Video Resolution
			logger.info("Swipe Up and select Video Resolution option");
			System.out.println("Swipe Up and select Video Resolution option");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video Resolution\"))"));
			//Click On Rear Video size to select resolution
			logger.info("Select Video Resolution");
			System.out.println("Select Video Resolution");
			driver.findElement(By.xpath("//*[@text='Video Resolution']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Rear video size");
			System.out.println("Select Rear video size");
			driver.findElement(By.xpath("//*[@text='Video from rear camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select second back video Resolution: HD 720P");
			System.out.println("Select second Back video resolution: HD 720P");
			driver.findElement(By.xpath("//*[@bounds='[80,806][640,890]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			System.out.println("recordingDurationRear1 = "+ recordingDurationRear1 + "Sec");
			int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);	
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			logger.info("Start Recording");
			//MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StartRecording1.click();
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(2);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			//MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
			//StopRecording1.click();
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(2);
			//Click On photo mode
			logger.info("Switch to defalut Photo mode");
			System.out.println("Switch to defalut Photo mode");
			driver.findElement(By.xpath("//*[@text='Photo']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			logger.info("Pass: Rear video recording is successfull");
			System.out.println("Pass: Rear video recording is successfull");
			//launch file manager application and verify recorded video files in uSD card
			logger.info("Launch File Manager Application to verify captured videos");
			System.out.println("Launch File Manager Application to verify captured videos");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
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
			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='2 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Test10_Bcam_video: 2 Videos captured successfully");
			System.out.println("Test10_Bcam_video: 2 Videos captured successfully");
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
			//Calling DataMoveOperation
			logger.info("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder");
			System.out.println("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10 Fail for Rear camera video recording");
			System.out.println("Final Message: Fail Test10 Fail for Rear camera video recording");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
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
	}
	//Calling video playback() for Playing Highest record video, fast forward video play back
	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		try {
			//Launch Camera Application for rear camera video recording
			logger.info("Launch Camera Application to play recorded video play back from rear camera video recording");
			System.out.println("Launch Camera Application to play recorded video play back from rear camera video recording");
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
				System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				logger.info("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				CopiedvideosPlayBack();	
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test10 Fail for RecordedVideoPlayBack()");
			System.out.println("Fail: Test10 Fail for RecordedVideoPlayBack()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			System.out.println("Calling DataMoveOperation() to move all rear camera recorded video files to Test10 folder");
			logger.info("Calling DataMoveOperation() to move all rear camera recorded video files to Test10 folder");
			DataMoveOperation();
			System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
			logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
		logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Scroll Up to find SD card
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select external storage");
		System.out.println("Select external storage");	
		MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='SD card']"));
		SDCard.click();
		TimeUnit.SECONDS.sleep(3);
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
			driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
			logger.info("Started video playback");
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: 4K Video play back and fast forward is successful ");
			System.out.println("Pass: 4K Video play back and fast forward is successful ");
			TimeUnit.SECONDS.sleep(3);
		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test10 Fail for 4K video play back "+exp); 
			System.out.println("Fail: Test10 Fail for 4K video play back: "+exp); 
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		try {
			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
			TimeUnit.SECONDS.sleep(20);
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
			logger.info("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
			System.out.println("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
			System.out.println("Fail: Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
			logger.info("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
			System.out.println("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
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
			//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 folder and cut paste all videos in Test10 folder
			logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 and cut paste all videos in Test10 folder");
			System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test10 folder and cut paste all videos in Test10 folder");
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
			//Select Browse option
			logger.info("click on browse option");
			System.out.println("click on browse option");
			driver.findElement(By.xpath("//*[@text='Browse']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
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
			//Click  uSD Card
			logger.info("Select uSD Card");
			System.out.println("select uSD Card");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
			//Click ADD NEW Folder option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
            //set folder name
			logger.info("Name folder as Test10");
			System.out.println("Name folder as Test10");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10");
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

			Result = "Pass";
			if(Result == "Pass")
			{
				logger.info("Pass: Test10 Pass for data move operation successfully");	
				System.out.println("Pass: Test10 Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test10 Fail for data move operation ");
			System.out.println("Fail: Test10 Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}
