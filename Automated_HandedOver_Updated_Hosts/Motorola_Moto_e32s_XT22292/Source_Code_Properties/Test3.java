package Motorola_Moto_e32s_XT22292;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Motorola_Moto_e32s_XT22292.Test3;
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
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import io.appium.java_client.android.AndroidElement;

public class Test3 {
	// format card test case
	AppiumDriver<MobileElement> driver;
	public LogEntries logEntries;

	//<MobileElement> driver;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e32 (s)");
		dc.setCapability(MobileCapabilityType.UDID, "ZD2226GP6D");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//Test3 test case implementation launch settings application mount, unmount and Format USD card.
	@Test
	public void Format() throws InterruptedException, SecurityException, IOException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test3.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter);
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test3 Scenario is as follows");
		logger.info("1.Mount,Unmount uSD Card and Format uSD card for specified number of times");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test3 Scenario is as follows");
		System.out.println("1.Unmount uSD Card and Format card for specified number of times");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Unlocking Phone if locked
		logger.info("Unlocking Phone");
		System.out.println("Unlocking Phone");
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		try {
			//Launch home screen
			logger.info("Launch home screen");
			System.out.println("Launch home screen");
			((StartsActivity) driver).startActivity(new Activity("com.motorola.launcher3", "com.android.launcher3.CustomizationPanelLauncher"));
			TimeUnit.SECONDS.sleep(5);
			//Declaring format cycle using argument passing
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test3.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
			System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
			int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
			for(int j = 0; j < mountUnmountCycleInt; j++) 
			{ 
				//Launch settings application
				logger.info("Launch  setting application to mount,unmount and Format USD card");
				System.out.println("Launch  setting application and mount,unmount and Format USD card");

				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				// search for battery and device care element
				TimeUnit.SECONDS.sleep(5);
				logger.info("Scrolling till battery and device care is visible");
				System.out.println("Scrolling till battery and device care is visible");
				String text = "Storage";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				//click on storage
				logger.info("Clicking on storage");
				System.out.println("Clicking on storage");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Clicking on this device");
				System.out.println("Clicking on this device");
				driver.findElement(By.xpath("//*[@text='THIS DEVICE']")).click();
				TimeUnit.SECONDS.sleep(5);
				try
				{
					// click on SD card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SANDISK SD CARD\")").click();
					// click on Unmount and wait for 2 secs for it to get mounted
					TimeUnit.SECONDS.sleep(5);
				}
				catch (Exception e) {
					// click on SD card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"ANDROID\")").click();
					// click on Unmount and wait for 2 secs for it to get mounted
					TimeUnit.SECONDS.sleep(5);
				}
				logger.info("Clicking on files");
				System.out.println("Clicking on files");
				driver.findElement(By.xpath("//*[@text='Files']")).click();
				TimeUnit.SECONDS.sleep(5);
				//find element by xpath
				logger.info("Clicking on more options");
				System.out.println("Clicking on more options");
				MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				moreOptions.click();
				TimeUnit.SECONDS.sleep(5);
				//click on Storage settings
				logger.info("Clicking on Storage settings");
				System.out.println("Clicking on Storage settings");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Click Internal storage
				logger.info("Select eject");
				System.out.println("Select eject");
				MobileElement eject =	driver.findElement(By.xpath("//*[@text='EJECT']"));
				eject.click();
				TimeUnit.SECONDS.sleep(15);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				//click on storage
				logger.info("Clicking on storage");
				System.out.println("Clicking on storage");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Clicking on this device");
				System.out.println("Clicking on this device");
				driver.findElement(By.xpath("//*[@text='THIS DEVICE']")).click();
				TimeUnit.SECONDS.sleep(5);
				try
				{
					// click on SD card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SANDISK SD CARD\")").click();
					// click on Unmount and wait for 2 secs for it to get mounted
					TimeUnit.SECONDS.sleep(5);
				}
				catch (Exception e) {
					// click on SD card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"ANDROID\")").click();
					// click on Unmount and wait for 2 secs for it to get mounted
					TimeUnit.SECONDS.sleep(5);
				}
				//find element by xpath
				logger.info("Clicking on more options");
				System.out.println("Clicking on more options");
				MobileElement moreOptions1 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
				moreOptions1.click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("click on mount");
				System.out.println("click on mount");
				MobileElement TestFile = driver.findElement(By.xpath("//*[@text='Mount']")); 
				TestFile.click();
				TimeUnit.SECONDS.sleep(15);
				logger.info("Clicking on files");
				System.out.println("Clicking on files");
				driver.findElement(By.xpath("//*[@text='Files']")).click();
				TimeUnit.SECONDS.sleep(5);
				//find element by xpath
				logger.info("Clicking on more options");
				System.out.println("Clicking on more options");
				MobileElement moreOptions2 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				moreOptions2.click();
				TimeUnit.SECONDS.sleep(5);
				//click on Storage settings
				logger.info("Clicking on Storage settings");
				System.out.println("Clicking on Storage settings");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
				TimeUnit.SECONDS.sleep(5);
				// click on format
				logger.info("Click Format");
				System.out.println("Click Format");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
				TimeUnit.SECONDS.sleep(5);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
				// wait for 2 mins
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");
				TimeUnit.SECONDS.sleep(90);
				System.out.println("Format uSD card cycle:" + j+1 + " completed succesfully" );
				logger.info("Format uSD card cycle:" + j+1 + " completed succesfully" );
				Result = "Pass";
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			}
			//Launch File manager and verify card format status
			logger.info("Launch File Manager application to verify  Card is fully Formated or not");
			System.out.println("Launch File Manager application to verify  Card is fully Formated or not");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//If file manager permission request access accept allow permission
			try
			{

				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Click Accept & continue");
				System.out.println("Click Accept & continue");
				driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
				TimeUnit.SECONDS.sleep(5);
			}
			catch (Exception e) {
				e.printStackTrace();
			}

			//Swipe and Select Internal storage
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click Internal storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='SD card']"));
			SDCard.click();
			TimeUnit.SECONDS.sleep(6);
			//search for DCIM folder
			String text = "DCIM";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();

			try {
				//Search For Camera Folder
				MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
				Camera.click();
				//	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
				//	TimeUnit.SECONDS.sleep(5);
				System.out.println("Fail: Images and videos are present in the DCIM folder. Hence format uSD Card operation fail");
				logger.info("Fail: Images and videos are present in the DCIM folder. Hence format uSD Card operation fail");
				logger.info("Final Message: Fail Test3 Fail for  Formattig uSD Card ");
				System.out.println("Final Message: Fail Test3 Fail for  Formattig uSD Card");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}

			catch (Exception e) {
				e.printStackTrace();
				logger.info("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
				System.out.println("Pass: Images and videos are not present in the DCIM folder, CARD format is successfully completed ");

				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Pass Test3 Pass for  Formattig uSD Card and verify data format ");
				System.out.println("Final Message: Pass Test3 Pass for  Formattig uSD Card and verify data format");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			}



		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Test3 fail during Fomrat uSD card operation");
			System.out.println("Fail: Test3 fail during Fomrat uSD card operation");
			logger.info("Final Message: Fail Test3 Fail for Formattig uSD Card ");
			System.out.println("Final Message: Fail Test3 Fail for Formattig uSD Card");
			logger.info("Test End");
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}



	}
}







