package Xiaomi_Redmi_Note11T_5G;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 11T 5G");
		dc.setCapability(MobileCapabilityType.UDID, "DMV895J74LOFWGAM");
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
		//Command to Unlock mobile phone
		logger.info("Unlock Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch Home screen using package
		try {
			((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
			TimeUnit.SECONDS.sleep(5);
			//Handling  screen launch permissions
			try
			{
				driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Allowed appium permission access:");
				System.out.println("Allowed appium permission access:");
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("No permission access found");
				System.out.println("No permission access found");
			}
			// Click Recent Apps
			((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			TimeUnit.SECONDS.sleep(5);
			try
			{
				logger.info("Clearing Recent Apps");
				System.out.println("Clearing Recent Apps");
				//driver.findElement(By.xpath("//*[@resource-id='com.miui.home:id/clearAnimView']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Pass: Clearing Recent apps is successfull");
				System.out.println("Pass: Clearing Recent apps is successfull");
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("Pass: No recent pass found in background");
				System.out.println("Pass: No recent apps found in background");
			}
			//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Launch File manager
			logger.info("Launch file manager application for clearing phone internal memory");
			System.out.println("Launch file manager application for clearing phone internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
			TimeUnit.SECONDS.sleep(10);
			//If file manager permission request access accept allow permission
			try
			{
				driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/confirm_btn']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click Accept & continue");
				System.out.println("Click Accept & continue");
				driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Select Storage button
			logger.info("Select storage button");
			System.out.println("Select storage button");
			MobileElement StorageButton = driver.findElement(By.xpath("//*[@content-desc='Storage']"));
			//MobileElement StorageButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
			StorageButton.click();
			TimeUnit.SECONDS.sleep(5);
			try
			{
				driver.findElement(By.xpath("//*[@content-desc='List view']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Switching to  Internal storage
			MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']"));
			SwitchStorage.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Internal Storage Card
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage = driver.findElement(By.xpath("//*[@bounds='[0,589][1080,754]']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Long press and select and Android folder
			MobileElement Folder =	driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/file_image']"));
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@bounds='[864,96][1080,248]']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(6);
			//Swipe up and check for storage settings option
			MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Android\"))"));
			//Click select all button.
			logger.info("Click Android folder");
			System.out.println("Click Android Folder");
			MobileElement Android =	driver.findElement(By.xpath("//*[@text='Android']"));
			Android.click();
			TimeUnit.SECONDS.sleep(6);
			//select delete button
			logger.info("Click Delete");
			System.out.println("Click Delete");
			MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete']"));
			Delete.click();
			TimeUnit.SECONDS.sleep(3);
			//Allow delete
			MobileElement Delete1 =	driver.findElement(By.xpath("//*[@text='Delete']"));
			Delete1.click();
			logger.info("Pass: Clearing phone internal memory is successfull");
			System.out.println("Pass: Clearing phone internal memory is successfull");
			logger.info("===============================================================================================================================================");
			System.out.println("===============================================================================================================================================");
			//Calling Image() to capture rear camera image in USD card and Verifying it.
			logger.info("Calling Image() to capture rear image in uSD card and verifying the same.");
			System.out.println("Calling Image() to capture rear image in uSD card and verifying the same.");
			Images();
		}
		catch(Exception exp)
		{
			logger.info("Fail: Test0 fail for clear recent apps and clear internal memory "+exp);
			System.out.println("Fail: Test0 fail for clear recent apps and clear internal memory "+exp);
			logger.info("Final message: Fail Test0 fail for clear recent apps and clear internal memory "+exp);
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
		logger.info("Launching settings application, set uSD as Storage option for Image capture");
		System.out.println("Launching settings application, set uSD as Storage option for Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
		TimeUnit.SECONDS.sleep(6);
		//Select About phone
		logger.info("select about phone");
		driver.findElement(By.xpath("//*[@text='About phone']")).click();
		TimeUnit.SECONDS.sleep(3);
		//select storage
		logger.info("select storage option");
		System.out.println("select storage option");
		driver.findElement(By.xpath("//*[@text='Storage']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Swipe up and check for storage settings option
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
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
		logger.info("select Photo mode");
		System.out.println("select Photo mode");
		driver.findElement(By.xpath("//*[@text='Photo']")).click();
		TimeUnit.SECONDS.sleep(2);
		//Capture Images
		logger.info("Capturing  25 Images of Default Resolution");
		System.out.println("Capturing  25 Images of Default Resolution");
		for(int j = 0; j < 25; j++)
		{
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking Image of Default Resolutions"+j);
			logger.info("clicking Image of Default Resolutions"+j);
		}
		logger.info("25 Image Capture is successfull");
		System.out.println("25 Image Capture is successfull");
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		//Launch file manager application
		logger.info("Verifying Captured images");
		System.out.println("Verifying Captured images");
		((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
		TimeUnit.SECONDS.sleep(5);
		//If file manager permission request access accept allow permission
		try
		{
			driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/confirm_btn']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Click Accept & continue");
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();

		}
		//Select Storage button
		logger.info("Select storage button");
		System.out.println("Select storage button");
		MobileElement StorageButton = driver.findElement(By.xpath("//*[@content-desc='Storage']"));
		//MobileElement StorageButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
		StorageButton.click();
		TimeUnit.SECONDS.sleep(5);
		try
		{
			driver.findElement(By.xpath("//*[@content-desc='Grid view']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Switching to  SwitchStorage
		MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']"));
		SwitchStorage.click();
		TimeUnit.SECONDS.sleep(3);
		//Select External Storage Card
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		MobileElement ExternalStorage = driver.findElement(By.xpath("//*[@bounds='[14,787][224,869]']"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//click on DCIM folder
		logger.info("Click on DCIM Folder");
		System.out.println("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		logger.info("Click On Camera Folder");
		System.out.println("Click On Camera Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Long press and hold on any file
		logger.info("Long pres and hold on any file");
		System.out.println("Long pres and hold on any file");
		MobileElement Folder =	driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/file_name']"));
		TouchAction touchAction3=new TouchAction(driver);
		touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		//Click Select all option
		logger.info("Click select all option");
		System.out.println("Click select all option");
		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@bounds='[864,96][1080,248]']"));
		SelectAll.click();
		TimeUnit.SECONDS.sleep(6);
		try {
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@text='Selected 26 items']")).click();
			logger.info("Pass: Total Number Of Image captured 25 is successfull");
			System.out.println("Pass: Total Number Of Image captured 25 is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling video() for rear video recording in USD card and verifying data capture.
			logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
			System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
			Video();
		}
		catch (Exception e) {
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(2);
	}
	//Launch Phone Camera App, set SD card as Storage, Record videos of 2 resolutions
	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch Settings application
		logger.info("Launching settings application, set uSD as Storage option for Video recording");
		System.out.println("Launching settings application, set uSD as Storage option for Video recording");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
		TimeUnit.SECONDS.sleep(6);
		//Select About phone
		logger.info("select about phone");
		System.out.println("select about phone");
		driver.findElement(By.xpath("//*[@text='About phone']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select storage
		logger.info("Select storage");
		System.out.println("Select storage");
		driver.findElement(By.xpath("//*[@text='Storage']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Swipe up and check for storage settings
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
		//select storage settings
		logger.info("storage settings");
		System.out.println("storage settings");
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
		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Click on Video Resolution
		logger.info("Select Video resolution: HD 720p, 30fps");
		System.out.println("Select Video resolution: HD 720p, 30fps");
		driver.findElement(By.xpath("//*[@bounds='[102,162][378,255]']")).click();
		TimeUnit.SECONDS.sleep(3);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		//Start Recording
		logger.info("Click Start video recording for: 1minute video duration");
		System.out.println("Click Start video recording for: 1minute video duration");
		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']"));
		StartRecording.click();
		TimeUnit.SECONDS.sleep(120);
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording = driver.findElement(By.xpath("//*[@bounds='[412,1912][668,2168]']"));
		StopRecording.click();
		TimeUnit.SECONDS.sleep(5);
		//click Back to settings option to select second highest resolution.
		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Click on Video Resolution FHD 1080 fps
		logger.info("Select second highest resolution: FHD 1080p, 30fps");
		System.out.println("Select second highest resolution: FHD 1080p, 30fps");
		driver.findElement(By.xpath("//*[@bounds='[402,162][678,255]']")).click();
		TimeUnit.SECONDS.sleep(3);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		//Start Recording
		logger.info("Click Start video recording for: 1minute video duration");
		System.out.println("Click Start video recording for: 1minute video duration");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(120);
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording2 = driver.findElement(By.xpath("//*[@bounds='[412,1912][668,2168]']"));
		StopRecording2.click();
		TimeUnit.SECONDS.sleep(3);
		//launch file manager application
		logger.info("Verifying recorded video from file manager");
		System.out.println("Verifying recorded video from file manager");
		((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
		TimeUnit.SECONDS.sleep(5);
		//If file manager permission request access exists accept allow permission
		try
		{	//Select Accept and continue
			logger.info("Click Accept & continue");
			driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/confirm_btn']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Click Allow
			logger.info("click allow");
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Select Storage button
		logger.info("Select storage button");
		System.out.println("Select storage button");
		MobileElement StorageButton = driver.findElement(By.xpath("//*[@content-desc='Storage']"));
		//MobileElement StorageButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
		StorageButton.click();
		TimeUnit.SECONDS.sleep(5);
		try
		{
			driver.findElement(By.xpath("//*[@content-desc='Grid view']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Switching to  SwitchStorage
		logger.info("Select SwitchStorage");
		System.out.println("Select SwitchStorage");
		MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']"));
		SwitchStorage.click();
		TimeUnit.SECONDS.sleep(3);
		//Select External Storage Card
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		MobileElement ExternalStorage = driver.findElement(By.xpath("//*[@bounds='[14,787][224,869]']"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on DCIM Folder
		logger.info("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		logger.info("Click On Camera Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		//long press and hold, select any file and click select all option
		MobileElement Folder =	driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/file_name']"));
		TouchAction touchAction3=new TouchAction(driver);
		touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		//Click Select all option
		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@bounds='[864,96][1080,248]']"));
		SelectAll.click();
		TimeUnit.SECONDS.sleep(6);
		try {
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@text='Selected 28 items']")).click();
			logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
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
		logger.info("Launch settings application to format USD card with data");
		System.out.println("Launch settings application to format USD card with data");
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
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
		//Select Format USD Card
		logger.info("Select Format USD Card");
		System.out.println("Select Format USD Card");
		driver.findElement(By.xpath("//*[@text='Format SD card']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select Format Pop-up
		logger.info("click Format USD Card");
		System.out.println("click Format USD Card");
		driver.findElement(By.xpath("//*[@text='Format SD card']")).click();
		TimeUnit.SECONDS.sleep(30);
		//Select Done
		logger.info("Select Done");
		System.out.println("Select Done");
		driver.findElement(By.xpath("//*[@text='DONE']")).click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Format USD Card with data is succesfull");
		System.out.println("Format USD Card with data is succesfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		//Launch File Manager and verify data format is successfull
		logger.info("Lauching file manager application for Verfiying data format is successfull or not");
		System.out.println("Lauching file manager application for Verfiying data format is successfull or not");
		((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
		TimeUnit.SECONDS.sleep(5);
		//If file manager permission request access accept allow permission
		try
		{
			driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/confirm_btn']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Click Accept & continue");
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Select Storage button
		logger.info("Select storage button");
		System.out.println("Select storage button");
		MobileElement StorageButton = driver.findElement(By.xpath("//*[@content-desc='Storage']"));
		//MobileElement StorageButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
		StorageButton.click();
		TimeUnit.SECONDS.sleep(5);
		try
		{
			driver.findElement(By.xpath("//*[@content-desc='Grid view']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Switching to  SwitchStorage
		logger.info("Select SwitchStorage");
		System.out.println("Select SwitchStorage");
		MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']"));
		SwitchStorage.click();
		TimeUnit.SECONDS.sleep(3);
		//Select External Storage Card
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		MobileElement ExternalStorage = driver.findElement(By.xpath("//*[@bounds='[14,787][224,869]']"));
		ExternalStorage.click();
		TimeUnit.SECONDS.sleep(5);
		//Select DCIM Folder
		logger.info("Click on DCIM Folder");
		System.out.println("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		try {
			//Select Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Fail: Images and videos are present in the Camera folder");
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
			logger.info("Final Message: Pass Test0 pass for format Operation");
			System.out.println("Final Message: Pass Test0 pass for format Operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	}
}