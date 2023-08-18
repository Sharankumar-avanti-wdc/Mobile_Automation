package Micromax_IN_2b_E7544;

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

public class Test8_Int
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "IN_2b");
		dc.setCapability(MobileCapabilityType.UDID, "BS7544S4MN1021000850");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
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
		FileHandler fileHandler = new FileHandler("status_log_Test8_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test8_Int scenario is as follows");
		logger.info("1.Launch mobile default voice recording application and set Internal storage option, record audio file for 2 minutes duration");
		logger.info("2.Launch file manager application and playback recorded audio file from Internal storage, fast forward audio file and pause");
		logger.info("3.Launch file manager application and playback copied audio files from Internal storage the files are placed in the Test1 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8_Int scenario is as follows");
		System.out.println("1.Launch mobile default voice recording application and set Internal storage option, record audio file for 2 minutes duration");
		System.out.println("2.Launch file manager application and playback recorded audio file from Internal storage, fast forward audio file and pause");
		System.out.println("3.Launch file manager application and playback copied audio files from Internal storage the files are placed in the Test1 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//Launch Voice recorder application for Audio recording
			logger.info("Launch Voice recorder application for Audio recording");
			System.out.println("Launch Voice recorder application for Audio recording");
			//if Allow Pop up permissions exists Choose 1st option
			((StartsActivity) driver).startActivity(new Activity("com.android.soundrecorder", "com.sprd.soundrecorder.RecorderActivity"));
			TimeUnit.SECONDS.sleep(4);
			//If application launch permission pop-up exists accept allow permission to launch application
			logger.info("If application launch permission pop-up exists accept allow permission to launch application");
			System.out.println("If application launch permission pop-up exists accept allow permission to launch application");
			try 
			{ 
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Agree\")").click();
				TimeUnit.SECONDS.sleep(5);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Allow\")").click();
				TimeUnit.SECONDS.sleep(5);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Allow\")").click();
				TimeUnit.SECONDS.sleep(5);
			} 
			catch(Exception exp)
			{ 
				// Block of code to handle errors
				logger.info(" No Launch permission Pop-up  found"); 
				System.out.println(" No Launch permission Pop-up  found"); 
			}
			TimeUnit.SECONDS.sleep(5);
			//Start Recording
			logger.info("Start Recording");
			System.out.println("Start Recording");
			driver.findElement(By.id("com.android.soundrecorder:id/recordButton")).click();
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			driver.findElement(By.id("com.android.soundrecorder:id/stopButton")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test8_Int pass for recording  audio file");
			System.out.println("Pass: Test8_Int pass for recording an audio file");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//launch file manager
			logger.info("Launch File Manager Application to verify recorded audio");
			System.out.println("Launch File Manager Application to verify recorded audio");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Scroll up and select uSD Card
			logger.info("swipe up and search for Internal storage");
			System.out.println("swipe up and search for Internal storage");
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			logger.info("Select list view");
			System.out.println("Select list view");
			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Music folder
			logger.info("Select Music Folder");
			System.out.println("Select Music Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Music\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Voice recorder
			logger.info("Select Voice recorder");
			System.out.println("Select Voice recorder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"recordings\")").click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			logger.info("switch to list view mode");
			System.out.println("switch to list view mode");
			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView1.click();
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
			logger.info("Test8_Int: 1 Audio file recorded  sucessfully");
			System.out.println("Test8_Int: 1 Audio file recorded  sucessfully");
			logger.info("Pass: Test8_Int pass for audio recording in uSD Card");
			System.out.println("Pass: Test8_Int pass for audio recording in uSD Card");
			logger.info("Calling PlayRecordedAudio() to play back recorded file");
			System.out.println("Calling PlayRecordedAudio() to play back recorded file");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//logger.info("Calling Play recording function for play back and fast forward audio file");
			PlayRecordedAudio();
		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for audio recording in uSD Card");
			logger.info("Final Message: Fail Test8_Int Fail for audio recording in uSD Card");
			System.out.println("Fail: Test8_Int Fail for audio recording in uSD Card");
			System.out.println("Final Message: Fail Test8_Int Fail for audio recording in uSD Card");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		try
		{
			//Launch File Manager application for recorded audio file playBack
			logger.info("Launch File Manager Application");
			System.out.println("Launch File Manager Application");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find Internal Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			logger.info("Select list view");
			System.out.println("Select list view");
			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Music folder
			logger.info("Select Music Folder");
			System.out.println("Select Music Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Music\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Voice recorder
			logger.info("Select Voice recorder");
			System.out.println("Select Voice recorder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"recordings\")").click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			logger.info("switch to list view mode");
			System.out.println("switch to list view mode");
			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView1.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Audio file for play back and fast forward");
			System.out.println("Click Audio file for play back and fast forward");
			//Select recorded audio file to play
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			logger.info("Started Audio playback");
			System.out.println("Started Audio playback");
			TimeUnit.SECONDS.sleep(20);
			//Click Fast forward button
			logger.info("click on fastforward  10 seconds");
			System.out.println("click on fastforward  10 seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(20);
			//clikc Pause button
			logger.info("click on pause");
			System.out.println("click on pause");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Test8_Int Pass for playing recorded Audio file");
			System.out.println("Pass: Test8_Int Pass for playing recorded Audio file");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(6);
			logger.info("Pass: Test8_Int Pass for playing, fast forward, and pause recorded audio file scenario");
			System.out.println("Pass: Test8_Int Pass for playing, fast forward, and pause recorded audio file scenario");
			logger.info("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			System.out.println("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling PlayCopiedAudioFile()
			PlayCopiedAudioFile();
		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for RecordedaudioPlayBack()");
			logger.info("Final Message: Fail Test8_Int Fail for RecordedaudioPlayBAck()");
			System.out.println("Fail: Test8_Int Fail for RecordedaudioPlayBack()");
			System.out.println("Final Message: Fail Test8_Int Fail for RecordedaudioPlayBAck()");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		try {
			//Launch File Manager
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			System.out.println("Launching file manager application");
			////Scroll Up to find Internal Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Test1\"))"));
			TimeUnit.SECONDS.sleep(5);
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
			logger.info("Fail: Test8_Int Fail for Laahe.Mp3.mp3 audio play back "+exp); 
			System.out.println("Fail: Test8_Int Fail for Laahe.Mp3.mp3 audio play back: "+exp); 
			logger.info("Final Message: Fail Test8_Int Fail for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for Recorded and copied audio play back and fast forward scenario");
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
			logger.info("Fail: Test8_Int Fail for 11 Rob Thomas - Lonely No More.mp3 audio play back "+exp); 
			System.out.println("Fail: Test8_Int Fail for 11 Rob Thomas - Lonely No More.mp3 audio play back "+exp); 
			logger.info("Final Message: Fail Test8_Int Fail for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for Recorded and copied audio play back and fast forward scenario");
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
			logger.info("Pass: Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Pass: Test8_Int Pass for Recorded and copied audio play back and fast forward scenario ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Pass Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Pass Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
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
			logger.info("Fail: Test8_Int Fail for file_example_MP3_5MG.mp3 audio play back  "+exp); 
			System.out.println("Fail: Test8_Int Fail for file_example_MP3_5MG.mp3 audio play back: "+exp); 
			logger.info("Final Message: Fail Test8_Int Fail for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for Recorded and copied audio play back and fast forward scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		} 	

	}
}
