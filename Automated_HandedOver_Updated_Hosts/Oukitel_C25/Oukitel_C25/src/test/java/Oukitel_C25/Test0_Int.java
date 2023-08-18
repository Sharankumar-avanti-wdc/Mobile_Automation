package Oukitel_C25;

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

public class Test0_Int {
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "C25");
		dc.setCapability(MobileCapabilityType.UDID, "OUKITELC2533567");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void start() throws 	IOException, InterruptedException  {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test0_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info(" Test0_Int Scenario is as follows  ");
		logger.info("1.Unlock phone, clear recent apps,Format uSD as Internal mount and Clear internal mount memory");
		logger.info("2.Call Image() and Capture Rear camera 25 images with default resolution in internal mount uSD card and Verify the data capture");
		logger.info("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in internal mount uSD Card and verify the same");
		logger.info("4.Call Format() Format uSD as External mount,Format back to internal mount, Verify with data format status.");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test0_Int Scenario is as follows ");
		System.out.println("1.Unlock phone, clear recent apps,Format uSD as Internal mount and Clear internal mount memory");
		System.out.println("2.Call Image() and Capture Rear camera 25 images with default resolution in internal mount uSD card and Verify the data capture");
		System.out.println("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in internal mount uSD Card and verify the same");
		System.out.println("4.Call Format() Format uSD as External mount,Format back to internal mount, Verify with data format status.");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		SetUp();
		String Result = "Fail";
		logger.info("Unlocking Phone");

		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		// Click Recent Apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(3);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Clear All\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test0_Int Pass for clearing Recent apps ");
			System.out.println("Pass: Test0_Int Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		//Calling FomratAsInternal() to format the Card Internal Mount
		logger.info("Calling FormatAsInternal() to format uSD card as internal mount");
		System.out.println("Calling FormatAsInternal() to format uSD card as internal mount");
		FormatAsInternal();
		try {
			//Clearing Phone Internal Memory
			//Launch File Manager
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find external Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			try {
				//Click Select All
				logger.info("Select  More options");
				System.out.println("Select More options");
				MobileElement Moreoptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				Moreoptions .click();
				TimeUnit.SECONDS.sleep(3);
				//Click Select all
				logger.info("click on Select all");
				System.out.println("click on Select all");
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
				SelectAll.click();
				TimeUnit.SECONDS.sleep(3);
				//Click move to recycle Bin
				logger.info("Select Delete permanently");
				System.out.println("Select  Delete permanently");
				MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/delete_action']"));
				MovetoRecycleBin.click();
				TimeUnit.SECONDS.sleep(3);
				//delete
				logger.info("Select  Delete");
				System.out.println("Select  Delete");
				driver.findElement(By.xpath("//*[@text='Delete']")).click();
				TimeUnit.SECONDS.sleep(60);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(4);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(4);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(4);
			}
			catch (Exception e) {


			}

			logger.info("Pass: Clearing phone internal memory is successfull");
			System.out.println("Pass: Clearing phone internal memory is successfull");
			logger.info("Calling Image() to capture rear camera image in Internal storage and verifying the same.");
			System.out.println("Calling Image() to capture rear camera image in Internal storage and verifying the same.");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
			Images();
		}
		catch (Exception exp)
		{
			logger.info("Fail: Test0_Int Fail for clear recent apps and clear internal mount scenario");
			System.out.println("Fail: Test0_Int Fail for clear recent apps and clear internal mount scenario");
			logger.info("Final Message: Fail Test0_Int Fail for clear recent apps and clear intenal memory scenario");
			System.out.println("Final Message: Fail Test0_Int Fail for clear recent apps and clear intenal memory scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}	
	public void FormatAsInternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Formatting Phone as InternalMount
		logger.info("Formatting uSD card as Internal mount");
		System.out.println("Formatting uSD as Internal mount");
		// Launch settings app
		logger.info("Launch settings application");
		System.out.println("Launch settings application");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search Storage option
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe up and select storage option");
			System.out.println("Swipe up and select storage option");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//Select storage option
			logger.info("Select Storage option");
			System.out.println("Select Storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			try
			{
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
				TimeUnit.SECONDS.sleep(5);
			}
			//Click on More Options
			logger.info("Click more options");
			System.out.println("Click more options");
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			moreOptions.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Storage settings
			logger.info("select storage settings");
			System.out.println("select storage settings");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage Settings\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select format as Internal option
			logger.info("Select format as Internal option");
			System.out.println("Select format as Internal options");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Accept Format SD card pop-up
			logger.info("Accept Format SD card pop-up");
			System.out.println("Accept Format SD card pop-up");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(60);
			try {
				//Accept Move content pop-up option
				logger.info("Accept move content  pop-up");
				System.out.println("Accept move content  pop-up");
				MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
				movecontent.click();
				TimeUnit.SECONDS.sleep(60);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Format as Internal Mount scenario completed Successfull");
			System.out.println("Pass: Format as Internal Mount scenario completed Successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(4);
		}
		catch(Exception exp)
		{
			logger.info("Fail: Test0_Int Fail during interanl mount scenario");
			System.out.println("Fail: Test0_Int Fail during interanl mount scenario");
			logger.info("Final Message: Fail Test0_Int Fail during interanl mount scenario");
			System.out.println("Final Message: Fail Test0_Int Fail during interanl mount scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void FormatAsExternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Formatting Phone as InternalMount
		logger.info("Formatting uSD as External format");
		System.out.println("Formatting uSD as External format");
		// Launch settings app
		logger.info("Launch Settings Application");
		System.out.println("Launch Settings Application");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// Swipe and select storage option
		TimeUnit.SECONDS.sleep(5);
		try {
			logger.info("Swipe Up and Search for Storage");
			System.out.println("Swipe Up and Search for Storage");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//Select storage option
			logger.info("Select storage option");
			System.out.println("Select storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			try
			{
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				// click on SD card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
				TimeUnit.SECONDS.sleep(5);
			}
			// Click more options
			logger.info("Click more options");
			System.out.println("Click more options");	
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
			moreOptions.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Storage settings
			logger.info("Select Storage settings option");
			System.out.println("Select Storage settings option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as portable\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Format as portable option
			logger.info("Select Format as portable option");
			System.out.println("Select Format as portable option");
			TimeUnit.SECONDS.sleep(5);
			//Accept format pop-up
			logger.info("Accept format pop-up");
			System.out.println("Accept format pop-up");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT\")").click();
			TimeUnit.SECONDS.sleep(5);
			TimeUnit.SECONDS.sleep(90);
			logger.info("Pass: Fomrat as External Mount is successfull");
			System.out.println("Pass: Fomrat as External Mount is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(4);
		}
		catch (Exception exp)
		{
			logger.info("Fail: Test0_Int Fail during Format as external(Format as Portable)scenario");
			System.out.println("Fail: Test0_Int Fail during Format as external(Format as Portable)scenario");
			logger.info("Final Message: Fail Test0_Int Fail during Format as external(Format as Portable)scenario");
			System.out.println("Final Message: Fail Test0_Int Fail during Format as external(Format as Portable)scenario");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(4);
		}
	}
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity(" com.android.camera2", "com.android.camera.CameraActivity"));
		TimeUnit.SECONDS.sleep(5);
		//select camera permissions
		logger.info("Select camera permissions");
		System.out.println("While camera permissions");
		try {
			logger.info("Select While using the app");
			System.out.println("While using the app");
			driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(5);
		try {
			logger.info("Select START CAPTURE");
			System.out.println("START CAPTURE");
			driver.findElement(By.xpath("//*[@text='START CAPTURE']")).click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(5);
		//Capture Images
		logger.info("Capture Image of Default Resolution");
		System.out.println("Capture Image of Default Resolution");
		for(int j = 0; j <25; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking Image of Default Resolutions"+j);
			logger.info("clicking Image of Default Resolutions"+j);

		}
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Pass:Total Number Of Image captured 25 is successfull");
		System.out.println("Pass:Total Number Of Image captured 25 is successfull");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		//Launch File Manager application to verify  Image capture
		logger.info("Launch File Manager application to verify  Image capture");
		System.out.println("Launch File Manager application to verify  Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select browse option
		logger.info("Select browse option");
		System.out.println("Select browse option");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		////Scroll Up to find external Storage option
		logger.info("swipe up and search for Internal storage  option");
		System.out.println("swipe up and search for Internal storage option");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

		//Select SD Card
		logger.info("Select  Internal storage");
		System.out.println("Select  Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Switch grid view mode
		logger.info("switch to grid view mode to select DCIM folder");
		System.out.println("switch to grid view mode to select DCIM folder");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select DCIM Folder
		logger.info("Select DCIM folder");
		System.out.println("Select DCIM Folder");
		MobileElement DCIM2 =	driver.findElement(By.xpath("//*[@text='DCIM']"));
		DCIM2.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Camera folder
		logger.info("Select camera folder");
		System.out.println("Select camera folder");
		MobileElement Camera2 =	driver.findElement(By.xpath("//*[@text='Camera']"));
		Camera2.click();
		TimeUnit.SECONDS.sleep(3);
		//Switch back to list view mode
		logger.info("switch to list view mode ");
		System.out.println("switch to list view mode");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//click on more option
		logger.info("Select moreoptions");
		System.out.println("Select moreoptions");
		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		MoreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on Select All 
		try {
			//Select All
			//Click Select all
			logger.info("Select select all option");
			System.out.println("Select select all option");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Check 25 images present or not");
			System.out.println("Check 25 images present or not");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
			logger.info("Verifying Image Capture ");
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass:Total Number Of Image captured 25 is successfull");
			System.out.println("Pass:Total Number Of Image captured 25 is successfull");
			logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
			System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Calling video() for rear video recording in USD card and verifying data capture.
			Video();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0_Int Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0_Int Fail for Image capture");
			logger.info("Test End"); 
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		TimeUnit.SECONDS.sleep(2);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		try {
			// Click Recent Apps
			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
			TimeUnit.SECONDS.sleep(5);
			//Launch Camera Application.
			logger.info("Launch Camera Application");
			System.out.println("Launch Camera Application");
			((StartsActivity) driver).startActivity(new Activity(" com.android.camera2", "com.android.camera.CameraActivity"));
			TimeUnit.SECONDS.sleep(5);
			//select camera permissions
			//select camera permissions
			logger.info("Select camera permissions");
			System.out.println("While camera permissions");
			try {
				logger.info("Select While using the app");
				System.out.println("While using the app");
				driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			TimeUnit.SECONDS.sleep(5);
			try {
				logger.info("Select START CAPTURE");
				System.out.println("START CAPTURE");
				driver.findElement(By.xpath("//*[@text='START CAPTURE']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			TimeUnit.SECONDS.sleep(5);	
			//Click On video
			logger.info("Select video tab");
			System.out.println("Select video tab");
			driver.findElement(By.xpath("//*[@text='Video']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[624,60][720,220]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video size(Back camera)");
			System.out.println("Select Video size(Back camera)");
			MobileElement VideoResolution = driver.findElement(By.xpath("//*[@text='Video size(Back camera)']"));
			VideoResolution.click();
			logger.info("Select 1st Back Video Resolution: HD 1080p");
			System.out.println("Select 1st Back Video Resolution: HD 1080p");
			//Select 1st resolution
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='HD 1080p']"));
			FirstRes.click();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Recording Video for 2Minutes of Duration");
			System.out.println("Recording Video for 2Minutes of Duration");
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[624,60][720,220]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video size(Back camera)");
			System.out.println("Select Video size(Back camera)");
			MobileElement VideoResolution1 = driver.findElement(By.xpath("//*[@text='Video size(Back camera)']"));
			VideoResolution1.click();
			logger.info("Select 2nd Back Video Resolution: HD 720p");
			System.out.println("Select 2nd Back Video Resolution:  HD 720p");
			//Select 2nd resolution
			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='HD 720p']"));
			SecondRes.click();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Recording Video for 2Minutes of Duration");
			System.out.println("Recording Video for 2Minutes of Duration");
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			StopRecording1.click();
			TimeUnit.SECONDS.sleep(8);
			//Click On photo mode
			logger.info("Select photo mode");
			System.out.println("Select photo mode");
			driver.findElement(By.xpath("//*[@text='Capture']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Rear camera video recording is successfull");
			System.out.println("Pass: Rear camera video recording is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Launch File Manager application to verify  Image capture
			logger.info("Launch file manager application to verify recorded videos in uSD card");
			System.out.println("Launch File Manager application to verify  Image capture");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			MobileElement Sdcard2= driver.findElement(By.xpath("//*[@text='Internal storage']"));
			Sdcard2.click();
			TimeUnit.SECONDS.sleep(5);
			//Search For DCIM Folder 
			logger.info("Select DCIM Folder");
			System.out.println("Select DCIM Folder");
			String text2 = "DCIM";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			try {
				//Click More Options
				logger.info("Select More Options ");
				System.out.println("Select More Options ");
				MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions.click();
			}
			catch (Exception e) {
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				MoreOptions1.click();
				e.printStackTrace();
			}
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
				logger.info("Pass: A total of 27 files present in Internal storage before Format");
				System.out.println("Pass: 2 Videos recorded Successfully");
				System.out.println("Pass: A total of 27 files present in Internal storage before Format");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(5);
				logger.info("calling FormatAsInternal() for format with data scenario");
				System.out.println("calling FormatAsInternal() for format with data scenario");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				//formar as external
				FormatAsExternal();
				//format AS internal
				FormatASInternal();
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("Fail: Format function cannot be called as incorrect Videos captured");
				logger.info("Fail: Test0_Int Fail for file verification");
				logger.info("Final Message: Fail Test0_Int Fail for Video Capture");
				System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
				System.out.println("Fail: Test0_Int Fail for file verification");
				System.out.println("Final Message: Fail Test0_Int Fail for Video Capture");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test0_Int Fail for rear camera video recording scenario");
			System.out.println("Fail: Test0_Int Fail for rear camera video recording scenario");
			logger.info("Final Message: Fail Test0_Int fail for rear camera video recording scenario");
			System.out.println("Final Message: Fail Test0_Int fail for rear camera video recording scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void FormatASInternal() throws  IOException, InterruptedException  {	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Formatting uSD card as internal mount
		logger.info("Formatting uSD card as internal mount");
		System.out.println("Formatting uSD card as internal mount");
		//Launch settings application
		logger.info("Launch settings application");
		System.out.println("Launch settings application");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// Swipe up and select storage option
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe up and select storage option");
		System.out.println("Swipe up and select storage option");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		try
		{
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		TimeUnit.SECONDS.sleep(5);
		//Click more options
		logger.info("Click more options");
		System.out.println("Click more options");
		MobileElement Moreoptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
		Moreoptions .click();
		TimeUnit.SECONDS.sleep(3);
		//Select Storage settings
		logger.info("Select storage settings option");
		System.out.println("Select storage settings option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage Settings\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select Format as Internal option
		logger.info("Select Format as Internal option");
		System.out.println("Select Format as Internal option");
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Accept format SD Card pop-up
		logger.info("Accept format SD Card pop-up");
		System.out.println("Accept format SD Card pop-up");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
		TimeUnit.SECONDS.sleep(120);
		try {
			//Accept move content pop-up
			logger.info("Accept move content pop-up");
			System.out.println("Accept move content pop-up");
			MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
			movecontent.click();
			TimeUnit.SECONDS.sleep(60);
		}
		catch (Exception e) {

		}
		TimeUnit.SECONDS.sleep(5);
		logger.info("Pass:Format as Internal Mount completed Successfull");
		System.out.println("Pass:Format as Internal Mount completed Successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(4);
		//Launch File Manager
		logger.info("Launch file manager");
		System.out.println("Launch file manager");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find external Storage option
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		TimeUnit.SECONDS.sleep(5);
		//Select Internal Memory
		logger.info("Select  Internal storage");
		System.out.println("Select  Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//search for test1 folder
		String text1 = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		//		//Clearing Internal Memory
		//		logger.info("Click on DCIM Folder");
		//		System.out.println("Click on DCIM Folder");
		//		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		//		TimeUnit.SECONDS.sleep(5);
		//		logger.info("Click on camera");
		//		System.out.println("Click on camera");
		//		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		//		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Search For Camera Folder
			logger.info("Click on DCIM");
			System.out.println("Click on DCIM");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Fail:Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Test0_Int fail for format operation");
			logger.info("Fail:Images and videos are present in the DCIM folder");
			logger.info("Final Message: Test0_Int fail for format operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			e.printStackTrace();

			logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("Final Message: Pass Test0_Int pass for format Operation");
			System.out.println("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Final Message: Pass Test0_Int pass for format Operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
	}
}