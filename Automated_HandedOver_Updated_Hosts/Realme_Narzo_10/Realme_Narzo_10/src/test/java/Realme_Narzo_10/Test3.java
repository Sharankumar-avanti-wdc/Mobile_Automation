package Realme_Narzo_10;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme Narzo 10");
		dc.setCapability(MobileCapabilityType.UDID, "55NR555DDYSSLZZD");
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
		logger.info("Test:Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test3 Scenario is as follows");
		logger.info("1.Unmount,mount uSD Card doesn't support and Format uSD card for specified number of times");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test3 Scenario is as follows");
		System.out.println("1.Unmount,mount uSD Card doesn't support  and Format uSD card for specified number of times");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//Declaring format cycle using argument passing
		Properties prop = new Properties();
		// Load properties file
		prop.load(Test3.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String totalPicture = prop.getProperty("mountUnmountCycle");  
		//System.out.println("mountUnmountCycle = "+ totalPicture);
		int mountUnmountCycle=Integer.parseInt(totalPicture);
		for(int j = 0; j < mountUnmountCycle; j++) 
		{ 
			//Launch settings application
			logger.info("Launch  setting application to mount,unmount and Format uSD card");
			System.out.println("Launch  setting application and mount,unmount and Format uSD card");
			try {
				// Launch settings app
				logger.info("Launch Settings application for Format uSD card with Data scenario ");
				System.out.println("Launch Settings application for Format uSD card with Data ");
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
				TimeUnit.SECONDS.sleep(4);
				logger.info("Swipe Up and Search sd card");
				System.out.println("Swipe Up and Search sd card");
				String text1 = "SD card";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				//Select uSD Card
				logger.info("Clicking on SD card");
				System.out.println("Clicking on SD card");
				MobileElement sdcard = 	driver.findElement(By.xpath("//*[@text='SD card']"));
				sdcard.click();
				TimeUnit.SECONDS.sleep(5);
				logger.info("Swipe Up and Search Format SD card");
				System.out.println("Swipe Up and Search Format SD card");
				String text2 = "Format SD card";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				//Click on More Options
				logger.info("Clicking on formatsdcard");
				System.out.println("Clicking on formatsdcard");
				MobileElement formatsdcard = 	driver.findElement(By.xpath("//*[@text='Format SD card']"));
				formatsdcard.click();
				TimeUnit.SECONDS.sleep(5);
				// Select Format option
				logger.info("Select again format");
				System.out.println("Select again format");
				MobileElement formatsdcard2 = 	driver.findElement(By.xpath("//*[@text='FORMAT']"));
				formatsdcard2.click();
				logger.info("Accept to Format uSD Card");
				System.out.println("Accept to Format uSD Card");
				logger.info("Started formatting, waiting till it gets formatted");
				System.out.println("Started formatting, waiting till it gets formatted");
				TimeUnit.SECONDS.sleep(180);
				try {
					//Click Done
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CANCEL\")").click();
					TimeUnit.SECONDS.sleep(4);
				}
				catch (Exception e) {
					e.printStackTrace();

				}
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(3);
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
				//Select DCIM Folder
				//logger.info("Select DCIM folder");
				//System.out.println("Select DCIM Folder");
				//MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
				//DCIM.click();
				try {
					//Search For Camera Folder
					MobileElement Camera =	driver.findElement(By.xpath("//*[@text='DCIM']"));
					Camera.click();
					//	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
					//	TimeUnit.SECONDS.sleep(5);
					System.out.println("Fail: Images and videos are present in the DCIM folder. Hence format uSD Card operation fail");
					logger.info("Fail: Images and videos are present in the DCIM folder. Hence format uSD Card operation fail");
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
}





