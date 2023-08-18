package Samsung_Galaxy_Tab_S6_Lite;
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

public class Test18
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Tab S6 Lite");
		dc.setCapability(MobileCapabilityType.UDID, "R52N81CPS4E");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void CopyPaste() throws InterruptedException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test18.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test18 Scenario is as follows");
		logger.info("1.Pushing 1GB zip File to Host Internal Memory via server folder named as Test1 ");
		logger.info("2.Extracting zip file in Host internal memory");
		logger.info("3.Copy Paste 1GB file (Test1) from host internal memory to uSD Card, Create a folder named Test2 in uSD Card, Copy paste 1GB Folder(Test1) From internal to external inside folder Test2 and Vice versa");
		logger.info("4.Create folder name(New_Scenario in External memory, select folder name(Test2) from internal memory and perform cut paste operation from internla to external memory");
		logger.info("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("Test18 Scenario is as follows");
		System.out.println("1.Pushing 1GB zip File to Host Internal Memory via server folder named as Test1 ");
		System.out.println("2.Extracting zip file in Host internal memory");
		System.out.println("3.Copy Paste 1GB file (Test1) from host internal memory to uSD Card, Create a folder named Test2 in uSD Card, Copy paste 1GB Folder(Test1) From internal to external inside folder Test2 and Vice versa");
		System.out.println("4.Create folder name(New_Scenario in External memory, select folder name(Test2) from internal memory and perform cut paste operation from internla to external memory");
		System.out.println("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";

		//Launch Home Screen application and clear recent apps
		logger.info("Launch Home Screen application and clear recent apps");
		System.out.println("Launch Home Screen application and clear recent apps");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		TimeUnit.SECONDS.sleep(5);

		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{

			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			TimeUnit.SECONDS.sleep(5);

		}
		catch (Exception e) {
			e.printStackTrace();

		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try {
		//Pushing zip file to Host internal memory
		logger.info("Pushing zip file to host internal memory");
		System.out.println("Pushing zip file to host internal memory");
		((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(60);	
		logger.info("Push file is successfull");
		System.out.println("Push file is successfull");	
		

		logger.info("Pushing 1GB zip File to Host internal storage via appium server is successfull");
		System.out.println("Pushing 1GB zip File to Host internal storage via appium server is successfull");
		
			//Launch File manager to perform copy paste and cut paste operation
			//Launching file manager application to perform copy paste operation from Internal to external memory
			logger.info("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
			System.out.println("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Scroll up and Select Internal Storage
			
			// Switch to Internal storsge
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Test1 Folder
			logger.info("Select Test1 Folder from internal storage");
			System.out.println("Select Test1 Folder internal storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select  zip file
			logger.info("Select  zip file");
			System.out.println("Select  zip file");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"test_file.zip\")").click();
			TimeUnit.SECONDS.sleep(5);

			// Select Extract option
			logger.info("Select Extract option");
			System.out.println("Select Extract option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Extract\")").click();
			TimeUnit.SECONDS.sleep(30);
			//Select Extract option
			logger.info("Extracting Push zip file as Folder named Test1");
			System.out.println("Extracting Push zip file as Folder named Test1");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Finished\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Extracting Complete");
			System.out.println("Extracting Complete");
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			

			// Long press and select Test1 folder
			logger.info("Select Test1 folder from internal storage");
			System.out.println("Select Test1 folder from internal storage");
			MobileElement Test1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Test1))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			;
			// Select More Options
			logger.info("Select More Options");
			System.out.println("Select More Options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Copy to
			logger.info("Select Copy to");
			System.out.println("Select Copy to");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Copy to\")").click();
			TimeUnit.SECONDS.sleep(5);
			// Select uSD Card
					logger.info("Select uSD Card");
					System.out.println("Select uSD Card");
					driver.findElement(By.xpath("//*[@text='SD card']")).click();
					TimeUnit.SECONDS.sleep(3);
					// Select Copy here
					logger.info("Select Copy here");
					System.out.println("Select Copy here");
					driver.findElement(By.xpath("//*[@text='Copy here']")).click();
					TimeUnit.SECONDS.sleep(180);
			
			
			logger.info("Copy paste Test1 folder from Internal to external storage is successfull");
			System.out.println("Copy paste Test1 folder from Internal to external storage is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Scroll up and select SD Card
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select uSD card
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			// click more options and select Create folder
			logger.info("Select More Options");
			System.out.println("Select More Options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(3);
			// click on create folder
			logger.info("Select create folder option");
			System.out.println("Select create folder option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Add new folder\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Name folder as Test2");
			System.out.println("Name folder as Test2");
			
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test2");
			TimeUnit.SECONDS.sleep(5);
			
			//Click Create option
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/accept_button']")).click();
			TimeUnit.SECONDS.sleep(5);	
			logger.info("Test2 folder created successfully in external storage");
			System.out.println("Test2 folder created successfully in external storage");
			//Switch to Grid View
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			// Long Prees and Hold Test1 folder
			logger.info("Select Test1 Folder from external storage");
			System.out.println("Select Test1 Folder from external storage");
			MobileElement CheckTest1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
			TouchAction touchAction4=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest1))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			
			logger.info("Select More Options");
			System.out.println("Select More Options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Copy to
			logger.info("Select Copy to");
			System.out.println("Select Copy to");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Copy to\")").click();
			TimeUnit.SECONDS.sleep(5);
			// Select uSD Card
					logger.info("Select uSD Card");
					System.out.println("Select uSD Card");
					driver.findElement(By.xpath("//*[@text='SD card']")).click();
					TimeUnit.SECONDS.sleep(3);
				//	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
					TimeUnit.SECONDS.sleep(3);
					
					//Scroll up and select 
					MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					         ".scrollIntoView(new UiSelector().text(\"Test2\"))"));
					
					//Select Test2 Folder
					logger.info("Select Test2 Folder");
					System.out.println("Select Test2 Folder");
					driver.findElement(By.xpath("//*[@text='Test2']")).click();
					TimeUnit.SECONDS.sleep(3);
					// Select Copy here
					logger.info("Select Copy here");
					System.out.println("Select Copy here");
					driver.findElement(By.xpath("//*[@text='Copy here']")).click();
					TimeUnit.SECONDS.sleep(180);
					
					logger.info("Copy paste Test1 folder data to Test2 folder within external storage is successfull");
					System.out.println("Copy paste Test1 folder data to Test2 folder within external storage is successfull");
					//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					//TimeUnit.SECONDS.sleep(5);

			// Select more options and select create folder 
					// click more options and select Create folder
					logger.info("Select More Options");
					System.out.println("Select More Options");
					driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
					TimeUnit.SECONDS.sleep(3);
					// click on create folder
					logger.info("Select create folder option");
					System.out.println("Select create folder option");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Add new folder\")").click();
					TimeUnit.SECONDS.sleep(5);
					logger.info("Name folder as New_Scenario");
					System.out.println("Name folder as New_Scenario");
					driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
					driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("New_Scenario");
					TimeUnit.SECONDS.sleep(5);
					//Click Create option
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/accept_button']")).click();
					TimeUnit.SECONDS.sleep(5);	
					
					
					
					
				//long press and Hold Test1 folder
			logger.info("Select Test2 Folder from External Storage");
			System.out.println("Select Test2 Folder from External Storage");
			MobileElement CheckTest2 =	driver.findElement(By.xpath("//*[@text='Test2']"));
			TouchAction touchAction5=new TouchAction(driver);
			touchAction5.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest2))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			
			logger.info("Select More Options");
			System.out.println("Select More Options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Copy to
			logger.info("Select Copy to");
			System.out.println("Select Copy to");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Copy to\")").click();
			TimeUnit.SECONDS.sleep(5);
			// Select uSD Card
					logger.info("Select Internal storage");
					System.out.println("Select internal storage");
					driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
					TimeUnit.SECONDS.sleep(3);
					
					// Select Copy here
					logger.info("Select Copy here");
					System.out.println("Select Copy here");
					driver.findElement(By.xpath("//*[@text='Copy here']")).click();
					TimeUnit.SECONDS.sleep(180);
					
					logger.info("Pass: Test18 Pass copy paste operation from Internal to external and Vice-versa scenario");
					System.out.println("Pass: Test18 Pass copy paste operation from Internal to external and Vice-versa scenario");
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
					TimeUnit.SECONDS.sleep(3);
					
					//long press and Hold Test1 folder
					logger.info("Select Test2 Folder from interal Storage");
					System.out.println("Select Test2 Folder from internal Storage");
					MobileElement CheckTest3 =	driver.findElement(By.xpath("//*[@text='Test2']"));
					TouchAction touchAction6=new TouchAction(driver);
					touchAction6.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest3))).release().perform();
					TimeUnit.SECONDS.sleep(10);
					
					logger.info("Select More Options");
					System.out.println("Select More Options");
					driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
					TimeUnit.SECONDS.sleep(3);
					//Select Copy to
					logger.info("Select move to");
					System.out.println("Select Move to");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Move to\")").click();
					TimeUnit.SECONDS.sleep(5);
					// Select uSD Card
					logger.info("Select uSD Card");
					System.out.println("Select uSD Card");
					driver.findElement(By.xpath("//*[@text='SD card']")).click();
					TimeUnit.SECONDS.sleep(3);
							//Select New_scenario folder
							logger.info("Select New_scenario folder");
							System.out.println("Select New_scenario folder");
							driver.findElement(By.xpath("//*[@text='New_Scenario']")).click();
							TimeUnit.SECONDS.sleep(3);
							
							// Select Copy here
							logger.info("Select Move here");
							System.out.println("Select Move here");
							driver.findElement(By.xpath("//*[@text='Move here']")).click();
							TimeUnit.SECONDS.sleep(180);
							logger.info("Pass: Test18 Pass for Cut paste Operation");
							
							System.out.println("Cut paste Operation Completed Successfully");
			
					//driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
					//TimeUnit.SECONDS.sleep(3);
		
			
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		
			
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 logger.info("Test:End");
			 System.out.println("Final message: Pass Test18 pass for copy paste & cut paste operation");
			 logger.info("Final message: Pass Test18 pass for copy paste & cut paste operation");
			 logger.info("Test:End");
				System.out.println("Test:End");
			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

		catch (Exception e) {
			System.out.println("Fail: Test18 Fail for Copy paste and Cut paste operation");
			logger.info("Fail: Test18 Fail for Copy paste and Cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Final message:Fail Test18 fail for copy paste & cut paste operation");
			logger.info("Final message:Fail Test18 fail for copy paste & cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}