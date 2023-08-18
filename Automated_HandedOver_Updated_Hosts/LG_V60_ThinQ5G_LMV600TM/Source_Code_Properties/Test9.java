package LG_V60_ThinQ5G_LMV600TM;

import org.testng.annotations.Test;

import LG_V60_ThinQ5G_LMV600TM.Test9;

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

public class Test9
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "V60 ThinQ 5G");
		dc.setCapability(MobileCapabilityType.UDID, "LMV600TMf10a3580");
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
		FileHandler fileHandler = new FileHandler("status_log_Test9.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9 Scenario is follows:");
		logger.info("1.Launch camera application, set uSD as a Storage option, start rear camera Image capture for all host resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9 Scenario is follows:");
		System.out.println("Launch camera application, set USD as a Storage option, start rear camera Image capture for all host resolutions");
		System.out.println("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";
		// initialize sum
		int TotalCount = 0; 
		int i;
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
		((StartsActivity) driver).startActivity(new Activity("com.lge.launcher3", "com.lge.launcher3.LauncherExtension"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			//TimeUnit.SECONDS.sleep(5);
			MobileElement clearall =	driver.findElement(By.xpath("//*[@text='Clear all']"));
			clearall.click();
			TimeUnit.SECONDS.sleep(3);
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test9 Pass for clearing Recent apps ");
			System.out.println("Pass: Test9 Pass for clearing Recent apps ");
		}

		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try 
		{ 
			//Launch Camera application for rear Picture capture for all host resolution
			logger.info("Launch Camera application for rear Picture capture for all host resolution");
			System.out.println("Launch Camera application for rear Picture capture for all host resolution");
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			try 
			{ 
				logger.info("clcik on next");
				System.out.println("clcik on next");
				driver.findElement(By.xpath("//*[@text='Next']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("clcik on done");
				System.out.println("clcik on done");
				driver.findElement(By.xpath("//*[@text='Done']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("clcik on later");
				System.out.println("clcik on later");
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("clcik on later");
				System.out.println("clcik on later");
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp);
			}
			try 
			{ 
				logger.info("clcik on later");
				System.out.println("clcik on later");
				driver.findElement(By.xpath("//*[@text='Later']")).click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp);
			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Test9_Bcam_res: 9 resolutions supported");
			System.out.println("Test9_Bcam_res: 9 resolutions supported");
			
			//Click On Settings and set uSD card as storage option
			logger.info("Click On Settings and set uSD card as storage option");
			System.out.println("Click On Settings and set uSD card as storage option");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Storage\"))"));
			//select Data  storage option
			logger.info("Select storage location option");
			System.out.println("Select storage location option");
			driver.findElement(By.xpath("//*[@text='Storage']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select uSD card as storage option
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction0 = new TouchAction(driver);
			touchAction0.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select first Image Resoution: 4:3 (64MP) 9248x6936");
			System.out.println("Select first Image Resoution: 4:3 (64MP) 9248x6936");
			driver.findElement(By.xpath("//*[@bounds='[179,261][683,327]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
			System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
			int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
			// capture  pics for the selected resolution
			int j=0;
			for( j = 0; j < totalPictureCountRearInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction00 = new TouchAction(driver);
				touchAction00.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 1st Resolutions 4:3 (64MP) 9248x6936: "+j);
				logger.info("clicking Image of 1st Resolutions 4:3 (64MP) 9248x6936: "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera first resolution: " + j + " images Captured succesfull");
			System.out.println("Back camera first resolution: " + j + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction1 = new TouchAction(driver);
			touchAction1.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 2nd Image Resoution: 4:3 (16MP) 4624x3468");
			System.out.println("Select 2nd Image Resoution: 4:3 (16MP) 4624x3468");
			driver.findElement(By.xpath("//*[@bounds='[179,404][683,470]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");  
			System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1);
			int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear1);
			// capture  pics for the selected resolution
			int j1=0;
			for( j1 = 0; j1 < totalPictureCountRear1Int; j1++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction01 = new TouchAction(driver);
				touchAction01.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 2nd Resolutions 4:3 (16MP) 4624x3468: "+j1);
				logger.info("clicking Image of 2nd Resolutions 4:3 (16MP) 4624x3468: "+j1);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Back camera second resolution: " + j1 + " images Captured succesfull" );
			logger.info("Back camera second resolution: " + j1 + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction2 = new TouchAction(driver);
			touchAction2.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 3rd Image Resoution: 4:3 (6.1MP) 2848x2136");
			System.out.println("Select 3rd Image Resoution: 4:3 (6.1MP) 2848x2136");
			driver.findElement(By.xpath("//*[@bounds='[179,547][696,613]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");  
			System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2);
			int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
			// capture  pics for the selected resolution
			int j2=0;
			for( j2 = 0; j2 < totalPictureCountRear1Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction02 = new TouchAction(driver);
				touchAction02.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 3rd Resolutions 4:3 (6.1MP) 2848x2136: "+j2);
				logger.info("clicking Image of 3rd Resolutions 4:3 (6.1MP) 2848x2136: "+j2);

			}
			TimeUnit.SECONDS.sleep(2);	
			logger.info("Back camera third resolution: " + j2 + " images Captured succesfull" );
			System.out.println("Back camera third resolution: " + j2 + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction3 = new TouchAction(driver);
			touchAction3.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 4th Image Resoution: 16:9 (12 MP) 4624x2600");
			System.out.println("Select 4th Image Resoution: 16:9 (12 MP) 4624x2600");
			driver.findElement(By.xpath("//*[@bounds='[179,690][711,756]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear3 = prop.getProperty("totalPictureCountRear3");  
			System.out.println("totalPictureCountRear3 = "+ totalPictureCountRear3);
			int totalPictureCountRear3Int=Integer.parseInt(totalPictureCountRear3);
			// capture  pics for the selected resolution
			int j3=0;
			for( j3 = 0; j3 < totalPictureCountRear3Int; j3++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction03 = new TouchAction(driver);
				touchAction03.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 4th Resolutions 16:9 (12 MP) 4624x2600: "+j3);
				logger.info("clicking Image of 4th Resolutions 16:9 (12 MP) 4624x2600: "+j3);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera fourth resolution: " + j3 + " images Captured succesfull");
			System.out.println("Back camera fourth resolution: " + j3 + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction4 = new TouchAction(driver);
			touchAction4.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 5th Image Resoution: 1:1 (12 MP) 3468x3468");
			System.out.println("Select 5th Image Resoution: 1:1 (12 MP) 3468x3468");
			driver.findElement(By.xpath("//*[@bounds='[179,976][683,1042]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop4 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear4 = prop.getProperty("totalPictureCountRear4");  
			System.out.println("totalPictureCountRear4 = "+ totalPictureCountRear4);
			int totalPictureCountRear4Int=Integer.parseInt(totalPictureCountRear4);
			// capture  pics for the selected resolution
			int j4=0;
			for( j4 = 0; j4 < totalPictureCountRear3Int; j4++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction04 = new TouchAction(driver);
				touchAction04.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 5th Resolutions 1:1 (12 MP) 3468x3468: "+j4);
				logger.info("clicking Image of 5th Resolutions 1:1 (12 MP) 3468x3468: "+j4);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera 5th resolution: " + j4 + " images Captured succesfull");
			System.out.println("Back camera 5th resolution: " + j4 + " images Captured succesfull" );
			TimeUnit.SECONDS.sleep(5);
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction5 = new TouchAction(driver);
			touchAction5.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 6th Image Resoution: 16:9 (4Point6 MP) 2848x1602");
			System.out.println("Select 6th Image Resoution: 16:9 (4Point6 MP) 2848x1602");
			driver.findElement(By.xpath("//*[@bounds='[179,833][724,899]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop5 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear5 = prop.getProperty("totalPictureCountRear5");  
			System.out.println("totalPictureCountRear5 = "+ totalPictureCountRear5);
			int totalPictureCountRear5Int=Integer.parseInt(totalPictureCountRear5);
			// capture  pics for the selected resolution
			int j5=0;
			for( j5 = 0; j5 < totalPictureCountRear3Int; j5++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction05 = new TouchAction(driver);
				touchAction05.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 6th Resolutions 16:9 (4Point6 MP) 2848x1602: "+j5);
				logger.info("clicking Image of 6th Resolutions FullVision 16:9 (4Point6 MP) 2848x1602: "+j5);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera 6th resolution: " + j5 + " images Captured succesfull");
			System.out.println("Back camera 6th resolution: " + j5 + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction6 = new TouchAction(driver);
			touchAction6.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 7th Image Resoution: 1:1 (3.4MP) 1836x1836");
			System.out.println("Select 7th Image Resoution: 1:1 (3.4MP) 1836x1836");
			driver.findElement(By.xpath("//*[@bounds='[179,1119][696,1185]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop6 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear6 = prop.getProperty("totalPictureCountRear6");  
			System.out.println("totalPictureCountRear6 = "+ totalPictureCountRear6);
			int totalPictureCountRear6Int=Integer.parseInt(totalPictureCountRear6);
			// capture  pics for the selected resolution
			int j6=0;
			for( j6 = 0; j6 < totalPictureCountRear3Int; j6++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction06 = new TouchAction(driver);
				touchAction06.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 7th Resolutions 1:1 (3.4MP) 1836x1836: "+j6);
				logger.info("clicking Image of 7th Resolutions 1:1 (3.4MP) 1836x1836: "+j6);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera 7th resolution: " + j6 + " images Captured succesfull");
			System.out.println("Back camera 7th resolution: " + j6 + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction7 = new TouchAction(driver);
			touchAction7.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
		
			//Select 1st resolution
			logger.info("Select 8th Image Resoution: FullVision (9.4MP) 4624x2032");
			System.out.println("Select 8th Image Resoution: FullVision (9.4MP) 4624x2032");
			driver.findElement(By.xpath("//*[@bounds='[179,1262][841,1328]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop7 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear7 = prop.getProperty("totalPictureCountRear7");  
			System.out.println("totalPictureCountRear7 = "+ totalPictureCountRear7);
			int totalPictureCountRear7Int=Integer.parseInt(totalPictureCountRear7);
			// capture  pics for the selected resolution
			int j7=0;
			for( j7 = 0; j7 < totalPictureCountRear3Int; j7++)  
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction07 = new TouchAction(driver);
				touchAction07.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 8th Resolutions FullVision (9.4MP) 4624x2032: "+j7);
				logger.info("clicking Image of 8th Resolutions FullVision (9.4MP) 4624x2032: "+j7);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera 8th resolution: " + j7 + " images Captured succesfull");
			System.out.println("Back camera 8th resolution: " + j7 + " images Captured succesfull" );
			logger.info("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			System.out.println("Host going to sleep mode for 2 minutes because phone temperature has increased, Please use it after a while");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(120);
			((StartsActivity) driver).startActivity(new Activity("com.lge.camera", "com.lge.camera.CameraAppLauncher"));
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Image Resolution to select first resolution
			logger.info("Select Rear Image Size");
			System.out.println("Select Rear Image Size");
			TouchAction touchAction8 = new TouchAction(driver);
			touchAction8.tap(PointOption.point(106, 137)).perform();
			TimeUnit.SECONDS.sleep(3);
			//Click On Settings option to select rear camera resolution
			logger.info("Select camera Resolution");
			System.out.println("Select camera Resolution");
			driver.findElement(By.xpath("//*[@text='Photo size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select 9th Image Resoution: FullVision (3.6MP) 2848x1252");
			System.out.println("Select 9th Image Resoution: FullVision (3.6MP) 2848x1252");
			driver.findElement(By.xpath("//*[@bounds='[179,1405][841,1471]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop8 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear8 = prop.getProperty("totalPictureCountRear8");  
			System.out.println("totalPictureCountRear8 = "+ totalPictureCountRear8);
			int totalPictureCountRear8Int=Integer.parseInt(totalPictureCountRear8);
			// capture  pics for the selected resolution
			int j8=0;
			for( j8 = 0; j8 < totalPictureCountRear8Int; j8++)  
			{ 
				TimeUnit.SECONDS.sleep(2);
				TouchAction touchAction08 = new TouchAction(driver);
				touchAction08.tap(PointOption.point(540, 2067)).perform();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 8th Resolutions FullVision (3.6MP) 2848x1252: "+j8);
				logger.info("clicking Image of 8th Resolutions FullVision (3.6MP) 2848x1252: "+j8);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Back camera 9th resolution: " + j8 + " images Captured succesfull");
			System.out.println("Back camera 9th resolution: " + j8 + " images Captured succesfull" );
			TotalCount += j+j1+j2+j3+j4+j5+j6+j7+j8;
			System.out.println("Total Count value: " + TotalCount + " images to be Captured " );
			logger.info("Total Count value: " + TotalCount + " images to be Captured " );
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			Result ="Pass";
			//Launch File manager
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
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
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
			TimeUnit.SECONDS.sleep(5);
			System.out.print("Test9_Bcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 
			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop9 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	

			double TolerancePercentage = (Tolerance_LevelInt/100)*TotalCount;				
			//System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>=TolerancePercentage*TotalCount)
			{
				logger.info("Pass: Test9 pass for rear Image capture");
				System.out.println("\nPass: Test9 pass for rear Image capture");
				System.out.println("Test9 Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9 Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
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
				logger.info("Fail: Test9 Fail for rear camera Image capture");
				System.out.println("\nFail: Test9 Fail for rear camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			//calling DataMoveOperation()
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9 Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9 Fail for Data Move Operation");
			}
			else {
				Result= "Pass";
				logger.info("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				System.out.println("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}

		}
		catch (Exception e) {

			logger.info("Fail: Test9 fail for Fail Count Issue");
			System.out.println("\nFail: Test9 fail for Fail Count Issue");
			logger.info("Fail: Test9 fail for rear Image capture");
			System.out.println("\nFail: Test9 fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			System.out.println("Final message: Fail Test9 for rear camera image capture");
			logger.info("Final message: Fail Test9 for rear camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		isPaused = true;
		try {
			logger.info("Re-launch file manager application and select external storage for data move operation, select all rear camera images files present in camera folder and move to Test9 folder");
			System.out.println("Re-launch file manager application and select external storage for data move operation, select all rear camera images files present in camera folder and move to Test9 folder");
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
			logger.info("Name folder as Test9");
			System.out.println("Name folder as Test9");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9");
			TimeUnit.SECONDS.sleep(5);
			//Click Create option
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
			TimeUnit.SECONDS.sleep(30);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			logger.info("Test9: Data move operation completed successfully");
			System.out.println("Test9: Data move operation completed successfully");
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
				logger.info("Pass: Test9 Pass for data move operation successfully");	
				System.out.println("Pass: Test9 Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9 Fail for data move operation ");
			System.out.println("Fail: Test9 Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}



