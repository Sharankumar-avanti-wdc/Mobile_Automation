package Ikall_Z7;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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

import Ikall_Z7.Test3_Int;
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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;
import io.appium.java_client.android.AndroidElement;

public class Test3_Int {
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z7");
		dc.setCapability(MobileCapabilityType.UDID, "0123456789ABCDEF");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		FileHandler fileHandler = new FileHandler("status_log_Test3_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test3_Int Scenario is as follows");
		logger.info("1.Mount,Unmount uSD Card and Format uSD card as Internal mount for specified number of times");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test3_Int Scenario is as follows");
		System.out.println("1.Mount,Unmount uSD Card and Format uSD card as Internal mount for specified number of times");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Clearing Recent Apps
		logger.info("Clearing Recent Apps");
		logger.info("Unlocking Phone");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.Launcher"));
		TimeUnit.SECONDS.sleep(5);
		// Click Recent Apps
		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		TimeUnit.SECONDS.sleep(5);
		// click on close all
		try
		{
			logger.info("Clearing Recent Apps");
			System.out.println("Clearing Recent Apps");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Clear all\")").click();
			TimeUnit.SECONDS.sleep(5);
			TimeUnit.SECONDS.sleep(5);
			logger.info("Pass: Test0_Int Pass for clearing Recent apps ");
			System.out.println("Pass: Test0_Int Pass for clearing Recent apps ");
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Pass: No recent apps found");
			System.out.println("Pass: No recent apps found");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		try {
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test3_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
			System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
			int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
			// capture 10 pics for the selected resolution
			for(int j = 0; j < mountUnmountCycleInt; j++) 
			{ 
				try {
					((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
					// search for battery and device care element
					TimeUnit.SECONDS.sleep(5);
					logger.info("Swipe Up and Search for Storage");
					System.out.println("Swipe Up and Search for Storage");
					String text = "Storage";
					driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
					TimeUnit.SECONDS.sleep(5);
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
					TimeUnit.SECONDS.sleep(5);
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
					//Select More option
					logger.info("Click more options");
					System.out.println("Click more options");
					MobileElement moreOptions = driver.findElement(By.xpath("//*[@content-desc='More options']"));
					moreOptions.click();
					TimeUnit.SECONDS.sleep(5);
					logger.info("If format as portable option exists? call formatAsExternal()");
					System.out.println("If format as portable option exists? call formatAsExternal()");
					driver.findElement(By.xpath("//*[@text='Format as portable']")).click();
					TimeUnit.SECONDS.sleep(5);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					TimeUnit.SECONDS.sleep(3);
					logger.info("Phone current status is internal mount, performing external mount");
					System.out.println("Phone current status is internal mount, performing external mount");
					logger.info("Calling FormatAsExternal() to format as SD as external mount");
					System.out.println("Calling FormatAsExternal() to format as SD as external mount");
					FormatAsExternal();
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				}
				catch (Exception e) {
					e.printStackTrace();
					((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
					// search for battery and device care element
					TimeUnit.SECONDS.sleep(5);
					logger.info("Swipe Up and Search for Storage");
					System.out.println("Swipe Up and Search for Storage");
					String text = "Storage";
					driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
					TimeUnit.SECONDS.sleep(5);
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
					TimeUnit.SECONDS.sleep(5);
					try {
						//Select uSD Card
						logger.info("Clicking on SD card");
						System.out.println("Clicking on SD card");
						MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='android']"));
						sdcard.click();
						TimeUnit.SECONDS.sleep(5);
					}
					catch (Exception e1) {
						//Select uSD Card
						logger.info("Select uSD card");
						System.out.println("Select uSD card");
						driver.findElement(By.xpath("//*[@text='SanDisk SD card']")).click();
						TimeUnit.SECONDS.sleep(5);
					}
					TimeUnit.SECONDS.sleep(5);
					//Click on More Options
					logger.info("Select more option");
					System.out.println("select more option");
					driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
					TimeUnit.SECONDS.sleep(5);
					//Select Storage settings
					logger.info("Select storage settings option exists?call formatAsInternalFunction() ");
					System.out.println("Select storage settings option exists?call formatAsInternalFunction()");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					TimeUnit.SECONDS.sleep(3);
					logger.info("Current phone satus is External mount,performing internal mount");
					System.out.println("Current phone satus is External mount,performing internal mount");
					logger.info("Calling FormatAsInternal()");
					System.out.println("Calling FormatAsInternal()");
					FormatAsInternal();
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void FormatAsExternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.info("Launch settings application");
		System.out.println("launch settings application");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search for Storage");
		System.out.println("Swipe Up and Search for Storage");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Storage");
		System.out.println("Select Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
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
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
		TimeUnit.SECONDS.sleep(5);
		moreOptions.click();
		//Select Storage settings
		logger.info("Select Format as Portable");
		System.out.println("Select Format as Portable");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as portable\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Fomratting Phone as External mount");
		System.out.println("Fomratting Phone as External mount");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT\")").click();
		TimeUnit.SECONDS.sleep(90);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Formatting as external mount");
		System.out.println("Formatting as external mount");	
		logger.info("Formatting as external mount is successfull");
		System.out.println("Formatting as external mount is successfull");
		logger.info("Calling FormatAsInternal()");
		System.out.println("Calling FormatAsInternal()");
		FormatAsInternal();		
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

	}
	public void FormatAsInternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Formatting Phone as InternalMount
		logger.info("Formatting Phone as InternalMOunt");	
		System.out.println("Formatting Phone as InternalMOunt");
		// Launch settings app
		logger.info("Launch settings option");
		System.out.println("Launch settings option");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search for Storage");
		System.out.println("Swipe Up and Search for Storage");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Storage");
		System.out.println("Select Storage");
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
		logger.info("Clicking on more options");
		System.out.println("Clicking on more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		moreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Select Storage settings
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select storage settings");
		System.out.println("Select storage settings");
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Fomratting Phone as Internal mount");
		System.out.println("Fomratting Phone as Internal mount");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
		TimeUnit.SECONDS.sleep(90);
		try {
			logger.info("click on movecontent");
			System.out.println("click on movecontent");
			MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
			movecontent.click();
			TimeUnit.SECONDS.sleep(90);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		logger.info("click on done");
		System.out.println("click on done");
		MobileElement done =driver.findElement(By.xpath("//*[@text='Done']"));
		done.click();
		TimeUnit.SECONDS.sleep(4);
		logger.info("Pass:Format as Internal Mount completed Successfull");
		System.out.println("Pass:Format as Internal Mount completed Successfull");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(5);
		//Launch File Manager
		logger.info("Launch file manager");
		System.out.println("Launch file manager");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		////Scroll Up to find Internal Storage option
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
		TimeUnit.SECONDS.sleep(8);
		MobileElement element01 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Internal Storage\"))"));
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Click On Internal Storage");
		System.out.println("Click On Internal Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Clearing Internal Memory
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Camera folder
			logger.info("Select Camera folder");
			System.out.println("Select Camera folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Fail: Test3_Int format as internal mount");
			System.out.println("Fail: Test3_Int format as internal mount");
			logger.info("Final Message: Fail Test3_Int Fail for internal mount");
			System.out.println("Final Message: Fail Test3_Int Fail for internal mount");
			logger.info("Test: End");
			System.out.println("Test: End");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
		}
		catch (Exception e) {

			e.printStackTrace();

			logger.info("Pass: Test3_Int format as internal mount is Successfull");
			System.out.println("Pass: Test3_Int format as internal mount is Successfull");
			logger.info("Final Message: Pass Test3_Int Pass for internal mount is successfull");
			System.out.println("Final Message: Pass Test3_Int Pass for internal mount is successfull");
			logger.info("Test: End");
			System.out.println("Test: End");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
		}

	}

}