package ZTE_Blade_L9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import io.appium.java_client.android.AndroidElement;
  
  public class Test10
  {
	  // initializing the driver instance and declarind desired capabilities
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
		public void rearVideoRec() throws InterruptedException, SecurityException, IOException {
	  		
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test10.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("Test: Start");
	    	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        logger.info("Test10 Scenario is as follows");
	        logger.info("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
	        logger.info("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
	        logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
			logger.info("Setting up the appium desired capabilities");
			System.out.println("Test10 Scenario is as follows");
	        System.out.println("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
	        System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
	        System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
			System.out.println("Setting up the appium desired capabilities");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			SetUp();
			String Result = "Fail";
	  		TimeUnit.SECONDS.sleep(5);
	  		((AndroidDriver) driver).unlockDevice();
			 TimeUnit.SECONDS.sleep(5);
			//Launch Home screen 
			 logger.info("Launch home screen");
			 System.out.println("Launch home screen");
			 ((StartsActivity) driver).startActivity(new Activity("com.zte.mifavor.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
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
  			//Launch Camera application for rear camera video recording.
  				logger.info("Launch Camera application for rear camera video recording");
  				System.out.println("Launch Camera application for rear camera video recording");
  				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.cameralite", "com.google.android.apps.cameralite.capture.CaptureActivity"));
  				
  	  			TimeUnit.SECONDS.sleep(6);
  		
		//If location permission pop-up exists select deny  option
		try 
		{ 
			//Click Deny Option
			driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		//Do you want to deny? click ok
	  		driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
	  		TimeUnit.SECONDS.sleep(3);		
		} 
		catch(Exception exp)
		{ 
			logger.info("No location permission access pop-up found: "+exp); 
			
		}
		
		//Swith to video tab
		logger.info("Switch to video tab");
		System.out.println("Switch to video tab");
		driver.findElement(By.xpath("//*[@text='Video']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/settings_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		
		//Select SD Card
  		logger.info("Select  SD Card");
  		System.out.println("Select  SD Card");
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  		MobileElement Sdcard1= driver.findElement(By.xpath("//*[@text='SD card']"));
		Sdcard1.click();
		TimeUnit.SECONDS.sleep(5);
				
			//Click Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	   //Select first highest resolution 4Kfps.
		logger.info("Select first default rear video resolution");
		System.out.println("Select first  default rear video resolution");
		//MobileElement FirstRes = driver.findElement(By.xpath("//*[@content-desc='Resolution 4K UHD']"));
		//	FirstRes.click();
	   
		
		// Load properties file for video recording duration
	  		Properties prop = new Properties();
		  	prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationRear = prop.getProperty("recordingDurationRear");  
		  		System.out.println("recordingDurationRear = "+ recordingDurationRear);
		  		int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
		  		
		  		// Click Start video recording for specified duration time
		  		logger.info("Start video recording for specified duration time");
		  		System.out.println("Start video recording for specified duration time");
		  		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/center_button']"));
		  		StartRecording.click();
		  		TimeUnit.SECONDS.sleep(recordingDurationRearInt);
		  		
		  		//Stop video recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/center_button']"));
		  		StopRecording.click();
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  		// Switch to default photo mode
		  		logger.info("Clicking photo Tab");
		  		System.out.println("Clicking photo Tab");
		  		TimeUnit.SECONDS.sleep(5);
		  		driver.findElement(By.xpath("//*[@text='Photo']")).click();
				TimeUnit.SECONDS.sleep(5);
		  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		logger.info("Pass: Rear video recording is successfull");
	  		System.out.println("Pass: Rear video recording is successfull");
	  		
	  		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		
			logger.info("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
	  		System.out.println("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
	  		RecordedVideoPlayback();
			
	  		}
	  		catch (Exception e) {
		            logger.info("Fail: Test10 Fail for Rear camera video recording ");
		            logger.info("Final Message: Fail Test10 Fail for Rear camera video recording");
		          System.out.println("Fail: Test10 Fail for Rear camera video recording ");
		        System.out.println("Final Message: Fail Test10 Fail for Rear camera video recording");
		        }
	  	}
	  //Calling video playback() for Playing Highest record video, fast forward video play back
		public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

			//Clearing Recent Apps
			((StartsActivity) driver).startActivity(new Activity("com.zte.mifavor.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
			// Click Recent Apps
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
			//Launch Camera Application for rear camera video recording
			logger.info("Launch Camera Application for rear camera video recording");
			System.out.println("Launch Camera Application for rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//Scroll Up to find SD card option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select External Storage");
			System.out.println("Select External Storage");		
			//MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
			//Ext.click();
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(5);

			//Scroll Up to find DCIM Folder
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));

			//Select DCIM folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM folder");
			MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);

			//Select camera folder
			logger.info("Select Camera folder");
			System.out.println("Select Camera folder");
			MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
			Camera.click();
			TimeUnit.SECONDS.sleep(3);

			try {
				//Select more options
				logger.info("select more options");
				System.out.println("select more options");
				MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions.click();

				//Select Sort By 
				logger.info("Select Sort BY");
				System.out.println("Select Sort BY");
				MobileElement Sortby = driver.findElement(By.xpath("//*[@text='Sort by']")); 
				Sortby.click();
				TimeUnit.SECONDS.sleep(3);

				//Select Largest First
				logger.info("Select Largest first");
				System.out.println("Select Largest first");   
				MobileElement Largest = driver.findElement(By.xpath("//*[@text='Largest first']")); 
				Largest.click();
				TimeUnit.SECONDS.sleep(3);

				//Select Highest resolution video file to play
				logger.info("Click on first file to play highest recorded resolution video file");
				System.out.println("Click on first file to play highest recorded resolution video file");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
				logger.info("Started video playback");
				TimeUnit.SECONDS.sleep(20);
				
				try
				{
					MobileElement OK = driver.findElement(By.xpath("//*[@text='OK']")); 
					OK.click();
					TimeUnit.SECONDS.sleep(3);
				}	

					catch(Exception e)
					{ 
						e.printStackTrace();
						
					}
				

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();

				//Click Fast forward button
				logger.info("Fast forward video for 10 seconds");
				System.out.println("Fast forward video for 10 seconds");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				TimeUnit.SECONDS.sleep(20);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: Recorded Video play back and fast forward successfull ");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				logger.info("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				CopiedvideosPlayBack();				
			}
			catch (Exception e) {

				logger.info("Fail: Test10 Fail for RecordedVideoPlayBack()");
				logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
				System.out.println("Fail: Test10 Fail for RecordedVideoPlayBack()");
				System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

			//Clearing Recent Apps
			((StartsActivity) driver).startActivity(new Activity("com.zte.mifavor.launcher", "com.android.launcher3.uioverrides.QuickstepLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
			// Click Recent Apps
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

			//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
			logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			////Scroll Up to find SD card
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select External Storage	
			logger.info("Select external storage");
			System.out.println("Select external storage");	
			//MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select External Storage");
			//Ext.click();

			//MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			//      "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			//     ".scrollIntoView(new UiSelector().text(\"Test1\"))"));
			//Select Test1 folder
			logger.info("Select Test1 folder");
			System.out.println("Select Test1 folder");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test1 folder folder
			logger.info("Select test_filefolder");
			System.out.println("Select test_file folder");
			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
			TestFile.click();
			TimeUnit.SECONDS.sleep(3);

			//Select OneGB folder
			logger.info("Select OneGB folder");
			System.out.println("Select OneGB folder");
			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
			oneGB.click();
			TimeUnit.SECONDS.sleep(3);

			//Select Video folder
			logger.info("Select video folder");
			System.out.println("Select video folder");
			MobileElement Video = driver.findElement(By.xpath("//*[@text='Video']")); 
			Video.click();
			TimeUnit.SECONDS.sleep(3);
			try {
				//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
				System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
				logger.info("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
				MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4\"))"));

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
				logger.info("Started video playback");
				TimeUnit.SECONDS.sleep(20);

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();

				//Click Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				TimeUnit.SECONDS.sleep(20);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: 4K Video play back and fast forward is successful ");
				TimeUnit.SECONDS.sleep(3);
			}

			catch(Exception exp)
			{ 
				logger.info("Fail: Test10 Fail for 4K video play back "+exp); 
				System.out.println("Fail: Test10 Fail for 4K video play back: "+exp); 
				logger.info("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
				System.out.println("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
			logger.info("Started video playback");
			TimeUnit.SECONDS.sleep(20);
			try {
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/quick_seek_overlay']")).click();

				//Click Fast forward button
				logger.info("Click fast forward button for 10 seconds video forward");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				logger.info("Click pause button to stop video");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: FHD Video play back and fast forward is successful ");

				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
				System.out.println("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
			}

			catch(Exception exp)
			{ 
				logger.info("Fail: Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
				System.out.println("Fail: Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
				logger.info("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
				System.out.println("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			logger.info("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);

		} 
	}


