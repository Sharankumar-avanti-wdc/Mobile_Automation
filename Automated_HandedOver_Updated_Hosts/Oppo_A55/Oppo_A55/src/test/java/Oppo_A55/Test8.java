package Oppo_A55;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
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
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey; 
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A55");
		dc.setCapability(MobileCapabilityType.UDID, "S8SOI74DV4MNOVTK");
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
		//calling PlayCopiedAudioFile to play back copied audio files from Test1 folder 
		logger.info("calling PlayCopiedAudioFile to play back copied audio files from Test1 folder ");
		System.out.println("calling PlayCopiedAudioFile to play back copied audio files from Test1 folder ");
		PlayCopiedAudioFile();
	}
	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		try {
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Launching file manager application");
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select External Storage	
			logger.info("Select external storage");
			System.out.println("Select external storage");
			MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
			Ext.click();
			TimeUnit.SECONDS.sleep(5);
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
				// FastForward
				logger.info("Fast Forwarding Audio for 10 Seconds");
				System.out.println("Fast Forwarding Audio for 10 Seconds");
				TouchAction touchAction = new TouchAction(driver);
				touchAction.tap(PointOption.point(608, 1326)).perform();
				TimeUnit.SECONDS.sleep(10);
				logger.info("Pause Audio");
				System.out.println("Pause Audio");
				//Pause Video
				MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")); 
				Pause.click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Pass: 1st Audio Play Back Successfull ");
				System.out.println("Pass: 1st Audio Play Back Successfull ");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
			}
			catch (Exception e) {
				logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
				System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			}	
			try {
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
				TimeUnit.SECONDS.sleep(30);
				logger.info("Select second audio file for play back");
				System.out.println("Select second audio file for play back");
				// FastForward
				logger.info("Fast Forwarding Audio for 10 Seconds");
				System.out.println("Fast Forwarding Audio for 10 Seconds");
				TouchAction touchAction = new TouchAction(driver);
				touchAction.tap(PointOption.point(608, 1326)).perform();
				TimeUnit.SECONDS.sleep(10);
				logger.info("Pause Audio");
				System.out.println("Pause Audio");
				//Pause Video
				MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")); 
				Pause.click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Pass: 2nd Audio Play back succssfull");
				System.out.println("Pass: 2nd Audio Play back succssfull");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
			}
			catch (Exception e) {
				logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
				System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			}
			logger.info("Select third audio file for play back");
			System.out.println("Select third audio file for play back");
			//Click 1st File to Play Video
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Laahe.Mp3.mp3\")").click();
				TimeUnit.SECONDS.sleep(30);
				//Click On Fast Forward
				//MobileElement FasForward2 = driver.findElement(By.xpath("//*[@bounds='[133,1755][953,1845]']")); 
				//FasForward2.click();
				TimeUnit.SECONDS.sleep(3);
				// FastForward
				logger.info("Fast Forwarding Audio for 10 Seconds");
				System.out.println("Fast Forwarding Audio for 10 Seconds");
				TouchAction touchAction = new TouchAction(driver);
				touchAction.tap(PointOption.point(608, 1326)).perform();
				TimeUnit.SECONDS.sleep(10);
				logger.info("Pause Audio");
				System.out.println("Pause Audio");
				//Pause Video
				MobileElement Pause = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")); 
				Pause.click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Pass: 3rd Audio Play Back Successfull ");
				System.out.println("Pass: 3rd Audio Play Back Successfull ");
			}
			catch (Exception e) {
				logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
				System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
				System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
				logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
		} 	
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for  copied audio play back and fast forward scenario is successfull");
			System.out.println("Final Message: Fail Test8 Fail for  copied audio play back and fast forward scenario is successfull");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}

