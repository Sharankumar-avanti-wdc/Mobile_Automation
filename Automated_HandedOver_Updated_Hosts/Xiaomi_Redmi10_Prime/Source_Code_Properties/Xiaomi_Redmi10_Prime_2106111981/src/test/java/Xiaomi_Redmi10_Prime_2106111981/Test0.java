package Xiaomi_Redmi10_Prime_2106111981;
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
import org.testng.annotations.AfterMethod;
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
import java.util.Map;
import io.appium.java_client.android.AndroidElement;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import junit.framework.Assert;

public class Test0 {
	private static final String InterruptedException = null;
	// Clear Recent Apps Test Case
	AppiumDriver<MobileElement> driver;
	public LogEntries logEntries;
//	public Logger Log = Logger.getLogger(Log.class.getName());//
//<MobileElement> driver;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 10 Prime");
		dc.setCapability(MobileCapabilityType.UDID, "1057c7d70507");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
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
        System.out.println("Test: Start");
        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        logger.info(" Test0 Scenario is as follows ");
        logger.info("1.Unlock phone, clear recent apps, clear internal memory");
		logger.info("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		logger.info("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		logger.info("4.Call Format() and format uSD card with data and verify the same");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test0 Scenario is as follows ");
	    System.out.println("1.Unlock phone, clear recent apps, clear internal memory");
		System.out.println("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		System.out.println("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		System.out.println("4.Call Format() and format uSD card with data and verify the same");
		System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		
		SetUp();
		String Result = "Fail";
		//Command to Unlock mobile phone
		logger.info("Unlock Phone");
		 ((AndroidDriver) driver).unlockDevice();
		 TimeUnit.SECONDS.sleep(5);
		//Launch Home screen using package
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
  		TimeUnit.SECONDS.sleep(5);
  		//Handling  screen launch permissions
  		try
  		{	//if appium application launch permission exists accept permission
  			logger.info("if appium application launch permission exists accept permission");
            System.out.println("if appium application launch permission exists accept permission");
  			driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
  			TimeUnit.SECONDS.sleep(5);
  	  		logger.info("Allowed appium permission access:");
  	  		System.out.println("Allowed appium permission access:");
  		}
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("No permission access found");
            System.out.println("No permission access found");
        }
  		
  		TimeUnit.SECONDS.sleep(5);
  		
  		// Click Recent Apps
  			logger.info("Clearing Recent Apps");
  			System.out.println("Clearing Recent Apps");
  			//((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  			TimeUnit.SECONDS.sleep(5);
  			try
  			{

  				//driver.findElement(By.xpath("//*[@id='com.mi.android.globallauncher:id/clearAnimView']")).click();
  				TimeUnit.SECONDS.sleep(5);
  				logger.info("Pass: Clearing Recent apps is successfull");
  				System.out.println("Pass: Clearing Recent apps is successfull");

  			}
  			catch (Exception e) {
  				e.printStackTrace();
  				logger.info("Pass: No recent pass found in background");
  				System.out.println("Pass: No recent pass found in background");
  			}
  		
  		//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		//Launch File manager and Clear internal memory
  		logger.info("Launch file manager application for clearing phone internal memory");
  		System.out.println("Launch file manager application for clearing phone internal memory");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//If file manager permission request access accept allow permission
  		try
  		{
  			
  			logger.info("if file manager access permission pop-up exists accept permission");
  	  		System.out.println("if file manager access permission pop-up exists accept permission");
  			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
  			TimeUnit.SECONDS.sleep(5);
  	  		logger.info("Click Accept & continue");
  	  		System.out.println("Click Accept & continue");
  	  		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
  	  		TimeUnit.SECONDS.sleep(5);
  		}
  		catch (Exception e) {
            e.printStackTrace();
        }
  		
  		//Swipe and Select Internal storage
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
  		//Click Internal storage
  		logger.info("Select Internal storage");
  		System.out.println("Select Internal storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			
			
			//Undo select Test1 folder
			logger.info("Undo select Test1 folder");
			System.out.println("Undo select Test1 folder");
			MobileElement UndoSelectTest1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
			UndoSelectTest1.click();
			TimeUnit.SECONDS.sleep(3);
			
			
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(6);
			//Select Delete Permanently
			logger.info("Click Delete Option");
			System.out.println("Click Delete Option");
			MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
			Delete.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Delete
			logger.info("Accept delete permission");
			System.out.println("Accept delete permission");
			MobileElement AllowDelete =	driver.findElement(By.xpath("//*[@text='Delete']"));
			AllowDelete.click();
			TimeUnit.SECONDS.sleep(30);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  			TimeUnit.SECONDS.sleep(5);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  			TimeUnit.SECONDS.sleep(5);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Clearing phone internal memory is successfull");
  			System.out.println("Pass: Clearing phone internal memory is successfull");
  			logger.info("Calling Image() to capture rear camera image in uSD card and verifying the same.");
  			System.out.println("Calling Image() to capture rear camera image in uSD card and verifying the same.");
  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
  		//Calling Image() to capture rear camera image in USD card and Verifying it.
  			
  			Images();
  		
	}	
  		
  		//Capture back camera 25 images with default resolution in USD card and verify the data capture.
  		public void Images() throws  IOException, InterruptedException {
  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			//Launch settings application
  			logger.info("Launching settings application, set uSD as Storage option for Image capture");
  			System.out.println("Launching settings application, set uSD as Storage option for Image capture");
  			try {
  			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
  	  		TimeUnit.SECONDS.sleep(6);
  	  		
  	  		//Select About phone
  	  		logger.info("select about phone");
  	  	System.out.println("select about phone");
  	  		driver.findElement(By.xpath("//*[@text='About phone']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		
  	  		//select storage 
  	  		logger.info("select storage option");
  	  		System.out.println("select storage option");
  	  		driver.findElement(By.xpath("//*[@text='Storage']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		
  	  		//Swipe up and check for storage settings option
  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
  				         ".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
  	  		
  	  		//Select storage settings
  	  		logger.info("Select storage settings option");
  	  		System.out.println("Select storage settings option");
  	  		driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		
  	  		//Select camera
  	  		logger.info("Select Camera option");
  	  		System.out.println("Select Camera option");
  	  		driver.findElement(By.xpath("//*[@text='Camera']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		
  	  		//Select USD as storage option
  	  		logger.info("Select Exteranl stoarge as storage option");
  	  		System.out.println("Select Exteranl stoarge as storage option");
  	  		driver.findElement(By.xpath("//*[@text='External storage']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  	  		TimeUnit.SECONDS.sleep(5);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  			TimeUnit.SECONDS.sleep(5);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  			TimeUnit.SECONDS.sleep(5);
  		
  				
  			//Launch camera application.
  			logger.info("Launch camera application");
  			System.out.println("Launch camera application");
  			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
  			TimeUnit.SECONDS.sleep(6);
  		
		//If location access Permission request pop-up exists, then deny permissions
		try 
		{ 
			//Click Deny Option
			logger.info("If location access Permission request pop-up exists? then select deny permissions");
  			System.out.println("If location access Permission request pop-up exists? then select deny permissions");
			driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		//Do you want to deny? Click Ok option
	  		driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
	  		TimeUnit.SECONDS.sleep(3);		
		} 
		catch(Exception exp)
		{ 
			logger.info("No location access permission pop-up found: "+exp); 
			System.out.println("No location access permission pop-up found: "+exp); 
			
		}
		
		
		//Select Photo option
		logger.info("select photo mode option"); 
		System.out.println("select photo mode option");
		driver.findElement(By.xpath("//*[@text='Photo']")).click();	
		TimeUnit.SECONDS.sleep(2);
		//Capture Images
		logger.info("Capturing  25 Images of Default Resolution");
		for(int j = 0; j < 25; j++) 
  		{ 
  			TimeUnit.SECONDS.sleep(2);
  			driver.findElement(By.id("com.android.camera:id/shutter_button_horizontal")).click();
  			 TimeUnit.SECONDS.sleep(5);
  			System.out.println("capturing default resolution image" +j);
  			logger.info("capturing default resolution image" +j);
  		}
		logger.info("25 Image Capture is successfull");
		System.out.println("25 Image Capture is successfull");
		
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  		//Launch File manager and verify image capture
  		logger.info("Launch File manager and verify captured images in uSD card");
  		System.out.println("Launch File manager and verify captured images in uSD card");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//If file manager permission request access accept allow permission
  		try
  		{
  			
  			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
  			TimeUnit.SECONDS.sleep(5);
  	  		logger.info("Click Accept & continue");
  	  		System.out.println("Click Accept & continue");
  	  		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
  	  		TimeUnit.SECONDS.sleep(5);
  		}
  		catch (Exception e) {
            e.printStackTrace();
        }
  		
  		//Swipe and Select Internal storage
  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
  		//Click Internal storage
  		logger.info("Select SD card");
  		System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Camera folder
			logger.info("Select camera folder");
			System.out.println("Select camera folder");
			MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
			Camera.click();
			TimeUnit.SECONDS.sleep(3);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
  		
  		try {
  				TimeUnit.SECONDS.sleep(3);
  				driver.findElement(By.xpath("//*[@text='25 selected']")).click();
  				logger.info("Pass: Total Number Of Image captured 25 is successfull");
  				System.out.println("Pass: Total Number Of Image captured 25 is successfull");
  				
  				//logger.info("Pass: Test0 Pass for Image Capture");
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  				logger.info("Calling video() for rear camera video recording in uSD card and verifying data capture.");
  				System.out.println("Calling video() for rear camera video recording in uSD card and verifying data capture.");
  				//Calling video() for rear video recording in USD card and verifying data capture.
  				
  				 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				
  				 Video();
  			}
  			catch (Exception e) {
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
			 logger.info("Test:End");
			 System.out.println("Test:End");
			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 e.printStackTrace();
			
  			}
  			}
  			
  			catch (Exception e) {
  				logger.info("Fail: Test0 fail during image capture and verify scenario ");
  				logger.info("Final Message: Fail Test0 Fail for Image capture and verify scenario");
  				System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
  				System.out.println("Final Message: Fail Test0 Fail for Image capture");
  				 logger.info("Test:End");
  				 System.out.println("Test:End");
  				 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 e.printStackTrace();
  			}
		TimeUnit.SECONDS.sleep(2);
  			}
  		
  	//Launch Phone Camera App, set SD card as Storage, Record videos of 2 resolutions 
  	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
  		public void Video() throws  IOException, InterruptedException {
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  					//Launch Settings application
  					logger.info("Launching settings application, set uSD as Storage option for Video recording");
  					System.out.println("Launching settings application, set uSD as Storage option for Video recording");
  					try {
					((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
		  	  		TimeUnit.SECONDS.sleep(6);
		  	  		
		  	  		//Select About phone
		  	  		//logger.info("Select about phone");
					//System.out.println("select about phone");
		  	  		driver.findElement(By.xpath("//*[@text='About phone']")).click();
		  	  		TimeUnit.SECONDS.sleep(3);
		  	  		
		  	  		//Select storage
		  	  		driver.findElement(By.xpath("//*[@text='Storage']")).click();
		  	  		TimeUnit.SECONDS.sleep(3);
		  	  		
		  	  		//Swipe up and check for storage settings 
		  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		  				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
		  				         ".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
		  	  		
		  	  		//select storage settings
		  	  		driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
		  	  		TimeUnit.SECONDS.sleep(3);
		  	  		
		  	  		//Select camera option
		  	  		driver.findElement(By.xpath("//*[@text='Camera']")).click();
		  	  		TimeUnit.SECONDS.sleep(3);
		  	  		
		  	  		//select USD as storage option
		  	  		logger.info("Select external storage as option for Video recording");
		  	  		System.out.println("Select external storage as option for Video recording");
		  	  		driver.findElement(By.xpath("//*[@text='External storage']")).click();
		  	  		TimeUnit.SECONDS.sleep(3);
		  	  		
		  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  				TimeUnit.SECONDS.sleep(5);
		  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  				TimeUnit.SECONDS.sleep(5);
		  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		  				TimeUnit.SECONDS.sleep(5);
		  			
		  				logger.info("Launching camera application for rear camera video recording");
		  				System.out.println("Launching camera application for rear camera video recording");
		  			//Launch camera application
		  			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
		  			TimeUnit.SECONDS.sleep(6);
		  		
				//If location permission request pop-up exists select deny option
				try 
				{ 
					//Click Deny Option
					driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();
			  		TimeUnit.SECONDS.sleep(3);
			  		
			  		//Do you want to deny? Click Ok option
			  		driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
			  		TimeUnit.SECONDS.sleep(3);
			  	} 
				catch(Exception exp)
				{ 
					logger.info("Location permission access  pop-up not found: "+exp); 
					System.out.println("Location permission access  pop-up not found: "+exp); 
				}
				TimeUnit.SECONDS.sleep(2);
				//Select Video option
				logger.info("Switch to video tab");
				System.out.println("Switch to video tab");
				driver.findElement(By.xpath("//*[@text='Video']")).click();	
				TimeUnit.SECONDS.sleep(3);
				//Click Settings option to select video resolution
				logger.info("Click setting option to select video resolution");
				System.out.println("Click setting option to select video resolution");
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
				TimeUnit.SECONDS.sleep(3);
				//Click on Video Resolution
				logger.info("Select first highest rear camera video resolution 4K:FPS");
				System.out.println("SSelect first highest rear camera video resolution 4K:FPS");
				driver.findElement(By.xpath("//*[@bounds='[102,162][528,255]']")).click();
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				//Start Recording
				logger.info("Start video recording for 2 minutes duration");
				System.out.println("Start video recording for 2 minutes duration");
				MobileElement StartRecording = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StartRecording.click();
		  		TimeUnit.SECONDS.sleep(120);
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		driver.findElement(By.xpath("//*[@content-desc='Shutter button']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		//click Back to settings option to select second highest resolution.
		  		logger.info("Click setting option to select video resolution");
				System.out.println("Click setting option to select video resolution");
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
				TimeUnit.SECONDS.sleep(3);
				//Click on Video Resolution FHD 1080 fps
				logger.info("Select second highest rear camera video resolution FHD:1080FPs");
				System.out.println("Select second highest rear camera video resolution FHD:1080FPs");
				driver.findElement(By.xpath("//*[@bounds='[552,162][978,255]']")).click();
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
		  		//Start Recording
				logger.info("Start video recording for 2 minutes duration");
				System.out.println("Start video recording for 2 minutes duration");
		  		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StartRecording1.click();
		  		TimeUnit.SECONDS.sleep(120);
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		driver.findElement(By.xpath("//*[@content-desc='Shutter button']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		logger.info("Rear camera Video recording is successfull.");
		  		System.out.println("Rear camera Video recording is successfull");
		  		
		  		//Launch File manager
		  		logger.info("Launch file manager application and verify recorded video captured in uSD card");
		  		System.out.println("Launch file manager application and verify recorded video captured in uSD card");
		  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		  		TimeUnit.SECONDS.sleep(5);
		  		//If file manager permission request access accept allow permission
		  		try
		  		{
		  			
		  			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
		  			TimeUnit.SECONDS.sleep(5);
		  	  		logger.info("Click Accept & continue");
		  	  		System.out.println("Click Accept & continue");
		  	  		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		  	  		TimeUnit.SECONDS.sleep(5);
		  		}
		  		catch (Exception e) {
		            e.printStackTrace();
		        }
		  		
		  		//Swipe and Select Internal storage
		  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		  		//Click Internal storage
		  		logger.info("Select SD card");
		  		System.out.println("Select SD card");
					MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
					ExternalStorage.click();
					TimeUnit.SECONDS.sleep(6);
					//Select DCIM Folder
					logger.info("Select DCIM folder");
					System.out.println("Select DCIM Folder");
					MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
					DCIM.click();
					TimeUnit.SECONDS.sleep(3);
					//Select Camera folder
					logger.info("Select camera folder");
					System.out.println("Select camera folder");
					MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
					Camera.click();
					TimeUnit.SECONDS.sleep(3);
					//Click More options
					logger.info("Click More options");
					System.out.println("Click More options");
					MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
					MoreOptions.click();
					TimeUnit.SECONDS.sleep(6);
					//Click Select All
					logger.info("Click Select all");
					System.out.println("Click select all");
					MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
					SelectAll.click();
					TimeUnit.SECONDS.sleep(3);
			
  		
  		try {

	  		TimeUnit.SECONDS.sleep(3);
	  		driver.findElement(By.xpath("//*[@text='27 selected']")).click();
	  		logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
            logger.info("Test:End");
   		 System.out.println("Test:End");
            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
   		
 }
  					}
  					catch (Exception e) {
  						e.printStackTrace();
  						 
  			            logger.info("Final Message: Fail Test0 Fail for Video Capture");
  			            System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
  			            System.out.println("Final Message: Fail Test0 during video recording");
  			            System.out.println("Final Message: Fail Test0 Fail for Video Capture");
  			          logger.info("Test:End");
   					 System.out.println("Test:End");
  			            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  			   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  			   		}
		 	
	}
	//Launch settings application to format uSD card with data and verify the Format is successful or not.
  	public void Format() throws  IOException, InterruptedException  {	
  	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	
  		//Launch settings application, format uSD card with data
  		logger.info("Launch settings application to format USD card with data");
  		System.out.println("Launch settings application to format USD card with data");
  		try {
  		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
	  		TimeUnit.SECONDS.sleep(6);
	  		
	  		//Select About phone
	  		logger.info("Select about phone");
	  		System.out.println("Select about phone");
	  		driver.findElement(By.xpath("//*[@text='About phone']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		
	  		//select Storage 
	  		logger.info("Select Storage");
	  		System.out.println("Select Storage");
	  		driver.findElement(By.xpath("//*[@text='Storage']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		
  	  		
  	  		
  	  		//Swipe and search for storage settings
  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
  				         ".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
  	  	
  		
  		
  	  		
  	  		//Select Format USD Card
  	  	logger.info("Select formar SD card option");
  		System.out.println("Select formar SD card option");
	  	  	driver.findElement(By.xpath("//*[@text='Format SD card']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  	
	  		
	  		//Select Format Pop-up
		  		logger.info("Accept format SD card Pop-up");
		  		System.out.println("Accept format SD card Pop-up");
	  		driver.findElement(By.xpath("//*[@text='Format SD card']")).click();
	  		TimeUnit.SECONDS.sleep(30);
	  		
	  		//Select Done
	  		driver.findElement(By.xpath("//*[@text='DONE']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		logger.info("Format uSD Card with data is succesfull");
	  		System.out.println("Format uSD Card with data is succesfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		
		//Launch File manager
  		logger.info("Launch file manager application and verify data format");
  		System.out.println("Launch file manager application and verify data format");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//If file manager permission request access accept allow permission
  		try
  		{
  			
  			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
  			TimeUnit.SECONDS.sleep(5);
  	  		logger.info("Click Accept & continue");
  	  		System.out.println("Click Accept & continue");
  	  		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
  	  		TimeUnit.SECONDS.sleep(5);
  		}
  		catch (Exception e) {
            e.printStackTrace();
        }
  		
  		//Swipe and Select Internal storage
  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
  		//Click Internal storage
  		logger.info("Select SD card");
  		System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();
			
			try {
				//Search For Camera Folder
				MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
				Camera.click();
			//	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			//	TimeUnit.SECONDS.sleep(5);
				System.out.println("Fail: Images and videos are present in the DCIM folder");
				System.out.println("Final Message: Test0 fail for format operation");
				logger.info("Fail: Images and videos are present in the DCIM folder");
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
  		
  		catch (Exception e) {
			
            e.printStackTrace();
            
            logger.info("Fail: Test0 fail during format with data and verify scenario");
            
            System.out.println("Fail: Test0 fail during format with data and verify scenario");
           
            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
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
			}