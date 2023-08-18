package Sony_Xperia1_II_XQAT52;
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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-AT52");
			dc.setCapability(MobileCapabilityType.UDID, "QV710PLJ3F");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
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
	  		
	  		//Launch Camera application and start front camera images for all resolutions
	  		logger.info("Launch Camera application and start front camera images for all resolutions");
	  		System.out.println("Launch Camera application and start front camera images for all resolutions");
	  		((StartsActivity) driver).startActivity(new Activity("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
			
	  		//IF Location access notification pop-up exists select Cancel option.
	  			logger.info("if Location permisson Pop Exists Select Cancel Option");
	  			System.out.println("if Location permisson Pop Exists Select Cancel Option");
			try 
			{ 
				MobileElement CancelLocationAccess =	driver.findElement(By.xpath("//*[@text='NO']"));
				CancelLocationAccess.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Deny =	driver.findElement(By.xpath("//*[@text='DENY']"));
				Deny.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Cancel =	driver.findElement(By.xpath("//*[@text='CANCEL']"));
				Cancel.click();
				TimeUnit.SECONDS.sleep(3);
				
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 
				
			}
			
			
		
			//Switch to back camera if current existing camera is Front camera.
			try {
				
				MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to front camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToFrontCamera.click();
				logger.info("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
				System.out.println("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
			}
			
			catch(Exception exp)
			{ 
					// Block of code to handle errors
				logger.info("Currently camera is already in rear camera mode no need to switch"); 
			}
			
			//Select Photo Mode option
			MobileElement PhotoMode = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"PHOTO\"]"));
			TimeUnit.SECONDS.sleep(2);
			PhotoMode.click();
			
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			TimeUnit.SECONDS.sleep(5);
			Settings.click();
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Search for Data storage option");
			System.out.println("Search for Data storage option");
			String text = "Data storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Data storage\")").click();
			TimeUnit.SECONDS.sleep(5);
		
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			//Select settings option and select resolution
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			
	  		
		  	//Select Front Image size
		  		logger.info("Select Front Image size");
		  		System.out.println("Select Front Image size");
		  		MobileElement RearImage = driver.findElement(By.xpath("//*[@text='Still image size']"));
	  			RearImage.click();
	  			
	  			
	  		//Select 1st resolution
	  			logger.info("Select First front Image Resoution: 3:4");
	  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='4:3 (8MP)']"));
	  			FirstRes.click();
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
		  		
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
		  			MobileElement ClickShutterButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
					
					ClickShutterButton.click();
					TimeUnit.SECONDS.sleep(6);
		  			System.out.println("clicking First resolution Image"+j);
		  			logger.info("clicking First resolution Image"+j);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  		////
		  	//Select settings option and select resolution
				MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings2.click();
				TimeUnit.SECONDS.sleep(5);
				
		  		
			  	//Select Front Image size
			  		logger.info("Select Front Image size");
			  		System.out.println("Select Front Image size");
			  		MobileElement RearImage1 = driver.findElement(By.xpath("//*[@text='Still image size']"));
		  			RearImage1.click();
		  			
		  			
		  		//Select second resolution
		  			logger.info("Select second front Image Resoution: 16:9 (6MP)");
		  			System.out.println("Select second front Image Resoution: 16:9 (6MP)");
		  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='16:9 (6MP)']"));
		  			SecondRes.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
			  		
			  		Properties prop1 = new Properties();
			  		// Load properties file
			  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
			  		System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1);
			  		int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);
			  		// capture  pics for the selected resolution
			  		logger.info("Capture Images");
			  		for(int j = 0; j < totalPictureCountFront1Int; j++) 
			  		{ 
			  			TimeUnit.SECONDS.sleep(2);
			  			MobileElement ClickShutterButton1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
						
						ClickShutterButton1.click();
						TimeUnit.SECONDS.sleep(6);
			  			System.out.println("clicking second resolution Image"+j);
			  			logger.info("clicking second resolution Image"+j);
			  		}
			  		TimeUnit.SECONDS.sleep(2);
			  		
			  		//
			  		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings3.click();
					TimeUnit.SECONDS.sleep(5);
					
			  		
				  	//Select Front Image size
				  		logger.info("Select Front Image size");
				  		System.out.println("Select Front Image size");
				  		MobileElement RearImage2 = driver.findElement(By.xpath("//*[@text='Still image size']"));
			  			RearImage2.click();
			  			
			  			
			  		//Select second resolution
			  			logger.info("Select third  Image Resoution: 1:1 (6MP)");
			  			System.out.println("Select third front Image Resoution: 1:1 (6MP)");
			  			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='1:1 (6MP)']"));
			  			ThirdRes.click();
				  		TimeUnit.SECONDS.sleep(2);
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
				  		
				  		Properties prop2 = new Properties();
				  		// Load properties file
				  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
				  		TimeUnit.SECONDS.sleep(5);
				  		String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
				  		System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
				  		int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
				  		// capture  pics for the selected resolution
				  		logger.info("Capture Images");
				  		for(int j = 0; j < totalPictureCountFront2Int; j++) 
				  		{ 
				  			TimeUnit.SECONDS.sleep(2);
				  			MobileElement ClickShutterButton2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
							
							ClickShutterButton2.click();
							TimeUnit.SECONDS.sleep(6);
				  			System.out.println("clicking third resolution Image"+j);
				  			logger.info("clicking third resolution Image"+j);
				  		}
				  		TimeUnit.SECONDS.sleep(2);
		  	
	  		// switch to back camera
	  		TimeUnit.SECONDS.sleep(5);
	  		MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to the main camera\"]"));
			
			SwitchToBackCamera.click();
	  		TimeUnit.SECONDS.sleep(5);
	  		
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