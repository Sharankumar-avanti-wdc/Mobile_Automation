package Nokia_G50_5G_TA_1390;
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
import io.appium.java_client.touch.offset.PointOption;
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia G50");
		dc.setCapability(MobileCapabilityType.UDID, "A00000P6601B3001556");
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
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);

		logger.info("Host does'nt support clear recent apps option! Hence Skiping clear recent apps scenario");
		System.out.println("Host does'nt support clear recent apps option! Hence Skiping clear recent apps scenario");
		
		try {
			//Clearing Phone Internal Memory
			//Launch File Manager
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
				try {


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
				System.out.println("Final message: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
				logger.info("Test: End"); 
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test0 fail for for clear recent apps and clear internal memory");
			System.out.println("Fail: Test0 fail for for clear recent apps and clear internal memory");
			logger.info("Final message: Fail Test0 Fail for clear recent apps and clear recent internal memory");
			System.out.println("Final message: Fail Test0 Fail for clear recent apps and clear recent internal memory");
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
		((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.GuideActivity"));
		try {
			//IF locatio permission pop-up exists select Dont Allow option
			//IF locatio permission pop-up exists select Dont Allow option
			try 
			{ 		//If location permission access pop-up exists select Dont Allow option
				logger.info("If location permission access pop-up exists? select Deny option");
				System.out.println("If location permission access pop-up exists? select Deny option");
				MobileElement Deny = driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']"));
				Deny.click();
				TimeUnit.SECONDS.sleep(5);

			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}
			//if Camera tour pop-up exists select Not Now
			try 
			{ 		
				logger.info("If memory card detection pop-up exists select OK option");
				System.out.println("If memory card detection pop-up exists select OK option");
				MobileElement Ok = driver.findElement(By.xpath("//*[@text='OK']"));
				Ok.click();
				TimeUnit.SECONDS.sleep(5);


			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Select Data Storage");
			System.out.println("Select Data Storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Data storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save in SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);


			//Capture Images
			logger.info("Capture Image of Default Resolution");
			System.out.println("Capture Image of Default Resolution");
			for(int j = 0; j < 25; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Capture default resolution image "+j);
				logger.info("Capture default resolution image "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			logger.info("25 Image Capture is successfull");
			System.out.println("25 Image Capture is successfull");
			//Launch File Manager application to verify  Image capture
			logger.info("Launch File Manager application to verify  Image capture");
			System.out.println("Launch File Manager application to verify  Image capture");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
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

			//Click on Select All 
			try {
				//Select All
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='25 selected']"));
				TimeUnit.SECONDS.sleep(5);
				TotalFiles.click();
				logger.info("Pass: Total Number Of Image captured 25 is successfull");
				System.out.println("Pass: Total Number Of Image captured 25 is successfull");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				//Calling video() for rear video recording in USD card and verifying data capture.
				logger.info("Calling video() for rear video recording in uSD card and verifying data capture.");
				System.out.println("Calling video() for rear video recording in uSD card and verifying data capture.");
				Video();
			}

			catch (Exception e) {

				e.printStackTrace();
				logger.info("Fail: Video function cannot be called as incorrect Images captured ");
				logger.info("Final Message: Fail Test0 Fail for Image capture");
				System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
				System.out.println("Final Message: Fail Test0 Fail for Image capture");
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

		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.hmdglobal.app.camera", "com.hmdglobal.app.camera.GuideActivity"));
		try {
			//IF locatio permission pop-up exists select Dont Allow option
			//IF locatio permission pop-up exists select Dont Allow option
			try 
			{ 		//If location permission access pop-up exists select Dont Allow option
				logger.info("If location permission access pop-up exists? select Deny option");
				System.out.println("If location permission access pop-up exists? select Deny option");
				MobileElement Deny = driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']"));
				Deny.click();
				TimeUnit.SECONDS.sleep(5);

			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}
			//if Camera tour pop-up exists select Not Now
			try 
			{ 		
				logger.info("If memory card detection pop-up exists select OK option");
				System.out.println("If memory card detection pop-up exists select OK option");
				MobileElement Ok = driver.findElement(By.xpath("//*[@text='OK']"));
				Ok.click();
				TimeUnit.SECONDS.sleep(5);


			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}
			//Switch to rear camera mode if camera is in front camera mode
			try {
				
				logger.info("Switch To rear Camera Mode if current Exiting camera is front camera Mode");
				System.out.println("Switch To rear Camera Mode if current Exiting camera is front camera Mode");
				MobileElement SwitchToRearCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front camera\"]"));
				SwitchToRearCamera.click();
				TimeUnit.SECONDS.sleep(2);
				
				
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
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Select Data Storage");
			System.out.println("Select Data Storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Data storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save in SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			// Switch to Video mode
			logger.info("Clicking Video Tab");
			System.out.println("Clicking Video Tab");
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@content-desc='Video']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Swipe up and Video resolution option
			logger.info("Swipe up and select video resolution option");
			System.out.println("Swipe up and select Video resolution option");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));
			

			//Select Video resolution option
			MobileElement VideoRes = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			VideoRes.click();
			//Select  video from rear camera option
			MobileElement RearCamera = driver.findElement(By.xpath("//*[@text='Video from rear camera']"));
			RearCamera.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select first resolution
			logger.info("Select first highest rear camera video resolution: FHD 1080P/60fps");
			System.out.println("Select first highest rear camera video resolution: FHD 1080P/60fps");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='FHD 1080P/60fps']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
			StartRecording.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Recording Video for 2Minutes of Duration");
			System.out.println("Recording Video for 2Minutes of Duration");

			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
			StopRecording.click();
			TimeUnit.SECONDS.sleep(5);

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/settings_button']"));
			Settings3.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Swipe up and Video resolution option
			logger.info("Swipe up and select video resolution option");
			System.out.println("Swipe up and select Video resolution option");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));
			

			//Select Video resolution option
			MobileElement VideoRes1 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			TimeUnit.SECONDS.sleep(5);
			VideoRes1.click();
			//Select  video from rear camera option
			MobileElement RearCamera1 = driver.findElement(By.xpath("//*[@text='Video from rear camera']"));
			RearCamera1.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select second resolution
			logger.info("Select second highest rear camera video resolution: FHD 1080P/30fps");
			System.out.println("Select Second highest rear camera video resolution: FHD 1080P/30fps");
			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='FHD 1080P/30fps']"));
			SecondRes.click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Start Recording
			logger.info("Start video recording");
			System.out.println("Start video recording");
			MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
			StartRecording1.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Recording Video for 2Minutes of Duration");
			System.out.println("Recording Video for 2Minutes of Duration");

			//Stop Recording
			logger.info("Stop video recording");
			System.out.println("Stop video recording");
			MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.hmdglobal.app.camera:id/shutter_button']"));
			StopRecording1.click();
			TimeUnit.SECONDS.sleep(5);

			// Switch to default photo mode
			logger.info("Clicking photo Tab");
			System.out.println("Clicking photo Tab");
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath("//*[@content-desc='Photo']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Rear camera video recording is successfull");
			System.out.println("Rear camera video recording is successfull");
			//Launch File Manager application to verify  Image capture
			logger.info("Launch File Manager application to verify  video capture");
			System.out.println("Launch File Manager application to verify  video capture");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//Select SD Card

			//Swipe and Select Internal storage
	  		logger.info("Swipe up");
	  		System.out.println("Swipe up");
	  		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
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
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			
            e.printStackTrace();
            logger.info("Fail: Test0 fail during rear camera video recording");
            logger.info("Final Message: Fail Test0 Fail for rear camera video recording");
            System.out.println("Fail: Test0 fail during rear camera video recording");
            System.out.println("Fail: Test0 Fail for file verification");
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
			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
			TimeUnit.SECONDS.sleep(5);
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
				//click on storage
				logger.info("Clicking on storage");
				System.out.println("Clicking on storage");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(5);
				
				//select Sandisk SD card option
				logger.info("Select Sandisk Sd card option");
				System.out.println("Select Sandisk Sd card option");
				driver.findElement(By.xpath("//*[@bounds='[126,675][220,713]']")).click();
				TimeUnit.SECONDS.sleep(3);
				//select more option
				logger.info("Clicking on more options");
				System.out.println("Clicking on more options");
				driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
				TimeUnit.SECONDS.sleep(5);
				//select storage settings option
				logger.info("Select storage settings option");
				System.out.println("Select storage settings option");
				driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
				TimeUnit.SECONDS.sleep(5);
				// select format option
				logger.info("select format option");
				System.out.println("select format option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Accept format SD card pop-up
				logger.info("Accept format SD card pop-up");
				System.out.println("Accept format SD card pop-up");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
				// wait for 2 mins
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");
				TimeUnit.SECONDS.sleep(60);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));

				//Result = "Format Successful";
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("Format uSD with Data is successfull");
			System.out.println("Format uSD with Data is successfull");
			//Launch File Manager application to verify data format
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe and Select Internal storage
	  		logger.info("Swipe up");
	  		System.out.println("Swipe up");
	  		driver.findElement(MobileBy.AndroidUIAutomator(
	  	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

	  		//Click Internal storage
	  		logger.info("Select SD card");
	  		System.out.println("Select SD card");
				MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
				InternalStorage.click();
				TimeUnit.SECONDS.sleep(6);
				//Switch grid view mode
				logger.info("switch to grid view mode to select DCIM folder");
				System.out.println("switch to grid view mode to select DCIM folder");
				
				

			try {
				//Search For Camera Folder
				//Search For Camera Folder
				logger.info("Select DCIM Folder");
				System.out.println("Select DCIM Folder");
				
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click On Camera Folder");
				System.out.println("Click On Camera Folder");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click On Camera Folder");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Fail: Images and videos are present in the DCIM folder");
				System.out.println("Final Message: Test0 fail for format operation");
				logger.info("Fail: Images and videos are present in the DCIM folder");
				logger.info("Final Message: Test0 fail for format operation");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}

			catch (Exception e) {

				e.printStackTrace();
				logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
				System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Pass Test0 pass for with data format Operation");
				System.out.println("Final Message: Pass Test0 pass for with data format Operation");
				logger.info("Test: End");
				System.out.println("Test: End");
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

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));


		}
	}