package RealMeC21Y;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;

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
  
  public class Test10F_Int
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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C21Y");
			dc.setCapability(MobileCapabilityType.UDID, "1825264110BA062U");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AndroidDriver<MobileElement>(url, dc);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	  	
	  	@Test
		public void frontVideoRec() throws InterruptedException, SecurityException, IOException {
	  		
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test10F.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("========Test10F_Int:Receord Back Camera Video"
	        		+ "record for Specified Duration time based On Resolutions=========");
			logger.info("Setting up the appium desired capabilities");
			SetUp();
			String Result = "Fail";
	  		
	  		
	  		
	  		
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		//Clear Recenet Apps
	  		
	  		logger.info("Unlocking Phone");
			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		
	  				
	  	
	  		// Click Recent Apps
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		
	  		TimeUnit.SECONDS.sleep(2);
	  		// click on clear all
	  		try
	  		{
	  			
	  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
	  			logger.info("Clearing Recent Apps");
	  			TimeUnit.SECONDS.sleep(5);
	  	  		logger.info("Clearing Recent Apss");
	  		
	  		

	  		
	  		}
	  		
	  		
	  		
	  		
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info("No Recent apps found in Background");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
	  		
	  		
	  		//Launch Camera Application
	  		
	  		
	  		
	  		logger.info("Launch Camera Application");
	  		//Launch Camera Application.
	  		((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraActivity"));
	  		
	  		
	  		//If Permission reuest pop-up exists allow permissons
			try 
			{ 
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/positiveTextView']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
				
			} 
			catch(Exception exp)
			{ 
				logger.info("Notifcation Pop up not found : "+exp); 
				
			}
			
			TimeUnit.SECONDS.sleep(2);
			
			
	  		
	  		
	  		
	  		
	  		
	  		logger.info("Clicking Video Tab");
	  		// click on video tab
	  		TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Switching to Video Tab");
			
			
			//If Current existing camera mode is front camera switch to front camera mode
			
			try {
					
					MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Back camera\"]"));
					TimeUnit.SECONDS.sleep(2);
					SwitchToFrontCamera.click();
					logger.info("Switch To Front Camera if current Exiting camera is back camera");
				}
				
				catch(Exception exp)
				{ 
					//MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front camera\"]"));
					TimeUnit.SECONDS.sleep(2);
					//SwitchToBackCamera.click();
					logger.info("Current Existing Camera is in Front Camera mode"); 
				}
				
			
			//Click settings option
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			
			
			
				//selecting resolution		
	  			
	  			//Click On Rear Video size to select resolution
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video size(Front camera)\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Click video size(Back Camera)");
			
			//Selecting 1st Highest resolution
			driver.findElement(By.xpath("//*[@text='HD 720p']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Selecting 1st resolution HD 720p");
			
			//Clikc Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
				
		  		Properties prop = new Properties();
		  		// Load properties file
		  		prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationfront = prop.getProperty("recordingDurationfront");  
		  		System.out.println("recordingDurationfront = "+ recordingDurationfront);
		  		int recordingDurationfrontInt=Integer.parseInt(recordingDurationfront);	
		  		
		  		
		  		
		  		
		  		
		  		
		  		
			// click on recording button and wait for 5 mins 
		  		logger.info("Start Recording");
		  		MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
		  		StartRecording.click();
		  			
		  		TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
		  		logger.info("Stop Recording");
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		//Select 2nd Resolution
		  		
		  		
		  			
		  		
		  	//Click settings option
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Click settings option");
				
				
				
					//selecting resolution		
		  			
		  			//Click On Rear Video size to select resolution
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video size(Front camera)\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click video size(Back Camera)");
				
				//Selecting 2nd Highest resolution
				driver.findElement(By.xpath("//*[@text='SD 480p']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Selecting 2nd resolution SD 480p");
				
				//Clikc Press Back
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		
				
		  	
		  		// Load properties file
		  		prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationfront1 = prop.getProperty("recordingDurationfront1");  
		  		System.out.println("recordingDurationfront1 = "+ recordingDurationfront1);
		  		int recordingDurationfront1Int=Integer.parseInt(recordingDurationfront1);	
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		logger.info("Start Recording");
		  		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
		  		StartRecording1.click();
		  			
		  		TimeUnit.SECONDS.sleep(recordingDurationfront1Int);
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
		  		logger.info("Stop Recording");
		  		
		  		
		  		
		  		
		  		
		  		
		  		//Select 3rd resolution
		  		
		  	//Click settings option
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Click settings option");
				
				
				
					//selecting resolution		
		  			
		  			//Click On Rear Video size to select resolution
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video size(Front camera)\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click video size(Back Camera)");
				
				//Selecting 3rd Highest resolution
				driver.findElement(By.xpath("//*[@text='CIF']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Selecting 3rd resolution CIF");
				
				//Clikc Press Back
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		
				
		  	
		  		// Load properties file
		  	// Load properties file
		  		prop.load(Test10_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationfront2 = prop.getProperty("recordingDurationfront2");  
		  		System.out.println("recordingDurationfront2 = "+ recordingDurationfront2);
		  		int recordingDurationfront2Int=Integer.parseInt(recordingDurationfront2);	
		  		
		  		
		  		
		  		
		  		
		  		
		  		
			// click on recording button and wait for 5 mins 
		  		logger.info("Start Recording");
		  		MobileElement StartRecording2 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
		  		StartRecording2.click();
		  			
		  		TimeUnit.SECONDS.sleep(recordingDurationfront2Int);
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
		  		logger.info("Stop Recording");
  		
  		
		  		//Switch Back to Rear Camera Mode
		  		MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();
  		
  		
	  		
	  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		//Calling VideoPlayBackForSleepWake() to Play front camera recorded video play back,Pause video,Lock Phone wait 30secs and Unlock and play back video from Pause duration
	  		logger.info("Calling VideoPlayBackForSleepWake() to Play front camera recorded video play back,Pause video,Lock Phone wait 30secs and Unlock and play back video from Pause duration");
	  		VideoPlayBackForSleepWake();
	  		
	  			
	  		
	  	}
	  
	  	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException {  
	  		
	  		
	  		
	  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  		
	  		  	//Clearing Recent Apps
	  			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		
	  	  	
	  	  		// Click Recent Apps
	  	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		
	  	  		
	  	  		TimeUnit.SECONDS.sleep(2);
	  	  		// click on close all
	  	  		try
	  	  		{
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
	  	  			logger.info("Clearing Recent Apps");
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  	  		logger.info("Clearing recent apps from background");
	  	  		
	  	  		

	  	  		
	  	  		}
	  	  		
	  	  		
	  	  		
	  	  		
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	            logger.info("No recent apps found in background");
	  	        }
	  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  	  		TimeUnit.SECONDS.sleep(2);
	  		  		
	  		  		
	  	  		//Launching File Manager application for front recorded video play back
	  	  		
	  		  		
	  		  	
	  	  	//Launch File Manager Application
	  	  		((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		
	  	  		//If permission pop up exists during application launch allow permission
	  	  		try
	  	  		{
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  	  		
	  	  			
	  	  		
	  	  		

	  	  		
	  	  		}
	  	  		
	  	  		
	  	  		
	  	  		
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	           
	  	        }
	  	  		
	  	  		
	  	  		//Select Internal Storage
	  	  		driver.findElement(By.xpath("//*[@text='Phone storage']")).click();
	  	  		TimeUnit.SECONDS.sleep(3);
	  	  		logger.info("Selecting Internal Storage");
	  				
	  				//Click DCIM
	  				
	  				logger.info("Click  DCIM Folder");
	  				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
	  				TimeUnit.SECONDS.sleep(5);
	  		  		
	  				//Click On Camera
	  				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
	  				TimeUnit.SECONDS.sleep(5);
	  		  		logger.info("Click Camera Folder");
	  		  		
	  		  		//click sort By option
		  		  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Sort by\")").click();
	  				TimeUnit.SECONDS.sleep(5);
	  		  		logger.info("Click sort by");
	  		  		
	  		  		//click Date option to sort
		  		  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Date\")").click();
	  				TimeUnit.SECONDS.sleep(5);
	  		  		logger.info("Click sort by Date");
	  		  		
	  		  		//Select latest front recorded  file to play
	  		  		driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/file_name']")).click();
	  		  		logger.info("Started video playback");
	  		  		TimeUnit.SECONDS.sleep(20);
	  		  		
	  		  		//Tap Somewhere on Screen for contents to visible on Screen
		  		  	logger.info("Tap Somewhere on Screen for contents to visible on Screen");
		  		  MobileElement TapOnSreen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
		  		  		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android."
		  		  		+ "widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[5]/androidx.viewpager.widget.ViewPager/android.view."
		  		  		+ "ViewGroup/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View"));
		  		
		  		TapOnSreen.click();
		  		  	
		  		  	//Clikc Pause button
		  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.photos:id/photos_videoplayer_pause_button']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
		  		
		  		
		  	//Locking Mobile
				 ((AndroidDriver) driver).lockDevice();
				 TimeUnit.SECONDS.sleep(30);
				 
				//Unlocking Device 
				logger.info("Wait For 30Seconds");
				 ((AndroidDriver) driver).unlockDevice();
				 TimeUnit.SECONDS.sleep(5);
		  		
				 TimeUnit.SECONDS.sleep(30);
				 
		  		
		  		
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				
  			//click sort By option
	  		  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Sort by\")").click();
  				TimeUnit.SECONDS.sleep(5);
  		  		logger.info("Click sort by");
  		  		
  		  		//click Date option to sort
	  		  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Name\")").click();
  				TimeUnit.SECONDS.sleep(5);
  		  		logger.info("Click sort by Date");
  				
  				
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  				
  				TimeUnit.SECONDS.sleep(2);
		  		
	  		  		
	  				
	  				
	  				logger.info("Pass: Test10F Pass For front video play back,locking, Unlocking phone and play back from pause video duration.");
	  				logger.info("Press Back ");
	  				
	  				
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
				
				
				
				
				
				
				
				
				
				
		  		
		  		
		  	}
			      
		  	
		  	
		  
		  
		  
	  }	