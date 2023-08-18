package Motorola_Moto_G22_XT22312;
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
import Motorola_Moto_G22_XT22312.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g22");
		dc.setCapability(MobileCapabilityType.UDID, "ZT3229WXVR");
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
			// capture 10 pics for the selected resolution
			for(int j = 0; j < mountUnmountCycleInt; j++) 
			{ 
		//Launch settings application
		logger.info("Launch  setting application to mount,unmount and Format USD card");
		System.out.println("Launch  setting application and mount,unmount and Format USD card");
		try {
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
			//select this device option
			logger.info("Select this device option");
			System.out.println("Select this device option");
			driver.findElement(By.xpath("//*[@text='THIS DEVICE']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select Sandisk SD card option
			logger.info("Select Sandisk Sd card option");
			System.out.println("Select Sandisk Sd card option");
			driver.findElement(By.xpath("//*[@bounds='[28,546][331,609]']")).click();
			TimeUnit.SECONDS.sleep(3);
			//select more option
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(5);
			//Select Eject Option
			logger.info("Select Eject option");
			System.out.println("Select Eject option");
			driver.findElement(By.xpath("//*[@text='Eject']")).click();
			TimeUnit.SECONDS.sleep(5);
			//select more option
			logger.info("Select more options");
			System.out.println("Select more options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(5);
			//select more option
			logger.info("Select Mount option");
			System.out.println("Select Mount option");
			driver.findElement(By.xpath("//*[@text='Mount']")).click();
			TimeUnit.SECONDS.sleep(20);
			//select more option
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
			TimeUnit.SECONDS.sleep(5);
			
			// select format option
			logger.info("select format option");
			System.out.println("select format option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Accept format SD card pop-up
			logger.info("Accept format SD card pop-up");
			System.out.println("Accept format SD card pop-up");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			// wait for 2 mins
			logger.info("Started formatting, waiting till it gets formatted");
			System.out.println("Started formatting, waiting till it gets formatted");
			TimeUnit.SECONDS.sleep(30);
		
			logger.info("Unmount,mount and Format uSD card is successfull");
			System.out.println("Unmount,mount and Format uSD card is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			System.out.println("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
			logger.info("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
				//Launch File Manager application to verify  Image capture
				logger.info("Launch File Manager application to verify  Card is fully Formated or not");
				System.out.println("Launch File Manager application to verify  Card is fully Formated or not");
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);

				//Select SD Card
				logger.info("Select  SD Card");
				System.out.println("Select  SD Card");
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
}