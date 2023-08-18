package Vivo_V19_1933;
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
import Vivo_V19_1933.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1933");
		dc.setCapability(MobileCapabilityType.UDID, "39a79e47");
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
		((AndroidDriver) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);

		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.bbk.launcher2", "com.bbk.launcher2.Launcher"));
		TimeUnit.SECONDS.sleep(5);

		//Clear recent apps if open apps in background
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		try {
			logger.info("Clearing recent apps");
			System.out.println("Clearing recent apps");
			MobileElement  Clear =	driver.findElement(By.xpath("//*[@bounds='[83,1997][997,2151]']"));
			Clear.click();
			TimeUnit.SECONDS.sleep(3);
		}
		catch (Exception e) {
			logger.info("No recent apps found in background");
			System.out.println("No recent apps found in background");
		}
		try {
			//Declaring format cycle using argument passing
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test3.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
			System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
			int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
			// capture 10 pics for the selected resolution
			for(int j = 0; j < mountUnmountCycleInt; j++) 
			{ 
				//Launch settings application
				logger.info("Launch  setting application to mount,unmount and Format USD card");
				System.out.println("Launch  setting application and mount,unmount and Format USD card");

				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				// search for battery and device care element
				TimeUnit.SECONDS.sleep(5);
				logger.info("Scrolling tRAM & storage space is visible");
				System.out.println("Scrolling tRAM & storage space is visible");
				String text = "RAM & storage space";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				//click on storage
				logger.info("Select Ram & Storage space option");
				System.out.println("Select Ram & Storage space option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"RAM & storage space\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Select Unmount SD card option
				logger.info("Select Unmount SD card  option");
				System.out.println("Select Unmount SD card  option");
				driver.findElement(By.xpath("//*[@bounds='[0,1392][435,1457]']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Accept Unmount SD card option
				logger.info("Select OK option");
				System.out.println("Select OK option");
				driver.findElement(By.xpath("//*[@bounds='[541,2085][984,2151]']")).click();
				TimeUnit.SECONDS.sleep(15);
				//Select Mount SD card option
				logger.info("Select MOUNT SD Card option");
				System.out.println("Select Mount SD card option");
				driver.findElement(By.xpath("//*[@bounds='[0,1080][377,1145]']")).click();
				TimeUnit.SECONDS.sleep(15);

				//select this device option
				logger.info("Select Erase SD card option option");
				System.out.println("Select Erase SD card option option");
				driver.findElement(By.xpath("//*[@bounds='[0,1548][417,1613]']")).click();
				TimeUnit.SECONDS.sleep(3);
				//select Sandisk SD card option
				logger.info("Accept Erase SD card option");
				System.out.println("Accept Erase SD card option");
				driver.findElement(By.xpath("//*[@bounds='[48,2136][1032,2151]']")).click();
				TimeUnit.SECONDS.sleep(3);
				//select more option
				logger.info("Select Erase Everything option");
				System.out.println("Select Erase Everything option");
				driver.findElement(By.xpath("//*[@bounds='[48,2146][1032,2151]']")).click();
				TimeUnit.SECONDS.sleep(5);

				// wait for 2 mins
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");
				TimeUnit.SECONDS.sleep(60);

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				System.out.println("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
				logger.info("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
			}
			//Launch File Manager application to verify  Image capture
			logger.info("Launch File Manager application to verify  Card is fully Formated or not");
			System.out.println("Launch File Manager application to verify  Card is fully Formated or not");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);

			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			//Swipe and Select Internal storage
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			MobileElement Sdcard2= driver.findElement(By.xpath("//*[@text='SD card']"));
			Sdcard2.click();
			TimeUnit.SECONDS.sleep(5);

			//Search For DCIM Folder 
			logger.info("Select DCIM Folder");
			System.out.println("Select DCIM Folder");
			String text2 = "DCIM";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text2+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);

			try {
				//Search For Camera Folder
				logger.info("Click On Camera Folder");
				System.out.println("Click On Camera Folder");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
				TimeUnit.SECONDS.sleep(5);

				System.out.println("Fail: Images and videos are present in the DCIM folder. Hence format uSD Card operation fail");
				logger.info("Fail: Images and videos are present in the DCIM folder. Hence format uSD Card operation fail");
				logger.info("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card ");
				System.out.println("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}

			catch (Exception e) {

				e.printStackTrace();
				logger.info("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
				System.out.println("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Pass Test3 Pass for Unmount,Mount and Formattig uSD Card ");
				System.out.println("Final Message: Pass Test3 Pass for Unmount,Mount and Formattig uSD Card");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
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
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Test3 fail during Fomrat uSD card operation");
			System.out.println("Fail: Test3 fail during Fomrat uSD card operation");
			logger.info("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card ");
			System.out.println("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}



	}



}


