package Umidigi_Bison_X10GNFC_RP05;
import org.testng.annotations.Test;
import Umidigi_Bison_X10GNFC_RP05.Test9_Int;
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

public class Test9_Int
{
	// initializing the driver instance and declaring desired capabilities
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "BISON X10G NFC");
		dc.setCapability(MobileCapabilityType.UDID, "BSGN46405Y2010800446");
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
		FileHandler fileHandler = new FileHandler("status_log_Test9_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9_Int Scenario is follows:");
		logger.info("1.Launch camera application, start rear camera Image capture for all host resolutions");
		logger.info("2.Move rear camera image captured files from camera folder to Test9_Int folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9_Int Scenario is follows:");
		System.out.println("1.Launch camera application, set uSD as a Storage option, start rear camera Image capture for all host resolutions");
		System.out.println("2.Move rear camera  captured image files from camera folder to Test9_Int folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		SetUp();
		String Result = "Fail";
		int TotalCount = 0; // initialize sum
		int i;
		//Unlock phone
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
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

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Launch Camera application for rear camera video recording.
		logger.info("Launch Camera application for rear camera Image capture");
		System.out.println("Launch Camera application for rear camera Image capture");
		((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraLauncher"));
		TimeUnit.SECONDS.sleep(6);
		try {
		logger.info("Test9_Int_Bcam_res: 9 resolutions supported");
		System.out.println("Test9_Int_Bcam_res: 9 resolutions supported");
		//If location permission pop-up exists select deny  option
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
	
		//Switch to back camera if current existing camera is Front camera.
		try {
			logger.info("Switch to rear Camera Mode if current Exiting camera is Front camera Mode");
			System.out.println("Switch to rear Camera Mode if current Exiting camera is Front camera Mode");
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToBackCamera.click();
			
		}
		
		catch(Exception exp)
		{ 
				// Block of code to handle errors
			logger.info("Currently camera is already in rear camera mode no need to switch"); 
			System.out.println("Currently camera is already in rear camera mode no need to switch"); 
		}
		//Select Photo mode option
		logger.info("Select photo mode option");
		System.out.println("Select photo mode option");
		driver.findElement(By.xpath("//*[@text='Capture']")).click();

		

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Setting1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		Setting1.click();
		TimeUnit.SECONDS.sleep(5);

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize.click();
		TimeUnit.SECONDS.sleep(3);

		//Select 1st photo resolution
		logger.info("Select Rear camera first image resolution: (4:3) 16 megapixels");
		System.out.println("Select Rear camera first image resolution: (4:3) 16 megapixels");
		driver.findElement(By.xpath("//*[@text='(4:3) 16 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		Properties prop = new Properties();
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
		System.out.println("totalPictureCountRear = "+ totalPictureCountRear + " Images to be captured");
		int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);

		int j=0;
		for(j = 0; j < totalPictureCountRearInt; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			//Start image capture
			MobileElement shutter = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("captureing first Resolution image "+j);
			logger.info("captureing first Resolution image "+j);

		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings1.click();
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize1 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize1.click();
		TimeUnit.SECONDS.sleep(3);

		//Select 3:4 
		logger.info("Select Rear camera second resolution: (4:3) 8 megapixels");
		System.out.println("Select Rear camera second resolution: (4:3) 8 megapixels");
		driver.findElement(By.xpath("//*[@text='(4:3) 8 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");  
		System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1 + " Imgaes to be captured");
		int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear);

		// capture  pics for the selected resolution
		int j1=0;
		for(j1 = 0; j1 < totalPictureCountRear1Int; j1++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			//Start image capture
			MobileElement shutter1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter1.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("captureing Second  Resolution image "+j1);
			logger.info("captureing Second  Resolution image "+j1);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings2.click();

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize2 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize2.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select rear camera third resolution:(4:3) 4 megapixels");
		System.out.println("Select rear camera third resolution:(4:3) 4 megapixels");
		driver.findElement(By.xpath("//*[@text='(4:3) 4 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");  
		System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2 + " Images to be captured");
		int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
		int j2=0;
		for(j2 = 0; j2 < totalPictureCountRear2Int; j2++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing third Resolution image "+j2);
			logger.info("Captureing third Resolution image "+j2);
		}
		TimeUnit.SECONDS.sleep(2);	

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings3.click();

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize3 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize3.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select Rear camera fourth image resolution (16:9) 12 megapixels");
		System.out.println("Select Rear camera fourth image resolution (16:9) 12 megapixels");
		driver.findElement(By.xpath("//*[@text='(16:9) 12 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear3 = prop.getProperty("totalPictureCountRear3");  
		System.out.println("totalPictureCountRear3 = "+ totalPictureCountRear3 +" Images to be captured");
		int totalPictureCountRear3Int=Integer.parseInt(totalPictureCountRear3);
		int j3=0;
		for(j3 = 0; j3 < totalPictureCountRear3Int; j3++) 
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
		MobileElement Settings4 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings4.click();

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize4 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize4.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select rear camera fifth image resolution: (16:9) 6 megapixels");
		System.out.println("Select rear camera fifth image resolution: (16:9) 6 megapixels");
		driver.findElement(By.xpath("//*[@text='(16:9) 6 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear4 = prop.getProperty("totalPictureCountRear4");  
		System.out.println("totalPictureCountRear4 = "+ totalPictureCountRear4);
		int totalPictureCountRear4Int=Integer.parseInt(totalPictureCountRear4);
		int j4=0;
		for(j4 = 0; j4 < totalPictureCountRear4Int; j4++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("clicking fifth Resolution image "+j4);
			logger.info("clicking fifth Resolution image "+j4);
		}
		TimeUnit.SECONDS.sleep(2);	

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings5 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings5.click();

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize5 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize5.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select Rear camera fifth image resolution: (16:9) 2 megapixels");
		System.out.println("Select rear camera fifth image resolution: (16:9) 2 megapixels");
		driver.findElement(By.xpath("//*[@text='(16:9) 2 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear5 = prop.getProperty("totalPictureCountRear5");  
		System.out.println("totalPictureCountRear5 = "+ totalPictureCountRear5 + " Images to be captured");
		int totalPictureCountRear5Int=Integer.parseInt(totalPictureCountRear5);
		int j5=0;
		for(j5 = 0; j5 < totalPictureCountRear5Int; j5++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Capturing sixth Resolution image "+j5);
			logger.info("captureing sixth Resolution image "+j5);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings6 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings6.click();

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize6 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize6.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select rear camera seventh image resolution: (20:9) 8 megapixels");
		System.out.println("Select rear camera seventh image resolution: (20:9) 8 megapixels");
		driver.findElement(By.xpath("//*[@text='(20:9) 8 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear6 = prop.getProperty("totalPictureCountRear6");  
		System.out.println("totalPictureCountRear6 = "+ totalPictureCountRear6 + " Images to be capture");
		int totalPictureCountRear6Int=Integer.parseInt(totalPictureCountRear6);
		int j6=0;
		for(j6 = 0; j6 < totalPictureCountRear6Int; j6++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Capturing seventh Resolution image "+j6);
			logger.info("Capturing seventh Resolution image "+j6);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings7 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings7.click();

		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize7 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize7.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select rear camera eighth image resolution: (20:9) 5 megapixels");
		System.out.println("Select 8th rear camera resolution: (20:9) 5 megapixels");
		driver.findElement(By.xpath("//*[@text='(20:9) 5 megapixels']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear7 = prop.getProperty("totalPictureCountRear7");  
		System.out.println("totalPictureCountRear7 = "+ totalPictureCountRear7+ " Images to be captured");
		int totalPictureCountRear7Int=Integer.parseInt(totalPictureCountRear7);
		int j7=0;
		for(j7 = 0; j7 < totalPictureCountRear7Int; j7++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing eight resolution image "+j7);
			logger.info("Captureing eight resolution image "+j7);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings8 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']"));
		TimeUnit.SECONDS.sleep(5);
		Settings8.click();
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize8 = driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']"));
		RearPhotoSize8.click();
		TimeUnit.SECONDS.sleep(3);
		//Click 9:16
		logger.info("Select rear camera ninth image resolution: (20:9) 2 megapixels");
		System.out.println("Select rear camera ninth image resolution: (20:9) 2 megapixels");
		driver.findElement(By.xpath("//*[@bounds='[50,1231][670,1343]']")).click();
		TimeUnit.SECONDS.sleep(3);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		// Load properties file
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountRear8 = prop.getProperty("totalPictureCountRear8");  
		System.out.println("totalPictureCountRear8 = "+ totalPictureCountRear8 + " Images to be captured");
		int totalPictureCountRear8Int=Integer.parseInt(totalPictureCountRear8);
		int j8=0;
		for(j8 = 0; j8 < totalPictureCountRear8Int; j8++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			MobileElement shutter2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']"));
			shutter2.click();
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Captureing ninth resolution image "+j8);
			logger.info("Captureing ninth resolution image "+j8);
		}
		TimeUnit.SECONDS.sleep(2);		


		//Sum total of User provided images resolution count 
		TotalCount += j+j1+j2+j3+j4+j5+j6+j7+j8;

		System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
		logger.info("Total Count value:" + TotalCount + " images to be Captured " );

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		//Launch file manager application and verify image capture in uSD card.

		Result= "Pass";
		logger.info("Launch file manager application and verify recorded video present  in uSD Card");
		System.out.println("Launch file manager application and verify recorded video present in uSD Card");
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
		//Select Browse option
		logger.info("click on browse option");
		System.out.println("click on browse option");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);

		//Swipe and Select external storage
		logger.info("Swipe up to select Internal storage");
		System.out.println("Swipe up to select internal storage");
		MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		//Click External storage
		logger.info("Select Internal storage");
		System.out.println("Select internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
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

		MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
		TotalImage.click();
		System.out.print("Test9_Int_Bcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
		TimeUnit.SECONDS.sleep(3); 


		String str= TotalImage.getText();
		//System.out.println("Actual Value:"+str);
		String TotalImageInt= str.replaceAll("[^0-9]", "");
		System.out.println("Interger value:"+TotalImageInt);

		int TotalImageCaptured=Integer.valueOf(TotalImageInt);

		Properties prop5 = new Properties();
		prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
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
			System.out.println("Test9_Int_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
			logger.info("Test9_Int_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );

			//	logger.info("Final message: Pass Test9_Int Pass for Rear camera image capture");
			//System.out.println("Final message: Pass Test9_Int Pass for Rear camera image capture");

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

			logger.info("Fail: Test9_Int Fail for rear camera Image capture");
			System.out.println("\nFail: Test9_Int Fail for rear camera Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//logger.info("Final message: Pass Test9_Int Pass for Rear camera image capture  successfully");
			//System.out.println("Final message: Pass Test9_Int Pass for Rear camera image capture  successfully");
		}
		logger.info("calling DataMoveOperation() ");
		System.out.println("calling DataMoveOperation()");
		DataMoveOperation();

		if(Result == "Fail")
		{
			System.out.println("Final Message: Fail Test9_Int Fail for Data Move Operation");
			logger.info("Final Message: Fail Test9_Int Fail for Data Move Operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

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
		System.out.println("Final message: Fail Test9_Int Fail for rear camera image capture");
		logger.info("Final message: Fail Test9_Int Failfor rear camera image capture");
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
	//((StartsActivity) driver).startActivity(new Activity("com.bbk.launcher2", "com.bbk.launcher2.Launcher"));
	//TimeUnit.SECONDS.sleep(5);



	try {
		//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
		logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 and cut paste all videos in BCFC_Cameravideos folder");
		System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test10 folder and cut paste all videos in BCFC_Cameravideos folder");


		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//If file manager permission request access accept allow permission
		

		//Swipe and Select external storage
		logger.info("Swipe up to select uSD card");
		System.out.println("Swipe up to select uSD card");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		//Click External storage
		logger.info("Select SD card");
		System.out.println("Select SD card");
		MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
		InternalStorage.click();
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
		logger.info("Select uSD Card");
		System.out.println("select uSD Card");
		MobileElement uSD =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
		uSD.click();
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


		//Click Create option
		logger.info("Accept create folder");
		System.out.println("Accept create folder");
		driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Cut paste  video files operation completed successfully");
		System.out.println("Cut paste  video files operation completed successfully");


		//logger.info("Pass: Test10 Datamove of videos files operation completed successfully");
		//System.out.println("Pass: Test10 Datamove of videos files operation completed successfully");
		//logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

		Result = "Pass";


		if(Result == "Pass")
		{
			logger.info("Pass: Test9_Int Pass for data move operation successfully");	
			System.out.println("Pass: Test9_Int Pass for data move operation successfully");	
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

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