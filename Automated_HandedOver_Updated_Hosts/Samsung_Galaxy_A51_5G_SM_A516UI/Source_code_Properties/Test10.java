package Samusng_Galaxy_A51_5G;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
import Samusng_Galaxy_A51_5G.Test10;
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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A51 5G");
			dc.setCapability(MobileCapabilityType.UDID, "R5CN80GP9GN");
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
		        logger.info("4.Move rear camera recorded videos from camera folder to Test10 folder");
		        logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
				logger.info("Setting up the appium desired capabilities");
				System.out.println("Test10 Scenario is as follows");
		        System.out.println("1.Launch Camera application and start rear camera video recording for all host applicable resolutions in uSD Card and verify recorded data");
		        System.out.println("2.Playback Highest resolution recorded video from uSD Card, fast forward playback and pause video playback scenario ");
		        System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause video playback scenario");
		        System.out.println("4.Move rear camera recorded videos from camera folder to Test10 folder");
				System.out.println("Setting up the appium desired capabilities");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				SetUp();
				String Result = "Fail";
		  		TimeUnit.SECONDS.sleep(5);
		  		
		  		//Launch Home screen application and clear recent apps
		  		logger.info("Clearing  Recent Apps");
		  		System.out.println("Clearing  Recent Apps");
		  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
		  		TimeUnit.SECONDS.sleep(5);
		  		// open the recently opened apps screen
		  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		  		TimeUnit.SECONDS.sleep(5);
		  		// Clearing recent apps
		  		try
		  		{
		  			logger.info("Clearing Recent Apps");
		  			System.out.println("Clearing Recent Apps");
		  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			  		TimeUnit.SECONDS.sleep(5);
		  		}
		  		catch (Exception e) {
		            e.printStackTrace();
		        }
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  		//Launch Camera Application for rear camera video recording
		  		logger.info("Launch Camera Application for rear camera video recording");
		  		System.out.println("Launch Camera Application for rear camera video recording");
		  		try {
		  			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
		  			logger.info("Test10_Bcam_res: 3 resolutions supported");
					System.out.println("Test10_Bcam_res: 3 resolutions supported");
		  		//If Change to SD Card notification pop-up exists select Cancel Option
		  		logger.info("If change to uSD card pop-up exists select Cancel");
		  		System.out.println("If change to uSD card pop-up exists select Cancel");
		  		try 
		  		{ 
		  			MobileElement changeToSDCard = driver.findElement(By.id("android:id/button2")); 
		  			TimeUnit.SECONDS.sleep(2);
		  			changeToSDCard.click();
		  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
		  		} 
		  		catch(Exception exp)
		  		{ 
		  				// Block of code to handle errors
		  			logger.info("change to SD card element not found : "+exp); 
		  			System.out.println("change to SD card element not found : "+exp); 
		  		}
		  		
		  		//If Location access Permission appears Click Cancel Option
		  		logger.info("If Location access Permission Request Pop Exists Click on Cancel. ");
		  		System.out.println("If Location access Permission Request Pop Exists Click on Cancel. ");
		  		try 
		  		{ 
		  			MobileElement Location = driver.findElement(By.id("android:id/button2")); 
		  			TimeUnit.SECONDS.sleep(2);
		  			Location.click();
		  		} 
		  		catch(Exception exp)
		  		{ 
		  				// Block of code to handle errors
		  			logger.info("Location access pop-up  not found : "+exp); 
		  		}
		  		
		  		
		  		
		  		//Switch to rear camera mode if the current existing is front camera mode
		  		try {
					
		  			logger.info("Switch To Rear Camera mode if current Exiting camera is Front camera mode");
					System.out.println("Switch To Rear Camera mode if current Exiting camera is Front camera mode");
				//	MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
				//	SwitchToBackCamera.click();
					TimeUnit.SECONDS.sleep(2);
					
					}
				
				catch(Exception exp)
				{ 
						// Block of code to handle errors
					logger.info("Current Existing Camera is Rear Camera mode."); 
					System.out.println("Current Existing Camera is Rear Camera mode."); 
				}
		  		
		  		
		  		// Switch to video mode
		  		logger.info("Switch to video mode");
		  		System.out.println("Switch to video mode");
		  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"VIDEO\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Click On Settings and set uSD card as storage option
			  	logger.info("Click On Settings and set uSD card as storage option");
			  	System.out.println("Click On Settings and set uSD card as storage option");
			  	MobileElement Settings = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Go to Settings\"]"));
				Settings.click();
				TimeUnit.SECONDS.sleep(5);	
					//Swipe Up and select storage option
					logger.info("Swipe Up and select storage location option");
					System.out.println("Swipe Up and select storage location option");
					String text = "Storage location";
					driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
					TimeUnit.SECONDS.sleep(5);
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
					TimeUnit.SECONDS.sleep(5);
					//Select uSD card as storage option
					logger.info("Select SD as storage option");
					System.out.println("Select SD as storage option");
					((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
					TimeUnit.SECONDS.sleep(5);
					//Clikc Press Back
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		
			  		MobileElement Settings1 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Go to Settings\"]"));
					Settings1.click();
			  		//Click On Rear Video size to select resolution
			  		logger.info("Select Rear video size");
			  		System.out.println("Select Rear video size");
			  		driver.findElement(By.xpath("//*[@text='Rear video size']")).click();
					logger.info("select Rear video size");
		  			
		  			
		  		//Select 1st resolution
		  			logger.info("Select rear camera first Video Resolution:16:9");
		  			System.out.println("Select rear camera first Video Resolution:16:9");
		  			driver.findElement(By.xpath("//*[@text='16:9']")).click();
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  	// Load properties file
			  		Properties prop = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			  		System.out.println("recordingDurationRear = "+ recordingDurationRear);
			  		int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
		  			
					//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']")).click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']")).click();
			  		TimeUnit.SECONDS.sleep(6);
			  		
			  		
			  	//Click On Setings
			  		TimeUnit.SECONDS.sleep(5);
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/quick_setting_button']")).click();
			  		logger.info("Click Settings");
			  		//Click On Rear Video size to select resolution
			  		logger.info("Select Rear Video size");
			  		System.out.println("Select Rear Video size");
			  		driver.findElement(By.xpath("//*[@text='Rear video size']")).click();
					logger.info("select Rear video size");
		  			
		  			//Select 2nd resolution
		  			logger.info("Select rear camera second Video Resolution:Full");
		  			System.out.println("Select rear camera second Video Resolution:Full");
		  			driver.findElement(By.xpath("//*[@text='Full']")).click();
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		Properties prop1 = new Properties();
			  		// Load properties file
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			  		System.out.println("recordingDurationRear1 = "+ recordingDurationRear1);
			  		int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);
			  		
			  		//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']")).click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']")).click();
			  		
			  		
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/quick_setting_button']")).click();
			  		TimeUnit.SECONDS.sleep(2);
			  	//Click On Rear Video size to select resolution
			  		logger.info("Select Rear Video size");
			  		System.out.println("Select Rear Video size");
			  		
			  		driver.findElement(By.xpath("//*[@text='Rear video size']")).click();
			  		TimeUnit.SECONDS.sleep(2);
		  			logger.info("Select rear camera third Video Resolution: BACK_CAMCORDER_RESOLUTION_FHD_30");
		  			System.out.println("Select rear camera third Video Resolution: BACK_CAMCORDER_RESOLUTION_FHD_30");
		  			//Select 3rd resolution
		  			driver.findElement(By.xpath("//*[@text='1:1']")).click();
			  		TimeUnit.SECONDS.sleep(2);
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		Properties prop2 = new Properties();
			  		// Load properties file
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			  		System.out.println("recordingDurationRea2 = "+ recordingDurationRear2);
			  		int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);
			  		
			  	//Start Recording
			  		logger.info("Start rear video recording");
			  		System.out.println("Start rear video recording");
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/normal_center_button']")).click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear2Int);
			  		
			  		
			  		//Stop Recording
			  		logger.info("Stop Recording");
			  		System.out.println("Stop Recording");
			  		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/stop_button']")).click();
			  		
			  		
			  		
			  	TimeUnit.SECONDS.sleep(15);
			  	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		  		TimeUnit.SECONDS.sleep(2);
		  		logger.info("Pass: Rear video recording is successfull");
		  		System.out.println("Pass: Rear video recording is successfull");
		  		
		  		//launch file manager application and verify data
		  		logger.info("launch file manager application and verify data");
		  		System.out.println("launch file manager application and verify data");
		  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		  	//Swipe and Select external storage
				logger.info("Swipe up to select uSD card");
				System.out.println("Swipe up to select uSD card");
				MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
				//Click External storage
				logger.info("Select SD card");
				System.out.println("Select SD card");
				MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
				InternalStorage.click();
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
				//Switch back to List view mode
				
				logger.info("switch to list view mode ");
				System.out.println("switch to list view mode");
				driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
				TimeUnit.SECONDS.sleep(3);
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
					driver.findElement(By.xpath("//*[@text='3 selected']")).click();
					TimeUnit.SECONDS.sleep(3);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					logger.info("Test10_Bcam_video: 3 videos captured successfully");
					System.out.println("Test10_Bcam_video: 3 videos captured successfully");
		  		
		  		
		  		
		  		
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
				//Calling video playback() for Playing Highest record video, fast forward video play back
		  		
		  		
		  	}
		  	
		  	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		  	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  		
	  		  	//Launch Home screen and clear recent apps
	  				logger.info("Launch Home screen and clear recent apps");
	  				System.out.println("Launch Home screen and clear recent apps");
	  				((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	  		  		TimeUnit.SECONDS.sleep(5);
	  		  		
	  		  		// open the recently opened apps screen
	  		  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		  		TimeUnit.SECONDS.sleep(5);
	  		  		// click on close all
	  		  		try
	  		  		{
	  		  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
	  		  		TimeUnit.SECONDS.sleep(5);
	  		  		}
	  		  		catch (Exception e) {
	  		            e.printStackTrace();
	  		        }
	  		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		  		TimeUnit.SECONDS.sleep(2);
	  		  		
	  		  	//Launch File Manager
	  		  		try {
	  		  		logger.info("Launch file manager application for rear camera video play back");
	  		  	System.out.println("Launch file manager application for rear camera video play back");
	  		  	((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		//Swipe up and select uSD Card
	  	  		logger.info("Swipe up and select uSD card");
	  	  		System.out.println("Swipe up and select uSD card");
	  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
						         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
				  		
				  	//Select External Storage	
				  	  logger.info("Select External storage");
				  	  System.out.println("Select External storage");
				  	MobileElement Ext = driver.findElement(By.xpath("//*[@text='SD card']"));
					Ext.click();
					TimeUnit.SECONDS.sleep(5);
					
					//Switch back to grid view mode
					logger.info("switch to grid view mode ");
					System.out.println("switch to gird view mode");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
					TimeUnit.SECONDS.sleep(3);
					
					//Swipe and select DCIM folder
					logger.info("Swipe up and select DCIM folder");
					System.out.println("Swipe up and select DCIM folder");
				MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				         ".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
						//Select DCIM folder
						logger.info("Select DCIM folder");
						System.out.println("Select DCIM folder");
						MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
						DCIM.click();
						TimeUnit.SECONDS.sleep(3);
				  		//Select camera folder
						logger.info("Select Camera folder");
						System.out.println("Select Camera folder");
						MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
						Camera.click();
						TimeUnit.SECONDS.sleep(3);
						//Switch back to list view mode
						logger.info("switch to list view mode ");
						System.out.println("switch to list view mode");
						driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
						TimeUnit.SECONDS.sleep(3);
						
						
						//Select more options
						logger.info("select more options");
						System.out.println("select more options");
						MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
					TimeUnit.SECONDS.sleep(5);
					logger.info("Select External Storage");
					MoreOptions1.click();
				  		
				  	//Select Sort By 
					logger.info("Select Sort BY");
					System.out.println("Select Sort BY");
					
					MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
					Sortby1.click();
						TimeUnit.SECONDS.sleep(3);
						//Select Largest First
						logger.info("Select Largest first");
						System.out.println("Select Largest first");        	
						MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Largest first']")); 
						Largest1.click();
						TimeUnit.SECONDS.sleep(3);
						//Select Highest resolution video file to play
						logger.info("Click on first file to play highest recorded resolution video file");
						System.out.println("Click on first file to play highest recorded resolution video file");
		  		  		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		  		  		logger.info("Started video playback");
		  		  		TimeUnit.SECONDS.sleep(30);
		  		  		
		  		  		//Tap Somewhere on Screen for contents to visible on Screen
			  		  	logger.info("Tap Somewhere on Screen for contents to visible on Screen");
			  			System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
			  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
			  		  	
			  		  	//Click Fast forward button
			  		  logger.info("Fast forward video for 10 seconds");
			  		System.out.println("Fast forward video for 10 seconds");
			  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			  		TimeUnit.SECONDS.sleep(2);
			  		
			  		 logger.info("Continue video playback");
				  		System.out.println("Continue video playback");
				  		TimeUnit.SECONDS.sleep(20);
				  		
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
			  		System.out.println("Pass: Recorded Video play back and fast forward successfull");
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
			      
		  	public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
		  		
		  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  		
			  	//launch  Home screen and clear recent apps
					logger.info("launch  Home screen and clear recent apps");
					System.out.println("launch  Home screen and clear recent apps");
					((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
			  		TimeUnit.SECONDS.sleep(5);
			  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			  		TimeUnit.SECONDS.sleep(5);
			  		// click on close all
			  		try
			  		{
			  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Close all\")").click();
			  		TimeUnit.SECONDS.sleep(5);
			  		}
			  		catch (Exception e) {
			            e.printStackTrace();
			        }
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			  		TimeUnit.SECONDS.sleep(2);
			  		try {
			  		//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
			  		logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			  		System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		  	  		TimeUnit.SECONDS.sleep(5);
		  	  		logger.info("Launching file manager application");
		  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
							        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
							         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
					  		
					  	//Select External Storage	
		  	  		logger.info("Select external storage");
		  	  		System.out.println("Select external storage");
							MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView"));
					TimeUnit.SECONDS.sleep(5);
					logger.info("Select External Storage");
					Ext.click();
					//Switch back to gird view mode
					logger.info("switch to gird view mode ");
					System.out.println("switch to gird view mode");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
					TimeUnit.SECONDS.sleep(3);
			  	//Select Test1 folder
					logger.info("Select Test1 folder");
					System.out.println("Select Test1 folder");
					MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
		  			Test1.click();
		  			TimeUnit.SECONDS.sleep(3);
		  	  		//Select Test1 folder folder
		  			logger.info("Select Test1 folder");
		  			System.out.println("Select Test1 folder");
		  			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
		  			TestFile.click();
		  			TimeUnit.SECONDS.sleep(3);
		  			//Select OneGB folder
		  			logger.info("Select OneGB folder");
		  			System.out.println("Select OneGB folder");
		  			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
		  			oneGB.click();
		  			TimeUnit.SECONDS.sleep(3);
		  			//Select Video folder
		  			logger.info("Select video folder");
		  			System.out.println("Select video folder");
		  			MobileElement Video = driver.findElement(By.xpath("//*[@text='Video']")); 
		  			Video.click();
		  			TimeUnit.SECONDS.sleep(3);
		  		//Switch back to list view mode
					logger.info("switch to list view mode ");
					System.out.println("switch to list view mode");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
					TimeUnit.SECONDS.sleep(3);
		  			try {
		  			//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
		  			System.out.println("Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback");
		  			logger.info("System.out.println(\"Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback\");");
		  			
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
		  		  
		  		logger.info("Continue video playback");
		  		System.out.println("Continue video playback");
		  		  
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
		  			
		  			
		  			
			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
	  		  		logger.info("Started video playback");
	  		  		TimeUnit.SECONDS.sleep(20);
	  		  		try {
	  		  		//Tap Somewhere on Screen for contents to visible on Screen
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
			  		  
			  		logger.info("Continue video playback");
			  		System.out.println("Continue video playback");
			  		  
			  		TimeUnit.SECONDS.sleep(20);
			  		logger.info("Pause video playback");
			  		System.out.println("Pause video playback");
			  		
		  		  		
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
	  		  		
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
	  		  	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					logger.info("Pass: FHD Video play back and fast forward is successful ");
				
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		  		}
	  		  		
	  		  	catch(Exception exp)
		  			{ 
		  				logger.info("Fail: Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
		  				System.out.println("Fail: Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
		  				
		  				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  				
		  			}
	  		  		
	  		  	logger.info("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario and Data move operation ");
	  		  System.out.println("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario and Data move operation");
	  		System.out.println("Test:End");
	  		logger.info("Test:End");
	  		  logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
					TimeUnit.SECONDS.sleep(2);
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
