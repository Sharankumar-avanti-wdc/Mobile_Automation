package ZTE_Blade_L9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
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

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
  
  public class Test9F
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
		public void frontPictureCapture() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		//Log File Generating Script
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test9F.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("Test: Start");
	        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        logger.info("Test9F Scenario is as follows:");
	        logger.info("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
			logger.info("Setting up the appium desired capabilities");
			 System.out.println("Test9F Scenario is as follows:");
		     System.out.println("Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		     System.out.println("Setting up the appium desired capabilities");
		     logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			SetUp();
			String Result = "Fail";
	  		
	  		//Launch Home screen and Clear recent apps
	  		logger.info("Launch Home screen and Clear recent apps");
	  		System.out.println("Launch Home screen and Clear recent apps");
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
	 
	  		logger.info("Launch Camera Application");
	  		//Launch Camera Application for Front camera picture Capture for all Host resolutions.
	  		logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
	  		System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.cameralite", "com.google.android.apps.cameralite.capture.CaptureActivity"));
	  		//If Change to SD Card notification pop-up exists select Cancel Option
	  		logger.info("If change to uSD card pop-up exists select Cancel");
	  		System.out.println("If change to uSD card pop-up exists select Cancel");
	  		try 
	  		{ 
	  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
	  			TimeUnit.SECONDS.sleep(2);
	  		} 
	  		catch(Exception exp)
	  		{ 
	  				// Block of code to handle errors
	  			logger.info("change to SD card element not found : "+exp); 
	  			System.out.println("change to SD card element not found : "+exp); 
	  		}
	  		
	  	//If Location access Permission appears Click Cancel Option
	  		logger.info("If Location access Permission Request Pop Exists Click on Cancel. ");
	  		System.out.println("If Location access Permission Request Pop Exists Click on Cancel. ");
	  		try 
	  		{ 
	  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
	  			TimeUnit.SECONDS.sleep(2);
	  		} 
	  		catch(Exception exp)
	  		{ 
	  				// Block of code to handle errors
	  			logger.info("Location access pop-up  not found : "+exp); 
	  		}
	  		TimeUnit.SECONDS.sleep(5);
	  	
	  	//Switch to front camera mode
	  		logger.info("Switch to front camera mode");
	  		System.out.println("Switch to front camera mode");
	  		MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/start_button']"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToFrontCamera.click();
			
			//Select Photo mode option
  			logger.info("Select photo mode option");
  			System.out.println("Select photo mode option");
			driver.findElement(By.xpath("//*[@text='Photo']")).click();
			
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/settings_button']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			MobileElement Sdcard = driver.findElement(By.xpath("//*[@content-desc='Save media on SD card']"));
			Sdcard.click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		  	//Select 1st photo resolution
				logger.info("Select first front default camera resolution");
				System.out.println("Select first front rear default camera resolution");
				//driver.findElement(By.xpath("//*[@content-desc='Aspect ratio 3:4']")).click();
		  		//TimeUnit.SECONDS.sleep(3);
				
		  		Properties prop = new Properties();
		  		// Load properties file
		  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
		  		System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
		  		int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);
		  		// capture  pics for the selected resolution
		  		logger.info("Capture Images");
		  		for(int j = 0; j < totalPictureCountFrontInt; j++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			MobileElement ShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/center_button']"));
		  			ShutterButton.click();
		  			 TimeUnit.SECONDS.sleep(2);
		  			System.out.println("clicking First resolution Image"+j);
		  			logger.info("clicking First resolution Image"+j);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  	//Switch to rear camera mode
		  		logger.info("Switch to rear camera mode");
		  		System.out.println("Switch to rear camera mode");
		  		MobileElement SwitchToRearCamera = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/start_button']"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToRearCamera.click();
		  		
	  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		Result ="Pass";
	  		
	  		if(Result == "Pass")
	  		{
	  			logger.info("Pass: Test9F Pass for Front camera image capture");
	  			System.out.println("Pass: Test9F Pass for Front camera image capture");
	  			
	  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		}
	  			
	  		else
	  		{
	  			System.out.println("Final message: Fail Test9F for front camera image capture");
	  			logger.info("Final message: Fail Test9F for front camera image capture");
	  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		}
	  		logger.info("Final message: Pass Test9F pass for front image capture");
  			System.out.println("Final message: Pass Test9F pass for front image capture");
	  		logger.info("Test: End");
	  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  	}
  }
