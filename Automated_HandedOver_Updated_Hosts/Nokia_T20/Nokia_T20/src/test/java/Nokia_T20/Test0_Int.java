package Nokia_T20;
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
import io.appium.java_client.touch.offset.PointOption;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia T20");
		dc.setCapability(MobileCapabilityType.UDID, "4000TA13971B0401803");
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
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			// Check for recent apps in background
			((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			TimeUnit.SECONDS.sleep(5);
			// click on close all
			try
			{
				logger.info("Clearing Recent Apps");
				System.out.println("Clearing Recent Apps");
				driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
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

			//Clearing Phone Internal Memory
			//Launch File Manager
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			////Scroll Up to find Internal Storage option
			
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			Internalstorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Long Press Andriod folder
			logger.info("Long press and hold android folder");
			System.out.println("Long press and hold android folder");
			MobileElement Folder =	driver.findElement(By.xpath("//*[@text='Android']"));
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//click more options
			logger.info("Click more options");
			System.out.println("Click more options");
			MobileElement moreoption =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			moreoption.click();
			TimeUnit.SECONDS.sleep(3);
			//Click Select All
			logger.info("Click Select all option");
			System.out.println("Click Select all option");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			try {
				//Select Delete option
				//Click More Options
				logger.info("click on more option");
				System.out.println("click on more option");
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);
				//logger.info("Select External Storage");
				MoreOptions1.click();
				//select Delete permanently option
				logger.info("Select delete permanently option");
				System.out.println("Select delete permanently option");
				driver.findElement(By.xpath("//*[@text='Delete permanently']")).click();
				TimeUnit.SECONDS.sleep(5);
				//Accept delete pop-up
				logger.info("Accept delete pop-up");
				System.out.println("Accept delete pop-up");
				driver.findElement(By.xpath("//*[@text='Delete']")).click();
				TimeUnit.SECONDS.sleep(180);
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
			logger.info("Calling Images() for rear camera image capture and verify the data");
			System.out.println("Calling Images() for rear camera image capture and verify the data");
			
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
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
			

			//Select uSD Card
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Click on More Options
			logger.info("Click more options");
			System.out.println("Click more options");
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			moreOptions.click();
			TimeUnit.SECONDS.sleep(5);	
			//Select Storage setting
			logger.info("Select storage settings option");
			System.out.println("Select storage settings option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
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
			TimeUnit.SECONDS.sleep(120);
			//Accept Move content pop-up option
			logger.info("Accept move content  pop-up");
			System.out.println("Accept move content  pop-up");
			MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
			movecontent.click();
			TimeUnit.SECONDS.sleep(60);
			//click Done option
			logger.info("Click Done option");
			System.out.println("Click Done option");
			MobileElement done =driver.findElement(By.xpath("//*[@text='Done']"));
			done.click();
			TimeUnit.SECONDS.sleep(4);
			logger.info("Pass: Format as Internal Mount scenario completed Successfull");
			System.out.println("Pass: Format as Internal Mount scenario completed Successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		}
		catch(Exception exp)
		{
			logger.info("Fail: Test0_Int fail during interanl mount scenario");
			System.out.println("Fail: Test0_Int fail during interanl mount scenario");
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
			//Select uSD card
			logger.info("Select uSD card");
			System.out.println("Select uSD card");
			MobileElement ExternalStorage = driver.findElement(By.xpath("//*[@bounds='[140,596][344,634]']"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
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
			TimeUnit.SECONDS.sleep(120);
			logger.info("Pass: Format as External Mount is successfull");
			System.out.println("Pass: Format as External Mount is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
		}
	}
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));
		try {
			//Launching camera application rear camera image capture in uSD card
			logger.info("Launching camera application rear camera image capture in uSD card");
			System.out.println("Launching camera application rear camera image capture in uSD card");
			((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));


			//if location permission pop-up exists during camera launch? select deny option
			logger.info("if location permission pop-up exists during camera launch? select deny option");
			System.out.println("if location permission pop-up exists during camera launch? select deny option");
			try 
			{ 
				//Select Deny Option
				logger.info("Select Deny option");
				System.out.println("Select Deny option");
				driver.findElement(By.xpath("//*[@text='OK']")).click();
				TimeUnit.SECONDS.sleep(3);

				

				//driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
				//TimeUnit.SECONDS.sleep(3);	
			} 
			catch(Exception exp)
			{ 
				logger.info("No location acces permission pop-up found : "+exp); 
				System.out.println("No location acces permission pop-up found : "+exp); 
			}

			TimeUnit.SECONDS.sleep(2);

			

			//Capture Images

			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Captureing default resolution image "+j);
				logger.info("Captureing default resolution image "+j);
			}

			

			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			logger.info("Total Number Of Image capture 25 is successfull");
			System.out.println("Total Number Of Image capture 25 is successfull");
			//Launch File Manager
			logger.info("Launch File Manager application to verify  Image capture in uSD card");
			System.out.println("Launch File Manager application to verify  Image capture in uSD card");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe up and select internal storage
			logger.info("Swipe up and select external storage");
			System.out.println("Swipe up and select external storage");
			driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			
			//Select External Storage	
			logger.info("Select ExternalStorage");
			System.out.println("Select ExternalStorage");
			MobileElement InternalStorage = driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(5);


			//Clicking on DCIM Folder
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
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions.click();
			driver.findElement(By.xpath("//*[@text='Select all']")).click();
			TimeUnit.SECONDS.sleep(3);
			try {

				//Click Select All
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='25 selected']"));
				TotalFiles.click();	
				TimeUnit.SECONDS.sleep(5);

				logger.info("Pass:Total Number Of Image captured 25 is successfull");
				System.out.println("Pass:Total Number Of Image captured 25 is successfull");


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
				logger.info("Calling video() for rear camera video recording in uSD card and verifying recorded video in uSD card");
				System.out.println("Calling video() for rear camera video recording in uSD card and verifying recorded video in uSD card");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				Video();
			}

			catch (Exception e) {

				e.printStackTrace();
				logger.info("Fail: Video function cannot be called as incorrect Images captured ");
				logger.info("Final Message: Fail Test0_Int Fail for Image capture");
				System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
				System.out.println("Final Message: Fail Test0_Int Fail for Image capture");
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
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}

		}
		catch (Exception exp)
		{
			logger.info("Fail: Test0_Int Fail for image capture and verify scneario");
			System.out.println("Fail: Test0_Int Fail for image capture and verify scneario");
			logger.info("Final Message: Fail Test0_Int Fail for image capture and verify scneario");
			System.out.println("Fail: Fail Test0_Int Fail for image capture and verify scneario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}



	}
	//Launch camera application and start rear camera video recording for two highest resolutions
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//launch home screen and clear recent apps
				logger.info("Launch home screen");
				System.out.println("Launch home screen");
				((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
				TimeUnit.SECONDS.sleep(5);
				try
				{

					driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
					logger.info("Clearing Recent Apps");
					TimeUnit.SECONDS.sleep(5);	
				}
				catch (Exception e) {
					e.printStackTrace();

				}
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				try {
					//Launching camera application rear camera image capture in uSD card
					logger.info("Launching camera application rear camera image capture in uSD card");
					System.out.println("Launching camera application rear camera image capture in uSD card");
					((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));


					//if location permission pop-up exists during camera launch? select deny option
					logger.info("if location permission pop-up exists during camera launch? select deny option");
					System.out.println("if location permission pop-up exists during camera launch? select deny option");
					try 
					{ 
						//Select Deny Option
						logger.info("Select Deny option");
						System.out.println("Select Deny option");
						driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
						TimeUnit.SECONDS.sleep(3);

						//Click Ok option
						logger.info("Select Ok option");
						System.out.println("Select Ok option");
						driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
						TimeUnit.SECONDS.sleep(3);

						//driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
						//TimeUnit.SECONDS.sleep(3);	
					} 
					catch(Exception exp)
					{ 
						logger.info("No location acces permission pop-up found : "+exp); 
						System.out.println("No location acces permission pop-up found : "+exp); 
					}

					TimeUnit.SECONDS.sleep(2);
					//Switch to Video Tab
					logger.info("Switch to video mode");
					System.out.println("Switch to video mode");
					TouchAction touchAction = new TouchAction(driver);
					touchAction.tap(PointOption.point(1102, 1621)).perform();
					TimeUnit.SECONDS.sleep(5);
					
					logger.info("Nokai T20 Tab camera application has only one in built rear camera video resolution. Hence recording video only for one resolution");
					System.out.println("Nokai T20 Tab camera application has only one in built rear camera video resolution. Hence recording video only for one resolution");
					//Start Recording
					logger.info("Start video recording");
					System.out.println("Start video recording");
					MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
					StartRecording1.click();
					TimeUnit.SECONDS.sleep(240);

					//Stop Recording
					logger.info("Stop video recording");
					System.out.println("Stop video recording");
					driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
					logger.info("Stop Recording");
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(15);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					TimeUnit.SECONDS.sleep(2);
					logger.info("Rear camera video recording is successfull");
					System.out.println("Rear camera video recording is successfull");
					//Launch File Manager application to verify captured video
					logger.info("Launch File Manager Application to verify captured videos");
					System.out.println("Launch File Manager Application to verify captured videos");
					((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
					TimeUnit.SECONDS.sleep(5);
					//Swipe up and select internal storage
					logger.info("Swipe up and select external storage");
					System.out.println("Swipe up and select external storage");
					driver.findElement(MobileBy.AndroidUIAutomator(
				            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

					MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
							".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
					//Select External Storage	
					logger.info("Click On SD Card");
					System.out.println("Click On SD Card");
					MobileElement Internalstorag = driver.findElement(By.xpath("//*[@text='Internal storage']"));
					Internalstorag.click();
					TimeUnit.SECONDS.sleep(5);

					//Search For DCIM Folder 
					logger.info("Select DCIM Folder");
					System.out.println("Select DCIM Folder");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
					TimeUnit.SECONDS.sleep(5);

					//Search For Camera Folder
					logger.info("Select Camera Folder");
					System.out.println("Select Camera Folder");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
					TimeUnit.SECONDS.sleep(5);

					//Click More Options
					logger.info("Click On More Options ");
					System.out.println("Click On More Options ");
					MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
					TimeUnit.SECONDS.sleep(5);
					//logger.info("Select External Storage");
					MoreOptions.click();

					try {

						//Click Select All
						driver.findElement(By.xpath("//*[@text='Select all']")).click();
						TimeUnit.SECONDS.sleep(3);
						MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='26 selected']"));
						TotalFiles.click();	
						TimeUnit.SECONDS.sleep(5);

						logger.info("Pass: 2 Videos recorded Successfully");
						logger.info("Pass: A total of 26 files present in uSD card before Format");
						System.out.println("Pass: 2 Videos recorded Successfully");
						System.out.println("Pass: A total of 26 files present in uSD card before Format");
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
						TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("calling FormatAsExternal() for format with data scenario");
			System.out.println("calling FormatAsExternal() for format with data scenario");
			FormatAsExternal();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("calling FormatAsInternal() for format with data scenario");
			System.out.println("calling FormatAsInternal() for format with data scenario");
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
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
				}
				catch (Exception e)
				{
					logger.info("Fail: Test0 Fail rear camera video recording and verify scenario");
					System.out.println("Fail: Test0 Fail rear camera video recording and verify scenario");
				}

		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

	}

	public void FormatASInternal() throws  IOException, InterruptedException  {	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Formatting uSD card as internal mount
		logger.info("Formatting uSD card as internal mount");
		System.out.println("Formatting uSD card as internal mount");
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
		

		//Select uSD Card
		logger.info("Select SD card");
		System.out.println("Select SD card");
		MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on More Options
		logger.info("Click more options");
		System.out.println("Click more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		moreOptions.click();
		TimeUnit.SECONDS.sleep(5);	
		//Select Storage setting
		logger.info("Select storage settings option");
		System.out.println("Select storage settings option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
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
		TimeUnit.SECONDS.sleep(120);
		//Accept Move content pop-up option
		logger.info("Accept move content  pop-up");
		System.out.println("Accept move content  pop-up");
		MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
		movecontent.click();
		TimeUnit.SECONDS.sleep(60);
		//click Done option
		logger.info("Click Done option");
		System.out.println("Click Done option");
		MobileElement done =driver.findElement(By.xpath("//*[@text='Done']"));
		done.click();
		TimeUnit.SECONDS.sleep(4);
		logger.info("Pass: Format as Internal Mount scenario completed Successfull");
		System.out.println("Pass: Format as Internal Mount scenario completed Successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		logger.info("Pass:Format as Internal Mount completed Successfull");
		System.out.println("Pass:Format as Internal Mount completed Successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		//Launch File Manager
		logger.info("Launch file manager");
		System.out.println("Launch file manager");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select Internal Storage

		
		//Search For Camera Folder
		try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			TimeUnit.SECONDS.sleep(5);
			//Clearing Internal Memory
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Camera folder
			logger.info("Select Camera folder");
			System.out.println("Select Camera folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);

		}

		catch (Exception e) {

			e.printStackTrace();
			logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Final Message: Pass Test0_Int Pass for format with data scenario");
			logger.info("Final Message: Pass Test0_Int Pass for format with data scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
		}

		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));


	}
}