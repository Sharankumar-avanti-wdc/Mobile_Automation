package Sony_Xperia1_II_XQAT52;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-AT52");
		dc.setCapability(MobileCapabilityType.UDID, "QV710PLJ3F");
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
		 System.out.println(" Unmount uSD Card and Format card for specified number of times");
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
  		// capture 10 pics for the selected resolution
  		  
  		 
  		for(int j = 0; j < mountUnmountCycle; j++) 
  		{ 
  		
		// open settings app
		logger.info("Launch  setting application to format uSD card");
		System.out.println("Launch  setting application to format uSD card");
		try {
			
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Scrolling till battery and device care is visible");
			System.out.println("Scrolling till battery and device care is visible");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on Storage care");
			System.out.println("Clicking on Storage care");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			MobileElement SelectSDCard = driver.findElement(By.xpath("//*[@bounds='[42,1016][105,1079]']"));
			SelectSDCard.click();
			TimeUnit.SECONDS.sleep(5);
			//Select More Options
			logger.info("Clicking on More Options");
			System.out.println("Clicking on More Options");
			MobileElement More = driver.findElement(By.xpath("//*[@content-desc='More options']"));
			More.click();
			TimeUnit.SECONDS.sleep(5);
			//find element by xpath
			logger.info("Clicking on more options");
			System.out.println("Clicking on more options");
			MobileElement StorageSettings = driver.findElement(By.xpath("//*[@text='Storage settings']"));
			StorageSettings.click();
			TimeUnit.SECONDS.sleep(5);
			
			
			
			// click on SD card
			logger.info("Clicking on SD card");
			System.out.println("Clicking on SD card");
			MobileElement Format = driver.findElement(By.xpath("//*[@text='Format']"));
			Format.click();
			TimeUnit.SECONDS.sleep(5);
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
			
			// click on format
			logger.info("Click Format");
			System.out.println("Click Format");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			logger.info("Started formatting, waiting till it gets formatted");
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
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
		Result = "Pass";
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		if (Result == "Pass")
			{
				logger.info("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
				System.out.println("Pass: Test3 Pass for MOunt,unmount and Formating the uSD Card");
				logger.info("Final Message:Pass Test3 Pass for Unmount,Mount and Formattig uSD Card ");
				System.out.println("Final Message:Pass Test3 Pass for Unmount,Mount and Formattig uSD Card");
			}
		else
		{
			logger.info("Fail: Test3 Fail for mount,unmount and Formatting uSD Card");
			System.out.println("Fail: Test3 Fail for mount,unmount and Formatting uSD Card");
		}
		
		logger.info("Test End");
		System.out.println("Test End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
	}
}
