package Xiaomi_MI_11_Lite_5G;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

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
import io.appium.java_client.android.PushesFiles;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Test18
{
	// initializing the driver instance,declaring desired capabilities
	AppiumDriver<MobileElement> driver;
	private MobileElement Test1Folder;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi 11 Lite 5G");
		dc.setCapability(MobileCapabilityType.UDID, "2a0e42c3");
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
		System.out.println("Test18 Scenario is as follows");
		System.out.println("1.Pushing 1GB zip File to Host Internal Memory via server folder named as Test1 ");
		System.out.println("2.Extracting zip file in Host internal memory");
		System.out.println("3.Copy Paste 1GB file (Test1) from host internal memory to uSD Card, Create a folder named Test2 in uSD Card, Copy paste 1GB Folder(Test1) From internal to external inside folder Test2 and Vice versa");
		System.out.println("4.Create folder name(New_Scenario in External memory, select folder name(Test2) from internal memory and perform cut paste operation from internla to external memory");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Unlocking Phone if locked
		logger.info("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		//If launch request for appium launch access allow permission
		try
		{
			driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
			logger.info("Clearing Recent Apps");
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launch appium permission access:");
			System.out.println("Launch appium permission access:");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("No permission access pop-up found");
			System.out.println("No permission access pop-up found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			//driver.findElement(By.xpath("//*[@resource-id='com.miui.home:id/clearAnimView']")).click();
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Pushing 1GB zip file to host internal storage via appium server
		logger.info("Pushing 1GB zip File to Host internal storage via appium server");
		System.out.println("Pushing 1GB zip File to Host internal storage via appium server");
		((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(240);
		try {	
			//Launch File Manager Application
			logger.info("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
			System.out.println("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
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
			//Select Browse option
			logger.info("click on browse option");
			System.out.println("click on browse option");
			driver.findElement(By.xpath("//*[@text='Browse']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Scroll Up to find sd card option
			MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select Internal Storage	
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			//MobileElement InternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Select Test1 Folder
			logger.info("Search for Test1 Folder");
			System.out.println("Search for Test1 Folder");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(5);
			//Click on ZipFile
			logger.info("Search for TestFile  Folder");
			System.out.println("Search for TestFile  Folder");
			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file.zip']")); 
			TestFile.click();
			TimeUnit.SECONDS.sleep(5);				
			//Select Extract option
			logger.info("Extracting Push zip file as Folder named Test1");
			System.out.println("Extracting Push zip file as Folder named Test1");
			MobileElement ExtractZipFile = driver.findElement(By.xpath("//*[@text='Extract']")); 
			ExtractZipFile.click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Extracting Zip file");
			System.out.println("Extracting Zip file");
			TimeUnit.SECONDS.sleep(180);
			logger.info("1GB File Extration completed");
			System.out.println("1GB File Extration completed");
			MobileElement Finished = driver.findElement(By.xpath("//*[@text='Done']")); 
			Finished.click();
			logger.info("Extracting Complete");
			System.out.println("Extracting Complete");
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
			MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			// Switch to Internal storsge
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage1 = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			InternalStorage1.click();
			TimeUnit.SECONDS.sleep(6);
			// Long press and select Test1 folder
			logger.info("Select Test1 folder from Internal storage ");
			System.out.println("Select Test1 folder from Internal storage");
			MobileElement CopyFile = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")"); 
			TouchAction touchAction1=new TouchAction(driver);
			touchAction1.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			//Click More option
			logger.info("Select Moreoptions");
			System.out.println("Select Moreoptions");
			MobileElement Moreoptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			Moreoptions .click();
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
			TimeUnit.SECONDS.sleep(240);
			logger.info("Copy paste 1GB folder from Internal to external storage is successfull");
			System.out.println("Copy paste 1GB folder from Internal to external storage is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Scroll Up to find Internal Storage option
			MobileElement element2 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Select to Internal storsge
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage0 = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			InternalStorage0.click();
			TimeUnit.SECONDS.sleep(6);
			// Long press and select Test1 folder
			logger.info("Long Press and select and Test1 Folder from Internal storage ");
			System.out.println("Long Press and select and Test1 Folder from Internal storage");
			MobileElement CopyFile0 = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")"); 
			TouchAction touchAction0=new TouchAction(driver);
			touchAction0.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			//Click On more options
			logger.info("Select Moreoptions");
			System.out.println("Select Moreoptions");
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
			// click on create folder
			logger.info("Select create folder option");
			System.out.println("Select create folder option");
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
			TimeUnit.SECONDS.sleep(240);
			logger.info("Copy Paste from Test1 folder from Internal to external storage inside Test2 folder and Vice versa is successfull");
			System.out.println("Copy Paste from Test1 folder from Internal to external storage inside Test2 folder and Vice versa is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Scroll Up to find SD card option
			MobileElement element3 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select USD Card
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement uSD2 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			uSD2.click();
			TimeUnit.SECONDS.sleep(3);
			//click on list view
			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			ListView.click();
			TimeUnit.SECONDS.sleep(3);
			//select Test2  Folder
			logger.info("Long Press and select and Test2 Folder from Eternal storage");
			System.out.println("Long Press and select and Test2 Folder from Eternal storage");
			MobileElement CopyFile1 = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test2\")"); 
			TouchAction touchAction2=new TouchAction(driver);
			touchAction2.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile1))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			//Click On More Options
			logger.info("Select Moreoptions");
			System.out.println("Select Moreoptions");
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
			//click on copy option
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
			MobileElement element4 = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//click on copy option
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage2 = driver.findElement(By.xpath("//*[@text='Internal storage']")); 
			InternalStorage2.click();
			TimeUnit.SECONDS.sleep(6);
			//Selecting Test2 Folder
			logger.info("Long Press and select and Test2 Folder from internal storage");
			System.out.println("Long Press and select and Test2 Folder from internal storage");
			MobileElement CopyFile2 = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test2\")"); 
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CopyFile2))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			//Click On More Options
			logger.info("Select Moreoptions");
			System.out.println("Select Moreoptions");
			MobileElement More4 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			More4.click();
			//select copy
			logger.info("Select Move to option");
			System.out.println("Select Move to option");
			MobileElement Copy3 = driver.findElement(By.xpath("//*[@text='Move to']")); 
			Copy3.click();
			TimeUnit.SECONDS.sleep(3);
			//click on Internal storage
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement uSD4 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			uSD4.click();
			TimeUnit.SECONDS.sleep(3);
			//Create Folder
			logger.info("click on create folder and create folder name folder name New_Scenario");
			System.out.println("click on create folder and create folder name folder name New_Scenario");
			MobileElement AddNewFolder1 = driver.findElement(By.xpath("//*[@text='Add new folder']")); 
			AddNewFolder1.click();
			TimeUnit.SECONDS.sleep(3);
			//Enter Folder name as Test2
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("New_Scenario");
			TimeUnit.SECONDS.sleep(5);
			//Create Folder as Test2
			logger.info("Select Move to folder");
			System.out.println("Select Move to folder");
			logger.info( "Paste Test2 folder inside New_Scenario folder");
			System.out.println( "Paste Test2 folder inside New_Scenario folder");
			MobileElement CopyTo1 = driver.findElement(By.xpath("//*[@text='Move to folder']")); 
			CopyTo1.click();
			TimeUnit.SECONDS.sleep(240);
			//MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			//ListView1.click();
			TimeUnit.SECONDS.sleep(3);
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
			logger.info("Pass: Test18 Pass for  Cut paste Operation  Successfully");
			System.out.println("Pass: Test18 Pass for Cut paste Operation  Successfully");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final message: Pass Test18 pass for copy paste & cut paste operation");
			logger.info("Final message: Pass Test18 pass for copy paste & cut paste operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}  
		catch (Exception e) {
			System.out.println("Fail: Test18 Fail for Copy paste and Cut paste operation");
			logger.info("Fail: Test18 Fail for Copy paste and Cut paste operation");
			System.out.println("Final message: Fail Test18 fail for copy paste & cut paste operation");
			logger.info("Final message: Fail Test18 fail for copy paste & cut paste operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}