package BLU_F91_5G;


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
import BLU_F91_5G.Test3;
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
	public void SetUp() throws MalformedURLException, InterruptedException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "F91 5G");
		dc.setCapability(MobileCapabilityType.UDID, "1030305022006683");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*dc.android().setCapability("unlockKey", "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]");
		String text1 = "unlockKey";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
		TimeUnit.SECONDS.sleep(5);*/
	}
	public String runadbcmd(String cmd) throws IOException, InterruptedException 
	{
		System.out.println("Running adb command");
		String line = "null";
		String tosend="";
		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd);
		//Using this command to clear recent apps
		pr.waitFor();
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		while ((line=buf.readLine())!=null) {
			tosend=line;
			System.out.println(line);
		}
		return tosend;

	}
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
		logger.info(" Mount,Unmount uSD Card and Format uSD card for specified number of times");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test3 Scenario is as follows");
		System.out.println(" Unmount uSD Card and Format card for specified number of times");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		try {
			//unlock phone if phone is lock
			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			TimeUnit.SECONDS.sleep(3);
			// click on close all
			try
			{
				logger.info("Clearing Recent Apps");
				System.out.println("Clearing Recent Apps");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Clear all\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Pass: Test0 Pass for clearing Recent apps ");
				System.out.println("Pass: Test0 Pass for clearing Recent apps ");
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.info("Pass: No recent apps found");
				System.out.println("Pass: No recent apps found");
			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
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
				// Launch settings app
				logger.info("Launch Settings application for Format uSD card with Data scenario ");
				System.out.println("Launch Settings application for Format uSD card with Data ");
				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				TimeUnit.SECONDS.sleep(5);
				////Scroll Up to find Storage option
				MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"System\"))"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select system");
				System.out.println("Select system");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"System\")").click();
				TimeUnit.SECONDS.sleep(4);
				logger.info("Select Storage");
				System.out.println("Select Storage");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(2);
				try {
					//Select uSD Card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='android']"));
					sdcard.click();
					TimeUnit.SECONDS.sleep(5);
				}
				catch (Exception e) {
					//Select uSD Card
					logger.info("Select uSD card");
					System.out.println("Select uSD card");
					driver.findElement(By.xpath("//*[@text='SanDisk SD card']")).click();
					TimeUnit.SECONDS.sleep(5);
				}
				TimeUnit.SECONDS.sleep(5);
				//Click on More Options
				logger.info("Clicking on moreoptions");
				System.out.println("Clicking on moreoptions");
				MobileElement moreoptions = 	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				moreoptions.click();
				TimeUnit.SECONDS.sleep(5);
				//Select formatsdcard
				logger.info("Select Storage settings");
				System.out.println("Select Storage settings");
				MobileElement formatsdcard1 = 	driver.findElement(By.xpath("//*[@text='Storage settings']"));
				formatsdcard1.click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select eject");
				System.out.println("Select eject");
				driver.findElement(By.xpath("//*[@text='EJECT']")).click();
				TimeUnit.SECONDS.sleep(15);
				try {
					//Select uSD Card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='android']"));
					sdcard.click();
					TimeUnit.SECONDS.sleep(5);
				}
				catch (Exception e) {
					//Select uSD Card
					logger.info("Select uSD card");
					System.out.println("Select uSD card");
					driver.findElement(By.xpath("//*[@text='SanDisk SD card']")).click();
					TimeUnit.SECONDS.sleep(5);
				}
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select MOUNT");
				System.out.println("Select MOUNT");
				driver.findElement(By.xpath("//*[@text='Mount']")).click();
				TimeUnit.SECONDS.sleep(15);
				try {
					//Select uSD Card
					logger.info("Clicking on SD card");
					System.out.println("Clicking on SD card");
					MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='android']"));
					sdcard.click();
					TimeUnit.SECONDS.sleep(5);
				}
				catch (Exception e) {
					//Select uSD Card
					logger.info("Select uSD card");
					System.out.println("Select uSD card");
					driver.findElement(By.xpath("//*[@text='SanDisk SD card']")).click();
					TimeUnit.SECONDS.sleep(5);
				}
				TimeUnit.SECONDS.sleep(5);
				//Click on More Options
				logger.info("Clicking on moreoptions");
				System.out.println("Clicking on moreoptions");
				MobileElement moreoptions0 = 	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				moreoptions0.click();
				TimeUnit.SECONDS.sleep(5);
				//Select formatsdcard
				logger.info("Select Storage settings");
				System.out.println("Select Storage settings");
				MobileElement formatsdcard01 = 	driver.findElement(By.xpath("//*[@text='Storage settings']"));
				formatsdcard01.click();
				TimeUnit.SECONDS.sleep(5);
				// Select Format option
				logger.info("Select  format");
				System.out.println("Select  format");
				MobileElement formatsdcard2 = 	driver.findElement(By.xpath("//*[@text='Format']"));
				formatsdcard2.click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select again formatsdcard");
				System.out.println("Select again formatsdcard");
				MobileElement formatsdcard3 = 	driver.findElement(By.xpath("//*[@text='Format SD card']"));
				formatsdcard3.click();
				TimeUnit.SECONDS.sleep(40);
				logger.info("Accept to Format uSD Card");
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Accept to Format uSD Card");
				System.out.println("Started formatting, waiting till it gets formatted");
				System.out.println("Format uSD card cycle:" + j+1 + " completed succesfully" );
				logger.info("Format uSD card cycle:" + j+1 + " completed succesfully" );
				logger.info("Going back to home screen");
				System.out.println("Going back to home screen");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
				Result = "Pass";
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
				logger.info("Final Message: Pass Test3 Pass for mount,unmount & Formattig uSD Card and verify data format ");
				System.out.println("Final Message: Pass Test3 Pass for mount,unmount & Formattig uSD Card and verify data format");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(4);
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








