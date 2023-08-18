package ZTE_Blade_L9;

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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ZTE Blade L9");
			dc.setCapability(MobileCapabilityType.UDID, "320216723823");
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
			((StartsActivity) driver).startActivity(new Activity("com.zte.mifavor.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  	//Clearing Recent Apps
	  		try
	  		{
	  			logger.info("Clearing Recent Apps");
	  			System.out.println("Clearing Recent Apps");
	  			MobileElement  closeAll =	driver.findElement(By.xpath("//*[@bounds='[210,806][270,866]']"));
	  			closeAll.click();
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
	  		//Launch Voice recorder application for Audio recording
	  		logger.info("Launch Voice recorder application for Audio recording");
	  		System.out.println("Launch Voice recorder application for Audio recording");
	  		//if Allow Pop up permissions exists Choose 1st option
	  		((StartsActivity) driver).startActivity(new Activity("cn.zte.recorder", "cn.zte.recorder.RecordHomeActivity"));
	  		
	  		//If application launch permission pop-up exists accept allow permission to launch application
	  		logger.info("If application launch permission pop-up exists accept allow permission to launch application");
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
	  		//Start Recording
	  		logger.info("Start Recording");
	  		System.out.println("Start Recording");
	  		driver.findElement(By.id("cn.zte.recorder:id/centerButton")).click();
			TimeUnit.SECONDS.sleep(120);
			// stop recording
			logger.info("Stop Recording");
	  		System.out.println("Stop Recording");
	  		driver.findElement(By.id("cn.zte.recorder:id/centerButton")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		driver.findElement(By.id("cn.zte.recorder:id/finishButton")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		driver.findElement(By.id("android:id/button1")).click();
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
	  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		
			//Calling PlayRecordedAudio() for Audio play back and fast forward scenario
			 logger.info("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			 System.out.println("Calling PlayRecordedAudio() for Audio play back and fast forward scenario");
			 PlayRecordedAudio();
	  		
	  		}
	  		
	  		catch (Exception e) {
	  			logger.info("Fail: Test8 Fail for recording  audio file");
		  		System.out.println("Final Message:Fail Test8 Fail for recording  audio file");
		  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
	  		
	  	}
   
	 	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	  		
	  	  	//Clearing Recent Apps
			logger.info("Clearing Recent Apps");
			((StartsActivity) driver).startActivity(new Activity("com.zte.mifavor.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		// Clear recent apps
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  	//Clearing Recent Apps
	  		try
	  		{
	  			logger.info("Clearing Recent Apps");
	  			System.out.println("Clearing Recent Apps");
	  			MobileElement  closeAll =	driver.findElement(By.xpath("//*[@bounds='[210,806][270,866]']"));
	  			closeAll.click();
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  	}
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info("No recent apps found");
	            System.out.println("No recent apps found");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		try
	  		{
	  		
	  	//Launch File Manager application for recorded audio file playBack
	  		logger.info("Launch File Manager Application");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
	  		logger.info("Launch File Manager Application");
			logger.info("Click On SD Card");
			System.out.println("Launch File Manager Application");
			//Select SD Card
	  		logger.info("Select  SD Card");
	  		System.out.println("Select  SD Card");
	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
	  		MobileElement Sdcard1= driver.findElement(By.xpath("//*[@text='SD card']"));
			Sdcard1.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select Records folder
			logger.info("Select Records Folder");
			System.out.println("Select Records Folder");
	  		String text1 = "Records";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Records\")").click();
			TimeUnit.SECONDS.sleep(5);
	 
			//Click 1st File to Play Video
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
			//click on FastForward
			MobileElement FasForward = driver.findElement(By.xpath("//*[@bounds='[372,708][444,786]']")); 
			FasForward.click();
  			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Audio for 10 Seconds");
			MobileElement Pause = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")); 
			//Pause.click();
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
			((StartsActivity) driver).startActivity(new Activity("com.zte.mifavor.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward(5)"));
	  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd()"));
	  		//TimeUnit.SECONDS.sleep(5);
	  		// open the recently opened apps screen
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  		// click on close all
	  		try
	  		{
	  			logger.info("Clearing Recent Apps");
	  			System.out.println("Clearing Recent Apps");
	  			MobileElement  closeAll =	driver.findElement(By.xpath("//*[@bounds='[210,806][270,866]']"));
	  			closeAll.click();
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  	}
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info("No recent apps found");
	            System.out.println("No recent apps found");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		//Launch File Manager
	  		logger.info("Launch File Manager Application");
	  		System.out.println("Launch File Manager Application");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
	  	//Select SD Card
	  		logger.info("Select  SD Card");
	  		System.out.println("Select  SD Card");
	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
	  		MobileElement Sdcard1= driver.findElement(By.xpath("//*[@text='SD card']"));
			Sdcard1.click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Test1 Folder
			String text = "Test1";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking Test1Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")").click();
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@bounds='[114,218][200,251]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"1GB\")").click();
			TimeUnit.SECONDS.sleep(5);
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
			MobileElement FasForward = driver.findElement(By.xpath("//*[@bounds='[372,708][444,786]']")); 
			FasForward.click();
  			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Video for 10 Seconds");
			System.out.println("Fast Forwarding Video for 10 Seconds");
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//*[@bounds='[180,687][300,804]']")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 1st Audio Play Back Successfull ");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			}
			catch (Exception e) {
	            logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	           
	        }	
			
			
			logger.info("Click on 2nd File to Play Video for 30Seconds");
			System.out.println("Click on 2nd File to Play Video for 30Seconds");
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
			//Click On Fast Forward
			MobileElement FasForward2 = driver.findElement(By.xpath("//*[@bounds='[372,708][444,786]']")); 
			FasForward2.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Video for 10 Seconds");
			System.out.println("Fast Forwarding Video for 10 Seconds");
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//*[@bounds='[180,687][300,804]']")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 2nd Audio Play back succssfull");
			System.out.println("Pass: 2nd Audio Play back succssfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			}
			catch (Exception e) {
	            logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	           
	        }
			logger.info("Click on 3rd File to Play Video for 30Seconds");
			System.out.println("Click on 3rd File to Play Video for 30Seconds");
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
			//Click On Fast Forward
			MobileElement FasForward2 = driver.findElement(By.xpath("//*[@bounds='[372,708][444,786]']")); 
			FasForward2.click();
  			TimeUnit.SECONDS.sleep(3);
			logger.info("Fast Forwarding Video for 10 Seconds");
			System.out.println("Fast Forwarding Video for 10 Seconds");
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//*[@bounds='[180,687][300,804]']")); 
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: 3rd Audio Play Back Successfull ");
			logger.info("Pass: 3rd Audio Play Back Successfull ");
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
			}
			catch (Exception e) {
	            logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
	            System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
	            logger.info("Test: End");
				System.out.println("Test: End");
	            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			
	 	} 	
	 	
  }


