package Ikall_Z3;
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
import javax.print.attribute.Size2DSyntax;
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
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z3");
		dc.setCapability(MobileCapabilityType.UDID, "0123456789ABCDEF");
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
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Clear all\")").click();
			TimeUnit.SECONDS.sleep(5);
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
		TimeUnit.SECONDS.sleep(2);
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
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
				//Click Select All
				logger.info("Select  More options");
				System.out.println("Select More options");
				MobileElement Moreoptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				Moreoptions1 .click();
				TimeUnit.SECONDS.sleep(3);
				//Click move to recycle Bin
				logger.info("Select Delete permanently");
				System.out.println("Select  Delete permanently");
				MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
				MovetoRecycleBin.click();
				TimeUnit.SECONDS.sleep(3);
				//delete
				logger.info("Select  Delete");
				System.out.println("Select  Delete");
				driver.findElement(By.xpath("//*[@text='Delete']")).click();
				TimeUnit.SECONDS.sleep(40);
			}
			catch (Exception e) {

			}
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
		catch(Exception exp)
		{ 
			logger.info("Fail: Test0_Int fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Fail: Test0_Int fail for clear recent apps and clear internal memory "+exp); 
			logger.info("Final Message: Fail Test0_Int fail for clear recent apps and clear internal memory "+exp); 
			System.out.println("Final Message: Fail Test0_Int fail for clear recent apps and clear internal memory "+exp);
			logger.info("Test End"); 
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}	
	public void FormatAsInternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Formatting Phone as InternalMount
		logger.info("Formatting Phone as InternalMOunt");
		System.out.println("Formatting Phone as InternalMOunt");
		try {
			// Launch settings app
			logger.info("Launch Settings Application");
			System.out.println("Launch Settings Application");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe Up and Search for Storage");
			System.out.println("Swipe Up and Search for Storage");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Storage");
			System.out.println("Select Storage");
			//Select uSD Card
			MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Click on More Options
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			moreOptions.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Storage settings
			logger.info("Select storage settings");
			System.out.println("Select storage settings");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage Settings\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Fomratting Phone as Internal mount");
			System.out.println("Fomratting Phone as Internal mount");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(70);
			try {
				logger.info("click on movecontent");
				System.out.println("click on movecontent");
				MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
				movecontent.click();
				TimeUnit.SECONDS.sleep(120);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			logger.info("click on done");
			System.out.println("click on done");
			MobileElement done =driver.findElement(By.xpath("//*[@text='Done']"));
			done.click();
			TimeUnit.SECONDS.sleep(4);
			logger.info("Pass: Format as Internal Mount scenario completed Successfull");
			System.out.println("Pass: Format as Internal Mount scenario completed Successfull");
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
		logger.info("Formatting Phone as External MOunt");
		System.out.println("Formatting Phone as External MOunt");
		try {
			// Launch settings app
			logger.info("Launch Settings Application");
			System.out.println("Launch Settings Application");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe Up and Search for Storage");
			System.out.println("Swipe Up and Search for Storage");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Storage");
			System.out.println("Select Storage");
			//Select uSD Card
			MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.ImageView"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Click on More Options
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			moreOptions.click();
			//Select Storage settings
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as portable\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Format as Portable");
			System.out.println("Select Format as Portable");
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Fomratting Phone as External mount");
			System.out.println("Fomratting Phone as External mount");
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(70);
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
		try {
			//Launching Camera Application
			logger.info("Launch Camera Application");
			System.out.println("Launch Camera Application");
			((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
			//If Permission reuest pop-up exists allow permissons
			TimeUnit.SECONDS.sleep(3);
			//Capture Images
			logger.info("Capturing  25 Images of Default Resolution");
			System.out.println("Capturing  25 Images of Default Resolution");
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.mediatek.camera:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of Default Resolutions"+j);
				logger.info("clicking Image of Default Resolutions"+j);
			}
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
			//Launch File Manager
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find external Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Select External Storage	
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Clearing Internal Memory
			logger.info("Click on DCIM Folder");
			System.out.println("Click on DCIM Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Camera Folder
			logger.info("Click On Camera Folder");
			System.out.println("Click On Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Click More Options
			logger.info("Click On more options");
			System.out.println("Click On more options");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			//logger.info("Select External Storage");
			MoreOptions.click();
			try {
				//Click Select All
				logger.info("Click On select all");
				System.out.println("Click On select all");
				driver.findElement(By.xpath("//*[@text='Select all']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Verifying Image Capture ");
				System.out.println("Verifying Image Capture ");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(3);
				logger.info("Pass:Total Number Of Image captured 25 is successfull");
				System.out.println("Pass:Total Number Of Image captured 25 is successfull");
				logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
				System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				//Calling video() for rear video recording in USD card and verifying data capture.
				Video();
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("Fail: Video function cannot be called as incorrect Images captured ");
				logger.info("Final Message: Fail Test0_Int Fail for Image capture");
				System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
				System.out.println("Final Message: Fail Test0_Int Fail for Image capture");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as Test0_Int fail during rear camera image capture scneario ");
			logger.info("Final Message: Fail Test0_Int for rear camera image capture scenario");
			System.out.println("Fail: Video function cannot be called as Test0_Int fail during rear camera image capture scneario ");
			System.out.println("Final Message: Fail Test0_Int for rear camera image capture scenario");
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
		try {
			//Launching Camera Application
			logger.info("Launch Camera Application");
			System.out.println("Launch Camera Application");
			((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
			TimeUnit.SECONDS.sleep(2);
			//Switch to Video Tab
			driver.findElement(By.xpath("//*[@text='Video']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video Tab");
			System.out.println("Select Video Tab");
			//click Back to settings option
			//driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/menu_setting_button']")).click();
			driver.findElement(By.xpath("//*[@bounds='[15,7][62,54]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click on Video Resolution
			logger.info("Select Video quality");
			System.out.println("Select Video quality");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video quality\")").click();
			TimeUnit.SECONDS.sleep(3);
			//Selecting 1st Highest resolution
			logger.info("Selecting 1st resolution HD");
			System.out.println("Selecting 1st resolution HD");
			driver.findElement(By.xpath("//*[@bounds='[21,96][50,125]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("start recording");
			System.out.println("start recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video\"]"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(120);
			//Stop Recording
			logger.info("stop recording");
			System.out.println("stop recording");
			driver.findElement(By.xpath("//*[@bounds='[187,793][292,898]']")).click();
			//StopRecording.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//click Back to settings option
			driver.findElement(By.xpath("//*[@bounds='[15,7][62,54]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Video quality");
			System.out.println("Select Video quality");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video quality\")").click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2nd resolution 
			//Selecting 2nd Highest resolution
			logger.info("Selecting 2nd resolution VGA");
			System.out.println("Selecting 2nd resolution VGA");
			driver.findElement(By.xpath("//*[@bounds='[21,195][62,224]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//logger.info("Select Video Tab");
			logger.info("start recording");
			System.out.println("start recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Video\"]"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(120);
			//Stop Recording
			logger.info("stop recording");
			System.out.println("stop recording");
			driver.findElement(By.xpath("//*[@bounds='[187,793][292,898]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Launch File Manager
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			////Scroll Up to find external Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);

			//Select External Storage	
			logger.info("select Internal storage");
			System.out.println("select Internal storage");
			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Click on DCIM Folder");
			logger.info("Click on DCIM Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Search For Camera Folder
			logger.info("Click On Camera Folder");
			System.out.println("Click On Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Click More Options
			logger.info("Click On more options");
			System.out.println("Click On more options");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			//logger.info("Select External Storage");
			MoreOptions.click();
			try {
				//Click Select All
				logger.info("Click On select all");
				System.out.println("Click On select all");
				driver.findElement(By.xpath("//*[@text='Select all']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']")).click();
				logger.info("Verifying Image Capture ");
				System.out.println("Verifying Image Capture ");
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
		//Formatting Phone as InternalMount
		logger.info("Formatting Phone as InternalMOunt");
		System.out.println("Formatting Phone as InternalMOunt");
		// Launch settings app
		logger.info("Launch Settings Application");
		System.out.println("Launch Settings Application");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search for Storage");
		System.out.println("Swipe Up and Search for Storage");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Storage");
		System.out.println("Select Storage");
		//Select uSD Card
		MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on More Options
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		moreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Select Storage settings
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage Settings\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select storage settings");
		System.out.println("Select storage settings");
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Fomratting Phone as Internal mount");
		System.out.println("Fomratting Phone as Internal mount");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
		TimeUnit.SECONDS.sleep(80);
		try {
			logger.info("click on movecontent");
			System.out.println("click on movecontent");
			MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
			movecontent.click();
			TimeUnit.SECONDS.sleep(120);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		logger.info("click on done");
		System.out.println("click on done");
		MobileElement done =driver.findElement(By.xpath("//*[@text='Done']"));
		done.click();
		TimeUnit.SECONDS.sleep(4);
		logger.info("Pass:Format as Internal Mount completed Successfull");
		System.out.println("Pass:Format as Internal Mount completed Successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		//Launch File Manager
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find external Storage option
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		TimeUnit.SECONDS.sleep(5);
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		TimeUnit.SECONDS.sleep(5);

		//Select External Storage	
		logger.info("click on Internal storage");
		System.out.println("click on Internal storage");
		driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
		TimeUnit.SECONDS.sleep(3);
		String text3 = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text3+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		//Clearing Internal Memory
		logger.info("Click on DCIM Folder");
		System.out.println("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Search For Camera Folder
			logger.info("Click on camera");
			System.out.println("Click on camera");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
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


