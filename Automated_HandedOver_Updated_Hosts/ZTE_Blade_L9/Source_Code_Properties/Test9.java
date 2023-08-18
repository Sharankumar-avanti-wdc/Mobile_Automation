package ZTE_Blade_L9;

import org.testng.annotations.Test;
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
  
  public class Test9
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
	  	public void RearPictureCapture() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test9.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("Test: Start");
	        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        logger.info("Test9 Scenario is follows:");
	        logger.info("1.Launch camera application, set uSD as a Storage option, start rear camera Image capture for all host resolutions");
			logger.info("Setting up the appium desired capabilities");
			 System.out.println("Test9 Scenario is follows:");
		     System.out.println("Launch camera application, set USD as a Storage option, start rear camera Image capture for all host resolutions");
		     System.out.println("Setting up the appium desired capabilities");
			SetUp();
			String Result = "Fail";
			//Unlock phone
	  		((AndroidDriver) driver).unlockDevice();
			 TimeUnit.SECONDS.sleep(5);
			 //Launch home screen
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
	  			
  			//Launch Camera application for rear camera video recording.
				logger.info("Launch Camera application for rear camera Image capture");
				System.out.println("Launch Camera application for rear camera Image capture");
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
			logger.info("Select first rear default camera resolution");
			System.out.println("Select first rear default camera resolution");
			//driver.findElement(By.xpath("//*[@content-desc='Aspect ratio 3:4']")).click();
	  		//TimeUnit.SECONDS.sleep(3);
	  		
		  	 // Load properties file
	  		Properties prop = new Properties();
	  		prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
	  		TimeUnit.SECONDS.sleep(5);
	  		String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
	  		System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
	  		int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
	  		
	  		logger.info("Capture Images");
	  		for(int j = 0; j < totalPictureCountRearInt; j++) 
	  		{ 
	  			TimeUnit.SECONDS.sleep(2);
	  			//Start image capture
	  			MobileElement shutter = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.cameralite:id/center_button']"));
		  		shutter.click();
	  			 TimeUnit.SECONDS.sleep(5);
	  			System.out.println("clicking first Resolution image "+j);
	  			logger.info("clicking first Resolution image "+j);
	  			 
	  		}
	  		TimeUnit.SECONDS.sleep(2);
	  
	  		// switch to back camera
	  		TimeUnit.SECONDS.sleep(5);
	  		//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
	  		//TimeUnit.SECONDS.sleep(5);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		Result ="Pass";
	  		
	  		if(Result == "Pass")
	  		{
	  			logger.info("Pass: Test9 pass for rear Image capture");
	  			
	  			System.out.println("Pass: Test9 pass for rear Image capture");
	  			
	  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  			System.out.println("Final message: Pass Test9 pass for rear Image capture");
	  			logger.info("Final message: Pass Test9 pass for rear Image capture");
	  			logger.info("Test: End");
	  		}
	  			
	  		else
	  		{
	  			logger.info("Final message: Fail Test9 Fail for Image capture");
	  			System.out.println("Final message: Fail Test9 Fail for Image capture");
	  			logger.info("Test: End");
	  			 
	  		}
	  		
	  		
	  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		
	  	}
	  }
