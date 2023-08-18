package Realme_C11_2021;
import org.testng.annotations.Test;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C11 2021");
		dc.setCapability(MobileCapabilityType.UDID, "0051716137217082");
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
		// initialize sum
		int TotalCount = 0; 
		int i;
		//clear recent apps
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CLEAR ALL\")").click();
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
		try
		{
			//Launch Camera application for rear Picture capture for all host resolution
			logger.info("Launch Camera application for rear Picture capture for all host resolution");
			System.out.println("Launch Camera application for rear Picture capture for all host resolution");
			((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraActivity"));
			//If Permission reuest pop-up exists allow permissons
			try 
			{ 
				logger.info("Permission request");
				System.out.println("Permission request");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Agree\")").click();
				TimeUnit.SECONDS.sleep(5);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp);
			}
			try
			{
				logger.info("select WHILE USING THE APP");
				System.out.println("select WHILE USING THE APP");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"WHILE USING THE APP\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("select START CAPTURE");
				System.out.println("select START CAPTURE");
				driver.findElement(By.xpath("//*[@text='START CAPTURE']")).click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Test9_Int_Bcam_res: 6 resolutions supported");
			System.out.println("Test9_Int_Bcam_res: 6 resolutions supported");
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,192]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 1st Image Resoution: (4:3) 8.0 megapixels ");
			System.out.println("Select 1st Image Resoution: (4:3) 8.0 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,509][670,621]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int = prop.getProperty("totalPictureCountRear_Int");  
			System.out.println("totalPictureCountRear_Int = "+ totalPictureCountRear_Int);
			int totalPictureCountRear_IntInt=Integer.parseInt(totalPictureCountRear_Int);
			// capture  pics for the selected resolution
			int j=0;
			for( j = 0; j < totalPictureCountRear_IntInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 1st Resolutions (4:3) 8.0 megapixels: "+j);
				logger.info("clicking Image of 1st Resolutions (4:3) 8.0 megapixels: "+j);
			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Rear camera first resolution:" + j + " images Captured succesfull");
			System.out.println("Rear camera first resolution:" + j + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,192]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolutions");
			System.out.println("Select camera resolutions");
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2nd resolution
			logger.info("Select 2nd Image Resoution: (4:3) 4.0 megapixels ");
			System.out.println("Select 2nd Image Resoution:(4:3) 4.0 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,621][670,733]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int1 = prop.getProperty("totalPictureCountRear_Int1");  
			System.out.println("totalPictureCountRear_Int1 = "+ totalPictureCountRear_Int1);
			int totalPictureCountRear_Int1Int=Integer.parseInt(totalPictureCountRear_Int1);
			// capture  pics for the selected resolution
			int j1=0;
			for( j1 = 0; j1 < totalPictureCountRear_Int1Int; j1++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 2nd Resolutions ultra (4:3) 4.0 megapixels: "+j1);
				logger.info("clicking Image of 2nd Resolutions ultra (4:3) 4.0 megapixels: "+j1);

			}
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Rear camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("Rear camera second resolution:" + j1 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,192]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolutions");
			System.out.println("Select camera resolutions");
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 3rd Image Resoution: (4:3) 1.9 megapixels ");
			System.out.println("Select 3rd Image Resoution:(4:3) 1.9 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,733][670,845]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int2 = prop.getProperty("totalPictureCountRear_Int2");  
			System.out.println("totalPictureCountRear_Int2 = "+ totalPictureCountRear_Int2);
			int totalPictureCountRear_Int2Int=Integer.parseInt(totalPictureCountRear_Int2);
			// capture  pics for the selected resolution
			int j2=0;
			for( j2 = 0; j2 < totalPictureCountRear_Int2Int; j2++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 3rd Resolutions ultra (4:3) 1.9 megapixels: "+j2);
				logger.info("clicking Image of 3rd Resolutions ultra (4:3) 1.9 megapixels: "+j2);

			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Rear camera third resolution:" + j2 + " images Captured succesfull" );
			System.out.println("Rear camera third resolution:" + j2 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,192]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolutions");
			System.out.println("Select camera resolutions");
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 4th Image Resoution: (16:9) 6.0 megapixels ");
			System.out.println("Select 4th Image Resoution:(16:9) 6.0 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,845][670,957]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int3 = prop.getProperty("totalPictureCountRear_Int3");  
			System.out.println("totalPictureCountRear_Int3 = "+ totalPictureCountRear_Int3);
			int totalPictureCountRear_Int3Int=Integer.parseInt(totalPictureCountRear_Int3);
			// capture  pics for the selected resolution
			int j3=0;
			for( j3 = 0; j3 < totalPictureCountRear_Int3Int; j3++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 4th Resolutions ultra (16:9) 6.0 megapixels: "+j3);
				logger.info("clicking Image of 4th Resolutions ultra (16:9) 6.0 megapixels: "+j3);

			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Rear camera third resolution:" + j3 + " images Captured succesfull" );
			System.out.println("Rear camera third resolution:" + j3 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,192]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolutions");
			System.out.println("Select camera resolutions");
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 5th Image Resoution: 16:9) 2.4 megapixels ");
			System.out.println("Select 5th Image Resoution:16:9) 2.4 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,957][670,1069]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int4 = prop.getProperty("totalPictureCountRear_Int4");  
			System.out.println("totalPictureCountRear_Int4 = "+ totalPictureCountRear_Int4);
			int totalPictureCountRear_Int4Int=Integer.parseInt(totalPictureCountRear_Int4);
			// capture  pics for the selected resolution
			int j4=0;
			for( j4 = 0; j4 < totalPictureCountRear_Int4Int; j4++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 5th Resolutions ultra 16:9) 2.4 megapixels: "+j4);
				logger.info("clicking Image of 5th Resolutions ultra 16:9) 2.4 megapixels: "+j4);

			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Rear camera 5th resolution:" + j4 + " images Captured succesfull" );
			System.out.println("Rear camera 5th resolution:" + j4 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,192]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolutions");
			System.out.println("Select camera resolutions");
			driver.findElement(By.xpath("//*[@text='Picture size(Back camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 6th Image Resoution: (16:9) 2.1 megapixels");
			System.out.println("Select 6th Image Resoution:(16:9) 2.1 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,1069][670,1181]']")).click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			Properties prop5 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear_Int5 = prop.getProperty("totalPictureCountRear_Int5");  
			System.out.println("totalPictureCountRear_Int5 = "+ totalPictureCountRear_Int5);
			int totalPictureCountRear_Int5Int=Integer.parseInt(totalPictureCountRear_Int5);
			// capture  pics for the selected resolution
			int j5=0;
			for( j5 = 0; j5 < totalPictureCountRear_Int5Int; j5++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 6th Resolutions ultra (16:9) 2.1 megapixels: "+j5);
				logger.info("clicking Image of 6th Resolutions ultra (16:9) 2.1 megapixels: "+j5);

			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Rear camera 6th resolution:" + j5 + " images Captured succesfull" );
			System.out.println("Rear camera 6th resolution:" + j5 + " images Captured succesfull" );
			TotalCount += j+j1+j2+j3+j4+j5;
			System.out.println("Total Count value: " + TotalCount + " images to be Captured " );
			logger.info("Total Count value: " + TotalCount + " images to be Captured " );
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result ="Pass";
			logger.info("Launch file manager application and verify captured imgaes present in internal storage");
			System.out.println("Launch file manager application and verify captured imgaes present in internal storage");
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
			TimeUnit.SECONDS.sleep(3);
			MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(3);
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
			Properties prop7 = new Properties();
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	
			double TolerancePercentage = (Tolerance_LevelInt/100)*TotalCount;				
			//System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>=TolerancePercentage*TotalCount)
			{
				logger.info("Pass: Test9_Int Pass for rear Image capture");
				System.out.println("\nPass: Test9_Int Pass for rear Image capture");
				System.out.println("Test9_Int_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9_Int_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
				logger.info("Final Message: Pass Test9_Int Pass for Rear camera image capture  successfully");
				System.out.println("Final Message: Pass Test9_Int Pass for Rear camera image capture  successfully");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch (Exception e) {

			logger.info("Fail: Test9_Int Fail for Fail Count Issue");
			System.out.println("\nFail: Test9_Int Fail for Fail Count Issue");
			logger.info("Fail: Test9_Int Fail for rear Image capture");
			System.out.println("\nFail: Test9_Int Fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			System.out.println("Final Message: Fail Test9_Int for rear camera image capture");
			logger.info("Final Message: Fail Test9_Int for rear camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		isPaused = true;
		try {
			logger.info("Re-launch file manager application and select internal storage for data move operation, select all rear camera images files present in camera folder and move to Test9_Int folder");
			System.out.println("Re-launch file manager application and select internal storage for data move operation, select all rear camera images files present in camera folder and move to Test9_Int folder");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal stoarge");
			System.out.println("Swipe up to select Internal stoarge");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Click External storage
			logger.info("Select Internal stoarge");
			System.out.println("Select Internal stoarge");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
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
			//click on gird view
			logger.info("Select gird view");
			System.out.println("Select gird view");
			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView.click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("switch to list view mode");
			System.out.println("switch to list view mode");
			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView1.click();
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
			logger.info("Select Internal stoarge");
			System.out.println("select Iternal storage");
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
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste operation completed successfully");
			System.out.println("Cut paste operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
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