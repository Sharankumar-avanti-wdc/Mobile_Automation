package Samsung_Galaxy_M32_5G;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M32 5G");
		dc.setCapability(MobileCapabilityType.UDID, "RZCRA03GMFL");
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

		//Pushing zip file to Host internal memory
		logger.info("Pushing zip file to host internal memory");
		System.out.println("Pushing zip file to host internal memory");
		//((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\7320612\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		//TimeUnit.SECONDS.sleep(60);	
		((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(240);
		logger.info("Push file is successfull");
		System.out.println("Push file is successfull");	
		try {

		//Launching file manager application to perform copy paste operation from Internal to external memory
		logger.info("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
		System.out.println("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));

		// Switch to Internal storsge
		logger.info("Select Internal storage");
		System.out.println("Select Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
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
		logger.info("Extracting Complete");
		System.out.println("Extracting Complete");
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
		
		//Launch File Manager
		logger.info("Launching file manager application");
		System.out.println("Launching file manager application");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
		// Switch to Internal storage
		logger.info("Select Internal storage");
		System.out.println("Select Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);

		// Long press and select Test1 folder
		logger.info("Select Test1 folder from Internal storage ");
		System.out.println("Select Test1 folder from Internal storage");
		MobileElement copyTest1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
		TouchAction touchAction3=new TouchAction(driver);
		touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (copyTest1))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		;
		// click on copy icon
		logger.info("Select Copy option");
		System.out.println("Select Copy option");
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Copy selected folder\"]/android.widget.ImageView")).click();
		MobileElement copy =driver.findElement(By.xpath("//*[@text='Copy']"));
		copy.click();
		TimeUnit.SECONDS.sleep(5);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Select USD Card
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);

		// click on copy here
		logger.info("Select Paste option for copy paste Test1 folder from Internal to external storage");
		System.out.println("Select Paste option for copy paste Test1 folder from Internal to external storage");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
		// wait for 15 secs till the copy operation completes
		TimeUnit.SECONDS.sleep(120);
		logger.info("Copy paste 1GB folder from Internal to external storage is successfull");
		System.out.println("Copy paste 1GB folder from Internal to external storage is successfull");

		// click more options and select Create folder
		logger.info("Creating folder Test2 In uSD card");
		System.out.println("Creating folder Test2 In uSD card");
		try {
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {


			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]")).click();
			TimeUnit.SECONDS.sleep(5);

		}
		// click on create folder
		logger.info("Select create folder option");
		System.out.println("Select create folder option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Create folder\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Name folder as Test2");
		System.out.println("Name folder as Test2");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).clear();
		driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).sendKeys("Test2");
		TimeUnit.SECONDS.sleep(5);

		//Click Create option
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Create\")").click();
		TimeUnit.SECONDS.sleep(5);	
		logger.info("Test2 folder created");
		System.out.println("Test2 folder created");

		//Search for Test1 Folder in uSD Card to perform Copy paste operation
		String text1 = "Test1";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
		TimeUnit.SECONDS.sleep(5);


		// Long Press and Hold Test1 folder
		logger.info("Select Test1 Folder from External storage");
		System.out.println("Select Test1 Folder from External storage ");
		MobileElement CheckTest1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
		TouchAction touchAction4=new TouchAction(driver);
		touchAction4.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest1))).release().perform();
		TimeUnit.SECONDS.sleep(10);

		// click on copy icon
		logger.info("Select copy option");
		System.out.println("Select copy option");
		MobileElement copy1 =driver.findElement(By.xpath("//*[@text='Copy']"));
		copy1.click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Copy selected folder\"]/android.widget.ImageView")).click();
		TimeUnit.SECONDS.sleep(5);
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Select USD Card
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		
	
	/*	logger.info("Select Test2 folder");
		System.out.println("Select Test2 folder");
		String text2 = "Test2";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));")).click();
		TimeUnit.SECONDS.sleep(5);*/
		
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"Test2\"))"));
				//Select DCIM folder
				logger.info("Select Test2 folder");
				System.out.println("Select Test2 folder");
				MobileElement Test2 = driver.findElement(By.xpath("//*[@text='Test2']")); 
				Test2.click();
				TimeUnit.SECONDS.sleep(3);
		
		// click on copy here
		logger.info("Copy paste Test1 folder inside Test2 folder");
		System.out.println("Copy paste Test1 folder inside Test2 folder");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
		// wait for 15 secs till the copy operation completes
		TimeUnit.SECONDS.sleep(120);
		logger.info("Copy Paste from Test1 folder from Internal to external storage inside Test2 folder and Vice versa is successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);


		// Long press and select Test1 folder
		logger.info("Select Test2 folder from Internal storage ");
		System.out.println("Select Test2 folder from Internal storage");
		MobileElement copyTest2 =	driver.findElement(By.xpath("//*[@text='Test2']"));
		TouchAction touchAction5=new TouchAction(driver);
		touchAction5.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (copyTest2))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		;
		// click on copy icon
		logger.info("Select Copy option");
		System.out.println("Select Copy option");
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Copy selected folder\"]/android.widget.ImageView")).click();
		MobileElement copy2 =driver.findElement(By.xpath("//*[@text='Copy']"));
		copy2.click();
		TimeUnit.SECONDS.sleep(5);

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Select USD Card
		logger.info("Select Internal Storage");
		System.out.println("Select Internal Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);

		// click on copy here
		logger.info("Select Paste option for copy paste Test2 folder from External to Internal storage");
		System.out.println("Select Paste option for copy paste Test2 folder from External to Internal storage");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
		// wait for 15 secs till the copy operation completes
		TimeUnit.SECONDS.sleep(120);
		logger.info("Pass: Test18 Pass for Copy paste operation from internal memory to external memory and vice versa scenario completed successfully");
		System.out.println("Pass: Test18 Pass for Copy paste operation from internal memory to external memory and vice versa scenario completed successfully");


		//long press and Hold Test1 folder
		logger.info("Select Test2 Folder from Internal Storage");
		System.out.println("Select Test2 Folder from Internal Storage");
		MobileElement CheckTest2 =	driver.findElement(By.xpath("//*[@text='Test2']"));
		TouchAction touchAction6=new TouchAction(driver);
		touchAction6.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest2))).release().perform();
		TimeUnit.SECONDS.sleep(10);

		// click on copy icon
		logger.info("Select Move option");
		System.out.println("Select Move option");

		MobileElement move =driver.findElement(By.xpath("//*[@text='Move']"));
		move.click();

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);

		//Select USD Card
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);



		// Select more options and select create folder 
		logger.info("Creating Folder Name New_Scenario in External Storage and perform Cut paste operation from Internal to external storage");
		System.out.println("Creating Folder Name New_Scenario in External Storage and perform Cut paste operation from Internal to external storage");

		try {
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
			TimeUnit.SECONDS.sleep(5);
		}

		catch (Exception e) {


			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]")).click();
			TimeUnit.SECONDS.sleep(5);

		}

		// click on create folder and create folder name folder name New_Scenario
		logger.info("click on create folder and create folder name folder name New_Scenario");
		System.out.println("click on create folder and create folder name folder name New_Scenario");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Create folder\")").click();
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).clear();
		driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).sendKeys("New_Scenario");
		TimeUnit.SECONDS.sleep(5);

		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Create\")").click();
		TimeUnit.SECONDS.sleep(5);

		logger.info("Select New_Scenario  folder and Paste Test1 folder inside New_Scenario folder");
		System.out.println("Select New_Scenario  folder and Paste Test1 folder inside New_Scenario folder");
		String text4 = "New_Scenario";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text4+"\"));")).click();
		TimeUnit.SECONDS.sleep(5);

		// click on copy here
		logger.info("click move here option");
		System.out.println("click move here option"); 
		driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
		// wait for 15 secs till the copy operation completes
		TimeUnit.SECONDS.sleep(120);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);

		logger.info("Pass: Test18 Pass for Cut paste Operation  Successfully");

		System.out.println("Pass: Test18 Pass for  Cut paste Operation  Successfully");

		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test:End");
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
