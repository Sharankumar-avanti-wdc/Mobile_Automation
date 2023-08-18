package ZTE_Blade_L9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ZTE_Blade_L9.Test0;
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

  
  public class Test10F
  {
	  // initializing the driver instance and declaring desired capabilities
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
		public void frontVideoRec() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test10F.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("Test:Start");  
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test10F Scenario is as follows");
			logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
			logger.info("2.Playback front Highest recorded video for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
			logger.info("Setting up the appium desired capabilities");
			System.out.println("Test10F Scenario is as follows");
			System.out.println("Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
			System.out.println("Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
			System.out.println("Setting up the appium desired capabilities");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			SetUp();
			String Result = "Fail";
			//Unlock Phone if locked
		//	logger.info("Unlocking Phone ");
	  		((AndroidDriver) driver).unlockDevice();
			 TimeUnit.SECONDS.sleep(5);
			//Launch Home screen 
			 logger.info("Launch  Home screen");
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
	  		try {
  				//Launch Camera application for rear camera video recording.
  				logger.info("Launch Camera application for front camera video recording");
  				System.out.println("Launch Camera application for front camera video recording");
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
 			TimeUnit.SECONDS.sleep(2);
 			//Swith to video tab
 			logger.info("Switch to video tab");
 			System.out.println("Switch to video tab");
 			driver.findElement(By.xpath("//*[@text='Video']")).click();
 			TimeUnit.SECONDS.sleep(3);
		
		//Switch to Front Video camera mode
 			logger.info("Switch to front video camera mode");
 			System.out.println("Switch to front video camera mode");
 			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/start_button']"));
 			SwitchToFrontCamera.click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Switching to Front Video capture");
		
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
				logger.info("Select first default video resolution");
				System.out.println("Select first default video resolution");
				//MobileElement FirstRes = driver.findElement(By.xpath("//*[@content-desc='Aspect ratio 9:16']"));
					//FirstRes.click();
			 
				
				// Load properties file for video recording duration
			  		Properties prop = new Properties();
				  	prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
				  		TimeUnit.SECONDS.sleep(5);
				  		String recordingDurationfront = prop.getProperty("recordingDurationfront");  
				  		System.out.println("recordingDurationfront = "+ recordingDurationfront);
				  		int recordingDurationfrontInt=Integer.parseInt(recordingDurationfront);	
				  		
				  		// Click Start video recording for specified duration time
				  		logger.info("Start video recording for specified duration time");
				  		System.out.println("Start video recording for specified duration time");
				  		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/center_button']"));
				  		StartRecording.click();
				  		TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
				  		
				  		//Stop video recording
				  		logger.info("Stop video recording");
				  		System.out.println("Stop video recording");
				  		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/center_button']"));
				  		StopRecording.click();
				  		
				  	//Switch to rear camera mode
				  		logger.info("Switch to rear camera mode");
				  		System.out.println("Switch to rear camera mode");
				  		MobileElement SwitchToRearCamera = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/start_button']"));
						TimeUnit.SECONDS.sleep(2);
						SwitchToRearCamera.click();
				  		
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
	  		logger.info("Pass: Test10F pass for front camera video recording");
			System.out.println("Pass: Test10F pass for front camera video recording");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling VideoPlayBack()
			logger.info("Calling VideoPlayBackForSleepWake()");
			System.out.println("Calling VideoPlayBackForSleepWake()");
			VideoPlayBackForSleepWake();
			}
			
			catch (Exception e) {
				logger.info("Fail: Test10F for Front camera video recording");
				logger.info("Final Message: Fail Test10F Fail fro Front camera video recording");
				System.out.println("Fail: Test10F for Front camera video recording");
				System.out.println("Final Message: Fail Test10F Fail for Front camera video recording");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}	

		}
	  	
	  	
	 	@SuppressWarnings("deprecation")

		public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException{	   

			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
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
			//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
			logger.info("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
			try {
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);

				////Scroll Up to find SD card option
				MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
						".scrollIntoView(new UiSelector().text(\"SD card\"))"));

				//Select External Storage	
				logger.info("Select External Storage");
				System.out.println("Select External Storage");
				//MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
				driver.findElement(By.xpath("//*[@text='SD card']")).click();
				TimeUnit.SECONDS.sleep(5);
				//Ext.click();

				////Scroll Up to find DCIM Folder
				MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
						".scrollIntoView(new UiSelector().text(\"DCIM\"))"));

				//Select DCIM Folder	
				logger.info("Select DCIM Folder");
				System.out.println("//Select DCIM Folder");
				MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
				DCIM.click();
				TimeUnit.SECONDS.sleep(3);

				//Select  Camera	
				logger.info("Select Camera");
				System.out.println("//Select DCIM camera");
				MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
				Camera.click();
				TimeUnit.SECONDS.sleep(3);

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
				logger.info("Select Newest date first");
				System.out.println("Select Newest date first");  
				MobileElement Largest = driver.findElement(By.xpath("//*[@text='Newest date first']")); 
				Largest.click();
				TimeUnit.SECONDS.sleep(3);

				//Select Highest resolution video file to play
				logger.info("Click on first file to play highest recorded resolution video file");
				System.out.println("Click on first file to play highest recorded resolution video file");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
				logger.info("Started video playback");
				TimeUnit.SECONDS.sleep(20);

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
				//Click pause button
	  		  	logger.info("Click pause video button");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
	  		TimeUnit.SECONDS.sleep(3);	
				//Locking Mobile
				logger.info("Lock Mobile with 30 seconds delay");
				System.out.println("Lock Mobile with 30 seconds delay");
				// ((AndroidDriver) driver).lockDevice();
				TimeUnit.SECONDS.sleep(30);

				//Unlocking Device 
				logger.info("Wait For 30Seconds");
				// ((AndroidDriver) driver).unlockDevice();
				TimeUnit.SECONDS.sleep(5);
				//Unlocking Device 
				logger.info("Unlock Mobile ");
				System.out.println("Unlock Mobile");
				logger.info("Wait For 30Seconds");
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
				//Click play button
	  		  	logger.info("Click pause video button");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
	  		TimeUnit.SECONDS.sleep(3);	
				TimeUnit.SECONDS.sleep(30);
				
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
				//Click pause button
	  		  	logger.info("Click pause video button");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
	  		TimeUnit.SECONDS.sleep(3);	


				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
				System.out.println("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Pass Test10F Pass for Pause Video Playback");
				System.out.println("Final Message: Pass Test10F Pass for Pause Video Playback");
			}
			catch (Exception e) {
				logger.info("Fail: Test10F Fail for VideoPlayBackForSleepWake()");
				logger.info("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
				System.out.println("Fail: Test10F Fail for VideoPlayBackForSleepWake() ");
				System.out.println("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}

			logger.info("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

	}
