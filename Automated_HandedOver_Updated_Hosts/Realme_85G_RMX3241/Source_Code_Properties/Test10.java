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
import Realme_85G_RMX3241.Test10;
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
import io.appium.java_client.touch.offset.PointOption;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.openqa.selenium.logging.LogEntries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import io.appium.java_client.android.AndroidElement;
  
  public class Test10
  {
	  // initializing the driver instance
	  AppiumDriver<MobileElement> driver;
	private String Result;
	private boolean isPaused;
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
			public void rearVideoRec() throws InterruptedException, SecurityException, IOException {
		  		
		  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
				logger.setUseParentHandlers(false);
				FileHandler fileHandler = new FileHandler("status_log_Test10.log");
				logger.addHandler(fileHandler);
				SimpleFormatter formatter = new SimpleFormatter();  
		        fileHandler.setFormatter(formatter); 
		        logger.info("Test: Start");
		        System.out.println("Test: Start");
		    	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		        logger.info("Test10 Scenario is as follows");
		        logger.info("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
		        logger.info("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		        logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
				logger.info("Setting up the appium desired capabilities");
				System.out.println("Test10 Scenario is as follows");
		        System.out.println("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
		        System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		        System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
				System.out.println("Setting up the appium desired capabilities");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				SetUp();
				String Result = "Fail";
		  		TimeUnit.SECONDS.sleep(5);
		  		
		  		//Launch Home screen application and clear recent apps
		  		logger.info("Launch home screen");
	            System.out.println("Launch home screen");
		  		((StartsActivity) driver).startActivity(new Activity("com.oppo.launcher", "com.oppo.launcher.Launcher"));
		  		TimeUnit.SECONDS.sleep(5);
		  		
		  		//enable force debug
		  		try
		  		{
		  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Force Close\")").click();
		  		logger.info("If Force debug pop up exists accept force debug");
		  		System.out.println("If Force debug pop up exists accept force debug");
		  		}
		  		catch (Exception e) {
		            e.printStackTrace();
		            logger.info("Force pop up not found");
		            System.out.println("Force pop up not found");
		           
		        }
		  		
		  		//Launch camera application for rear camera video capture
		  		logger.info("Launch camera application for rear camera video capture");
  				System.out.println("Launch camera application for rear camera video capture");
  				
  				
  				logger.info("Test10_BCam_res: 2 resolutions supported");
  				System.out.println("Test10_BCam_res: 2 resolutions supported");
		  		try {
		  			((StartsActivity) driver).startActivity(new Activity("com.oppo.camera", "com.oppo.camera.Camera"));
		  			
		  			//IF Location access notification pop-up exists select Cancel option.
		  				logger.info("if Location permisson Pop Exists Select Cancel Option");
		  				System.out.println("if Location permisson Pop Exists Select Cancel Option");
		  			// Switch to Video mode
		  				logger.info("Clicking Video Tab");
		  				System.out.println("Clicking Video Tab");
		  				TimeUnit.SECONDS.sleep(5);
		  				logger.info("Clicking Video Tab");
		  				System.out.println("Clicking Video Tab");
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
		  				logger.info("click on Save to SD Card Preferred option");
		  				System.out.println("click on Save to SDCard Preferred option");
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
				
				
				
		  	//Click On Rear camera video size to select resolution
		  		//Select Settings option
					logger.info("click on settings");
					System.out.println("click on settings");
					MobileElement Settings1 = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
					Settings1.click();
					TimeUnit.SECONDS.sleep(5);
					//Scroll up and select Video resolution
					logger.info("Scroll up and select Video resolution");
					System.out.println("Scroll up and select Video resolution");
			  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					         ".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));
			  		//Select video resolution
			  		MobileElement VideoRes = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			  		VideoRes.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		//Select First resolution
			  		logger.info("Select first highest rear camera video Resolution:Rear camera video size, 1080P");
			  			System.out.println("Select first highest rear camera video Resolution:Rear camera video size, 1080P");
			  			//Select 1st resolution
			  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[72,436][210,501]']"));
			  			FirstRes.click();
				  		TimeUnit.SECONDS.sleep(2);
				  		TimeUnit.SECONDS.sleep(5);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(6);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(6);
				// Load properties file
			  		Properties prop = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			  		System.out.println("recordingDurationRear = "+ recordingDurationRear +" Seconds");
			  		int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
		  			//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		TimeUnit.SECONDS.sleep(6);
			  		MobileElement StartRecording = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
			  		StartRecording.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			  		TimeUnit.SECONDS.sleep(3);
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  	MobileElement StopRecording = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
			  	StopRecording.click();
			  	TimeUnit.SECONDS.sleep(6);
					
					
			  		//Select 2nd resolution
			  		TimeUnit.SECONDS.sleep(3);
			  		logger.info("click on settings");
					System.out.println("click on settings");
					MobileElement Settings6 = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
					Settings6.click();
					TimeUnit.SECONDS.sleep(5);
					//Scroll up and select Video resolution
					logger.info("Scroll up and select video resolution option");
			  		System.out.println("Scroll up and select video resolution option");
			  		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					         ".scrollIntoView(new UiSelector().text(\"Video resolution\"))"));
			  		//Select video resolution
			  		MobileElement VideoRes1 = driver.findElement(By.xpath("//*[@text='Video resolution']"));
			  		VideoRes1.click();
			  		TimeUnit.SECONDS.sleep(2);
			  	//Select 2nd resolution
			  		logger.info("Select second highest video resolution:720P");
			  		System.out.println("Select second highest video resolution:720P");
			  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@bounds='[72,588][183,653]']"));
			  			SecondRes.click();
				  		TimeUnit.SECONDS.sleep(2);
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(6);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(6);
							// Load properties file
			  			Properties prop1 = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			  		System.out.println("recordingDurationRear1 = "+ recordingDurationRear1 + " Seconds");
			  		int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);
			  		
			  		//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		TimeUnit.SECONDS.sleep(5);
			  		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
			  		StartRecording1.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@content-desc='Video Recording Button']"));
			  		StopRecording1.click();
			  		TimeUnit.SECONDS.sleep(6);
			  		//Click on settings
					logger.info("click on settings");
					System.out.println("click on settings");
					MobileElement Settings4 = driver.findElement(By.xpath("//*[@bounds='[891,0][1008,240]']"));
					Settings4.click();
					TimeUnit.SECONDS.sleep(5);
					//Click on Advanced settings
					logger.info("click on Advanced settings");
					System.out.println("click on Advanced settings");
					MobileElement AdvancedSettings4 =  driver.findElement(By.xpath("//*[@bounds='[72,1518][468,1583]']"));
					AdvancedSettings4.click();
					TimeUnit.SECONDS.sleep(5);
					
					//Select Save to uSD card
					logger.info("uncheck  Save to SD Card Preferred option");
					System.out.println("uncheck  Save to SDCard Preferred option");
					MobileElement SavetoSDCardPreferred4 = driver.findElement(By.xpath("//*[@bounds='[900,865][1008,931]']"));
					SavetoSDCardPreferred4.click();
					TimeUnit.SECONDS.sleep(5);
					TimeUnit.SECONDS.sleep(5);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
					// Switch to Photo mode
	  				logger.info("Clicking Photo Tab");
	  				System.out.println("Clicking photo Tab");
	  				TimeUnit.SECONDS.sleep(5);
	  				TouchAction touchAction1 = new TouchAction(driver);
	  				touchAction1.tap(PointOption.point(752, 1781)).perform();
	  				TimeUnit.SECONDS.sleep(5);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(6);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  	  		TimeUnit.SECONDS.sleep(2);
		  	  		//TimeUnit.SECONDS.sleep(2);
			  	logger.info("Pass: Rear video recording is successfull");
		  		System.out.println("Pass: Rear video recording is successfull");
		  		
		  		//Launch File manager
				logger.info("Launch file manager application and verify recorded video present  in uSD Card");
				System.out.println("Launch file manager application and verify recorded video present in uSD Card");
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);
				//If file manager permission request access accept allow permission
				try
				{

					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/agree_button']")).click();
					TimeUnit.SECONDS.sleep(5);
					logger.info("Click Accept & continue");
					System.out.println("Click Accept & continue");
					driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
					TimeUnit.SECONDS.sleep(5);
				}
				catch (Exception e) {
					e.printStackTrace();
				}

				//Swipe and Select external storage
				logger.info("Swipe up to select uSD card");
				System.out.println("Swipe up to select uSD card");
				MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
				//Click External storage
				logger.info("Select SD card");
				System.out.println("Select SD card");
				MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
				ExternalStorage.click();
				TimeUnit.SECONDS.sleep(6);

				//Switch grid view mode
				logger.info("switch to grid view mode to select DCIM folder");
				System.out.println("switch to grid view mode to select DCIM folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);

				//Select DCIM Folder
				logger.info("Select DCIM folder");
				System.out.println("Select DCIM Folder");
				MobileElement DCIM =	driver.findElement(By.xpath("//*[@text='DCIM']"));
				DCIM.click();
				TimeUnit.SECONDS.sleep(3);
				//Select Camera folder
				logger.info("Select camera folder");
				System.out.println("Select camera folder");
				MobileElement Camera =	driver.findElement(By.xpath("//*[@text='Camera']"));
				Camera.click();
				TimeUnit.SECONDS.sleep(3);
				//Switch back to list view mode
				logger.info("switch to list view mode ");
				System.out.println("switch to list view mode");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Click More options
				logger.info("Click More options");
				System.out.println("Click More options");
				MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOptions.click();
				TimeUnit.SECONDS.sleep(6);
				//Click Select All
				logger.info("Click Select all");
				System.out.println("Click select all");
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
				SelectAll.click();
				TimeUnit.SECONDS.sleep(3);
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='2 selected']")).click();
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				logger.info("Test10_Bcam_video: 2 videos captured successfully");
				System.out.println("Test10_Bcam_video: 2 videos captured successfully");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				logger.info("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
				System.out.println("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
				RecordedVideoPlayback();

			}
			catch (Exception e) {
				logger.info("Fail: Test10 Fail for Rear camera video recording ");
				System.out.println("Fail: Test10 Fail for Rear camera video recording ");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("==================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================="); 
				//Calling Datamoveoperation()
				logger.info("Calling Data move operation");
				System.out.println("Calling Data move operation");
				DataMoveOperation();
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Fail Test10 Fail for Rear camera video recording");
				System.out.println("Final Message: Fail Test10 Fail for Rear camera video recording");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		//Launch file manager application,sort highest resolutio recorded video, playback video file, fast forward video file and pause.
		public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			//Launch File Manager for playing highest resolution recorded video from USD, fast forward and pause scenario
			logger.info("Launching file manager application");
			System.out.println("Launch file manager application");
			try {
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);



				//Swipe up and select uSD card
				MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"SD card\"))"));

				//Select External Storage	
				logger.info("Select External storage");
				System.out.println("Select External storage");
				MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
				ExternalStorage.click();
				TimeUnit.SECONDS.sleep(3);

				//Switch grid view mode
				logger.info("switch to grid view mode to select DCIM folder");
				System.out.println("switch to grid view mode to select DCIM folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);


				//Select DCIM Folder
				logger.info("Select DCIM folder");
				System.out.println("Select DCIM Folder");

				MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
				DCIM.click();
				TimeUnit.SECONDS.sleep(3);
				//Select Camera folder
				logger.info("Select camera folder");
				System.out.println("Select camera folder");
				MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
				Camera.click();
				TimeUnit.SECONDS.sleep(3);
				//Switch back to list view mode
				logger.info("switch to list view mode ");
				System.out.println("switch to list view mode");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Click More options
				logger.info("Click More options");
				System.out.println("Click More options");
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select External Storage");
				MoreOptions1.click();

				//Select Sort By 
				logger.info("Select sort by largest file first");
				System.out.println("Select sort by largest file first");
				MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
				Sortby1.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Largest first']")); 
				Largest1.click();
				TimeUnit.SECONDS.sleep(3);
				//Select Highest resolution video file to play
				logger.info("Click on first file to play highest recorded resolution video file from uSD card");
				System.out.println("Click on first file to play highest recorded resolution video file from uSD card");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
				logger.info("Started video playback");
				System.out.println("Started video playback");
				TimeUnit.SECONDS.sleep(30);

				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();

				//Click Fast forward button
				logger.info("Fast forward video for 10 seconds");
				System.out.println("Fast forward video for 10 seconds");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				TimeUnit.SECONDS.sleep(20);
				logger.info("Continue video playback");
				System.out.println("Continue video playback");
				//Tap Somewhere on Screen for contents to visible on Screen
				logger.info("Tap Somewhere on Screen for contents to visible on Screen");
				System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
				logger.info("Pause video playback");
				System.out.println("Pause video playback");

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: Recorded Video play back and fast forward successfull ");

				System.out.println("Pass: Recorded Video play back and fast forward successfull ");
				logger.info("Pass: Recorded Video play back and fast forward successfull ");


				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder ");
				logger.info("Calling DataMovementOperation() to move recorded rear camer videos to Test10 Folder");
				DataMoveOperation();
				if(Result == "Fail")
				{

					System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
					logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
				}
				else {
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
					logger.info("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
					CopiedvideosPlayBack();	

				}

			}

			catch (Exception e) {


				logger.info("Fail: Test10 Fail for RecordedVideoPlayBack()");
				System.out.println("Fail: Test10 Fail for RecordedVideoPlayBack()");

				System.out.println("Calling DataMoveOperation() to move all rear camera recorded video files to Test10 folder");
				logger.info("Calling DataMoveOperation() to move all rear camera recorded video files to Test10 folder");
				DataMoveOperation();
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");

				System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
		//Launch file manager application, select external storage,select Test1 folder, select video folder and play back copied video files, fast forward and Pause the same     
		public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());





			//Re-launch file manager application and select external storage
			logger.info("Re-launch file manager application and select external storage for playing copied video files");
			System.out.println("Re-launch file manager application and select external storage for playing copied video files");
			try {
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Launching file manager application");
				MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"SD card\"))"));

				//Select External Storage	
				logger.info("Select external storage");
				System.out.println("Select external storage");
				MobileElement ExternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
				ExternalStorage.click();
				TimeUnit.SECONDS.sleep(3);

				//Switch grid view mode
				logger.info("switch to grid view mode to select Test1 folder");
				System.out.println("switch to grid view mode to select Test1 folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
				//select Test1 folder
				logger.info("Select Test1 folder");
				System.out.println("Select Test1 folder");
				MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
				Test1.click();
				TimeUnit.SECONDS.sleep(3);
				//Select TestFile folder
				logger.info("Select tes_file folder");
				System.out.println("Select test_file folder");
				MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
				TestFile.click();
				TimeUnit.SECONDS.sleep(3);

				//Select OneGB folder
				logger.info("Select 1GB folder");
				System.out.println("Select 1GB folder");
				MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
				oneGB.click();
				TimeUnit.SECONDS.sleep(3);
				//Select Video folder
				logger.info("Select video folder");
				System.out.println("Select video folder");
				MobileElement Video = driver.findElement(By.xpath("//*[@text='Video']")); 
				Video.click();
				TimeUnit.SECONDS.sleep(3);
				//Switch list view mode
				logger.info("switch to list view mode to select Test1 folder");
				System.out.println("switch to list view mode to select Test1 folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);

				try {
					//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
					System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback from uSD card(Test-->Videos)");
					driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
					logger.info("Started video playback");
					System.out.println("Started video playback");
					TimeUnit.SECONDS.sleep(20);

					//Tap Somewhere on Screen for contents to visible on Screen
					logger.info("Tap Somewhere on Screen for contents to visible on Screen");
					System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();

					//Clikc Fast forward button
					logger.info("Click fast forward button for 10 seconds video forward");
					System.out.println("Click fast forward button for 10 seconds video forward");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
					TimeUnit.SECONDS.sleep(20);

					logger.info("Pause video playback");
					System.out.println("Pause video playback");
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);

					logger.info("Pass: 4K Video play back and fast forward is successful ");
					TimeUnit.SECONDS.sleep(3);
				}

				catch(Exception exp)
				{ 
					logger.info("Fail:Test10 Fail for 4K video play back "+exp); 
					System.out.println("Fail:Test10 Fail for 4K video play back: "+exp); 

					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				}
				try {

					//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
					System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback from uSD card(Test-->Videos)");
					logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback from uSD card(Test-->Videos)");
					driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
					logger.info("Started video playback");
					System.out.println("Started video playback");
					TimeUnit.SECONDS.sleep(20);

					//Tap Somewhere on Screen for contents to visible on Screen
					logger.info("Tap Somewhere on Screen for contents to visible on Screen");
					System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();

					//Clikc Fast forward button
					logger.info("Click fast forward button for 10 seconds video forward");
					System.out.println("Click fast forward button for 10 seconds video forward");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
					TimeUnit.SECONDS.sleep(20);
					logger.info("Continue video playback");
					System.out.println("continue video playback");
					logger.info("Pause video playback");
					System.out.println("Pause video playback");
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					logger.info("Pass: FHD Video play back and fast forward is successful ");
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				}

				catch(Exception exp)
				{ 
					logger.info("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
					System.out.println("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 

					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				}

				logger.info("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
				System.out.println("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
				logger.info("Test:End");
				System.out.println("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
				
			}

			catch (Exception e) {
				e.printStackTrace();
				logger.info("Final message: Fail Test10 Fail for Playing Copied Video files  and fast forward video play back scenario ");
				System.out.println("Final message: Fail Test10 Fail for Playing Copied Video files and fast forward video play back scenario ");
				logger.info("Test:End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);


			}

		} 
		public void DataMoveOperation() throws  IOException, InterruptedException {

			java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
			isPaused = true;
			try {
				logger.info("Re-launch file manager application and select external storage for data move operation, select all rear camera videos present in camera folder and move to Test10 folder");
				System.out.println("Re-launch file manager application and select external storage for data move operation, select all rear camera videos present in camera folder and move to Test10 folder");
				((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Launching file manager application");
				MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
						".scrollIntoView(new UiSelector().text(\"SD card\"))"));

				//Select External Storage	
				logger.info("Select external storage");
				System.out.println("Select external storage");
				MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']")); 
				Ext.click();
				TimeUnit.SECONDS.sleep(5);

				//Switch to grid view mode
				logger.info("switch to grid view mode and select DCIM  folder");
				System.out.println("switch to grid view mode and select DCIM folder");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);

				//Select Test1 folder
				logger.info("Select DCIM folder");
				System.out.println("Select DCIM folder");
				MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
				DCIM.click();
				TimeUnit.SECONDS.sleep(3);
				//Select TestFile folder


				//Select Test_file folder
				logger.info("Select camera  folder");
				System.out.println("Select camera folder");
				MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
				Camera.click();
				TimeUnit.SECONDS.sleep(3);

				//Switch back to list view mode
				logger.info("switch to list view mode ");
				System.out.println("switch to list view mode");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
				//Click More options
				logger.info("Click More options");
				System.out.println("Click More options");
				MobileElement MoreOptions =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOptions.click();
				TimeUnit.SECONDS.sleep(6);
				//Click Select All
				logger.info("Click Select all");
				System.out.println("Click select all");
				MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='Select all']"));
				SelectAll.click();
				TimeUnit.SECONDS.sleep(3);

				//Click More options
				logger.info("Click More options");
				System.out.println("Click More options");
				MobileElement MoreOptions1 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOptions1.click();
				TimeUnit.SECONDS.sleep(6);

				//Click  Move to Option
				logger.info("Select move to option");
				System.out.println("select move to option");
				MobileElement moveto =	driver.findElement(By.xpath("//*[@text='Move to']"));
				moveto.click();
				TimeUnit.SECONDS.sleep(6);

				//Click  Move to Option
				logger.info("Select uSD Card");
				System.out.println("select uSD Card");
				MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
				uSD.click();
				TimeUnit.SECONDS.sleep(6);

				//Click  Move to Option
				logger.info("Select ADD NEW Folder option");
				System.out.println("Select ADD NEW Folder option");
				MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
				CreateFolder.click();
				TimeUnit.SECONDS.sleep(6);

				logger.info("Name folder as Test10");
				System.out.println("Name folder as Test10");
				driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
				driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test10");
				TimeUnit.SECONDS.sleep(5);

				//Click Create option
				logger.info("Accept create folder");
				System.out.println("Accept create folder");
				driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
				TimeUnit.SECONDS.sleep(30);

				logger.info("Cut paste  video files operation completed successfully");
				System.out.println("Cut paste  video files operation completed successfully");

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

				logger.info("Test10: Data move operation completed successfully");
				System.out.println("Test10: Data move operation completed successfully");
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(2);


				Result = "Pass";


				if (Result == "Pass")
				{
					logger.info("Pass: Test10 Pass for data move operation successfully");	
					System.out.println("Pass: Test10 Pass for data move operation successfully");	
				}


			}
			catch (Exception e) {
				e.printStackTrace();
				if (Result == "Fail")
				{
					logger.info("Fail: Test10 Fail for data move operation ");
					System.out.println("Fail: Test10 Fail for data move operation");	
				}

			}

		}  	
	}
	  