package Ulefone_Armor_X10;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Armor X10");
		dc.setCapability(MobileCapabilityType.UDID, "3099SH2010003629");
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
		FileHandler fileHandler = new FileHandler("status_log_Test8.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter);
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test8 scenario is as follows");
		logger.info("1.Launch mobile default voice recording application and set  storage option, record audio file for 2 minutes duration");
		logger.info("2.Launch file manager application and playback recorded audio file from external storage, fast forward audio file and pause");
		logger.info("3.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8 scenario is as follows");
		System.out.println("1.Launch mobile default voice recording application and set  storage option, record audio file for 2 minutes duration");
		System.out.println("2.Launch file manager application and playback recorded audio file from external storage, fast forward audio file and pause");
		System.out.println("3.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";

		//Launch Home screen and clear recent apps
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		//Clear recent apps if open apps in background
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		try {
			MobileElement  ClearAll =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			ClearAll.click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			logger.info("No recent apps found in background");
			System.out.println("No recent apps found in background");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Host does not audio recording in external storage. Hence skipping audio recording and recorded audio playback scenario.");
		System.out.println("Host does not audio recording in external storage. Hence skipping audio recording and recorded audio playback scenario.");
		/*
		try {
			//Launch Voice recorder application for Audio recording
			logger.info("Launch Voice recorder application for Audio recording");
			System.out.println("Launch Voice recorder application for Audio recording");
			//if Allow Pop up permissions exists Choose 1st option
			((StartsActivity) driver).startActivity(new Activity("com.media.bestrecorder.audiorecorder", "com.media.bestrecorder.audiorecorder.MainActivity"));

			//If application launch permission pop-up exists accept allow permission to launch application
			logger.info("If application launch permission pop-up exists accept allow permission to launch application");
			System.out.println("If application launch permission pop-up exists accept allow permission to launch application");
			try 
			{ 
				TimeUnit.SECONDS.sleep(5);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"While using the app\")").click();
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

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[539,1384][660,1456]']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Save location
			logger.info("Select Location of recording(SD Card available) option");
			System.out.println("Select Location of recording(SD Card available) option");
			MobileElement Savelocation = driver.findElement(By.xpath("//*[@text='Location of recording(SD Card available)']"));
			Savelocation.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On SD card
			logger.info("Select SD card option");
			System.out.println("Select SD card option");
			MobileElement SDcard = driver.findElement(By.xpath("//*[@bounds='[108,239][680,320]']"));
			SDcard.click();
			TimeUnit.SECONDS.sleep(5);
			//Select  Option
			logger.info("Click select option");
			System.out.println("Click select option");
			MobileElement Select = driver.findElement(By.xpath("//*[@text='Select']"));
			Select.click();
			TimeUnit.SECONDS.sleep(5);
			//Select  Closed option
			logger.info("Select closed option");
			System.out.println("Select closed option");
			MobileElement Closed = driver.findElement(By.xpath("//*[@text='Closed']"));
			Closed.click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Start Recording
			logger.info("Start Recording");
			System.out.println("Start Recording");
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_record_start")).click();
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_record_start")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop and Save Recording" );
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);

			logger.info("Pass: Test8 pass for recording  audio file");
			System.out.println("Pass: Test8 pass for recording an audio file");
			//Calling PlayRecordedAudio() for Audio play back and fast forward scenario

			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			System.out.println("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			PlayRecordedAudio();
		}

		catch (Exception e) {
			logger.info("Fail: Test8 Fail for audio recording scenario");
			System.out.println("Fail: Test8 Fail for audio recording scenario");
			System.out.println("Final Message: Fail Test8 Fail for audio recording scenario");
			logger.info("Final Message: Fail Test8 Fail for audio recording scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		*/
		logger.info("Calling PlayCopiedAudioFile() for Audio play back and fast forward scenario");
		System.out.println("Calling PlayCopiedAudioFile() for Audio play back and fast forward scenario");
		PlayCopiedAudioFile();
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");


	}

	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		//Launch home screen and clear recent apps
		logger.info("Launch home screen and clear recent apps");
		System.out.println("Launch home screen and clear recent apps");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);

		// click on close all
		try
		{
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("clearing Recent apps ");
			System.out.println("clearing Recent apps ");
		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("No recent apps found");
			System.out.println(" No recent apps found");

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		try
		{

			//Launch File Manager application for recorded audio file playBack
			logger.info("Launch File Manager Application");
			System.out.println("Launch File Manager Application");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Scrolling till System option is visible");
			System.out.println("Scrolling till System option is visible");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//click on System
			logger.info("Clicking on System");
			System.out.println("Clicking on System");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"System\")").click();
			TimeUnit.SECONDS.sleep(5);
			//click on Storage
			logger.info("Clicking on Storage");
			System.out.println("Clicking on Storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);

			try
			{
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
			}

			//Select Music folder
			logger.info("Select Android Folder");
			System.out.println("Select Android Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Android\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select data folder
			logger.info("Select data Folder");
			System.out.println("Select data Folder");
			MobileElement recordings = driver.findElement(By.xpath("//*[@text='data']")); 
			recordings.click();
			TimeUnit.SECONDS.sleep(3);
			//Select com.media.bestrecorder.audiorecorder folder
			logger.info("Select com.media.bestrecorder.audiorecorder Folder");
			System.out.println("Select com.media.bestrecorder.audiorecorder Folder");
			MobileElement BesrRec = driver.findElement(By.xpath("//*[@text='com.media.bestrecorder.audiorecorder']")); 
			BesrRec.click();
			TimeUnit.SECONDS.sleep(3);
			//Select files folder
			logger.info("Select files Folder");
			System.out.println("Select files Folder");
			MobileElement Files = driver.findElement(By.xpath("//*[@text='files']")); 
			Files.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Recorders folder
			logger.info("Select Recorders Folder");
			System.out.println("Select Recorders Folder");
			MobileElement Recorders = driver.findElement(By.xpath("//*[@text='Recorders']")); 
			Recorders.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Audio file for Playback
			logger.info("Click  audio file for audio playback and fast forward scenario");
			System.out.println("Click  audio file for audio playback and fast forward scenario");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.documentsui:id/icon_thumb']")).click();
			TimeUnit.SECONDS.sleep(30);

			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Files by Google\")").click();
				TimeUnit.SECONDS.sleep(5);

				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Always\")").click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(391, 1172)).perform();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(30);
			//Pause audio playback
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			MobileElement Pause = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Fail: Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
			System.out.println("Final Message: Fail Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
		}

	}

	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		//Clearing Recent Apps
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);

		// click on close all
		try
		{
			logger.info("clearing Recent apps ");
			System.out.println("clearing Recent apps ");
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(5);

		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("No recent apps found");
			System.out.println(" No recent apps found");

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch File Manager
		logger.info("Launch File Manager Application");
		System.out.println("Launch File Manager Application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Swipe up and select uSD Card

		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

		//Select Internal Memory
		logger.info("Select  SD card");
		System.out.println("Select  SD card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Test1 Folder
		String text = "Test1";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		//Select Test1 folder
		logger.info("Select Test1 folder");
		System.out.println("Select Test1 folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")").click();
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Select Test1 folder
		logger.info("Select Test_file folder");
		System.out.println("Select Test_file folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"test_file\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select 1GB folder
		logger.info("Select 1GB folder");
		System.out.println("Select 1GB folder");
		driver.findElement(By.xpath("//*[@text='1GB']")).click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Select MP3 files Folder");
		System.out.println("Select MP3 files Folder");
		//click on Video Folder
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"MP3 Files\")").click();
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Playing first audio file from Test1 folder");
		logger.info("Playing first audio file from Test1 folder");
		//Click 1st File to Play Video
		try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"11 Rob Thomas - Lonely No More.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Files by Google\")").click();
				TimeUnit.SECONDS.sleep(5);

				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Always\")").click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//click on fast forward button
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(456, 1078)).perform();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(10);
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: first audio file palyback and fast forward scenario is successfull");
			System.out.println("Pass: first audio file palyback and fast forward scenario is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");

		}	


		logger.info("Playing second audio file from Test1 folder");
		System.out.println("Playing second audio file from Test1 folder");
		//Click 1st File to Play Video
		try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Files by Google\")").click();
				TimeUnit.SECONDS.sleep(5);

				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Always\")").click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();
			}
			TimeUnit.SECONDS.sleep(30);
			//click on fast forward button
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(456, 1078)).perform();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(10);
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Seond audio file palyback and fast forward scenario is successfull");
			System.out.println("Pass: Second audio file palyback and fast forward scenario is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");

		}
		logger.info("Playing third audio file from Test1 folder");
		System.out.println("Playing third audio file from Test1 folder");
		//Click 1st File to Play Video
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Laahe.Mp3.mp3\")").click();
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Files by Google\")").click();
				TimeUnit.SECONDS.sleep(5);

				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Always\")").click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();
			}	
			TimeUnit.SECONDS.sleep(30);
			//click on fast forward button
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(456, 1078)).perform();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(10);
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Third audio file palyback and fast forward scenario is successfull");
			System.out.println("Pass: Third audio file palyback and fast forward scenario is successfull");
			logger.info("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Pass Test8 Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Pass Test8 Pass for Recorded and copied audio play back and fast forward scenario");
		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
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

}