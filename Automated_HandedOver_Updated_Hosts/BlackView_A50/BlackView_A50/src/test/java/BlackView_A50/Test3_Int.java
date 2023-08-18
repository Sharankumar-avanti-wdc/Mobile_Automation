package BlackView_A50;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "A50");
		dc.setCapability(MobileCapabilityType.UDID, "A50EEA000001436");
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
		
		
		logger.info("Launch Home screen");
		System.out.println("Launch Home screen");
		((StartsActivity) driver).startActivity(new Activity("com.blackview.launcher", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		
			// Click Recent Apps
			((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			TimeUnit.SECONDS.sleep(5);

			// Clearing Phone recent apps from background
			try
			{
				logger.info("Clearing Recent Apps");
				System.out.println("Clearing Recent Apps");
				MobileElement  ClearAll =	driver.findElement(By.xpath("//*[@text='CLEAR ALL']"));
				ClearAll.click();
				TimeUnit.SECONDS.sleep(5);

				TimeUnit.SECONDS.sleep(5);
				logger.info("Pass: Test0 Pass for clearing Recent apps ");
				System.out.println("Pass: Test0 Pass for clearing Recent apps ");
			}

			catch (Exception e) {
				e.printStackTrace();
				logger.info("Pass: No recent apps found in background");
				System.out.println("Pass: No recent apps found background");

			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		
		try {
			((StartsActivity) driver).startActivity(new Activity("com.blackview.launcher", "com.android.searchlauncher.SearchLauncher"));
  		TimeUnit.SECONDS.sleep(5);
  		
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
  			MobileElement moreOptions = driver.findElement(By.xpath("//*[@bounds='[640,60][720,154]']"));
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
  	  			String text = "Storage";
  	  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
  	  			TimeUnit.SECONDS.sleep(5);
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
	 	  	logger.info("Test: End");
			System.out.println("Test: End");
	 	  	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
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
		logger.info("Select storage option");
 	  	System.out.println("Select storage option");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
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
 	  	MobileElement moreOptions = driver.findElement(By.xpath("//*[@bounds='[640,60][720,154]']"));
		moreOptions.click();
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
		
		//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
 	  	
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select storage option");
		  	System.out.println("Select storage option");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select uSD Card
			logger.info("Select external storage");
		  	System.out.println("Select external storage");
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
			//logger.info("Clicking on more options");
			//moreOptions.click();
			logger.info("Select more options");
		  	System.out.println("Select more options");
			//Click on More Options
		  	 driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
   			TimeUnit.SECONDS.sleep(5);
			//Select Storage settings
  			logger.info("Select storage settings");
  	 	  	System.out.println("Select storage settings");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage settings\")").click();
  			TimeUnit.SECONDS.sleep(5);
			
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Fomratting Phone as Internal mount");
			System.out.println("Fomratting Phone as Internal mount");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(120);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Move content\")").click();
			TimeUnit.SECONDS.sleep(60);
			logger.info("Pass:Format as Internal Mount completed Successfull");
			System.out.println("Pass:Format as Internal Mount completed Successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		((StartsActivity) driver).startActivity(new Activity("com.blackview.launcher", "com.android.searchlauncher.SearchLauncher"));
			TimeUnit.SECONDS.sleep(5);
	  	//Launch File Manager
			logger.info("Launch file manager");
			System.out.println("Launch file manager");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			TimeUnit.SECONDS.sleep(5);
			//Select Internal Storage
			
			driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
			//Search For Camera Folder
			try {
				MobileElement Internalstorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
				Internalstorage.click();
				TimeUnit.SECONDS.sleep(5);
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
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				logger.info("Fail: Test3_Int format as internal mount");
		  		System.out.println("Fail: Test3_Int format as internal mount");
				logger.info("Final Message: Fail Test3_Int Fail for internal mount");
		 	  	System.out.println("Final Message: Fail Test3_Int Fail for internal mount");
				logger.info("Test: End");
				System.out.println("Test: End");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    			TimeUnit.SECONDS.sleep(3);
  				
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				
			}

			catch (Exception e) {

				e.printStackTrace();
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    			TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				logger.info("Pass: Test3_Int format as internal mount is Successfull");
		  		System.out.println("Pass: Test3_Int format as internal mount is Successfull");
				
				
			}
	  		
	}
	
}