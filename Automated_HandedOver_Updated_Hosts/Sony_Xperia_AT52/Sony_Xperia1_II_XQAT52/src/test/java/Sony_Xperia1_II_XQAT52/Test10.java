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
		  		
		  		//Launch Home screen application and clear recent apps
		  		logger.info("Clearing  Recent Apps");
		  		System.out.println("Clearing  Recent Apps");
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
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				//Select settings
				MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings1.click();
				TimeUnit.SECONDS.sleep(5);
				//Click On Rear Video size to select resolution
	  			MobileElement RearVideoSize = driver.findElement(By.xpath("//*[@text='Video size']"));
	  			RearVideoSize.click();
	  			logger.info("Select 1st Back Video Resolution:4K");
	  			System.out.println("Select 1st Back Video Resolution:4K");
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
			  		String recordingDurationRear = prop.getProperty("recordingDurationRear");  
			  		System.out.println("recordingDurationRear = "+ recordingDurationRear);
			  		int recordingDurationRearInt=Integer.parseInt(recordingDurationRear);	
		  			
					//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
			  		StartRecording.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRearInt);
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
				  			logger.info("Select 1st Back Video Resolution:Full HD");
				  			System.out.println("Select 1st Back Video Resolution:Full HD");
				  			//Select 1st resolution
				  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='Full HD (60 fps)']"));
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
			  		String recordingDurationRear1 = prop.getProperty("recordingDurationRear1");  
			  		System.out.println("recordingDurationRear1 = "+ recordingDurationRear1);
			  		int recordingDurationRear1Int=Integer.parseInt(recordingDurationRear1);
			  		
			  		//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
			  		StartRecording1.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear1Int);
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
				  			logger.info("Select 1st Back Video Resolution:1080x1080(1:1)");
				  			System.out.println("Select 1st Back Video Resolution:1080x1080(1:1)");
				  			//Select 1st resolution
				  			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='1080x1080(1:1)']"));
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
			  		String recordingDurationRear2 = prop.getProperty("recordingDurationRear2");  
			  		System.out.println("recordingDurationRear2 = "+ recordingDurationRear2);
			  		int recordingDurationRear2Int=Integer.parseInt(recordingDurationRear2);
			  		
			  		//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
			  		StartRecording2.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear2Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
			  		StopRecording2.click();
			  		
			  		//
			  		logger.info("Select settings option to select second resolution");
			  		System.out.println("Select settings option to select second resolution");
			  		MobileElement Settings4 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings4.click();
					TimeUnit.SECONDS.sleep(5);
					//Click On Rear Video size to select resolution
				  			MobileElement RearVideoSize3 = driver.findElement(By.xpath("//*[@text='Video size']"));
				  			RearVideoSize3.click();
				  			logger.info("Select 1st Back Video Resolution:HD");
				  			System.out.println("Select 1st Back Video Resolution:HD");
				  			//Select 1st resolution
				  			MobileElement FourthRes = driver.findElement(By.xpath("//*[@text='HD']"));
				  			FourthRes.click();
					  		TimeUnit.SECONDS.sleep(2);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
							// Load properties file
			  			Properties prop3 = new Properties();
			  		prop.load(Test10.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String recordingDurationRear3 = prop.getProperty("recordingDurationRear3");  
			  		System.out.println("recordingDurationRear3 = "+ recordingDurationRear3);
			  		int recordingDurationRear3Int=Integer.parseInt(recordingDurationRear3);
			  		
			  		//Start Recording
			  		logger.info("Start video recording");
			  		System.out.println("Start video recording");
			  		MobileElement StartRecording3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Record\"]/android.widget.ImageView"));
			  		StartRecording3.click();
			  		TimeUnit.SECONDS.sleep(recordingDurationRear3Int);
			  		//Stop Recording
			  		logger.info("Stop video recording");
			  		System.out.println("Stop video recording");
			  		MobileElement StopRecording3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Stop\"]/android.widget.ImageView"));
			  		StopRecording3.click();
			  
			  		
			  		TimeUnit.SECONDS.sleep(15);
			  	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		  		TimeUnit.SECONDS.sleep(2);
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
				//Calling video playback() for Playing Highest record video, fast forward video play back
		  		
		  		
		  	}
		  	
		  	public void  RecordedVideoPlayback() throws  IOException, InterruptedException{	   
		  	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  		
	  		  	//Launch Home screen and clear recent apps
	  				logger.info("Launch Home screen and clear recent apps");
	  				System.out.println("Launch Home screen and clear recent apps");
	  				
	  		  		
	  		  	//Launch File Manager
	  		  		logger.info("Launch file manager application for Front video play back");
	  		  	System.out.println("Launch file manager application for Front video play back");
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
				  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
					TimeUnit.SECONDS.sleep(5);
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
						driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
						
						TimeUnit.SECONDS.sleep(3);
						
						try {
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
			  		TimeUnit.SECONDS.sleep(20);
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
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				  		TimeUnit.SECONDS.sleep(2);
	  				
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
			      
		  	public void CopiedvideosPlayBack() throws  IOException, InterruptedException{	   
		  		
		  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		  		
			  	//launch  Home screen and clear recent apps
					logger.info("launch  Home screen and clear recent apps");
					System.out.println("launch  Home screen and clear recent apps");
					
			  		//Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same 
			  		logger.info("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			  		System.out.println("Launch file manager application, select uSD card, select Test1 folder, select Videos folder and Play copied videos and fast forward the same ");
			  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		  	  		TimeUnit.SECONDS.sleep(5);
		  	  		logger.info("Launching file manager application");
		  	  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
							        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(90)" +
							         ".scrollIntoView(new UiSelector().text(\"SD card\"))"));
					  		
					  	//Select External Storage	
		  	  		logger.info("Select external storage");
		  	  		System.out.println("Select external storage");
		  	  	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
				TimeUnit.SECONDS.sleep(5);
				//Switch to grid View Mode
				MobileElement GridView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
				GridView.click();
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
		  			driver.findElement(By.xpath("//*[@text='test_file']")).click();
					TimeUnit.SECONDS.sleep(5);
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
		  			MobileElement ListView = driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")); 
			  		  ListView.click();
			  			TimeUnit.SECONDS.sleep(3);
		  			
		  			try {
		  			//Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback
		  			System.out.println("System.out.println(\"Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback\");");
		  			logger.info("System.out.println(\"Select LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4 file for video playback\");");
		  			MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
	  				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
	  				         ".scrollIntoView(new UiSelector().text(\"LG_4K_DEMO_HDR_2018_(60FPS)_ELBA(480p).mp4\"))"));
		  			
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
		  			
		  			
		  			
			//Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback
			System.out.println("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			logger.info("Select FHD 5.1 ( 1350 X 2560 ).webm file for video playback");
			driver.findElement(By.xpath("//*[@text='FHD 5.1 ( 1350 X 2560 ).webm']")).click();
	  		  		logger.info("Started video playback");
	  		  		TimeUnit.SECONDS.sleep(20);
	  		  		try {
	  		  		//Tap Somewhere on Screen for contents to visible on Screen
		  		  	logger.info("Tap Somewhere on Screen for contents to visible on Screen");
		  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/video_player']")).click();
		  		  	
		  		  	//Click Fast forward button
		  		  logger.info("Click fast forward button for 10 seconds video forward");
		  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
		  		TimeUnit.SECONDS.sleep(20);
	  		  		
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
	  		  
	  		  	logger.info("Final message:Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
	  		  System.out.println("Final message:Pass Test10 Pass for Playing Copied Video files, recorded video file and fast forward video play back scenario ");
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