package Nokia_X100_TA1399;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia X100");
		dc.setCapability(MobileCapabilityType.UDID, "ADDMAUH003MA2203219");
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
		
		//Unlock phone
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");

		try {
			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
			TimeUnit.SECONDS.sleep(5);
			//Launch file manager application to and clear phone internal memory
			logger.info("Launch file manager application and clear phone internal memory");
			System.out.println("Launch file manager application and clear phone internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//if launch file manager permission request pop-up exists accept permission
			try
			{
				driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
				TimeUnit.SECONDS.sleep(5);
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			//select browse option
			logger.info("Select browse option");
			System.out.println("Select browse option");
			driver.findElement(By.xpath("//*[@text='Browse']")).click();
			TimeUnit.SECONDS.sleep(3);
			//swipe up
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select Internal Storage	
			logger.info("Select internal storage");
			System.out.println("Select internal storage");
			MobileElement InternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
			TimeUnit.SECONDS.sleep(5);

			InternalStorage.click();

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
				TimeUnit.SECONDS.sleep(120);
			}
			catch (Exception e) {
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
				TimeUnit.SECONDS.sleep(120);
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


		//launch camera application
		try {
			System.out.println("Launch camera application for rear camera picture capture");
			logger.info("Launch camera application for rear camera picture capture");
			((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.GuideActivity"));
			TimeUnit.SECONDS.sleep(3);
			//If location location permission request pop-up exists? select deny option
			System.out.println("If location location permission request pop-up exists? select deny option");
			logger.info("If location location permission request pop-up exists? select deny option");
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
			
			}
			
			TimeUnit.SECONDS.sleep(2);
			try {
				//Click Ok option
				driver.findElement(By.xpath("//*[@text='OK']")).click();
				TimeUnit.SECONDS.sleep(3);

			} 
			catch(Exception exp)
			{ 
				
			}
			TimeUnit.SECONDS.sleep(2);
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
				TimeUnit.SECONDS.sleep(3);

				//Click Ok option
				driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
				TimeUnit.SECONDS.sleep(3);

				//driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
				//TimeUnit.SECONDS.sleep(3);


			} 
			catch(Exception exp)
			{ 
				logger.info("No location access permission pop-up found : "+exp); 
				System.out.println("No location access permission pop-up found : "+exp); 
			}
			//Switch to photo mode 
			//System.out.println("Switch to photo mode");
			//logger.info("Switch to photo mode");
			//driver.findElement(By.xpath("//*[@text='Photo']")).click();
			//TimeUnit.SECONDS.sleep(3);

			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Storage Path
			logger.info("select data storage option");
			System.out.println("select data storage option");
			driver.findElement(By.xpath("//*[@text='Data storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select uSD Card as Storage option
			logger.info("select uSD card as storage option");
			System.out.println("select uSD card as storage option");
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.hmdglobal.app.camera:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("Capturing default resolution image "+j);
				logger.info("Capturing default resolution image "+j);
			}
			logger.info("25 Images captured successfully");
			System.out.println("25 Images captured successfully");
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));


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

	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.info("Unlocking Phone");


		//launch camera application
		try {
			System.out.println("Launch camera application for rear camera picture capture");
			logger.info("Launch camera application for rear camera picture capture");
			((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.GuideActivity"));
			TimeUnit.SECONDS.sleep(3);
			//If location location permission request pop-up exists? select deny option
			System.out.println("If location location permission request pop-up exists? select deny option");
			logger.info("If location location permission request pop-up exists? select deny option");
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
				TimeUnit.SECONDS.sleep(3);

				//Click Ok option
				driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
				TimeUnit.SECONDS.sleep(3);

			} 
			catch(Exception exp)
			{ 
				logger.info("No location access permission pop-up found : "+exp); 
				System.out.println("No location access permission pop-up found : "+exp); 
			}
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
			
			}
			
			TimeUnit.SECONDS.sleep(2);
			try {
				//Click Ok option
				driver.findElement(By.xpath("//*[@text='OK']")).click();
				TimeUnit.SECONDS.sleep(3);

			} 
			catch(Exception exp)
			{ 
				
			}
			TimeUnit.SECONDS.sleep(2);
			
			//Switch to Video Tab
			System.out.println("Switch to video mode");
			logger.info("Switch to video mode");
			driver.findElement(By.xpath("//*[@content-desc='Video']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Storage Path
			logger.info("select data storage option");
			System.out.println("select data storage option");
			driver.findElement(By.xpath("//*[@text='Data storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select uSD Card as Storage option
			logger.info("select uSD card as storage option");
			System.out.println("select uSD card as storage option");
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);


			//click Back to settings option
			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Swipe and Search for Video resolution
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video Resolutions\"))"));

			//Click on Video Resolution
			logger.info("select video resolution option");
			System.out.println("select video resolution option");
			driver.findElement(By.xpath("//*[@text='Video Resolutions']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video from rear camera
			logger.info("select Video from rear camera option");
			System.out.println("select Video from rear camera option");
			driver.findElement(By.xpath("//*[@text='Video from rear camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution 
			logger.info("select first highest rear camera video resolution: FHD 1080P/60fps");
			System.out.println("select first highest rear camera video resolution: FHD 1080P/60fps");
			driver.findElement(By.xpath("//*[@text='FHD 1080P/60fps']")).click();
			TimeUnit.SECONDS.sleep(3);

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Start Recording
			logger.info("Start recording");
			System.out.println("Start recording");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(180);
			//Stop Recording
			logger.info("Stop recodring");
			System.out.println("Stop recording");
			driver.findElement(By.xpath("//*[@content-desc='Shutter']")).click();


			//click Back to settings option
			logger.info("select settings option");
			System.out.println("select settings option");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Swipe and Search for Video resolution
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video Resolutions\"))"));

			//Click on Video Resolution
			logger.info("select video resolution option");
			System.out.println("select video resolution option");
			driver.findElement(By.xpath("//*[@text='Video Resolutions']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Video from rear camera
			logger.info("select Video from rear camera option");
			System.out.println("select Video from rear camera option");
			driver.findElement(By.xpath("//*[@text='Video from rear camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution 
			logger.info("select second highest rear camera video resolution:FHD 1080P/30fps");
			System.out.println("select second highest rear camera video resolution: FHD 1080P/30fps");
			driver.findElement(By.xpath("//*[@text='FHD 1080P/30fps']")).click();
			TimeUnit.SECONDS.sleep(3);

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Start Recording
			logger.info("Start recording");
			System.out.println("Start recording");
			driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(180);
			//Stop Recording
			logger.info("Stop recodring");
			System.out.println("Stop recording");
			driver.findElement(By.xpath("//*[@content-desc='Shutter']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Verifying Captured Videos
			//Launch File Manager application to verify captured video
			logger.info("Launch File Manager Application to verify captured videos");
			System.out.println("Launch File Manager Application to verify captured videos");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Scroll up and select uSD Card
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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

		//Launch settings application to Format uSD card
		logger.info("Launch settings application to Format uSD card");
		System.out.println("Launch settings application to Format uSD card");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe Up and Search for Storage");
			System.out.println("Swipe Up and Search for Storage");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			System.out.println("select storage");
			logger.info("Select storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select uSD Card
			logger.info("Select uSD card");
			System.out.println("Select uSD card");
			driver.findElement(By.xpath("//*[@bounds='[180,987][317,1041]']")).click();
			TimeUnit.SECONDS.sleep(5);

			//Click on More Options
			logger.info("Select more option");
			System.out.println("select more option");
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			moreOptions.click();


			//Select Storage settings
			logger.info("Select storage settings");
			System.out.println("Select storage settings");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
			TimeUnit.SECONDS.sleep(5);
			// Select Format option
			logger.info("Select Format option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);

			// Accept format uSD Card option
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(90);
			logger.info("Accept to Format uSD Card");
			logger.info("Started formatting, waiting till it gets formatted");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);


			//Launch File Manager
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
			//logger.info("Select DCIM Folder");
			//System.out.println("Select DCIM Folder");
			//driver.findElement(By.xpath("//*[@text='DCIM']")).click();
			//TimeUnit.SECONDS.sleep(5);

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


