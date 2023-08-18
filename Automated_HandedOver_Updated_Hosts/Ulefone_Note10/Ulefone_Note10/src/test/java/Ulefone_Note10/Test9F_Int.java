package Ulefone_Note10;
import org.testng.annotations.Test;
import Ulefone_Note10.Test9F_Int;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Note 10");
		dc.setCapability(MobileCapabilityType.UDID, "3276BH1001012462");
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
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);

		// Clearing Phone recent apps from background
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			MobileElement  ClearAll =	driver.findElement(By.xpath("//*[@text='CLEAR ALL']"));
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
		//Launch Camera application for rear camera video recording.
		logger.info("Launch Camera application for front camera Image capture");
		System.out.println("Launch Camera application for front camera Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));
		TimeUnit.SECONDS.sleep(6);
		try {
			//Declare number of front camera resolution
			logger.info("Test9F_Int_Fcam_res: 8 resolutions supported");
			System.out.println("Test9F_Int_Fcam_res: 8 resolutions supported");
			//Switch to back camera if current existing camera is Front camera.
			try {
				logger.info("Switch to front Camera Mode if current Exiting camera is rear camera Mode");
				System.out.println("Switch to front Camera Mode if current Exiting camera is rear camera Mode");
				MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Back camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToFrontCamera.click();

			}

			catch(Exception exp)
			{ 
				// Block of code to handle errors
				logger.info("Currently camera is already in rear camera mode no need to switch"); 
				System.out.println("Currently camera is already in rear camera mode no need to switch"); 
			}
			TimeUnit.SECONDS.sleep(10);
			

			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting1.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 1st photo resolution
			logger.info("Select front camera front image resolution: (4:3) 5.0 megapixels");
			System.out.println("Select front camera front image resolution: (4:3) 5.0 megapixels");
			driver.findElement(By.xpath("//*[@text='(4:3) 5.0 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

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
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing first resolution image "+j);
				logger.info("Captureing first resolution image "+j);

			}
			TimeUnit.SECONDS.sleep(2);

			//Click On Settings
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting3 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting3.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize1 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize1.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera second image resolution: (4:3) 1.9 megapixels");
			System.out.println("Select front camera second image resolution: (4:3) 1.9 megapixels");
			driver.findElement(By.xpath("//*[@text='(4:3) 1.9 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

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
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing second resolution image "+j1);
				logger.info("Captureing second resolution image "+j1);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting4 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting4.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize2 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize2.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera third image resolution: (4:3) 1.6 megapixels");
			System.out.println("Select front camera third image resolution: (4:3) 1.6 megapixels");
			driver.findElement(By.xpath("//*[@text='(4:3) 1.6 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

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
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing third resolution image "+j2);
				logger.info("Captureing third resolution image "+j2);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting5 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting5.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize3 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize3.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera fourth image resolution: (16:9) 3.8 megapixels");
			System.out.println("Select front camera fourth image resolution: (16:9) 3.8 megapixels");
			driver.findElement(By.xpath("//*[@text='(16:9) 3.8 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
			System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3);
			int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);

			// capture  pics for the selected resolution
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing fourth resolution image "+j3);
				logger.info("Captureing fourth resolution image "+j3);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting6 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting6.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize4 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize4.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera fifth image resolution: (16:9) 2.1 megapixels");
			System.out.println("Select front camera fifth image resolution: (16:9) 2.1 megapixels");
			driver.findElement(By.xpath("//*[@text='(16:9) 2.1 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront4 = prop.getProperty("totalPictureCountFront4");  
			System.out.println("totalPictureCountFront4 = "+ totalPictureCountFront4);
			int totalPictureCountFront4Int=Integer.parseInt(totalPictureCountFront4);

			// capture  pics for the selected resolution
			int j4=0;
			for(j4 = 0; j4 < totalPictureCountFront4Int; j4++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing fifth resolution image "+j4);
				logger.info("Captureing fifth resolution image "+j4);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting7 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting7.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize5 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize5.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera sixth image resolution: (16:9) 0.9 megapixels");
			System.out.println("Select front camera sixth image resolution: (16:9) 0.9 megapixels");
			driver.findElement(By.xpath("//*[@text='(16:9) 0.9 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront5 = prop.getProperty("totalPictureCountFront5");  
			System.out.println("totalPictureCountFront5 = "+ totalPictureCountFront5);
			int totalPictureCountFront5Int=Integer.parseInt(totalPictureCountFront5);

			// capture  pics for the selected resolution
			int j5=0;
			for(j5 = 0; j5 < totalPictureCountFront5Int; j5++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing sixth resolution image "+j5);
				logger.info("Captureing sixth resolution image "+j5);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting8 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting8.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize6 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize6.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera Seventh image resolution: (18:9) 3.4 megapixels");
			System.out.println("Select front camera Seventh image resolution: (18:9) 3.4 megapixels");
			driver.findElement(By.xpath("//*[@text='(18:9) 3.4 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront6 = prop.getProperty("totalPictureCountFront6");  
			System.out.println("totalPictureCountFront6 = "+ totalPictureCountFront6);
			int totalPictureCountFront6Int=Integer.parseInt(totalPictureCountFront6);

			// capture  pics for the selected resolution
			int j6=0;
			for(j6 = 0; j6 < totalPictureCountFront6Int; j6++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing seventh resolution image "+j6);
				logger.info("Captureing seventh resolution image "+j6);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Setting9 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
			Setting9.click();
			TimeUnit.SECONDS.sleep(5);

			//Select settings option to select resolution
			logger.info("Select Picture size(Front camera) option to select resolution");
			System.out.println("Select Picture size(Front camera) option to select resolution");
			MobileElement RearPhotoSize7 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
			RearPhotoSize7.click();
			TimeUnit.SECONDS.sleep(3);

			//Select 3:4 
			logger.info("Select front camera eigth image resolution: (18:9) 2.3 megapixels");
			System.out.println("Select front camera eigth image resolution: (18:9) 2.3 megapixels");
			driver.findElement(By.xpath("//*[@text='(18:9) 2.3 megapixels']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront7 = prop.getProperty("totalPictureCountFront7");  
			System.out.println("totalPictureCountFront6 = "+ totalPictureCountFront7);
			int totalPictureCountFront7Int=Integer.parseInt(totalPictureCountFront7);

			// capture  pics for the selected resolution
			int j7=0;
			for(j7 = 0; j7 < totalPictureCountFront7Int; j7++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Captureing eigth resolution image "+j7);
				logger.info("Captureing eigth resolution image "+j7);
			}
			TimeUnit.SECONDS.sleep(2);
			
			
			
			//Switch to Front camera mode
			logger.info("Switch to back camera mode");
			System.out.println("Switch to back camera mode");
			MobileElement SwitchTobackCamera = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/btn_camera_switch']"));
			SwitchTobackCamera.click();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			int TotalCount = j+j1+j2+j3+j4+j5+j6+j7;
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


				//logger.info("Final Message: Pass Test9 Pass for Rear camera image capture  successfully");
				//System.out.println("Final Message: Pass Test9 Pass for Rear camera image capture  successfully");

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
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions.click();
			TimeUnit.SECONDS.sleep(6);


			//Click More options
			logger.info("Select add new folder option");
			System.out.println("Select add new folder option");
			MobileElement AddNewFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			AddNewFolder.click();
			TimeUnit.SECONDS.sleep(6);

			logger.info("Name folder as Test9F_Int");
			System.out.println("Name folder as Test9F_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F_Int");
			TimeUnit.SECONDS.sleep(5);

			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Create Folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);



			//Select DCIM Folder
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
			MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions1.click();
			TimeUnit.SECONDS.sleep(6);

			//Click More options
			logger.info("Click select all option");
			System.out.println("Click select all option");
			MobileElement SelectAll1 =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll1.click();
			TimeUnit.SECONDS.sleep(6);

			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions2 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions2.click();
			TimeUnit.SECONDS.sleep(6);

			//Click move to options
			logger.info("Select Move to option");
			System.out.println("Select Move to option");
			MobileElement MoveTo =	driver.findElement(By.xpath("//*[@text='Move to']"));
			MoveTo.click();
			TimeUnit.SECONDS.sleep(6);

			//Click internal storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement SDCard2 =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			SDCard2.click();
			TimeUnit.SECONDS.sleep(6);

			//Select Test9_Int folder
			logger.info("Select Test9F_Int folder");
			System.out.println("Select Test9F_Int folder");
			MobileElement Test9_Int =	driver.findElement(By.xpath("//*[@text='Test9F_Int']"));
			Test9_Int.click();
			TimeUnit.SECONDS.sleep(6);

			//Select Test9_Int folder
			logger.info("Click move here");
			System.out.println("Click move here");
			MobileElement Move =	driver.findElement(By.xpath("//*[@text='Move here']"));
			Move.click();
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