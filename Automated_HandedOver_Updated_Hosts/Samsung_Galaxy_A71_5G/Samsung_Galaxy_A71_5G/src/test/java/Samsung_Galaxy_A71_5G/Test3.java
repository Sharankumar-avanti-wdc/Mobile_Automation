package Samsung_Galaxy_A71_5G;

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

import Samsung_Galaxy_A71_5G.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A71 5G");
		dc.setCapability(MobileCapabilityType.UDID, "R5CN80J025V");
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
		logger.info("1.Mount,Unmount uSD Card and Format uSD card for specified number of times");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test3 Scenario is as follows");
		System.out.println(" 1.Unmount uSD Card and Format card for specified number of times");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";

		try {
			logger.info("Launch Homescreen and clear recent apps");
			System.out.println("Launch Homescreen and clear recent apps");
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
					System.out.println("Select storag");
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
					//Select uSD Card
					logger.info("Select uSD Card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
					TimeUnit.SECONDS.sleep(2);
					//Select UnMount 
					logger.info("Unmount uSD card");
					System.out.println("Unmount uSD card");
					driver.findElement(By.xpath("//*[@text='Unmount']")).click();
					TimeUnit.SECONDS.sleep(30);

					//Select uSD Card
					logger.info("Select uSD Card");
					System.out.println("Select uSD Card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
					TimeUnit.SECONDS.sleep(2);
					//Select Mount uSD Card
					logger.info("Select Mount uSD Card");
					System.out.println("Select Mount uSD Card");
					driver.findElement(By.xpath("//*[@text='Mount']")).click();
					TimeUnit.SECONDS.sleep(30);

					//Select uSD Card
					logger.info("Select uSD Card");
					System.out.println("Select on SD card");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
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
					System.out.println("Unmount, mount and Format uSD card cycle:" + j + " completed succesfully" );
					logger.info("Unmount, mount and Format uSD card cycle:" + j + " completed succesfully" );
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(5);
				}
				//Launch File Manager application to verify  Image capture
				logger.info("Launch File Manager application to verify  Card is fully Formated or not");
				System.out.println("Launch File Manager application to verify  Card is fully Formated or not");
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);

				//Select SD Card
				logger.info("Select  SD Card");
				System.out.println("Select  SD Card");
				MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
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
				logger.info("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card ");
				System.out.println("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card");
				logger.info("Test End");
				System.out.println("Test End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}


		}
	}


