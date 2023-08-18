package Oppo_A92;
import org.testng.annotations.Test;
import Oppo_A92.Test9;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A92");
		dc.setCapability(MobileCapabilityType.UDID, "9a424d83");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void FrontPictureCapture() throws InterruptedException, SecurityException, IOException {
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
		logger.info("Test9F Scenario is follows:");
		logger.info("1.Launch camera application, set uSD as a Storage option, start front camera Image capture for all host resolutions");
		logger.info("2.Move Captured front camera images to Test9F folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F Scenario is follows:");
		System.out.println("1.Launch camera application, set uSD as a Storage option, start front camera Image capture for all host resolutions");
		System.out.println("2.Move Captured front camera images to Test9F folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		// initialize sum
		int TotalCount = 0; 
		int i;
		//Launch Home screen and Clear recent apps
		logger.info("Launch Home screen and Clear recent apps");
		System.out.println("Launch Home screen and Clear recent apps");
		//((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try 
		{ 
			//Launch Camera Application for Front camera picture Capture for all Host resolutions.
			logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
			//If Permission request pop-up exists allow permissions
			try 
			{ 
				//Click Deny Option
				logger.info("Select deny option");
				System.out.println("Select deny option");
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Click Ok option
				logger.info("Select ok option");
				System.out.println("Select ok option");
				driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp);
			}
			TimeUnit.SECONDS.sleep(2);
			//front camera 4 image resolutions supports
			logger.info("Test9F_Fcam_res: 4 resolutions supported");
			System.out.println("Test9F_Fcam_res: 4 resolutions supported");
			TimeUnit.SECONDS.sleep(2);
			//Click settings options
			logger.info("Click Settings option");
			System.out.println("Click Settings option");
			driver.findElement(By.xpath("//*[@bounds='[888,0][1005,240]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Search for Advanced settings option");
			System.out.println("Search forAdvanced settings option");
			String text = "Storage location";
			driver.findElement(By.xpath("//*[@text='Advanced settings']")).click();
			TimeUnit.SECONDS.sleep(3);
			try {
				//Select SD Card
				logger.info("Select SD as storage option");
				System.out.println("Select SD as storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD Card Preferred\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select turn on option");
				System.out.println("Select turn on option");
				driver.findElement(By.xpath("//*[@text='Turn On']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
				//Select SD Card
				logger.info("Select SD as storage option");
				System.out.println("Select SD as storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save to SD Card Preferred\")").click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Select turn on option");
				logger.info("Select turn on option");
				driver.findElement(By.xpath("//*[@text='Turn On']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			//Click On Click on front camera
			logger.info("Click on front camera");
			System.out.println("Click on front camera");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Rear Camera\"]")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@bounds='[480,240][600,294]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select first Image Resoution: 4:3 ");
			System.out.println("Select first Image Resoution: 4:3 ");
			driver.findElement(By.xpath("//*[@bounds='[405,291][519,405]']")).click();
			TimeUnit.SECONDS.sleep(3);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
			System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
			int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);
			// capture  pics for the selected resolution
			int j=0;
			for(j = 0; j < totalPictureCountFrontInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.oppo.camera:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions4:3 : "+j);
				logger.info("clicking Image of 1st Resolutions 4:3 : "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("front camera first resolution:" + j + " images Captured succesfull");
			System.out.println("front camera first resolution:" + j + " images Captured succesfull" );
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@bounds='[480,240][600,294]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2nd resolution
			logger.info("Select second Image Resoution: 1:1");
			System.out.println("Select second Image Resoution: 1:!");
			driver.findElement(By.xpath("//*[@bounds='[567,291][681,405]']")).click();
			TimeUnit.SECONDS.sleep(3);
			Properties prop1 = new Properties();
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
				driver.findElement(By.id("com.oppo.camera:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 2nd Resolutions 1:1 : "+j1);
				logger.info("clicking Image of 2nd Resolutions 1:1 : "+j1);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("front camera second resolution:" + j1 + " images Captured succesfull" );
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@bounds='[480,240][600,294]']")).click();
			TimeUnit.SECONDS.sleep(2);
			//Select 2ND resolution
			logger.info("Select first third Resoution:Full");
			System.out.println("Select third Image Resoution: Full");
			driver.findElement(By.xpath("//*[@bounds='[729,291][843,405]']")).click();
			TimeUnit.SECONDS.sleep(3);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
			System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
			int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
			// capture  pics for the selected resolution
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.oppo.camera:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 3rd ResolutionsFull: "+j2);
				logger.info("clicking Image of 3rd Resolutions Full: "+j2);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("front camera third resolution:" + j2 + " images Captured succesfull" );
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@bounds='[480,240][600,294]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 4th resolution
			logger.info("Select fourth Image Resoution: 16:9");
			System.out.println("Select fourth Image Resoution: 16:9");
			driver.findElement(By.xpath("//*[@bounds='[891,291][1005,405]']")).click();
			TimeUnit.SECONDS.sleep(3);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
			System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3);
			int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
			// capture  pics for the selected resolution
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountFront3Int; j3++)  
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.oppo.camera:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 4th Resolutions 16:9: "+j3);
				logger.info("clicking Image of 4th Resolutions 16:9: "+j3);
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera fourth resolution:" + j3 + " images Captured succesfull" );
			logger.info("Back camera fourth resolution:" + j3 + " images Captured succesfull" );
			TotalCount += j+j1+j2+j3;
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			// switch to back camera
			logger.info("switch to back camera");
			System.out.println("switch to back camera");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front Camera\"]")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
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
				logger.info("Pass: Test9F pass for rear Image capture");
				System.out.println("\nPass: Test9F pass for rear Image capture");
				System.out.println("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(3);
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
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
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
	public void DataMoveOperation() throws  IOException, InterruptedException {		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
	isPaused = true;
	try {
		logger.info("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
		System.out.println("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

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
		logger.info("Cut paste files operation completed successfully");
		System.out.println("Cut paste files operation completed successfully");
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