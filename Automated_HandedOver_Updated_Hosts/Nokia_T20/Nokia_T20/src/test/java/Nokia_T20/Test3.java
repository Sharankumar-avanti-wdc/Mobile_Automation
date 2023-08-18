package Nokia_T20;
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

import Nokia_T20.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia T20");
		dc.setCapability(MobileCapabilityType.UDID, "4000TA13971B0401803");
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
		 System.out.println("1.Unmount uSD Card and Format card for specified number of times");
		 System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		//launching home screen
		logger.info("launching home screen");
		System.out.println("launching home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
  		TimeUnit.SECONDS.sleep(5);
  	// Click Recent Apps
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		try
  		{
  			logger.info("Clearing recent apps");
  			System.out.println("Clearing recent apps");
  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			}
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("No recent apps found in background");
    		System.out.println("No recent apps found in background");
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		try {
  		//Load Properties file
  		Properties prop = new Properties();
  		prop.load(Test3.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
		System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
		int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
  		// capture 10 pics for the selected resolution
		for(int j = 0; j < mountUnmountCycleInt; j++) 
  		{ 
			logger.info("Launch  setting application to format uSD card");
			System.out.println("Launch  setting application to format uSD card");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe up and select uSD card");
			System.out.println("Swipe up and select uSD card");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//Select storage option
			logger.info("Select storage option");
			System.out.println("Select storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Select Unmount/Eject option
			logger.info("Select eject option");
			System.out.println("Select eject option");
			MobileElement Eject =	driver.findElement(By.xpath("//*[@bounds='[1060,651][1158,779]']"));
			Eject.click();
			TimeUnit.SECONDS.sleep(10);
			//Select SD card
			logger.info("Select SD card");
			System.out.println("Select SD Card");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@bounds='[140,679][234,717]']"));
			SDCard.click();
			TimeUnit.SECONDS.sleep(10);
			//Accept mount pop-up
			logger.info("Accept mount SD card  pop-up");
			System.out.println("Accept Mount SD card pop-up");
			MobileElement Mount =	driver.findElement(By.xpath("//*[@bounds='[900,999][1030,1094]']"));
			Mount.click();
			TimeUnit.SECONDS.sleep(10);
			
			//Select external storage
			logger.info("Select external storage");
			System.out.println("Select external storage");
			MobileElement ExternalStorage = driver.findElement(By.xpath("//*[@bounds='[140,679][234,717]']"));
			ExternalStorage.click();
			TimeUnit.SECONDS.sleep(5);
			
			
			//Click on More Options
			logger.info("Click more options");
			System.out.println("Click more options");
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on more options");
			moreOptions.click();
			//Select Storage setting
			logger.info("Select storage settings option");
			System.out.println("Select storage settings option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			// Select Format option
			logger.info("Select Format  option");
			System.out.println("Select format option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
			
			// Accept format uSD Card option
			logger.info("Accept format SD card option");
			System.out.println("Accept format SD card option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			logger.info("Waiting for format process completion");
			System.out.println("Waiting for format process completion");
			TimeUnit.SECONDS.sleep(90);
			logger.info("Format SD card completed succesfully");
			System.out.println("Format SD card completed succesfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );
			logger.info("Unmount, mount and Format uSD card cycle:" + j+1 + " completed succesfully" );

		}
		logger.info("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
		System.out.println("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");


		//Launch file manager application and verify data format
		//Launch File manager and verify card format status
		logger.info("Launch file manager application and verify data format");
		System.out.println("Launch file manager application and verify data format");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		
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



		try {
			//Search For Camera Folder
			//Switch grid view mode
			MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM.click();
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
		
		
		
