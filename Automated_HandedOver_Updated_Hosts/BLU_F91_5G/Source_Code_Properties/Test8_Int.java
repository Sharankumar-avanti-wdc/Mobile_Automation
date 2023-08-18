package BLU_F91_5G;


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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "F91 5G");
		dc.setCapability(MobileCapabilityType.UDID, "1030305022006683");
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
		logger.info("1.Launch mobile default voice recording application and set  storage option, record audio file for 2 minutes duration");
		logger.info("2.Launch file manager application and playback recorded audio file from external storage, fast forward audio file and pause");
		logger.info("3.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8_Int scenario is as follows");
		System.out.println("1.Launch mobile default voice recording application and set internal mount as storage option, record audio file for 2 minutes duration");
		System.out.println("2.Launch file manager application and playback recorded audio file from internal mount storage storage, fast forward audio file and pause");
		System.out.println("3.Launch file manager application and playback copied audio files from internal mount storage the files are placed in the Test1 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Launch Home screen and clear recent apps
		logger.info("Launch Home screen application and clear recent apps");
		System.out.println("Launch Home screen application and clear recent apps");
		// Click Recent Apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(3);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Clear all\")").click();
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
		TimeUnit.SECONDS.sleep(4);
		try {
			//Launch Voice recorder application for Audio recording
			logger.info("Launch Voice recorder application for Audio recording");
			System.out.println("Launch Voice recorder application for Audio recording");
			//if Allow Pop up permissions exists Choose 1st option
			((StartsActivity) driver).startActivity(new Activity("com.media.bestrecorder.audiorecorder", "com.media.bestrecorder.audiorecorder.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If application launch permission pop-up exists accept allow permission to launch application
			logger.info("If application launch permission pop-up exists accept allow permission to launch application");
			System.out.println("If application launch permission pop-up exists accept allow permission to launch application");
			/*try 
			{ 
				logger.info("WHILE USING THE APP");
				System.out.println("WHILE USING THE APP");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"WHILE USING THE APP\")").click();
				TimeUnit.SECONDS.sleep(5);
			} 
			catch(Exception exp)
			{ 
				logger.info("Allow");
				System.out.println("Allow");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"ALLOW\")").click();
				TimeUnit.SECONDS.sleep(5);
			}*/
			logger.info("Clicking on settings");
			System.out.println("Clicking on settings");
			driver.findElement(By.xpath("//*[@bounds='[809,2137][991,2210]']")).click();
//			TouchAction touchAction = new TouchAction(driver);
//			touchAction.tap(PointOption.point(897, 2232)).perform();
			TimeUnit.SECONDS.sleep(5);
			//Select Settings options
			logger.info("Select location ");
			System.out.println("Select location");
			MobileElement location =	driver.findElement(By.xpath("//*[@resource-id='com.media.bestrecorder.audiorecorder:id/location_recording']"));
			location.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Storage location
			logger.info("Select sd card");
			System.out.println("Select sd card");
			MobileElement location1 =	driver.findElement(By.xpath("//*[@resource-id='com.media.bestrecorder.audiorecorder:id/node_value']"));
			location1.click();
			try {
				//Select uSD card
				logger.info("click on Select ");
				System.out.println("click on Select");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Select uSD card
				logger.info("click on close ");
				System.out.println("click on close");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Closed\")").click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
			}
			catch (Exception e) {
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
			}
			TimeUnit.SECONDS.sleep(5);
			//Start Recording
			logger.info("Start Recording");
			System.out.println("Start Recording");
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_record_start")).click();
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_pause_record")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop and Save Recording" );
			System.out.println("Stop and Save Recording");
			// stop recording
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_record_start")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test8_Int pass for recording  audio file");
			System.out.println("Pass: Test8_Int pass for recording an audio file");
			//Calling PlayRecordedAudio() for Audio play back and fast forward scenario
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			System.out.println("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			PlayRecordedAudio();
		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for audio recording scenario");
			System.out.println("Fail: Test8_Int Fail for audio recording scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for audio recording scenario");
			logger.info("Final Message: Fail Test8_Int Fail for audio recording scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		// Click Recent Apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try
		{
			//Launch File Manager application for recorded audio file playBack
			logger.info("Launch File Manager Application");
			System.out.println("Launch File Manager Application");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find Internal Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(30)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			logger.info("Launch File Manager Application");
			//logger.info("Click On SD Card");
			//System.out.println("Launch File Manager Application");
			System.out.println("Click On internal storage");
			System.out.println("Click On internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Switch grid view mode
			logger.info("switch to grid view mode to select Music folder");
			System.out.println("switch to grid view mode to select Music folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//			//Select DCIM Folder
			//			logger.info("Select Music folder");
			//			System.out.println("Select Music Folder");
			//			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='Music']"));
			//			DCIM.click();
			//			TimeUnit.SECONDS.sleep(3);
			//Select recordings folder
			logger.info("Select Recorders Folder");
			System.out.println("Select Recorders Folder");
			MobileElement recordings = driver.findElement(By.xpath("//*[@text='Recorders']")); 
			recordings.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch back to List view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Click 1st File to Play Video
			logger.info("Click first audio file for audio playback and fast forward scenario");
			System.out.println("Click first audio file for audio playback and fast forward scenario");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/thumbnail']")).click();
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
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Pass: Test8_Int Pass for playing, fast forward, and pause recorded audio file scenario");
			System.out.println("Pass: Test8_Int Pass for playing, fast forward, and pause recorded audio file scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling PlayCopiedAudioFile()
			logger.info("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			System.out.println("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			PlayCopiedAudioFile();
		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for Recorded audio file play back, fast forward, and pause  scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for Recorded audio file play back, fast forward, and pause  scenario");
		}
	}
	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
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
		logger.info("Select  Internal storage");
		System.out.println("Select  Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
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
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");

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
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");

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
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Pass: Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Pass: Test8_Int Pass for Recorded and copied audio play back and fast forward scenario ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Pass Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
			System.out.println("Final Message: Pass Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
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