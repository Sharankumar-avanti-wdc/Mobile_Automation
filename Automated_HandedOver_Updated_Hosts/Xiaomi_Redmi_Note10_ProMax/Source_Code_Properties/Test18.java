package Xiaomi_RedmiNoteProMax;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10 Pro Max");
		dc.setCapability(MobileCapabilityType.UDID, "fcf05cba");
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
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Laucnh Home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);

		//If appium launch permission pop-up exists select allow option
		try
		{
			logger.info("Allow appium permission access:");
			System.out.println("Allow appium permission access:");
			driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
			logger.info("Clearing Recent Apps");
			TimeUnit.SECONDS.sleep(5);

		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("No permission access pop-up found");
			System.out.println("No permission access pop-up found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Pushing 1GB zip file to host internal storage via appium server
		logger.info("Pushing 1GB zip File to Host internal storage via appium server");
		System.out.println("Pushing 1GB zip File to Host internal storage via appium server");
		//((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(30);	
		logger.info("Pushing 1GB zip File to Host internal storage via appium server is successfull");
		System.out.println("Pushing 1GB zip File to Host internal storage via appium server is successfull");
		try {
			//Launch File manager to perform copy paste and cut paste operation
			logger.info("Launch file manager application to perform copy paste and cut paste operation from Internal to external storage");
			System.out.println("Launch file manager application to perform copy paste and cut paste operation from Internal to external storage");
			((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If file manager permission request access pop-up exists accept allow permission
			try
			{
				driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/confirm_btn']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click Accept & continue");
				driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Select Storage button
			logger.info("Select storage option");
			System.out.println("Select storage option");
			MobileElement StorageButton = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Storage\"]"));
			StorageButton.click();
			TimeUnit.SECONDS.sleep(5);
			//Switching to Internal storage
			logger.info("Switch to internal storage");
			System.out.println("Switch to internal storage");
			MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']")); 
			SwitchStorage.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Internal Storage Card
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage = driver.findElement(By.xpath("//*[@text='Internal shared storage']")); 
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Test1 folder
			logger.info("Select Test1 folder");
			System.out.println("Select Test1 folder");
			//MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			//Test1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Zip-fiel
			logger.info("Select test_file Zip file");
			System.out.println("Select test_file Zip file");
			//MobileElement ZipFile = driver.findElement(By.xpath("//*[@text='test_file.zip']")); 
			//ZipFile.click();
			TimeUnit.SECONDS.sleep(3);
			//Extract zip file
			logger.info("select extract option");
			System.out.println("select extract option");
			//MobileElement Extract = driver.findElement(By.xpath("//*[@text='Extract here']")); 
			//Extract.click();
			TimeUnit.SECONDS.sleep(90);
			logger.info("Zip file extraction completed successfull");
			System.out.println("Zip file extraction completed successfull");
			//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			//TimeUnit.SECONDS.sleep(2);


			//long press and hold Test1 folder
			logger.info("Select Test1 folder from internal storage");
			System.out.println("Select Test1 folder from internal storage");
			MobileElement Folder =	driver.findElement(By.xpath("//*[@text='Test1']"));
			TouchAction touchAction3=new TouchAction(driver);
			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//click more options
			logger.info("Select More options");
			System.out.println("Select More options");
			MobileElement More = driver.findElement(By.xpath("//*[@text='More']")); 
			More.click();
			TimeUnit.SECONDS.sleep(3);	

			//Select copy option
			logger.info("Select Copy option");
			System.out.println("Select Copy option");
			MobileElement Copy = driver.findElement(By.xpath("//*[@text='Copy']")); 
			Copy.click();
			TimeUnit.SECONDS.sleep(3);	

			//Select external storage
			logger.info("Select external storage");
			System.out.println("Select external storage");
			MobileElement SDcard = driver.findElement(By.xpath("//*[@text='SD card']")); 
			SDcard.click();
			TimeUnit.SECONDS.sleep(3);

			//select paste option
			logger.info("Select Paste option");
			System.out.println("Select Paste option");
			MobileElement Paste = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Pass: Test1 folder from internal to external storage is successfull");
			System.out.println("Pass: Test1 folder from internal to external storage is successfull");
			//Select more options
			logger.info("Select more option");
			System.out.println("Select more option");
			MobileElement More1 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/more']")); 
			More1.click();
			TimeUnit.SECONDS.sleep(6);
			//select create folder
			logger.info("Select create folder");
			System.out.println("Select create folder");
			MobileElement CreateFolder = driver.findElement(By.xpath("//*[@text='Create folder']")); 
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);

			//Name folder name as Test2
			logger.info("Name new folder name as Test2");
			System.out.println("Name new folder name as Test2");
			driver.findElement(By.id("com.mi.android.globalFileexplorer:id/text")).clear();
			driver.findElement(By.id("com.mi.android.globalFileexplorer:id/text")).sendKeys("Test2");
			TimeUnit.SECONDS.sleep(5);
			//Click Ok
			MobileElement Ok = driver.findElement(By.xpath("//*[@text='OK']")); 
			Ok.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Test2 folder created successully in external storage");
			System.out.println("Test2 folder created successully in external storage");

			//Swtich to Grid View mode, select Test1 folder and perform Copy paste operation in Test2 folder from Internal to exteranl storage and vice versa
			logger.info("Switch to grid view mode");
			System.out.println("Switch to grid view mode");

			driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/switch_list_icon']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test1 folder
			logger.info("select Test1 folder from external storage");
			System.out.println("select Test1 folder from external storage");
			MobileElement Folder1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
			TouchAction touchAction4=new TouchAction(driver);
			touchAction4.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder1))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//Select more option
			logger.info("select more option");
			System.out.println("select more option");
			MobileElement More2 = driver.findElement(By.xpath("//*[@text='More']")); 
			More2.click();
			TimeUnit.SECONDS.sleep(3);	
			//select copy option
			logger.info("select copy option");
			System.out.println("select copy option");
			MobileElement Copy1 = driver.findElement(By.xpath("//*[@text='Copy']")); 
			Copy1.click();
			TimeUnit.SECONDS.sleep(3);	
			//Select external storage
			logger.info("select uSD card");
			System.out.println("select uSD card");
			MobileElement SDcard1 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			SDcard1.click();
			TimeUnit.SECONDS.sleep(3);
			//select Test2 folder
			logger.info("select Test2 folder");
			System.out.println("select Test2 folder");
			driver.findElement(By.xpath("//*[@text='Test2']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select paste option
			logger.info("select paste option");
			System.out.println("select paste option");
			MobileElement Paste1 = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste1.click();
			TimeUnit.SECONDS.sleep(90);
			logger.info("Pass: Copy paste of Test1 folder to Test2 folder within external storage is successfull");
			System.out.println("Pass: Copy paste of Test1 folder to Test2 folder within external storage is successfull");






			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			//Select More option
			logger.info("Create folder name as New_Scenario in External Storage");
			System.out.println("Create folder name as New_Scenario in External Storage");
			MobileElement More3 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/more']")); 
			More3.click();
			TimeUnit.SECONDS.sleep(3);	
			//select create folder
			logger.info("select create folder option");
			System.out.println("select create folder option");
			MobileElement CreateFolder1 = driver.findElement(By.xpath("//*[@text='Create folder']")); 
			CreateFolder1.click();
			TimeUnit.SECONDS.sleep(6);
			//name folder name as New_Scenario
			logger.info("Name folder name as New_Scenario");
			System.out.println("Name folder name as New_Scenario");
			driver.findElement(By.id("com.mi.android.globalFileexplorer:id/text")).clear();
			driver.findElement(By.id("com.mi.android.globalFileexplorer:id/text")).sendKeys("New_Scenario");
			TimeUnit.SECONDS.sleep(5);
			//Click Ok
			MobileElement Ok1 = driver.findElement(By.xpath("//*[@text='OK']")); 
			Ok1.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("New_Scenario folder in external storage is successfull");
			System.out.println("New_Scenario folder in external storage is successfull");
			//Select Test2 folder from External storage and copy paste in Internal storage
			logger.info("Select Test2 folder from External storage");
			System.out.println("Select Test2 folder from External storage");
			MobileElement Folder2 =	driver.findElement(By.xpath("//*[@text='Test2']"));
			TouchAction touchAction5=new TouchAction(driver);
			touchAction5.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder2))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//select more option
			logger.info("select more option");
			System.out.println("select more option");
			MobileElement More5 = driver.findElement(By.xpath("//*[@text='More']")); 
			More5.click();
			TimeUnit.SECONDS.sleep(3);	
			//Select copt option
			logger.info("select copy option");
			System.out.println("select copy option");
			MobileElement Copy2 = driver.findElement(By.xpath("//*[@text='Copy']")); 
			Copy2.click();
			TimeUnit.SECONDS.sleep(3);	
			//select Internal Stoarage
			logger.info("select Internal storage option");
			System.out.println("select internal storage option");
			MobileElement Internalstorage = driver.findElement(By.xpath("//*[@text='Internal shared storage']")); 
			Internalstorage.click();
			TimeUnit.SECONDS.sleep(3);
			//Select paste option
			logger.info("select paste option");
			System.out.println("select paste option");
			MobileElement Paste2 = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste2.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Pass: Test18 pass for Copy paste operation from internal to external storage and vice-versa");
			System.out.println("Pass: Test18 pass for Copy paste operation from internal to external storage and vice-versa");	


			//select Folder Test2 from Internal storage and Perform cut paste operation internal to external storage
			logger.info("Select Test2 folder from Internal storage");
			System.out.println("Select Test2 folder from Internal storage");
			MobileElement Folder5 =	driver.findElement(By.xpath("//*[@text='Test2']"));
			TouchAction touchAction7=new TouchAction(driver);
			touchAction7.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder5))).release().perform();
			TimeUnit.SECONDS.sleep(10);
			//Select move option
			logger.info("select move option");
			System.out.println("select move option");
			driver.findElement(By.xpath("//*[@text='Move']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select USD Card
			logger.info("select external storage option");
			System.out.println("select external storage option");
			MobileElement SDcard3 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			SDcard3.click();
			TimeUnit.SECONDS.sleep(3);
			//Select folder new_scenario
			logger.info("select New_Scenario folder");
			System.out.println("select New_Scenario folder");
			driver.findElement(By.xpath("//*[@text='New_Scenario']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select paste option
			logger.info("select paste option");
			System.out.println("select paste option");
			MobileElement Paste3 = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste3.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste operation from internal memory to external memory is successfull");
			System.out.println("Cut paste operation from internal memory to external memory is successfull");
			//Switch back to List view Mode
			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/switch_list_icon']")); 
			ListView1.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Cut paste Operation Completed Successfully");

			System.out.println("Pass: Cut paste Operation Completed Successfully");

			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Final message: Pass Test18 pass for copy paste & cut paste operation");
			logger.info("Final message: Pass Test18 pass for copy paste & cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		}  

		catch (Exception e) {
			System.out.println("Fail: Test18 Fail for Copy paste and Cut paste operation");
			logger.info("Fail: Test18 Fail for Copy paste and Cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Final message: Fail Test18 fail for copy paste & cut paste operation");
			logger.info("Final message: Fail Test18 fail for copy paste & cut paste operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Test:End");
			System.out.println("Test:End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}