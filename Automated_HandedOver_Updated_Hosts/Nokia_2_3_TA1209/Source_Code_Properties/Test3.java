package Nokia_2_2_TA1209;
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
import Nokia_2_2_TA1209.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 2.3");
		dc.setCapability(MobileCapabilityType.UDID, "RT99621CA19C3109821");
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
		 System.out.println("1.Unmount,Mount uSD Card and Format card for specified number of times");
		 System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		
		
		
		
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		try {
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
  		TimeUnit.SECONDS.sleep(5);
		//launch settings application
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
  		TimeUnit.SECONDS.sleep(5);
  		
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
  			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
  			// search for battery and device care element
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Swipe Up and Search for Storage");
  			String text = "Storage";
  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
  			TimeUnit.SECONDS.sleep(5);
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			//Select uSD Card
  			logger.info("Select uSD card");
  	 	  	System.out.println("Select uSD card");
  	 	  	driver.findElement(By.xpath("//*[@bounds='[126,679][330,717]']")).click();
  				TimeUnit.SECONDS.sleep(5);
  			TimeUnit.SECONDS.sleep(5);
  			
  			//Click on More Options
  			logger.info("Select more option");
  	 	  	System.out.println("select more option");
  			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Clicking on more options");
  			moreOptions.click();
  			
  			
  			//Select Storage settings
  			logger.info("Select storage settings");
  	 	  	System.out.println("Select storage settings");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			// Select Format option
  			logger.info("Select Format option");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format\")").click();
  			// click on Unmount and wait for 2 secs for it to get mounted
  			TimeUnit.SECONDS.sleep(5);
  			
  			// Accept format uSD Card option
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
  			TimeUnit.SECONDS.sleep(90);
  			logger.info("Accept to Format uSD Card");
  			logger.info("Started formatting, waiting till it gets formatted");
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
