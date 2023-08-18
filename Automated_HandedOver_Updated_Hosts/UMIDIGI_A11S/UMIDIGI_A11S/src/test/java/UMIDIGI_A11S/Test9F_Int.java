package UMIDIGI_A11S;
import org.testng.annotations.Test;
import UMIDIGI_A11S.Test9F_Int;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "A11S");
		dc.setCapability(MobileCapabilityType.UDID, "A11S432621112305514");
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
		logger.info("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F_Int Scenario is as follows:");
		System.out.println("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		System.out.println("2.Move captured front images from camera folder to Test9F_Int folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Unlock phone
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch home screen
		//Launch home screen
				logger.info("Launch home screen");
				System.out.println("Launch home screen");
				((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));
				TimeUnit.SECONDS.sleep(5);
				// click on close all
				try
				{
					logger.info("Clearing Recent Apps");
					System.out.println("Clearing Recent Apps");
					//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
					//TimeUnit.SECONDS.sleep(5);

					MobileElement clearall =	driver.findElement(By.xpath("//*[@bounds='[272,1249][448,1305]']"));
					clearall.click();
					TimeUnit.SECONDS.sleep(3);
				}

				catch (Exception e) {
					e.printStackTrace();
					logger.info("No recent apps found in background");
					System.out.println("No recent apps found in background");

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
				logger.info("Test9F_Int_Fcam_res: 7 resolutions supported");
				System.out.println("Test9F_Int_Fcam_res: 7 resolutions supported");
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
		//Select Photo mode option
		logger.info("Select photo mode option");
		System.out.println("Select photo mode option");
		driver.findElement(By.xpath("//*[@text='Capture']")).click();

		//Switch to Front Video camera mode
		logger.info("Switch to front  camera mode");
		System.out.println("Switch to front video camera mode");
		MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Back camera\"]"));
		SwitchToFrontCamera.click();
		TimeUnit.SECONDS.sleep(3);
		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings1 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings1.click();
		TimeUnit.SECONDS.sleep(5);
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize.click();
		TimeUnit.SECONDS.sleep(3);

		//Select 1st photo resolution
		logger.info("Select front camera front image resolution: (4:3) 8 megapixels");
		System.out.println("Select front camera front image resolution: (4:3) 8 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,447][670,559]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		Properties prop = new Properties();
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
		System.out.println("totalPictureCountFront = "+ totalPictureCountFront + " Images to be captured");
		int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);

		int j=0;
		for(j = 0; j < totalPictureCountFrontInt; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			//Start image capture
			MobileElement shutter = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing first resolution image "+j);
			logger.info("Captureing first resolution image "+j);

		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings2 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings2.click();
		TimeUnit.SECONDS.sleep(5);
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize1 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize1.click();
		TimeUnit.SECONDS.sleep(3);

		//Select 3:4 
		logger.info("Select front camera second image resolution: (4:3) 4 megapixels");
		System.out.println("Select front camera second image resolution: (4:3) 4 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,559][670,671]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
		System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1 + "Image to be captured");
		int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);

		// capture  pics for the selected resolution
		int j1=0;
		for(j1 = 0; j1 < totalPictureCountFront1Int; j1++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			//Start image capture
			MobileElement shutter1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter1.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing second resolution image "+j1);
			logger.info("Captureing second resolution image "+j1);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings3 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings3.click();
		TimeUnit.SECONDS.sleep(5);
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize2 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize2.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select front camera third image resolution: (16:9) 6 megapixels");
		System.out.println("Select front camera third image resolution: (16:9) 6 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,671][670,783]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
		System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2 + " Images to be captured");
		int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
		int j2=0;
		for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing third resolution image "+j2);
			logger.info("Captureing third resolution image "+j2);
		}
		TimeUnit.SECONDS.sleep(2);	

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings4 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings4.click();
		TimeUnit.SECONDS.sleep(5);

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize3 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize3.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select front camera fourth image resolution: (16:9) 2 megapixels");
		System.out.println("Select front camera fourth image resolution: (16:9) 2 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,783][670,895]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
		System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3 + " Images to be captured");
		int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
		int j3=0;
		for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing fourth resolution image "+j3);
			logger.info("Captureing fourth resolution image "+j3);
		}
		TimeUnit.SECONDS.sleep(2);	

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings5 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings5.click();
		TimeUnit.SECONDS.sleep(5);

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize4 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize4.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select front camera fifth image resolution (16:9) 2 megapixels");
		System.out.println("Select front camera fifth image resolution: (16:9) 2 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,895][670,1007]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront4 = prop.getProperty("totalPictureCountFront4");  
		System.out.println("totalPictureCountFront4 = "+ totalPictureCountFront4+ " Images to be captured");
		int totalPictureCountFront4Int=Integer.parseInt(totalPictureCountFront4);
		int j4=0;
		for(j4 = 0; j4 < totalPictureCountFront4Int; j4++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing fifth resolution image "+j4);
			logger.info("Captureing fifth resolution image "+j4);
		}
		TimeUnit.SECONDS.sleep(2);	

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings6 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings6.click();
		TimeUnit.SECONDS.sleep(5);

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize5 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize5.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select front camera sixth image resolution: (20:9) 5 megapixels");
		System.out.println("Select front camera sixth image resolution: (20:9) 5 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,1007][670,1119]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront5 = prop.getProperty("totalPictureCountFront5");  
		System.out.println("totalPictureCountRear5 = "+ totalPictureCountFront5 +" Images to be captured");
		int totalPictureCountFront5Int=Integer.parseInt(totalPictureCountFront5);
		int j5=0;
		for(j5 = 0; j5 < totalPictureCountFront5Int; j5++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing sixth resolution image "+j5);
			logger.info("Captureing sixth resolution image "+j5);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings7 = driver.findElement(By.xpath("//*[@bounds='[624,80][720,144]']"));
		Settings7.click();
		TimeUnit.SECONDS.sleep(5);

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize6 = driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']"));
		RearPhotoSize6.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select front camera seventh image resolution: (20:9) 2 megapixels");
		System.out.println("Select front camera seventh image resolution: (20:9) 2 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,1119][670,1231]']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront6 = prop.getProperty("totalPictureCountFront6");  
		System.out.println("totalPictureCountFront6 = "+ totalPictureCountFront6 + " Images to be captured");
		int totalPictureCountFront6Int=Integer.parseInt(totalPictureCountFront6);
		int j6=0;
		for(j6 = 0; j6 < totalPictureCountFront6Int; j6++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing seventh resolution image "+j6);
			logger.info("Captureing seventh resolution image "+j6);
		}
		TimeUnit.SECONDS.sleep(2);

		//Switch to Front camera mode
		logger.info("Switch to back camera mode");
		System.out.println("Switch to back camera mode");
		MobileElement SwitchTobackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front camera\"]"));
		SwitchTobackCamera.click();



		// switch to back camera
		TimeUnit.SECONDS.sleep(5);
		//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
		//TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		int TotalCount = j+j1+j2+j3+j4+j5+j6;
		System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
		logger.info("Total Count value:" + TotalCount + " images to be Captured " );


		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		//Result ="Pass";
		logger.info("Launch file manager application and verify captured images present  in uSD Card");
		System.out.println("Launch file manager application and verify captured images present in uSD Card");
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
		logger.info("Select SD card");
		System.out.println("Select SD card");
		MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
		Internalstorage.click();
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


			//logger.info("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
			//System.out.println("Final message: Pass Test9 Pass for Rear camera image capture  successfully");

		}


		logger.info("calling DataMoveOperation() ");
		System.out.println("calling DataMoveOperation()");
		DataMoveOperation();
		if(Result=="Pass")
		{
			logger.info("Final message: Pass Test9F_Int Pass for front Camera image capture");
			System.out.println("Final message: Pass Test9F_Int Pass for front Camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
		else
		{
			logger.info("Final message: Pass Test9F_Int Pass for front Camera image capture");
			System.out.println("Final message: Pass Test9F_Int Pass for front Camera image capture");
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
		System.out.println("Final message: Fail Test9F_Int for rear camera image capture");
		logger.info("Final message: Fail Test9F_Int for rear camera image capture");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

	}
}

public void DataMoveOperation() throws  IOException, InterruptedException {

	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
	isPaused = true;
	try {
		logger.info("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F_Int folder");
		System.out.println("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F_Int folder");
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
		//Select TestFile folder


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
		System.out.println("select internal storage");
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
		TimeUnit.SECONDS.sleep(30);

		logger.info("Cut paste   operation completed successfully");
		System.out.println("Cut paste   operation completed successfully");

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

		logger.info("Test9F_Int: Data move operation completed successfully");
		System.out.println("Test9F_Int: Data move operation completed successfully");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);


		Result = "Pass";


		if (Result == "Pass")
		{
			logger.info("Pass: Test9F_Int Pass for data move operation successfully");	
			System.out.println("Pass: Test9F_Int Pass for data move operation successfully");	
		}


	}
	catch (Exception e) {
		e.printStackTrace();
		if (Result == "Fail")
		{
			logger.info("Fail: Test9F_Int Fail for data move operation ");
			System.out.println("Fail: Test9F_Int Fail for data move operation");	
		}

	}

}  	
}