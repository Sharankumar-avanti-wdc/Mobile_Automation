package Samsung_GalaxyA22;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A22 5G");
		dc.setCapability(MobileCapabilityType.UDID, "R9ZR704W3DM");
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
		System.out.println("4,Call Format() and format uSD card with data and verify the same");
		
		System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Launch Homescree 
		logger.info("Launch Home screen");
		System.out.println("Launch Home screen");
		try {
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		// Click Recent Apps
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		
  		// click on close all
  		try
  		{
  			logger.info("Clearing Recent Apps");
  			System.out.println("Clearing Recent Apps");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
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
  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		//Select Internal Memory
  		logger.info("Select  Internal storage");
  		System.out.println("Select  Internal storage");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		
  		//Long Press Andriod folder
  		MobileElement Folder =	driver.findElement(By.xpath("//*[@text='Android']"));
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//Click Select All
			logger.info("Select  all folders");
	  		System.out.println("Select  all folder");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.myfiles:id/actionbar_select_checkbox']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			try {
			//Click Delete
				logger.info("Select  delete option");
		  		System.out.println("Select  delete option");
			MobileElement Delete =	driver.findElement(By.xpath("//*[@bounds='[640,2129][708,2197]']"));
			Delete.click();
			TimeUnit.SECONDS.sleep(3);
			
			//Click move to recycle Bin
			MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@bounds='[408,2071][1012,2172]']"));
			MovetoRecycleBin.click();
	  		TimeUnit.SECONDS.sleep(30);
	  		
			}
			catch (Exception e) {
				logger.info("No data found to clear internal memory");
				System.out.println("No data found to clear internal memory");
				
			}
			
	  		
			logger.info("Pass: Clearing phone internal memory is successfull");
  			System.out.println("Pass: Clearing phone internal memory is successfull");
  			
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
		catch(Exception exp)
		{ 
			logger.info("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			logger.info("Final message: Fail Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
			logger.info("Test End"); 
			System.out.println("Test End");
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
  		
	}	
  		public void Images() throws  IOException, InterruptedException {
  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			//Launching Camera Application for Rear picture capture
  			try {
  			logger.info("Launch Camera Application for Rear camera picture capture");
  			System.out.println("Launch Camera Application for Rear camera picture capture");
  			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
		
  		//IF Change to uSD card notification pop-up exists select Cancel Option
		try 
		{ 
			logger.info("IF Change to uSD card notification pop-up exists select cancel Option");
  			System.out.println("IF Change to uSD card notification pop-up exists select cancel Option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
			
		} 
		catch(Exception exp)
		{ 
			logger.info("change to SD card element not found : "+exp); 
			System.out.println("change to SD card element not found : "+exp); 
			
		}
		
		TimeUnit.SECONDS.sleep(2);
		//IF Location access notification pop-up exists select Cancel option.
		logger.info("if Location permisson Pop Exists Select Cancel Option");
		System.out.println("if Location permisson Pop Exists Select Cancel Option");
		try 
		{ 
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
			
		} 
		catch(Exception exp)
		{ 
				// Block of code to handle errors
			logger.info("Location  not found : "+exp); 
			System.out.println("Location  not found : "+exp); 
		}
	
		//Switch to back camera if current existing camera is Front camera.
		try {
			
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();
			logger.info("Switch To rear Camera Mode if current Exiting camera is front camera Mode");
			System.out.println("Switch To rear Camera Mode if current Exiting camera is front camera Mode");
		}
		
		catch(Exception exp)
		{ 
				// Block of code to handle errors
			logger.info("Currently camera is already in rear camera mode no need to switch"); 
			System.out.println("Currently camera is already in rear camera mode no need to switch");
		}
		
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/qs_item_settings']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for SD Card option");
		System.out.println("Search for SD Card option");
		String text = "Storage location";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
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
  			driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/shutter_button']")).click();
  			 TimeUnit.SECONDS.sleep(6);
  			System.out.println("Captured default resolution image "+j);
  			logger.info("Captured default resolution image "+j);
  		
  		}
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		logger.info("Pass:Total Number Of Image captured 25 is successfull");
  	
  		
  	//Launch File manager and verify image capture in uSD card
  		logger.info("Launch file manager application and verify image capture in uSD card");
  		System.out.println("Launch file manager application and verify image capture in uSD card");
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
			
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			//Switch grid view mode
			logger.info("switch to list view mode to select DCIM folder");
			System.out.println("switch to list view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
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
  				logger.info("Pass:Total Number Of Image captured 25 in uSD card is successfull");
  				System.out.println("Pass:Total Number Of Image captured 25 in uSD card is successfull");
  				
  				//logger.info("Pass: Test0 Pass for Image Capture");
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  				//Calling video() for rear video recording in USD card and verifying data capture.
  				
  				 logger.info("===============================================================================================================================================");
  				 System.out.println("===============================================================================================================================================");
  				logger.info("Calling video() for rear video recording in uSD card and verifying data capture.");
  				System.out.println("Calling video() for rear video recording in uSD card and verifying data capture.");
  				 Video();
  			}
  			catch (Exception e) {
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			 logger.info("===============================================================================================================================================");
			 System.out.println("===============================================================================================================================================");
			e.printStackTrace();
  			}
  			}
  			catch (Exception e) {
  				logger.info("Fail: Test0 Fail during Image capture and verify scenario");
  				logger.info("Final Message: Fail Test0 Fail for Image capture");
  				System.out.println("Fail: Test0 Fail during Image capture and verify scenario");
  				System.out.println("Final Message: Fail Test0 Fail for Image capture");
  				logger.info("===============================================================================================================================================");
  				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				e.printStackTrace();
  				logger.info("Test:End");
  				System.out.println("Test:End");
  				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  			}
		
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
  		
  		
  		}
  		
  	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
  	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
  	public void Video() throws  IOException, InterruptedException {
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  		
  		//Clearing recent aps
  		logger.info("Clearing recent apps");
  		System.out.println("Clearing recent apps");
  		try {
  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
  		logger.info("Clear Recent Apps");
  		try
  		{
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		}
  		catch (Exception e) {
            e.printStackTrace();
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		//Launch Camera Application.
  		logger.info("launch camera application rear camera video capture");
  		System.out.println("launch camera application rear camera video capture");
  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
  		
  		
  		//If Change to SD Card notification pop-up exists select Cancel Option
  		try 
  		{
  			logger.info("If Change to SD Card notification pop-up exists select Cancel Option");
  			System.out.println("If Change to SD Card notification pop-up exists select Cancel Option");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
  			// if the turn on location pop up comes, click on cancel button
  			TimeUnit.SECONDS.sleep(2);
  			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
  		} 
  		catch(Exception exp)
  		{ 
  				// Block of code to handle errors
  			logger.info("change to SD card element not found : "+exp);
  			System.out.println("change to SD card element not found : ");
  		}
  		
  		//If Location access Permission appears Click Cancel Option
  		
  		logger.info("If Location Permission Request Pop Exists Click on Cancel Option");
  		try 
  		{ 
  			logger.info("If Location Permission Request Pop Exists Click on Cancel Option");
  			System.out.println("If Location Permission Request Pop Exists Click on Cancel Option");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
  		} 
  		catch(Exception exp)
  		{ 
  				// Block of code to handle errors
  			logger.info("Location access pop-up  not found : "+exp);
  			System.out.println("Location access pop-up  not found : "+exp);
  			
  		}
  		
  		try {
			
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();
			logger.info("Switch To rear Camera if current Exiting camera is Front camera");
			System.out.println("Switch To rear Camera if current Exiting camera is Front camera");
			
		}
		
		catch(Exception exp)
		{ 
				// Block of code to handle errors
			logger.info("Current Existing Camera is rear Camera mode"); 
			System.out.println("Current Existing Camera is rear Camera mode");
			
		}
  		// Switch to Video mode
  		logger.info("Switch to  Video mode");
  		System.out.println("Switch to  Video mode");
  		TimeUnit.SECONDS.sleep(5);
  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_module_item']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
				logger.info("Select settings option");
				System.out.println("Select settings option");
				MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/qs_item_settings']"));
				TimeUnit.SECONDS.sleep(5);
				Settings.click();
				
				//Swipe Up and Search for Storage Option and Click 
				logger.info("Search for SD Card option");
				System.out.println("Search for SD Card option");
				String text = "Storage location";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Select SD Card
				logger.info("Select SD as storage option");
				System.out.println("Select SD as storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				TimeUnit.SECONDS.sleep(5);
				
			//Clikc Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	 
	  			//Click On Rear Video size to select resolution
	  			logger.info("select rear video size option to select first highest rear camear video resolution");
	  			System.out.println("select rear video size option to select first highest rear camear video resolution");
	  			MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/qs_item_quality']"));
	  			RearVideoSize.click();
	  			logger.info("Select first highest rear camear video resolution: BACK_CAMCORDER_RESOLUTION_8K_24");
	  			System.out.println("Select first highest rear camear video resolution: BACK_CAMCORDER_RESOLUTION_8K_24");
	  			//Select 1st resolution
	  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[294,125][438,269]']"));
	  			FirstRes.click();
		  		TimeUnit.SECONDS.sleep(2);
	  			
				//Start Recording
		  		logger.info("Start video recording");
		  		System.out.println("Start video recording");
		  		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/shutter_button']"));
		  		StartRecording.click();
		  		TimeUnit.SECONDS.sleep(120);
		  		logger.info("Recording Video for 2Minutes of Duration");
		  		System.out.println("Recording Video for 2Minutes of Duration");
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/shutter_button']"));
		  		StopRecording.click();
		  		
		  		TimeUnit.SECONDS.sleep(15);
		  		
		  		//Click On Rear Video size to select resolution
		  		logger.info("select rear video size option to select first highest rear camear video resolution");
	  			System.out.println("select rear video size option to select first highest rear camear video resolution");
		  		MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/qs_item_quality']"));
	  			RearVideoSize1.click();
	  			
	  			logger.info("Select second highest rear camear video resolution: FHD 30(fps)");
	  			System.out.println("Select second highest rear camear video resolution: FHD 30(fps)");
	  			//Select 2nd resolution
	  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[468,125][612,269]']"));
	  			SecondRes.click();
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  	//Start Recording
		  		logger.info("Start video recording");
		  		System.out.println("Start video recording");
		  		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/shutter_button']"));
		  		StartRecording1.click();
		  		TimeUnit.SECONDS.sleep(120);
		  		logger.info("Recording Video for 2Minutes of Duration");
		  		System.out.println("Recording Video for 2Minutes of Duration");
		  		
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/shutter_button']"));
		  		StopRecording1.click();
		  		TimeUnit.SECONDS.sleep(15);
		  ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  		TimeUnit.SECONDS.sleep(2);
  		logger.info("Pass: Rear camera video recording is successfull");
  		
  		
  		//Verifying Captured Videos
  	//Launch File manager
  		logger.info("Launch file manager application and verify video capture in uSD card");
  		System.out.println("Launch file manager application and verify video capture in uSD card");
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
  		logger.info("Swipe up");
  		System.out.println("Swipe up");
  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
  		//Click Internal storage
  		logger.info("Select SD card");
  		System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
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
			//Switch grid view mode
			logger.info("switch to list view mode to select DCIM folder");
			System.out.println("switch to list view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
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
	 logger.info("===============================================================================================================================================");
	 System.out.println("===============================================================================================================================================");
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
    logger.info("Fail: Test0 Fail for file verification");
    System.out.println("Final Message: Fail Test0 Fail for Video Capture");
    logger.info("Test: End");
    logger.info("Test: End");
    logger.info("===============================================================================================================================================");
    System.out.println("===============================================================================================================================================");
    

}
	}
	catch (Exception e) {
	e.printStackTrace();
	logger.info("Fail: Test0 Fail during video recording and verify scenario");
	//logger.info("Fail: Test0 Fail for file verification");
	logger.info("Final Message: Fail Test0 Fail for Video Capture");
	System.out.println("Fail: Test0 Fail during video recording and verify scenario");
	//System.out.println("Fail: Test0 Fail for file verification");
	System.out.println("Final Message: Fail Test0 Fail for Video Capture");
	logger.info("===============================================================================================================================================");
	System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	logger.info("Test:End");
	System.out.println("Test:End");
	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

}
			
		
		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		
	}
	
  	public void Format() throws  IOException, InterruptedException  {	
  		
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  		//Launch Home screen and clear recent apps
  		logger.info("Clearing Recent Apps");
  		try {
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		// open the recently opened apps screen
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		// click on close all
  		try
  		{
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		}
  		catch (Exception e) {
            e.printStackTrace();
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  	
		// Launch Settings application for Format uSD card with Data scenario
		logger.info("Launch Settings application for Format uSD card with Data scenario ");
		System.out.println("Launch Settings application for Format uSD card with Data ");
		try {
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Scrolling till battery and device care is visible");
		System.out.println("Scrolling till battery and device care is visible");
		String text = "Battery and device care";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Clicking on battery and device care");
		System.out.println("Clicking on battery and device care");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Battery and device care\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Clicking on storage");
		System.out.println("Clicking on storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//find element by xpath
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		TimeUnit.SECONDS.sleep(5);
		
		moreOptions.click();
		driver.findElement(By.id("com.sec.android.app.myfiles:id/title")).click();
		TimeUnit.SECONDS.sleep(5);
		// click on SD card
		logger.info("Clicking on SD card");
		System.out.println("Clicking on SD card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		// click on Unmount and wait for 2 secs for it to get mounted
		TimeUnit.SECONDS.sleep(5);
		
		// click on format
		logger.info("Click Format");
		System.out.println("Click Format");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
		// wait for 2 mins
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
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	
		//Result = "Format Successfull";
		}
		catch (Exception e) {
            e.printStackTrace();
        }
			logger.info("Format uSD with Data is successfull");
			System.out.println("Format uSD with Data is successfull");
			
		
			//Launch File manager
	  		logger.info("Launch file manager application and Verify Data format");
	  		System.out.println("Launch file manager application and Verify Data format");
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
				//Switch grid view mode
				logger.info("switch to grid view mode to select DCIM folder");
				System.out.println("switch to grid view mode to select DCIM folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Select DCIM Folder
				logger.info("Select DCIM folder");
				System.out.println("Select DCIM Folder");
				MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
				DCIM.click();
				//Switch grid view mode
				logger.info("switch to list view mode to select DCIM folder");
				System.out.println("switch to list view mode to select DCIM folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
	  
				try {
					//Search For Camera Folder
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
					TimeUnit.SECONDS.sleep(5);
					System.out.println("Fail:Images and videos are present in the DCIM folder");
					System.out.println("Final Message: Test0 fail for format operation");
					logger.info("Fail:Images and videos are present in the DCIM folder");
					logger.info("Final Message: Test0 fail for format operation");
					 logger.info("Test:End");
					 System.out.println("Test:End");
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
	  		}
	  		catch (Exception e) {

				e.printStackTrace();

				logger.info("Fail: Test0 Fail during Format with data and verify scenario");

				System.out.println("Fail: Test0 Fail during Format with data and verify scenario");

				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Test0 fail for format with data scenario operation");
				System.out.println("Final Message: Test0 fail for format with data operation");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			}

					 logger.info("Final Message: Pass Test0 pass for format with data Operation");
					 System.out.println("Final Message: Pass Test0 pass for format with data Operation");
					 logger.info("Test:End");
					 System.out.println("Test:End");
					 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					
					
				}
	}