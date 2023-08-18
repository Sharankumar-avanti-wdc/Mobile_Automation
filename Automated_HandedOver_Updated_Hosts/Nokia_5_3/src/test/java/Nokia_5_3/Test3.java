package Nokia_5_3;

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
import Nokia_5_3.Test3;
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
import javax.sound.midi.SysexMessage;
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 5.3");
		dc.setCapability(MobileCapabilityType.UDID, "N0AA003791K52000302");
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
		FileHandler fileHandler = new FileHandler("status_log_Test3.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test3 Scenario is as follows");
		logger.info("1.Mount,Unmount uSD Card and Format uSD card for specified number of times and verify data format");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test3 Scenario is as follows");
		System.out.println("1.Unmount uSD Card and Format card for specified number of times and verify data format");
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
		//Launch home screen
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			TimeUnit.SECONDS.sleep(6);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test3.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
			System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
			int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
			//Declaring format cycle using argument passing
			for(int j = 0; j < mountUnmountCycleInt; j++) 
			{ 
				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				// search for Storage
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
				//Click Unmount SD card option
				logger.info("Select eject option");
				System.out.println("Select eject option");
				MobileElement Unmount =	driver.findElement(By.xpath("//*[@content-desc='Eject']"));
				Unmount.click();
				TimeUnit.SECONDS.sleep(20);
				logger.info("Eject SD card is successfull");
				System.out.println("Eject SD card is successfull");
				//Select uSD Card
				logger.info("Select sd card");
				System.out.println("Select sd card");
				MobileElement ExternalStorage1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
				ExternalStorage1.click();
				TimeUnit.SECONDS.sleep(5);
				//Select mount option
				logger.info("Select mount option");
				System.out.println("Select mount option");
				MobileElement Mount =	driver.findElement(By.xpath("//*[@text='MOUNT']"));
				Mount.click();
				TimeUnit.SECONDS.sleep(20);
				logger.info("Mount SD card is successfull");
				System.out.println("Mount SD card is successfull");
				//Select uSD Card
				logger.info("Select External Storage");
				System.out.println("Select External Storage");
				MobileElement ExternalStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.ImageView"));
				ExternalStorage.click();
				TimeUnit.SECONDS.sleep(5);
				//Click on More Options
				logger.info("Clicking on more options");
				System.out.println("Clicking on more options");
				MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);
				moreOptions.click();
				//Select Storage setting
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select storage settings");
				System.out.println("Select storage settings");
				TimeUnit.SECONDS.sleep(5);
				// Select Format option
				logger.info("Select Format option");
				System.out.println("Select Format option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
				// Accept format uSD Card option
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
				TimeUnit.SECONDS.sleep(90);
				logger.info("Accept to Format uSD Card");
				System.out.println("Accept to Format uSD Card");
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");
				//Click Done
				//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
				// wait for 2 mins
				logger.info("Going back to home screen");
				System.out.println("Going back to home screen");
				System.out.println("Unmount, mount and Format uSD card cycle:" + j + " completed succesfully" );
				logger.info("Unmount, mount and Format uSD card cycle:" + j + " completed succesfully" );
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
			}
			//Launch File manager and verify card format status
			logger.info("Launch file manager application and verify data format");
			System.out.println("Launch file manager application and verify data format");
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
			//Scroll up and select uSD Card
			logger.info("swipe up and search for sd card");
			System.out.println("swipe up and search for sd card");
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Select SD Card
			logger.info("Select  SD Card");
			System.out.println("Select  SD Card");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();
			try {
				//Search For Camera Folder
				logger.info("Check for Camera folder");
				System.out.println("!Check for camera folder");
				MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
				Camera.click();
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

