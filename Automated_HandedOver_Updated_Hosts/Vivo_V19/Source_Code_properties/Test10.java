package Vivo_V19_1933;
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1933");
		dc.setCapability(MobileCapabilityType.UDID, "39a79e47");
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
		logger.info("4. Move rear camera recorded video from External storage to Test10 folder in external storage");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10 Scenario is as follows");
		System.out.println("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		System.out.println("4. Move rear camera recorded video from External storage to Test10 folder in external storage");
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
		((StartsActivity) driver).startActivity(new Activity("com.bbk.launcher2", "com.bbk.launcher2.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		//Clear recent apps if open apps in background
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		try {
			MobileElement  Clear =	driver.findElement(By.xpath("//*[@bounds='[83,1997][997,2151]']"));
			Clear.click();
			TimeUnit.SECONDS.sleep(3);
		}
		catch (Exception e) {
			logger.info("No recent apps found in background");
			System.out.println("No recent apps found in background");
		}


		try {
			//Launch Camera application for rear camera video recording.
			logger.info("Launch Camera application for rear camera video recording");
			System.out.println("Launch Camera application for rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.CameraActivity"));
			TimeUnit.SECONDS.sleep(6);
			//Declaring total number of rear camera video resolution supported
			logger.info("Test10_Bcam_res: 6 resolutions supported");
			System.out.println("Test10_Bcam_res: 6 resolutions supported");

			try 
			{ 		//If location permission access pop-up exists select Dont Allow option
				logger.info("If location permission access pop-up exists select Dont Allow option");
				System.out.println("If location permission access pop-up exists select Dont Allow option");
				MobileElement Cancel = driver.findElement(By.xpath("//*[@text='Cancel']"));
				Cancel.click();
				TimeUnit.SECONDS.sleep(5);

			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}
			
			
			
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			//Swipe Up and Search for Storage Option and Click 
			
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			//Switch to video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(785, 1789)).perform();
			TimeUnit.SECONDS.sleep(5);
			
			//Click on settings option 
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			//Recording rear camera video with frame rate 30FPS supported resolutions
			logger.info("Recording rear camera video with frame rate 30FPS supported resolutions");
			System.out.println("Recording rear camera video with frame rate 30FPS supported resolutions");
			//select frame rate 60FPS
			logger.info("Select frame rate option");
			System.out.println("Select frame rate option");
			MobileElement FrameRate = driver.findElement(By.xpath("//*[@text='Frame rate']"));
			FrameRate.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select first highest frame rate
			logger.info("Select frame rate option");
			System.out.println("Select frame rate option");
			MobileElement FrameRate60FPS = driver.findElement(By.xpath("//*[@text='60 fps']"));
			FrameRate60FPS.click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings4 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings4.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Rear Video size to select resolution
			MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			RearVideoSize.click();
			//Select first resolution
			logger.info("Select first highest rear camera video resolution: 4K");
			System.out.println("Select first highest rear camera video resolution: 4K");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='4K']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file for video recording duration
			Properties prop = new Properties();
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			System.out.println("recordingDurationRear = "+ recordingDurationRear + " Seconds");
			int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	

			// Click Start video recording for specified duration time
			logger.info("Start video recording for specified duration time");
			System.out.println("Start video recording for specified duration time");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(recordingDurationRearInt);

			//Stop video recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//click Back to settings option
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings2.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Rear Video size to select resolution
			MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			RearVideoSize1.click();
			//Select first resolution
			logger.info("Select second highest rear camera video resolution: 1080p");
			System.out.println("Select second highest rear camera video resolution: 1080p");
			MobileElement SecRes = driver.findElement(By.xpath("//*[@text='1080p']"));
			SecRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			System.out.println("recordingDurationRear1 = "+ recordingDurationRear1 +" Seconds");
			int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);

			//Start recording
			logger.info("Start Recording second resolution video for specified duration time");
			System.out.println("Start Recording second resolution video time");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear1Int);

			//Stop recording
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording1.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop Recording");
			System.out.println("Stop Recording");

			//click Back to settings option
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings3.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Rear Video size to select resolution
			MobileElement RearVideoSize2 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			RearVideoSize2.click();
			//Select first resolution
			logger.info("Select third highest rear camera video resolution: 720p");
			System.out.println("Select third highest rear camera video resolution: 720p");
			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='720p']"));
			ThirdRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			System.out.println("recordingDurationRear2 = "+ recordingDurationRear2 + "Seconds");
			int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);

			//Start recording
			logger.info("Start Recording Third resolution video for specified duration time");
			System.out.println("Start Recording Third resolution video time");
			MobileElement StartRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording2.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear2Int);

			//Stop recording
			MobileElement StopRecording2= driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording2.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			MobileElement Settings10 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings10.click();
			//select frame rate 30FPS
			logger.info("Select frmate rate option");
			System.out.println("Select frame rate option");
			MobileElement FrameRate1 = driver.findElement(By.xpath("//*[@text='Frame rate']"));
			FrameRate1.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select first highest frame rate
			logger.info("Select frmate rate 30FPS ");
			System.out.println("Select frame rate 30FPS");
			MobileElement FrameRate30FPS = driver.findElement(By.xpath("//*[@text='30 fps']"));
			FrameRate30FPS.click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings5 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings5.click();
			TimeUnit.SECONDS.sleep(5);
			
			

			//Click On Rear Video size to select resolution
			MobileElement RearVideoSize3 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			RearVideoSize3.click();
			//Select first resolution
			logger.info("Select first highest rear camera video resolution: 4K");
			System.out.println("Select first highest rear camera video resolution: 4K");
			MobileElement FirstRes30FPS = driver.findElement(By.xpath("//*[@text='4K']"));
			FirstRes30FPS.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file for video recording duration
			Properties prop3 = new Properties();
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear3 = prop.getProperty("recordingDurationRear3");  
			System.out.println("recordingDurationRear3 = "+ recordingDurationRear3 + " Seconds");
			int recordingDurationRear3Int=Integer.parseInt(recordingDurationRear3);	

			// Click Start video recording for specified duration time
			logger.info("Start video recording for specified duration time");
			System.out.println("Start video recording for specified duration time");
			MobileElement StartRecording3 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording3.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear3Int);

			//Stop video recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording3 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording3.click();
			TimeUnit.SECONDS.sleep(5);
			//click Back to settings option
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings7 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings7.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Rear Video size to select resolution
			MobileElement RearVideoSize4 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			RearVideoSize4.click();
			//Select first resolution
			logger.info("Select second highest rear camera video resolution: 1080p");
			System.out.println("Select second highest rear camera video resolution: 1080p");
			MobileElement SecRes30FPS = driver.findElement(By.xpath("//*[@text='1080p']"));
			SecRes30FPS.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear4 = prop.getProperty("recordingDurationRear4");  
			System.out.println("recordingDurationRear4 = "+ recordingDurationRear4 +" Seconds");
			int recordingDurationRear4Int=Integer.parseInt(recordingDurationRear4);

			//Start recording
			logger.info("Start Recording second resolution video for specified duration time");
			System.out.println("Start Recording second resolution video time");
			MobileElement StartRecording4 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording4.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear4Int);

			//Stop recording
			MobileElement StopRecording4 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording4.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop Recording");
			System.out.println("Stop Recording");

			//click Back to settings option
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings8 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/camera_setting_button']"));
			Settings8.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Rear Video size to select resolution
			MobileElement RearVideoSize5 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			RearVideoSize5.click();
			//Select first resolution
			logger.info("Select third highest rear camera video resolution: 720p");
			System.out.println("Select third highest rear camera video resolution: 720p");
			MobileElement ThirdRes30FPS = driver.findElement(By.xpath("//*[@text='720p']"));
			ThirdRes30FPS.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationRear5 = prop.getProperty("recordingDurationRear5");  
			System.out.println("recordingDurationRear5 = "+ recordingDurationRear5 + " Seconds");
			int recordingDurationRear5Int=Integer.parseInt(recordingDurationRear5);

			//Start recording
			logger.info("Start Recording Third resolution video for specified duration time");
			System.out.println("Start Recording Third resolution video time");
			MobileElement StartRecording5 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StartRecording5.click();
			TimeUnit.SECONDS.sleep(recordingDurationRear5Int);

			//Stop recording
			MobileElement StopRecording5= driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']"));
			StopRecording5.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			// Switch to default photo mode
			logger.info("Switch to photo mode");
			System.out.println("Switch to photo mode");
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(288, 1789)).perform();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Rear video recording is successfull");
			System.out.println("Pass: Rear video recording is successfull");
			//launch file manager application and verify recorded video files in uSD card
			logger.info("Launch File Manager Application to verify captured videos");
			System.out.println("Launch File Manager Application to verify captured videos");
			logger.info("launch file manager application and verify data");
			System.out.println("launch file manager application and verify data");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
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
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='6 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Test10_Bcam_video: 6 Videos captured successfull");
			System.out.println("Test10_Bcam_video: 6 Videos captured successfull");
			logger.info("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
			System.out.println("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
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


	}
	//Calling video playback() for Playing Highest record video, fast forward video play back
	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		String Result = "Pass";
		//Launch home screen
		((StartsActivity) driver).startActivity(new Activity("com.bbk.launcher2", "com.bbk.launcher2.Launcher"));
		TimeUnit.SECONDS.sleep(5);

		try {
			//Launch Camera Application for rear camera video recording
			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//Swipe up and select uSD Card
			logger.info("Swipe up and select uSD card");
			System.out.println("Swipe up and select uSD card");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']"));
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
			MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Largest first']")); 
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Recorded Video playback and fast forward scenario successfull");
			System.out.println("Pass: Recorded Video playback and fast forward scenario successfull");
			System.out.println("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder ");
			logger.info("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder");
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

		//launch home screen
		((StartsActivity) driver).startActivity(new Activity("com.bbk.launcher2", "com.bbk.launcher2.Launcher"));
		//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
		logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);

		////Scroll Up to find SD card
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select external storage");
		System.out.println("Select external storage");	

		driver.findElement(By.xpath("//*[@text='SD card']")).click();
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
			logger.info("Started video playback");
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
			logger.info("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
			System.out.println("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
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

		//Launching  home screen
		//((StartsActivity) driver).startActivity(new Activity("com.motorola.launcher3", "com.android.launcher3.CustomizationPanelLauncher"));
		TimeUnit.SECONDS.sleep(5);



		try {
			//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
			logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 and cut paste all videos in BCFC_Cameravideos folder");
			System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test10 folder and cut paste all videos in BCFC_Cameravideos folder");


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
			TimeUnit.SECONDS.sleep(90);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");


			//logger.info("Pass: Test10 Datamove of videos files operation completed successfully");
			//System.out.println("Pass: Test10 Datamove of videos files operation completed successfully");
			//logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			

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