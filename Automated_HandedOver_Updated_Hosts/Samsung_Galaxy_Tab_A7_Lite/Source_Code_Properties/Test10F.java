package Samsung_Galaxy_Tab_A7_Lite;

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
import Samsung_Galaxy_Tab_A7_Lite.Test10;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
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

public class Test10F
{
	// initializing the driver instance and declared desired capabilities
    private static final String Pass = null;
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Tab A7 Lite");
		dc.setCapability(MobileCapabilityType.UDID, "R9PR80KNR8K");
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
		FileHandler fileHandler = new FileHandler("status_log_Test10F.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test:Start");  
        System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10F Scenario is as follows");
		logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback front Highest recorded video for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F Scenario is as follows");
		System.out.println("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("2.Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		TimeUnit.SECONDS.sleep(5);

		//Clear Recenet Apps
		((LocksDevice) driver).unlockDevice();
		//Launch Home screen and clear recent Apps
		logger.info("Launch Home screen and clear recent Apps");
		System.out.print("Launch Home screen and clear recent Apps");
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

		//Launch Camera Application for front camera video recording
		try {
			
			logger.info("Launch Camera Application for front camera video recording");
			System.out.println("Launch Camera Application for front camera video recording");
  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
  		
  		//If Change to SD Card notification pop-up exists select Cancel Option
  		logger.info("If change to uSD card pop-up exists select Cancel");
  		System.out.println("If change to uSD card pop-up exists select Cancel");
  		try 
  		{ 
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
  			TimeUnit.SECONDS.sleep(2);
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
  			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Cancel\")").click();
  			TimeUnit.SECONDS.sleep(2);
  		} 
  		catch(Exception exp)
  		{ 
  				// Block of code to handle errors
  			logger.info("Location access pop-up  not found : "+exp); 
  		}
  	//mention default resolution
  		logger.info("Test10F_FCam_res: 0 resolutions supported");
		System.out.println("Test10F_FCam_res: 0 resolutions supported");
		logger.info("Test10F, we are using only default resolution for capturing videos,unable select resolution unable select resolution using Appium inspector,because within sec resolution tab will come back.");
		System.out.println("Test10F, we are using only default resolution for capturing videos,unable select resolution unable select resolution using Appium inspector,because within sec resolution tab will come back.");
  		

		logger.info("Switch to video mode");
		System.out.println("Switch to video mode");
		// click on video tab
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@text='VIDEO']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		logger.info("Switch to front camera mode");
  		System.out.println("Switch to front camera mode");
  		try {
  		//MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to front camera\"]"));
  			driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/front_back_switcher']")).click();
  			TimeUnit.SECONDS.sleep(2);
		//SwitchToFrontCamera.click();
  		}
  		catch(Exception exp)
  		{ 
  				// Block of code to handle errors
  			logger.info("Curren existing camera is front camera mode no switch required : "+exp); 
  			System.out.println("Curren existing camera is front camera mode no switch required : "+exp); 
  		}
		//Click On Settings
		//find element by xpath
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/setting_btn']"));
		TimeUnit.SECONDS.sleep(5);
		Settings.click();
		//Swipe Up and Search for Storage Option and Click 
		logger.info("Swipe up and Select Storage location");
		System.out.println("Swipe up and Select Storage location");
		String text = "Storage location";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
		TimeUnit.SECONDS.sleep(5);
		

		//Select SD Card
		logger.info("Select uSD card as Storage option");
		System.out.println("Select uSD card as Storage option");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Click Press Back
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Click On Rear Video size to select resolution
		logger.info("Click on front video size and select resolution");
		System.out.println("Click on front video size and select resolution");
		/*MobileElement FrontVideoResolution = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/ratio_switcher']"));
		FrontVideoResolution.click();
		
		//Select 1st resolution
		logger.info("Select 1st Front Video Resolution:FRONT_CAMCORDER_RESOLUTION_FHD_30");
		System.out.println("Select 1st Front Video Resolution:FRONT_CAMCORDER_RESOLUTION_FHD_30");
		MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[493,97][574,178]']"));
		FirstRes.click();
		TimeUnit.SECONDS.sleep(2);*/

