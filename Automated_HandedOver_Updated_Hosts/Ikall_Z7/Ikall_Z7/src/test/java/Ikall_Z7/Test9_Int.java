package Ikall_Z7;

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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z7");
		dc.setCapability(MobileCapabilityType.UDID, "0123456789ABCDEF");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
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
		logger.info("1.Launch camera application, set Internal as a Storage option, start rear camera Image capture for all host resolutions");
		logger.info("2.Move rear camera image captured files from camera folder to Test9_Int folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9_Int Scenario is follows:");
		System.out.println("1.Launch camera application, set Internal as a Storage option, start rear camera Image capture for all host resolutions");
		System.out.println("2.Move rear camera  captured image files from camera folder to Test9_Int folder");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		SetUp();
		// initialize sum
		int TotalCount = 0; 
		int i;
		//Launch Home screen and clear recent apps
		logger.info("Launch Home screen application and clear recent apps");
		System.out.println("Launch Home screen application and clear recent apps");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Clear all\")").click();
			TimeUnit.SECONDS.sleep(5);
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
		TimeUnit.SECONDS.sleep(2);
		try {
			System.out.println("Record Front camera videos for all Host resolutions in Internal Mount uSD Card");
			logger.info("Record Front camera videos for all Host resolutions in Internal Mount uSD Card");
			TimeUnit.SECONDS.sleep(5);
			//Clear Recenet Apps
			((StartsActivity) driver).startActivity(new Activity("com.mediatek.camera", "com.mediatek.camera.CameraLauncher"));
			TimeUnit.SECONDS.sleep(3);

			logger.info("Test9_Int_Bcam_res: 6 resolutions supported");
			System.out.println("Test9_Int_Bcam_res: 6 resolutions supported");
			//Click Settings Option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click Photo Resolution
			driver.findElement(By.xpath("//*[@text='Picture size']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Photo resolution");
			System.err.println("Click Photo resolution");
			//Select 1st resolution
			driver.findElement(By.xpath("//*[@text='13M(4:3)']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("1st resolution selected 13M(4:3)");
			System.out.println("1st resolution selected 13M(4:3)");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
			System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
			int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
			// capture  pics for the selected resolution
			int j=0;
			for(j = 0; j < totalPictureCountRearInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Picture\"]")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions 13M(4:3)"+j);
				logger.info("clicking Image of 1st Resolutions 13M(4:3)"+j);
			}
			TimeUnit.SECONDS.sleep(2);
			//Select 2nd resolution
			//Click Settings Option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click Photo Resolution
			driver.findElement(By.xpath("//*[@text='Picture size']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Photo resolution");
			System.out.println("Click Photo resolution");
			//Select 2nd resolution
			driver.findElement(By.xpath("//*[@text='9M(16:9)']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("2nd resolution selected 9M(16:9)");
			System.out.println("2nd resolution selected 9M(16:9)");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");  
			System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1);
			int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear1);
			// capture  pics for the selected resolution
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountRear1Int; j1++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Picture\"]")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions 9M(16:9)"+j1);
				logger.info("clicking Image of 1st Resolutions 9M(16:9)"+j1);
			}
			TimeUnit.SECONDS.sleep(2);
			//Select 3rd resolution
			//Click Settings Option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click Photo Resolution
			driver.findElement(By.xpath("//*[@text='Picture size']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Photo resolution");
			System.out.println("Click Photo resolution");
			//Select 1st resolution
			driver.findElement(By.xpath("//*[@text='5M(4:3)']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("3rd resolution selected 5M(4:3)");
			System.out.println("3rd resolution selected 5M(4:3)");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");  
			System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2);
			int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
			// capture  pics for the selected resolution
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountRear2Int; j2++) 
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Picture\"]")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions 5M(4:3)"+j2);
				logger.info("clicking Image of 1st Resolutions 5M(4:3)"+j2);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click Settings Option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click Photo Resolution
			driver.findElement(By.xpath("//*[@text='Picture size']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Photo resolution");
			System.out.println("Click Photo resolution");
			//Select 1st resolution
			driver.findElement(By.xpath("//*[@text='2M(16:9)']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("4th resolution selected 2M(16:9)");
			System.out.println("4th resolution selected 2M(16:9)");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear3 = prop.getProperty("totalPictureCountRear3");  
			System.out.println("totalPictureCountRear3 = "+ totalPictureCountRear3);
			int totalPictureCountRear3Int=Integer.parseInt(totalPictureCountRear3);
			// capture  pics for the selected resolution
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountRear3Int; j3++) 
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Picture\"]")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions 2M(16:9)"+j3);
				logger.info("clicking Image of 1st Resolutions 2M(16:9)"+j3);
			}
			TimeUnit.SECONDS.sleep(2);
			//Click Settings Option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click Photo Resolution
			driver.findElement(By.xpath("//*[@text='Picture size']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Photo resolution");
			System.out.println("Click Photo resolution");
			//Select 1st resolution
			driver.findElement(By.xpath("//*[@text='1M(16:9)']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("5th resolution selected 1M(16:9)");
			System.out.println("5th resolution selected 1M(16:9)");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear4 = prop.getProperty("totalPictureCountRear4");  
			System.out.println("totalPictureCountRear4 = "+ totalPictureCountRear4);
			int totalPictureCountRear4Int=Integer.parseInt(totalPictureCountRear4);
			// capture  pics for the selected resolution
			int j4=0;
			for(j4 = 0; j4 < totalPictureCountRear4Int; j4++) 
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Picture\"]")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions 1M(16:9)"+j4);
				logger.info("clicking Image of 1st Resolutions 1M(16:9)"+j4);

			}
			TimeUnit.SECONDS.sleep(2);
			//Click Settings Option
			driver.findElement(By.xpath("//*[@bounds='[15,83][62,130]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click settings option");
			System.out.println("Click settings option");
			//Click Photo Resolution
			driver.findElement(By.xpath("//*[@text='Picture size']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Click Photo resolution");
			System.out.println("Click Photo resolution");
			//Select 1st resolution
			driver.findElement(By.xpath("//*[@text='VGA']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("6th resolution selected VGA");
			System.out.println("6th resolution selected VGA");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop5 = new Properties();
			// Load properties file
			prop.load(Test9_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear5 = prop.getProperty("totalPictureCountRear5");  
			System.out.println("totalPictureCountRear5 = "+ totalPictureCountRear5);
			int totalPictureCountRear5Int=Integer.parseInt(totalPictureCountRear5);
			// capture  pics for the selected resolution
			int j5=0;
			for(j5 = 0; j5 < totalPictureCountRearInt; j5++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Picture\"]")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 6th Resolutions VGA"+j5);
				logger.info("clicking Image of 6th Resolutions VGA"+j5);

			}
			TimeUnit.SECONDS.sleep(2);
			//Sum total of User provided images resolution count 
			TotalCount += j+j1+j2+j3+j4+j5;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			//Launch file manager application and verify image capture in uInternal Storage.
			Result= "Pass";
			logger.info("Launch file manager application and verify recorded video present  in Internal Storage");
			System.out.println("Launch file manager application and verify recorded video present in Internal Storage");
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
			logger.info("Swipe up to select Internal Storage");
			System.out.println("Swipe up to select Internal Storage");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			MobileElement element04 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			//Click External storage
			logger.info("Select Internal Storage");
			System.out.println("Select Internal Storage");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='Internal Storage']"));
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
				logger.info("Pass: Test9_Int pass for rear Image capture");
				System.out.println("\nPass: Test9_Int pass for rear Image capture");
				System.out.println("Test9_Int_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9_Int_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
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
			//launch file manager application select uInternal Storage-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
			logger.info("launch file manager application select Internal Storage-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 and cut paste all videos in BCFC_Cameravideos folder");
			System.out.println("launch file manager application select Internal Storage-->DCIM folder-->Camera folder-->Select all rear camera images create Test10 folder and cut paste all videos in BCFC_Cameravideos folder");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Swipe and Select external storage
			logger.info("Swipe up to select Internal Storage");
			System.out.println("Swipe up to select Internal Storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
			TimeUnit.SECONDS.sleep(8);
			//Click External storage
			logger.info("Select external storage");
			System.out.println("Select external storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal Storage']"));
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
			logger.info("Name folder as Test9_Int");
			System.out.println("Name folder as Test9_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9_Int");
			TimeUnit.SECONDS.sleep(5);
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Create Folder']"));
			CreateFolder.click();
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
			//Click Internal Storage
			logger.info("Select Internal Storage");
			System.out.println("Select Internal Storage");
			MobileElement SDCard2 =	driver.findElement(By.xpath("//*[@text='Internal Storage']"));
			SDCard2.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch grid view mode
			logger.info("switch to grid view mode to select Test9_Int folder");
			System.out.println("switch to grid view mode to select Test9_Int folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test9_Int_Int folder
			logger.info("Select Test9_Int folder");
			System.out.println("Select Test9_Int folder");
			MobileElement Test9_Int_Int =	driver.findElement(By.xpath("//*[@text='Test9_Int']"));
			Test9_Int_Int.click();
			TimeUnit.SECONDS.sleep(6);
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test9_Int_Int folder
			logger.info("Click move here");
			System.out.println("Click move here");
			MobileElement Move =	driver.findElement(By.xpath("//*[@text='Move here']"));
			Move.click();
			TimeUnit.SECONDS.sleep(40);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}
