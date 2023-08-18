package Realme_C25Y_RMX3265;

import org.testng.annotations.Test;
import Realme_C25Y_RMX3265.Test9;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C25Y");
		dc.setCapability(MobileCapabilityType.UDID, "1929171000018177");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void FrontPictureCapture() throws InterruptedException, SecurityException, IOException {
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
		logger.info("Test9F Scenario is as follows:");
		logger.info("1.Launch camera application, set internal as a Storage option, start Front camera image picture capture for all Host front resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F Scenario is as follows:");
		System.out.println("Launch camera application, set internal as a Storage option, start Front camera image picture capture for all Host front resolutions");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		// initialize sum
		int TotalCount = 0; 
		int i;

		//clear recent apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CLEAR ALL\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test9F_Int Pass for clearing Recent apps ");
			System.out.println("Pass: Test9F_Int Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(4);
		try {
			//Launch Camera Application for Front camera picture Capture for all Host resolutions.
			logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraActivity"));
			//If Permission request pop-up exists allow permissions
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

			}
			try
			{
				logger.info("Allow Camera to access this device�s location?");
				System.out.println("Allow Camera to access this device�s location?");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"WHILE USING THE APP\")").click();
				TimeUnit.SECONDS.sleep(5);
				driver.findElement(By.xpath("//*[@text='START CAPTURE']")).click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(5);
			logger.info("Test9F_Int_Fcam_res: 6 resolutions supported");
			System.out.println("Test9F_Int_Fcam_res: 6 resolutions supported");
			//Click On Click on front camera
			logger.info("Click on front camera");
			System.out.println("Click on front camera");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Back camera\"]")).click();
			TimeUnit.SECONDS.sleep(3);
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,160]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select first Image Resoution: (4:3) 8.0 megapixels ");
			System.out.println("Select first Image Resoution:(4:3) 8.0 megapixels ");
			driver.findElement(By.xpath("//*[@bounds='[50,509][670,621]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront_Int = prop.getProperty("totalPictureCountFront_Int");  
			System.out.println("totalPictureCountFront_Int= "+ totalPictureCountFront_Int);
			int totalPictureCountFront_IntInt=Integer.parseInt(totalPictureCountFront_Int);
			// capture  pics for the selected resolution
			int j=0;
			for(j = 0; j < totalPictureCountFront_IntInt; j++)
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions (4:3) 8.0 megapixels : "+j);
				logger.info("clicking Image of 1st Resolutions (4:3) 8.0 megapixels : "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("front camera first resolution:" + j + " images Captured succesfull");
			System.out.println("front camera first resolution:" + j + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,160]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2nd resolution
			logger.info("Select second Image Resoution: (4:3) 4.0 megapixels");
			System.out.println("Select second Image Resoution: (4:3) 4.0 megapixels");
			driver.findElement(By.xpath("//*[@bounds='[50,621][670,733]']")).click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront_Int1 = prop.getProperty("totalPictureCountFront_Int1");  
			System.out.println("totalPictureCountFront_Int1= "+ totalPictureCountFront_Int1);
			int totalPictureCountFront_Int1Int=Integer.parseInt(totalPictureCountFront_Int1);
			// capture  pics for the selected resolution
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountFront_Int1Int; j1++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 2nd Resolutions (4:3) 4.0 megapixels : "+j1);
				logger.info("clicking Image of 2nd Resolutions (4:3) 4.0 megapixels : "+j1);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("front camera second resolution:" + j1 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,160]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2ND resolution
			logger.info("Select first third Resoution:(4:3) 1.9 megapixels");
			System.out.println("Select third Image Resoution: (4:3) 1.9 megapixels");
			driver.findElement(By.xpath("//*[@bounds='[50,733][670,845]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront_Int2 = prop.getProperty("totalPictureCountFront_Int2");  
			System.out.println("totalPictureCountFront_Int2= "+ totalPictureCountFront_Int2);
			int totalPictureCountFront_Int2Int=Integer.parseInt(totalPictureCountFront_Int2);
			// capture  pics for the selected resolution
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront_Int2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 3rd Resolutions (4:3) 1.9 megapixels: "+j2);
				logger.info("clicking Image of 3rd Resolutions (4:3) 1.9 megapixels: "+j2);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("front camera third resolution:" + j2 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,160]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 4th resolution
			logger.info("Select fourth Image Resoution: (16:9) 6.0 megapixels");
			System.out.println("Select fourth Image Resoution: (16:9) 6.0 megapixels");
			driver.findElement(By.xpath("//*[@bounds='[50,845][670,957]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront_Int3 = prop.getProperty("totalPictureCountFront_Int3");  
			System.out.println("totalPictureCountFront_Int3= "+ totalPictureCountFront_Int3);
			int totalPictureCountFront_Int3Int=Integer.parseInt(totalPictureCountFront_Int3);
			// capture  pics for the selected resolution
			int j3=0;
			for(j3 = 0; j2 < totalPictureCountFront_Int3Int; j3++) 
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 4th Resolutions (16:9) 6.0 megapixels: "+j3);
				logger.info("clicking Image of 4th Resolutions (16:9) 6.0 megapixels: "+j3);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera 4th resolution:" + j3 + " images Captured succesfull" );
			logger.info("front camera 4th resolution:" + j3 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,160]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 4th resolution
			logger.info("Select fifth Image Resoution: (16:9) 2.4 megapixels");
			System.out.println("Select fifth Image Resoution: (16:9) 2.4 megapixels");
			driver.findElement(By.xpath("//*[@bounds='[50,957][670,1069]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront_Int4 = prop.getProperty("totalPictureCountFront_Int4");  
			System.out.println("totalPictureCountFront_Int4= "+ totalPictureCountFront_Int4);
			int totalPictureCountFront_Int4Int=Integer.parseInt(totalPictureCountFront_Int4);
			// capture  pics for the selected resolution
			int j4=0;
			for(j4 = 0; j4 < totalPictureCountFront_Int4Int; j4++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 5th Resolutions (16:9) 2.4 megapixels: "+j4);
				logger.info("clicking Image of 5th Resolutions (16:9) 2.4 megapixels: "+j4);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera 5th resolution:" + j4 + " images Captured succesfull" );
			logger.info("front camera 5th resolution:" + j4 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[624,64][720,160]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture size(Front camera)']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 4th resolution
			logger.info("Select sixth Image Resoution: (16:9) 2.1 megapixels");
			System.out.println("Select sixth Image Resoution: (16:9) 2.1 megapixels");
			driver.findElement(By.xpath("//*[@bounds='[50,1069][670,1181]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop5 = new Properties();
			// Load properties file
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront_Int5 = prop.getProperty("totalPictureCountFront_Int5");  
			System.out.println("totalPictureCountFront_Int5= "+ totalPictureCountFront_Int5);
			int totalPictureCountFront_Int5Int=Integer.parseInt(totalPictureCountFront_Int5);
			// capture  pics for the selected resolution
			int j5=0;
			for(j5 = 0; j5 < totalPictureCountFront_Int5Int; j5++) 
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 4th Resolutions (16:9) 2.1 megapixels: "+j5);
				logger.info("clicking Image of 4th Resolutions (16:9) 2.1 megapixels: "+j5);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera 6th resolution:" + j5 + " images Captured succesfull" );
			logger.info("front camera 6th resolution:" + j5 + " images Captured succesfull" );
			// switch to back camera
			System.out.println("select back camera mode");
			logger.info("select back camera mode");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front camera\"]")).click();
			TimeUnit.SECONDS.sleep(5);
			TotalCount += j+j1+j2+j3+j4+j5;
			System.out.println("Total Count value: " + TotalCount + " images to be Captured " );
			logger.info("Total Count value: " + TotalCount + " images to be Captured " );
			TimeUnit.SECONDS.sleep(5);

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result ="Pass";
			logger.info("Launch file manager application and verify captured images present  in internal storage");
			System.out.println("Launch file manager application and verify captured images present in internal storage");
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
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(6);
			MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(6);
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
			TimeUnit.SECONDS.sleep(3);
			System.out.print("Test9F_Int_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 
			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop7 = new Properties();
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
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(5);
			}
			else {

				logger.info("Fail: Test9F_Int Fail for front camera Image capture");
				System.out.println("Fail: Test9F_Int Fail for front camera Image capture");
				System.out.println("\nFail: Test9F_Int Fail for front camera Image capture");
				logger.info("\nFail: Test9F_Int Fail for front camera Image capture");
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
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
			logger.info("Re-launch file manager application and select internal storage for data move operation, select all front camera images files present in camera folder and move to Test9F_Int folder");
			System.out.println("Re-launch file manager application and select internal storage for data move operation, select all front camera images files present in camera folder and move to Test9F_Int folder");
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
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F_Int");
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
			logger.info("Select Test9F_Int");
			System.out.println("select Test9F_Int");
			MobileElement uSD1 =	driver.findElement(By.xpath("//*[@text='Test9F_Int']"));
			uSD1.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Create option
			logger.info("Accept Move here");
			System.out.println("Accept Move here");
			driver.findElement(By.xpath("//*[@text='Move here']")).click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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