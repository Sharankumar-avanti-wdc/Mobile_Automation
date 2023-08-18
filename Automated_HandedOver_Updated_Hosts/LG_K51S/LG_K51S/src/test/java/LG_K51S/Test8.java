package LG_K51S;
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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey; 
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "K51S");
		dc.setCapability(MobileCapabilityType.UDID, "LMK510ZTS4595HM789");
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
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("	click on clear all");
			System.out.println("click on clear all");
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Test0 Pass for clearing Recent apps ");
			System.out.println("Pass: Test0 Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try
		{
			logger.info("Launch Voice recorder application");
			Reporter.log("launching voice recoreder app!!");
			//if Allow Pop up permissions exists Choose 1st option
			((StartsActivity) driver).startActivity(new Activity("com.lge.hifirecorder", "com.lge.hifirecorder.LaunchHifiRecorder"));
			TimeUnit.SECONDS.sleep(3);
			//Click on Setting tab
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click Save Location
			logger.info("Clicking on Settings Tab");
			System.out.println("Clicking on Settings Tab");
			driver.findElement(By.xpath("//*[@text='Settings']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select uSD Card
			logger.info("Clicking on save to");
			System.out.println("Clicking on save to");
			driver.findElement(By.xpath("//*[@text='Save to']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Clicking on sd card");
			System.out.println("Clicking on sd card");
			driver.findElement(By.xpath("//*[@bounds='[44,298][676,330]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start Recording");
			System.err.println("Start Recording");
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test8 pass for audio recording in uSD Card");
			System.out.println("Pass: Test8 pass for audio recording in uSD Card");
			logger.info("Calling PlayRecordedAudio() to play back recorded file");
			System.out.println("Calling PlayRecordedAudio() to play back recorded file");
			//logger.info("Calling Play recording function for play back and fast forward audio file");
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
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Clearing Recent Apps
		logger.info("Clearing Recent Apps");
		System.out.println("Clear Recent Apps");
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
			logger.info("Pass: Test0 Pass for clearing Recent apps ");
			System.out.println("Pass: Test0 Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch File Manager
		logger.info("Launching file manager application");
		System.out.println("Launching file manager application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find Internal Storage option
		logger.info("swipe up and search for sd card");
		System.out.println("swipe up and search for sd card");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
		TimeUnit.SECONDS.sleep(5);
		Ext.click();
		logger.info("swipe up and search for Music");
		System.out.println("swipe up and search for Music");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"AudioRecorder\"))"));
		//Click Music Folder
		logger.info("clicking AudioRecorder folder");
		System.out.println("clicking AudioRecorder folder");
		driver.findElement(By.xpath("//*[@text='AudioRecorder']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Click recordings  Folder
		logger.info("Clicking recordings folder");
		System.out.println("Clicking recordings folder");
		driver.findElement(By.xpath("//*[@text='my_sounds']")).click();
		TimeUnit.SECONDS.sleep(3);	
		try
		{
			//Select recorded audio file to play
			logger.info("Started Audio playback");
			System.out.println("Started Audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			TimeUnit.SECONDS.sleep(20);
			//Click Fast forward button
			logger.info("Fast forward audio for 10 seconds");
			System.out.println("Fast forward audio for 10 seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			//clikc Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Test8 Pass for playing recorded Audio file");
			System.out.println("Pass: Test8 Pass for playing recorded Audio file");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test8 Pass for playing, fast forward, and pause recorded audio file scenario");
			System.out.println("Pass: Test8 Pass for playing, fast forward, and pause recorded audio file scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling PlayCopiedAudioFile()
			logger.info("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			System.out.println("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
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
		// Click Recent Apps
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
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
			logger.info("Pass: Test0 Pass for clearing Recent apps ");
			System.out.println("Pass: Test0 Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch File Manager
		logger.info("Launching file manager application");
		System.out.println("Launching file manager application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find Internal Storage option
		logger.info("swipe up and search for sd card");
		System.out.println("swipe up and search for sd card");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
		TimeUnit.SECONDS.sleep(5);
		Ext.click();
		logger.info("swipe and select test1 folder");
		System.out.println("swipe and select test1 folder");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"Test1\"))"));
		logger.info("Select Test1 folder");
		System.out.println("Select Test1 folder");
		MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
		Test1.click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Select test_filefolder");
		System.out.println("Select test_file folder");
		MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
		TestFile.click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Select OneGB folder");
		System.out.println("Select OneGB folder");
		MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
		oneGB.click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Select MP3 Files");
		System.out.println("Select MP3 Files");
		MobileElement MP3Files = driver.findElement(By.xpath("//*[@text='MP3 Files']")); 
		MP3Files.click();
		TimeUnit.SECONDS.sleep(3);
		//Playing Copied Audio Files
		logger.info("Select Laahe.Mp3.mp3");
		System.out.println("Select Laahe.Mp3.mp3");
		driver.findElement(By.xpath("//*[@text='Laahe.Mp3.mp3']")).click();
		logger.info("Started audio playback");
		System.out.println("Started audio playback");
		TimeUnit.SECONDS.sleep(20);
		try
		{
			//Click Fast forward button
			logger.info("Click fast forward button for 10 seconds audio forward");
			System.out.println("Click fast forward button for 10 seconds audio forward");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			//clikc Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 1st Copied Audio play back and fast forward is successfull");
			System.out.println("Pass: 1st Copied Audio play back and fast forward is successfull");
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
			//Click Fast forward button
			logger.info("Click fast forward button for 10 seconds audio forward");
			System.out.println("Click fast forward button for 10 seconds audio forward");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			//clikc Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 2nd Copied Audio play back and fast forward is successfull");
			System.out.println("Pass: 2nd Copied Audio play back and fast forward is successfull");
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
			//Click Fast forward button
			logger.info("Click fast forward button for 10 seconds audio forward");
			System.out.println("Click fast forward button for 10 seconds audio forward");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			//clikc Pause button
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);	
			logger.info("Pass: 3rd Copied Audio play back and fast forward is successfull");
			System.out.println("Pass: 3rd Copied Audio play back and fast forward is successfull");
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
