package Samsung_Galaxy_Tab_A7_Lite;

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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Tab A7 Lite");
			dc.setCapability(MobileCapabilityType.UDID, "R9PR80KNR8K");
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
	  		
	  		//Launch Home screen and clear recent apps
			logger.info("Launch Home screen application and clear recent apps");
			System.out.println("Launch Home screen application and clear recent apps");
	  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
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
	  		try {
	  		//Launch Voice recorder application for Audio recording
	  		logger.info("Launch Voice recorder application for Audio recording");
	  		System.out.println("Launch Voice recorder application for Audio recording");
	  		//if Allow Pop up permissions exists Choose 1st option
	  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.voicenote", "com.sec.android.app.voicenote.main.VNMainActivity"));
	  		
	  		//If application launch permission pop-up exists accept allow permission to launch application
	  		logger.info("If application launch permission pop-up exists accept allow permission to launch application");

	  		System.out.println("If application launch permission pop-up exists accept allow permission to launch application");try 
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
	  		
	  		
	  		
	  		//If save to uSD card pop-up exists select Save to SD card option
	  		logger.info("If save to uSD card pop-up exists select Save to SD card option");
	  		System.out.println("If save to uSD card pop-up exists select Save to SD card option");
	  		try {
	  			String text = "Save recordings to your SD card?";
	  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD card\")").click();
	  			TimeUnit.SECONDS.sleep(5);
	  		}
	  		catch(Exception exp) {
	  			
	  		}
	  		//Select More options and Set uSD card as storage option
	  		
	  		try
	  		{ 
	  			//Select More options
	  			logger.info("Select More options and Set uSD card as storage option");
	  			System.out.println("Select More options and Set uSD card as storage option");
	  			 driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
	  			TimeUnit.SECONDS.sleep(5);
	  		
		  		//Select Settings options
	  			logger.info("Select settings option");
	  			System.out.println("Select settings option");
	  			 driver.findElement(By.xpath("//*[@text='Settings']")).click();
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			//Select Storage location
	  			logger.info("Select Storage location");
	  			System.out.println("Select Storage location");
	  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			//Select uSD card
	  			logger.info("Select uSD card");
	  			System.out.println("Select uSD card");
	  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
	  			TimeUnit.SECONDS.sleep(5);
	  		}
	  		
	  		catch(Exception exp) {
	  			
	  		}
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		//Start Recording
	  		logger.info("Start Recording");
	  		System.out.println("Start Recording");
	  		driver.findElement(By.id("com.sec.android.app.voicenote:id/idle_controlbutton_record_start")).click();
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			logger.info("Stop Recording");
	  		System.out.println("Stop Recording");
	  		driver.findElement(By.id("com.sec.android.app.voicenote:id/controlbutton_record_pause")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		driver.findElement(By.id("com.sec.android.app.voicenote:id/controlbutton_record_save")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		driver.findElement(By.id("com.sec.android.app.voicenote:id/tvOkButton")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		logger.info("Stop and Save Recording" );
	  		System.out.println("Stop and Save Recording" );
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  	//Launch File Manager application for recorded audio file playBack
	  		logger.info("Launch File Manager Application and select uSD card for playing recorded audio playback");
	  		System.out.println("Launch File Manager Application and select uSD card for playing recorded audio playback");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			
			//Select Browse option
			logger.info("click on browse option");
			System.out.println("click on browse option");
			driver.findElement(By.xpath("//*[@text='Browse']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select external storage");
			System.out.println("Select external storage");
			MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
			Ext.click();
			TimeUnit.SECONDS.sleep(5);
	
			
			//Select Music folder
			logger.info("Select Recording");
			System.out.println("Select Recording");
	  		String text1 = "Recordings";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Recordings\")").click();
			TimeUnit.SECONDS.sleep(5);
	  		//Select Voice recorder
			logger.info("Select Voice recorder");
			System.out.println("Select Voice recorder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Voice Recorder\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			try {
				//Click More Options
					logger.info("Select More Options ");
					System.out.println("Select More Options ");
				MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions.click();
				}
				
				catch (Exception e) {
					MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
					MoreOptions1.click();
		            e.printStackTrace();
		        }
			//Click Edit 
			logger.info("Select all option");
			System.out.println("Select all option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Select all\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			//driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.myfiles:id/actionbar_select_checkbox']")).click();
  	  		//TimeUnit.SECONDS.sleep(3);
  	  		MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='1 selected']"));
  	  		TimeUnit.SECONDS.sleep(5);
  	  		TotalFiles.click();
  	  	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  		TimeUnit.SECONDS.sleep(2);
	  	
	  		logger.info("Pass: Test8 pass for recording  audio file");
	  		System.out.println("Pass: Test8 pass for recording an audio file");
	  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		
			//Calling PlayRecordedAudio() for Audio play back and fast forward scenario
			 logger.info("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			 System.out.println("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			 PlayRecordedAudio();
	  		
	  		}
	  		
	  		catch (Exception e) {
	  			logger.info("Fail: Test8 Fail for recording  audio file");
	  			System.out.println("Fail: Test8 Fail for recording  audio file");
	  			logger.info("Final Message: Fail Test8 Fail for recording  audio file");
		  		System.out.println("Final Message: Fail Test8 Fail for recording  audio file");
		  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
	  		
	  	}
   
	 	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	  		
	  	  	//Clearing Recent Apps
	  		logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  		// Clear recent apps
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
	  		
	  		try
	  		{
	  		
	  	//Launch File Manager application for recorded audio file playBack
	  			logger.info("Launch File Manager Application");
				System.out.println("Launch File Manager Application");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
			//Select SD Card
	  		String text2 = "SD card";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Click On SD Card");
			System.out.println("Click On SD Card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select SD Card");
			System.out.println("Select SD Card");
			
			//Select Music folder
			logger.info("Select Recordings Folder");
			System.out.println("Select Recordings Folder");
	  		String text1 = "Recordings";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Recordings\")").click();
			TimeUnit.SECONDS.sleep(5);
	  		//Select Voice recorder
			logger.info("Select Voice recorder");
			System.out.println("Select Voice recorder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Voice Recorder\")").click();
			TimeUnit.SECONDS.sleep(5);
	  		logger.info("Click Audio file for play back and fast forward");
	  		System.out.println("Click Audio file for play back and fast forward");
			//Click 1st File to Play Video
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			TimeUnit.SECONDS.sleep(30);
		//	MobileElement FasForward = driver.findElement(By.xpath("//*[@bounds='[133,1755][953,1845]']")); 
	//		FasForward.click();
  			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
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
				System.out.println("Fail: Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
				logger.info("Final Message: Fail Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
				System.out.println("Final Message: Fail Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
			}

		}
  
	 	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	  		
	//Clearing Recent Apps
			logger.info("Clear Recent Apps");
			System.out.println("Clear Recent Apps");
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
	  		//Launch File Manager
	  		logger.info("Launch File Manager Application");
	  		System.out.println("Launch File Manager Application");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  	//Select SD Card
	  		logger.info("Click On SD Card");
	  		System.out.println("Click On SD Card");
	  		String text2 = "SD card";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//Search For Test1 Folder
			logger.info("Clicking Test1 Folder");
			System.out.println("Clicking Test1 Folder");
			String text = "Test1";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//click on test_file
			logger.info("Clicking test_file Folder");
			System.out.println("Clicking test_file Folder");
			driver.findElement(By.xpath("//*[@text='test_file']")).click();
			TimeUnit.SECONDS.sleep(5);
			
			//click on 1GB Folder
			logger.info("Clicking 1GB Folder");
			System.out.println("Clicking 1GB Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"1GB\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//CLICK ON MP3 Files Folder
			logger.info("Select MP3 files Folder");
			System.out.println("Select MP3 files Folder");
			//click on Video Folder
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"MP3 Files\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Click on 1st File to Play Video for 30Seconds");
			logger.info("Click on 1st File to Play Video for 30Seconds");
			//Click 1st File to Play Video
			try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"11 Rob Thomas - Lonely No More.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			//Click On Fast Forward
			//MobileElement FasForward = driver.findElement(By.xpath("//*[@bounds='[133,1755][953,1845]']")); 
			//FasForward.click();
  			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Video for 10 Seconds");
			System.out.println("Fast Forwarding Video for 10 Seconds");
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 1st Audio Play Back Successfull ");
			System.out.println("Pass: 1st Audio Play Back Successfull ");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			}
			catch (Exception e) {
	            logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	           // logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	           // System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	           
	        }	
			
			
			logger.info("Click on 2nd File to Play Video for 30Seconds");
			System.out.println("Click on 2nd File to Play Video for 30Seconds");
			//Click 1st File to Play Video
			try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
			
			TimeUnit.SECONDS.sleep(30);
			
			logger.info("Fast Forwarding Video for 10 Seconds");
			System.out.println("Fast Forwarding Video for 10 Seconds");
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 2nd Audio Play back succssfull");
			System.out.println("Pass: 2nd Audio Play back succssfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			}
			catch (Exception e) {
	            logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	           // logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	           // System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	           
	        }
			logger.info("Click on 3rd File to Play Video for 30Seconds");
			System.out.println("Click on 3rd File to Play Video for 30Seconds");
			//Click 1st File to Play Video
			try
			{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Laahe.Mp3.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			//Click On Fast Forward
			//MobileElement FasForward2 = driver.findElement(By.xpath("//*[@bounds='[133,1755][953,1845]']")); 
			//FasForward2.click();
  			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Video for 10 Seconds");
			System.out.println("Fast Forwarding Video for 10 Seconds");
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			logger.info("Pass: 3rd Audio Play Back Successfull ");
			 System.out.println("Pass: 3rd Audio Play Back Successfull ");
			}
			catch (Exception e) {
	            logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
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
	 	
  }