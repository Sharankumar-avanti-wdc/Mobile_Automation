package Sony_Xperia1_II_XQAT52;
import org.testng.annotations.Test;
import Sony_Xperia1_II_XQAT52.Test9;
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
	  		
	  		//Launch Home Screen and Clear recent apps
	  		logger.info("Launch Home Screen and Clear recent");
	  		System.out.println("Launch Home Screen and Clear recent");
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
				
				MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to the main camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();
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
			
			//Click Settings option and Select resolution
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			
	  		
	  	//Click On Rear Image Resolution to select first resolution
	  		logger.info("Select Rear Image Size");
	  		System.out.println("Select Rear Image Size");
	  		MobileElement StillImage = driver.findElement(By.xpath("//*[@text='Still image size']"));
	  		StillImage.click();
	  		
	  		
  			
  			
  		//Select 1st resolution
  			logger.info("Select first Image Resoution: 4:3 (12MP)");
  			System.out.println("Select first Image Resoution: 4:3 (12MP)");
  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='4:3 (12MP)']"));
  			FirstRes.click();
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
	  		
	  		Properties prop = new Properties();
	  		// Load properties file
	  		prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
	  		TimeUnit.SECONDS.sleep(5);
	  		String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
	  		System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
	  		int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
	  		// capture  pics for the selected resolution
	  		logger.info("Capture Images");
	  		for(int j = 0; j < totalPictureCountRearInt; j++) 
	  		{ 
	  			TimeUnit.SECONDS.sleep(2);
	  			MobileElement ClickShutterButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
				
				ClickShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
	  			 
	  			System.out.println("clicking First   Resolution Image"+j);
	  			logger.info("clicking First  Resolution Image"+j);
	  		}
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  	//Click On Rear Image Resolution to select 2nd resolution
	  		MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			Settings2.click();
			TimeUnit.SECONDS.sleep(5);
			
	  		
	  	//Click On Rear Image Resolution to select first resolution
	  		logger.info("Select Rear Image Size");
	  		System.out.println("Select Rear Image Size");
	  		MobileElement StillImage1 = driver.findElement(By.xpath("//*[@text='Still image size']"));
	  		StillImage1.click();
	  		
	  		
  			
  			
  		//Select 1st resolution
  			logger.info("Select first Image Resoution: 16:9 (9MP)");
  			System.out.println("Select first Image Resoution: 16:9 (9MP)");
  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='16:9 (9MP)']"));
  			SecondRes.click();
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
	  		
	  		Properties prop1 = new Properties();
	  		// Load properties file
	  		prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
	  		TimeUnit.SECONDS.sleep(5);
	  		String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");  
	  		System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1);
	  		int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear1);
	  		// capture  pics for the selected resolution
	  		logger.info("Capture Images");
	  		for(int j = 0; j < totalPictureCountRear1Int; j++) 
	  		{ 
	  			TimeUnit.SECONDS.sleep(2);
	  			MobileElement ClickShutterButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
				
				ClickShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
	  			 
	  			System.out.println("clicking Second   Resolution Image"+j);
	  			logger.info("clicking Second  Resolution Image"+j);
	  		}
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		//Click Setting and select third resolution
	  		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			Settings3.click();
			TimeUnit.SECONDS.sleep(5);
			
	  		
	  	//Click On Rear Image Resolution to select first resolution
	  		logger.info("Select Rear Image Size");
	  		System.out.println("Select Rear Image Size");
	  		MobileElement StillImage2 = driver.findElement(By.xpath("//*[@text='Still image size']"));
	  		StillImage2.click();
	  		
	  		
  			
  			
  		//Select 1st resolution
  			logger.info("Select first Image Resoution: 1:1 (9MP)");
  			System.out.println("Select first Image Resoution: 1:1 (9MP)");
  			MobileElement ThridRes = driver.findElement(By.xpath("//*[@text='1:1 (9MP)']"));
  			ThridRes.click();
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
	  		
	  		Properties prop2 = new Properties();
	  		// Load properties file
	  		prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
	  		TimeUnit.SECONDS.sleep(5);
	  		String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");  
	  		System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2);
	  		int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
	  		// capture  pics for the selected resolution
	  		logger.info("Capture Images");
	  		for(int j = 0; j < totalPictureCountRear2Int; j++) 
	  		{ 
	  			TimeUnit.SECONDS.sleep(2);
	  			MobileElement ClickShutterButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
				
				ClickShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
	  			 
	  			System.out.println("clicking third   Resolution Image"+j);
	  			logger.info("clicking third  Resolution Image"+j);
	  		}
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		TimeUnit.SECONDS.sleep(2);
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
	  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		}
	  		
	  		
	  		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		
	  	}
	  }