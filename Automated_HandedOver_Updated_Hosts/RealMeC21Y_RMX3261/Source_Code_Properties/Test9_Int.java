package RealMeC21Y;

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
  
  public class Test9_Int
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
	  	public void RearPictureCapture() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		

	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test9_Int.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("========Test9_Int:Capture Rear Camera Images"
	        		+ "Capture for Specified Number of Images based On Resolutions=========");
			logger.info("Setting up the appium desired capabilities");
			SetUp();
			String Result = "Fail";
	  		
	  		
			//Clear recent Apps
			logger.info("Unlocking Phone");
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
	  	  		logger.info("clearing Recent apps ");
	  		
	  		

	  		
	  		}
	  		
	  		
	  		
	  		
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info("No recent found in Background to clear");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	  		
	  		
	  		
	  		//Launch Camera
	  		logger.info("Launch Camera Application");
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
				logger.info("change to SD card element not found : "+exp); 
				
			}
			
			TimeUnit.SECONDS.sleep(2);
			
			
			
			
			//Click On Settings
			//find element by xpath
				
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
		  		TimeUnit.SECONDS.sleep(3);
				logger.info("Click settings option");
				
				//Click on Picture size(Back camera)
				driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
		  		TimeUnit.SECONDS.sleep(3);
				logger.info("Select Resolution option");
				
				//Select 1st resolution
				driver.findElement(By.xpath("//*[@text='(4:3) 13.0 megapixels']")).click();
		  		TimeUnit.SECONDS.sleep(3);
				logger.info("1st resolution selected (4:3) 13.0 megapixels");
				
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
	  		
	  	
	  		Properties prop = new Properties();
	  		// Load properties file
	  		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
	  		TimeUnit.SECONDS.sleep(5);
	  		String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
	  		System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
	  		int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
	  		// capture  pics for the selected resolution
	  		logger.info("Capture Images");
	  		for(int j = 0; j < totalPictureCountRearInt; j++) 
	  		{ 
	  			TimeUnit.SECONDS.sleep(2);
	  			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
	  			 TimeUnit.SECONDS.sleep(2);
	  			System.out.println("clicking Image of Default Resolutions"+j);
	  			logger.info("clicking Image of Default Resolutions"+j);
	  			 
	  		}
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
	  		
	  		//Select 2nd resolution
	  		
	  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
	  		TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			
			//Click on Picture size(Back camera)
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
	  		TimeUnit.SECONDS.sleep(3);
			logger.info("Select Resolution option");
			
			//Select 2nd resolution
			driver.findElement(By.xpath("//*[@text='(4:3) 13.0 megapixels']")).click();
	  		TimeUnit.SECONDS.sleep(3);
			logger.info("2nd resolution selected (4:3) 13.0 megapixels");
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
	  		
	  		
	  		
	  		
  		
  	
  		
  		// Load properties file
  		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
  		TimeUnit.SECONDS.sleep(5);
  		String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");  
  		System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1);
  		int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear);
  		// capture  pics for the selected resolution
  		logger.info("Capture Images");
  		for(int j = 0; j < totalPictureCountRear1Int; j++) 
  		{ 
  			TimeUnit.SECONDS.sleep(2);
  			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
  			 TimeUnit.SECONDS.sleep(2);
  			System.out.println("clicking Image of Default Resolutions"+j);
  			logger.info("clicking Image of Default Resolutions"+j);
  		}
  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
  		//Select 3rd resolution
  		
  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Click settings option");
		
		//Click on Picture size(Back camera)
		driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Select Resolution option");
		
		//Select 3rd resolution
		driver.findElement(By.xpath("//*[@text='(4:3) 3.1 megapixels']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("3rd resolution selected (4:3) 3.1 megapixels");
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		
  		
  		
  		
		
	
		
		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");  
		System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2);
		int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
		// capture  pics for the selected resolution
		logger.info("Capture Images");
		for(int j = 0; j < totalPictureCountRear2Int; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
			 TimeUnit.SECONDS.sleep(2);
			 System.out.println("clicking Image of Default Resolutions"+j);
	  			logger.info("clicking Image of Default Resolutions"+j);
		}
		TimeUnit.SECONDS.sleep(2);		
	  		
	  	//Select 4th Resolution
		
		
		
  		
  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Click settings option");
		
		//Click on Picture size(Back camera)
		driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Select Resolution option");
		
		//Select 4th resolution
		driver.findElement(By.xpath("//*[@text='(16:9) 9.7 megapixels']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("4th resolution selected (16:9) 9.7 megapixels");
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		
  		
  		
  		
		
	
		
		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear3 = prop.getProperty("totalPictureCountRear3");  
		System.out.println("totalPictureCountRear3 = "+ totalPictureCountRear3);
		int totalPictureCountRear3Int=Integer.parseInt(totalPictureCountRear3);
		// capture  pics for the selected resolution
		logger.info("Capture Images");
		for(int j = 0; j < totalPictureCountRear3Int; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
			 TimeUnit.SECONDS.sleep(2);
			 System.out.println("clicking Image of Default Resolutions"+j);
	  			logger.info("clicking Image of Default Resolutions"+j);
		}
		TimeUnit.SECONDS.sleep(2);
		
		
		
	//Select 5th Resolution
		
		
		
  		
  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Click settings option");
		
		//Click on Picture size(Back camera)
		driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Select Resolution option");
		
		//Select 4th resolution
		driver.findElement(By.xpath("//*[@text='(16:9) 3.8 megapixels']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("5th resolution selected (16:9) 3.8 megapixels");
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		
  		
  		
  		
		
	
		
		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear4 = prop.getProperty("totalPictureCountRear4");  
		System.out.println("totalPictureCountRear4 = "+ totalPictureCountRear4);
		int totalPictureCountRear4Int=Integer.parseInt(totalPictureCountRear4);
		// capture  pics for the selected resolution
		logger.info("Capture Images");
		for(int j = 0; j < totalPictureCountRear4Int; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
			 TimeUnit.SECONDS.sleep(2);
			 System.out.println("clicking Image of Default Resolutions"+j);
	  			logger.info("clicking Image of Default Resolutions"+j);
		}
		TimeUnit.SECONDS.sleep(2);
		
	  		
	  		
		
		//Select 6th resolution
		

		
		
		
  		
  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Click settings option");
		
		//Click on Picture size(Back camera)
		driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Select Resolution option");
		
		//Select 4th resolution
		driver.findElement(By.xpath("//*[@text='(16:9) 2.4 megapixels']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("6th resolution selected (16:9) 2.4 megapixels");
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		
  		
  		
  		
		
	
		
		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear5 = prop.getProperty("totalPictureCountRear5");  
		System.out.println("totalPictureCountRear5 = "+ totalPictureCountRear5);
		int totalPictureCountRear5Int=Integer.parseInt(totalPictureCountRear5);
		// capture  pics for the selected resolution
		logger.info("Capture Images");
		for(int j = 0; j < totalPictureCountRear4Int; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
			 TimeUnit.SECONDS.sleep(2);
			 System.out.println("clicking Image of Default Resolutions"+j);
	  			logger.info("clicking Image of Default Resolutions"+j);
		}
		TimeUnit.SECONDS.sleep(2);
		
		
		
		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		// switch to back camera
	  		TimeUnit.SECONDS.sleep(5);
	  		//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
	  		//TimeUnit.SECONDS.sleep(5);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		Result ="Pass";
	  		
	  		if(Result == "Pass")
	  		{
	  			logger.info("Test9_Int executed successfully!!");	
	  		}
	  			
	  		else
	  		{
	  			logger.info("Test 9_Int Fail");
	  		}
	  		
	  		
	  		
	  	}
	  
	  
	  
	  
  }