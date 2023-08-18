package Realme_Q3S_RMX3461;
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
import Realme_Q3S_RMX3461.Test10;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
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

public class Test10F
{
	// initializing the driver instance
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme Q3s");
		dc.setCapability(MobileCapabilityType.UDID, "c50c4356");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public String runadbcmd(String cmd) throws IOException, InterruptedException 
	{

		System.out.println("Running adb command");
		String line = "null";
		String tosend="";

		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd);
		//Using this command to clear recent apps
		pr.waitFor();

		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		while ((line=buf.readLine())!=null) {
			tosend=line;
			System.out.println(line);
		}
		return tosend;

	}

	@Test
	public void rearVideoRec() throws InterruptedException, SecurityException, IOException {
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
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F Scenario is as follows");
		System.out.println("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		TimeUnit.SECONDS.sleep(5);

		//Unlock device
		((LocksDevice) driver).unlockDevice();
		//Launch Home screen 
		logger.info("Launch home screen application");
		System.out.println("Launch home screen application");
		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);


		//Launch camera application for rear camera video capture
		logger.info("Launch camera application for front camera video capture");
		System.out.println("Launch camera application for front camera video capture");
		logger.info("Test10F_FCam_res: 2 resolutions supported");
		System.out.println("Test10F_FCam_res: 2 resolutions supported");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));


			// Switch to Video mode
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TimeUnit.SECONDS.sleep(5);
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(336, 1777)).perform();
			TimeUnit.SECONDS.sleep(5);
			//Switch to front camera mode
			logger.info("Switch to front camera mode");
			MobileElement SwitchFrontCameraMode = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/switch_camera_button']"));
			SwitchFrontCameraMode.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On front camera video size to select resolution
			//Select Settings option
			logger.info("click on settings");
			System.out.println("click on settings");
			//MobileElement Settings1 = driver.findElement(By.xpath("//*[@bounds='[684,0][801,240]']"));
			//Settings1.click();
			TimeUnit.SECONDS.sleep(5);

			//Select First resolution
			logger.info("Select first highest front camera Video Resolution:Rear camera video size, 1080P");
			System.out.println("Select first highest front camera Video Resolution:Rear camera video size, 1080P");
			//Select 1st resolution
			//MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='1080P']"));
			//FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			Properties prop = new Properties();
			prop.load(Test10F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationfront = prop.getProperty("recordingDurationfront");  
			System.out.println("recordingDurationfront = "+ recordingDurationfront + " Seconds");
			int recordingDurationfrontInt=Integer.parseInt(recordingDurationfront);	

			//Start Recording
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TimeUnit.SECONDS.sleep(6);
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
			//Stop Recording
			TimeUnit.SECONDS.sleep(3);
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording =  driver.findElement(By.xpath("//*[@bounds='[423,1932][657,2166]']"));
			StopRecording.click();
			//Select 2nd resolution
			TimeUnit.SECONDS.sleep(3);
			logger.info("click on settings");
			System.out.println("click on settings");
			//MobileElement Settings6 = driver.findElement(By.xpath("//*[@bounds='[684,0][801,240]']"));
			//Settings6.click();
			TimeUnit.SECONDS.sleep(5);

			//Select 2nd resolution
			logger.info("Select second resolution");
			System.out.println("Select second resolution");
			//MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='720P']"));
			//SecondRes.click();

			// Load properties file
			Properties prop1 = new Properties();
			prop.load(Test10F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationfront1 = prop.getProperty("recordingDurationfront1");  
			System.out.println("recordingDurationfront1 = "+ recordingDurationfront1 + " Seconds");
			int recordingDurationfront1Int=Integer.parseInt(recordingDurationfront1);

			//Start Recording
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			TimeUnit.SECONDS.sleep(5);
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(recordingDurationfront1Int);
			MobileElement StopRecording1 =  driver.findElement(By.xpath("//*[@bounds='[423,1932][657,2166]']"));
			StopRecording1.click();
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			//Switch to Rear camera mode
			logger.info("Switch to Rear camera mode");
			System.out.println("Switch to Rear camera  mode");
			MobileElement SwitchRearCameraMode = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/switch_camera_button']"));
			SwitchRearCameraMode.click();



			//switch back to photo mode
			logger.info("Switch photo mode");
			System.out.println("Switch photo mode");
			TimeUnit.SECONDS.sleep(5);
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(764, 1782)).perform();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//launch file manager application and verify recorded video files in uSD card
			logger.info("Launch file manager application and verify recorded video capture uSD Card");
			System.out.println("Launch file manager application and verify recorded video capture uSD Card");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);


			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click Internal storage
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
			// Select More Options
			logger.info("Select More Options");
			System.out.println("Select More Options");
			TouchAction touchAction2 = new TouchAction(driver);
			touchAction2.tap(PointOption.point(1003, 203)).perform();
			TimeUnit.SECONDS.sleep(5);
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			logger.info("Test10F_Fcam_video: 2 videos captured successfully");
			System.out.println("Test10F_Fcam_video: 2 videos captured successfully");
			logger.info("Pass: Test10F pass for front camera video recording");
			System.out.println("Pass: Test10F pass for front camera video recording");
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

			logger.info("Calling VideoPlayBackForSleepWake()");
			System.out.println("Calling VideoPlayBackForSleepWake()");
			VideoPlayBackForSleepWake();





		}

		catch (Exception e) {
			logger.info("Fail: Test10F for Front camera video recording");
			logger.info("Final Message: Fail Test10F Fail fro Front camera video recording");
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
	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException {

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		logger.info("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		System.out.println("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		//((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
		//	TimeUnit.SECONDS.sleep(5);


		try {
			//Re-launch files application
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			System.out.println("Launching file manager application");

			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
			Ext.click();
			TimeUnit.SECONDS.sleep(5);

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
			// Select More Options
			logger.info("Select More Options");
			System.out.println("Select More Options");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(1003, 203)).perform();
			TimeUnit.SECONDS.sleep(5);

			//Select sort by		
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
			logger.info("Click on first file to play highest recorded resolution video file from uSD card");
			System.out.println("Click on first file to play highest recorded resolution video file from uSD card");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
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
			TimeUnit.SECONDS.sleep(30);


			//Unlocking Device 
			logger.info("Unlock Mobile ");
			System.out.println("Unlock Mobile");
			logger.info("PlayBack Video from Pause duartion");
			System.out.println("PlayBack Video from Pause duartion");

			logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");


			logger.info("Fast forward video play back for 10 seconds");
			System.out.println("Fast forward video play back for 10 seconds");



			logger.info("Pause video play back");
			System.out.println("Pause video play back");

			// ((AndroidDriver) driver).unlockDevice();
			TimeUnit.SECONDS.sleep(5);
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
			// ((StartsActivity) driver).startActivity(new Activity("com.mi.android.globallauncher", "com.miui.home.launcher.Launcher"));
			//Playback video from pause video duration
			logger.info("Pass: Pass Test10F Pass for Pause Video Playback scenario");
			System.out.println("Pass: Pass Test10F Pass for Pause Video Playback scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
		catch (Exception e) {
			logger.info("Fail: Test10F Fail for VideoPlayBackForSleepWake()");
			System.out.println("Fail: Test10F Fail for VideoPlayBackForSleepWake() ");
			logger.info("Calling Data move operation");
			System.out.println("Calling Data move operation");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			logger.info("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
			System.out.println("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

		//Calling DataMoveOperation() to move front camera recorded videos to Test10F folder
		logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
		System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
		DataMoveOperation();

		logger.info("Final message: Pass Test10F Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
		System.out.println("Final message: Pass Test10F Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
		logger.info("Test:End");
		System.out.println("Test:End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	

	}
	public void DataMoveOperation() throws  IOException, InterruptedException{	   
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
			//Select TestFile folder


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
			logger.info("Select More Options");
			System.out.println("Select More Options");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(1003, 203)).perform();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);


			// Select More Options
			logger.info("Select More Options");
			System.out.println("Select More Options");
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(1003, 203)).perform();
			TimeUnit.SECONDS.sleep(5);

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

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

			logger.info("Test10F: Data move operation completed successfully");
			System.out.println("Test10F: Data move operation completed successfully");
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
				logger.info("Pass: Test10F Pass for data move operation successfully");	
				System.out.println("Pass: Test10F Pass for data move operation successfully");	
			}


		}
		catch (Exception e) {
			e.printStackTrace();
			if (Result == "Fail")
			{
				logger.info("Fail: Test10F Fail for data move operation ");
				System.out.println("Fail: Test10F Fail for data move operation");	
			}

		}

	}  	
}
