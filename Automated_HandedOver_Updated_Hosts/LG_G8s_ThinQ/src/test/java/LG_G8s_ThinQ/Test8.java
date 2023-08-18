package LG_G8s_ThinQ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
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

public class Test8
{
	// initializing the driver instance
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "G8S ThinQ");
		dc.setCapability(MobileCapabilityType.UDID, "LMG810EAWef6f059b");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
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
	public void recordAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test8.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter);
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test8 scenario is as follows");
		logger.info("1.Launch mobile default voice recording application and set uSD card storage option, record audio file for 2 minutes duration");
		logger.info("2.Launch file manager application and playback recorded audio file from external storage, fast forward audio file and pause");
		logger.info("3.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8 scenario is as follows");
		System.out.println("1.Launch mobile default voice recording application and set uSD card storage option, record audio file for 2 minutes duration");
		System.out.println("2.Launch file manager application and playback recorded audio file from external storage, fast forward audio file and pause");
		System.out.println("3.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Unlocking Phone if locked
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(2);
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("No recent apps found");
			System.out.println("No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try {
			logger.info("Launch Voice recorder application");
			Reporter.log("launching voice recoreder app!!");
			//if Allow Pop up permissions exists Choose 1st option
			((StartsActivity) driver).startActivity(new Activity("com.lge.hifirecorder", "com.lge.hifirecorder.LaunchHifiRecorder"));
			TimeUnit.SECONDS.sleep(3);
			//Click on Setting tab
			logger.info("Clicking on Smore options");
			System.out.println("Clicking on more options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			//driver.findElement(By.id("com.android.soundrecorder:id/tagButton")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Clicking on Settings Tab");
			System.out.println("Clicking on Settings Tab");
			//Click Save Location
			driver.findElement(By.xpath("//*[@text='Settings']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select uSD Card
			logger.info("Clicking on save to ");
			System.out.println("Clicking on save to");
			driver.findElement(By.xpath("//*[@text='Save to']")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@bounds='[66,519][862,619]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select uSD Card save location");
			System.out.println("Select uSD Card save location");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start Recording");
			System.out.println("Start Recording");
			driver.findElement(By.id("com.lge.hifirecorder:id/recordButtonLayout")).click();
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			Reporter.log("Saving recorded files");
			System.out.println("Saving recorded files");
			driver.findElement(By.id("com.lge.hifirecorder:id/recordButtonLayout")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Recording Completed");
			System.out.println("Recording Completed");
			driver.findElement(By.id("com.lge.hifirecorder:id/stopButtonLayout")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test8 pass for audio recording in uSD Card");
			System.out.println("Pass: Test8 pass for audio recording in uSD Card");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//launch file manager
			logger.info("Launch File Manager Application to verify recorded audio");
			System.out.println("Launch File Manager Application to verify recorded audio");
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
			//Switch to grid view mode
			logger.info("switch to grid view mode and select AudioRecorder  folder");
			System.out.println("switch to grid view mode and select AudioRecorder folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Search For DCIM Folder 
			logger.info("Select AudioRecorder Folder");
			System.out.println("Select AudioRecorder Folder");
			driver.findElement(By.xpath("//*[@text='AudioRecorder']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Camera Folder
			logger.info("Select my_sounds Folder");
			System.out.println("Select my_sounds Folder");
			driver.findElement(By.xpath("//*[@text='my_sounds']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			//Click on Select All 
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='1 selected']"));
			TotalFiles.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Test8: 1 Audio file recorded  sucessfully");
			System.out.println("Test8: 1 Audio file recorded  sucessfully");
			logger.info("Pass: Test8 pass for audio recording in uSD Card");
			System.out.println("Pass: Test8 pass for audio recording in uSD Card");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Calling PlayRecordedAudio() to play back recorded file");
			System.out.println("Calling PlayRecordedAudio() to play back recorded file");
			//Calling PlayRecordedAudio function
			PlayRecordedAudio();
		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for audio recording in uSD Card");
			logger.info("Final Message: Fail Test8 Fail for audio recording in uSD Card");
			System.out.println("Fail: Test8 Fail for audio recording in uSD Card");
			System.out.println("Final Message: Fail Test8 Fail for audio recording in uSD Card");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			//TimeUnit.SECONDS.sleep(5);
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		
		try {
			//Launch File Manager
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			System.out.println("Launching file manager application");
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
			//Switch to grid view mode
			logger.info("switch to grid view mode and select AudioRecorder  folder");
			System.out.println("switch to grid view mode and select AudioRecorder folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Click Music Folder
			driver.findElement(By.xpath("//*[@text='AudioRecorder']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("clicking AudioRecorder folder");
			System.out.println("clicking AudioRecorder folder");

			//Click recordings  Folder
			driver.findElement(By.xpath("//*[@text='my_sounds']")).click();
			TimeUnit.SECONDS.sleep(3);	
			logger.info("Clicking recordings folder");
			System.out.println("Clicking recordings folder");
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select recorded audio file to play
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started Audio playback");
			System.out.println("Started Audio playback");
			TimeUnit.SECONDS.sleep(20);
			// FastForward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(420, 1685)).perform();
			TimeUnit.SECONDS.sleep(20);
			//Click Pause button
			logger.info("click on pause");
			System.out.println("click on pause");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Test8 Pass for playing recorded Audio file");
			System.out.println("Pass: Test8 Pass for playing recorded Audio file");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(6);
			logger.info("Pass: Test8 Pass for playing, fast forward, and pause recorded audio file scenario");
			System.out.println("Pass: Test8 Pass for playing, fast forward, and pause recorded audio file scenario");
			logger.info("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			System.out.println("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling PlayCopiedAudioFile()
			PlayCopiedAudioFile();
		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for RecordedaudioPlayBack()");
			logger.info("Final Message: Fail Test8 Fail for RecordedaudioPlayBAck()");
			System.out.println("Fail: Test8 Fail for RecordedaudioPlayBack()");
			System.out.println("Final Message: Fail Test8 Fail for RecordedaudioPlayBAck()");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			//TimeUnit.SECONDS.sleep(5);
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try {
			//Launch File Manager
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			System.out.println("Launching file manager application");
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
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Test1\"))"));
			logger.info("Select test1");
			System.out.println("Select test1");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select testfile");
			System.out.println("Select testfile");
			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
			TestFile.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select 1GB");
			System.out.println("Select 1GB");
			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
			oneGB.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select MP3 Files");
			System.out.println("Select MP3Files");
			MobileElement MP3Files = driver.findElement(By.xpath("//*[@text='MP3 Files']")); 
			MP3Files.click();
			TimeUnit.SECONDS.sleep(3);
			//Playing Copied Audio Files
			logger.info("Select Laahe.Mp3.mp3");
			System.out.println("Select Laahe.Mp3.mp3");
			driver.findElement(By.xpath("//*[@text='Laahe.Mp3.mp3']")).click();
			logger.info("Started video playback");
			System.out.println("Started video playback");
			TimeUnit.SECONDS.sleep(20);
			// FastForward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(296, 1683)).perform();
			TimeUnit.SECONDS.sleep(10);
			//Click Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: First Copied Audio play back and fast forward is successfull");
			System.out.println("Pass: First Copied Audio play back and fast forward is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test8 Fail for Laahe.Mp3.mp3 audio play back "+exp); 
			System.out.println("Fail: Test8 Fail for Laahe.Mp3.mp3 audio play back: "+exp); 
			logger.info("Final Message: Fail Test8 Fail for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for Recorded and copied audio play back and fast forward scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
		//Selecting 2nd Audio File
		logger.info("select 11 Rob Thomas - Lonely No More.mp3");
		System.out.println(" select 11 Rob Thomas - Lonely No More.mp3");
		driver.findElement(By.xpath("//*[@text='11 Rob Thomas - Lonely No More.mp3']")).click();
		logger.info("Started audio playback");
		System.out.println("Started audio playback");
		TimeUnit.SECONDS.sleep(20);
		try
		{
			// FastForward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(296, 1683)).perform();
			TimeUnit.SECONDS.sleep(10);
			//Click Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Second Copied Audio play back and fast forward is successfull");
			System.out.println("Pass: Second Copied Audio play back and fast forward is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test8 Fail for 11 Rob Thomas - Lonely No More.mp3 audio play back "+exp); 
			System.out.println("Fail: Test8 Fail for 11 Rob Thomas - Lonely No More.mp3 audio play back "+exp); 
			logger.info("Final Message: Fail Test8 Fail for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for Recorded and copied audio play back and fast forward scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		//Selecting 3rd Audio File
		logger.info("select file_example_MP3_5MG.mp3");
		System.out.println("select file_example_MP3_5MG.mp3");
		driver.findElement(By.xpath("//*[@text='file_example_MP3_5MG.mp3']")).click();
		logger.info("Started audio playback");
		System.out.println("Started audio playback");
		TimeUnit.SECONDS.sleep(20);
		try
		{
			// FastForward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(296, 1683)).perform();
			TimeUnit.SECONDS.sleep(10);
			//Click Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);	
			logger.info("Pass: Third Copied Audio play back and fast forward is successfull");
			System.out.println("Pass: Third Copied Audio play back and fast forward is successfull");
			logger.info("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Pass Test8 Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Pass Test8 Pass for Recorded and copied audio play back and fast forward scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test8 Fail for file_example_MP3_5MG.mp3 audio play back  "+exp); 
			System.out.println("Fail: Test8 Fail for file_example_MP3_5MG.mp3 audio play back: "+exp); 
			logger.info("Final Message: Fail Test8 Fail for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for Recorded and copied audio play back and fast forward scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		} 	

	}
}