		Properties prop = new Properties();
		// Load properties file
		prop.load(Test10F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String recordingDurationfront = prop.getProperty("recordingDurationfront");  
		System.out.println("recordingDurationfront = "+ recordingDurationfront + "Sec");
		int recordingDurationfrontInt=Integer.parseInt(recordingDurationfront);	

		//Start Recording
		logger.info("Start front video recording");
		System.out.println("Start front video recodring");
		MobileElement StartRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_button']"));
  		StartRecording.click();
		TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
		

		//Stop Recording
		MobileElement StopRecording = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_button']"));
  		StopRecording.click();
		logger.info("Stop Recording");
		System.out.println("Stop Recording");
		TimeUnit.SECONDS.sleep(2);

		//Click On Rear Video size to select resolution
		/*logger.info("Click front video size and select second resolution");
		System.out.println("Click front video size and select second resolution");
		MobileElement FrontVideoResolution1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/ratio_switcher']"));
		FrontVideoResolution1.click();
		//Select second  resolution
		logger.info("Select second resolution");
		System.out.println("Select second resolution");
		MobileElement SecRes = driver.findElement(By.xpath("//*[@bounds='[626,97][707,178]']"));
		SecRes.click();
		TimeUnit.SECONDS.sleep(2);

		// Load properties file
		prop.load(Test10F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		TimeUnit.SECONDS.sleep(5);
		String recordingDurationfront1 = prop.getProperty("recordingDurationfront1");  
		System.out.println("recordingDurationfront1 = "+ recordingDurationfront1);
		int recordingDurationfront1Int=Integer.parseInt(recordingDurationfront1);	

		//Start Recording
		logger.info("Start front video recording");
		System.out.println("Start front video recodring");
		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_button']"));
		StartRecording1.click();
		TimeUnit.SECONDS.sleep(recordingDurationfront1Int);
		logger.info("Recording Video for 2Minutes of Duration");

		//Stop Recording
		MobileElement StopRecording1 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_button']"));
		StopRecording1.click();
		logger.info("Stop Recording");
		TimeUnit.SECONDS.sleep(6);
		
		//Click On Rear Video size to select resolution
				logger.info("Click on front video size and select resolution");
				System.out.println("Click on front video size and select resolution");
				MobileElement FrontVideoResolution2 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/ratio_switcher']"));
				FrontVideoResolution2.click();
				//Select 1st resolution
				logger.info("Select 1st Front Video Resolution:FRONT_CAMCORDER_RESOLUTION_FHD_30");
				System.out.println("Select 1st Front Video Resolution:FRONT_CAMCORDER_RESOLUTION_FHD_30");
				MobileElement ThirdRes = driver.findElement(By.xpath("//*[@bounds='[493,97][574,178]']"));
				ThirdRes.click();
				TimeUnit.SECONDS.sleep(2);

				Properties prop2 = new Properties();
				// Load properties file
				prop.load(Test10F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
				TimeUnit.SECONDS.sleep(5);
				String recordingDurationfront2 = prop.getProperty("recordingDurationfront2");  
				System.out.println("recordingDurationfront2 = "+ recordingDurationfront2);
				int recordingDurationfront2Int=Integer.parseInt(recordingDurationfront2);	

				//Start Recording
				logger.info("Start front video recording");
				System.out.println("Start front video recodring");
				MobileElement StartRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_button']"));
		  		StartRecording2.click();
				TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
				

				//Stop Recording
				MobileElement StopRecording2 = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/video_button']"));
		  		StopRecording2.click();
				logger.info("Stop Recording");
				TimeUnit.SECONDS.sleep(2);*/
				
		logger.info("Switch");
		driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/front_back_switcher']")).click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  	//launch file manager application and verify recorded video files in uSD card
			logger.info("Launch File Manager Application to verify captured videos");
			System.out.println("Launch File Manager Application to verify captured videos");
			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
			//Select SD Card
	  		logger.info("Click On SD Card");
	  		System.out.println("Click On SD Card");
	  		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		//Search For DCIM Folder 
	  		logger.info("Select DCIM Folder");
	  		System.out.println("Select DCIM Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"DCIM\")").click();
			TimeUnit.SECONDS.sleep(5);
	  		
			//Search For Camera Folder
			logger.info("Select Camera Folder");
			System.out.println("Select Camera Folder");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Camera\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			try {
			//Click More Options
				logger.info("Click On More Options ");
				System.out.println("Click On More Options ");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions.click();
			}
			
			catch (Exception e) {
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				MoreOptions1.click();
	            e.printStackTrace();
	        }
			
			//Click Edit 
			logger.info("Click On Edit");
			System.out.println("Click On Edit");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Edit\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='All']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);
		
				//Select All
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='1 selected']"));
				TimeUnit.SECONDS.sleep(5);
				TotalFiles.click();
				logger.info("Test10F_Fcam_video: 1 videos captured successfully");
				System.out.println("Test10F_Fcam_video: 1 videos captured successfully");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");	 
		 
		 
		 
		 //Calling VideoPlayBack()
		logger.info("Calling VideoPlayBackForSleepWake()");
		System.out.println("Calling VideoPlayBackForSleepWake()");
		VideoPlayBackForSleepWake();
		}
		
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Fail: Test10F Fail for front camera video recording ");
			System.out.println("Fail: Test10F Fail for front camera video recording ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			
			//Calling DataMoveOperation
			logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
			System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
		     DataMoveOperation();
			logger.info("Final Message: Fail Test10F Fail for front camera video recording");
			System.out.println("Final Message: Fail Test10F Fail for front camera video recording");
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
		}

	}


	@SuppressWarnings("deprecation")
	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException {

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Clearing Recent Apps
		logger.info("Clearing Recent Apps");
		System.out.println("Clearing Recent Apps");
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
			//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
			logger.info("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
			System.out.println("Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launching file manager application");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select External Storage");
		System.out.println("Select External Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);

		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
		//Select DCIM folder
		logger.info("Select DCIM Folder");
		System.out.println("Select DCIM Folder");
		MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
		DCIM.click();
		TimeUnit.SECONDS.sleep(3);
		//Select camera folder
		logger.info("Select Camera");
		System.out.println("Select camera");
		MobileElement Camera = driver.findElement(By.xpath("//*[@text='Camera']")); 
		Camera.click();
		TimeUnit.SECONDS.sleep(3);
		
		//Select more option
		logger.info("select more options");
		System.out.println("select more options");
		MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		TimeUnit.SECONDS.sleep(5);
		MoreOptions1.click();
		
		//Select sort by
		logger.info("Select Sort BY");
		System.out.println("Select Sort BY");
		MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
		Sortby1.click();
		TimeUnit.SECONDS.sleep(3);
		
		//Select Newest date First
				logger.info("Select Newest date first");
				System.out.println("Select Newest date first"); 
		MobileElement Newest = driver.findElement(By.xpath("//*[@text='Newest date first']")); 
		Newest.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Highest resolution video file to play
		logger.info("Click on first file to play highest recorded resolution video file");
		System.out.println("Click on first file to play highest recorded resolution video file");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		logger.info("Started video playback");
		System.out.println("Started video playback");
		TimeUnit.SECONDS.sleep(20);
		
		//Tap Somewhere on Screen for contents to visible on Screen
		logger.info("Tap Somewhere on Screen for contents to visible on Screen");
		System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
		
		//Click pause button
		logger.info("Click pause video button");
		System.out.println("Click pause video button");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
		TimeUnit.SECONDS.sleep(3);
		
		//Locking Mobile
		logger.info("Lock Mobile with 30 seconds delay");
		System.out.println("Lock Mobile with 30 seconds delay");
		//((AndroidDriver) driver).lockDevice();
		TimeUnit.SECONDS.sleep(180);
		//Unlocking Device 
		logger.info("Unlock Mobile ");
		System.out.println("Unlock Mobile");
		((LocksDevice) driver).unlockDevice();
		TimeUnit.SECONDS.sleep(5);
		
		//Playback video from pause video duration
		logger.info("Playback video from pause video duration");
		System.out.println("Playback video from pause video duration");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
		TimeUnit.SECONDS.sleep(30);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		logger.info("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
		System.out.println("Pass: Test10F Pass for Front video play back, Pause,Lock and Unlock Phone Play back from Pause duration Scenario");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//Calling DataMoveOperation
		logger.info("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
		System.out.println("calling DatamoveOperation() to move front camera recorded videos files to Test10F folder");
		DataMoveOperation();
		
		if(Result == "Fail")
		{
			System.out.println("Final Message: Fail Test10 Fail for Data Move Operation");
			logger.info("Final Message: Fail Test10 Fail for Data Move Operation");
		}
		else {
			logger.info("Final Message: Pass Test10F Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
			System.out.println("Final Message: Pass Test10F Pass for front camera  video recording, Pause Video Playback scenario and data move operation scenario");
		}
		
	}
		catch (Exception e) {
			logger.info("Fail: Test10F Fail for VideoPlayBackForSleepWake()");
			System.out.println("Fail: Test10F Fail for VideoPlayBackForSleepWake() ");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	
			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
			DataMoveOperation();
			logger.info("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
			System.out.println("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

		logger.info("Test: End");
		System.out.println("Test: End");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
 	 
public void DataMoveOperation() throws  IOException, InterruptedException{	   
	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

	isPaused = true;

	//Launching  home screen
	((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	TimeUnit.SECONDS.sleep(5);

	try {
		//launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
		logger.info("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all back camera front camera videos create Test10 and cut paste all videos in BCFC_Cameravideos folder");
		System.out.println("launch file manager application select uSD card-->DCIM folder-->Camera folder-->Select all rear camera images create Test10 folder and cut paste all videos in BCFC_Cameravideos folder");


		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
 		TimeUnit.SECONDS.sleep(5);

		//Swipe and Select external storage
		logger.info("Swipe up to select uSD card");
		System.out.println("Swipe up to select uSD card");
		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));
		//Click External storage
		logger.info("Select SD card");
		System.out.println("Select SD card");
		MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='SD card']"));
		InternalStorage.click();
		TimeUnit.SECONDS.sleep(6);

		//Select DCIM Folder
		//Select DCIM Folder
		MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
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

		try {
			//Click More Options
				logger.info("Select More Options ");
				System.out.println("Select More Options ");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions.click();
			}
			
			catch (Exception e) {
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				MoreOptions1.click();
	            e.printStackTrace();
	        }
			
			//Click Edit 
			logger.info("Select Edit options");
			System.out.println("Select Edit options");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Edit\")").click();
			TimeUnit.SECONDS.sleep(5);
			//Click Select All
			logger.info("Click On Select All Options");
			System.out.println("Click On Select All Options");
			MobileElement SelectAll =	driver.findElement(By.xpath("//*[@text='All']"));
			SelectAll.click();
			TimeUnit.SECONDS.sleep(3);

		//Click  Move to Option
		logger.info("Select move to option");
		System.out.println("select move to option");
		MobileElement moveto =	driver.findElement(By.xpath("//*[@text='Move']"));
		moveto.click();
		TimeUnit.SECONDS.sleep(6);
		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		TimeUnit.SECONDS.sleep(2);

		//Click  Move to Option
		logger.info("Select uSD Card");
		System.out.println("select uSD Card");
		MobileElement uSD =	driver.findElement(By.xpath("//*[@text='SD card']"));
		uSD.click();
		TimeUnit.SECONDS.sleep(6);


		try {
			//Click More Options
				logger.info("Select More Options ");
				System.out.println("Select More Options ");
			MobileElement MoreOptions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options , New content available\"]"));
			TimeUnit.SECONDS.sleep(5);
			MoreOptions.click();
			}
			
			catch (Exception e) {
				MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
				MoreOptions1.click();
	            e.printStackTrace();
	        }

		
		//Click Create option
		logger.info("create folder");
		System.out.println("create folder");
		driver.findElement(By.xpath("//*[@text='Create folder']")).click();
		TimeUnit.SECONDS.sleep(2);
		
		//name the folder
		logger.info("Name folder as Test10F");
		System.out.println("Name folder as Test10F");
		driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).clear();
		driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).sendKeys("Test10F");
		TimeUnit.SECONDS.sleep(5);
		
		//Click Create option
		logger.info("click create");
		System.out.println("click create");
		driver.findElement(By.xpath("//*[@text='Create']")).click();
		TimeUnit.SECONDS.sleep(2);
		
		//Select DCIM Folder
		MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				".scrollIntoView(new UiSelector().text(\"Test10F\"))"));
		logger.info("Select Test10F  folder");
		System.out.println("Select Test10F  Folder");
		MobileElement Test10F =	driver.findElement(By.xpath("//*[@text='Test10F']"));
		Test10F .click();
		TimeUnit.SECONDS.sleep(3);

		//Click Create option
		logger.info("Move here");
		System.out.println("Move here");
		driver.findElement(By.xpath("//*[@text='Move here']")).click();
		TimeUnit.SECONDS.sleep(120);
		logger.info("Cut paste  video files operation completed successfully");
		System.out.println("Cut paste  video files operation completed successfully");
 		

		//logger.info("Pass: Test10 Data move of videos files operation completed successfully");
		//System.out.println("Pass: Test10 Data move of videos files operation completed successfully");
		//logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		//System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		
		Result = "Pass";
		
		
		if(Result == "Pass")
		{
			logger.info("Pass: Test10F  Pass for data move operation successfully");	
			System.out.println("Pass: Test10F  Pass for data move operation successfully");	
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	catch(Exception exp)
	{ 
		exp.printStackTrace();
		Result = "Fail";
		logger.info("Fail: Test10F  Fail for data move operation ");
		System.out.println("Fail: Test10F  Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
}
}
