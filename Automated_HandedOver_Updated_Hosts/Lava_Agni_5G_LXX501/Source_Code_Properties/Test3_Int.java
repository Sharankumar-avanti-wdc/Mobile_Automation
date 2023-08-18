package Lava_Agni_5G_LXX501;

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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "LAVA  LXX501");
		dc.setCapability(MobileCapabilityType.UDID, "AG5GAO21KB000842");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
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
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		// Click Recent Apps
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
					logger.info("Swipe up and select storage option");
					System.out.println("Swipe up and select storage option");
					String text = "System";
					driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
					TimeUnit.SECONDS.sleep(5);
					logger.info("Select system");
					System.out.println("Select system");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"System\")").click();
					TimeUnit.SECONDS.sleep(4);
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
					TimeUnit.SECONDS.sleep(5);
					//Select uSD Card
					logger.info("Select uSD card");
					System.out.println("Select uSD card");
					try
					{
						// click on SD card
						logger.info("Clicking on SD card");
						System.out.println("Clicking on SD card");
						((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
						// click on Unmount and wait for 2 secs for it to get mounted
						TimeUnit.SECONDS.sleep(5);
					}
					catch (Exception e) {
						// click on SD card
						logger.info("Clicking on SD card");
						System.out.println("Clicking on SD card");
						((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
						// click on Unmount and wait for 2 secs for it to get mounted
						TimeUnit.SECONDS.sleep(5);
					}
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
					logger.info("Swipe up and select storage option");
					System.out.println("Swipe up and select storage option");
					String text = "System";
					driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
					TimeUnit.SECONDS.sleep(5);
					logger.info("Select system");
					System.out.println("Select system");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"System\")").click();
					TimeUnit.SECONDS.sleep(4);
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
					TimeUnit.SECONDS.sleep(5);
					try
					{
						// click on SD card
						logger.info("Clicking on SD card");
						System.out.println("Clicking on SD card");
						((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
						// click on Unmount and wait for 2 secs for it to get mounted
						TimeUnit.SECONDS.sleep(5);
					}
					catch (Exception e1) {
						// click on SD card
						logger.info("Clicking on SD card");
						System.out.println("Clicking on SD card");
						((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
						// click on Unmount and wait for 2 secs for it to get mounted
						TimeUnit.SECONDS.sleep(5);
					}
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
		logger.info("Launch settings application and perform external storage mount");
		System.out.println("Launch settings application and perform external storage mount");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe up and select storage option");
		System.out.println("Swipe up and select storage option");
		String text = "System";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select system");
		System.out.println("Select system");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"System\")").click();
		TimeUnit.SECONDS.sleep(4);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select exteranal storage");
		System.out.println("Select exteranal storage");
		//Select uSD Card
		try
		{
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
		}
		//Click on More Options
		logger.info("Select more options");
		System.out.println("select more options");
		driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Select Storage settings
		logger.info("Select format as Portable option");
		System.out.println("Select format as Portable option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as portable\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Format option");
		System.out.println("select format option");
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT\")").click();
		TimeUnit.SECONDS.sleep(60);
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(3);
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
		// Launch settings app
		logger.info("Launch settings option and perform Internal storage mount scenario");
		System.out.println("Launch settings option and perform Internal storage mount scenario");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search Storage option
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe up and select storage option");
		System.out.println("Swipe up and select storage option");
		String text = "System";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select system");
		System.out.println("Select system");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"System\")").click();
		TimeUnit.SECONDS.sleep(4);
		//Select storage option
		logger.info("Select Storage option");
		System.out.println("Select Storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		try
		{
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SanDisk SD card\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
			TimeUnit.SECONDS.sleep(5);
		}
		//Click on More Options
		logger.info("Click more options");
		System.out.println("Click more options");
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		moreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Select Storage settings
		logger.info("select storage settings");
		System.out.println("select storage settings");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select format as Internal option
		logger.info("Select format as Internal option");
		System.out.println("Select format as Internal options");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Accept Format SD card pop-up
		logger.info("Accept Format SD card pop-up");
		System.out.println("Accept Format SD card pop-up");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
		TimeUnit.SECONDS.sleep(60);
		//Accept Move content pop-up option
		logger.info("Accept move content  pop-up");
		System.out.println("Accept move content  pop-up");
		MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
		movecontent.click();
		TimeUnit.SECONDS.sleep(60);
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
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		TimeUnit.SECONDS.sleep(3);
		//Select SD Card
		logger.info("Click On Internal storage");
		System.out.println("Click On Internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(3);
		}

	}

}