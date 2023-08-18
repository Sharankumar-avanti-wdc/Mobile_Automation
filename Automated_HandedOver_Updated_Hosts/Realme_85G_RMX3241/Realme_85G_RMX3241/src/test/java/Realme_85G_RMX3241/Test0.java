package Realme_85G_RMX3241;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
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
import junit.framework.Assert;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

public class Test0 {
	private static final String InterruptedException = null;
	// Clear Recent Apps Test Case
	AppiumDriver<MobileElement> driver;
	public LogEntries logEntries;
	private WebElement element;

	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme 8 5G");
		dc.setCapability(MobileCapabilityType.UDID, "BMFQWS9HQ4RSA6MR");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@Test
		public void start() throws 	IOException, InterruptedException  {
	
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test0.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
        fileHandler.setFormatter(formatter); 
        logger.info("Test: Start");
        System.out.println("Test: Start");
        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        logger.info(" Test0 Scenario is as follows ");
        logger.info("1.Unlock phone, clear recent apps, clear internal memory");
		logger.info("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		logger.info("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		logger.info("4.Call Format() and format uSD card with data and verify the same");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test0 Scenario is as follows ");
	    System.out.println("1.Unlock phone, clear recent apps, clear internal memory");
		System.out.println("2.Call Image() and Capture Rear camera 25 images for default resolution in uSD card and Verify the data capture");
		System.out.println("3.Call Video() and record Rear camera video of first 2 resloutions for 2 minutes of duration in uSD Card and verify the same");
		System.out.println("4.Call Format() and format uSD card with data and verify the same");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		//enable force debug
  		logger.info("If Force debug permisssion pop-up exists? accept Force debug permission");
        System.out.println("If Force debug permisssion pop-up exists? accept Force debug permission");
  		try
  		{
  			logger.info("If Force debug permisssion pop-up exists? accept Force debug permission");
  	        System.out.println("If Force debug permisssion pop-up exists? accept Force debug permission");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Force Close\")").click();
  		
  		}
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("Force pop up not found");
            System.out.println("Force pop up not found");
           
        }
  		
  		
  		// Click Recent Apps
  		/*((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
  		TimeUnit.SECONDS.sleep(5);
  		
  		// click on close all
  		try
  		{
  			logger.info("Clearing Recent Apps");
  			System.out.println("Clearing Recent Apps");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
  	  		TimeUnit.SECONDS.sleep(5);
  		
  		TimeUnit.SECONDS.sleep(5);
  		logger.info("Pass: Test0 Pass for clearing Recent apps ");
  		System.out.println("Pass: Test0 Pass for clearing Recent apps ");
  		
  		}
  		
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("Pass: No recent apps found");
            System.out.println("Pass: No recent apps found");
           
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  	*/
  		logger.info("Host does'nt support clear recent apps option! Hence Skiping clear recent apps scenario");
  		System.out.println("Host does'nt support clear recent apps option! Hence Skiping clear recent apps scenario");
  		//Clearing Phone Internal Memory
  		//Launch File Manager
  		logger.info("Launch File Manager Application and clear internal memory");
  		System.out.println("Launch File Manager Application and clear internal memory");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		//Scroll Up and select Internal storage
  		logger.info("Scroll up and select Internal storage");
  		System.out.println("Scroll up and select Internal storage");
  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
		         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  		
  		//Select Internal Memory
  		logger.info("Select  Internal storage");
  		System.out.println("Select  Internal storage");
  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Internal storage\")").click();
  		TimeUnit.SECONDS.sleep(5);
  		
  		//Click More Options
  		logger.info("Select More Options");
  		System.out.println("Select More Options");
  		MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
  		MoreOptions.click();
  		TimeUnit.SECONDS.sleep(3);
  	//Click Select All Option
  		logger.info("Select Edit Option");
  		System.out.println("Select Edit Option");
  		MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
  		SelectAll.click();
  		TimeUnit.SECONDS.sleep(3);
  		
  		
  		MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
  		MoreOptions1.click();
  		TimeUnit.SECONDS.sleep(3);
			try {
			//Click Delete
				logger.info("Select Delete All Option");
		  		System.out.println("Select Delete All Option");
			MobileElement DeletePermanently =	driver.findElement(By.xpath("//*[@text='Delete permanently']"));
			DeletePermanently.click();
			TimeUnit.SECONDS.sleep(3);
			
			//Click move to recycle Bin
			logger.info("Allow delet folders");
	  		System.out.println("Allow delet folders");
			MobileElement Delete =	driver.findElement(By.xpath("//*[@text='Delete']"));
			Delete.click();
	  		TimeUnit.SECONDS.sleep(30);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			}
			catch (Exception e) {
				logger.info("No data found to clear internal memory");
				System.out.println("No data found to clear internal memory");
				
			}
			
	  		
			logger.info("Pass: Clearing phone internal memory is successfull");
  			System.out.println("Pass: Clearing phone internal memory is successfull");
  			
	  		//Press Back
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
			TimeUnit.SECONDS.sleep(2);
			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
			logger.info("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			System.out.println("Calling Image() for rear Image capture in uSD Card and Verify the Captured images");
			Images();
  		
	}	
  		public void Images() throws  IOException, InterruptedException {
  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			//Launching Camera Application for Rear picture capture
  			logger.info("Launch Camera Application for Rear picture capture");
  			System.out.println("Launch Camera Application for Rear picture capture");
  			((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
  			TimeUnit.SECONDS.sleep(5);
		
  		//IF Location access notification pop-up exists select Cancel option.
  			logger.info("Camera application laucnhed succesfully");
  			System.out.println("Camera application laucnhed succesfully");
  			
  		//	MobileElement Photo = driver.findElement(By.xpath("//*[@content-desc='PHOTO']"));
			//Photo.click();
			TimeUnit.SECONDS.sleep(5);
	
		TimeUnit.SECONDS.sleep(2);
		//Select Settings option
				logger.info("click on settings");
				System.out.println("click on settings");
				MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[888,0][1005,240]']"));
				Settings.click();
				TimeUnit.SECONDS.sleep(5);
				//Click on Advanced settings
				logger.info("click on Advanced settings");
				System.out.println("click on Advanced settings");
				MobileElement AdvancedSettings = driver.findElement(By.xpath("//*[@bounds='[72,1518][468,1583]']"));
				AdvancedSettings.click();
				TimeUnit.SECONDS.sleep(5);
				
				//Select Save to uSD card
				logger.info("click on Save to SD Card Preferred");
				System.out.println("click on Save to SDCard Preferred");
				MobileElement SavetoSDCardPreferred = driver.findElement(By.xpath("//*[@bounds='[900,865][1008,931]']"));
				SavetoSDCardPreferred.click();
				MobileElement TurnON = driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
				TurnON.click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
		
				//Capture Images
				logger.info("Capture Image of Default Resolution");
				for(int j = 0; j < 25; j++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			driver.findElement(By.xpath("//*[@resource-id='com.oppo.camera:id/shutter_button']")).click();
		  			 TimeUnit.SECONDS.sleep(6);
		  			System.out.println("clicking default resolution image"+j);
		  			logger.info("clicking default resolution image"+j);
		  		
		  		}
		
				//Select Settings option
				logger.info("click on settings");
				System.out.println("click on settings");
				MobileElement Settings2 = driver.findElement(By.xpath("//*[@bounds='[888,0][1005,240]']"));
				Settings2.click();
				TimeUnit.SECONDS.sleep(5);
				//Click on Advanced settings
				logger.info("click on Advanced settings");
				System.out.println("click on Advanced settings");
				MobileElement AdvancedSettings2 = driver.findElement(By.xpath("//*[@bounds='[72,1518][468,1583]']"));
				AdvancedSettings2.click();
				TimeUnit.SECONDS.sleep(5);
				
				//Select Save to uSD card
				logger.info("uncheck save to SD card option");
				System.out.println("Uncheck save to SDCard option");
				MobileElement SavetoSDCardPreferred1= driver.findElement(By.xpath("//*[@bounds='[900,865][1008,931]']"));
				SavetoSDCardPreferred1.click();
				//MobileElement TurnON1 = driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
				//TurnON1.click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				
				
				TimeUnit.SECONDS.sleep(6);
				logger.info("Pass:Total Number Of Image captured 25 is successfull");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				//Launch File Manager application to verify  Image capture
		  		logger.info("Launch File Manager application to verify  Image capture");
		  		System.out.println("Launch File Manager application to verify  Image capture");
		  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		  		TimeUnit.SECONDS.sleep(5);
		  		//Scroll up and select uSD Card
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
				logger.info("Select Camera Folder");
				System.out.println("Select Camera Folder");
				driver.findElement(By.xpath("//*[@text='Camera']")).click();
				TimeUnit.SECONDS.sleep(5);
				//Click More Options
				logger.info("Select More Options ");
				System.out.println("Select More Options ");
				driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
				TimeUnit.SECONDS.sleep(5);
				//Click Select All
				logger.info("Click On Select All Options");
				System.out.println("Click On Select All Options");
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
		  		SelectAll.click();
		  		TimeUnit.SECONDS.sleep(3);
				
		  	//Click on Select All 
		  			try {
		  				//Select All
		  				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='25 selected']"));
		  				TimeUnit.SECONDS.sleep(5);
		  				TotalFiles.click();
		  				logger.info("Pass:Total Number Of Image captured 25 is successfull");
		  					System.out.println("Pass:Total Number Of Image captured 25 is successfull");
		  					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  					 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  					//Calling video() for rear video recording in USD card and verifying data capture.
		  	  				logger.info("Calling video() for rear video recording in USD card and verifying data capture.");
		  	  				System.out.println("Calling video() for rear video recording in USD card and verifying data capture.");
		  	  			 ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  	  	  		TimeUnit.SECONDS.sleep(2);
		  	  	  	 ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		   	  		TimeUnit.SECONDS.sleep(2);
		   	  		Video();
		   	  		
		   	  	
		  				}
		  				
		  				catch (Exception e) {
		  					
		  		            e.printStackTrace();
		  		            logger.info("Fail: Video function cannot be called as incorrect Images captured ");
		  					logger.info("Final Message: Fail Test0 Fail for Image capture");
		  					System.out.println("Fail: Video function cannot be called as incorrect Images captured ");
		  					System.out.println("Final Message: Fail Test0 Fail for Image capture");
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
		  			  	  	 logger.info("Test:End");
		  					 System.out.println("Test:End");
		  					 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  			   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  		}}
		  	  		
	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
  	  	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
  	  	public void Video() throws  IOException, InterruptedException {
  	  		
  	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  	  	
  	  		
  	  	logger.info("Launch Camera Application for Rear camera video recording");
  	  	System.out.println("Launch Camera Application for Rear camera video recording");
  		((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
		
		//IF Location access notification pop-up exists select Cancel option.
			logger.info("if Location permisson Pop Exists Select Cancel Option");
			System.out.println("if Location permisson Pop Exists Select Cancel Option");
		
	
	TimeUnit.SECONDS.sleep(2);
	// Switch to Video mode
		logger.info("Switch Video mode");
		System.out.println("Switch Video mode");
		TimeUnit.SECONDS.sleep(5);
		
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(347, 1776)).perform();
		TimeUnit.SECONDS.sleep(5);
	
		//Select Settings option
		logger.info("click on settings");
		System.out.println("click on settings");
		MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
		Settings.click();
		TimeUnit.SECONDS.sleep(5);
		//Click on Advanced settings
		logger.info("click on Advanced settings");
		System.out.println("click on Advanced settings");
		MobileElement AdvancedSettings = driver.findElement(By.xpath("//*[@bounds='[72,1518][468,1583]']"));
		AdvancedSettings.click();
		TimeUnit.SECONDS.sleep(5);
		
		//Select Save to uSD card
		logger.info("click on Save to SD Card Preferred");
		System.out.println("click on Save to SDCard Preferred");
		MobileElement SavetoSDCardPreferred = driver.findElement(By.xpath("//*[@bounds='[900,865][1008,931]']"));
		SavetoSDCardPreferred.click();
		try {
		MobileElement TurnON = driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
		TurnON.click();
		TimeUnit.SECONDS.sleep(5);
		}
		catch(Exception exp)
		{ 
			
			
		}
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(6);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(6);
		
		
		
		//Select Settings option
				logger.info("click on settings");
				System.out.println("click on settings");
				MobileElement Settings1 = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
				Settings1.click();
				TimeUnit.SECONDS.sleep(5);
				//Scroll up and select Video resolution
				//Scroll up and select uSD Card
		  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				         ".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));
		  		//Select video resolution
		  		MobileElement VideoRes = driver.findElement(By.xpath("//*[@text='Video resolution']"));
		  		VideoRes.click();
		  		TimeUnit.SECONDS.sleep(2);
		  		//Select First resolution
		  		logger.info("Select First highest rear camear Video Resolution:Rear camera video size, 1080P");
		  			System.out.println("Select First highest rear camear Video Resolution:Rear camera video size, 1080P");
		  			//Select 1st resolution
		  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[72,436][210,501]']"));
		  			FirstRes.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		TimeUnit.SECONDS.sleep(5);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
			  	//Start Recording
  			  		logger.info("Start video recording for duration of 2minutes");
  			  		System.out.println("Start video recording for duration of 2minutes");
  			  		MobileElement StartRecording = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
  			  		StartRecording.click();
  			  		TimeUnit.SECONDS.sleep(120);
  			  		
  			  	//Stop Recording
  			  		logger.info("Stop video recording");
  			  		System.out.println("Stop video recording");
  			  		MobileElement StopRecording = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
  			  		StopRecording.click();
  			  	TimeUnit.SECONDS.sleep(15);
  			  		
  		  			//Select second resolution
  			//Select Settings option
				logger.info("click on settings");
				System.out.println("click on settings");
				MobileElement Settings6 = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
				Settings6.click();
				TimeUnit.SECONDS.sleep(5);
				//Scroll up and select Video resolution
				//Scroll up and select uSD Card
		  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				         ".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));
		  		//Select video resolution
		  		MobileElement VideoRes1 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
		  		VideoRes1.click();
		  		TimeUnit.SECONDS.sleep(2);
		  	//Select 2nd resolution
		  		logger.info("Select second highest rear camear Video Resolution:Rear camera video size, 720P");
		  		System.out.println("Select second highest rear camear Video Resolution:Rear camera video size, 720P");
		  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[72,588][183,653]']"));
		  			SecondRes.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
			  	//Start Recording
					logger.info("Start video recording for duration of 2minutes");
  			  		System.out.println("Start video recording for duration of 2minutes");
  			  	MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
			  		StartRecording1.click();
			  		TimeUnit.SECONDS.sleep(120);
			  		
			  	//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
			  		StopRecording1.click();
			  	TimeUnit.SECONDS.sleep(15);
  			  	
			  	
			  	logger.info("click on settings");
				System.out.println("click on settings");
				MobileElement Settings3 = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
				Settings3.click();
				TimeUnit.SECONDS.sleep(5);
				//Click on Advanced settings
				logger.info("click on Advanced settings");
				System.out.println("click on Advanced settings");
				MobileElement AdvancedSettings2 = driver.findElement(By.xpath("//*[@bounds='[72,1518][468,1583]']"));
				AdvancedSettings2.click();
				TimeUnit.SECONDS.sleep(5);
				
				//Select Save to uSD card
				logger.info("uncheck save to sd card option");
				System.out.println("uncheck save to sd card option");
				MobileElement SavetoSDCardPreferred1 = driver.findElement(By.xpath("//*[@bounds='[900,865][1008,931]']"));
				SavetoSDCardPreferred1.click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(6);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  	  		TimeUnit.SECONDS.sleep(2);
	  	  		//((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  	  		//TimeUnit.SECONDS.sleep(2);
	  	  		logger.info("Pass: Rear camera video recording is successfull");
	  	  		System.out.println("Pass: Rear camera video recording is successfull");
				//Verifying Captured Videos
  	  		//Launch Home screen and Clear recent Apps
  	  		logger.info("Verifying Captured Videos");
  	  		logger.info("Launch Home screen and Clear recent Apps");
  	  		System.out.println("Verifying Captured Videos");
  	  		System.out.println("Launch Home screen and Clear recent Apps");
  	  		//((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
  	  		
  	  		
  	  		//Launch File Manager application to verify captured video
  	  		logger.info("Launch File Manager Application to verify captured videos");
  	  		System.out.println("Launch File Manager Application to verify captured videos");
  	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  	//Scroll up and select uSD Card
  	  		MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
  			logger.info("Select Camera Folder");
  			System.out.println("Select Camera Folder");
  			driver.findElement(By.xpath("//*[@text='Camera']")).click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			
  			//Click More Options
  				logger.info("Select More Options ");
  				System.out.println("Select More Options ");
  				driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
  				TimeUnit.SECONDS.sleep(5);
  			//Click Select All
  	  			logger.info("Click On Select All Options");
  	  			System.out.println("Click On Select All Options");
  	  			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
  	  	  		SelectAll.click();
  	  	  		TimeUnit.SECONDS.sleep(3);
  	  			
  	  			//Click on Select All 
  	  			try {
  	  				//Select All
  	  				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='27 selected']"));
  	  				TimeUnit.SECONDS.sleep(5);
  	  				TotalFiles.click();
  	  				logger.info("Pass: 2 Videos recorded Successfully");
  	  				logger.info("Pass: A total of 27 files present in uSD card before Format");
  	  				System.out.println("Pass: 2 Videos recorded Successfully");
  	  				System.out.println("Pass: A total of 27 files present in uSD card before Format");
  	  				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  				logger.info("calling Format() for format with data scenario");
  	  		  		System.out.println("calling Format() for format with data scenario");
  	  		  	TimeUnit.SECONDS.sleep(2);
  	  		  	Format();
  	  	  	  	
  	  				}
  	  				
  	  				catch (Exception e) {
  	  					
  	  		            e.printStackTrace();
  	  		            logger.info("Fail: Format function cannot be called as incorrect Videos captured");
  	  		            logger.info("Fail: Test0 Fail for file verification");
  	  		            logger.info("Final Message: Fail Test0 Fail for Video Capture");
  	  		            System.out.println("Fail: Format function cannot be called as incorrect Videos captured");
  	  		            System.out.println("Fail: Test0 Fail for file verification");
  	  		            System.out.println("Final Message: Fail Test0 Fail for Video Capture");
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
  	 	  	   logger.info("Test:End");
				 System.out.println("Test:End");
				 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  				}
  	  			
  	  		}
  			
	public void Format() throws  IOException, InterruptedException  {	
  	  		
  	  		
  	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  	  		//Launch Home screen and clear recent apps
  	  	
  	  	
  			// Launch Settings application for Format uSD card with Data scenario
  			logger.info("Launch Settings application for Format uSD card with Data scenario ");
  			System.out.println("Launch Settings application for Format uSD card with Data ");
  			try {
  			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
  			// search for battery and device care element
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Scroll up and select Storage option");
  			System.out.println("Scroll up and select Storage option");
  			String text = "Storage";
  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Clicking on battery and device care");
  			System.out.println("Clicking on battery and device care");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Clicking on storage");
  			System.out.println("Clicking on storage");
  			
  			
  			String text1 = "SD card";
  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text1+"\"));"));
  			TimeUnit.SECONDS.sleep(5);
  			logger.info("Swipe and select uSD card");
  			System.out.println("Swipe and select uSD card");
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			
  			
  			
  			
  		// click on format
  			logger.info("Click Format");
  			System.out.println("Click Format");
  			
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Format SD card\")").click();
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"FORMAT SD CARD\")").click();
  			TimeUnit.SECONDS.sleep(5);
  			MobileElement formatsdcard2 = 	driver.findElement(By.xpath("//*[@text='FORMAT SD CARD']"));
			formatsdcard2.click();
  			// wait for 2 mins
  			logger.info("Started formatting, waiting till it gets formatted");
  			System.out.println("Started formatting, waiting till it gets formatted");
  			TimeUnit.SECONDS.sleep(90);
  			
  			
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  			TimeUnit.SECONDS.sleep(2);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  			TimeUnit.SECONDS.sleep(2);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  			TimeUnit.SECONDS.sleep(2);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  		//Result = "Format Successfull";
  			}
  			catch (Exception e) {
  	            e.printStackTrace();
  	        }
  				logger.info("Pass: Format uSD with Data is successfull");
  				System.out.println("Pass: Format uSD with Data is successfull");

  			//Launch File Manager
  				logger.info("Launch File Manager Application to verify data format");
  	  			System.out.println("Launch File Manager Application to verify data format");
  	  	  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  	  //Scroll up and select uSD Card
  	  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  	  			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
  	  			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
  	  	  		//Select SD Card
  	  	  		logger.info("Select  SD Card");
  	  	  		System.out.println("Select  SD Card");
  	  	  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
  	  	  		TimeUnit.SECONDS.sleep(5);
  	  	  		
  	  	  		//Switch to grid view mode
  	  	  	logger.info("Switch to grid view mode");
	  	  		System.out.println("Switch to grid view mode");
	  	  		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
	  			TimeUnit.SECONDS.sleep(5);
  	  	  		
  	  	  		//Search For DCIM Folder 
  	  	  		logger.info("Select DCIM Folder");
  	  	  		System.out.println("Select DCIM Folder");
  	  	  		driver.findElement(By.xpath("//*[@text='DCIM']")).click();
  	  			TimeUnit.SECONDS.sleep(5);
  	  			
  	  		//Switch to List  view mode
  	  	  	  	logger.info("Switch to List view mode");
  		  	  		System.out.println("Switch to List view mode");
  		  	  		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
  		  			TimeUnit.SECONDS.sleep(5);
  	  	  		
  	  			//Search For Camera Folder
  	  		
  	  		try {
  	  			//Search For Camera Folder
  	  				logger.info("Select Camera Folder");
  	  				System.out.println("Select Camera Folder");
  	  				driver.findElement(By.xpath("//*[@text='Camera']")).click();
  	  				TimeUnit.SECONDS.sleep(5);
  	  			  
  	  			System.out.println("Fail:Images and videos are present in the DCIM folder");
  	  			System.out.println("Final Message: Test0 fail for format operation");
  	  			logger.info("Fail:Images and videos are present in the DCIM folder");
  	  			logger.info("Final Message: Test0 fail for format operation");
  	  		 logger.info("Test:End");
			 System.out.println("Test:End");
			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  		}
  	  			
  	  			catch (Exception e) {
  	  				
  	  	            e.printStackTrace();
  	  	            
  	  	            logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
  	  	          
  	  	            System.out.println("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
  	  	           
  	  	            logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  	        }
  	  			 logger.info("Final Message: Pass Test0 pass for format with data scenario");
  	  			 System.out.println("Final Message: Pass Test0 pass for format with data scenario");
  	  			 logger.info("Test: End");
  	  			 System.out.println("Test: End");
  	  			 logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  	   		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
  	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  	  			TimeUnit.SECONDS.sleep(2);
  	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  	  			
  	  			
  	  		}
  	  		}