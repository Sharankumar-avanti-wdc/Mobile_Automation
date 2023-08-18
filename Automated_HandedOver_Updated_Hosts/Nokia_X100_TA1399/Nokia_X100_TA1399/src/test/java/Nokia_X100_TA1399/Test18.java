package Nokia_X100_TA1399;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia X100");
		dc.setCapability(MobileCapabilityType.UDID, "ADDMAUH003MA2203219");
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
		System.out.println("Pushing 1GB zip File to Host Internal Memory via server folder named as Test1 ");
		System.out.println("Extracting zip file in Host internal memory");
		System.out.println("Copy Paste 1GB file (Test1) from host internal memory to uSD Card, Create a folder named Test2 in uSD Card, Copy paste 1GB Folder(Test1) From internal to external inside folder Test2 and Vice versa");
		System.out.println("Create folder name(New_Scenario in External memory, select folder name(Test2) from internal memory and perform cut paste operation from internla to external memory");
		System.out.println("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";
		//Clearing Recent Apps
		
		logger.info("Pushing zip file to host internal memory");
		System.out.println("Pushing zip file to host internal memory");
		//((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		//TimeUnit.SECONDS.sleep(240);
		((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(240);	
		logger.info("Push file is successfull");
		System.out.println("Push file is successfull");	
		try {
			//Launch File Manager Application
			logger.info("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
			System.out.println("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			try
			{
				logger.info("clcik on ok");
				System.out.println("clcik on ok");
				driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("clcik on allow");
				System.out.println("clcik on allow");
				driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
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
			////Scroll Up to find sdcard option
			logger.info("swipe up and search for sd card");
			System.out.println("swipe up and search for sd card");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(30)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select Internal Storage	
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement Internalstorage = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			Internalstorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Test1 Folder
			logger.info("select Test1 folder from internal storage");
			System.out.println("select Test1 folder from internal storage");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(5);
			//Click on ZipFile
			logger.info("Unzip folder name test_file");
			System.out.println("Unzip folder name test_file");
			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file.zip']")); 
			TestFile.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Extract option
			logger.info("Extracting Push zip file as Folder named Test1");
			System.out.println("Extracting Push zip file as Folder named Test1");
			MobileElement ExtractZipFile = driver.findElement(By.xpath("//*[@text='Extract']")); 
			ExtractZipFile.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Extracting Complete");
			System.out.println("Extracting Complete");
			MobileElement Finished = driver.findElement(By.xpath("//*[@text='Done']")); 
			Finished.click();
			logger.info("click on done");
			System.out.println("click on done");
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);

			//Launch File Manager
			logger.info("Launching file manager application");
			System.out.println("Launching file manager application");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Scroll Up to find Internal Storage option
			logger.info("swipe up and search for internal storage");
			System.out.println("swipe up and search for internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

			// Switch to Internal storsge
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage1 = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			InternalStorage1.click();
			TimeUnit.SECONDS.sleep(6);
			// Long press and select Test1 folder
			logger.info("Select Test1 folder from internal storage ");
			System.out.println("Select Test1 folder from internal storage");
			MobileElement CopyFile = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")"); 
			TouchAction touchAction1=new TouchAction(driver);
			touchAction1.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			//Click On More Options
			logger.info("Select more options ");
			System.out.println("Select more options");
			MobileElement More = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			More.click();
			TimeUnit.SECONDS.sleep(3);
			// click on copy icon
			logger.info("Select Copy option");
			System.out.println("Select Copy option");
			MobileElement Copy = driver.findElement(By.xpath("//*[@text='Copy to']")); 
			Copy.click();
			TimeUnit.SECONDS.sleep(3);
			//Select USD Card
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement uSD = driver.findElement(By.xpath("//*[@text='SD card']")); 
			uSD.click();
			TimeUnit.SECONDS.sleep(3);
			// click on copy here
			logger.info("Select Paste option for copy paste Test1 folder from Internal to external storage");
			System.out.println("Select Paste option for copy paste Test1 folder from Internal to external storage");
			MobileElement CopyHere = driver.findElement(By.xpath("//*[@text='Copy here']")); 
			CopyHere.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Copy paste 1GB folder from Internal to external storage is successfull");
			System.out.println("Copy paste 1GB folder from Internal to external storage is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Scroll Up to find Internal Storage option
			logger.info("swipe up and search for internal storage");
			System.out.println("swipe up and search for internal storage");
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

			/// Select to Internal storsge
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage0 = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			InternalStorage0.click();
			TimeUnit.SECONDS.sleep(6);
			// Long press and select Test1 folder
			logger.info("Long Press and select and Test1 Folder ");
			System.out.println("Long Press and select and Test1 Folder");
			MobileElement CopyFile0 = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")"); 
			TouchAction touchAction0=new TouchAction(driver);
			touchAction0.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			//Click On more options
			logger.info("Select more options ");
			System.out.println("Select more options");
			MobileElement More1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			More1.click();
			// click on copy icon
			logger.info("Select Copy option");
			System.out.println("Select Copy option");
			MobileElement Copy1 = driver.findElement(By.xpath("//*[@text='Copy to']")); 
			Copy1.click();
			TimeUnit.SECONDS.sleep(3);
			// click on copy icon
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement uSD1 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			uSD1.click();
			TimeUnit.SECONDS.sleep(3);
			//Create Folder
			// click on create folder
			logger.info("Creating folder name Test2 In uSD card");
			System.out.println("Creating folder name Test2 in uSD card");
			logger.info("Select create new folder option");
			System.out.println("Select create new folder option");
			MobileElement AddNewFolder = driver.findElement(By.xpath("//*[@text='Add new folder']")); 
			AddNewFolder.click();
			TimeUnit.SECONDS.sleep(3);
			//Enter Folder name as Test2
			logger.info("Name folder as Test2");
			System.out.println("Name folder as Test2");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test2");
			TimeUnit.SECONDS.sleep(5);
			//Create Folder as Test2
			logger.info("Copy paste Test1 folder inside Test2 folder");
			System.out.println("Copy paste Test1 folder inside Test2 folder");
			MobileElement CopyTo = driver.findElement(By.xpath("//*[@text='Copy to folder']")); 
			CopyTo.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Copy paste Test1 folder inside Test2 folder in uSD card completed successfully");
			System.out.println("Copy paste Test1 folder inside Test2 folder in uSD card completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Scroll Up to find SD card option
			logger.info("swipe up and search for sd card");
			System.out.println("swipe up and search for sd card");
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));

			//Select USD Card
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement uSD2 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			uSD2.click();
			TimeUnit.SECONDS.sleep(3);
			//click on list view
			logger.info("Select list view");
			System.out.println("Select list view");
			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView.click();
			TimeUnit.SECONDS.sleep(3);
			//select Test2  Folder
			logger.info("Long Press and select and Test2 Folder");
			System.out.println("Long Press and select and Test2 Folder ");
			MobileElement CopyFile1 = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test2\")"); 
			TouchAction touchAction2=new TouchAction(driver);
			touchAction2.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile1))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Test2 folder and perform copy paste operation from external to internal memory");
			System.out.println("Select Test2 folder and perform copy paste operation from external to internal memory");
			//Click On More Options
			logger.info("Select more options ");
			System.out.println("Select more options");
			MobileElement More2 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			More2.click();
			//click on copy option
			logger.info("Select Copy option");
			System.out.println("Select Copy option");
			MobileElement Copy2 = driver.findElement(By.xpath("//*[@text='Copy to']")); 
			Copy2.click();
			TimeUnit.SECONDS.sleep(3);
			///click on Internal storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement internal = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			internal.click();
			TimeUnit.SECONDS.sleep(3);
			///click on copy option
			logger.info("click on copy here");
			System.out.println("click on copy here");
			MobileElement CopyHere1 = driver.findElement(By.xpath("//*[@text='Copy here']")); 
			CopyHere1.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Pass: Test18 Pass for Copy paste operation from internal memory to external memory and vice versa scenario completed successfully");
			System.out.println("Pass: Test18 Pass for Copy paste operation from internal memory to external memory and vice versa scenario completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Scroll Up to find Internal Storage option
			logger.info("swipe up and search for internal storage");
			System.out.println("swipe up and search for internal storage");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));

			///click on copy option
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage2 = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			InternalStorage2.click();
			TimeUnit.SECONDS.sleep(6);
			//Selecting Test2 Folder
			logger.info("Long Press and select and Test2 Folder");
			System.out.println("Long Press and select and Test2 Folder");
			MobileElement CopyFile2 = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test2\")"); 
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile2))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Creating Folder Name New_Scenario in External Storage and perform Cut paste operation from Internal to external storage");
			System.out.println("Creating Folder Name New_Scenario in External Storage and perform Cut paste operation from Internal to external storage");
			//Click On More Options
			MobileElement More4 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			More4.click();
			//select copy
			logger.info("Select move option");
			System.out.println("Select move option");
			MobileElement Copy3 = driver.findElement(By.xpath("//*[@text='Move to']")); 
			Copy3.click();
			TimeUnit.SECONDS.sleep(3);
			///click on Internal storage
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement uSD4 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			uSD4.click();
			TimeUnit.SECONDS.sleep(3);
			//Create Folder
			logger.info("click on create folder and create folder name  New_Scenario in sd card");
			System.out.println("click on create folder and create  folder name New_Scenario in sd card");
			MobileElement AddNewFolder1 = driver.findElement(By.xpath("//*[@text='Add new folder']")); 
			AddNewFolder1.click();
			TimeUnit.SECONDS.sleep(3);
			//Enter Folder name as Test2
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("New_Scenario");
			TimeUnit.SECONDS.sleep(5);
			//Create Folder as Test2
			logger.info("Select Move to option");
			System.out.println("Select Move to option");
			logger.info( "Move to Test1 folder inside New_Scenario folder");
			System.out.println( "Move to Test1 folder inside New_Scenario folder");
			MobileElement CopyTo1 = driver.findElement(By.xpath("//*[@text='Move to folder']")); 
			CopyTo1.click();
			TimeUnit.SECONDS.sleep(90);
			logger.info("switch to list view mode");
			System.out.println("switch to list view mode");
			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView1.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Cut paste Operation Completed Successfully");
			System.out.println("Pass: Cut paste Operation Completed Successfully");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final message: Pass Test18 pass for copy paste & cut paste operation");
			logger.info("Final message: Pass Test18 pass for copy paste & cut paste operation");
			logger.info("Test: End");
			System.out.println("Test: End");
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
		}  
		catch (Exception e) {
			System.out.println("Fail: Test18 Fail for Copy paste and Cut paste operation");
			logger.info("Fail: Test18 Fail for Copy paste and Cut paste operation");
			System.out.println("Final message: Fail Test18 fail for copy paste & cut paste operation");
			logger.info("Final message: Fail Test18 Fail for copy paste & cut paste operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}  
}


