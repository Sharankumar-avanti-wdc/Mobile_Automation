package RealMeC21Y;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.PushesFiles;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey; 
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
  
  public class Test18_Int
  {
	  // initializing the driver instance
	  AppiumDriver<MobileElement> driver;
	private MobileElement Test1Folder;
	  	@BeforeTest
		public void SetUp() throws MalformedURLException {
			// set desired capabilities
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C21Y");
			dc.setCapability(MobileCapabilityType.UDID, "1825264110BA062U");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AndroidDriver<MobileElement>(url, dc);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	  	
	  	@Test
		public void CopyPaste() throws InterruptedException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test18_Int.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("========Test18_Int:Transfer for 1GB file from Laptop to Mobile."
	        		+ "Copy Paste 1GB folder from Mobile Internal Memory to uSD Card, Create Folder Test2 in uSD Card and copy paste 1GB folder from Internal memory and "
	        		+ "vise versa+ =========");
			logger.info("Setting up the appium desired capabilities");
			SetUp();
			String Result = "Fail";
			
			
			//Clearing Recent Apps
			
			
			logger.info("Unlocking Phone");
			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		
	  			
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  	
	  		// Click Recent Apps
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		
	  		TimeUnit.SECONDS.sleep(2);
	  		// click on close all
	  		try
	  		{
	  			
	  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
	  			logger.info("Clearing Recent Apps");
	  			TimeUnit.SECONDS.sleep(5);
	  	  		logger.info("Clearing Recent apps ");
	  		
	  		

	  		
	  		}
	  		
	  		
	  		
	  		
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info("No recent apps found in background");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
	  		
	  		

	  		
	  		
	  		
	  		
	  		
	  			//push 1GB folder from PC to mobile's internal memory
	  		//((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\7336135\\Desktop\\TestDlinkAll1_183750\\1GB.zip"));
	  			//TimeUnit.SECONDS.sleep(180);													
	  			// open myfiles application	
	  			
	  			((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\7336135\\Desktop\\TestDlinkAll1_183750\\Test.zip"));

	  			TimeUnit.SECONDS.sleep(60);	
	  			logger.info("Pushing File from Laptop to Mobile");
	  			
	  			
	  			
	  			
	  			//Launch File Manager Application
	  			((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		logger.info("Launching file manager application");
	  	  		
	  	  		//If Allow permission request notification exists 
	  	  		try
	  	  		{
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  	  		
	  	  			
	  	  		
	  	  		

	  	  		
	  	  		}
	  	  		
	  	  		
	  	  		
	  	  		
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	           
	  	        }
	  			
	  	  	//Select Internal Storage
	  			MobileElement InternalStorage = driver.findElement(By.xpath("//*[@text='Phone storage']")); 
	  			InternalStorage.click();
	  			TimeUnit.SECONDS.sleep(5);
	  			logger.info("Select Internal Storage");
	  			
	  			//Select Test1 Folder
	  			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
	  			Test1.click();
	  			TimeUnit.SECONDS.sleep(5);
	  			logger.info("Select Test1 Folder");
	  			
	  			
	  			//hold and press copied Zip File
	  			MobileElement copiedZipFile = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"test_file.zip\")"); 
	  			TouchAction touchAction=new TouchAction(driver);
	  			logger.info("Extracting Zip File");
  			
	  			touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (copiedZipFile))).release().perform();
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			
	  			
	  			//Click On More options
	  			
	  			MobileElement MoreOptions = driver.findElement(By.xpath("//*[@text='More']")); 
	  			MoreOptions.click();
	  			TimeUnit.SECONDS.sleep(5);
	  			logger.info("Click More options");
	  			
	  			//UnCompress
	  			MobileElement UnCompress = driver.findElement(By.xpath("//*[@text='Uncompress']")); 
	  			UnCompress.click();
	  			TimeUnit.SECONDS.sleep(30);
	  			logger.info("Extracting Zip File");
	  			
	  			
	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  	  		TimeUnit.SECONDS.sleep(2);
	  	  		
	  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  	  		TimeUnit.SECONDS.sleep(2);
	  			
	  			logger.info("Clearing Recent Apps");
	  			
	  			
	  			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward(5)"));
	  	  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd()"));
	  	  		//TimeUnit.SECONDS.sleep(5);
	  	  		// open the recently opened apps screen
	  	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		// click on close all
	  	  		try
	  	  		{
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
	  	  			logger.info("Clearing Recent Apps");
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  	  		logger.info(" clearing Recent apps ");
	  	  		
	  	  		

	  	  		
	  	  		}
	  	  		
	  	  		
	  	  		
	  	  		
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	            logger.info("No recent apps present");
	  	        }
	  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  	  		TimeUnit.SECONDS.sleep(2);
	  			
	  			
	  			
	  	  	//Launch File Manager Application
	  			((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		
	  	  		
	  	  		try
	  	  		{
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  	  		
	  	  			
	  	  		
	  	  		

	  	  		
	  	  		}
	  	  		
	  	  		
	  	  		
	  	  		
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	           
	  	        }
	  			
	  	  	//Select Internal Storage
	  			MobileElement InternalStorage1 = driver.findElement(By.xpath("//*[@text='Phone storage']")); 
	  			InternalStorage1.click();
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			
	  			//Create Folder
	  			MobileElement NewFolder = driver.findElement(By.xpath("//*[@text='New folder']")); 
	  			NewFolder.click();
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			
	  			driver.findElement(By.id("com.itel.filemanager:id/itel_editview_edittext")).clear();
		  		driver.findElement(By.id("com.itel.filemanager:id/itel_editview_edittext")).sendKeys("Test2");
		  		TimeUnit.SECONDS.sleep(5);
		  		
		  		driver.findElement(By.xpath("//*[@text='OK']")).click();
		  		TimeUnit.SECONDS.sleep(5);
		  		logger.info("Test2 folder created");
		  		
		  		//Launch File Manager Application
	  			((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		
	  	  		
	  	  		try
	  	  		{
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  			
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
	  	  			
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  	  		
	  	  			
	  	  		
	  	  		

	  	  		
	  	  		}
	  	  		
	  	  		
	  	  		
	  	  		
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	           
	  	        }
	  			
	  	  	//Select Internal Storage
	  			MobileElement InternalStorage2 = driver.findElement(By.xpath("//*[@text='Phone storage']")); 
	  			InternalStorage2.click();
	  			TimeUnit.SECONDS.sleep(5);
		  		
		  		
		  		
		  		
		  		
		  		//LongPress Test1
	  			MobileElement CopyFile = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")"); 
	  			TouchAction touchAction1=new TouchAction(driver);
	  			logger.info("Extracting Zip File");
	  			touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile))).release().perform();
	  			TimeUnit.SECONDS.sleep(5);
	  			logger.info("Long Press and select and Test1 Folder");
	  			
	  			//Select Copy option
	  			driver.findElement(By.xpath("//*[@text='Copy']")).click();
		  		TimeUnit.SECONDS.sleep(5);
		  		logger.info("Select Copy option");
		  		//Select Phone Storage
		  		driver.findElement(By.xpath("//*[@text='Phone storage']")).click();
		  		TimeUnit.SECONDS.sleep(5);
		  		logger.info("Select Internal Storage");
	  			//Select Test2
		  		driver.findElement(By.xpath("//*[@text='Test2']")).click();
		  		TimeUnit.SECONDS.sleep(5);
		  		logger.info("Select Test2 Folder");
		  		//Select Paste
		  		driver.findElement(By.xpath("//*[@text='PASTE']")).click();
		  		TimeUnit.SECONDS.sleep(120);
		  		logger.info("Select paste option");
		  		
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			
	  			logger.info("Pass: Test18_Int For Copy Paste Operation");
	  		
		  		
		  		
		  		
		  		
	  			
		  		
	  			
	  			
	  			
	  			
	  			
  			
	  		
	  	}  
  }