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
		FileHandler fileHandler = new FileHandler("status_log_Test0_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
        fileHandler.setFormatter(formatter); 
        logger.info("========Test0: Unlock Phone & clear Recent apps"
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
  	  		logger.info("Pass: Test0 Pass for clearing Recent apps ");
  		
  		

  		
  		}
  		
  		
  		
  		
  		catch (Exception e) {
            e.printStackTrace();
            logger.info("Pass: No recent apps present");
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  	/*	List<String> lsArgs = Arrays.asList("/mnt/sdcard/Pictures/*.*");
  		Map<String, Object> lsCmd = ImmutableMap.of(
  		    "command", "ls",
  		    "args", lsArgs
  		);
  		String lsOutput = (String) driver.executeScript("mobile: shell", lsCmd);
  		*/
  		
   /*     try {
            List<String> removePicsArgs = Arrays.asList("-rf","storage/emulated/0/");
            Map<String, Object> removePicsCmd = ImmutableMap
                .of("command", "rm", "args", removePicsArgs);
            driver.executeScript("mobile: shell", removePicsCmd);

            List<String> lsArgs = Arrays.asList("/storage/emulated/0/");
            Map<String, Object> lsCmd = ImmutableMap.of("command", "ls", "args", lsArgs);
            String lsOutput = (String) driver.executeScript("mobile: shell", lsCmd);
            Assert.assertEquals("", lsOutput);
            System.out.println("Clearing Recent Apps");
            
            System.out.print("Clearing Internal Memory "+lsOutput);
        } 
        
        catch (Exception e) {
            e.printStackTrace();
          
        }
    
      */
  		
  		
  		//Clearing Phone internal Memory
  		
  		//Launch File Manager
  		((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		
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
  		
  		
  		//Select Internal Storage
  		driver.findElement(By.xpath("//*[@text='Phone storage']")).click();
  		TimeUnit.SECONDS.sleep(3);
  		
  		
  		//Long Press Android folder
  		MobileElement Android = ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Android\")"); 
			TouchAction touchAction=new TouchAction(driver);
			
		
			touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Android))).release().perform();
			TimeUnit.SECONDS.sleep(5);
			
			//Click Select All
			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/select_all']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		//Click Delete All
	  		driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/action_delete']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		//Click OK
	  	//Click Delete All
	  		driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/bt_right']")).click();
	  		TimeUnit.SECONDS.sleep(3);
  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
	  		
			//Calling FormatAsInternal() before capturing images
			FormatAsInternal();
	  		
	  		
	  		
		
  	//Calling Image Function to capture Image and Record Video and Verify Images and recorded video present in SD Card
  		Images();
  		
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

	
	
	
  		public void Images() throws  IOException, InterruptedException {
  	
  			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			
  			//Launching Camera Application
  			logger.info("Launch Camera Application");
  			
  			((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraActivity"));
		
  		
		//If Permission reuest pop-up exists allow permissons
		try 
		{ 
			driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/positiveTextView']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
			
		} 
		catch(Exception exp)
		{ 
			logger.info("change to SD card element not found : "+exp); 
			
		}
		
		TimeUnit.SECONDS.sleep(2);
		
		
		
		
				
			
		
		
		
		//Click On Settings
	//find element by xpath
		
	/*	driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Click settings option");
  		
		
		//Select Storage Path
		driver.findElement(By.xpath("//*[@text='Storage path']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Clicking on Storage path");
		
		
		//Select uSD Card as Storage option
		driver.findElement(By.xpath("//*[@text='SD card']")).click();
  		TimeUnit.SECONDS.sleep(3);
		logger.info("Selecting uSD Card as Storage option");
		
		
		
	
		//Swipe Up and Search for Storage Option and Click 
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		
		*/
		
		
		
		
		
		//Capture Images
		logger.info("Capturing  25 Images of Default Resolution");
		for(int j = 0; j < 25; j++) 
  		{ 
  			TimeUnit.SECONDS.sleep(2);
  			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
  			 TimeUnit.SECONDS.sleep(2);
  			System.out.println("clicking Image of Default Resolutions"+j);
  			logger.info("clicking Image of Default Resolutions"+j);
  		}
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		
  		
  	//Launch File Manager
  		((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		
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
  		
  		
  		//Select Phone Storage
  		MobileElement PhoneStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
  				+ "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android."
  				+ "widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android."
  				+ "widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
		TimeUnit.SECONDS.sleep(5);
		PhoneStorage.click();
  		
  		
  		//Search For DCIM Folder 
  		
		logger.info("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
  		
		//Search For Camera Folder
		logger.info("Click On Camera Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		
		//Long Press on any File
		MobileElement ImageFile = driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/file_name']")); 
		TouchAction touchAction=new TouchAction(driver);
		
	
		touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (ImageFile))).release().perform();
		TimeUnit.SECONDS.sleep(5);
		
		
		
  		
		
		
		
		
		
		
		try {

			//Click Select All
			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/select_all']")).click();
	  		TimeUnit.SECONDS.sleep(3);
			logger.info("Verifying Image Capture ");
			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/selected_num']")).click();
			logger.info("Pass:Total Number Of Image captured 25");
			logger.info("Pass: Test0 Pass for Image Capture");
			Video();
		}
		
		catch (Exception e) {
			
            e.printStackTrace();
        }
		
		
			
		
		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		
  		
  		}
  		
  	//Launch Phone Camera App set SD card as Storage Record videos of 2 resolutions 
  	//Verify the recorded video is Present in SD card  if video is not captured fail the Test Case
  	public void Video() throws  IOException, InterruptedException {
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  		
  		
  		
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
            logger.info(" No recent apps Found");
        }
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		
  		
  		
  		//Launching Camera Application
			logger.info("Launch Camera Application");
			
			((StartsActivity) driver).startActivity(new Activity("com.android.camera2", "com.android.camera.CameraActivity"));
	
		
	//If Permission reuest pop-up exists allow permissons
			try 
			{ 
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/positiveTextView']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/bottom_panel_center']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		
				
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				
			}
			
			TimeUnit.SECONDS.sleep(2);
	
	
	
	
			
		
	
	
	
			
	

	
	
	

			//click on video tab
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video\")").click();
		TimeUnit.SECONDS.sleep(5);
		logger.info("Clicking Video Tab");
  		

  		
	  		try {
				
				MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Front camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();
				logger.info("Switch To Back Camera if current Exiting camera is Front camera");
			}
			
			catch(Exception exp)
			{ 
					// Block of code to handle errors
				logger.info("Current Existing Camera is Back Camera"); 
			}
  		
  		
  		
		  		
		  		
				
				
				//Click settings option
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:integer/settings_button_dream']")).click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Click settings option");
				
		/*	
			//Select Storage Path
			driver.findElement(By.xpath("//*[@text='Storage path']")).click();
				TimeUnit.SECONDS.sleep(3);
			logger.info("Clicking on Storage path");
			
			
			//Select uSD Card as Storage option
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
				TimeUnit.SECONDS.sleep(3);
			logger.info("Selecting uSD Card as Storage option");
		
		
		*/
		
		
		
		
			
			//Swipe Up and Search for Storage Option and Click 
			String text = "Video size(Back camera)";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Video size(Back camera)\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Searching of Storage Location option and Clicking on Storage Location Tab");
			
			//Selecting 1st Highest resolution
			driver.findElement(By.xpath("//*[@text='HD 1080p']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			//Clikc Press Back
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
			
			
			
			
		
			
			
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  				
	  		
	  		
	  			
	  			
		  		for(int j = 0; j < 2; j++) 
		  		{
				
				//Start Recording
		  		MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]"));
		  		StartRecording.click();
		  		TimeUnit.SECONDS.sleep(60);
		  		
		  		
		  		//Stop Recording
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera2:id/shutter_button']")).click();
		  		logger.info("Stop Recording");
		  		TimeUnit.SECONDS.sleep(15);
		  		
		  		}
	  		
  		
	
	  		
  		
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		
  		
  		
  		//Launch File Manager Application
  		
  		//Launch File Manager
  		((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		
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
  		
  		
  	//Select Phone Storage
  		MobileElement PhoneStorage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
  				+ "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android."
  				+ "widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android."
  				+ "widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
		TimeUnit.SECONDS.sleep(5);
		PhoneStorage.click();
  		
  		
  		//Search For DCIM Folder 
  		
		logger.info("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
  		
		//Search For Camera Folder
		logger.info("Click On Camera Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		
		//Long Press on any File
		MobileElement ImageFile = driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/file_name']")); 
		TouchAction touchAction=new TouchAction(driver);
		
	
		touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (ImageFile))).release().perform();
		TimeUnit.SECONDS.sleep(5);
		
	
		
  		
		
		
		
		
		
		
		try {

			//Click Select All
			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/select_all']")).click();
	  		TimeUnit.SECONDS.sleep(3);
			logger.info("Verifying Image Capture ");
			driver.findElement(By.xpath("//*[@resource-id='com.itel.filemanager:id/selected_num']")).click();
			
			logger.info("Pass: 2 Videos recorded Successfully");
			logger.info("Pass: A total of 27 files present in uSD card before Format");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		FormatAsExternal();
		}
		
		catch (Exception e) {
			
            e.printStackTrace();
            
        }
		
		
			
		
		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		TimeUnit.SECONDS.sleep(2);
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  		
  		
  		
  		
  		
  		
		
	 		
		
		 	
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
		
		
		
		
		//Launch File Manager
  		((StartsActivity) driver).startActivity(new Activity("com.itel.filemanager", "com.itel.filemanager.activity.MainActivity"));
  		TimeUnit.SECONDS.sleep(5);
  		
  		
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
  		
  		
  		//Select PhoneStorage
  		driver.findElement(By.xpath("//*[@text='Phone storage']")).click();
  		TimeUnit.SECONDS.sleep(3);
  		
  		
  		//Search For DCIM Folder 
  		
		logger.info("Click on DCIM Folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
		TimeUnit.SECONDS.sleep(5);
  		
		//Search For Camera Folder
		
		
		
		
		
		
		
		
  		
		try {
		//Search For Camera Folder
		
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
		TimeUnit.SECONDS.sleep(5);
		  
         logger.info("Fail: Test0 Fail for formatting uSD Card with Data ");
		 logger.info("Final Message: Fail Test0 Fail for format Operation");
		}
		
		catch (Exception e) {
			
            e.printStackTrace();
            
            logger.info("Pass:Images and videos are not present in the DCIM folder, CARD format is successfully completed ");
   		 logger.info("Final Message: Pass Test0 pass for format Operation");
        }
	
		
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		
		
		}
  	
  	
  	
  	
  	
  	
  	
  	}



  		
  		
  		

  	
  	
  	
  	
	
		
		
	//log.info("Capture Images");

	/*@AfterClass
	 public void tearDown(){
	     driver.close();
	     driver.quit();
	 }*/
//	
	