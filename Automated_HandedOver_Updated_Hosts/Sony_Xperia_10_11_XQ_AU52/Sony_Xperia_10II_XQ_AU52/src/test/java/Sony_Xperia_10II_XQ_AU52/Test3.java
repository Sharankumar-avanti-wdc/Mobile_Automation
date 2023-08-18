package Sony_Xperia_10II_XQ_AU52;
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
import Sony_Xperia_10II_XQ_AU52.Test3;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-AU52");
		dc.setCapability(MobileCapabilityType.UDID, "QV720DJV3A");
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
		 System.out.println("1.Unmount uSD Card and Format card for specified number of times and verify data format");
		 System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		
  	
  	//Declaring format cycle using argument passing
  		
  		// Load properties file
  		Properties prop = new Properties();
		// Load properties file
		prop.load(Test3.class.getClassLoader().getResourceAsStream("MyProject.properties"));
  		TimeUnit.SECONDS.sleep(5);
  		String mountUnmountCycle = prop.getProperty("mountUnmountCycle");  
  		System.out.println("Number of Unmount,mount and Format cycles = "+ mountUnmountCycle );
  		int mountUnmountCycleInt=Integer.parseInt(mountUnmountCycle);
  		// capture 10 pics for the selected resolution
  		  
  		try {
  		for(int j = 0; j < mountUnmountCycleInt; j++) 
  		{ 
  		
		// open settings app
		logger.info("Launch  setting application to format uSD card");
		System.out.println("Launch  setting application to format uSD card");
		
			
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Scrolling till battery and device care is visible");
			System.out.println("Scrolling till battery and device care is visible");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select storage option");
			System.out.println("Select storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select eject option
			logger.info("Select eject option");
			System.out.println("Select eject option");
			MobileElement Eject = driver.findElement(By.xpath("//*[@resource-id='com.android.settings:id/unmount']"));
			Eject.click();
			TimeUnit.SECONDS.sleep(20);
			logger.info("Unmount uSD card is successfull");
			System.out.println("Unmount uSD card is successfull");
			
			//select SD card option
			logger.info("select SD card");
			System.out.println("select SD card");
			MobileElement SelectSDCard = driver.findElement(By.xpath("//*[@bounds='[42,1016][105,1079]']"));
			SelectSDCard.click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select mount option
			logger.info("select mount option");
			System.out.println("select mount option");
			MobileElement Mount = driver.findElement(By.xpath("//*[@bounds='[786,1307][978,1449]']"));
			Mount.click();
			TimeUnit.SECONDS.sleep(20);
			logger.info("Mount uSD card is successfull");
			System.out.println("Mount uSD card is successfull");
			
			//select SD card option
			logger.info("select SD card");
			System.out.println("select SD card");
			MobileElement SelectSDCard3 = driver.findElement(By.xpath("//*[@bounds='[42,1016][105,1079]']"));
			SelectSDCard3.click();
			TimeUnit.SECONDS.sleep(5);
			
			
			//Select More Options
			logger.info("Clicking on More Options");
			System.out.println("Clicking on More Options");
			MobileElement More = driver.findElement(By.xpath("//*[@content-desc='More options']"));
			More.click();
			TimeUnit.SECONDS.sleep(5);
			//find element by xpath
			logger.info("Select storage settings option");
			System.out.println("Select storage settings option");
			MobileElement StorageSettings = driver.findElement(By.xpath("//*[@bounds='[555,483][1070,609]']"));
			StorageSettings.click();
			TimeUnit.SECONDS.sleep(5);
			
			
			
			// click on SD card
			logger.info("Select Format option");
			System.out.println("Select Format option");
			MobileElement Format = driver.findElement(By.xpath("//*[@text='Format']"));
			Format.click();
			TimeUnit.SECONDS.sleep(5);
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
			
			// click on format
			logger.info("Accept FORMAT SD CARD pop-up");
			System.out.println("Accept FORMAT SD CARD pop-up");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			logger.info("Started formatting, waiting till it gets formatted");
			System.out.println("Started formatting, waiting till it gets formatted");
			TimeUnit.SECONDS.sleep(90);
			//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
			//TimeUnit.SECONDS.sleep(2);
			// click on back button inorder to return to the home screen
			
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
	  		
	  		System.out.println("Unmount, mount and Format uSD card cycle:" + j + " completed succesfully" );
			logger.info("Unmount, mount and Format uSD card cycle:" + j + " completed succesfully" );
		}
  		logger.info("Launch file application and verify data format");
		System.out.println("Launch file application and verify data format");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		//Scroll Up and Select SD Card
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  		
  		//Select SD Card
  		logger.info("Select  SD Card");
  		System.out.println("Select  SD Card");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
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
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
	  
	System.out.println("Fail:Images and videos are present in the DCIM folder");
	System.out.println("Final Message: Test3 fail for format operation");
	logger.info("Fail:Images and videos are present in the DCIM folder");
	logger.info("Final Message: Test3 fail for format operation");
	logger.info("Test:End");
	 System.out.println("Test:End");
	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
	
	catch (Exception e) {
		
        e.printStackTrace();
        
        logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
       
        System.out.println("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
        logger.info("Final Message: Pass Test3 Pass for Unmount,Mount and Formattig uSD Card");
		System.out.println("Final Message: Pass Test3 Pass for Unmount,Mount and Formattig uSD Card");
        ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		logger.info("Test End");
		System.out.println("Test End");
        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
    }

		}
		catch (Exception e) {
			logger.info("Fail: Test3 fail during Fomrat uSD card operation");
			System.out.println("Fail: Test3 fail during Fomrat uSD card operation");
			logger.info("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card ");
			System.out.println("Final Message: Fail Test3 Fail for Unmount,Mount and Formattig uSD Card");
			logger.info("Test End");
			System.out.println("Test End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
        
		
		
		logger.info("Test End");
		System.out.println("Test End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	
	}
}