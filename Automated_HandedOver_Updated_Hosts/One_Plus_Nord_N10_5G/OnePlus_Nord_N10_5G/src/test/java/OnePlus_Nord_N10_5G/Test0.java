package OnePlus_Nord_N10_5G;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus Nord N10 5G");
		dc.setCapability(MobileCapabilityType.UDID, "f0e384e2");
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
		System.out.println(" Test0 Scenario is as follows ");
	    System.out.println("1.Unlock phone, clear recent apps, clear internal memory");
		System.out.println("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		System.out.println("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		System.out.println("4.Call Format() and format uSD card with data and verify the same");
		
		System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		try {
		((StartsActivity) driver).startActivity(new Activity("net.oneplus.launcher", "net.oneplus.launcher.Launcher"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		// Click Recent Apps
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		
  		// click on close all
  		try
  		{
  			logger.info("Clearing Recent Apps");
  			System.out.println("Clearing Recent Apps");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Clear All\")").click();
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
  		
  		//Scroll Up and select Internal storage
  		logger.info("Scroll up and select Internal storage");
  		System.out.println("Scroll up and select Internal storage");
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  		
  		//Select Internal Memory
  		logger.info("Select  Internal storage");
  		System.out.println("Select  Internal storage");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		
  		//Click More Options
  		logger.info("Select More Options");
  		System.out.println("Select More Options");
  		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
  		MoreOptions.click();
  		TimeUnit.SECONDS.sleep(3);
  	//Click Select All Option
  		logger.info("Select Edit Option");
  		System.out.println("Select Edit Option");
  		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
  		SelectAll.click();
  		TimeUnit.SECONDS.sleep(3);
  		
  		
  		MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
  		MoreOptions1.click();
  		TimeUnit.SECONDS.sleep(3);
			try {
			//Click Delete
				logger.info("Select Delete All Option");
		  		System.out.println("Select Delete All Option");
			MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
			Delete.click();
			TimeUnit.SECONDS.sleep(3);
			
			//Click move to recycle Bin
			logger.info("Allow delet folders");
	  		System.out.println("Allow delet folders");
			MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@text='Delete']"));
			MovetoRecycleBin.click();
	  		TimeUnit.SECONDS.sleep(30);
			}
			catch (Exception e) {
				logger.info("No data found to clear internal memory");
				
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
			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
			logger.info("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			System.out.println("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			Images();
		}
		catch (Exception e) {
			logger.info("Final Message: Fail Test0 Fail for clear recent apps and clear internal memory scenario");
  			System.out.println("Final Message: Fail Test0 Fail for clear recent apps and clear internal memory scenario");
  			logger.info("Test: End");
  			System.out.println("Test: End");
  			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 
		}
	}	
  		public void Images() throws  IOException, InterruptedException {
  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			//Launching Camera Application for Rear picture capture
  			logger.info("Launch Camera Application for Rear picture capture");
  			System.out.println("Launch Camera Application for Rear picture capture");
  			try {
  			((StartsActivity) driver).startActivity(new Activity("com.oneplus.camera", "com.oneplus.camera.OPCameraActivity"));
		
  		//IF Location access notification pop-up exists select Cancel option.
  			logger.info("if Location permisson Pop Exists Select Cancel Option");
  			System.out.println("if Location permisson Pop Exists Select Cancel Option");
		try 
		{ 
			MobileElement Deny = driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']"));
			TimeUnit.SECONDS.sleep(5);
			Deny.click();
			
		} 
		catch(Exception exp)
		{ 
			logger.info("Location access permission pop-up not found : "+exp); 
			System.out.println("Location access permission pop-up not found : "+exp); 
			
		}
		
		TimeUnit.SECONDS.sleep(2);
		
		
		//Click On More options
		logger.info("Select More option");
		System.out.println("Select More option");
		MobileElement MoreOptions = driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/more_icon']"));
		TimeUnit.SECONDS.sleep(5);
		MoreOptions.click();
		//Select Settings option
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/sub_item_panel_setting_icon']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Search for SD Card option");
		System.out.println("Search for SD Card option");
		String text = "Store location data";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("check SD card as storage option");
		System.out.println("check SD card as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Saving to SD card is recommended\")").click();;
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		
		
		//Capture Images
		logger.info("Capture Image of Default Resolution");
		for(int j = 0; j < 25; j++) 
  		{ 
  			TimeUnit.SECONDS.sleep(2);
  			driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/primary_button_touch_receiver']")).click();
  			 TimeUnit.SECONDS.sleep(6);
  			System.out.println("Capturing default resolution image "+j);
  			logger.info("Capturing default resolution image "+j);
  		
  		}
		
		//settings
		//Click On More options
				logger.info("Select More option");
				System.out.println("Select More option");
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/more_icon']"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions1.click();
				//Select Settings option
				logger.info("Select More option");
				System.out.println("Select More option");
				MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/sub_item_panel_setting_icon']"));
				TimeUnit.SECONDS.sleep(5);
				Settings1.click();
				//Swipe Up and Search for Storage Option and Click 
				logger.info("Search for SD Card option");
				System.out.println("Search for SD Card option");
				String text1 = "Store location data";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("uncheck SD card as storage option");
				System.out.println("uncheck SD card as storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Saving to SD card is recommended\")").click();;
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
		
		
		
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		logger.info("25 Images captured successfully");
  		System.out.println("25 Images captured successfully");
  		
  		//Launch File Manager application to verify  Image capture
  		logger.info("Launch File Manager application to verify  Image capture");
  		System.out.println("Launch File Manager application to verify  Image capture");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//Scroll up and select uSD Card
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
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
		driver.findElement(By.xpath("//*[@text='Camera']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click More Options
		logger.info("Select More Options ");
		System.out.println("Select More Options ");
		driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click Select All
		logger.info("Click On Select All Options");
		System.out.println("Click On Select All Options");
		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
  		SelectAll.click();
  		TimeUnit.SECONDS.sleep(3);
		
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
  					//Calling video() for rear video recording in USD card and verifying data capture.
  	  				logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
  	  				System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
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
  	  				Video();
  				}
  				
  				catch (Exception e) {
  					
  		            e.printStackTrace();
  		            logger.info("Fail: Video function cannot be called as incorrect Images captured ");
  					logger.info("Final Message: Fail Test0 Fail for Image capture");
  					System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
  					System.out.println("Final Message: Fail Test0 Fail for Image capture");
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
  			  	  	logger.info("Test: End");
  	  	  			System.out.println("Test: End");
  					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  					 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  		        }
  			}
  			catch (Exception e) {
  				logger.info("Final Message: Fail Test0 Fail for Image capture");
  	  			System.out.println("Final Message: Fail Test0 Fail for Image capture");
  	  			logger.info("Test: End");
  	  			System.out.println("Test: End");
  	  			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 
  			}
  	  		
  	  		
  	  		}
		
  	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
  	  	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
  	  	public void Video() throws  IOException, InterruptedException {
  	  		
  	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  	  		
  	  	logger.info("Launch Camera Application for Rear camera video recording");
  	  	System.out.println("Launch Camera Application for Rear camera video recording");
			((StartsActivity) driver).startActivity(new Activity("com.oneplus.camera", "com.oneplus.camera.OPCameraActivity"));
			try {
		//IF Location access notification pop-up exists select Cancel option.
			logger.info("if Location permisson Pop Exists Select Cancel Option");
			System.out.println("if Location permisson Pop Exists Select Cancel Option");
	try 
	{ 
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DENY\")").click();
		
	} 
	catch(Exception exp)
	{ 
		logger.info("Location permission access pop-up not found : "+exp); 
		System.out.println("Location permission access pop-up not found : "+exp); 
		
	}
	
	TimeUnit.SECONDS.sleep(2);
	// Switch to Video mode
		logger.info("Switch to video mode");
		System.out.println("Switch to video modeS");
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
		TimeUnit.SECONDS.sleep(5);
	
		logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/setting_icon']"));
			TimeUnit.SECONDS.sleep(5);
			Settings1.click();
	//Swipe Up and Search for Storage Option and Click 
	logger.info("Search for SD Card option");
	System.out.println("Search for SD Card option");
	String text = "Store location data";
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
	TimeUnit.SECONDS.sleep(5);
	logger.info("Check SD card as storage option");
	System.out.println("Check SD card as storage option");
	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Saving to SD card is recommended\")").click();;
	TimeUnit.SECONDS.sleep(5);
	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	TimeUnit.SECONDS.sleep(2);
	 
  		  			//Click On Rear camera video size to select resolution
  		  			logger.info("Select first highest rear camera Video Resolution:Rear camera video size, FHD (30 fps)");
  		  			System.out.println("Select first highest rear camera Video Resolution:Rear camera video size, FHD (30 fps)");
  		  			//Select 1st resolution
  		  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[486,108][594,216]']"));
  		  			FirstRes.click();
  			  		TimeUnit.SECONDS.sleep(2);
  		  			
  					//Start Recording
  			  		logger.info("Start video recording");
  			  		System.out.println("Start video recording");
  			  		MobileElement StartRecording = driver.findElement(By.xpath("//*[@bounds='[465,1985][615,2135]']"));
  			  		StartRecording.click();
  			  		TimeUnit.SECONDS.sleep(120);
  			  		
  			  		
  			  		//Stop Recording
  			  		logger.info("Stop video recording");
  			  		System.out.println("Stop video recording");
  			  		MobileElement StopRecording = driver.findElement(By.xpath("//*[@bounds='[465,1985][615,2135]']"));
  			  		StopRecording.click();
  			  		
  			  		TimeUnit.SECONDS.sleep(15);
  			  		
  			  		
  		  			//Select 2nd resolution
  			  	logger.info("Select second highest rear camera Video Resolution:Rear camera video size, HD (30 fps)");
		  			System.out.println("Select second highest rear camera Video Resolution:Rear camera video size, HD (30 fps)");
  		  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[486,108][594,216]']"));
  		  			SecondRes.click();
  			  		TimeUnit.SECONDS.sleep(2);
  			  		
  			  	//Start Recording
  			  		logger.info("Start video recording");
  			  		System.out.println("Start video recording");
  			  		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@bounds='[465,1985][615,2135]']"));
  			  		StartRecording1.click();
  			  		TimeUnit.SECONDS.sleep(120);
  			  		logger.info("Recording Video for 2Minutes of Duration");
  			  		
  			  		//Stop Recording
  			  		logger.info("Stop video recording");
  			  		System.out.println("Stop video recording");
  			  		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@bounds='[465,1985][615,2135]']"));
  			  		StopRecording1.click();
  			  		TimeUnit.SECONDS.sleep(15);
  			  	logger.info("Select settings option");
  				System.out.println("Select settings option");
  				MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.oneplus.camera:id/setting_icon']"));
  				TimeUnit.SECONDS.sleep(5);
  				Settings2.click();
  		//Swipe Up and Search for Storage Option and Click 
  		logger.info("Search for SD Card option");
  		System.out.println("Search for SD Card option");
  		String text1 = "Store location data";
  		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
  		TimeUnit.SECONDS.sleep(5);
  		logger.info("Uncheck SD card as storage option");
  		System.out.println("Uncheck SD card as storage option");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Saving to SD card is recommended\")").click();;
  		TimeUnit.SECONDS.sleep(5);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  			  ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  	  		TimeUnit.SECONDS.sleep(2);
  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  	  		TimeUnit.SECONDS.sleep(2);
  	  		logger.info("Rear camera video recording is successfull");
  	  		System.out.println("Rear camera video recording is successfull");
  	  		
  	  		//Verifying Captured Videos
  	  		//Launch File Manager application to verify captured video
  	  		logger.info("Launch File Manager Application to verify captured videos");
  	  		System.out.println("Launch File Manager Application to verify captured videos");
  	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  	//Scroll up and select uSD Card
  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
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
  			driver.findElement(By.xpath("//*[@text='Camera']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			
  			//Click More Options
  				logger.info("Select More Options ");
  				System.out.println("Select More Options ");
  				driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
  				TimeUnit.SECONDS.sleep(5);
  			//Click Select All
  	  			logger.info("Click On Select All Options");
  	  			System.out.println("Click On Select All Options");
  	  			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
  	  	  		SelectAll.click();
  	  	  		TimeUnit.SECONDS.sleep(3);
  	  			
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
  	  				logger.info("calling Format() for format with data scenario");
  	  		  		System.out.println("calling Format() for format with data scenario");
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
  	 	  	  		logger.info("Test: End");
  	 	  	  		System.out.println("Test: End");
  	  		            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  		   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  		        }
			}
			catch (Exception e) {
  				logger.info("Final Message: Fail Test0 Fail for rear camera video recording");
  	  			System.out.println("Final Message: Fail Test0 Fail for rear camera video recording");
  	  			logger.info("Test: End");
  	  			System.out.println("Test: End");
  	  			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  				 
  			}
  	  			
  	  		}
  			
	public void Format() throws  IOException, InterruptedException  {	
  	  		
  	  		
  	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  	  		//Launch Home screen and clear recent apps
  	  		
  	  	try {
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
  			logger.info("Clicking on battery and device care");
  			System.out.println("Clicking on battery and device care");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Clicking on storage");
  			System.out.println("Clicking on storage");
  			
  			//select uSD Card
  			logger.info("Select uSD Card");
  			System.out.println("Select uSD Card");
  			driver.findElement(By.xpath("//*[@bounds='[56,1278][124,1346]']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			//select more otions
  			logger.info("Select more options");
  			
  			System.out.println("Select more options");
  			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			//Select Storage settings
  			logger.info("Select Storage settings");
  			System.out.println("Select Storage settings");
  			driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
  			TimeUnit.SECONDS.sleep(5);
  		// click on format
  			logger.info("Click Format");
  			System.out.println("Click Format");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
  			// wait for 2 mins
  			logger.info("Started formatting, waiting till it gets formatted");
  			System.out.println("Started formatting, waiting till it gets formatted");
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

  			//Launch File Manager
  	  	  		logger.info("Launch File Manager Application and verify data format scenario");
  	  	  		System.out.println("Launch File Manager Application and verify data format scenario");
  	  	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  	  //Scroll up and select uSD Card
  	  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  	  			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
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
  	  				driver.findElement(By.xpath("//*[@text='Camera']")).click();
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
  	  	}
  	  	catch (Exception e) {
				logger.info("Final Message: Fail Test0 Fail for Format with data scenario");
	  			System.out.println("Final Message: Fail Test0 Fail for Format with data scenario");
	  			logger.info("Test: End");
	  			System.out.println("Test: End");
	  			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 
			}
  	  			 logger.info("Final Message: Pass Test0 pass for format with data scenario");
  	  			 System.out.println("Final Message: Pass Test0 pass for format with data scenario");
  	  			 logger.info("Test: End");
  	  			 System.out.println("Test: End");
  	  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  	  			TimeUnit.SECONDS.sleep(2);
  	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  	  			
  	  			
  	  		}
  	  		}
  	        
  			
  			
  			
  		
  	  
  	  			
  	  			
  	  	  		
  	  			
  			
  			
  			
  		
  			
  				
  			
  			
		
		
		
		
			
		
		
  		
  	
