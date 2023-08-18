package Xiaomi_RedmiNoteProMax;
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
import io.appium.java_client.android.AndroidElement;
  
  public class Test10
  {
	  // initializing the driver instance and declarind desired capabilities
	  AppiumDriver<MobileElement> driver;
	  	@BeforeTest
		public void SetUp() throws MalformedURLException {
			// set desired capabilities
	  		DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10 Pro");
			dc.setCapability(MobileCapabilityType.UDID, "9550de34");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, dc);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	  		((AndroidDriver) driver).unlockDevice();
			 TimeUnit.SECONDS.sleep(5);
			//Launch Home screen 
			 logger.info("Launch home screen");
			 System.out.println("Launch home screen");
			((StartsActivity) driver).startActivity(new Activity("com.miui.home", "com.miui.home.launcher.Launcher"));
	  		TimeUnit.SECONDS.sleep(5);
	  		//if appium permission request pop-up exists select allow pop-up for execution
	  		try
	  		{
	  			//Click Allow pop-up
	  			logger.info("Launch appium permission access pop-up");
	  			System.out.println("Launch appium permission access pop-up");
	  			driver.findElement(By.xpath("//*[@resource-id='com.xiaomi.mipicks:id/ok_btn']")).click();
	  			TimeUnit.SECONDS.sleep(5);
	  	  		
	  		}
	  		catch (Exception e) {
	            e.printStackTrace();
	            logger.info("No permission access pop-up found");
	        }
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		//Launching settings application and set external storage as storage option for video recording.
  			logger.info("Launching settings application and set external storage as storage option for video recording.");
  			System.out.println("Launching settings application and set external storage as storage option for video recording.");
  			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
	  		TimeUnit.SECONDS.sleep(6);
	  		
	  		//Select About phone
	  		logger.info("Select About phone");
	  		System.out.println("Select About phone");
  	  		driver.findElement(By.xpath("//*[@text='About phone']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		//Select storage option
  	  		logger.info("Select storage option");
  	  		System.out.println("Select storage option");
  	  		driver.findElement(By.xpath("//*[@text='Storage']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		//Swipe and select storage settings
  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
  				         ".scrollIntoView(new UiSelector().text(\"Storage settings\"))"));
  	  		//Select storage settings
  	  		logger.info("Select storage settings");
  	  		System.out.println("Select storage settings");
  	  		driver.findElement(By.xpath("//*[@text='Storage settings']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		//Select camera option
  	  		logger.info("Select camera option");
  	  		System.out.println("Select camera option");
  	  		driver.findElement(By.xpath("//*[@text='Camera']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		//select storage option as external storage
  	  		logger.info("Select storage as external storage");
  	  		System.out.println("Select storage as external storage");
  	  		driver.findElement(By.xpath("//*[@text='External storage']")).click();
  	  		TimeUnit.SECONDS.sleep(3);
  	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(5);
  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  				TimeUnit.SECONDS.sleep(5);
  			
  				try {
  			//Launch Camera application for rear camera video recording.
  				logger.info("Launch Camera application for rear camera video recording");
  				System.out.println("Launch Camera application for rear camera video recording");
  			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
  			TimeUnit.SECONDS.sleep(6);
  		
		//If location permission pop-up exists select deny  option
		try 
		{ 
			//Click Deny Option
			driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		//Do you want to deny? click ok
	  		driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
	  		TimeUnit.SECONDS.sleep(3);		
		} 
		catch(Exception exp)
		{ 
			logger.info("No location permission access pop-up found: "+exp); 
			
		}
		
		//Swith to video tab
		logger.info("Switch to video tab");
		System.out.println("Switch to video tab");
		driver.findElement(By.xpath("//*[@text='Video']")).click();	
		TimeUnit.SECONDS.sleep(3);
		//Select settings option to select resolution
		logger.info("Select settings option to select resolution");
		System.out.println("Select settings option to select resolution");
		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
		TimeUnit.SECONDS.sleep(3);
	//Select first highest resolution 4Kfps.
		logger.info("Select first video resolution 4K fps");
		System.out.println("Select first video resolution 4K fps");
	driver.findElement(By.xpath("//*[@bounds='[777,162][978,255]']")).click();
	TimeUnit.SECONDS.sleep(3);
	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(5);
		// Load properties file for video recording duration
	  		Properties prop = new Properties();
		  	prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationRearExt = prop.getProperty("recordingDurationRearExt");  
		  		System.out.println("recordingDurationRearExt = "+ recordingDurationRearExt + "Sec");
		  		int recordingDurationRearExtInt=Integer.parseInt(recordingDurationRearExt);	
		  		// Click Start video recording for specified duration time
		  		logger.info("Start video recording for specified duration time");
		  		System.out.println("Start video recording for specified duration time");
		  		MobileElement StartRecording = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StartRecording.click();
		  			
		  		TimeUnit.SECONDS.sleep(recordingDurationRearExtInt);
		  		//Stop video recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StopRecording.click();
		  		//click Back to settings option
		  		logger.info("click setting option to select second highest video resolution");
		  		System.out.println("click setting option to select second highest video resolution");
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
				TimeUnit.SECONDS.sleep(3);
				//Select Video Resolution FHD 1080 fps
				logger.info("Select second video resolution FHD 1080fps");
		  		System.out.println("Select second video resolution FHD 1080fps");
		  		driver.findElement(By.xpath("//*[@bounds='[552,162][753,255]']")).click();
		  		TimeUnit.SECONDS.sleep(3);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				// Load properties file
		  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationRearExt1 = prop.getProperty("recordingDurationRearExt1");  
		  		System.out.println("recordingDurationRearExt1 = "+ recordingDurationRearExt1 +"Sec");
		  		int recordingDurationRearExt1Int=Integer.parseInt(recordingDurationRearExt1);
		  		//Start recording
		  		logger.info("Start Recording second resolution video for specified duration time");
		  		System.out.println("Start Recording second resolution video time");
		  		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StartRecording1.click();
		  			
		  		TimeUnit.SECONDS.sleep(recordingDurationRearExt1Int);
		  		//Stop recording
		  		logger.info("Stop recording second resolution video ");
		  		
		  		MobileElement StopRecording1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StopRecording1.click();
		  		logger.info("Stop Recording");
		  		System.out.println("Stop Recording");
		  		//click setting option to select third highest video resolution
		  		logger.info("click setting option to select third highest video resolution");
		  		System.out.println("click setting option to select third highest video resolution");
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
				TimeUnit.SECONDS.sleep(3);
				//Select Video Resolution HD 720 fps
				logger.info("Select Third video resolution HD 720fps");
		  		System.out.println("Select third video resolution HD 720fps");
		  		driver.findElement(By.xpath("//*[@bounds='[327,162][528,255]']")).click();
		  		TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
		  	// Load properties file
		  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationRearExt2 = prop.getProperty("recordingDurationRearExt2");  
		  		System.out.println("recordingDurationRearExt2 = "+ recordingDurationRearExt2 + "Sec");
		  		int recordingDurationRearExt2Int=Integer.parseInt(recordingDurationRearExt2);
		  		//Start recording
		  		logger.info("Start Recording Third resolution video for specified duration time");
		  		System.out.println("Start Recording Third resolution video time");
		  		MobileElement StartRecording2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  	
		  		StartRecording2.click()	;
		  		TimeUnit.SECONDS.sleep(recordingDurationRearExt2Int);
		  		//Stop recording
		  		logger.info("Stop Recording");
		  		System.out.println("Stop Recording");
		  	MobileElement StopRecording2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StopRecording2.click();
		  		;
		  		
		  		//Select 4th Resolution
		  		logger.info("click setting option to select third Fourth video resolution");
		  		System.out.println("click setting option to select Fourth highest video resolution");
		  		driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/top_config_12']")).click();	
				TimeUnit.SECONDS.sleep(3);
			//Click on Video Resolution HD fps
				logger.info("Select Fourth video resolution HD fps");
		  		System.out.println("Select Fourth video resolution HD fps");
			driver.findElement(By.xpath("//*[@bounds='[102,162][303,255]']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
		  	
		  		// Load properties file
		  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationRearExt3 = prop.getProperty("recordingDurationRearExt3");  
		  		System.out.println("recordingDurationRearExt3 = "+ recordingDurationRearExt3 +"Sec");
		  		int recordingDurationRearExt3Int=Integer.parseInt(recordingDurationRearExt3);	
		  		//Start recording
		  		logger.info("Start Recording Fourth resolution video for specified duration time");
		  		System.out.println("Start Recording Fourth resolution video time");
		  		MobileElement StartRecording3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StartRecording3.click();
		  			
		  		TimeUnit.SECONDS.sleep(recordingDurationRearExt3Int);
		  		//Stop recording
		  		logger.info("Stop Recording");
		  		System.out.println("Stop Recording");
		  		MobileElement StopRecording3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shutter button\"]"));
		  		StopRecording3.click();
		  		logger.info("Stop Recording");
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		logger.info("Pass: Rear video recording is successfull");
	  		System.out.println("Pass: Rear video recording is successfull");
	  		
	  		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	  		
			logger.info("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
	  		System.out.println("Calling RecordedVideoPlayback() for Playing Highest record video, fast forward video play back scenario");
	  		RecordedVideoPlayback();
			
	  		}
	  		catch (Exception e) {
		            logger.info("Fail: Test10 Fail for Rear camera video recording ");
		            logger.info("Final Message: Fail Test10 Fail for Rear camera video recording");
		          System.out.println("Fail: Test10 Fail for Rear camera video recording ");
		        System.out.println("Final Message: Fail Test10 Fail for Rear camera video recording");
		        }
	  	}
	  		//Launch file manager application,sort highest resolutio recorded video, playback video file, fast forward video file and pause.
	  		public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  	//Launch File Manager for playing highest resolution recorded video from USD, fast forward and pause scenario
	  		logger.info("Launch File Manager for playing highest resolution recorded video from USD, fast forward and pause scenario");
	  		System.out.println("Launch File Manager for playing highest resolution recorded video from USD, fast forward and pause scenario");
	  		((StartsActivity) driver).startActivity(new Activity("com.mi.android.globalFileexplorer", "com.android.fileexplorer.FileExplorerTabActivity"));
		  		TimeUnit.SECONDS.sleep(5);
		  	//If file manager permission request access pop-up exists  accept allow permission
		  		try
		  		{
		  			driver.findElement(By.xpath("//*[@id='com.mi.android.globalFileexplorer:id/confirm_btn']")).click();
		  			TimeUnit.SECONDS.sleep(5);
		  	  		logger.info("Click Accept & continue");
		  	  		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		  	  		TimeUnit.SECONDS.sleep(5);
		  
		  		}
		  		catch (Exception e) {
		            e.printStackTrace();
		            
		        }
		  		//Select Storage button
		  		logger.info("Select Storage button");
		  		System.out.println("Select Storage button");
		  		MobileElement StorageButton = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Storage\"]"));
		  		StorageButton.click();
		  		TimeUnit.SECONDS.sleep(5);
		  		//Switching to USD card
		  		//MobileElement SwitchStorage = driver.findElement(By.xpath("//*[@text='Tap to switch between internal storage and SD card']")); 
		  //		SwitchStorage.click();
		  		
		  		MobileElement SwitchStorage1 = driver.findElement(By.xpath("//*[@resource-id='com.mi.android.globalFileexplorer:id/volume_switch']")); 
	  	  		SwitchStorage1.click();
		  		
				TimeUnit.SECONDS.sleep(3);
				//Select External  Storage
				logger.info("Select External storage");
				System.out.println("Select External storage");
				MobileElement SelectUSD = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[2]/android.widget.ImageView[1]"));
				SelectUSD.click();
		  		TimeUnit.SECONDS.sleep(5);
		  				
				logger.info("Click on DCIM Folder");
				System.out.println("Click on DCIM Folder");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
				TimeUnit.SECONDS.sleep(5);
		  		
				//Search For Camera Folder
				logger.info("Click On Camera Folder");
				System.out.println("Click On Camera Folder");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Select More options
				logger.info("Select More options");
				System.out.println("Select More options");
				MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);
				MoreOptions.click();
				logger.info("Clik More options");
	  	  		
				//Select Sort BY
				logger.info("Select Sort BY");
				System.out.println("Select Sort BY");
				MobileElement Sortby = driver.findElement(By.xpath("//*[@text='Sort by']")); 
				Sortby.click();
	  			TimeUnit.SECONDS.sleep(3);
	  			//select largest file option
	  			logger.info("Select Largest option");
	  			System.out.println("Select Largest option");
	  			MobileElement Largest = driver.findElement(By.xpath("//*[@text='Bigger to smaller']")); 
	  			Largest.click();
	  			TimeUnit.SECONDS.sleep(3);
	  			
	  			//long press and Hold RAW folder and delete
	  		 	MobileElement Folder =	driver.findElement(By.xpath("//*[@text='Raw']"));
	  			TouchAction touchAction3=new TouchAction(driver);
	  			touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
	  			TimeUnit.SECONDS.sleep(10);
	  			
	  			
	  			MobileElement Delete = driver.findElement(By.xpath("//*[@text='Delete']")); 
	  			Delete.click();
	  			TimeUnit.SECONDS.sleep(3);
	  			
	  			
	  			MobileElement ConfirmDelete = driver.findElement(By.xpath("//*[@text='Delete']")); 
	  			ConfirmDelete.click();
	  			TimeUnit.SECONDS.sleep(3);
	  	  		
	  			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  	  		
	  	  	
	  	  		//Re-launch files application
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  		TimeUnit.SECONDS.sleep(5);
  	  		logger.info("Launching file manager application");
  	  		
  	  		
  	  		
			  	  	MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
					         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			  		
			  	//Select External Storage	
			  	  	logger.info("Select External storage");
			  	  System.out.println("Select External storage");
					MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select External Storage");
			Ext.click();
			
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
			         ".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
		
			
				//Select DCIM folder
					MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
					DCIM.click();
					TimeUnit.SECONDS.sleep(3);
			  		//Select camera folder
					MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
					Camera.click();
					TimeUnit.SECONDS.sleep(3);
					
					try {
					//Select more options
					MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select External Storage");
				MoreOptions1.click();
			  		
			  			
			  		
			  	//Select Sort By 
				logger.info("Select more options and sort by largest file first");
				System.out.println("Select more options and sort by largest file first");
				MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
				Sortby1.click();
					TimeUnit.SECONDS.sleep(3);
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
		  		TimeUnit.SECONDS.sleep(20);
	  		  	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  				TimeUnit.SECONDS.sleep(2);
  				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
  				TimeUnit.SECONDS.sleep(2);
  				TimeUnit.SECONDS.sleep(2);
  				logger.info("Pass: Recorded Video play back and fast forward successfull ");
		  		//Calling copiedvideosPlayBack() for playing copied video file from Test1 folder
		  		System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
		  		logger.info("Pass: Recorded Video play back and fast forward successfull ");
		  		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
					logger.info("Calling copiedvideosPlayBack() for playing copied video file from Test1 folder");
				
				CopiedvideosPlayBack();
					
					}
					
					catch (Exception e) {

						logger.info("Fail: Test10 Fail for RecordedVideoPlayBack()");
						logger.info("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
						System.out.println("Fail: Test10 Fail for RecordedVideoPlayBack()");
						System.out.println("Final Message: Fail Test10 Fail for RecordedVideoPlayBAck()");
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
		  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		logger.info("Launching file manager application");
	  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
						         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
				  		
				  	//Select External Storage	
	  	  		logger.info("Select external storage");
	  	  	System.out.println("Select external storage");
						MobileElement Ext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView"));
				TimeUnit.SECONDS.sleep(5);
				logger.info("Select External Storage");
				Ext.click();
		  	//Select Test1 folder
				logger.info("Select Test1 folder");
				System.out.println("Select Test1 folder");
				MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
	  			Test1.click();
	  			TimeUnit.SECONDS.sleep(3);
	  	  		//Select TestFile folder
	  			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
	  			TestFile.click();
	  			TimeUnit.SECONDS.sleep(3);
	  			
	  			//Select OneGB folder
	  			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
	  			oneGB.click();
	  			TimeUnit.SECONDS.sleep(3);
	  			//Select Video folder
	  			logger.info("Select video folder");
	  			System.out.println("Select video folder");
	  			MobileElement Video = driver.findElement(By.xpath("//*[@text='Video']")); 
	  			Video.click();
	  			TimeUnit.SECONDS.sleep(3);
	  			
	  			//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
	  			System.out.println("System.out.println(\"Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback\");");
	  			logger.info("System.out.println(\"Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback\");");
	  			MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
  				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
  				         ".scrollIntoView(new UiSelector().text(\"LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4\"))"));
	  			try {
	  			driver.findElement(By.xpath("//*[@text='LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4']")).click();
  		  		logger.info("Started video playback");
  		  		TimeUnit.SECONDS.sleep(20);
  		  		
  		  		//Tap Somewhere on Screen for contents to visible on Screen
	  		  	logger.info("Tap Somewhere on Screen for contents to visible on Screen");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
	  		  	
	  		  	//Clikc Fast forward button
	  		  logger.info("Click fast forward button for 10 seconds video forward");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
	  		TimeUnit.SECONDS.sleep(20);
  		  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				logger.info("Pass: 4K Video play back and fast forward is successful ");
				TimeUnit.SECONDS.sleep(3);
			  			}
			  			
			  			catch(Exception exp)
			  			{ 
			  				logger.info("Fail:Test10 Fail for 4K video play back "+exp); 
			  				System.out.println("Fail:Test10 Fail for 4K video play back: "+exp); 
			  				logger.info("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
			  				System.out.println("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
			  				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			  				
			  			}
			
	  			try {
		//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
		System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
		logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
		driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
  		  		logger.info("Started video playback");
  		  		TimeUnit.SECONDS.sleep(20);
  		  		
  		  		//Tap Somewhere on Screen for contents to visible on Screen
	  		  	logger.info("Tap Somewhere on Screen for contents to visible on Screen");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
	  		  	
	  		  	//Clikc Fast forward button
	  		  logger.info("Click fast forward button for 10 seconds video forward");
	  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
	  		TimeUnit.SECONDS.sleep(20);
  		  		
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
		  				logger.info("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos "+exp); 
		  				System.out.println("Fail:Test10 Fail for FHD video play back Host Doesn't support .webm videos: "+exp); 
		  				logger.info("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
		  				System.out.println("Final Message: Fail Test10 Fail for CopiedvideosPlayBack()");
		  				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		  				
		  			}
			  		
			  	logger.info("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
			  System.out.println("Final message: Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
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
	}