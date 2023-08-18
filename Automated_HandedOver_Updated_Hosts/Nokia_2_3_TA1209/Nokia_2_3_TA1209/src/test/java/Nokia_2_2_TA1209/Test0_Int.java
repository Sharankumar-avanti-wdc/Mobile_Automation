package Nokia_2_2_TA1209;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import io.appium.java_client.android.AndroidElement;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import junit.framework.Assert;

public class Test0_Int {
	private static final String InterruptedException = null;
	// Clear Recent Apps Test Case
	AppiumDriver<MobileElement> driver;
	public LogEntries logEntries;
//	public Logger Log = Logger.getLogger(Log.class.getName());//

	
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
	@Test
		public void start() throws 	IOException, InterruptedException  {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test0_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
        fileHandler.setFormatter(formatter); 
        logger.info("Test: Start");
        System.out.println("Test: Start");
        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        logger.info(" Test0_Int Scenario is as follows ");
        logger.info("1.Unlock phone, clear recent apps, clear internal memory,format SD card as internal mount, and clear internal memory");
        logger.info("2.During SD card as internal mount host does not support format with data scenario hence skipping format with data scneario for internal mount");
		
		logger.info("Setting up the appium desired capabilities");
		System.out.println(" Test0 Scenario is as follows ");
	    System.out.println("1.Unlock phone, clear recent apps, clear internal memory,format SD card as internal mount, and clear internal memory");
		System.out.println("2.During SD card as internal mount host does not support format with data scenario hence skipping format with data scneario for internal mount");
		System.out.println("Setting up the appium desired capabilities");
		 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		
		
		
  		//Unlock phone
  			logger.info("Unlocking Phone");
  			System.out.println("Unlocking Phone");
  			((AndroidDriver) driver).unlockDevice();
  			//Launch home screen
  			logger.info("Launch home screen");
  			System.out.println("Launch home screen");
  			((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
  	  		TimeUnit.SECONDS.sleep(5);
  	  		try {
  	  	//Launch file manager application to and clear phone internal memory
  	  		logger.info("Launch file manager application and clear phone internal memory");
  			System.out.println("Launch file manager application and clear phone internal memory");
  	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  		TimeUnit.SECONDS.sleep(5);
  	  		//if launch file manager permission request pop-up exists accept permission
  	  		try
  	  		{
  	  			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
  	  			TimeUnit.SECONDS.sleep(5);
  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
  	  			TimeUnit.SECONDS.sleep(5);
  	  			
  	  		}
  	  		catch (Exception e) {
  	            e.printStackTrace();
  	           
  	        }
  	  		//select browse option
  	  		logger.info("Select browse option");
  			System.out.println("Select browse option");
  	  		driver.findElement(By.xpath("//*[@text='Browse']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		//swipe up
  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
  			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  	  		
  	  			//Select Internal Storage	
  	  		logger.info("Select internal storage");
  			System.out.println("Select internal storage");
  			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
  			TimeUnit.SECONDS.sleep(5);

  			//Select more options
  			logger.info("Select more options");
  			System.out.println("Select more options");
  			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
  			MoreOptions.click();
  			TimeUnit.SECONDS.sleep(5);
  			//Click Select All
  			logger.info("Click select all option");
  			System.out.println("Click select all option");
  	  		driver.findElement(By.xpath("//*[@text='Select all']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		TimeUnit.SECONDS.sleep(5);
	  		//Select delete option
			logger.info("Select delete option");
			System.out.println("Select delete option");
	  		driver.findElement(By.xpath("//*[@bounds='[552,63][636,147]']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		driver.findElement(By.xpath("//*[@text='Delete']")).click();
	  		TimeUnit.SECONDS.sleep(30);
	  		logger.info("Clearing phone internal memory is successfull as external mount is successfull");
			System.out.println("Clearing phone internal memory is successfull as external mount is successfull");
				//Press Back
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
	  		
				//Calling FomratAsInternal() to format the Card Internal Mount
				logger.info("Calling FormatAsInternal() to mount SD card as internal mount");
				System.out.println("Calling FormatAsInternal() to mount SD card as internal mount");
		  		FormatAsInternal();
		  		
		  		logger.info("Launch file manager application and clear phone internal memory");
	  			System.out.println("Launch file manager application and clear phone internal memory");
	  	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		//if launch file manager permission request pop-up exists accept permission
	  	  		try
	  	  		{
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/notice_ok']")).click();
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  			driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
	  	  			TimeUnit.SECONDS.sleep(5);
	  	  			
	  	  		}
	  	  		catch (Exception e) {
	  	            e.printStackTrace();
	  	           
	  	        }
	  	  		//select browse option
	  	  		logger.info("Select browse option");
	  			System.out.println("Select browse option");
	  	  		driver.findElement(By.xpath("//*[@text='Browse']")).click();
	  	  		TimeUnit.SECONDS.sleep(3);
	  	  		//swipe up
	  	  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
	  			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
	  			         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
	  	  		
	  	  			//Select Internal Storage	
	  	  		logger.info("Select internal storage");
	  			System.out.println("Select internal storage");
	  			driver.findElement(By.xpath("//*[@text='Internal storage']")).click();
	  			TimeUnit.SECONDS.sleep(5);
	  			
	  			
	  			
	  			//Select more options
	  			logger.info("Select more options");
	  			System.out.println("Select more options");
	  			MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
	  			MoreOptions1.click();
	  			TimeUnit.SECONDS.sleep(5);
	  			//Click Select All
	  			logger.info("Click select all option");
	  			System.out.println("Click select all option");
	  	  		driver.findElement(By.xpath("//*[@text='Select all']")).click();
	  	  		TimeUnit.SECONDS.sleep(3);
	  	  		TimeUnit.SECONDS.sleep(5);
		  		//Select delete option
				logger.info("Select delete option");
				System.out.println("Select delete option");
		  		driver.findElement(By.xpath("//*[@bounds='[552,63][636,147]']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		driver.findElement(By.xpath("//*[@text='Delete']")).click();
		  		TimeUnit.SECONDS.sleep(30);
		  		logger.info("Clearing phone internal memory is successfull as internal mount is successfull");
				System.out.println("Clearing phone internal memory is successfull as Internal mount is successfull");
				logger.info("Final message: Pass Test0 Pass for clear recent apps and clear internal memory scneario");
				System.out.println("Final message: Pass Test0 Pass for clear recent apps and clear internal memory scneario");
					//Press Back
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					
		  		
		  		
  	  		}
		  		catch (Exception e) {
	  	            e.printStackTrace();
	  	          logger.info("Final message: Fail Test0 Fail for clear recent apps and clear internal memory scneario");
					System.out.println("Final message: Fail Test0 Fail for clear recent apps and clear internal memory scneario");
	  	           
	  	        }
  		}	
		
	
		public void FormatAsInternal() throws  IOException, InterruptedException {
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		// Launch settings app
		logger.info("Launch settings application");
		System.out.println("Launch settings application");
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		try {
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select storage option");
			System.out.println("Select storage option");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Storage");
			//Select uSD Card
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
  			//Select Format as internal option
  			logger.info("Select Format as internal option");
  	 	  	System.out.println("Select Format as internal option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			logger.info("Accept Format SD card pop-up");
  	 	  	System.out.println("Accept Format SD card pop-up");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(120);
			
			logger.info("Pass:Format as Internal Mount completed Successfull");
			System.out.println("Pass:Format as Internal Mount completed Successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		}
		catch (Exception e) {
	            e.printStackTrace();
	          logger.info("Final message: Fail Test0 Fail for format as internal mount sceanrio");
			System.out.println("Final message: Fail Test0 Fail for format as internal mount sceanrio");
	           
	        }
			
		}
		}
  		
