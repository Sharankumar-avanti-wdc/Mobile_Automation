package Infinix_Hot11_X662;

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

public class Test3_Int {
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Infinix HOT 11");
		dc.setCapability(MobileCapabilityType.UDID, "07445311AP145805");
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
		try {
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test3_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
			System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
			int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
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
					//Select uSD Card
					logger.info("Select uSD card");
					System.out.println("Select uSD card");
					MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[1]"));
					ExternalStorage.click();
					TimeUnit.SECONDS.sleep(5);
					//Select More option
					logger.info("Click more options");
					System.out.println("Click more options");
					//MobileElement moreOptions = driver.findElement(By.xpath("//*[@content-desc='More options']"));
					TimeUnit.SECONDS.sleep(5);
					logger.info("If format as portable option exists? call formatAsExternal()");
					System.out.println("If format as portable option exists? call formatAsExternal()");
					//	driver.findElement(By.xpath("//*[@text='Format as portable']")).click();
					TimeUnit.SECONDS.sleep(5);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
					//Select uSD Card
					logger.info("Select uSD card");
					System.out.println("Select uSD card");
					MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
					ExternalStorage.click();
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
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
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
			logger.info("Final Message: Pass Test3_Int Pass for internal mount is successfull");
			System.out.println("Final Message: Pass Test3_Int Pass for internal mount is successfull\"");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void FormatAsExternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.info("Formatting Phone as External MOunt");
		System.out.println("Formatting Phone as External MOunt");
		try {
			// Launch settings app
			logger.info("Launch Settings Application");
			System.out.println("Launch Settings Application");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe Up and Search for Storage");
			System.out.println("Swipe Up and Search for Storage");
			////Scroll Up to find external Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Select Storage");
			logger.info("Select Storage");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select uSD Card
			logger.info("Clicking on sdcard");
			System.out.println("Clicking on sdcard");
			MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='SanDisk SD card']"));
			sdcard.click();
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
			logger.info("Select Format ");
			System.out.println("Select Format");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT\")").click();
			TimeUnit.SECONDS.sleep(90);
			logger.info("done");
			System.out.println("done");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Fomrat as External Mount is successfull");
			System.out.println("Pass: Fomrat as External Mount is successfull");
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
		catch (Exception exp)
		{
			logger.info("Fail: Test0_Int Fail during Format as external(Format as Portable)scenario");
			System.out.println("Fail: Test0_Int Fail during Format as external(Format as Portable)scenario");
			logger.info("Final Message: Fail Test0_Int Fail during Format as external(Format as Portable)scenario");
			System.out.println("Final Message: Fail Test0_Int Fail during Format as external(Format as Portable)scenario");
			logger.info("Test End"); 
			System.out.println("Test End");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
		}
	}
	public void FormatAsInternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.info("Formatting uSD card as internal mount");
		System.out.println("Formatting uSD card as internal mount");	
		// Launch settings app
		logger.info("Launch Settings Application");
		System.out.println("Launch Settings Application");
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
		TimeUnit.SECONDS.sleep(8);
		logger.info("Select sdcard");
		System.out.println("Select sdcard");
		//Select uSD Card
		MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='SanDisk SD card']"));
		sdcard.click();
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Clicking on more");
		logger.info("Clicking on more");
		//Click on More Options
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		moreOptions.click();
		TimeUnit.SECONDS.sleep(5);
		//Select Storage settings
		logger.info("Select storage settings");
		System.out.println("Select storage settings");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Fomrat Phone as Internal mount");
		System.out.println("Fomrat Phone as Internal mount");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
		TimeUnit.SECONDS.sleep(5);
		MobileElement Continue =driver.findElement(By.xpath("//*[@text='CONTINUE']"));
		Continue.click();
		logger.info("erase and format");
		System.out.println("erase and format");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Erase & format\")").click();
		TimeUnit.SECONDS.sleep(60);
		try {
			logger.info("click on movecontent");
			System.out.println("click on movecontent");
			MobileElement movecontent =	driver.findElement(By.xpath("//*[@text='Move content']"));
			movecontent.click();
			TimeUnit.SECONDS.sleep(90);
			}
			catch (Exception e) {
				
			}
			TimeUnit.SECONDS.sleep(5);
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
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//Launch File Manager
		logger.info("Launch File Manager Application");
		System.out.println("Launch File Manager Application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Select Internal Storage
		logger.info("select browse option");
		System.out.println("select browse option");
		driver.findElement(By.xpath("//*[@text='Browse']")).click();
		TimeUnit.SECONDS.sleep(3);
		////Scroll Up to find Internal Storage option
		logger.info("swipe and search for internal storage");
		System.out.println("swipe and search for internal storage");
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		TimeUnit.SECONDS.sleep(5);
		//Select SD Card
		logger.info("Click On internal storage");
		System.out.println("Click On internal storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		//search for test1 folder
		String text2 = "DCIM";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		//Clearing Internal Memory
		//logger.info("Click on DCIM Folder");
		//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		//TimeUnit.SECONDS.sleep(5);
		//Search For Camera Folder
		try {
			//Search For Camera Folder
			//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			//TimeUnit.SECONDS.sleep(5);
			logger.info("Click on DCIM Folder");
			System.out.println("Click on DCIM Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Fail:Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Test0_Int fail for format operation");
			logger.info("Fail:Images and videos are present in the DCIM folder");
			logger.info("Final Message: Test0_Int fail for format operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		catch (Exception e) {
			e.printStackTrace();

			logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			logger.info("Final Message: Pass Test0_Int pass for format Operation");
			System.out.println("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
			System.out.println("Final Message: Pass Test0_Int pass for format Operation");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
	}
}

