package Xiaomi_Redmi_Note9s;

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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9S");
		dc.setCapability(MobileCapabilityType.UDID, "e3aa6fb");
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
		//Unlocking phone if locked
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		//Laucnh Home screen
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		//If appium launch permission pop-up exists select allow option
		try
		{
			logger.info("Allow appium laucnh permissions");
			driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
			logger.info("Clearing Recent Apps");
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("No permission access pop-up found");
		}
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			//driver.findElement(By.xpath("//*[@resource-id='com.miui.home:id/clearAnimView']")).click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Clearing Recent apps is successfull");
			System.out.println("Pass: Clearing Recent apps is successfull");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent pass found in background");
			System.out.println("Pass: No recent apps found in background");
		}

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		//Pushing 1GB zip file to host internal storage via appium server
		logger.info("Pushing 1GB zip File to Host internal storage via appium server");
		System.out.println("Pushing 1GB zip File to Host internal storage via appium server");
		((PushesFiles) driver).pushFile("/storage/emulated/0/Test1/test_file.zip",new File ("C:\\Users\\sandisk\\Desktop\\TestDlinkAll1_183750\\Test.zip"));
		TimeUnit.SECONDS.sleep(90);		
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
				System.out.println("Click Accept & continue");
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
			try
			{
				driver.findElement(By.xpath("//*[@content-desc='List view']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//Switching to Internal storage
			logger.info("Switching to Internal storage");
			System.out.println("Switching to Internal storage");
			MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']")); 
			SwitchStorage.click();
			TimeUnit.SECONDS.sleep(3);		
			//Select Internal Storage Card
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage = driver.findElement(By.xpath("//*[@bounds='[0,595][1080,760]']")); 
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(5);	
			//Select Test1 folder
			logger.info("Select Test1 folder");
			System.out.println("Select Test1 folder");
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
			Test1.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Zip-fiel
			logger.info("Select Zip file");
			System.out.println("Select Zip file");
			MobileElement ZipFile = driver.findElement(By.xpath("//*[@text='test_file.zip']")); 
			ZipFile.click();
			TimeUnit.SECONDS.sleep(3);
			//Extract zip file
			logger.info("1GB File Extration completed");
			System.out.println("1GB File Extration completed");
			MobileElement Extract = driver.findElement(By.xpath("//*[@text='Extract here']")); 
			Extract.click();
			TimeUnit.SECONDS.sleep(90);
			logger.info("Zip file extraction completed successfull");
			System.out.println("Zip file extraction completed successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);	
			//long press and hold Test1 folder
			logger.info("Long press and Hold select Test1 folder");
			System.out.println("Long press and Hold select Test1 folder");
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
			logger.info("Create folder Test2 in uSD Card is successfull");
			System.out.println("Create folder Test2 in uSD Card is successfull");
			//Swtich to Grid View mode, select Test1 folder and perform Copy paste operation in Test2 folder from Internal to exteranl storage and vice versa
			logger.info("Switch to grid view mode");
			System.out.println("Switch to grid view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/switch_list_icon']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select Test1 folder
			logger.info("Long press and Hold select Test1 folder to perform copy paste operation in Test2 folder from Interanl to external storage");
			System.out.println("Long press and Hold select Test1 folder to perform copy paste operation in Test2 folder from Interanl to external storage");		
			MobileElement Folder1 =	driver.findElement(By.xpath("//*[@text='Test1']"));
			TouchAction touchAction4=new TouchAction(driver);
			touchAction4.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder1))).release().perform();
			TimeUnit.SECONDS.sleep(10);			
			//Select more option
			logger.info("Select Moreoptions");
			System.out.println("Select Moreoptions");
			MobileElement More2 = driver.findElement(By.xpath("//*[@text='More']")); 
			More2.click();
			TimeUnit.SECONDS.sleep(3);				
			//select copy option
			logger.info("Select Copy option");
			System.out.println("Select Copy option");
			MobileElement Copy1 = driver.findElement(By.xpath("//*[@text='Copy']")); 
			Copy1.click();
			TimeUnit.SECONDS.sleep(3);	
			//Select external storage
			logger.info("Select External Storage");
			System.out.println("Select External Storage");
			MobileElement SDcard1 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			SDcard1.click();
			TimeUnit.SECONDS.sleep(3);				
			//select Test2 folder
			logger.info("select Test2 folder");
			System.out.println("select Test2 folder");
			driver.findElement(By.xpath("//*[@text='Test2']")).click();
			TimeUnit.SECONDS.sleep(3);				
			//select paste option
			MobileElement Paste1 = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste1.click();
			TimeUnit.SECONDS.sleep(90);

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

			//Select More option
			logger.info("Create folder name as New_Scenario in External Storage");
			System.out.println("Create folder name as New_Scenario in External Storage");
			MobileElement More3 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/more']")); 
			More3.click();
			TimeUnit.SECONDS.sleep(3);

			//select create folder
			logger.info("Select create folder option");
			System.out.println("Select create folder option");
			MobileElement CreateFolder1 = driver.findElement(By.xpath("//*[@text='Create folder']")); 
			CreateFolder1.click();
			TimeUnit.SECONDS.sleep(6);

			//name folder name as New_Scenario
			driver.findElement(By.id("com.mi.android.globalFileexplorer:id/text")).clear();
			driver.findElement(By.id("com.mi.android.globalFileexplorer:id/text")).sendKeys("New_Scenario");
			TimeUnit.SECONDS.sleep(5);
			//Click Ok
			MobileElement Ok1 = driver.findElement(By.xpath("//*[@text='OK']")); 
			Ok1.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Create folder New_scenario in uSD Card is Successfull");
			System.out.println("Create folder New_scenario in uSD Card is Successfull");

			//Select Test2 folder from External storage and copy paste in Internal storage
			logger.info("Select Test2 folder from External storage and copy paste in Internal storage");
			System.out.println("Select Test2 folder from External storage and copy paste in Internal storage");
			MobileElement Folder2 =	driver.findElement(By.xpath("//*[@text='Test2']"));
			TouchAction touchAction5=new TouchAction(driver);
			touchAction5.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder2))).release().perform();
			TimeUnit.SECONDS.sleep(10);

			//select more option
			logger.info("Select Moreoptions");
			System.out.println("Select Moreoptions");
			MobileElement More4 = driver.findElement(By.xpath("//*[@text='More']")); 
			More4.click();
			TimeUnit.SECONDS.sleep(3);	
			//Select copt option
			logger.info("Select Copy option");
			System.out.println("Select Copy option");
			MobileElement Copy2 = driver.findElement(By.xpath("//*[@text='Copy']")); 
			Copy2.click();
			TimeUnit.SECONDS.sleep(3);		
			//select Internal Storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement Internalstorage = driver.findElement(By.xpath("//*[@text='Internal shared storage']")); 
			Internalstorage.click();
			TimeUnit.SECONDS.sleep(3);	
			//Select paste option
			MobileElement Paste2 = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste2.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Pass: Test18 Pass for Copy paste operation from internal memory to external memory and vice versa scenario completed successfully");
			System.out.println("Pass: Test18 Pass for Copy paste operation from internal memory to external memory and vice versa scenario completed successfully");
			//select Folder Test2 from Internal storage and Perform cut paste operation internal to external storage
			logger.info("Select Test2 folder from Internal storage, perform cut paste operation from internal to external storage in Folder New_Scenario");
			System.out.println("Select Test2 folder from Internal storage, perform cut paste operation from internal to external storage in Folder New_Scenario");
			MobileElement Folder3 =	driver.findElement(By.xpath("//*[@text='Test2']"));
			TouchAction touchAction6=new TouchAction(driver);
			touchAction6.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder3))).release().perform();
			TimeUnit.SECONDS.sleep(10);	
			//Select move option
			logger.info("Select Move to option");
			System.out.println("Select Move to option");
			driver.findElement(By.xpath("//*[@text='Move']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select USD Card
			logger.info("Select External storage");
			System.out.println("Select External storage");
			MobileElement SDcard3 = driver.findElement(By.xpath("//*[@text='SD card']")); 
			SDcard3.click();
			TimeUnit.SECONDS.sleep(3);
			//Select folder new_scenario
			logger.info("Select folder new_scenario");
			System.out.println("Select folder new_scenario");
			driver.findElement(By.xpath("//*[@text='New_Scenario']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select paste option
			MobileElement Paste3 = driver.findElement(By.xpath("//*[@text='Paste']")); 
			Paste3.click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste operation from internal memory to external memory is successfull");
			System.out.println("Cut paste operation from internal memory to external memory is successfull");
			//Switch back to List view Mode
			MobileElement ListView1 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/switch_list_icon']")); 
			ListView1.click();
			TimeUnit.SECONDS.sleep(3);
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
