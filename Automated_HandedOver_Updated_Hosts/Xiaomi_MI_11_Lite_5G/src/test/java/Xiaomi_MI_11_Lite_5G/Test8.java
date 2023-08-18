package Xiaomi_MI_11_Lite_5G;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test8
{
	// initializing the driver instance
	AppiumDriver<MobileElement> driver;
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
	public void recordAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test8.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test8 scenario is as follows");
		logger.info("1.Host voice recorder application does not support uSD storage option. Hence skipping voice recording scenario!");
		logger.info("2.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8 scenario is as follows");
		System.out.println("1.Host voice recorder application does not support uSD storage option. Hence skipping voice recording scenario!");
		System.out.println("2.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
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
		//calling PlayCopiedAudioFile to play back copied audio files from Test1 folder 
		logger.info("calling PlayCopiedAudioFile to play back copied audio files from Test1 folder ");
		System.out.println("calling PlayCopiedAudioFile to play back copied audio files from Test1 folder ");
		PlayCopiedAudioFile();
	}
	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//launch home screen
		((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		//Launch File manager
		logger.info("Launch file manager application to play Copied Audio Files");
		System.out.println("Launch file manager application to play Copied Audio Files");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launching file manager application");
		System.out.println("Launching file manager application");
		//Select Browse option
		logger.info("click on browse option");
		System.out.println("click on browse option");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select External Storage	
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		logger.info("Select external storage");
		System.out.println("Select external storage");
		MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
		Ext.click();
		TimeUnit.SECONDS.sleep(5);
		//Switch grid view mode
		logger.info("switch to grid view mode to select Test1 folder");
		System.out.println("switch to grid view mode to select Test1 folder");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//Select Test1 folder
		logger.info("Select Test1 folder");
		System.out.println("Select Test1 folder");
		MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
		Test1.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Test_file folder
		logger.info("Select test_file  folder");
		System.out.println("Select test_file folder");
		MobileElement test_file = driver.findElement(By.xpath("//*[@text='test_file']")); 
		test_file.click();
		TimeUnit.SECONDS.sleep(3);
		//Select OneGB folder
		logger.info("Select 1GB folder");
		System.out.println("Select 1GB folder");
		MobileElement OneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
		OneGB.click();
		TimeUnit.SECONDS.sleep(3);
		//Swtich to list view mode
		logger.info("switch back to list  view mode");
		System.out.println("switch back to list  view mode");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
		TimeUnit.SECONDS.sleep(3);
		//click on Mp3 file Folder
		logger.info("Select Mp3 files folder");
		System.out.println("Select MP3 files folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"MP3 Files\")").click();
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Select First audio file for play back");
		logger.info("Select First audio file for play back");
		//Click 1st File to Play Video
		try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"11 Rob Thomas - Lonely No More.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			MobileElement FasForward1 = driver.findElement(By.xpath("//*[@content-desc='Fast forward 10 seconds']")); 
			TimeUnit.SECONDS.sleep(3);
			//Pause Video
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']"));
			Pause.click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass:  First Audio Play Back Successfull ");
			System.out.println("Pass:  First Audio Play Back Successfull ");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for  First Copied audio file playback,fast forward scenario");
			System.out.println("Fail: Test8 Fail for  First Copied audio file playback,fast forward scenario");

		}	
		try {
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			logger.info("Select Second audio file for play back");
			System.out.println("Select Second audio file for play back");
			TimeUnit.SECONDS.sleep(30);
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			MobileElement FasForward2 = driver.findElement(By.xpath("//*[@content-desc='Fast forward 10 seconds']")); 
			TimeUnit.SECONDS.sleep(3);
			//Pause Video
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']"));
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Second Audio Play back succssfull");
			System.out.println("Pass: Second Audio Play back succssfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Second Copied audio file playback,fast forward scenario");
			System.out.println("Fail: Test8 Fail for Second Copied audio file playback,fast forward scenario");
		}
		logger.info("Select third audio file for play back");
		System.out.println("Select third audio file for play back");
		//Click 1st File to Play Video
		try
		{
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Laahe.Mp3.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			MobileElement FasForward2 = driver.findElement(By.xpath("//*[@content-desc='Fast forward 10 seconds']")); 
			TimeUnit.SECONDS.sleep(3);
			//Pause Video
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			//Pause Video
			MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']"));
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: third Audio Play Back Successfull ");
			System.out.println("Pass: v Audio Play Back Successfull ");
			logger.info("Pass: Test8 Pass NA :  copied audio play back and fast forward scenario is successfull");
			System.out.println("Pass: Test8 Pass NA :  copied audio play back and fast forward scenario is successfull");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			logger.info("Final Message: Pass Test8 Pass NA -  copied audio play back and fast forward scenario is successfull");
			System.out.println("Final Message: Pass Test8 Pass NA -  copied audio play back and fast forward scenario is successfull");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	} 	
}