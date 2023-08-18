package Sony_Xperia_10II_XQ_AU52;
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
import Sony_Xperia_10II_XQ_AU52.Test10;
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
	  private static String Result = null;
	// initializing the driver instance
	  AppiumDriver<MobileElement> driver;
	private boolean isPaused;
	  	@BeforeTest
		public void SetUp() throws MalformedURLException {
			// set desired capabilities
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-AU52");
			dc.setCapability(MobileCapabilityType.UDID, "QV720DJV3A");
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
		    	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		        logger.info("Test10 Scenario is as follows");
		        logger.info("1.Launch Camera application and start back camera video recording for all host applicable resolutions in uSD Card");
		        logger.info("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		        logger.info("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
				logger.info("Setting up the appium desired capabilities");
				System.out.println("Test10 Scenario is as follows");
		        System.out.println("1.Launch Camera application and start rear camera video recording for all host applicable resolutions in uSD Card");
		        System.out.println("2.Playback Highest resolution recorded video from USD Card, fast forward playback and pause video scenario ");
		        System.out.println("3.Playback copied videos from Test1 folder, fast forward and pause scenario");
		        System.out.println("4.Move recorded rear camera video files to Test10 folder");
				System.out.println("Setting up the appium desired capabilities");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				SetUp();
				String Result = "Fail";
		  		TimeUnit.SECONDS.sleep(5);
		  		
		  		//Launch Home screen application and clear recent apps
		  		logger.info("Clearing  Recent Apps");
		  		System.out.println("Clearing  Recent Apps");
		  		try {
		  			//Launch camera application
		  			logger.info("Launch camera application");
			  		System.out.println("Launch camera application");
		  		((StartsActivity) driver).startActivity(new Activity("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
		  		
		  		logger.info("Test10_Bcam_res: 6 resolutions supported");
				System.out.println("Test10_Bcam_res: 6 resolutions supported");
				
		  		//IF Location access notification pop-up exists select Cancel option.
		  			logger.info("if Location permisson Pop Exists Select Cancel Option");
		  			System.out.println("if Location permisson Pop Exists Select Cancel Option");
				try 
				{ 
					MobileElement CancelLocationAccess =	driver.findElement(By.xpath("//*[@text='NO']"));
					CancelLocationAccess.click();
					TimeUnit.SECONDS.sleep(3);
					MobileElement Deny =	driver.findElement(By.xpath("//*[@text='GOT IT']"));
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
					
					MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to the main camera\"]"));
					TimeUnit.SECONDS.sleep(2);
					SwitchToBackCamera.click();
					logger.info("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
					System.out.println("Switch To Back Camera Mode if current Exiting camera is Front camera Mode");
				}
				
				catch(Exception exp)
				{ 
						// Block of code to handle errors
					logger.info("Currently camera is already in rear camera mode no need to switch"); 
					System.out.println("Currently camera is already in rear camera mode no need to switch");
				}
				//Switch to video Mode
				logger.info("Switch to Video Mode");
				System.out.println("Switch to Video Mode");
				MobileElement VideoMode =	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"VIDEO\"]"));
				VideoMode.click();
				TimeUnit.SECONDS.sleep(3);
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
			
				//Select SD Card
				logger.info("Select SD as storage option");
				System.out.println("Select SD as storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				TimeUnit.SECONDS.sleep(5);
				try {
					MobileElement HighRes = driver.findElement(By.xpath("//*[@text='For stable 4K video recording, you must not change this setting unless you use a high-speed SD card (UHS Speed Class 1 or higher, or Speed Class 10 recommended).']"));
					HighRes.click();
		  			TimeUnit.SECONDS.sleep(3);
		  			MobileElement Ok = driver.findElement(By.xpath("//*[@text='OK']"));
		  			Ok.click();
			  		TimeUnit.SECONDS.sleep(10);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				
				//Select settings
			/*	logger.info("Select settings option");
				System.out.println("Select settigs option");
				MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings1.click();
				TimeUnit.SECONDS.sleep(5);
				//Click On Rear Video size to select resolution
				logger.info("Select video size option");
				System.out.println("Select video size option");
	  			MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@text='Video size']"));
	  			RearVideoSize.click();
	  			logger.info("Select first Back Video Resolution:4K (16:9)");
	  			System.out.println("Select first Back Video Resolution:4K (16:9))");
	  			//Select 1st resolution
	  		//	MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='4K (16:9)']"));
	  			//FirstRes.click();
		  		TimeUnit.SECONDS.sleep(10);
		  		try {
		  			MobileElement TempWarning = driver.findElement(By.xpath("//*[@text='If the device temperature rises, the app may close during use. Your recording will be saved automatically.']"));
		  			TempWarning.click();
		  			TimeUnit.SECONDS.sleep(3);
		  			MobileElement Ok = driver.findElement(By.xpath("//*[@text='OK']"));
		  			Ok.click();
			  		TimeUnit.SECONDS.sleep(10);
		  		}
		  		catch (Exception e) {
					e.printStackTrace();
				}
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
		  		*/
				
				// Load properties file
			  		
		  			
					
			  		
				
				logger.info("Host does'nt support rear camera 4K  video resolution  storage option in uSD during automation hence skip 4k resolution video recording");
		  		System.out.println("Host does'nt support rear camera 4K  video resolution  storage option in uSD during automation hence skip 4k resolution video recording");
			  		//Select 2nd resolution
			  		logger.info("Select settings option to select second resolution");
			  		System.out.println("Select settings option to select second resolution");
			  		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings3.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
					logger.info("Select video size option");
					System.out.println("Select video size option");
				  			MobileElement RearVideoSize1 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize1.click();
				  			logger.info("Select second Back Video Resolution:Full HD (21:9)");
				  			System.out.println("Select second Back Video Resolution:Full HD (21:9)");
				  			//Select 2nd resolution
				  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='Full HD (21:9)']"));
				  			SecondRes.click();
				  			TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
							
							
							
							
							// Load properties file
							Properties prop = new Properties();
					  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
					  		TimeUnit.SECONDS.sleep(5);
					  		String recordingDurationRear = prop.getProperty("recordingDurationRear");  
					  		System.out.println("recordingDurationRear = "+ recordingDurationRear +"Sec");
					  		int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
			  		
			  		//Start Recording
			  		
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		TimeUnit.SECONDS.sleep(5);
			  		MobileElement StartRecording1 = driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']"));
			  		StartRecording1.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRearInt);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
			  		StopRecording1.click();
			  		
			  		//select 3rd resolution
			  		logger.info("Select settings option to select third resolution");
			  		System.out.println("Select settings option to select third resolution");
			  		MobileElement Settings4 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings4.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
						logger.info("Select video size option");
						System.out.println("Select video size option");
				  			MobileElement RearVideoSize2 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize2.click();
				  			logger.info("Select third Back Video Resolution:Full HD (16:9)");
				  			System.out.println("Select third Back Video Resolution:Full HD (16:9)");
				  			//Select third resolution
				  			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='Full HD (16:9)']"));
				  			ThirdRes.click();
				  			TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
							// Load properties file
			  			Properties prop2 = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			  		System.out.println("recordingDurationRear1 = "+ recordingDurationRear1 +"Sec");
			  		int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);
			  		
			  		//Start Recording
			  		
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		TimeUnit.SECONDS.sleep(5);
			  		MobileElement StartRecording2 = driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']"));
			  		StartRecording2.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording2 = driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']"));
			  		StopRecording2.click();
			  		
			  		//
			  		logger.info("Select settings option to select fourth resolution");
			  		System.out.println("Select settings option to select fourth resolution");
			  		MobileElement Settings5 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings5.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
					logger.info("Select video size option");
					System.out.println("Select video size option");
				  			MobileElement RearVideoSize3 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize3.click();
				  			logger.info("Select fourth Back Video Resolution:Full HD (16:9 60fps)");
				  			System.out.println("Select fourth Back Video Resolution:Full HD (16:9 60fps)");
				  			//Select 4th resolution
				  			MobileElement FourthRes = driver.findElement(By.xpath("//*[@text='Full HD (16:9 60fps)']"));
				  			FourthRes.click();
				  			TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
							// Load properties file
			  			Properties prop3 = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			  		System.out.println("recordingDurationRear2 = "+ recordingDurationRear2 +"Sec");
			  		int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);
			  		
			  		//Start Recording
			  		
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording3 = driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']"));
			  		StartRecording3.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear2Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
			  		StopRecording3.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		//Select fifth resolution
			  		logger.info("Select settings option to select fifth resolution");
			  		System.out.println("Select settings option to select fifth resolution");
			  		MobileElement Settings6 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings6.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
					logger.info("Select video size option");
					System.out.println("Select video size option");
				  			MobileElement RearVideoSize4 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize4.click();
				  			logger.info("Select fifth  Back Video Resolution:1080x1080(1:1))");
				  			System.out.println("Select fifth Back Video Resolution:1080x1080(1:1)");
				  			//Select 1st resolution
				  			MobileElement fifthRes = driver.findElement(By.xpath("//*[@text='1080x1080(1:1)']"));
				  			fifthRes.click();
				  			TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
							// Load properties file
			  			Properties prop4 = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear3 = prop.getProperty("recordingDurationRear3");  
			  		System.out.println("recordingDurationRear3 = "+ recordingDurationRear3 +"Sec");
			  		int recordingDurationRear3Int=Integer.parseInt(recordingDurationRear3);
			  		
			  		
					TimeUnit.SECONDS.sleep(2);
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording4 = driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']"));
			  		StartRecording4.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear3Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording4 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
			  		StopRecording4.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		
			  	//Select Sixth resolution
			  		logger.info("Select settings option to select sixth resolution");
			  		System.out.println("Select settings option to select fifth resolution");
			  		MobileElement Settings7 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings7.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
					logger.info("Select video size option");
					System.out.println("Select video size option");
				  			MobileElement RearVideoSize5 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize5.click();
				  			logger.info("Select sixth  Back Video Resolution:HD");
				  			System.out.println("Select sixth Back Video Resolution:HD");
				  			//Select 1st resolution
				  			MobileElement Sixth = driver.findElement(By.xpath("//*[@text='HD']"));
				  			Sixth.click();
				  			TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
							// Load properties file
			  			Properties prop5 = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear4 = prop.getProperty("recordingDurationRear4");  
			  		System.out.println("recordingDurationRear4 = "+ recordingDurationRear4 +"Sec");
			  		int recordingDurationRear4Int=Integer.parseInt(recordingDurationRear4);
			  		
			  		//Start Recording
			  		
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording5 = driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']"));
			  		StartRecording5.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear4Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording5 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
			  		StopRecording5.click();
			  		TimeUnit.SECONDS.sleep(2);
			  		
			  		
			  	//Select Seventh resolution
			  		logger.info("Select settings option to select seventh resolution");
			  		System.out.println("Select settings option to select seventh resolution");
			  		MobileElement Settings8 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings8.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
					logger.info("Select video size option");
					System.out.println("Select video size option");
				  			MobileElement RearVideoSize6 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize6.click();
				  			logger.info("Select seventh  Back Video Resolution:VGA");
				  			System.out.println("Select seventh Back Video Resolution:VGA");
				  			//Select 1st resolution
				  			MobileElement Seventh = driver.findElement(By.xpath("//*[@text='VGA']"));
				  			Seventh.click();
				  			TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
							
			  		
			  		
			  		
			  		
			  		
			  		
			  	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		  		TimeUnit.SECONDS.sleep(2);
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
				MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
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
				MobileElement Camera =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']"));
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
				driver.findElement(By.xpath("//*[@text='6 selected']")).click();
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				logger.info("Test10_Bcam_video: 6 videos captured successfully");
				System.out.println("Test10_Bcam_video: 6 videos captured successfully");




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
	  				
	  		  		
	  		  	//Launch File Manager
	  				try {
	  		  		logger.info("Launch file manager application for Front video play back");
	  		  	System.out.println("Launch file manager application for Front video play back");
	  		  	((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  	  		TimeUnit.SECONDS.sleep(5);
	  	  		//Swipe up and select uSD Card
	  	  		logger.info("Swipe up and select uSD card");
	  	  		System.out.println("Swipe up and select uSD card");
	  	  	MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
				  		
				  	//Select External Storage	
				  	  logger.info("Select External storage");
				  	  System.out.println("Select External storage");
				  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
					TimeUnit.SECONDS.sleep(5);
					
					//Switch back to Grid view mode
					logger.info("switch to grid view mode ");
					System.out.println("switch to grid view mode");
					driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
					TimeUnit.SECONDS.sleep(3);
					
					//Swipe and select DCIM folder
					logger.info("Swipe up and select DCIM folder");
					System.out.println("Swipe up and select DCIM folder");
				MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
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
						driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
						
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
			  		 ((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				  		TimeUnit.SECONDS.sleep(2);
				  		logger.info("Pause video playback");
		  		  		System.out.println("Pause video playback");
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
			      
		  	public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
		  		
		  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  		
			  	//launch  Home screen and clear recent apps
					logger.info("launch  Home screen and clear recent apps");
					System.out.println("launch  Home screen and clear recent apps");
					
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

							logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
							System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

						}

						logger.info("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
						System.out.println("Final message: Pass Test10 Pass for rear camera  video recording, playback and fast forward highest resolution recorded video and playback and fast forward copied video files from Test1 folder and data move operation scenario");
						logger.info("Test:End");
						System.out.println("Test:End");
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
								"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
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
						MobileElement Camera = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']"));
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