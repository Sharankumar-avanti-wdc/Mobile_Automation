package RealMeC21Y;



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

public class Test3_Int {
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C21Y");
		dc.setCapability(MobileCapabilityType.UDID, "1825264110BA062U");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
		public void start() throws 	IOException, InterruptedException  {
	
	
		
		
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test3_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
        fileHandler.setFormatter(formatter); 
        logger.info("========Test3: Unlock Phone & clear Recent apps"
        		+ "Capture Images for default resolution with save location uSD Card, verifying of captured Images present in uSD Card" + 
        		"Record Rear camera video with 2 resoltuions in uSD Card, verfiying record video file present in uSD Card" 
        		+" Format uSD Card with data and verify the format is successfull or not =========");
		logger.info("Setting up the appium desired capabilities");
		SetUp();
		String Result = "Fail";
	
		
		
			
		
		
		logger.info("Unlocking Phone");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		
  			
  		
  		
  		
  		
  		
  		
  		
  		
  	
  		// Click Recent Apps
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		
  		
  		TimeUnit.SECONDS.sleep(2);
  		// click on close all
  		try
  		{
  			
  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
  			logger.info("Clearing Recent Apps");
  			TimeUnit.SECONDS.sleep(5);
  	  		logger.info("clearing Recent apps ");
  		
  		

  		
  		}
  		
  		
  		
  		
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("No recent apps present");
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  	
  		
  
  		
  		
  		//Clearing Phone internal Memory
  		
  		
  		
  		
  	
	  		
			//Calling FormatAsInternal() before capturing images
			FormatAsExternal();
	  		
	  		
	  		
		
  	
  		
	}	
  		
  	
	//Function format as Internal
	public void FormatAsInternal() throws  IOException, InterruptedException {
	  	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		
		logger.info("Clearing Recent Apps");
		
		
		//	((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	  		//TimeUnit.SECONDS.sleep(5);
	  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward(5)"));
	  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd()"));
	  		//TimeUnit.SECONDS.sleep(5);
	  		// open the recently opened apps screen
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  		// click on close all

	  		TimeUnit.SECONDS.sleep(2);
	  		// click on close all
	  		try
	  		{
	  			
	  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
	  			logger.info("Clearing Recent Apps");
	  			TimeUnit.SECONDS.sleep(5);
	  	  		logger.info("clearing Recent apps ");
	  		
	  		

	  		
	  		}
	  		
	  		
	  		
	  		
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info(" No recent apps Found");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  			
	  		
			
			
			// Launch settings app
			logger.info("Launch Settings Application");
			
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			// search for battery and device care element
			TimeUnit.SECONDS.sleep(5);
			logger.info("Swipe Up and Search for Storage");
			String text = "Storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select Storage");
			
			//Select uSD Card
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"android\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on storage");
			
			
			//Click on More Options
			MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Clicking on more options");
			moreOptions.click();
			
			
			//Select Storage settings
			
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage Settings\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select storage settings");
			TimeUnit.SECONDS.sleep(5);
			
			
			
			
			// Select Format as Internal Option
			logger.info("Select Format option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as internal\")").click();
			// click on Unmount and wait for 2 secs for it to get mounted
			TimeUnit.SECONDS.sleep(5);
			
			// Accept format uSD Card option
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
			TimeUnit.SECONDS.sleep(90);
			
			//Select Move content Later option
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Move content later\")").click();
			TimeUnit.SECONDS.sleep(6);
		
			//Click Done
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
			TimeUnit.SECONDS.sleep(3);
			
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			
}

	
	
	
  	
  		
  
		
	
		
  		
		
		
		
		
		
		
		
	  		
		
		
		
			
		
		
  		
  		
  		
  		
  		
  		
		
	 		
		
		 	
	
	
  	public void FormatAsExternal() throws  IOException, InterruptedException  {	
  		
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		
		
  		
		
		//Clearing Recent Apps
		logger.info("Clearing Recent Apps");
		
		
	//	((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
  		//TimeUnit.SECONDS.sleep(5);
  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward(5)"));
  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd()"));
  		//TimeUnit.SECONDS.sleep(5);
  		// open the recently opened apps screen
  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		// click on close all

  		TimeUnit.SECONDS.sleep(2);
  		// click on close all
  		try
  		{
  			
  			driver.findElement(By.xpath("//*[@resource-id='com.android.launcher3:id/clear_all_button']")).click();
  			logger.info("Clearing Recent Apps");
  			TimeUnit.SECONDS.sleep(5);
  	  		logger.info("clearing Recent apps ");
  		
  		

  		
  		}
  		
  		
  		
  		
  		catch (Exception e) {
            e.printStackTrace();
            logger.info(" No recent apps Found");
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  			
  		
		
		
		// Launch settings app
		logger.info("Launch Settings Application");
		
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
		// search for battery and device care element
		TimeUnit.SECONDS.sleep(5);
		logger.info("Swipe Up and Search for Storage");
		String text = "Storage";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select Storage");
		
		//Select uSD Card
		driver.findElement(By.xpath("//*[@bounds='[144,668][379,711]']")).click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Clicking on storage");
		
		
		//Click on More Options
		MobileElement moreOptions = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Clicking on more options");
		moreOptions.click();
		
		
		//Select Format as portable
		
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format as portable\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select storage settings");
		TimeUnit.SECONDS.sleep(5);
		
		
		
		
		// Select Format option
		logger.info("Select Format option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT\")").click();
		// click on Unmount and wait for 2 secs for it to get mounted
		TimeUnit.SECONDS.sleep(5);
		
		
		TimeUnit.SECONDS.sleep(90);
		logger.info("Accept to Format uSD Card");
		logger.info("Started formatting, waiting till it gets formatted");
		
		//Click Done
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
		// wait for 2 mins
		
		logger.info("Going back to home screen");
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		
		FormatAsInternal();
		
		
		
		
		
		
		
		
		
		}
  	
  	
  	
  	
  	
  	
  	
  	}

	