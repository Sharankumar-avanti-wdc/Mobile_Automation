package Xiaomi_RedmiNote10T_5G_M2103K191;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 10T 5G");
		dc.setCapability(MobileCapabilityType.UDID, "fun77xcu8hjnmbeu");
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
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";
		//Command to Unlock mobile phone
		logger.info("Unlock Phone");
		System.out.println("Unlock Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch Home screen using package
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		try {


			((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
			TimeUnit.SECONDS.sleep(5);
			//Handling  screen launch permissions
			try
			{	
				logger.info("Allowed appium permission access:");
				System.out.println("Allowed appium permission access:");
				driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("No permission access found");
				System.out.println("No permission access found");
			}
			//Show recent apps open in background
			logger.info("Command to check recent apps in background");
			System.out.println("Command to check recent apps in background");
			((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			//TimeUnit.SECONDS.sleep(2);
			try {
				// Click Recent Apps
				logger.info("Clearing Recent Apps");
				System.out.println("Clearing Recent Apps");
				driver.findElement(By.xpath("//*[@id='com.miui.home:id/clearAnimView']")).click();
				TimeUnit.SECONDS.sleep(5);
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
			logger.info("Swipe Up");
			System.out.println("Swipe up");
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
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(6);
			//Select Delete Permanently
			logger.info("Select delete permanently option");
			System.out.println("Select delete permanently option");
			MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
			Delete.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Delete
			logger.info("Accept allow delete pop-up");
			System.out.println("Accept allow delete pop-up");
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
			logger.info("Calling Image() to capture rear image in uSD card and verifying the same.");
			System.out.println("Calling Image() to capture rear image in uSD card and verifying the same.");
			logger.info("===============================================================================================================================================");
			System.out.println("===============================================================================================================================================");

			//Calling Image() to capture rear camera image in USD card and Verifying it.
			Images();


		}
		catch(Exception exp)
		{ 
			logger.info("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp); 
			logger.info("Final Message: Fail Test0 fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
			logger.info("Test: End"); 
			System.out.println("Test: End");

			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

	}	

	//Capture back camera 25 images with default resolution in USD card and verify the data capture.
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch settings application
		try {
			logger.info("Launching settings application, set uSD as Storage option for Image capture");
			System.out.println("Launching settings application, set uSD as Storage option for Image capture");
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
			logger.info("If location access Permission request pop-up exists, then deny permissions");
			System.out.println("If location access Permission request pop-up exists, then deny permissions");
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
				logger.info("No location access permission pop-up found: "+exp); 
				System.out.println("No location access permission pop-up found: "+exp); 

			}


			//Select Photo option
			logger.info("Switch to photo mode");
			System.out.println("Switch to photo mode");
			driver.findElement(By.xpath("//*[@text='Photo']")).click();	
			TimeUnit.SECONDS.sleep(2);
			//Capture Images
			logger.info("Capturing  25 Images of Default Resolution");
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera:id/shutter_button_horizontal")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("capture default resolution image "+ j);
				logger.info("capture default resolution image "+ j);
			}
			logger.info("25 Image Capture is successfull");
			System.out.println("25 Image Capture is successfull");

			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
				logger.info("Calling video() for rear video recording in uSD card and verifying data capture.");
				System.out.println("Calling video() for rear video recording in uSD card and verifying data capture.");
				logger.info("===============================================================================================================================================");
				System.out.println("===============================================================================================================================================");
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
			//logger.info("===============================================================================================================================================");
			//System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			e.printStackTrace();
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		TimeUnit.SECONDS.sleep(2);
	}

	//Launch Phone Camera App, set SD card as Storage, Record videos of 2 resolutions 
	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch Settings application
		try {
			logger.info("Launching settings application, set uSD as Storage option for Video recording");
			System.out.println("Launching settings application, set uSD as Storage option for Video recording");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
			TimeUnit.SECONDS.sleep(6);

			//Select About phone
			logger.info("Select About phone");
			System.out.println("Select About phone");
			driver.findElement(By.xpath("//*[@text='About phone']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select storage
			logger.info("Select storage option");
			System.out.println("Select storage option");
			driver.findElement(By.xpath("//*[@text='Storage']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Swipe up and check for storage settings 
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));

			//select storage settings
			logger.info("Select storage settings option");
			System.out.println("Select storage settings option");
			driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select camera option
			logger.info("Select camera option");
			System.out.println("Select camera option");
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

			logger.info("Launching camera application for video recording");
			System.out.println("Launching camera application for video recording");
			//Launch camera application
			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
			TimeUnit.SECONDS.sleep(6);

			//If location permission request pop-up exists select deny option
			logger.info("If location permission request pop-up exists select deny option");
			System.out.println("If location permission request pop-up exists select deny option");
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
			logger.info("Select first highest resolution Video resolution 4K fps");
			System.out.println("Select first highest resolution Video resolution 4K fps");
			driver.findElement(By.xpath("//*[@bounds='[102,162][528,255]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			//Start Recording
			logger.info("Click Start video recording for:  two minute video duration");
			System.out.println("Click Start video recording for: two minute video duration");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']")).click();

			TimeUnit.SECONDS.sleep(120);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']")).click();
			TimeUnit.SECONDS.sleep(3);
			//click Back to settings option to select second highest resolution.
			logger.info("Click setting option to select video resolution");
			System.out.println("Click setting option to select video resolution");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
			TimeUnit.SECONDS.sleep(3);
			//Click on Video Resolution FHD 1080 fps
			logger.info("Select second highest resolution FHD 1080 fps for recording");
			System.out.println("Select second highest resolution FHD 1080 fps for recording");
			driver.findElement(By.xpath("//*[@bounds='[552,162][978,255]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			//Start Recording
			logger.info("Click Start video recording for: two minute video duration");
			System.out.println("Click Start video recording for: two minutes video duration");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']")).click();
			TimeUnit.SECONDS.sleep(120);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']")).click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(3);
			logger.info("Rear camera Video recording is successfull.");
			System.out.println("Rear camera Video recording is successfull");

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
				logger.info("calling Format() for format with data scenario");
				System.out.println("calling Format() for format with data scenario");
				logger.info("===============================================================================================================================================");
				System.out.println("===============================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				//calling Format() for format with data scenario
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
			//	logger.info("===============================================================================================================================================");
			//	System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}

	}
	//Launch settings application to format uSD card with data and verify the Format is successful or not.
	public void Format() throws  IOException, InterruptedException  {	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		//Launch settings application, format uSD card with data
		logger.info("Launch settings application to format uSD card with data");
		System.out.println("Launch settings application to format uSD card with data");
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
			logger.info("Select FORMAT SD CARD option");
			System.out.println("Select FORMAT SD CARD option");
			driver.findElement(By.xpath("//*[@text='Format SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Accept pop-up to  Format uSD Card");

			//Select Format Pop-up
			logger.info("Accept pop-up to  Format uSD Card");
			System.out.println("Accept pop-up to  Format uSD Card");
			driver.findElement(By.xpath("//*[@text='Format SD card']")).click();
			TimeUnit.SECONDS.sleep(30);

			//Select Done
			driver.findElement(By.xpath("//*[@text='DONE']")).click();
			TimeUnit.SECONDS.sleep(3);

			logger.info("Format USD Card with data is succesfull");
			System.out.println("Format USD Card with data is succesfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);

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
				logger.info("Test: End");
				System.out.println("Test: End");
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
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		}

		logger.info("Final Message: Pass Test0 pass for format Operation");
		System.out.println("Final Message: Pass Test0 pass for format Operation");
		logger.info("Test: End");
		System.out.println("Test: End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));


	}
}

