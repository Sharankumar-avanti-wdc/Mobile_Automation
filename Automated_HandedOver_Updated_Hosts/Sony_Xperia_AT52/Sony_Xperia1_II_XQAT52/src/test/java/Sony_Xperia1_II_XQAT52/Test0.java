package Sony_Xperia1_II_XQAT52;
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
import com.google.common.collect.ImmutableMap;
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
import junit.framework.Assert;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.MobileBy;

public class Test0 {
	private static final String InterruptedException = null;
	// Clear Recent Apps Test Case
	AppiumDriver<MobileElement> driver;
	public LogEntries logEntries;
	private WebElement element;

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
		public void start() throws 	IOException, InterruptedException  {
	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test0.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
        fileHandler.setFormatter(formatter); 
        logger.info("Test: Start");
        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        logger.info(" Test0 Scenario is as follows ");
        logger.info("1.Unlock phone, clear recent apps, clear internal memory");
		logger.info("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		logger.info("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		logger.info("4.Call Format() and format uSD card with data and verify the same");
		logger.info("Setting up the appium desired capabilities");
		System.out.println(" Test0 Scenario is as follows ");
	    System.out.println("Unlock phone, clear recent apps, clear internal memory");
		System.out.println("Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		System.out.println("Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		System.out.println("Call Format() and format uSD card with data and verify the same");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";
		((StartsActivity) driver).startActivity(new Activity("com.sonymobile.launcher", "com.sonymobile.launcher.XperiaLauncher"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		// Click Recent Apps
  		//((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		
  		// click on close all
  		try
  		{
  			logger.info("Clearing Recent Apps");
  			System.out.println("Clearing Recent Apps");
  		//	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
  	  		TimeUnit.SECONDS.sleep(5);
  		
  		TimeUnit.SECONDS.sleep(5);
  		logger.info("Pass: Test0 Pass for clearing Recent apps ");
  		System.out.println("Pass: Test0 Pass for clearing Recent apps ");
  		
  		}
  		
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("Pass: No recent apps found");
            System.out.println("Pass: No recent apps found");
           
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  	
  		
  		//Clearing Phone Internal Memory
  		//Launch File Manager
  		logger.info("Launch File Manager Application and clear internal memory");
  		System.out.println("Launch File Manager Application and clear internal memory");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		//Select Internal Memory
  		logger.info("Select  Internal storage");
  		System.out.println("Select  Internal storage");
  	//Swipe up and select uSD Card
	  		logger.info("Swipe up and select uSD card");
	  		System.out.println("Swipe up and select uSD card");
	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		  		
		  	//Select External Storage	
		  	  logger.info("Select Internal storage");
		  	  System.out.println("Select Internal storage");
		  	MobileElement InternalStorage = driver.findElement(By.xpath("//*[@text='Internal storage']"));
		  	InternalStorage.click();
		  //More options
  		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions.click();
			TimeUnit.SECONDS.sleep(3);
			//Click Select All
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			//More Options
			MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(3);
			
			
			try {
			//Click Delete
			MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
			Delete.click();
			TimeUnit.SECONDS.sleep(3);
			
			//Click move to recycle Bin
			MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@text='Delete']"));
			MovetoRecycleBin.click();
	  		TimeUnit.SECONDS.sleep(30);
			}
			catch (Exception e) {
				logger.info("No data found to clear internal memory");
				
			}
			
	  		
			logger.info("Pass: Clearing phone internal memory is successfull");
  			System.out.println("Pass: Clearing phone internal memory is successfull");
  			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		//Press Back
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		
  	//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
			logger.info("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			System.out.println("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			Images();
  		
	}	
  		public void Images() throws  IOException, InterruptedException {
  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			//Launching Camera Application for Rear picture capture
  			logger.info("Launch Camera Application for Rear picture capture");
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
		
		
		//Capture Images
		logger.info("Capture Image of Default Resolution");
		for(int j = 0; j < 25; j++) 
  		{ 
  			TimeUnit.SECONDS.sleep(2);
  			MobileElement ClickShutterButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Camera key\"]/android.widget.ImageView"));
			
			ClickShutterButton.click();
			TimeUnit.SECONDS.sleep(6);
  			 
  			System.out.println("clicking Image of Default Resolutions"+j);
  			logger.info("clicking Image of Default Resolutions"+j);
  		
  		}
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  		logger.info("Pass:Total Number Of Image captured 25 is successfull");
  		
  		
  		
  	//Launch File Manager application to verify  Image capture
  		logger.info("Launch File Manager application to verify  Image capture");
  		System.out.println("Launch File Manager application to verify  Image capture");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//Scroll Up and Select SD Card
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  		
  		//Select SD Card
  		logger.info("Select  SD Card");
  		System.out.println("Select  SD Card");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		//Search For DCIM Folder 
  		logger.info("Select DCIM Folder");
  		System.out.println("Select DCIM Folder");
  		driver.findElement(By.xpath("//*[@text='DCIM']")).click();
		TimeUnit.SECONDS.sleep(5);
  		
		//Search For Camera Folder
		logger.info("Select Camera Folder");
		System.out.println("Select Camera Folder");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		
		//Click More Options
			logger.info("Select More Options ");
			System.out.println("Select More Options ");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(5);
		
		
		
        
		
		
		//Click Select All
		logger.info("Click On Select All Options");
		System.out.println("Click On Select All Options");
		driver.findElement(By.xpath("//*[@text='Select all']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		//Click on Select All 
		try {
			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='25 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Pass:Total Number Of Image captured 25 is successfull");
				System.out.println("Pass:Total Number Of Image captured 25 is successfull");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
				 //Calling video() for rear video recording in USD card and verifying data capture.
  				logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
  				System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
  				Video();
			}
			
			catch (Exception e) {
				
	            e.printStackTrace();
	            logger.info("Fail: Video function cannot be called as incorrect Images captured ");
				logger.info("Final Message: Fail Test0 Fail for Image capture");
				System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
				System.out.println("Final Message: Fail Test0 Fail for Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
			
		
		TimeUnit.SECONDS.sleep(2);
  	
  		
  		
  		}
  		
  	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
  	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
  	public void Video() throws  IOException, InterruptedException {
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  		
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
		//Switch to video Mode
		logger.info("Switch to Video Mode");
		System.out.println("Switch to Video Mode");
		MobileElement VideoMode =	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"VIDEO\"]"));
		VideoMode.click();
		TimeUnit.SECONDS.sleep(3);
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
		//Switch to Settings and Select video resolution
		MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
		Settings1.click();
		TimeUnit.SECONDS.sleep(5);
		
		
		
	 
	  			//Click On Rear Video size to select resolution
	  			MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@text='Video size']"));
	  			RearVideoSize.click();
	  			logger.info("Select 1st Back Video Resolution:4K");
	  			System.out.println("Select 1st Back Video Resolution:4K");
	  			//Select 1st resolution
	  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='Full HD']"));
	  			FirstRes.click();
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				//Start Recording
		  		logger.info("Start video recording");
		  		System.out.println("Start video recording");
		  		MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
		  		StartRecording.click();
		  		TimeUnit.SECONDS.sleep(60);
		  		logger.info("Recording Video for 2Minutes of Duration");
		  		
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
		  		StopRecording.click();
		  		TimeUnit.SECONDS.sleep(5);
		  		
		  	//Select settings option to select second resolution
		  		logger.info("Select settings option to select second resolution");
		  		System.out.println("Select settings option to select second resolution");
		  		MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings2.click();
				TimeUnit.SECONDS.sleep(5);
				
				
				
			 
			  			//Click On Rear Video size to select resolution
			  			MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@text='Video size']"));
			  			RearVideoSize1.click();
			  			logger.info("Select 1st Back Video Resolution:Full HD");
			  			System.out.println("Select 1st Back Video Resolution:Full HD");
			  			//Select 1st resolution
			  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='Full HD']"));
			  			SecondRes.click();
				  		TimeUnit.SECONDS.sleep(2);
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						//Start Recording
				  		logger.info("Start video recording");
				  		System.out.println("Start video recording");
				  		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
				  		StartRecording1.click();
				  		TimeUnit.SECONDS.sleep(60);
				  		logger.info("Recording Video for 2Minutes of Duration");
				  		
				  		//Stop Recording
				  		logger.info("Stop video recording");
				  		System.out.println("Stop video recording");
				  		MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
				  		StopRecording1.click();
				  		TimeUnit.SECONDS.sleep(5);
		  ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  		TimeUnit.SECONDS.sleep(2);
  		logger.info("Pass: Rear camera video recording is successfull");
  		System.out.println("Pass: Rear camera video recording is successfull");
  		
  		//Verifying Captured Videos
  		//Launch Home screen and Clear recent Apps
  		logger.info("Verifying Captured Videos");
  		logger.info("Launch Home screen and Clear recent Apps");
  		System.out.println("Verifying Captured Videos");
  		System.out.println("Launch Home screen and Clear recent Apps");
  		logger.info("Launch File Manager application to verify  Image capture");
  		System.out.println("Launch File Manager application to verify  Image capture");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//Scroll Up and Select SD Card
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  		
  		//Select SD Card
  		logger.info("Select  SD Card");
  		System.out.println("Select  SD Card");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		//Search For DCIM Folder 
  		logger.info("Select DCIM Folder");
  		System.out.println("Select DCIM Folder");
  		driver.findElement(By.xpath("//*[@text='DCIM']")).click();
		TimeUnit.SECONDS.sleep(5);
  		
		//Search For Camera Folder
		logger.info("Select Camera Folder");
		System.out.println("Select Camera Folder");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		
		//Click More Options
			logger.info("Select More Options ");
			System.out.println("Select More Options ");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(5);
		
		
		
        
		
		
		//Click Select All
		logger.info("Click On Select All Options");
		System.out.println("Click On Select All Options");
		driver.findElement(By.xpath("//*[@text='Select all']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		//Click on Select All 
		try {
			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='27 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
			 logger.info("calling Format() for format with data scenario");
	  		System.out.println("calling Format() for format with data scenario");
			Format();
			}
			
			catch (Exception e) {
				
	            e.printStackTrace();
	            logger.info("Fail: Format function cannot be called as incorrect Videos captured");
	            logger.info("Fail: Test0 Fail for file verification");
	            logger.info("Final Message: Fail Test0 Fail for Video Capture");
	            System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
	            System.out.println("Fail: Test0 Fail for file verification");
	            System.out.println("Final Message: Fail Test0 Fail for Video Capture");
	            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
			
		
		TimeUnit.SECONDS.sleep(2);
  		
  		
	}
	
  	public void Format() throws  IOException, InterruptedException  {	
  		
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  		
  	
		// Launch Settings application for Format uSD card with Data scenario
		logger.info("Launch Settings application for Format uSD card with Data scenario ");
		System.out.println("Launch Settings application for Format uSD card with Data ");
		try {
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Scrolling till battery and device care is visible");
		System.out.println("Scrolling till battery and device care is visible");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Clicking on Storage care");
		System.out.println("Clicking on Storage care");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		MobileElement SelectSDCard = driver.findElement(By.xpath("//*[@bounds='[42,1016][105,1079]']"));
		SelectSDCard.click();
		TimeUnit.SECONDS.sleep(5);
		//Select More Options
		logger.info("Clicking on More Options");
		System.out.println("Clicking on More Options");
		MobileElement More = driver.findElement(By.xpath("//*[@content-desc='More options']"));
		More.click();
		TimeUnit.SECONDS.sleep(5);
		//find element by xpath
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		MobileElement StorageSettings = driver.findElement(By.xpath("//*[@text='Storage settings']"));
		StorageSettings.click();
		TimeUnit.SECONDS.sleep(5);
		
		
		
		// click on SD card
		logger.info("Clicking on SD card");
		System.out.println("Clicking on SD card");
		MobileElement Format = driver.findElement(By.xpath("//*[@text='Format']"));
		Format.click();
		TimeUnit.SECONDS.sleep(5);
		// click on Unmount and wait for 2 secs for it to get mounted
		TimeUnit.SECONDS.sleep(5);
		
		// click on format
		logger.info("Click Format");
		System.out.println("Click Format");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
		TimeUnit.SECONDS.sleep(5);
		
		logger.info("Started formatting, waiting till it gets formatted");
		TimeUnit.SECONDS.sleep(90);
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
		//TimeUnit.SECONDS.sleep(2);
		// click on back button inorder to return to the home screen
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
	
		//Result = "Format Successfull";
		}
		catch (Exception e) {
            e.printStackTrace();
        }
			logger.info("Pass: Format uSD with Data is successfull");
			System.out.println("Pass: Format uSD with Data is successfull");
		
		//Launch File Manager
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  		//Scroll Up and Select SD Card
	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
	  		
	  		//Select SD Card
	  		logger.info("Select  SD Card");
	  		System.out.println("Select  SD Card");
	  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
	  		TimeUnit.SECONDS.sleep(5);
	  		//Search For DCIM Folder 
	  		logger.info("Select DCIM Folder");
	  		System.out.println("Select DCIM Folder");
	  		driver.findElement(By.xpath("//*[@text='DCIM']")).click();
			TimeUnit.SECONDS.sleep(5);
	  		
			//Search For Camera Folder
			
  		
		try {
		//Search For Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
			TimeUnit.SECONDS.sleep(5);
		  
		System.out.println("Fail:Images and videos are present in the DCIM folder");
		System.out.println("Final Message: Test0 fail for format operation");
		logger.info("Fail:Images and videos are present in the DCIM folder");
		logger.info("Final Message: Test0 fail for format operation");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		
		catch (Exception e) {
			
            e.printStackTrace();
            
            logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
           
            System.out.println("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
           
            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        }
		 logger.info("Final Message: Pass Test0 pass for format Operation");
		 System.out.println("Final Message: Pass Test0 pass for format Operation");
		 logger.info("Test:End");
		 System.out.println("Test:End");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		
		
	}
	}
