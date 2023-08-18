package Xiaomi_Redmi_Note11S_5G_22031116B6;

import org.testng.annotations.Test;

import Xiaomi_Redmi_Note11S_5G_22031116B6.Test9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test9F
{
	// initializing the driver instance and declared desired capabilities
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 11S 5G");
		dc.setCapability(MobileCapabilityType.UDID, "95DQ5949BAUWH6R4");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void frontPictureCapture() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test9F.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9F Scenario is as follows:");
		logger.info("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F Scenario is as follows:");
		System.out.println("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		int TotalCount = 0; // initialize sum
		int i;
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		//If appium launch request permission pop-up exists click allow 
		try
		{
			//Click allow pop-up
			driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
			logger.info("Clearing Recent Apps");
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launch appium permission access:");
			System.out.println("Launch appium permission access:");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("No permission access pop-up found");
			System.out.println("No permission access pop-up found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try {
			//Launching settings application and set external storage as storage option for rear camera image capture.
			logger.info("Launching settings application and set external storage as storage option for rear camera image capture.");
			System.out.println("Launching settings application and set external storage as storage option for rear camera image capture.");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
			TimeUnit.SECONDS.sleep(6);

			//Select About phone
			logger.info("Select About phone");
			System.out.println("Select About phone");
			driver.findElement(By.xpath("//*[@text='About phone']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select storage option
			logger.info("Select storage option");
			System.out.println("Select storage option");
			driver.findElement(By.xpath("//*[@text='Storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe and select storage settings
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
			//Select storage settings
			logger.info("Select storage settings");
			System.out.println("Select storage settings");
			driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click camera option
			logger.info("Select camera option");
			System.out.println("Select camera option");
			driver.findElement(By.xpath("//*[@text='Camera']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select storage option as external storage
			logger.info("Select storage as external storage");
			System.out.println("Select storage as external storage");
			driver.findElement(By.xpath("//*[@text='External storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
			TimeUnit.SECONDS.sleep(6);
			//Launch Camera application for front camera video recording.
			logger.info("Launch Camera application for front camera Image capture");
			System.out.println("Launch Camera application for front camera Image capture");
			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
			TimeUnit.SECONDS.sleep(6);
			//If location permission pop-up exists select deny  option
			try 
			{ 
				//Click Deny Option
				driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Do you want to deny? click ok
				driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
				TimeUnit.SECONDS.sleep(3);		
			} 
			catch(Exception exp)
			{ 
				logger.info("No location permission access pop-up found: "+exp); 
				System.out.println("No location permission access pop-up found: "+exp); 

			}
			TimeUnit.SECONDS.sleep(2);
			//mention default image resolution
			logger.info("Test9F_Fcam_res: 4 resolutions supported");
			System.out.println("Test9F_Fcam_res: 4 resolutions supported");
			//Select Photo mode option
			logger.info("Select photo mode option");
			System.out.println("Select photo mode option");
			driver.findElement(By.xpath("//*[@text='Photo']")).click();

			//Switch to front camera mode
			logger.info("Switch to front Image  mode");
			System.out.println("Switch to front Image  mode");
			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/v9_camera_picker_horizontal']"));
			SwitchToFrontCamera.click();
			TimeUnit.SECONDS.sleep(3);

			//Select Photo option mode
			logger.info("Switch photo mode");
			System.out.println("Switch photo mode");
			driver.findElement(By.xpath("//*[@text='Photo']")).click();		

			//Select settings option to select resolution
			logger.info("Select settings option to select resolution");
			System.out.println("Select settings option to select resolution");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
			TimeUnit.SECONDS.sleep(3);

			//Select 1st photo resolution
			logger.info("Select first front camera resolution: 1:1");
			System.out.println("Select first front camera resolution: 1:1");
			driver.findElement(By.xpath("//*[@bounds='[102,162][303,255]']")).click();
			TimeUnit.SECONDS.sleep(3);

			// Load properties file
			Properties prop = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
			System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
			int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);

			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j=0;
			for(j = 0; j < totalPictureCountFrontInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']"));
				StartRecording.click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking first Resolution image "+j);
				logger.info("clicking first Resolution image "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("front camera first resolution:" + j + " images Captured succesfull");
			System.out.println("front camera first resolution:" + j + " images Captured succesfull" );

			//Select settings option to select resolution
			logger.info("Select settings option to select resolution");
			System.out.println("Select settings option to select second resolution 3:4");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
			TimeUnit.SECONDS.sleep(3);


			//Select 3:4 
			logger.info("Select second front camera resolution: 3:4");
			System.out.println("Select second front camera resolution: 3:4");
			driver.findElement(By.xpath("//*[@bounds='[327,162][528,255]']")).click();
			TimeUnit.SECONDS.sleep(3);

			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
			System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1);
			int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);

			// capture  pics for the selected resolution

			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountFront1Int; j1++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']"));
				StartRecording1.click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Second  Resolution image "+j);
				logger.info("clicking Second  Resolution image "+j);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("front camera second resolution:" + j1 + " images Captured succesfull" );

			//Select settings option to select resolution
			logger.info("Select settings option to select resolution");
			System.out.println("Select settings option to select resolution 9:16");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
			TimeUnit.SECONDS.sleep(3);


			//Click 9:16
			logger.info("Select third front camera resolution: 9:16");
			System.out.println("Select third front camera resolution: 9:16");
			driver.findElement(By.xpath("//*[@bounds='[552,162][753,255]']")).click();
			TimeUnit.SECONDS.sleep(3);

			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
			System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
			int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);

			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				logger.info("Start image capture");
				MobileElement StartRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']"));
				StartRecording2.click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking third Resolution image "+j);
				logger.info("clicking third Resolution image "+j);
			}
			TimeUnit.SECONDS.sleep(2);	
			System.out.println("front camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("front camera third  resolution:" + j2 + " images Captured succesfull" );

			//Select settings option to select resolution
			logger.info("Select settings option to select resolution");
			System.out.println("Select settings option to select resolution Full");
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
			TimeUnit.SECONDS.sleep(3);

			//Click Full
			logger.info("Select Fourth front camera resolution: Full");
			System.out.println("Select Fourth front camera resolution: Full");
			driver.findElement(By.xpath("//*[@bounds='[777,162][978,255]']")).click();
			TimeUnit.SECONDS.sleep(3);

			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
			System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3);
			int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);

			// capture  pics for the selected resolution
			logger.info("Capture Images");
			System.out.println("Capture Images");
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				//Start image capture
				MobileElement StartRecording3 = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button_horizontal']"));
				StartRecording3.click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking fourth resolution image "+j);
				logger.info("clicking fourth resolution image"+j);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera fourth resolution:" + j3 + " images Captured succesfull" );
			logger.info("front camera fourth  resolution:" + j3 + " images Captured succesfull" );

			//Switch to rear camera mode
			logger.info("Switch from Front Mode to rear camera mode");
			System.out.println("Switch from Front Mode to rear camera mode");
			MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/v9_camera_picker_horizontal']"));
			SwitchToBackCamera.click();
			TotalCount += j+j1+j2+j3;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
			//TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			Result ="Pass";

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
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='SD card']"));
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
			try {
				//long press and Hold RAW folder and delete
				MobileElement Folder =	driver.findElement(By.xpath("//*[@text='Raw']"));
				TouchAction touchAction3=new TouchAction(driver);
				touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
				TimeUnit.SECONDS.sleep(10);

				//Click More options
				logger.info("Click More options");
				System.out.println("Click More options");
				MobileElement MoreOptions4 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOptions4.click();
				TimeUnit.SECONDS.sleep(6);

				logger.info("Click Delete options");
				System.out.println("Click Delete options");
				MobileElement Delete = driver.findElement(By.xpath("//*[@text='Delete permanently']"));
				Delete.click();
				TimeUnit.SECONDS.sleep(3);

				logger.info("Click Confirm Delete options");
				System.out.println("Click Confirm Delete options");
				MobileElement ConfirmDelete = driver.findElement(By.xpath("//*[@text='Delete']")); 
				ConfirmDelete.click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
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
			//System.out.println("Total Image");
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
			TotalImage.click();
			TimeUnit.SECONDS.sleep(5);
			System.out.print("Test9F_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
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
				logger.info("Pass: Test9F pass for front Image capture");
				System.out.println("\nPass: Test9F pass for front Image capture");
				System.out.println("Test9F Fcam_image: " + TotalCount + "  images Captured succesfull" );
				logger.info("Test9F Fcam_image: " + TotalCount + "  images Captured succesfull" );
				//logger.info("Final Message: Pass Test9F Pass for front camera image capture");
				//System.out.println("Final Message: Pass Test9F Pass for front camera image capture");

				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			}
			else {

				logger.info("Fail: Test9F Fail for front camera Image capture");
				System.out.println("\nFail: Test9F Fail for front camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}


			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();

			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9F Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9F Fail for Data Move Operation");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			else {
				Result= "Pass";
				logger.info("Final Message: Pass Test9F Pass for Front camera image capture  successfully");
				System.out.println("Final Message: Pass Test9F Pass for Front camera image capture  successfully");
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

			logger.info("Fail: Test9F fail for Fail Count Issue");
			System.out.println("\nFail: Test9F fail for Fail Count Issue");

			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final Message: Fail Test9F for front camera image capture");
			logger.info("Final Message: Fail Test9F for front camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}

	public void DataMoveOperation() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		isPaused = true;
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
			logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 and cut paste all videos in BCFC_Cameravideos folder");
			System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test10 folder and cut paste all videos in BCFC_Cameravideos folder");
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
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
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
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);

			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Name folder as Test9F");
			System.out.println("Name folder as Test9F");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F");
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
				logger.info("Pass: Test9F Pass for data move operation successfully");	
				System.out.println("Pass: Test9F Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9F Fail for data move operation ");
			System.out.println("Fail: Test9F Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}

