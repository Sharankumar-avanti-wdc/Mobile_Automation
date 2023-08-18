package OnePlus_Nord_N10_5G;
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
import OnePlus_Nord_N10_5G.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus Nord N10 5G");
		dc.setCapability(MobileCapabilityType.UDID, "f0e384e2");
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
		 System.out.println("1.Unmount,Mount uSD Card and Format card for specified number of times");
		 System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		
		((StartsActivity) driver).startActivity(new Activity("net.oneplus.launcher", "net.oneplus.launcher.Launcher"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		// Click Recent Apps
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		
  		// click on close all
  		try
  		{
  			logger.info("Clearing Recent Apps");
  			System.out.println("Clearing Recent Apps");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Clear All\")").click();
  	  		TimeUnit.SECONDS.sleep(5);
  		
  		TimeUnit.SECONDS.sleep(5);
  		logger.info("clearing Recent apps ");
  		System.out.println("clearing Recent apps ");
  		
  		}
  		
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("No recent apps found");
            System.out.println("No recent apps found");
           
        }
  		try {
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
		logger.info("Launch  setting application");
		System.out.println("Launch  setting application");
		
			
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
  			// search for battery and device care element
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Scrolling till battery and device care is visible");
  			System.out.println("Scrolling till battery and device care is visible");
  			String text = "Storage";
  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Clicking on battery and device care");
  			System.out.println("Clicking on battery and device care");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Clicking on storage");
  			System.out.println("Clicking on storage");
  			
  			//select uSD Card
  			logger.info("Select uSD Card");
  			System.out.println("Select uSD Card");
  			driver.findElement(By.xpath("//*[@bounds='[56,1278][124,1346]']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			
  		//select more options
  			logger.info("Select more options");
  			System.out.println("Select more options");
  			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			//Select Storage settings
  			logger.info("Select Storage settings");
  			System.out.println("Select Storage settings");
  			driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			//Click Eject Button to Unmount uSD card
  			logger.info("Click Eject Button to Unmount uSD card");
  			System.out.println("Click Eject Button to Unmount uSD card");
  			driver.findElement(By.xpath("//*[@text='Eject']")).click();
  			TimeUnit.SECONDS.sleep(30);
  			//Select uSD card
  			logger.info("Select uSD Card");
  			System.out.println("Select uSD Card");
  			driver.findElement(By.xpath("//*[@bounds='[56,1278][124,1346]']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			//Select Mount pop-up
  			logger.info("Select Mount pop-up");
  			System.out.println("Select Mount pop-up");
  			driver.findElement(By.xpath("//*[@text='Mount']")).click();
  			TimeUnit.SECONDS.sleep(30);
  			

  			//select uSD Card
  			logger.info("Select uSD Card");
  			System.out.println("Select uSD Card");
  			driver.findElement(By.xpath("//*[@bounds='[56,1278][124,1346]']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			
  		//select more options
  			logger.info("Select more options");
  			System.out.println("Select more options");
  			driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			//Select Storage settings
  			logger.info("Select Storage settings");
  			System.out.println("Select Storage settings");
  			driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			
  		// click on format
  			logger.info("Click Format");
  			System.out.println("Click Format");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
  			// wait for 2 mins
  			logger.info("Started formatting, waiting till it gets formatted");
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
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		
		}
		//Launch File Manager
	  		logger.info("Launch File Manager Application and verify data format");
	  		System.out.println("Launch File Manager Application and verify data format");
	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  //Scroll up and select uSD Card
	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
	  		//Select SD Card
	  		logger.info("Select  SD Card");
	  		System.out.println("Select  SD Card");
	  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
	  		TimeUnit.SECONDS.sleep(5);
	  		//Switch to grid view
	  		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(5);
	  		//Search For DCIM Folder 
	  		logger.info("Select DCIM Folder");
	  		System.out.println("Select DCIM Folder");
	  		driver.findElement(By.xpath("//*[@text='DCIM']")).click();
			TimeUnit.SECONDS.sleep(5);
	  		
			//Search For Camera Folder
		
		try {
			//Search For Camera Folder
				logger.info("Select Camera Folder");
				System.out.println("Select Camera Folder");
				driver.findElement(By.xpath("//*[@text='Camera']")).click();
				TimeUnit.SECONDS.sleep(5);
			  
			System.out.println("Fail: Images and videos are present in the DCIM folder");
			System.out.println("Final Message: Test3 fail for Unmount,Mount and format operation");
			logger.info("Fail: Images and videos are present in the DCIM folder");
			logger.info("Final Message: Test3 fail for Unmount,Mount and ");
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