package RealMeC21Y;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
  
  public class Test8_Int
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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C21Y");
			dc.setCapability(MobileCapabilityType.UDID, "1825264110BA062U");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AndroidDriver<MobileElement>(url, dc);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	  	
	  	@Test
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
		public void recordAudio() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		
	  		
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test8.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("========Test8:Record Audio "
	        		+ "record for Specified Duration time =========");
			logger.info("Setting up the appium desired capabilities");
			SetUp();
			String Result = "Fail";
	  		
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
	  		
	  		

	  		
	  		
	  		logger.info("Launch Voice recorder application");
	  		Reporter.log("launching voice recoreder app!!");
	  		
	  		//if Allow Pop up permissions exists Choose 1st option
	  		((StartsActivity) driver).startActivity(new Activity("com.android.soundrecorder", "com.sprd.soundrecorder.RecorderActivity"));
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  /*		//Click on Setting tab
	  		driver.findElement(By.id("com.android.soundrecorder:id/tagButton")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		logger.info("Clicking on Settings Tab");
	  		
	  	//Click Save Location
			driver.findElement(By.xpath("//*[@text='Save location']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		
	  		//Select uSD Card
	  		driver.findElement(By.xpath("//*[@text='SD card']")).click();
	  		TimeUnit.SECONDS.sleep(3);
	  		logger.info("Select uSD Card save location");
	  		
	  		*/
	  		
	  		
	  		
	  	//	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  	//	TimeUnit.SECONDS.sleep(2);
	  		
	  		//Start Recording
	  		logger.info("Start Recording");
	  		driver.findElement(By.id("com.android.soundrecorder:id/recordButton")).click();
			TimeUnit.SECONDS.sleep(120);
	  		
			// stop recording
	  		Reporter.log("Saving recorded files");
	  		driver.findElement(By.id("com.android.soundrecorder:id/stopButton")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		logger.info("Recording Completed");
	  		
	  		 PlayRecordedAudio();
	  		//logger.info("Calling Play recording function for play back and fast forward audio file");
			
	  		
	  	}
   
	 	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	  		
	  	  	//Clearing Recent Apps
			logger.info("Clearing Recent Apps");
			
			logger.info("Clear Recent Apps");
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
	  		
	  		
	  		
	  		
	  		
	  		//Launch File Manager
  			((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
  	  		TimeUnit.SECONDS.sleep(5);
  	  		logger.info("Launching file manager application");
  	  		
  	  		
  	  		
  	  		////Scroll Up to find Internal Storage option
	  			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
				         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
  	  		
  	  	//Select External Storage	
	  		MobileElement Internal = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Select External Storage");
		Internal.click();
		
		//Click Music Folder
		driver.findElement(By.xpath("//*[@text='Music']")).click();
  		TimeUnit.SECONDS.sleep(3);
  		logger.info("clicking music folder");
	  		
  		//Click recordings  Folder
  			driver.findElement(By.xpath("//*[@text='recordings']")).click();
  	  		TimeUnit.SECONDS.sleep(3);	
	  		logger.info("Clicking recordings folder");
	  		
	  		//Select recorded audio file to play
	  		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		  		logger.info("Started Audio playback");
		  		TimeUnit.SECONDS.sleep(20);
	  		
	  		
	  		
		  		//Click Fast forward button
		  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
		  		TimeUnit.SECONDS.sleep(20);
		  		
		  		//clikc Pause button
		  		 driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			  		TimeUnit.SECONDS.sleep(3);
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
			  		logger.info("Pass: Test8 Pass for playing recorded Audio file");
			
			
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
	  		
	  		PlayCopiedAudioFile();
	  		
	  	}
  
	 	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	  		
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
		
		
		
		
		
		//Launch File Manager
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		logger.info("Launching file manager application");
		
		
		
		////Scroll Up to find Internal Storage option
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
		         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
		
			//Select External Storage	
			MobileElement Internal = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
			TimeUnit.SECONDS.sleep(5);
			logger.info("Select External Storage");
			Internal.click();
	  		
	  		
			
			
			
			MobileElement Test1 = driver.findElement(By.xpath("//*[@text='Test1']")); 
  			Test1.click();
  			TimeUnit.SECONDS.sleep(3);
  	  		
  			MobileElement TestFile = driver.findElement(By.xpath("//*[@text='test_file']")); 
  			TestFile.click();
  			TimeUnit.SECONDS.sleep(3);
  			
  			
  			MobileElement oneGB = driver.findElement(By.xpath("//*[@text='1GB']")); 
  			oneGB.click();
  			TimeUnit.SECONDS.sleep(3);
			
			
  			MobileElement MP3Files = driver.findElement(By.xpath("//*[@text='MP3 Files']")); 
  			MP3Files.click();
  			TimeUnit.SECONDS.sleep(3);
			
			
  			driver.findElement(By.xpath("//*[@text='Laahe.Mp3.mp3']")).click();
		  		logger.info("Started video playback");
		  		TimeUnit.SECONDS.sleep(20);
  			
		  	//Click Fast forward button
		  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
		  		TimeUnit.SECONDS.sleep(20);
		  		
		  		//clikc Pause button
		  		 driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			  		TimeUnit.SECONDS.sleep(3);
	  		
			  		logger.info("Pass: 1st Audio File Play back is Successfull");
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					
	  		//Selecting 2nd Audio File
					
					driver.findElement(By.xpath("//*[@text='11 Rob Thomas - Lonely No More.mp3']")).click();
			  		logger.info("Started video playback");
			  		TimeUnit.SECONDS.sleep(20);
	  			
			  	//Click Fast forward button
			  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
			  		TimeUnit.SECONDS.sleep(20);
			  		
			  		//clikc Pause button
			  		 driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
				  		TimeUnit.SECONDS.sleep(3);
		  		
				  		logger.info("Pass: 2nd Audio File Play back is Successfull");
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						
						
						//Selecting 3rd Audio File
						
						driver.findElement(By.xpath("//*[@text='file_example_MP3_5MG.mp3']")).click();
				  		logger.info("Started video playback");
				  		TimeUnit.SECONDS.sleep(20);
		  			
				  	//Click Fast forward button
				  		  driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/fast_forward']")).click();
				  		TimeUnit.SECONDS.sleep(20);
				  		
				  		//clikc Pause button
				  		 driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
					  		TimeUnit.SECONDS.sleep(3);
			  		
					  		
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);	
	  		
	  		
			
			logger.info("Pass: 3rd Audio Play Back Successfull ");
			
			logger.info("Press Back ");
			
			logger.info("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario");
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			
	 	} 	
	 	
  } 
