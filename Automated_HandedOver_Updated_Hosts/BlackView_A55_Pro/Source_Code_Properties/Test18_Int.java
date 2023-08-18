package BlackView_A55_Pro;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "A55 Pro");
		dc.setCapability(MobileCapabilityType.UDID, "A55PROEEA0020357");
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
		FileHandler fileHandler = new FileHandler("status_log_Test18_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test18_Int Scenario is as follows");
		logger.info("1.Pushing 1GB zip File to Host Internal Memory via server folder named as Test1 ");
		logger.info("2.Extracting zip file in Host internal memory");
		logger.info("3.Copy  1GB file (Test1) from host internal memory,Create a folder named Test2 in Internal storage paste Test1 folder in Test2");
		logger.info("4.Create folder name(New_Scenario in internal memory, select folder name(Test2) from internal memory and perform cut paste operation");
		logger.info("Setting up the appium desired capabilities");
		logger.info("Test18_Int Scenario is as follows");
		System.out.println("1.Pushing 1GB zip File to Host Internal Memory via server folder named as Test1 ");
		System.out.println("2.Extracting zip file in Host internal memory");
		System.out.println("3.Copy  1GB file (Test1) from host internal memory,Create a folder named Test2 in Internal storage paste Test1 folder in Test2");
		System.out.println("4.Create folder name(New_Scenario in internal memory, select folder name(Test2) from internal memory and perform cut paste operation");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		
		SetUp();
		String Result = "Fail";
		((StartsActivity) driver).startActivity(new Activity("com.blackview.launcher", "com.android.searchlauncher.SearchLauncher"));
		
		TimeUnit.SECONDS.sleep(2);
		
		try {
			//Pushing zip file to Host internal memory
			logger.info("Pushing zip file to host internal memory");
			System.out.println("Pushing zip file to host internal memory");
			((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
			TimeUnit.SECONDS.sleep(60);	
			logger.info("Push file is successfull");
			System.out.println("Push file is successfull");	


			//Launching file manager application to perform copy paste operation from Internal to external memory

			//Launch File manager to perform copy paste and cut paste operation
			//Launching file manager application to perform copy paste operation from Internal to external memory
			logger.info("Launch File Manager Application and clear internal memory");
			System.out.println("Launch File Manager Application and clear internal memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select Internal Memory
			logger.info("Select  Internal storage");
			System.out.println("Select  Internal storage");
			////Scroll Up to find Internal Storage option
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			Internalstorage.click();
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
			TimeUnit.SECONDS.sleep(180);
			//Select Extract option
			logger.info("Extracting Push zip file as Folder named Test1");
			System.out.println("Extracting Push zip file as Folder named Test1");
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Extracting Complete");
			System.out.println("Extracting Complete");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
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
			//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			//TimeUnit.SECONDS.sleep(5);
			logger.info("Name folder as Test2");
			System.out.println("Name folder as Test2");

			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test2");
			TimeUnit.SECONDS.sleep(5);

			//Click Create option
			logger.info("Click Create option");
			System.out.println("Click Create option");
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
			touchAction4.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest1))).release().perform();
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
			System.out.println("Select Internal storage");
			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
			TimeUnit.SECONDS.sleep(3);
			//	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Scroll up and select
			logger.info("Swipe up and select test2 folder");
			System.out.println("Swipe up and select test2 folder");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
			//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			//TimeUnit.SECONDS.sleep(5);
			logger.info("Name folder as New_Scenario");
			System.out.println("Name folder as New_Scenario");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("New_Scenario");
			TimeUnit.SECONDS.sleep(5);
			//Accept create folder
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/accept_button']")).click();
			TimeUnit.SECONDS.sleep(5);	




			/*	//long press and Hold Test1 folder
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
			 */
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
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
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
			logger.info("Pass: Test18_Int Pass for Cut paste Operation");
			System.out.println("Pass: Test18_Int Pass for Cut paste Operation");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);


			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			System.out.println("Final Message: Pass Test18_Int Pass for copy paste & cut paste operation");
			logger.info("Final Message: Pass Test18_Int Pass for copy paste & cut paste operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

		catch (Exception e) {
			System.out.println("Fail: Test18_Int Fail for Copy paste and Cut paste operation");
			logger.info("Fail: Test18_Int Fail for Copy paste and Cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Final Message: Fail Test18_Int Fail for copy paste & cut paste operation");
			logger.info("Final Message: Fail Test18_Int Fail for copy paste & cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}