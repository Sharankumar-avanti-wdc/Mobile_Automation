package UMIDIGI_A11S;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "A11S");
		dc.setCapability(MobileCapabilityType.UDID, "A11S432621112305514");
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
				MobileElement  closeAll =	driver.findElement(By.xpath("//*[@bounds='[272,1249][448,1305]']"));
				closeAll.click();
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
				logger.info("Select Delete option");
				System.out.println("Select Delete option");
				MobileElement Delete =	driver.findElement(By.xpath("//*[@bounds='[363,37][427,101]']"));
				Delete.click();
				TimeUnit.SECONDS.sleep(3);
				//Accept delete pop-up
				logger.info("Accept delete pop-up");
				System.out.println("Accept delete pop-up");
				MobileElement AcceptDelete =	driver.findElement(By.xpath("//*[@bounds='[245,617][420,681]']"));
				AcceptDelete.click();
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
			//Select uSD card
			logger.info("Select uSD card");
			System.out.println("Select uSD card");
			MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.ImageView"));
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
			logger.info("Pass: Fomrat as External Mount is successfull");
			System.out.println("Pass: Fomrat as External Mount is successfull");
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
			try 
			{ 
				logger.info("IF Change to uSD card notification pop-up exists select Cancel Option");
				System.out.println("IF Change to uSD card notification pop-up exists select Cancel Option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();

			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}

			TimeUnit.SECONDS.sleep(2);
			//IF Location access notification pop-up exists select Cancel option.

			try 
			{ 	
				logger.info("if Location permisson Pop Exists Select Cancel Option");
				System.out.println("if Location permisson Pop Exists Select Cancel Option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();

			} 
			catch(Exception exp)
			{ 
				// Block of code to handle errors
				logger.info("Location permission access pop-up  not found : "+exp); 
				System.out.println("Location permission access pop-up  not found : "+exp); 
			}

			//Switch to back camera if current existing camera is Front camera.
			try {
				logger.info("Switch to rear Camera Mode if current Exiting camera is Front camera Mode");
				System.out.println("Switch to rear Camera Mode if current Exiting camera is Front camera Mode");
				MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();

			}

			catch(Exception exp)
			{ 
				// Block of code to handle errors
				logger.info("Currently camera is already in rear camera mode no need to switch"); 
				System.out.println("Currently camera is already in rear camera mode no need to switch"); 
			}
			//Select Photo mode option
			logger.info("Select photo mode option");
			System.out.println("Select photo mode option");
			driver.findElement(By.xpath("//*[@text='Capture']")).click();

			//Capture Images
			logger.info("Capture Image of Default Resolution");
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing default resolution image "+j);
				logger.info("Captureing default resolution image "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			logger.info("Total Number Of Image captured 25 is successfull");
			System.out.println("Total Number Of Image captured 25 is successfull");

			//Launch File Manager application to verify  Image capture
			logger.info("Launch File Manager application to verify  Image capture");
			System.out.println("Launch File Manager application to verify  Image capture");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			////Scroll Up to find Internal Storage option
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			Internalstorage.click();
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
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='25 selected']"));
				TimeUnit.SECONDS.sleep(5);
				TotalFiles.click();
				logger.info("Pass: Total Number Of Image captured 25 is successfull");
				System.out.println("Pass: Total Number Of Image captured 25 is successfull");
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
		//Launch home screen and clear recent apps
		logger.info("Launch home screen and clear recent apps");
		System.out.println("Launch home screen and clear recent apps");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);

		try
		{	logger.info("Clearing recent apps");
		System.out.println("Clearing recent apps");
		MobileElement  closeAll =	driver.findElement(By.xpath("//*[@bounds='[272,1249][448,1305]']"));
		closeAll.click();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("No recent apps found in background to clear");
			System.out.println("No recent apps found in background to clear");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);


		//Launch Camera Application.
		logger.info("Launch camera application for rear camera video recording");
		System.out.println("Launch camera application for rear camera video recording");
		((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));

		try 
		{ 
			logger.info("IF Change to uSD card notification pop-up exists select Cancel Option");
			System.out.println("IF Change to uSD card notification pop-up exists select Cancel Option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();

		} 
		catch(Exception exp)
		{ 
			logger.info("change to SD card element not found : "+exp); 
			System.out.println("change to SD card element not found : "+exp); 

		}

		TimeUnit.SECONDS.sleep(2);
		//IF Location access notification pop-up exists select Cancel option.

		try 
		{ 	
			logger.info("if Location permisson Pop Exists Select Cancel Option");
			System.out.println("if Location permisson Pop Exists Select Cancel Option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();

		} 
		catch(Exception exp)
		{ 
			// Block of code to handle errors
			logger.info("Location permission access pop-up  not found : "+exp); 
			System.out.println("Location permission access pop-up  not found : "+exp); 
		}

		//Switch to back camera if current existing camera is Front camera.
		try {
			logger.info("Switch to rear Camera Mode if current Exiting camera is Front camera Mode");
			System.out.println("Switch to rear Camera Mode if current Exiting camera is Front camera Mode");
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();

		}

		catch(Exception exp)
		{ 
			// Block of code to handle errors
			logger.info("Currently camera is already in rear camera mode no need to switch"); 
			System.out.println("Currently camera is already in rear camera mode no need to switch"); 
		}
		// Switch to Video mode
		logger.info("Switch to video mode");
		System.out.println("switch to video mode");
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@text='Video']")).click();
		TimeUnit.SECONDS.sleep(5);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Setting1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		Setting1.click();
		TimeUnit.SECONDS.sleep(5);

		//Click On Video size
		logger.info("Select Video size option");
		System.out.println("Select Video size option");
		MobileElement Videosize = driver.findElement(By.xpath("//*[@text='Video size(Back camera)']"));
		Videosize.click();
		TimeUnit.SECONDS.sleep(5);

		//Select 1st resolution
		logger.info("Select rear camera first video resolution: HD 1080p");
		System.out.println("Select rear camera first video resolution: HD 1080p");
		MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='HD 1080p']"));
		FirstRes.click();
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
		StartRecording.click();
		TimeUnit.SECONDS.sleep(120);


		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
		StopRecording.click();
		TimeUnit.SECONDS.sleep(5);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Setting2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		Setting2.click();
		TimeUnit.SECONDS.sleep(5);

		//Click On Video size
		logger.info("Select Video size option");
		System.out.println("Select Video size option");
		MobileElement Videosize1 = driver.findElement(By.xpath("//*[@text='Video size(Back camera)']"));
		Videosize1.click();
		TimeUnit.SECONDS.sleep(5);

		//Select 2nd resolution
		logger.info("Select rear camera second video resolution: HD 720p");
		System.out.println("Select rear camera second video resolution: HD 720p");
		MobileElement secondRes = driver.findElement(By.xpath("//*[@text='HD 720p']"));
		secondRes.click();
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Recording Video for 2Minutes of Duration");

		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
		StopRecording1.click();
		TimeUnit.SECONDS.sleep(5);

		// Switch to default photo mode
		logger.info("Switch back to photo mode option");
		System.out.println("Switch back to photo mode option");
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@text='Capture']")).click();
		TimeUnit.SECONDS.sleep(5);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Rear camera video recording is successfull");
		System.out.println("Rear camera video recording is successfull");

		//Launch File Manager application to verify  Image capture
		logger.info("Launch File Manager application to verify  video  recordings");
		System.out.println("Launch File Manager application to verify  video  recordings");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);

		////Scroll Up to find Internal Storage option
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		logger.info("Select internal storage");
		System.out.println("Select internal storage");
		MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
		Internalstorage.click();
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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

		//Select uSD Card
		logger.info("Select uSD card");
		System.out.println("Select uSD card");
		MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//Click more options
		logger.info("Click more options");
		System.out.println("Click more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		logger.info("Clicking on more options");
		moreOptions.click();
		TimeUnit.SECONDS.sleep(5);
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
		//Accept move content pop-up
		logger.info("Accept move content pop-up");
		System.out.println("Accept move content pop-up");
		MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
		movecontent.click();
		TimeUnit.SECONDS.sleep(60);
		logger.info("click on done");
		MobileElement done =driver.findElement(By.xpath("//*[@text='Done']"));
		done.click();
		TimeUnit.SECONDS.sleep(4);
		logger.info("Pass: Format as Internal Mount completed Successfull");
		System.out.println("Pass: Format as Internal Mount completed Successfull");
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

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		//Search For Camera Folder
		try {
			MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			Internalstorage.click();
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
			System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("Final Message: Pass Test0_Int Pass for format with data scenario");
			System.out.println("Final Message: Pass Test0_Int pass for format with data scenario");
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