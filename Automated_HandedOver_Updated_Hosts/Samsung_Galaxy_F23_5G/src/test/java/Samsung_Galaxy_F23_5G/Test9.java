package Samsung_Galaxy_F23_5G;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test9
{
	// initializing the driver instance and declarind desired capabilities
	private static final String Pass = null;
	AppiumDriver<MobileElement> driver;
	private String Result;
	private boolean isPaused;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy F23 5G");
		dc.setCapability(MobileCapabilityType.UDID, "RZCT303YGNE");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void RearPictureCapture() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test9.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9 Scenario is follows:");
		logger.info("1.Launch camera application, set uSD as a Storage option, start rear camera Image capture for all host resolutions");
		logger.info("2.Move Captured Rear camera images to Test9 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9 Scenario is follows:");
		System.out.println("1.Launch camera application, set USD as a Storage option, start rear camera Image capture for all host resolutions");
		System.out.println("2.Move Captured Rear camera images to Test9 folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		int TotalCount = 0; // initialize sum
		int i;
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
		//clear recent apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
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
		try {
			//Launch Camera application for rear Picture capture for all host resolution
			logger.info("Launch Camera application for rear Picture capture for all host resolution");
			System.out.println("Launch Camera application for rear Picture capture for all host resolution");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
			//If Change to SD Card notification pop-up exists select Cancel Option
			logger.info("If change to uSD card pop-up exists select Cancel");
			System.out.println("If change to uSD card pop-up exists select Cancel");
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
				TimeUnit.SECONDS.sleep(2);
			}
			catch(Exception exp)
			{
				// Block of code to handle errors
				logger.info("change to SD card element not found : "+exp);
				System.out.println("change to SD card element not found : "+exp);
			}
			//If Location access Permission appears Click Cancel Option
			logger.info("If Location access Permission Request Pop Exists Click on Cancel. ");
			System.out.println("If Location access Permission Request Pop Exists Click on Cancel. ");
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
				TimeUnit.SECONDS.sleep(2);
			}
			catch(Exception exp)
			{
				// Block of code to handle errors
				logger.info("Location access pop-up  not found : "+exp);
				System.out.println("Location access pop-up  not found : "+exp);
			}
			//Switch to rear camera mode if the current existing is front camera mode
			try {
				logger.info("Switch To Rear Camera mode if current Exiting camera is Front camera mode");
				System.out.println("Switch To Rear Camera mode if current Exiting camera is Front camera mode");
				MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Switch to rear camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();
			}
			catch(Exception exp)
			{
				// Block of code to handle errors
				logger.info("Current Existing Camera is Rear Camera mode.");
				System.out.println("Current Existing Camera is Rear Camera mode.");
			}
			//mention default resolution
			logger.info("Test9_Bcam_res: 5 resolutions supported");
			System.out.println("Test9_Bcam_res: 5 resolutions supported");
			//Click settings options
			logger.info("Click Settings option");
			System.out.println("Click Settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@text='Go to Settings']"));
			TimeUnit.SECONDS.sleep(5);
			Settings.click();
			//Swipe Up and select storage option
			logger.info("Search for Storage location");
			System.out.println("Search for Storage location");
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

			//1st resolution
			try {
				//Click On Rear Image Resolution to select first resolution
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage = driver.findElement(By.xpath("//*[@text='Ratio']"));
				RearImage.click();
			}
			catch (Exception e) {
				//Click On Rear Image Resolution to select first resolution
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage0 = driver.findElement(By.xpath("//*[@content-desc='Ratio, New content available']"));
				RearImage0.click();
			}
			//Select 1st resolution
			logger.info("Select first Image Resoution: 3:4 64MP");
			System.out.println("Select first Image Resoution: 3:4 64MP");
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[132,121][252,241]']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear = prop.getProperty("totalPictureCountRear");
			System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
			int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j=0;
			for(j = 0; j < totalPictureCountRearInt; j++)
			{
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking First   Resolution Image: "+j);
				logger.info("clicking First  Resolution Image: "+j);
			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera first resolution:" + j + " images Captured succesfull");
			System.out.println("Back camera first resolution:" + j + " images Captured succesfull" );

			//2nd resolution
			//Click On Rear Image Resolution to select 2nd resolution
			try {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage1 = driver.findElement(By.xpath("//*[@text='Ratio']"));
				RearImage1.click();
			}
			catch (Exception e) {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage2 = driver.findElement(By.xpath("//*[@content-desc='Ratio, New content available']"));
				RearImage2.click();
			}
			//Select second resolution
			logger.info("Select second Image Resoution: 3:4 ");
			System.out.println("Select Second Image Resoution: 3:4 ");
			MobileElement SecRes = driver.findElement(By.xpath("//*[@bounds='[306,121][426,241]']"));
			SecRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");
			System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1);
			int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear1);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountRear1Int; j1++)
			{
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking Second   Resolution Image: "+j1);
				logger.info("clicking Second  Resolution Image: "+j1);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("Back camera second resolution:" + j1 + " images Captured succesfull" );

			//3rd resolution
			//Click On Rear Image Resolution to select 3rd resolution
			try {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage3 = driver.findElement(By.xpath("//*[@text='Ratio']"));
				RearImage3.click();
			}
			catch (Exception e) {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage4 = driver.findElement(By.xpath("//*[@content-desc='Ratio, New content available']"));
				RearImage4.click();
			}
			logger.info("Select third Image Resoution: 9:16");
			System.out.println("Select third Image Resoution: 9:16");
			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@bounds='[480,121][600,241]']"));
			ThirdRes.click();
			TimeUnit.SECONDS.sleep(6);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");
			System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2);
			int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountRear2Int; j2++)
			{
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Third   Resolution Image: "+j2);
				logger.info("clicking third  Resolution Image: "+j2);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("Back camera third resolution:" + j2 + " images Captured succesfull" );

			//4th resolution
			//Click On Rear Image Resolution to select 4th resolution
			try {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage5 = driver.findElement(By.xpath("//*[@text='Ratio']"));
				RearImage5.click();
			}
			catch (Exception e) {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage6 = driver.findElement(By.xpath("//*[@content-desc='Ratio, New content available']"));
				RearImage6.click();
			}
			logger.info("Select Fourth Image Resoution: 1:1");
			System.out.println("Select Fourth Image Resoution: 1:1");
			MobileElement FourthRes = driver.findElement(By.xpath("//*[@bounds='[654,121][774,241]']"));
			FourthRes.click();
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear3 = prop.getProperty("totalPictureCountRear3");
			System.out.println("totalPictureCountRear3 = "+ totalPictureCountRear3);
			int totalPictureCountRear3Int=Integer.parseInt(totalPictureCountRear3);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountRear3Int; j3++)
			{
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking Fourth   Resolution Image: "+j3);
				logger.info("clicking Fourth  Resolution Image: "+j3);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera fourth resolution:" + j3 + " images Captured succesfull" );
			logger.info("Back camera fourth resolution:" + j3 + " images Captured succesfull" );

			//5th resolution
			//Click On Rear Image Resolution to select 5th resolution
			try {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage7= driver.findElement(By.xpath("//*[@text='Ratio']"));
				RearImage7.click();
			}
			catch (Exception e) {
				logger.info("Select Rear Image Size");
				System.out.println("Select Rear Image Size");
				MobileElement RearImage8 = driver.findElement(By.xpath("//*[@content-desc='Ratio, New content available']"));
				RearImage8.click();
			}
			//Select fifth resolution
			logger.info("Select fifth Resolution: Full");
			System.out.println("Select fifth Resolution: Full");
			MobileElement FifthRes = driver.findElement(By.xpath("//*[@bounds='[828,121][948,241]']"));
			FifthRes.click();
			TimeUnit.SECONDS.sleep(2);

			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear4 = prop.getProperty("totalPictureCountRear4");
			System.out.println("totalPictureCountRear4 = "+ totalPictureCountRear4);
			int totalPictureCountRear4Int=Integer.parseInt(totalPictureCountRear4);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j4=0;
			for(j4 = 0; j4 < totalPictureCountRear4Int; j4++)
			{
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking Fifth   Resolution Image: "+j4);
				logger.info("clicking Fifth  Resolution Image: "+j4);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera fifth resolution:" + j4 + " images Captured succesfull" );
			logger.info("Back camera fifth resolution:" + j4 + " images Captured succesfull" );
			//Sum total of User provided images resolution count
			TotalCount += j+j1+j2+j3+j4;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Launch file manager application and verify image capture in uSD card.
			Result= "Pass";
			logger.info("Launch file manager application and verify recorded video present  in uSD Card");
			System.out.println("Launch file manager application and verify recorded video present in uSD Card");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element4 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement SDCard1 =	driver.findElement(By.xpath("//*[@text='SD card']"));
			SDCard1.click();
			TimeUnit.SECONDS.sleep(6);
			//Swipe and Select external storage
			logger.info("Swipe up to select DCIM folder");
			System.out.println("Swipe up to select DCIM folder");
			MobileElement element5 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
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
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.myfiles:id/actionbar_select_count']"));
			TotalImage.click();
			System.out.print("Test9_Bcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3);
			String str= TotalImage.getText();
			//System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop5 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);
			double TolerancePercentage = (Tolerance_LevelInt/100)*TotalCount;
			//System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>=TolerancePercentage*TotalCount)
			{
				logger.info("Pass: Test9 pass for rear Image capture");
				System.out.println("\nPass: Test9 pass for rear Image capture");
				System.out.println("Test9 Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9 Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				//calling DataMoveOperation()
			}
			else {
				logger.info("Fail: Test9 Fail for rear camera Image capture");
				System.out.println("\nFail: Test9 Fail for rear camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9 Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9 Fail for Data Move Operation");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			else {
				Result= "Pass";
				logger.info("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				System.out.println("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch (Exception e) {
			logger.info("Fail: Test9 fail for Fail Count Issue");
			System.out.println("\nFail: Test9 fail for Fail Count Issue");
			logger.info("Fail: Test9 fail for rear Image capture");
			System.out.println("\nFail: Test9 fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			System.out.println("Final message: Fail Test9 for rear camera image capture");
			logger.info("Final message: Fail Test9 for rear camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException{
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		isPaused = true;
		//Launching  home screen
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test9 folder and cut paste all videos in Test9 folder
			logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test9 and cut paste all videos in Test9 folder");
			System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test9 folder and cut paste all videos in Test9 folder");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			MobileElement element2 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
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
			//Click  Move to Option
			logger.info("Select move to option");
			System.out.println("select move to option");
			MobileElement moveto =	driver.findElement(By.xpath("//*[@text='Move']"));
			moveto.click();
			TimeUnit.SECONDS.sleep(6);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Click  Move to Option
			logger.info("Select uSD Card");
			System.out.println("select uSD Card");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
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
			//Click Create option
			logger.info("create folder");
			System.out.println("create folder");
			driver.findElement(By.xpath("//*[@text='Create folder']")).click();
			TimeUnit.SECONDS.sleep(2);
			//name the folder
			logger.info("Name folder as Test9");
			System.out.println("Name folder as Test9");
			driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).clear();
			driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).sendKeys("Test9");
			TimeUnit.SECONDS.sleep(5);
			//Click Create option
			logger.info("click create");
			System.out.println("click create");
			driver.findElement(By.xpath("//*[@text='Create']")).click();
			TimeUnit.SECONDS.sleep(2);
			//Select DCIM Folder
			MobileElement element3 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Test9\"))"));
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement Test9 =	driver.findElement(By.xpath("//*[@text='Test9']"));
			Test9.click();
			TimeUnit.SECONDS.sleep(3);
			//Click Create option
			logger.info("Move here");
			System.out.println("Move here");
			driver.findElement(By.xpath("//*[@text='Move here']")).click();
			TimeUnit.SECONDS.sleep(180);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			Result = "Pass";
			if(Result == "Pass")
			{
				logger.info("Pass: Test9 Pass for data move operation successfully");
				System.out.println("Pass: Test9 Pass for data move operation successfully");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9 Fail for data move operation ");
			System.out.println("Fail: Test9 Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}
