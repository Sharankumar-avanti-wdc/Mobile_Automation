package Ulefone_Armor_X8i;
import org.testng.annotations.Test;
import Ulefone_Armor_X8i.Test9F_Int;
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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey; 
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test9F_Int
{
	// initializing the driver instance and declaring desired capabilities
	AppiumDriver<MobileElement> driver;
	private boolean isPaused;
	private String Result;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Armor X8i");
		dc.setCapability(MobileCapabilityType.UDID, "3093SH3010004330");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void RearPictureCapture() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test9F_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9F_Int Scenario is as follows:");
		logger.info("1.Launch camera application, start Front camera image picture capture for all Host front resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F_Int Scenario is as follows:");
		System.out.println("1.Launch camera application, start Front camera image picture capture for all Host front resolutions");
		System.out.println("2.Move captured front images from camera folder to Test9F_Int folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Unlock phone
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch Home screen 
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);

		// Clearing Phone recent apps from background
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			MobileElement  ClearAll =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			ClearAll.click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("No recent apps found in background");
			System.out.println("No recent apps found background");

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		logger.info("Launch Camera application for rear camera video recording");
		System.out.println("Launch Camera application for rear camera video recording");
		//Launch Camera Application.
		try {

			((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
		}
		catch(Exception exp)
		{

		}
		//Click On App Info
		try {
			logger.info("Select App info option");
			System.out.println("Select App info option");
			MobileElement AppInfo = driver.findElement(By.xpath("//*[@text='App info']"));
			AppInfo.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Open
			logger.info("Select Open option");
			System.out.println("Select Open option");
			MobileElement Open = driver.findElement(By.xpath("//*[@text='OPEN']"));
			Open.click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch(Exception exp1) {

		}
		try {
			//Declare number of front camera resolution
			logger.info("Test9F_Int_Fcam_res: 3 resolutions supported");
			System.out.println("Test9F_Int_Fcam_res: 3 resolutions supported");
			
			//Switch to Front Video camera mode
			logger.info("Switch to front video camera mode");
			System.out.println("Switch to front video camera mode");
			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"back\"]"));
			SwitchToFrontCamera.click();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Switching to Front Video capture");
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_settings']"));
			Settings.click();
			TimeUnit.SECONDS.sleep(5);

			
			//Select settings option to select resolution
			logger.info("Select Picture size to select resolution");
			System.out.println("Select Picture size settings option to select resolution");
			MobileElement RearPhotoSize = driver.findElement(By.xpath("//*[@bounds='[12,80][168,231]']"));
			RearPhotoSize.click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st photo resolution
			logger.info("Select front camera front image resolution: 8M");
			System.out.println("Select front camera front image resolution: 8M");
			driver.findElement(By.xpath("//*[@bounds='[282,570][438,726]']")).click();
			TimeUnit.SECONDS.sleep(3);
			// Load properties file
			Properties prop = new Properties();
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
			System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
			int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);

			int j=0;
			for(j = 0; j < totalPictureCountFrontInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/iv_shutter_button_bg']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing first resolution image "+j);
				logger.info("Captureing first resolution image "+j);

			}
			TimeUnit.SECONDS.sleep(2);

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_settings']"));
			Settings2.click();
			TimeUnit.SECONDS.sleep(5);
			//Select settings option to select resolution
			logger.info("Select Picture size to select resolution");
			System.out.println("Select Picture size settings option to select resolution");
			MobileElement RearPhotoSize1 = driver.findElement(By.xpath("//*[@bounds='[12,80][168,231]']"));
			RearPhotoSize1.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera second image resolution: 5M");
			System.out.println("Select front camera second image resolution: 5M");
			driver.findElement(By.xpath("//*[@bounds='[42,570][198,726]']")).click();
			TimeUnit.SECONDS.sleep(3);
			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
			System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1);
			int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);

			// capture  pics for the selected resolution
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountFront1Int; j1++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/iv_shutter_button_bg']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing second resolution image "+j1);
				logger.info("Captureing second resolution image "+j1);
			}
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_settings']"));
			Settings3.click();
			TimeUnit.SECONDS.sleep(5);
			//Select settings option to select resolution
			logger.info("Select Picture size to select resolution");
			System.out.println("Select Picture size settings option to select resolution");
			MobileElement RearPhotoSize2 = driver.findElement(By.xpath("//*[@bounds='[12,80][168,231]']"));
			RearPhotoSize2.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera third image resolution: 1M");
			System.out.println("Select front camera third image resolution: 1M");
			driver.findElement(By.xpath("//*[@bounds='[522,570][678,726]']")).click();
			TimeUnit.SECONDS.sleep(3);
			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
			System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
			int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);

			// capture  pics for the selected resolution
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/iv_shutter_button_bg']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing third resolution image "+j2);
				logger.info("Captureing third resolution image "+j2);
			}
			
			//Switch to rear Video camera mode
			logger.info("Switch to rear video camera mode");
			System.out.println("Switch to rear video camera mode");
			MobileElement SwitchTobackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"front\"]"));
			SwitchTobackCamera.click();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			int TotalCount = j+j1+j2;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			//Result ="Pass";
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
			System.out.print("Test9F_Int_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 

			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);

			int TotalImageCaptured=Integer.valueOf(TotalImageInt);

			Properties prop5 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	

			double TolerancePercentage = Tolerance_LevelInt/100*TotalCount;				
			//	System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>(Tolerance_LevelInt/100)*TotalCount)
			{
				logger.info("Pass: Test9F_Int pass for front Image capture");
				System.out.println("\nPass: Test9F_Int pass for front Image capture");
				System.out.println("Test9F_Int_Fcam_image: " + TotalCount + "  images Captured succesfull" );
				logger.info("Test9F_Int_Fcam_image: " + TotalCount + "  images Captured succesfull" );
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
				logger.info("Fail: Test9F_Int Fail for front camera Image capture");
				System.out.println("\nFail: Test9F_Int Fail for front camera Image capture");
				}


			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			if(Result=="Pass")
			{
				logger.info("Final Message: Pass Test9F_Int Pass for front Camera image capture");
				System.out.println("Final Message: Pass Test9F_Int Pass for front Camera image capture");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			else
			{
				logger.info("Final Message: Pass Test9F_Int Pass for front Camera image capture");
				System.out.println("Final Message: Pass Test9F_Int Pass for front Camera image capture");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		}
		catch (Exception e) {

			logger.info("Fail: Test9F_Int fail for Fail Count Issue");
			System.out.println("\nFail: Test9F_Int fail for Fail Count Issue");
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final Message: Fail Test9F_Int for rear camera image capture");
			logger.info("Final Message: Fail Test9F_Int for rear camera image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}

	public void DataMoveOperation() throws  IOException, InterruptedException {

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		isPaused = true;
		try {
			logger.info("Re-launch file manager application and select Internal storage for data move operation, select all front camera images files present in camera folder and move to Test9F_Int folder");
			System.out.println("Re-launch file manager application and select Internal storage for data move operation, select all front camera images files present in camera folder and move to Test9F_Int folder");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If file manager permission request access accept allow permission
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			
			//Select DCIM Folder
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);

			logger.info("Name folder as Test9F_Int");
			System.out.println("Name folder as Test9F_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F_Int");
			TimeUnit.SECONDS.sleep(5);


			//Click Create option
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
			TimeUnit.SECONDS.sleep(120);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

			Result = "Pass";


			if(Result == "Pass")
			{
				logger.info("Pass: Test9F_Int Pass for data move operation successfully");	
				System.out.println("Pass: Test9F_Int Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9F_Int Fail for data move operation ");
			System.out.println("Fail: Test9F_Int Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}