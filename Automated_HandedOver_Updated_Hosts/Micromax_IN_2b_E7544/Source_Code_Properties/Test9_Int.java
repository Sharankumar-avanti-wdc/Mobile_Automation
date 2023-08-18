package Micromax_IN_2b_E7544;

import org.testng.annotations.Test;
import Micromax_IN_2b_E7544.Test9;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
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
import io.appium.java_client.touch.offset.PointOption;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.sound.midi.SysexMessage;

public class Test9_Int
{
	private static final String Pass = null;
	// initializing the driver instance and declarind desired capabilities
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "IN_2b");
		dc.setCapability(MobileCapabilityType.UDID, "BS7544S4MN1021000850");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void RearPictureCapture() throws InterruptedException, SecurityException, IOException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test9_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9_Int Scenario is follows:");
		logger.info("1.Launch camera application, set Internal storage as a Storage option, start rear camera Image capture for all host resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9_Int Scenario is follows:");
		System.out.println("Launch camera application, set Internal storage as a Storage option, start rear camera Image capture for all host resolutions");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		// initialize sum
		int TotalCount = 0; 
		int i;
		//Launch Home Screen and Clear recent apps
		logger.info("Launch Home Screen and Clear recent");
		System.out.println("Launch Home Screen and Clear recent");
		//unlock phone if phone is lock
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(3);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"CLEAR ALL\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test9_Int Pass for clearing Recent apps ");
			System.out.println("Pass: Test9_Int Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		try {
			//Launch Camera application for rear Picture capture for all host resolution
			logger.info("Launch Camera application for rear Picture capture for all host resolution");
			System.out.println("Launch Camera application for rear Picture capture for all host resolution");
			((StartsActivity) driver).startActivity(new Activity(" com.android.camera2", "com.android.camera.CameraActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select camera permissions");
			System.out.println("Select camera permissions");

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
			//backcamera 4 image resolutions supports
			logger.info("Test9_Int_Bcam_res: 4 resolutions supported");
			System.out.println("Test9_Int_Bcam_res: 4 resolutions supported");
			//click on camera resolutions
			logger.info("Select settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,80][720,128]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select  picture size");
			System.out.println("Select  picture size");
			MobileElement picturesize = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
			picturesize.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select first Image Resoution: (4:3) 13.0 MP");
			System.out.println("Select first Image Resoution: (4:3) 13.0 MP ");
			driver.findElement(By.xpath("//*[@text='(4:3) 13.0 MP']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int = prop.getProperty("totalPictureCountRear_Int");  
			System.out.println("totalPictureCountRear_Int = "+ totalPictureCountRear_Int);
			int totalPictureCountRear_IntInt=Integer.parseInt(totalPictureCountRear_Int);
			// capture  pics for the selected resolution
			int j=0;
			for( j = 0; j < totalPictureCountRear_IntInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 1st Resolutions (4:3) 13.0 MP: "+j);
				logger.info("clicking Image of 1st Resolutions (4:3) 13.0 MP: "+j);

			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Back camera first resolution:" + j + " images Captured succesfull");
			System.out.println("Back camera first resolution:" + j + " images Captured succesfull" );
			//Select 2nd resolution
			//click on camera resolutions
			logger.info("Select settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,80][720,128]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select  picture size");
			System.out.println("Select  picture size");
			MobileElement picturesize1 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
			picturesize1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 2nd Image Resoution: (16:9) 9.7 MP ");
			System.out.println("Select 2nd Image Resoution: (16:9) 9.7 MP ");
			driver.findElement(By.xpath("//*[@text='(16:9) 9.7 MP']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int1 = prop.getProperty("totalPictureCountRear_Int1");  
			System.out.println("totalPictureCountRear_Int1 = "+ totalPictureCountRear_Int1);
			int totalPictureCountRear_Int1Int=Integer.parseInt(totalPictureCountRear_Int1);
			// capture  pics for the selected resolution
			int j1=0;
			for( j1 = 0; j1 < totalPictureCountRear_Int1Int; j1++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image  Resolution (16:9) 9.7 MP: "+j1);
				logger.info("clicking Image  Resolution (16:9) 9.7 MP "+j1);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("Back camera second resolution:" + j1 + " images Captured succesfull" );
			//Select 3rd resolution
			//click on camera resolutions
			logger.info("Select settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,80][720,128]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select  picture size");
			System.out.println("Select  picture size");
			MobileElement picturesize2 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
			picturesize2.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select third Image Resoution: (20:9) 7.8 MP ");
			System.out.println("Select third Image Resoution: (20:9) 7.8 MP ");
			driver.findElement(By.xpath("//*[@text='(20:9) 7.8 MP']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int2 = prop.getProperty("totalPictureCountRear_Int2");  
			System.out.println("totalPictureCountRear_Int2 = "+ totalPictureCountRear_Int2);
			int totalPictureCountRear_Int2Int=Integer.parseInt(totalPictureCountRear_Int2);
			// capture  pics for the selected resolution
			int j2=0;
			for( j2 = 0; j2 < totalPictureCountRear_Int2Int; j2++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 3rd Resolutions (20:9) 7.8 MP: "+j2);
				logger.info("clicking Image of 3rd Resolutions (20:9) 7.8 MP: "+j2);

			}
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Back camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("Back camera third resolution:" + j2 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,80][720,128]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select  picture size");
			System.out.println("Select  picture size");
			MobileElement picturesize3 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
			picturesize3.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 4TH Image Resoution: (20:9) 7.8 MP ");
			System.out.println("Select 4TH Image Resoution: (20:9) 7.8 MP ");
			driver.findElement(By.xpath("//*[@text='(20:9) 7.8 MP']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int3 = prop.getProperty("totalPictureCountRear_Int3");  
			System.out.println("totalPictureCountRear_Int3 = "+ totalPictureCountRear_Int3);
			int totalPictureCountRear_Int3Int=Integer.parseInt(totalPictureCountRear_Int3);
			// capture  pics for the selected resolution
			int j3=0;
			for( j3 = 0; j3 < totalPictureCountRear_Int3Int; j3++)
			{
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 4TH Resolutions (20:9) 7.8 MP: "+j3);
				logger.info("clicking Image of 4TH Resolutions (20:9) 7.8 MP: "+j3);
			}
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Back camera 4TH resolution:" + j3 + " images Captured succesfull" );
			logger.info("Back camera 4TH resolution:" + j3 + " images Captured succesfull" );

			TotalCount += j+j1+j2+j3;
			System.out.println("Total Count value: " + TotalCount + " images to be Captured " );
			logger.info("Total Count value: " + TotalCount + " images to be Captured " );
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result ="Pass";
			//Launch File manager
			logger.info("Launch file manager application and verify captured images present  in Internal storage");
			System.out.println("Launch file manager application and verify captured images present in Internal storage");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If file manager permission request access accept allow permission
			try
			{
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click Accept & continue");
				System.out.println("Click Accept & continue");
				driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			SDCard.click();
			TimeUnit.SECONDS.sleep(6);
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
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions4 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions4.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll3 =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll3.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Total Image captured");
			System.out.println("Total Image");
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
			TotalImage.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.print("Test9_Int_Bcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 
			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop9 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	
			double TolerancePercentage = (Tolerance_LevelInt/100)*TotalCount;				
			//System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>=TolerancePercentage*TotalCount)
			{
				logger.info("Pass: Test9_Int pass for rear Image capture");
				System.out.println("\nPass: Test9_Int pass for rear Image capture");
				System.out.println("Test9_Int Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9_Int Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");


				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(3); 
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(3); 
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(5);
				//calling DataMoveOperation()
			}
			else {
				logger.info("Fail: Test9_Int Fail for rear camera Image capture");
				System.out.println("\nFail: Test9_Int Fail for rear camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			//calling DataMoveOperation()
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9_Int Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9_Int Fail for Data Move Operation");
			}
			else {
				Result= "Pass";
				logger.info("Final message: Pass Test9_Int Pass for Rear camera image capture  successfully");
				System.out.println("Final message: Pass Test9_Int Pass for Rear camera image capture  successfully");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}

		}
		catch (Exception e) {

			logger.info("Fail: Test9_Int fail for Fail Count Issue");
			System.out.println("\nFail: Test9_Int fail for Fail Count Issue");
			logger.info("Fail: Test9_Int fail for rear Image capture");
			System.out.println("\nFail: Test9_Int fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			System.out.println("Final message: Fail Test9_Int for rear camera image capture");
			logger.info("Final message: Fail Test9_Int for rear camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		isPaused = true;
		try {
			logger.info("Re-launch file manager application and select Internal storage for data move operation, select all rear camera images files present in camera folder and move to Test9_Int folder");
			System.out.println("Re-launch file manager application and select internal storage for data move operation, select all rear camera images files present in camera folder and move to Test9_Int folder");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

			//Select External Storage	
			logger.info("Select internal storage");
			System.out.println("Select internal storage");
			MobileElement Ext = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			Ext.click();
			TimeUnit.SECONDS.sleep(5);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Name folder as Test9_Int");
			System.out.println("Name folder as Test9_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9_Int");
			TimeUnit.SECONDS.sleep(5);
			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder1 =	driver.findElement(By.xpath("//*[@text='Create Folder']"));
			CreateFolder1.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch to grid view mode
			logger.info("switch to grid view mode and select DCIM  folder");
			System.out.println("switch to grid view mode and select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test1 folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM folder");
			MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
			DCIM.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test_file folder
			logger.info("Select camera  folder");
			System.out.println("Select camera folder");
			MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
			Camera.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions0 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions0.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select move to option");
			System.out.println("select move to option");
			MobileElement moveto =	driver.findElement(By.xpath("//*[@text='Move to']"));
			moveto.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select Internal storage");
			System.out.println("select Internal storage");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select Test9_Int");
			System.out.println("select Test9_Int");
			MobileElement uSD1 =	driver.findElement(By.xpath("//*[@text='Test9_Int']"));
			uSD1.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Create option
			logger.info("Accept Move here");
			System.out.println("Accept Move here");
			driver.findElement(By.xpath("//*[@text='Move here']")).click();
			TimeUnit.SECONDS.sleep(30);
			logger.info("Cut paste operation completed successfully");
			System.out.println("Cut paste  operation completed successfully");
			logger.info("Test9_Int: Data move operation completed successfully");
			System.out.println("Test9_Int: Data move operation completed successfully");

			Result = "Pass";
			if(Result == "Pass")
			{
				logger.info("Pass: Test9_Int Pass for data move operation successfully");	
				System.out.println("Pass: Test9_Int Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9_Int Fail for data move operation ");
			System.out.println("Fail: Test9_Int Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}