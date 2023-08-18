package Realme_Q3S_RMX3461;
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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme Q3s");
		dc.setCapability(MobileCapabilityType.UDID, "c50c4356");
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
		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		
		try {
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//click on browse  option
			logger.info("click on browse option");
			System.out.println("click on browse option");
			MobileElement  Browse =	driver.findElement(By.xpath("//*[@text='Browse']"));
			Browse.click();
			TimeUnit.SECONDS.sleep(3);

			//Swipe up and select uSD Card
			logger.info("Swipe up and select Internal storage");
			System.out.println("Swipe up and select Internal storage");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			


				//Click MoreOption
				logger.info("Select  MoreOption");
				System.out.println("Select  MoreOption");
				MobileElement  MoreOption =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOption.click();
				TimeUnit.SECONDS.sleep(3);

				//Click Select All
				logger.info("Select  SelectAll");
				System.out.println("Select  SelectAll");
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
				SelectAll.click();
				TimeUnit.SECONDS.sleep(3);

				//Click MoreOption
				logger.info("Select  MoreOption");
				System.out.println("Select  MoreOption");
				MobileElement  MoreOption1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOption1.click();
				TimeUnit.SECONDS.sleep(3);

				//Click Delete
				logger.info("Select  Delete all");
				System.out.println("Select  Delete all");
				MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
				Delete.click();
				TimeUnit.SECONDS.sleep(3);

				//Click move to recycle Bin
				logger.info("Select  Delete");
				System.out.println("Select  Delete");
				MobileElement Delete1 =	driver.findElement(By.xpath("//*[@text='Delete']"));
				Delete1.click();
				TimeUnit.SECONDS.sleep(120);


			}
		
			catch (Exception e) {
				logger.info("No data found to clear internal memory");
				System.out.println("No data found to clear internal memory");
			}
		logger.info("Pass: Clearing phone internal memory is successfull");
		System.out.println("Pass: Clearing phone internal memory is successfull");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
		logger.info("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
		System.out.println("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
		Images();
		
	}	
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Camera launch application is successfull");
			System.out.println("Camera launch application is successfull");
			//Select Settings option
			logger.info("Select settings option");
			System.out.println("select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[888,0][1005,240]']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			//Click on Advanced settings
			logger.info("select adavanced settings option");
			System.out.println("select advanced settings option");
			MobileElement AdvancedSettings = driver.findElement(By.xpath("//*[@bounds='[72,1518][468,1583]']"));
			AdvancedSettings.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Save to uSD card
			logger.info("Select Save to SD card option");
			System.out.println("Select Save to SD card option");
			MobileElement SavetoSDCardPreferred = driver.findElement(By.xpath("//*[@bounds='[900,865][1008,931]']"));
			SavetoSDCardPreferred.click();
			//if turn on SD card accept pop-up exists select Turn on
			try {
				logger.info("If turn on SD card pop-up exists select turn on option");
				System.out.println("If turn on SD card pop-up exists select turn on option");
				MobileElement TurnON = driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
				TurnON.click();
			}
			catch (Exception e) {
				logger.info("NO turn on SD card pop-up exists found");
				System.out.println("NO turn on SD card pop-up exists found");
			}
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);

			//Capture Images
			logger.info("Capture Image of Default Resolution");
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking default resolution image"+j);
				logger.info("clicking default resolution image"+j);

			}
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);


			TimeUnit.SECONDS.sleep(6);
			logger.info("Pass:Total Number Of Image captured 25 is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			//launch file manager application to verify image capture in uSD card
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.coloros.filemanager", "com.coloros.filemanager.filerefactor.ui.main.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Scroll up and select uSD Card
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			MobileElement SDcard = driver.findElement(By.xpath("//*[@text='SD Card']"));
			SDcard.click();
			TimeUnit.SECONDS.sleep(5);
			//select More options
			logger.info("Select more options");
			System.out.println("Select more options");
			MobileElement MoreOPtions = driver.findElement(By.xpath("//*[@content-desc='More options,']"));
			MoreOPtions.click();
			TimeUnit.SECONDS.sleep(5);
			//select sort option
			logger.info("Select sort option");
			System.out.println("Select sort option");
			driver.findElement(By.xpath("//*[@text='Sort']")).click();
			TimeUnit.SECONDS.sleep(5);
			//select by date option
			logger.info("Select By date option");
			System.out.println("Select By date option");
			driver.findElement(By.xpath("//*[@text='By date']")).click();
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
			driver.findElement(By.xpath("//*[@content-desc='More options,']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click Edit Option
			logger.info("Select edit option ");
			System.out.println("Select edit option");
			driver.findElement(By.xpath("//*[@text='Edit']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@resource-id='com.coloros.filemanager:id/action_select_all']"));
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
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {

			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0 Fail for rear camera Image capture");
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
		try {
			((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Camera launch application is successfull");
			System.out.println("Camera launch application is successfull");
			TimeUnit.SECONDS.sleep(2);
			// Switch to Video mode
			logger.info("Switch Video mode");
			System.out.println("Switch Video mode");
			TimeUnit.SECONDS.sleep(5);
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(336, 1777)).perform();
			TimeUnit.SECONDS.sleep(5);
			//select layout option
			logger.info("Select layout option");
			System.out.println("Select layout option");
			MobileElement Layout = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/drawer_layout_anchor_view']"));
			Layout.click();
			//Select Settings option
			logger.info("Select frame rate 30FPS");
			System.out.println("Select frame rate 30FPS");
			MobileElement Frame30FPS = driver.findElement(By.xpath("//*[@text='30 fps']"));
			Frame30FPS.click();
			TimeUnit.SECONDS.sleep(5);
			//select 4K resolution
			logger.info("Select 4K resolution");
			System.out.println("Select 4K resolution");
			MobileElement FirsRes = driver.findElement(By.xpath("//*[@content-desc='4K']"));
			FirsRes.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Close Layoff");
			System.out.println("Close Layoff");
			MobileElement LayoutOff = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/drawer_layout_anchor_view']"));
			LayoutOff.click();
			//Start Recording
			logger.info("Start video recording for 2minutes duration");
			System.out.println("Start video recording for 2minutes duration");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(120);

			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@bounds='[423,1932][657,2166]']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(15);
			//select layout option
			logger.info("Select layout option");
			System.out.println("Select layout option");
			MobileElement Layout1 = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/drawer_layout_anchor_view']"));
			Layout1.click();
			//select 1080P resolution
			logger.info("Select 1080P resolution");
			System.out.println("Select 1080P resolution");
			MobileElement SecondRes = driver.findElement(By.xpath("//*[@content-desc='1080P']"));
			FirsRes.click();
			TimeUnit.SECONDS.sleep(5);
			MobileElement LayoutOff1 = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/drawer_layout_anchor_view']"));
			LayoutOff1.click();
			//Start Recording
			logger.info("Start video recording for duration of 2minutes");
			System.out.println("Start video recording for duration of 2minutes");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']"));
			StartRecording1.click();														
			TimeUnit.SECONDS.sleep(120);
			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@bounds='[423,1932][657,2166]']"));
			StopRecording1.click();
			//switch back to photo mode
			logger.info("Switch photo mode");
			System.out.println("Switch photo mode");
			TimeUnit.SECONDS.sleep(5);
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(764, 1782)).perform();
			TimeUnit.SECONDS.sleep(5);
			TimeUnit.SECONDS.sleep(15);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			//TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Rear camera video recording is successfull");
			System.out.println("Pass: Rear camera video recording is successfull");
			//Verifying Captured Videos
			//Launch Home screen and Clear recent Apps
			logger.info("Verifying Captured Videos");
			logger.info("Launch Home screen and Clear recent Apps");
			System.out.println("Verifying Captured Videos");
			System.out.println("Launch Home screen and Clear recent Apps");
			//((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));


			//Launch File Manager application to verify captured video
			//launch file manager application to verify image capture in uSD card
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.coloros.filemanager", "com.coloros.filemanager.filerefactor.ui.main.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Scroll up and select uSD Card
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			MobileElement SDcard = driver.findElement(By.xpath("//*[@text='SD Card']"));
			SDcard.click();
			TimeUnit.SECONDS.sleep(5);
			//select More options
			logger.info("Select more options");
			System.out.println("Select more options");
			MobileElement MoreOPtions = driver.findElement(By.xpath("//*[@content-desc='More options,']"));
			MoreOPtions.click();
			TimeUnit.SECONDS.sleep(5);
			//select sort option
			logger.info("Select sort option");
			System.out.println("Select sort option");
			driver.findElement(By.xpath("//*[@text='Sort']")).click();
			TimeUnit.SECONDS.sleep(5);
			//select by date option
			logger.info("Select By date option");
			System.out.println("Select By date option");
			driver.findElement(By.xpath("//*[@text='By date']")).click();
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
			driver.findElement(By.xpath("//*[@content-desc='More options,']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click Edit Option
			logger.info("Select edit option ");
			System.out.println("Select edit option");
			driver.findElement(By.xpath("//*[@text='Edit']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@resource-id='com.coloros.filemanager:id/action_select_all']"));
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
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("calling Format() for format with data scenario");
				System.out.println("calling Format() for format with data scenario");
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
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			
            e.printStackTrace();
            logger.info("Fail: Format function cannot be called as incorrect Videos captured");
            logger.info("Fail: Test0 Fail for file verification");
            logger.info("Final Message: Fail Test0 Fail for Video Capture");
            System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
            System.out.println("Fail: Test0 Fail for file verification");
            System.out.println("Final Message: Fail Test0 Fail for Video Capture");
            logger.info("Test: End");
            System.out.println("Test: End");
            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        }

		}

		public void Format() throws  IOException, InterruptedException  {	
			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			//Launch Home screen and clear recent apps
			// Launch Settings application for Format uSD card with Data scenario
			logger.info("Launch Settings application for Format uSD card with Data scenario ");
			System.out.println("Launch Settings application for Format uSD card with Data ");
			try {
				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				// search for battery and device care element
				TimeUnit.SECONDS.sleep(5);
				logger.info("Scroll up and select Storage option");
				System.out.println("Scroll up and select Storage option");
				String text = "Storage";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("select Storage option");
				System.out.println("Select storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Clicking on storage");
				System.out.println("Clicking on storage");
				String text1 = "SD card";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Swipe and select uSD card");
				System.out.println("Swipe and select uSD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				TimeUnit.SECONDS.sleep(5);
				// click on format
				logger.info("Click Format");
				System.out.println("Click Format");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
				TimeUnit.SECONDS.sleep(5);
				MobileElement formatsdcard2 = 	driver.findElement(By.xpath("//*[@text='FORMAT SD CARD']"));
				formatsdcard2.click();
				// wait for 2 mins
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");
				TimeUnit.SECONDS.sleep(90);
				try {
					MobileElement CANCEL = 	driver.findElement(By.xpath("//*[@text='CANCEL']"));
					CANCEL.click();
					TimeUnit.SECONDS.sleep(5);
					}
					catch (Exception e) {

						e.printStackTrace();
					}
				
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
			logger.info("Pass: Format uSD with Data is successfull");
			System.out.println("Pass: Format uSD with Data is successfull");

			//Launch File Manager
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.coloros.filemanager", "com.coloros.filemanager.filerefactor.ui.main.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Scroll up and select uSD Card
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			MobileElement SDcard = driver.findElement(By.xpath("//*[@text='SD Card']"));
			SDcard.click();
			TimeUnit.SECONDS.sleep(5);
			//select More options
			logger.info("Select more options");
			System.out.println("Select more options");
			MobileElement MoreOPtions = driver.findElement(By.xpath("//*[@content-desc='More options,']"));
			MoreOPtions.click();
			TimeUnit.SECONDS.sleep(5);
			//select sort option
			logger.info("Select sort option");
			System.out.println("Select sort option");
			driver.findElement(By.xpath("//*[@text='Sort']")).click();
			TimeUnit.SECONDS.sleep(5);
			//select by date option
			logger.info("Select By date option");
			System.out.println("Select By date option");
			driver.findElement(By.xpath("//*[@text='By date']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Search For DCIM Folder 
			logger.info("Select DCIM Folder");
			System.out.println("Select DCIM Folder");
			driver.findElement(By.xpath("//*[@text='DCIM']")).click();
			TimeUnit.SECONDS.sleep(5);
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
			logger.info("Final Message: Pass Test0 pass for format with data scenario");
			System.out.println("Final Message: Pass Test0 pass for format with data scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));


		}
	}