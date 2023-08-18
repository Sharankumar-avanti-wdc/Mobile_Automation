package Samsung_GalaxyA72;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A72");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8R32RWLVB");
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
		try {
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
		((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\7336135\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(60);	
		logger.info("Push file is successfull");
		System.out.println("Push file is successfull");	
		

		//Launching file manager application to perform copy paste operation from Internal to external memory
		logger.info("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
		System.out.println("Launching file manager application to extract zip and perform copy paste, cut paste operation from internal memory to external memory");
		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));

		// Switch to Internal storsge
		logger.info("Select Internal storage");
		System.out.println("Select Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);

		// search for Test1 folder 
		logger.info("Search for Test1 Folder");
		System.out.println("Search for Test1 Folder");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Search\"]")).click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Click On Search Bar");
		MobileElement editText  = (MobileElement) driver.findElementByClassName("android.widget.EditText");
		TimeUnit.SECONDS.sleep(5);
		((MobileElement) editText).click();
		TimeUnit.SECONDS.sleep(5);
		((MobileElement)editText).clear();
		TimeUnit.SECONDS.sleep(5);
		((MobileElement) editText).sendKeys("Test1");
		TimeUnit.SECONDS.sleep(5);

		// Select Test1 folder
		MobileElement intTest1Folder = driver.findElement(By.id("com.sec.android.app.myfiles:id/file_detail_container"));
		intTest1Folder.click();
		TimeUnit.SECONDS.sleep(5);


		//hold and press copied Zip File
		MobileElement copiedZipFile = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"test_file.zip\")"); 
		TouchAction touchAction=new TouchAction(driver);
		logger.info("Extracting Zip File");

		touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (copiedZipFile))).release().perform();
		TimeUnit.SECONDS.sleep(5);
		// extract the zipped folder inside internal memory
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"More options\"]/android.widget.ImageView")).click();
		TimeUnit.SECONDS.sleep(5);
		//Select extract file option
		logger.info("Select extract file option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Extract\")").click();
		TimeUnit.SECONDS.sleep(5);
		MobileElement editText1  = driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input"));
		TimeUnit.SECONDS.sleep(5);
		((MobileElement)editText1).click();
		((MobileElement)editText1).clear();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Naming Extract file as Test1 Folder");
		MobileElement editText2  = driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input"));
		((MobileElement) editText2).sendKeys("Test1");
		TimeUnit.SECONDS.sleep(5);	

		//Select Extract option
		logger.info("Extracting Push zip file as Folder named Test1");
		System.out.println("Extracting Push zip file as Folder named Test1");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Extract\")").click();
		TimeUnit.SECONDS.sleep(15);
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

		// Long press and select Test1 folder
		logger.info("Select Test1 folder ");
		System.out.println("Select Test1 folder");
		MobileElement Test1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
		TouchAction touchAction3=new TouchAction(driver);
		touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Test1))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		;
		// click on copy icon
		logger.info("Select Copy option");
		System.out.println("Select Copy option");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Copy selected folder\"]/android.widget.ImageView")).click();
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
		logger.info("Creating folder Test2 In USD card");
		System.out.println("Creating folder Test2 In USD card");
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

		//Switch to Grid View mode
		logger.info("Switch Grid view mode from list view mode");
		System.out.println("Switch Grid view mode from list view mode");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/menu_toggle_list_type")).click();
		TimeUnit.SECONDS.sleep(5);	
		driver.findElement(By.id("com.sec.android.app.myfiles:id/menu_toggle_list_type")).click();
		TimeUnit.SECONDS.sleep(5);	
		//Search for Test1 Folder in uSD Card to perform Copy paste operation
		String text1 = "Test1";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		

		// Long Prees and Hold Test1 folder
		logger.info("Select Test1 Folder");
		System.out.println("Select Test1 Folder");
		MobileElement CheckTest1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
		TouchAction touchAction4=new TouchAction(driver);
		touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest1))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		
		// click on copy icon
		logger.info("Select copy option");
		System.out.println("Select copy option");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Copy selected folder\"]/android.widget.ImageView")).click();
		TimeUnit.SECONDS.sleep(5);
		
		logger.info("Select Test2 folder");
		System.out.println("Select Test2 folder");
		String text2 = "Test2";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));")).click();
		TimeUnit.SECONDS.sleep(5);
		// click on copy here
		logger.info("Copy paste Test1 folder inside Test2 folder");
		System.out.println("Copy paste Test1 folder inside Test2 folder");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
		// wait for 15 secs till the copy operation completes
		TimeUnit.SECONDS.sleep(120);
		logger.info("Copy Paste from Test1 folder from Internal to external storage inside Test2 folder and Vice versa is successfull");
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		
		// Long Prees and Hold Test1 folder
				logger.info("Select Test2 Folder");
				System.out.println("Select Test2 Folder");
				MobileElement CheckTest4 =	driver.findElement(By.xpath("//*[@text='Test2']"));
				TouchAction touchAction6=new TouchAction(driver);
				touchAction6.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest4))).release().perform();
				TimeUnit.SECONDS.sleep(10);
				logger.info("Select Test2 folder and perform copy paste operation from external to internal memory");
				System.out.println("Select Test2 folder and perform copy paste operation from external to internal memory");
				// click on copy icon
				logger.info("Select copy option");
				System.out.println("Select copy option");
				driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Copy selected folder\"]/android.widget.ImageView")).click();
				TimeUnit.SECONDS.sleep(5);
				// wait for 15 secs till the copy operation completes
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
				InternalStorage.click();
				TimeUnit.SECONDS.sleep(5);
				driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
				TimeUnit.SECONDS.sleep(120);
				logger.info("Copy paste from internal memory to external memory and vice versa scenario completed successfully");
				System.out.println("Copy paste from internal memory to external memory and vice versa scenario completed successfully");

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				//select external storage
				MobileElement ExternalStorage4 =	driver.findElement(By.xpath("//*[@text='SD card']"));
				ExternalStorage4.click();
		// Select more options and select create folder 
				logger.info("Select more options and select create folder option");
				System.out.println("Select more options and select create folder option");		
				
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
		logger.info("Click create folder");
		System.out.println("Click create folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Create\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("New_scenario folder created successfully");
		System.out.println("New_scenario folder created successfully");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		//Switch to internal storage
		logger.info("Switch to internal storage");
		System.out.println("Switch to internal storage");
		MobileElement InternalStorage1 =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
		InternalStorage1.click();
		//long press and Hold Test1 folder
		logger.info("Select Test2 Folder from Internal Storage");
		System.out.println("Select Test2 Folder from Internal Storage");
		MobileElement CheckTest2 =	driver.findElement(By.xpath("//*[@text='Test2']"));
		TouchAction touchAction5=new TouchAction(driver);
		touchAction5.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (CheckTest2))).release().perform();
		TimeUnit.SECONDS.sleep(10);
		
		// click on copy icon
		logger.info("Select move option");
		System.out.println("Select move option");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Move selected folder\"]/android.widget.ImageView")).click();
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		//Select external storage
		logger.info("Select external storage");
		System.out.println("Select external storage");
		MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
		ExternalStorage.click();
		
		//Select New_Scenario folder
		logger.info("Select New_Scenario folder");
		System.out.println("Select New_Scenario folder");
		String text3 = "New_Scenario";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text3+"\"));")).click();
		TimeUnit.SECONDS.sleep(5);
		// click on move here
		logger.info("Select move here option");
		System.out.println("Select move here option");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/operation_done")).click();
		// wait for 15 secs till the copy operation completes
		TimeUnit.SECONDS.sleep(120);
		//Switch Back to List view mode from Grid View mode
		logger.info("switch to list view mode");
		System.out.println("switch to list view mode");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/menu_toggle_list_type")).click();
		TimeUnit.SECONDS.sleep(5);	
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
		
		logger.info("Cut paste Operation Completed Successfully");
		
		System.out.println("Cut paste Operation Completed Successfully");
		
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 logger.info("Test:End");
		 System.out.println("Final message:Pass Test18 pass for copy paste & cut paste operation");
		 logger.info("Final message:Pass Test18 pass for copy paste & cut paste operation");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test End");
		System.out.println("Test End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	} 
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Test18 Fail for copy paste and cut paste operation");
			System.out.println("Fail: Test18 Fail for copy paste and cut paste operation");
			logger.info("Final Message: Test18 Fail for copy paste and cut paste operation");
			System.out.println("Final Message: Test18 Fail for copy paste and cut paste operation");
			logger.info("Test End");
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}