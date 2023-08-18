package BlackView_Tab10;
import org.testng.annotations.Test;
import BlackView_Tab10.Test9F;
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

public class Test9F
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Tab10");
		dc.setCapability(MobileCapabilityType.UDID, "DKTAB10EEA009304");
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
		System.out.println("2.Move captured front images from camera folder to Test9F folder");
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
		((StartsActivity) driver).startActivity(new Activity("com.blackview.launcher", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
				

				//Launch Camera application for rear camera video recording.
				logger.info("Launch Camera application for front camera Image capture");
				System.out.println("Launch Camera application for front camera Image capture");
				((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
				TimeUnit.SECONDS.sleep(6);
				try {
				//Declare number of front camera resolution
				logger.info("Test9F_Fcam_res: 3 resolutions supported");
				System.out.println("Test9F_Fcam_res: 3 resolutions supported");
				
		
				//Select Photo mode option
				logger.info("Select photo mode option");
				System.out.println("Select photo mode option");
				driver.findElement(By.xpath("//*[@text='Picture']")).click();

		//Switch to Front Video camera mode
		logger.info("Switch to front  camera mode");
		System.out.println("Switch to front video camera mode");
		MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_switcher']"));
		SwitchToFrontCamera.click();
		TimeUnit.SECONDS.sleep(3);

		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/mode']"));
		Settings.click();
		TimeUnit.SECONDS.sleep(5);

		//Click On Storage path
		logger.info("Select Storagepath option");
		System.out.println("Select Storagepath option");
		MobileElement Storagepath = driver.findElement(By.xpath("//*[@text='Storage Path']"));
		Storagepath .click();
		TimeUnit.SECONDS.sleep(5);

		//Select SD Card
		logger.info("Select SD as storage option");
		System.out.println("Select SD as storage option");
		MobileElement Sdcard = driver.findElement(By.xpath("//*[@text='SD card storage']"));
		Sdcard.click();
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

	//Click On Settings
	logger.info("Select settings option");
	System.out.println("Select settings option");
	MobileElement Setting1 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/mode']"));
	Setting1.click();
	TimeUnit.SECONDS.sleep(5);

		
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize = driver.findElement(By.xpath("//*[@text='Picture size']"));
		RearPhotoSize.click();
		TimeUnit.SECONDS.sleep(3);

		//Select 1st photo resolution
		logger.info("Select front camera front image resolution: 8M(4:3)");
		System.out.println("Select front camera front image resolution: 8M(4:3)");
		driver.findElement(By.xpath("//*[@text='8M(4:3)']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		Properties prop = new Properties();
		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
		System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
		int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);

		int j=0;
		for(j = 0; j < totalPictureCountFrontInt; j++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			//Start image capture
			driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing first resolution image "+j);
			logger.info("Captureing first resolution image "+j);

		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/mode']"));
		Settings2.click();
		TimeUnit.SECONDS.sleep(5);
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize1 = driver.findElement(By.xpath("//*[@text='Picture size']"));
		RearPhotoSize1.click();
		TimeUnit.SECONDS.sleep(3);

		//Select 3:4 
		logger.info("Select front camera second image resolution: 5M(16:9)");
		System.out.println("Select front camera second image resolution: 5M(16:9)");
		driver.findElement(By.xpath("//*[@text='5M(16:9)']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
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
			driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing second resolution image "+j1);
			logger.info("Captureing second resolution image "+j1);
		}
		TimeUnit.SECONDS.sleep(2);

		//Click On Settings
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/mode']"));
		Settings3.click();
		TimeUnit.SECONDS.sleep(5);
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		MobileElement RearPhotoSize2 = driver.findElement(By.xpath("//*[@text='Picture size']"));
		RearPhotoSize2.click();
		TimeUnit.SECONDS.sleep(3);

		//Click 9:16
		logger.info("Select front camera third image resolution: 5M(1:1)");
		System.out.println("Select front camera third image resolution: 5M(1:1)");
		driver.findElement(By.xpath("//*[@text='5M(1:1)']")).click();
		TimeUnit.SECONDS.sleep(3);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
		System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
		int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
		int j2=0;
		for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
		{ 
			TimeUnit.SECONDS.sleep(2);
			logger.info("Start image capture");
			driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/shutter_button']")).click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Captureing third resolution image "+j2);
			logger.info("Captureing third resolution image "+j2);
		}
		TimeUnit.SECONDS.sleep(2);	

		

		

		//Switch to Front camera mode
		logger.info("Switch to back camera mode");
		System.out.println("Switch to back camera mode");
		MobileElement SwitchTobackCamera = driver.findElement(By.xpath("//*[@resource-id='com.mediatek.camera:id/camera_switcher']"));
		SwitchTobackCamera.click();



		// switch to back camera
		TimeUnit.SECONDS.sleep(5);
		//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
		//TimeUnit.SECONDS.sleep(5);
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
		logger.info("Launch file manager application and verify captured images present  in uSD Card");
		System.out.println("Launch file manager application and verify captured images present in uSD Card");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//If file manager permission request access accept allow permission
		

		
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
			System.out.println("Test9F_Fcam_image: " + TotalCount + "  images Captured succesfull" );
			logger.info("Test9F_Fcam_image: " + TotalCount + "  images Captured succesfull" );



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

			logger.info("Fail: Test9F Fail for front camera Image capture");

			System.out.println("\nFail: Test9F Fail for front camera Image capture");


			//logger.info("Final Message: Pass Test9 Pass for Rear camera image capture  successfully");
			//System.out.println("Final Message: Pass Test9 Pass for Rear camera image capture  successfully");

		}


		logger.info("calling DataMoveOperation() ");
		System.out.println("calling DataMoveOperation()");
		DataMoveOperation();
		if(Result=="Pass")
		{
			logger.info("Final Message: Pass Test9F Pass for front Camera image capture");
			System.out.println("Final Message: Pass Test9F Pass for front Camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
		else
		{
			logger.info("Final Message: Pass Test9F Pass for front Camera image capture");
			System.out.println("Final Message: Pass Test9F Pass for front Camera image capture");
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
		System.out.println("Final Message: Fail Test9F for rear camera image capture");
		logger.info("Final Message: Fail Test9F for rear camera image capture");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

	}
}

public void DataMoveOperation() throws  IOException, InterruptedException {

	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
	isPaused = true;
	try {
		logger.info("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
		System.out.println("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);

		

		//Select External Storage	
		logger.info("Select external storage");
		System.out.println("Select external storage");
		MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
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
		TimeUnit.SECONDS.sleep(30);

		logger.info("Cut paste   operation completed successfully");
		System.out.println("Cut paste   operation completed successfully");

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

		logger.info("Test9F: Data move operation completed successfully");
		System.out.println("Test9F: Data move operation completed successfully");
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
			logger.info("Pass: Test9F Pass for data move operation successfully");	
			System.out.println("Pass: Test9F Pass for data move operation successfully");	
		}


	}
	catch (Exception e) {
		e.printStackTrace();
		if (Result == "Fail")
		{
			logger.info("Fail: Test9F Fail for data move operation ");
			System.out.println("Fail: Test9F Fail for data move operation");	
		}

	}

}  	
}