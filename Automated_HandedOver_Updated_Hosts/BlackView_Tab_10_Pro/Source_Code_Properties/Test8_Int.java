package BlackView_Tab_10_Pro;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Tab 10 Pro");
		dc.setCapability(MobileCapabilityType.UDID, "TAB10PRONEU004462");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		logger.info("1.Host voice recorder application does not support uSD storage option. Hence skipping voice recording scenario!");
		logger.info("2.Launch file manager application and playback copied audio files from internal storage the files are placed in the Test1 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8_Int scenario is as follows");
		System.out.println("1.Host voice recorder application does not support uSD storage option. Hence skipping voice recording scenario!");
		System.out.println("2.Launch file manager application and playback copied audio files from internal storage the files are placed in the Test1 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Launch Home screen using package
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.blackview.launcher", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		
		
		try {
			//Launch Voice recorder application for Audio recording
			logger.info("Launch Voice recorder application for Audio recording");
			System.out.println("Launch Voice recorder application for Audio recording");
			//if Allow Pop up permissions exists Choose 1st option
			((StartsActivity) driver).startActivity(new Activity("com.media.bestrecorder.audiorecorder", "com.media.bestrecorder.audiorecorder.MainActivity"));

			

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.media.bestrecorder.audiorecorder:id/tab_setting']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Save location
			logger.info("Select Save location option");
			System.out.println("Select Save location option");
			MobileElement Savelocation = driver.findElement(By.xpath("//*[@text='Location of recording']"));
			Savelocation.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On SD card
			logger.info("Select SD card option");
			System.out.println("Select SD card option");
			MobileElement SDcard = driver.findElement(By.xpath("//*[@bounds='[81,145][1170,178]']"));
			SDcard.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On SD card
			logger.info("Select  option");
			System.out.println("Select  option");
			MobileElement Select = driver.findElement(By.xpath("//*[@text='Select']"));
			Select.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select closed  option");
			System.out.println("Select closed option");
			MobileElement Closed = driver.findElement(By.xpath("//*[@text='Closed']"));
			Closed.click();
			TimeUnit.SECONDS.sleep(5);
			

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Start Recording
			logger.info("Start Recording");
			System.out.println("Start Recording");
			MobileElement StartRec = driver.findElement(By.xpath("//*[@resource-id='com.media.bestrecorder.audiorecorder:id/btn_record_start']"));
			StartRec.click();
			
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			MobileElement StopRec = driver.findElement(By.xpath("//*[@bounds='[539,1573][661,1695]']"));
			StopRec.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop and Save Recording" );
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
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

		//Launch home screen and clear recent apps
		logger.info("Launch home screen and clear recent apps");
		System.out.println("Launch home screen and clear recent apps");
		//((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
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
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select internalstorage");
			System.out.println("Select internalstorage");
			

			//Select recordings folder
			logger.info("Select recordings Folder");
			System.out.println("Select recordings Folder");
			MobileElement recordings = driver.findElement(By.xpath("//*[@text='Recorders']")); 
			recordings.click();
			TimeUnit.SECONDS.sleep(3);


			//Click 1st File to Play Video
			logger.info("Click first audio file for audio playback and fast forward scenario");
			System.out.println("Click first audio file for audio playback and fast forward scenario");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			TimeUnit.SECONDS.sleep(20);

			
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			//driver.findElement(By.xpath("//*[@content-desc='Fast forward 10 seconds']")).click();
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(10);
			//Pause audio playback
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@bounds='[540,1647][660,1764]']")).click();
			TimeUnit.SECONDS.sleep(3);
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
		logger.info("Launch file manager");
		System.out.println("Launch file manager");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Swipe up and select uSD Card
		logger.info("Swipe up and Internal storage");
		System.out.println("Swipe up and select Internal storage");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

		//Select Internal Memory
		logger.info("Select  Internal storage");
		System.out.println("Select  Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Switch grid view mode
		logger.info("switch to grid view mode to select Test1 folder");
		System.out.println("switch to grid view mode to select Test1 folder");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select Test1 folder
		logger.info("Select Test1 folder");
		System.out.println("Select Test1 folder");
		MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
		Test1.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Test_file folder
		logger.info("Select test_file  folder");
		System.out.println("Select test_file folder");
		MobileElement test_file = driver.findElement(By.xpath("//*[@text='test_file']")); 
		test_file.click();
		TimeUnit.SECONDS.sleep(3);
		//Select OneGB folder
		logger.info("Select 1GB folder");
		System.out.println("Select 1GB folder");
		MobileElement OneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
		OneGB.click();
		TimeUnit.SECONDS.sleep(3);
		//Switch to list view mode
		logger.info("switch back to list  view mode");
		System.out.println("switch back to list  view mode");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//click on Mp3 file Folder
		logger.info("Select Mp3 files folder from uSD card");
		System.out.println("Select MP3 files folder from uSD card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"MP3 Files\")").click();
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Select First audio file for play back");
		logger.info("Select First audio file for play back");
		//Click 1st File to Play Video
		try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"11 Rob Thomas - Lonely No More.mp3\")").click();
			System.out.println("Playing first audio file for one minute duration");
			logger.info("Playing first  audio file  one minute duration");
			TimeUnit.SECONDS.sleep(30);
			// FastForward first mp3 music for 30 sceonds duration
			logger.info("Fast Forwarding audio play back for 30 sceonds duration");
			System.out.println("Fast Forwarding audio play back for 30 sceonds duration");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(430, 1265)).perform();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Playing  audio  for 30 seconds duration");
			logger.info("Playing audio for 30 seconds duration");
			logger.info("Pause Audio playback");
			System.out.println("Pause Audio playback");
			//Pause Video
			driver.findElement(By.xpath("//*[@bounds='[540,1647][660,1764]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: First Audio Play back is Successfull ");
			System.out.println("Pass: First audiop playback and fastforward scneatio is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");

		}	
		try {
			logger.info("Select second audio file for play back");
			System.out.println("Select second audio file for play back");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			System.out.println("Playing second audio file for one minute duration");
			logger.info("Playing second  audio file  one minute duration");
			TimeUnit.SECONDS.sleep(30);
			// FastForward
			logger.info("Fast Forwarding audio play back for 30 sceonds duration");
			System.out.println("Fast Forwarding audio play back for 30 sceonds duration");
			//TouchAction touchAction = new TouchAction(driver);
			//touchAction.tap(PointOption.point(444, 1174)).perform();
			//TimeUnit.SECONDS.sleep(10);
			System.out.println("Playing  audio  for 30 seconds duration");
			logger.info("Playing audio for 30 seconds duration");
			logger.info("Pause Audio play back");
			System.out.println("Pause Audio play back");
			//Pause Video
			driver.findElement(By.xpath("//*[@bounds='[540,1647][660,1764]']")).click();	  
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: second Audio Play back is succssfull");
			System.out.println("Pass: Second audio file playback and fast forward scenario is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
		}
		logger.info("Select third audio file for play back");
		System.out.println("Select third audio file for play back");
		//Click 1st File to Play Video
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Laahe.Mp3.mp3\")").click();
			System.out.println("Playing second audio file for one minute duration");
			logger.info("Playing second  audio file  one minute duration");
			TimeUnit.SECONDS.sleep(30);
			//Click On Fast Forward
			//MobileElement FasForward2 = driver.findElement(By.xpath("//*[@bounds='[133,1755][953,1845]']")); 
			//FasForward2.click();
			TimeUnit.SECONDS.sleep(3);
			// FastForward
			logger.info("Fast Forwarding audio play back for 30 sceonds duration");
			System.out.println("Fast Forwarding audio play back for 30 sceonds duration");
			//TouchAction touchAction = new TouchAction(driver);
			//touchAction.tap(PointOption.point(444, 1174)).perform();
			//TimeUnit.SECONDS.sleep(10);
			System.out.println("Playing  audio  for 30 seconds duration");
			logger.info("Playing audio for 30 seconds duration");
			logger.info("Pause Audio play back");
			System.out.println("Pause Audio play back");
			//Pause Video
			driver.findElement(By.xpath("//*[@bounds='[540,1647][660,1764]']")).click();
			logger.info("Pass: 3rd Audio Play Back Successfull ");
			System.out.println("Pass: Third audio file playback and fast forward scenario is successfull ");
		}
		catch (Exception e) {
			logger.info("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8_Int Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8_Int Fail for copied audio file playback,fast forwward scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		logger.info("Pass: Test8_Int Pass for Recorded and copied audio play back and fast forward scenario");
		System.out.println("Pass: Test8_Int Pass for Recorded and copied audio play back and fast forward scenario ");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Final Message: Pass Test8_Int Pass  - for copied audio play back and fast forward scenario");
		System.out.println("Final Message: Pass Test8_Int Pass  - for recorded audio and copied audio play back and fast forward scenario");
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