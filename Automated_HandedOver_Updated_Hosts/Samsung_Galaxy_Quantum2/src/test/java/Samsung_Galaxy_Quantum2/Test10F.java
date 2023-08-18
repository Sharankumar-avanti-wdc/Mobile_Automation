package Samsung_Galaxy_Quantum2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
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

public class Test10F
{
	// initializing the driver instance and declarind desired capabilities
	private static final String Pass = null;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Quantum2");
		dc.setCapability(MobileCapabilityType.UDID, "R5CR315JDCJ");
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
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10F Scenario is as follows");
		logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback front Highest recorded video for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		logger.info("3.Move front camera recorded video files to Test10F folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F Scenario is as follows");
		System.out.println("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		System.out.println("3.Move front camera recorded video files to Test10F folder");
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
		TimeUnit.SECONDS.sleep(5);
		//Launch home screen
		logger.info("Launch Home screen");
		System.out.println("Launch Home screen");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		// open the recently opened apps screen
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch Camera Application for front camera video recording
		try {
			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));

			//If Change to SD Card notification pop-up exists select Cancel Option
			logger.info("If change to uSD card pop-up exists select Cancel");
			System.out.println("If change to uSD card pop-up exists select Cancel");
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
			logger.info("If Location access Permission Request Pop Exists Click on Cancel. ");
			System.out.println("If Location access Permission Request Pop Exists Click on Cancel. ");
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
				TimeUnit.SECONDS.sleep(2);
			}
			catch(Exception exp)
			{
				// Block of code to handle errors
				logger.info("Location access pop-up  not found : "+exp);
				System.out.println("Location access pop-up  not found : "+exp);
			}
			//mention default resolution
			logger.info("Test10F_Fcam_res: 4 resolutions supported");
			System.out.println("Test10F_Fcam_res: 4 resolutions supported");
			//Switch to front camera mode
			logger.info("Switch to front camera mode");
			System.out.println("Switch to front camera mode");
			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@bounds='[762,2037][912,2187]']"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToFrontCamera.click();
			// click on video tab
			logger.info("Switch to video mode");
			System.out.println("Switch to video mode");
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@text='Go to Settings']"));
			TimeUnit.SECONDS.sleep(5);
			Settings.click();
			//Swipe Up and Search for Storage Option and Click
			logger.info("Swipe up and Select Storage location");
			System.out.println("Swipe up and Select Storage location");
			String text = "Storage location";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select uSD card as Storage option");
			System.out.println("Select uSD card as Storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//1st resolution
			//Click On Rear Video size to select resolution
			logger.info("Select front video size");
			System.out.println("Select front video size");
			MobileElement frontVideoSize = driver.findElement(By.xpath("//*[@text='Front camera video size']"));
			frontVideoSize.click();
			//Select 1st resolution
			logger.info("Select First frnt video Resolution: FHD(60 fps)");
			System.out.println("Select First front video resolution: FHD(60 fps)");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[381,110][525,254]']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			// Load properties file
			Properties prop = new Properties();
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationfront = prop.getProperty("recordingDurationfront");
			System.out.println("recordingDurationfront = "+ recordingDurationfront + "Sec");
			int recordingDurationfrontInt=Integer.parseInt(recordingDurationfront);
			//Start Recording
			logger.info("Start front video recording");
			System.out.println("Start front video recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(6);

			//2nd resolution
			//Click On Rear Video size to select resolution
			logger.info("Select front Video size");
			System.out.println("Select front Video size");
			MobileElement frontVideoSize1 = driver.findElement(By.xpath("//*[@text='Front camera video size']"));
			frontVideoSize1.click();
			//Select 2nd resolution
			logger.info("Select second front Video Resolution:UHD 30");
			System.out.println("Select second front Video Resolution:UHD 30");
			MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[207,110][351,254]']"));
			SecondRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationfront1 = prop.getProperty("recordingDurationfront1");
			System.out.println("recordingDurationfront1 = "+ recordingDurationfront1 + "Sec");
			int recordingDurationfront1Int=Integer.parseInt(recordingDurationfront1);
			//Start Recording
			logger.info("Start front video recording");
			System.out.println("Start front video recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(recordingDurationfront1Int);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']"));
			StopRecording1.click();

			//3rd resolution
			//Click On Rear Video size to select resolution
			logger.info("Select front Video size");
			System.out.println("Select front Video size");
			MobileElement RearVideoSize2 = driver.findElement(By.xpath("//*[@text='Front camera video size']"));
			RearVideoSize2.click();
			logger.info("Select Third Front Video Resolution: FHD 30");
			System.out.println("Select Third front Video Resolution: FHD 30");
			//Select 3rd resolution
			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@bounds='[555,110][699,254]']"));
			ThirdRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationfront2 = prop.getProperty("recordingDurationfront2");
			System.out.println("recordingDurationfront2 = "+recordingDurationfront2 + "Sec");
			int recordingDurationfront2Int=Integer.parseInt(recordingDurationfront2);
			//Start Recording
			logger.info("Start front video recording");
			System.out.println("Start front video recording");
			MobileElement StartRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
			StartRecording2.click();
			TimeUnit.SECONDS.sleep(recordingDurationfront2Int);
			//Stop Recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			MobileElement StopRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']"));
			StopRecording2.click();

			//4th resolution
			//Click On Rear Video size to select resolution
			logger.info("Select front Video size");
			System.out.println("Select front Video size");
			MobileElement RearVideoSize3 = driver.findElement(By.xpath("//*[@text='Front camera video size']"));
			RearVideoSize3.click();
			logger.info("Select Fourth front Video Resolution: HD 30");
			System.out.println("Select Fourth front Video Resolution: HD 30");
			//Select 3rd resolution
			MobileElement FourthRes = driver.findElement(By.xpath("//*[@bounds='[729,110][873,254]']"));
			FourthRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String recordingDurationfront3 = prop.getProperty("recordingDurationfront3");
			System.out.println("recordingDurationfront3 = "+ recordingDurationfront3 + "Sec");
			int recordingDurationfront3Int=Integer.parseInt(recordingDurationfront3);
			//Start Recording
			logger.info("Start front video recording");
			System.out.println("Start front video recording");
			MobileElement StartRecording3 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
			StartRecording3.click();
			TimeUnit.SECONDS.sleep(recordingDurationfront3Int);
			//Stop Recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			MobileElement StopRecording3 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']"));
			StopRecording3.click();
			TimeUnit.SECONDS.sleep(15);
			//Switch to defalut Photo mode
			logger.info("Switch to defalut Photo mode");
			System.out.println("Switch to defalut Photo mode");
			driver.findElement(By.xpath("//*[@text='PHOTO']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Switch to defalut back camera mode
			logger.info("Switch to defalut back camera mode");
			System.out.println("Switch to defalut back camera  mode");
			driver.findElement(By.xpath("//*[@bounds='[762,2037][912,2187]']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Front video recording is successfull");
			System.out.println("Pass: Front video recording is successfull");
			//Launch File manager
			logger.info("Launch file manager application and verify recorded video capture uSD Card");
			System.out.println("Launch file manager application and verify recorded video capture uSD Card");
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
			MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
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
			driver.findElement(By.xpath("//*[@text='4 selected']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			logger.info("Test10F_Fcam_video: 4 videos captured successfully");
			System.out.println("Test10F_Fcam_video: 4 videos captured successfully");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling VideoPlayBack()
			logger.info("Calling VideoPlayBackForSleepWake()");
			System.out.println("Calling VideoPlayBackForSleepWake()");
			VideoPlayBackForSleepWake();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Test10F Fail for front camera video recording ");
			System.out.println("Fail: Test10F Fail for front camera video recording ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling DataMoveOperation
			logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
			System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10F Fail for front camera video recording");
			System.out.println("Final Message: Fail Test10F Fail for front camera video recording");
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
	@SuppressWarnings("deprecation")
	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//launch home screen
		logger.info("launch home screen");
		System.out.println("launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		// open the recently opened apps screen
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		logger.info("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		System.out.println("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select External Storage
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView"));
			Ext.click();
			TimeUnit.SECONDS.sleep(5);
			MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
			//Select DCIM folder
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
			//Select more option
			logger.info("Select more options");
			System.out.println("Select more options");
			MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(5);
			//Select sort by
			logger.info("Select Sort by Newest date first");
			System.out.println("Select Sort by Newest date first");
			MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']"));
			Sortby1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Sort by Newest date first
			logger.info("Select Sort by Newest date first");
			System.out.println("Select Sort by Newest date first");
			MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Newest date first']"));
			Largest1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Highest resolution video file to play
			logger.info("Click on first file to play highest recorded resolution video file from uSD");
			System.out.println("Click on first file to play highest recorded resolution video file from uSD");
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
			((AndroidDriver) driver).lockDevice();
			TimeUnit.SECONDS.sleep(30);
			//Unlocking Device
			logger.info("Unlock Mobile ");
			System.out.println("Unlock Mobile");
			((LocksDevice) driver).unlockDevice();
			TimeUnit.SECONDS.sleep(5);
			//Playback video from pause video duration
			logger.info("Playback video from pause video duration");
			System.out.println("Playback video from pause video duration");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(30);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
			System.out.println("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling DataMoveOperation
			logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
			System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test10 Fail for Data Move Operation");
				logger.info("Final Message: Fail Test10 Fail for Data Move Operation");
			}
			else {
				logger.info("Final Message: Pass Test10F Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
				System.out.println("Final Message: Pass Test10F Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
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
		isPaused = true;
		//Launching  home screen
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10F folder and cut paste all videos in Test10F folder
			logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10F and cut paste all videos in Test10F folder");
			System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test10F folder and cut paste all videos in Test10F folder");
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
			MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			MobileElement element2 = driver.findElement(MobileBy.AndroidUIAutomator(
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
			//Click uSD Card
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
			logger.info("Name folder as Test10F");
			System.out.println("Name folder as Test10F");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10F");
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