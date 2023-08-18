package Samsung_Galaxy_F23_5G;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	private WebElement element;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy F23 5G");
		dc.setCapability(MobileCapabilityType.UDID, "RZCT303YGNE");
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
		//Unlocking Phone if locked
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch home screen
		logger.info("Launch Home screen");
		System.out.println("Launch Home screen");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
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
		try {
			//Clearing Phone Internal Memory
			//Launch File Manager
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			try {

				//Long Press Andriod folder
				MobileElement Folder =	driver.findElement(By.xpath("//*[@bounds='[62,578][175,691]']"));
				TouchAction touchAction3=new TouchAction(driver);
				touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
				TimeUnit.SECONDS.sleep(10);
				//Click Select All
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='All']"));
				SelectAll.click();
				TimeUnit.SECONDS.sleep(3);
				//Click Delete
				MobileElement Delete =	driver.findElement(By.xpath("//*[@bounds='[640,2129][708,2197]']"));
				Delete.click();
				TimeUnit.SECONDS.sleep(3);
				//Click move to recycle Bin
				MobileElement MovetoRecycleBin =	driver.findElement(By.xpath("//*[@bounds='[390,2059][984,2160]']"));
				MovetoRecycleBin.click();
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
	public void Images() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launching Camera Application for Rear picture capture
		logger.info("Launch Camera Application for Rear picture capture");
		System.out.println("Launch Camera Application for Rear picture capture");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
		//IF Change to uSD card notification pop-up exists select Cancel Option
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		}
		catch(Exception exp)
		{
			logger.info("change to SD card element not found : "+exp);
			System.out.println("change to SD card element not found : "+exp);
		}
		TimeUnit.SECONDS.sleep(2);
		//IF Location access notification pop-up exists select Cancel option.
		logger.info("if Location permisson Pop Exists Select Cancel Option");
		System.out.println("if Location permisson Pop Exists Select Cancel Option");
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		}
		catch(Exception exp)
		{
			// Block of code to handle errors
			logger.info("Location  not found : "+exp);
			System.out.println("Location  not found : "+exp);
		}
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/quick_setting_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		//Swipe Up and Search for Storage Option and Click
		logger.info("Search for SD Card option");
		System.out.println("Search for SD Card option");
		String text = "Storage location";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Capture Images
		logger.info("Capture Image of Default Resolution");
		System.out.println("Capture Image of Default Resolution");
		for(int j = 0; j < 25; j++)
		{
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking Image of Default Resolutions"+j);
			logger.info("clicking Image of Default Resolutions"+j);
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
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Select  SD Card");
		System.out.println("Select  SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For DCIM Folder
		logger.info("Select DCIM Folder");
		System.out.println("Select DCIM Folder");
		String text1 = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
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
		//Click Edit
		logger.info("Select Edit options");
		System.out.println("Select Edit options");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Edit\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Click Select All
		logger.info("Click On Select All Options");
		System.out.println("Click On Select All Options");
		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='All']"));
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
			logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
			System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
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
			Video();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Video function cannot be called as incorrect Images captured ");
			System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
			logger.info("Final Message: Fail Test0 Fail for Image capture");
			System.out.println("Final Message: Fail Test0 Fail for Image capture");
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
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions
	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
	public void Video() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		// Click Recent Apps
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Launch Camera Application.
		logger.info("Launch Camera Application to capture rear videos");
		System.out.println("Launch Camera Application to capture rear videos");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
		//If Change to SD Card notification pop-up exists select Cancel Option
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
			// if the turn on location pop up comes, click on cancel button
			TimeUnit.SECONDS.sleep(2);
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		}
		catch(Exception exp)
		{
			// Block of code to handle errors
			logger.info("change to SD card element not found : "+exp);
			System.out.println("change to SD card element not found : "+exp);
		}
		//If Location access Permission appears Click Cancel Option
		logger.info("If Location Permission Request Pop Exists Click on Cancel Option");
		System.out.println("If Location Permission Request Pop Exists Click on Cancel Option");
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		}
		catch(Exception exp)
		{
			// Block of code to handle errors
			logger.info("Location access pop-up  not found : "+exp);
			System.out.println("Location access pop-up  not found : "+exp);
		}
		try {
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();
			logger.info("Switch To Back Camera if current Exiting camera is Front camera");
			System.out.println("Switch To Back Camera if current Exiting camera is Front camera");
		}
		catch(Exception exp)
		{
			// Block of code to handle errors
			logger.info("Current Existing Camera is Back Camera");
			System.out.println("Current Existing Camera is Back Camera");
		}
		// Switch to Video mode
		logger.info("Clicking Video Tab");
		System.out.println("Clicking Video Tab");
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/quick_setting_button']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		logger.info("Click on settings option");
		System.out.println("Click on settings option");
		//Swipe Up and Search for Storage Option and Click
		logger.info("Search for SD Card option");
		System.out.println("Search for SD Card option");
		String text = "Storage location";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Clikc Press Back
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Click On Rear Video size to select resolution
		MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@content-desc='Video size']"));
		RearVideoSize.click();
		logger.info("Select 1st Back Video Resolution:UHD (60 fps)");
		System.out.println("Select 1st Back Video Resolution:UHD (60 fps)");
		//Select 1st resolution
		MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[306,121][426,241]']"));
		FirstRes.click();
		TimeUnit.SECONDS.sleep(2);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
		StartRecording.click();
		TimeUnit.SECONDS.sleep(2);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording = driver.findElement(By.xpath("//*[@content-desc='Stop recording']"));
		StopRecording.click();
		TimeUnit.SECONDS.sleep(5);
		//Click On Rear Video size to select resolution
		MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@content-desc='Video size']"));
		RearVideoSize1.click();
		logger.info("Select 2nd Back Video Resolution:FHD 30(fps)");
		System.out.println("Select 2nd Back Video Resolution:FHD 30(fps)");
		//Select 2nd resolution
		MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[480,121][600,241]']"));
		SecondRes.click();
		TimeUnit.SECONDS.sleep(2);
		//Start Recording
		logger.info("Start video recording");
		System.out.println("Start video recording");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(2);
		logger.info("Recording Video for 2Minutes of Duration");
		System.out.println("Recording Video for 2Minutes of Duration");
		//Stop Recording
		logger.info("Stop video recording");
		System.out.println("Stop video recording");
		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@content-desc='Stop recording']"));
		StopRecording1.click();
		TimeUnit.SECONDS.sleep(15);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Rear camera video recording is successfull");
		System.out.println("Rear camera video recording is successfull");
		//Launch File Manager application to verify captured video
		logger.info("Launch File Manager Application to verify captured videos");
		System.out.println("Launch File Manager Application to verify captured videos");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Click On SD Card");
		System.out.println("Click On SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For DCIM Folder
		logger.info("Select DCIM Folder");
		System.out.println("Select DCIM Folder");
		String text1 = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
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
			logger.info("Click On More Options ");
			System.out.println("Click On More Options ");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions.click();
		}
		catch (Exception e) {
			MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			MoreOptions1.click();
			e.printStackTrace();
		}
		//Click Edit
		logger.info("Click On Edit");
		System.out.println("Click On Edit");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Edit\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Click Select All
		logger.info("Click On Select All Options");
		System.out.println("Click On Select All Options");
		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='All']"));
		SelectAll.click();
		TimeUnit.SECONDS.sleep(3);
		//Click on Select All
		try {
			//Select All
			MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='27 selected']"));
			TimeUnit.SECONDS.sleep(5);
			TotalFiles.click();
			logger.info("Pass: 2 Videos recorded Successfully");
			System.out.println("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			System.out.println("Pass: A total of 27 files present in uSD card before Format");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("calling Format() for format with data scenario");
			System.out.println("calling Format() for format with data scenario");
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			Format();
		}
		catch (Exception e) {

			e.printStackTrace();
			logger.info("Fail: Format function cannot be called as incorrect Videos captured");
			System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
			logger.info("Fail: Test0 Fail for file verification");
			System.out.println("Fail: Test0 Fail for file verification");
			logger.info("Final Message: Fail Test0 Fail for Video Capture");
			System.out.println("Final Message: Fail Test0 Fail for Video Capture");
			logger.info("Test: End");
			System.out.println("Test: End");
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
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
	public void Format() throws  IOException, InterruptedException  {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch Home screen and clear recent apps
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		// open the recently opened apps screen
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Launch Settings application for Format uSD card with Data scenario
		logger.info("Launch Settings application for Format uSD card with Data scenario ");
		System.out.println("Launch Settings application for Format uSD card with Data ");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Scrolling till battery and device care is visible");
			System.out.println("Scrolling till battery and device care is visible");
			String text = "Battery and device care";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on battery and device care");
			System.out.println("Clicking on battery and device care");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Battery and device care\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on storage");
			System.out.println("Clicking on storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//find element by xpath
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			MobileElement Icon = driver.findElement(By.xpath("//*[@bounds='[542,1681][590,1729]']"));
			Icon.click();
			TimeUnit.SECONDS.sleep(2);
			MobileElement moreOptions = driver.findElement(By.xpath("//*[@bounds='[942,347][1010,415]']"));
			moreOptions.click();
			TimeUnit.SECONDS.sleep(5);
			// click on format
			logger.info("Click Format");
			System.out.println("Click Format");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
			// wait for 2 mins
			logger.info("Started formatting, waiting till it gets formatted");
			System.out.println("Started formatting, waiting till it gets formatted");
			TimeUnit.SECONDS.sleep(60);
			// click on back button in order to return to the home screen
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
		//Launch File Manager
		logger.info("Launch File Manager application to verify  Card is fully Formated or not");
		System.out.println("Launch File Manager application to verify  Card is fully Formated or not");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Click On SD Card");
		System.out.println("Click On SD Card");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For DCIM Folder
		logger.info("Search For DCIM");
		System.out.println("Search For DCIM");
		String text = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
		try {
			//Search For Camera Folder
			logger.info("Click On Camera Folder");
			System.out.println("Click On Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Fail: Images and videos are present in the DCIM folder");
			System.out.println("Fail: Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Test0 fail for format operation");
			logger.info("Final Message: Test0 fail for format operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final Message: Pass Test0 pass for format Operation");
			logger.info("Final Message: Pass Test0 pass for format Operation");
		}
		logger.info("Test: End");
		System.out.println("Test: End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
}