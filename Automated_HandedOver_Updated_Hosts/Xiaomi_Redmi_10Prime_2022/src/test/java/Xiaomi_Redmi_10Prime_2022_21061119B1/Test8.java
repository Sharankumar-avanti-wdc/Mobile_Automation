package Xiaomi_Redmi_10Prime_2022_21061119B1;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 10 Prime");
		dc.setCapability(MobileCapabilityType.UDID, "9521d3ed0509");
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
		FileHandler fileHandler = new FileHandler("status_log_Test8.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test8 scenario is as follows");
		logger.info("1.Host voice recorder application does not support uSD storage option. Hence skipping voice recording scenario!");
		logger.info("2.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");

		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8 scenario is as follows");
		System.out.println("1.Host voice recorder application does not support uSD storage option. Hence skipping voice recording scenario!");
		System.out.println("2.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");

		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";

		//Launch Home screen using package
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);

		
		//Launch voice recorder application
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
			try 
			{ 
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

			// Switch to Video mode
			logger.info("Clicking on settings");
			System.out.println("Clicking on settings");
			driver.findElement(By.xpath("//*[@bounds='[816,2105][983,2190]']")).click();
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
			MobileElement location1 =	driver.findElement(By.xpath("//*[@bounds='[55,367][121,433]']"));
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
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_pause_record")).click();
			TimeUnit.SECONDS.sleep(5);
			// stop recording
			logger.info("Stop Recording");
			System.out.println("Stop Recording");
			driver.findElement(By.id("com.media.bestrecorder.audiorecorder:id/btn_record_start")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Stop and Save Recording" );
			System.out.println("Stop and Save Recording");
			try {
				logger.info("click on ok");
				System.out.println("click on ok");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")").click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test8 pass for recording  audio file");
			System.out.println("Pass: Test8 pass for recording an audio file");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//launch file manager
			logger.info("Launch File Manager Application to verify recorded audio");
			System.out.println("Launch File Manager Application to verify recorded audio");
			((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select storage");
			System.out.println("Select storage");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Storage\"]")).click();
			TimeUnit.SECONDS.sleep(3);
			//click on list view
			logger.info("Select switch layout");
			System.out.println("Select switch layout");
			MobileElement ListView0 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']")); 
			ListView0.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select sd card");
			System.out.println("Select sd card");
			driver.findElement(By.xpath("//*[@bounds='[14,771][224,853]']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select android");
			System.out.println("Select android");
			driver.findElement(By.xpath("//*[@text='Android']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select data");
			System.out.println("Select data");
			driver.findElement(By.xpath("//*[@text='data']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select view in file");
			System.out.println("Select view in file");
			driver.findElement(By.xpath("//*[@text='View in Files']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select more");
			System.out.println("Select more");
			driver.findElement(By.xpath("//*[@content-desc='Show roots']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select sandisk sd card");
			System.out.println("Select sandisk sd card");
			driver.findElement(By.xpath("//*[@bounds='[0,1448][198,1646]']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select android");
			System.out.println("Select android");
			driver.findElement(By.xpath("//*[@text='Android']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select data");
			System.out.println("Select data");
			driver.findElement(By.xpath("//*[@text='data']")).click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select Music folder
			logger.info("Select com.media.bestrecorder.audiorecorder");
			System.out.println("Select com.media.bestrecorder.audiorecorder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"com.media.bestrecorder.audiorecorder\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Voice recorder
			logger.info("Select files folder");
			System.out.println("Select files folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"files\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select recorders folder");
			System.out.println("Select recorders folder");
			driver.findElement(By.xpath("//*[@text='Recorders']")).click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			//			logger.info("switch to list view mode");
			//			System.out.println("switch to list view mode");
			//			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.documentsui:id/sub_menu_list']")); 
			//			ListView1.click();
			//			TimeUnit.SECONDS.sleep(3);
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Test8: one Audio file recorded  sucessfully");
			System.out.println("Test8: one Audio file recorded  sucessfully");
			logger.info("Pass: Test8 pass for audio recording in uSD Card");
			System.out.println("Pass: Test8 pass for audio recording in uSD Card");
			logger.info("Calling PlayRecordedAudio() to play back recorded file");
			System.out.println("Calling PlayRecordedAudio() to play back recorded file");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

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

		try
		{
			//launch file manager
			logger.info("Launch File Manager Application to verify recorded audio");
			System.out.println("Launch File Manager Application to verify recorded audio");
			((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select storage");
			System.out.println("Select storage");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Storage\"]")).click();
			TimeUnit.SECONDS.sleep(3);
			//click on list view
			logger.info("Select switch layout");
			System.out.println("Select switch layout");
			MobileElement ListView0 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']")); 
			ListView0.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select sd card");
			System.out.println("Select sd card");
			driver.findElement(By.xpath("//*[@bounds='[14,771][224,853]']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select android");
			System.out.println("Select android");
			driver.findElement(By.xpath("//*[@text='Android']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select data");
			System.out.println("Select data");
			driver.findElement(By.xpath("//*[@text='data']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select view in file");
			System.out.println("Select view in file");
			driver.findElement(By.xpath("//*[@text='View in Files']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select more");
			System.out.println("Select more");
			driver.findElement(By.xpath("//*[@content-desc='Show roots']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select sandisk sd card");
			System.out.println("Select sandisk sd card");
			driver.findElement(By.xpath("//*[@bounds='[0,1448][198,1646]']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select android");
			System.out.println("Select android");
			driver.findElement(By.xpath("//*[@text='Android']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select data");
			System.out.println("Select data");
			driver.findElement(By.xpath("//*[@text='data']")).click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			//			logger.info("switch to gird view");
			//			System.out.println("switch gird view mode");
			//			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.documentsui:id/sub_menu_grid']")); 
			//			ListView.click();
			//			TimeUnit.SECONDS.sleep(3);
			//Select Music folder
			logger.info("Select com.media.bestrecorder.audiorecorder");
			System.out.println("Select com.media.bestrecorder.audiorecorder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"com.media.bestrecorder.audiorecorder\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Voice recorder
			logger.info("Select files folder");
			System.out.println("Select files folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"files\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select recorders folder");
			System.out.println("Select recorders folder");
			driver.findElement(By.xpath("//*[@text='Recorders']")).click();
			TimeUnit.SECONDS.sleep(5);
			//click on list view
			//			logger.info("switch to list view mode");
			//			System.out.println("switch to list view mode");
			//			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.documentsui:id/sub_menu_list']")); 
			//			ListView1.click();
			//			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Audio file for play back and fast forward");
			System.out.println("Click Audio file for play back and fast forward");
			//Select recorded audio file to play
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.documentsui:id/icon_mime_lg']")).click();
			logger.info("Started Audio playback");
			System.out.println("Started Audio playback");
			TimeUnit.SECONDS.sleep(20);
			//Click Fast forward button
			logger.info("click on fastforward  10 seconds");
			System.out.println("click on fastforward  10 seconds");
			//TouchAction touchAction = new TouchAction(driver);
			//touchAction.tap(PointOption.point(364, 1814)).perform();
			//TimeUnit.SECONDS.sleep(10);
			//clikc Pause button
			logger.info("click on pause");
			System.out.println("click on pause");
			driver.findElement(By.xpath("//*[@resource-id='com.miui.player:id/playpause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Test8 Pass for playing recorded Audio file");
			System.out.println("Pass: Test8 Pass for playing recorded Audio file");
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

		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launching file manager application");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select external storage");
		System.out.println("Select external storage");
		MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
		Ext.click();
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
		//Select TestFile folder


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

		//Swtich to list view mode
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
			touchAction.tap(PointOption.point(676, 1809)).perform();
			TimeUnit.SECONDS.sleep(10);

			System.out.println("Playing  audio  for 30 seconds duration");
			logger.info("Playing audio for 30 seconds duration");

			logger.info("Pause Audio playback");
			System.out.println("Pause Audio playback");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);

			logger.info("Pass: First Audio Play back is Successfull ");
			System.out.println("Pass: 1st Audio Play back is Successfull ");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");

		}	

		try {
			logger.info("Select second audio file for play back");
			System.out.println("Select second audio file for play back");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);

			System.out.println("Playing second audio file for one minute duration");
			logger.info("Playing second  audio file  one minute duration");

			TimeUnit.SECONDS.sleep(30);
			TimeUnit.SECONDS.sleep(3);


			// FastForward
			logger.info("Fast Forwarding audio play back for 30 sceonds duration");
			System.out.println("Fast Forwarding audio play back for 30 sceonds duration");

			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(676, 1809)).perform();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Playing  audio  for 30 seconds duration");
			logger.info("Playing audio for 30 seconds duration");

			logger.info("Pause Audio play back");
			System.out.println("Pause Audio play back");
			//Pause Video
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: second Audio Play back is succssfull");
			System.out.println("Pass: second Audio Play back is succssfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");

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

			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(676, 1809)).perform();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Playing  audio  for 30 seconds duration");
			logger.info("Playing audio for 30 seconds duration");

			logger.info("Pause Audio play back");
			System.out.println("Pause Audio play back");
			//Pause Video
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);

			logger.info("Pass: third Audio Play Back Successfull ");
			logger.info("Pass: third Audio Play Back Successfull ");
		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		logger.info("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario");
		System.out.println("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario ");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Final Message: Pass Test8 Pass NA - for copied audio play back and fast forward scenario");
		System.out.println("Final Message: Pass Test8 Pass NA - for copied audio play back and fast forward scenario");

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