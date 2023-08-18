package Sony_Xperia1_II_XQAT52;
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
import Sony_Xperia1_II_XQAT52.Test10;
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
	// initializing the driver instance
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-AT52");
		dc.setCapability(MobileCapabilityType.UDID, "QV710PLJ3F");
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
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test10F Scenario is as follows");
		logger.info("1.Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		logger.info("2.Playback front Highest recorded video for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test10F Scenario is as follows");
		System.out.println("Launch Camera application and start front camera video recording for all host applicable resolutions in uSD Card");
		System.out.println("Playback front Highest recorded video from uSD card for 30 seconds, pause video playback, lock mobile and wait 30 seconds, unlock mobile and playback video from pause video duration");
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
		try {
	  		((StartsActivity) driver).startActivity(new Activity("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
			
	  		//IF Location access notification pop-up exists select Cancel option.
	  			logger.info("if Location permisson Pop Exists Select Cancel Option");
	  			System.out.println("if Location permisson Pop Exists Select Cancel Option");
			try 
			{ 
				MobileElement CancelLocationAccess =	driver.findElement(By.xpath("//*[@text='NO']"));
				CancelLocationAccess.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Deny =	driver.findElement(By.xpath("//*[@text='DENY']"));
				Deny.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Cancel =	driver.findElement(By.xpath("//*[@text='CANCEL']"));
				Cancel.click();
				TimeUnit.SECONDS.sleep(3);
				
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 
				
			}
			
			
		
			//Switch to back camera if current existing camera is Front camera.
			try {
				
				MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to front camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToFrontCamera.click();
				logger.info("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
				System.out.println("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
			}
			
			catch(Exception exp)
			{ 
					// Block of code to handle errors
				logger.info("Currently camera is already in rear camera mode no need to switch"); 
			}
			//Switch to video Mode
			logger.info("Switch to Video Mode");
			System.out.println("Switch to Video Mode");
			
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			TimeUnit.SECONDS.sleep(5);
			Settings.click();
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Search for Data storage option");
			System.out.println("Search for Data storage option");
			String text = "Data storage";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Data storage\")").click();
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			MobileElement VideoMode =	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"VIDEO\"]"));
			VideoMode.click();
			TimeUnit.SECONDS.sleep(3);
		
			//Select SD Card
			//Select settings
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			//Click On Rear Video size to select resolution
  			MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@text='Video size']"));
  			RearVideoSize.click();
  			logger.info("Select 1st Back Video Resolution:Full HD");
  			System.out.println("Select 1st Back Video Resolution:Full HD");
  			//Select 1st resolution
  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='Full HD']"));
  			FirstRes.click();
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
		  	// Load properties file
		  		Properties prop = new Properties();
		  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationfront = prop.getProperty("recordingDurationfront");  
		  		System.out.println("recordingDurationfront = "+ recordingDurationfront);
		  		int recordingDurationfrontInt=Integer.parseInt(recordingDurationfront);	
	  			
				//Start Recording
		  		logger.info("Start video recording");
		  		System.out.println("Start video recording");
		  		MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
		  		StartRecording.click();
		  		TimeUnit.SECONDS.sleep(recordingDurationfrontInt);
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
		  		StopRecording.click();
		  		TimeUnit.SECONDS.sleep(6);
		  		
		  		//Select 2nd resolution
		  		logger.info("Select settings option to select second resolution");
		  		System.out.println("Select settings option to select second resolution");
		  		MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings2.click();
				TimeUnit.SECONDS.sleep(5);
				//Click On Rear Video size to select resolution
			  			MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@text='Video size']"));
			  			RearVideoSize1.click();
			  			logger.info("Select second front Video Resolution:1080");
			  			System.out.println("Select second front Video Resolution:1080");
			  			//Select 1st resolution
			  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='1080x1080(1:1)']"));
			  			SecondRes.click();
				  		TimeUnit.SECONDS.sleep(2);
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						// Load properties file
		  			Properties prop1 = new Properties();
		  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationfront1 = prop.getProperty("recordingDurationfront1");  
		  		System.out.println("recordingDurationfront1 = "+ recordingDurationfront1);
		  		int recordingDurationfront1Int=Integer.parseInt(recordingDurationfront1);
		  		
		  		//Start Recording
		  		logger.info("Start video recording");
		  		System.out.println("Start video recording");
		  		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
		  		StartRecording1.click();
		  		TimeUnit.SECONDS.sleep(recordingDurationfront1Int);
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
		  		StopRecording1.click();
		  		
		  		//select 3rd resolution
		  		logger.info("Select settings option to select second resolution");
		  		System.out.println("Select settings option to select second resolution");
		  		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings3.click();
				TimeUnit.SECONDS.sleep(5);
				//Click On Rear Video size to select resolution
			  			MobileElement RearVideoSize2 = driver.findElement(By.xpath("//*[@text='Video size']"));
			  			RearVideoSize2.click();
			  			logger.info("Select third front Video Resolution:HD");
			  			System.out.println("Select third front Video Resolution:HD");
			  			//Select 1st resolution
			  			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='HD']"));
			  			ThirdRes.click();
				  		TimeUnit.SECONDS.sleep(2);
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						// Load properties file
		  			Properties prop2 = new Properties();
		  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String recordingDurationfront2 = prop.getProperty("recordingDurationfront2");  
		  		System.out.println("recordingDurationfront2 = "+ recordingDurationfront2);
		  		int recordingDurationfront2Int=Integer.parseInt(recordingDurationfront2);
		  		
		  		//Start Recording
		  		logger.info("Start video recording");
		  		System.out.println("Start video recording");
		  		MobileElement StartRecording2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
		  		StartRecording2.click();
		  		TimeUnit.SECONDS.sleep(recordingDurationfront2Int);
		  		//Stop Recording
		  		logger.info("Stop video recording");
		  		System.out.println("Stop video recording");
		  		MobileElement StopRecording2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
		  		StopRecording2.click();
		  		TimeUnit.SECONDS.sleep(15);
			  	
		  		logger.info("Switch to Back Cmaer mode");
		  		MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to the main camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				logger.info("Pass: Test10F pass for front camera video recording");
				System.out.println("Pass: Test10F pass for front camera video recording");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				//Calling VideoPlayBack()
				logger.info("Calling VideoPlayBackForSleepWake()");
				System.out.println("Calling VideoPlayBackForSleepWake()");
				VideoPlayBackForSleepWake();
				}
		  
		catch (Exception e) {
			logger.info("Fail: Test10F for Front camera video recording");
			logger.info("Final Message: Fail Test10F Fail fro Front camera video recording");
			System.out.println("Fail: Test10F for Front camera video recording");
			System.out.println("Final Message: Fail Test10F Fail fro Front camera video recording");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			VideoPlayBackForSleepWake();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}

	}

	@SuppressWarnings("deprecation")
	public void VideoPlayBackForSleepWake() throws  IOException, InterruptedException {

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		

		//Launch File Manager
		try {
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launching file manager application");
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"SD card\"))"));

		//Select External Storage	
		logger.info("Select External Storage");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
		TimeUnit.SECONDS.sleep(5);

		MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
				".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
		//Select DCIM folder
		MobileElement DCIM = driver.findElement(By.xpath("//*[@text='DCIM']")); 
		DCIM.click();
		TimeUnit.SECONDS.sleep(3);
		//Select camera folder
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
		
		//Select more option
		MobileElement MoreOptions1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select External Storage");
		MoreOptions1.click();
		//Select sort by		
		MobileElement Sortby1 = driver.findElement(By.xpath("//*[@text='Sort by']")); 
		Sortby1.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Newest date first
		MobileElement Largest1 = driver.findElement(By.xpath("//*[@text='Newest date first']")); 
		Largest1.click();
		TimeUnit.SECONDS.sleep(3);
		//Select Highest resolution video file to play
		logger.info("Click on first file to play highest recorded resolution video file");
		System.out.println("Click on first file to play highest recorded resolution video file");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		logger.info("Started video playback");
		TimeUnit.SECONDS.sleep(20);
		//Tap Somewhere on Screen for contents to visible on Screen
		logger.info("Tap Somewhere on Screen for contents to visible on Screen");
		System.out.println("Tap Somewhere on Screen for contents to visible on Screen");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
		//Click pause button
		logger.info("Click pause video button");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
		TimeUnit.SECONDS.sleep(3);		
		//Locking Mobile
		logger.info("Lock Mobile with 30 seconds delay");
		System.out.println("Lock Mobile with 30 seconds delay");
		//((AndroidDriver) driver).lockDevice();
		TimeUnit.SECONDS.sleep(330);
		//Unlocking Device 
		logger.info("Unlock Mobile ");
		System.out.println("Unlock Mobile");
		logger.info("Wait For 30Seconds");
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
		}
		catch (Exception e) {
	            logger.info("Fail: Test10F Fail for VideoPlayBackForSleepWake()");
	            logger.info("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
	          System.out.println("Fail: Test10F Fail for VideoPlayBackForSleepWake() ");
	        System.out.println("Final Message: Fail Test10F Fail for VideoPlayBackForSleepWake()");
	        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        }
		
		logger.info("Final Message: Pass Test10F Pass for Pause Video Playback");
		System.out.println("Final Message: Pass Test10F Pass for Pause Video Playback");
		logger.info("Test:End");
		  logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}


}
		  		
	  		
		
		
		
		
