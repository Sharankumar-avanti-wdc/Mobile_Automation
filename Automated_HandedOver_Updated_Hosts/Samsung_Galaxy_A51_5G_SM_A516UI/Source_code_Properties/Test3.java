package Samusng_Galaxy_A51_5G;
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
import Samusng_Galaxy_A51_5G.Test3;
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A51 5G");
		dc.setCapability(MobileCapabilityType.UDID, "R5CN80GP9GN");
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
		System.out.println("1.Unmount,mount, Format uSD card for specified number of times and verify data format ");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		logger.info("Launch Homescreen and clear recent apps");
		System.out.println("Launch Homescreen and clear recent apps");
		try {
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	  		TimeUnit.SECONDS.sleep(5);

			// Command to launch recent apps
			((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			TimeUnit.SECONDS.sleep(5);
			// click on close all
			try
			{
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
		  		TimeUnit.SECONDS.sleep(5);
				logger.info("Clear recent apps successfull");
				System.out.println("Clear recent apps successfull");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

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

				// open settings app
				logger.info("Launch  setting application to format uSD card");
				System.out.println("Launch  setting application to format uSD card");


				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				// search for battery and device care element
				TimeUnit.SECONDS.sleep(5);
				logger.info("Scroll up and select Battery and device care option");
				System.out.println("Scroll up and select Battery and device care option");
				String text = "Battery and device care";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Selectt battery and device care");
				System.out.println("Select battery and device care");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Battery and device care\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select storage");
				System.out.println("Select storage");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(5);
				//find element by xpath
				logger.info("Select more options");
				System.out.println("Select more options");
				MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);

				moreOptions.click();
				logger.info("Select Advanced option");
				System.out.println("Select Advanced option");
				driver.findElement(By.id("com.sec.android.app.myfiles:id/title")).click();
				TimeUnit.SECONDS.sleep(5);

				// click on SD card
				logger.info("Select SD card");
				System.out.println("Select on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
				
				//select Unmount option
				logger.info("Select Unmount option");
				System.out.println("Select Unmount option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Unmount\")").click();
				TimeUnit.SECONDS.sleep(30);
				
				//select SD card
				logger.info("Select SD card");
				System.out.println("Select on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
				
				//select Mount Pop-up
				logger.info("Select mount option");
				System.out.println("Select mount option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Mount\")").click();
				TimeUnit.SECONDS.sleep(10);
				
				//select SD card
				logger.info("Select SD card");
				System.out.println("Select on SD card");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				// click on Unmount and wait for 2 secs for it to get mounted
				TimeUnit.SECONDS.sleep(5);
				
				//Select Format Option
				logger.info("Select Format option");
				System.out.println("Select Format option");	
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Accept Format uSD Card icon");
				System.out.println("Accept Format uSD Card icon");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
				// wait for 2 mins
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");	
				TimeUnit.SECONDS.sleep(90);
				//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
				//TimeUnit.SECONDS.sleep(2);
				// click on back button inorder to return to the home screen
				System.out.println("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
				logger.info("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				Result = "Pass";
				
				logger.info("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
				System.out.println("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
			}


			
			
			//Launch file manager application and verify data format
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

			//Swipe and Select external storage
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			//Click Internal storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='SD card']"));
			SDCard.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();

			try {
				//Search For Camera Folder
				logger.info("!Check for Camera folder");
				System.out.println("!Check for camera folder");
				MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
				Camera.click();
				//	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
				//	TimeUnit.SECONDS.sleep(5);
				System.out.println("Fail: Images and videos are present in the DCIM folder. !Hence format uSD Card operation fail");
				logger.info("Fail: Images and videos are present in the DCIM folder. !Hence format uSD Card operation fail");
				logger.info("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card ");
				System.out.println("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card");
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
				logger.info("Final Message: Pass Test3 Pass for Unmount,Mount and Formattig uSD Card ");
				System.out.println("Final Message: Pass Test3 Pass for Unmount,Mount and Formattig uSD Card");
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
			logger.info("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card ");
			System.out.println("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card");
			logger.info("Test End");
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}


	}
}
