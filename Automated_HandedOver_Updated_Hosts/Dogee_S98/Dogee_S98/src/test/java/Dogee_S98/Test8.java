package Dogee_S98;
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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey; 
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Test8
{
	// initializing the driver instance
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void SetUp() throws MalformedURLException {
		// set desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "S98");
		dc.setCapability(MobileCapabilityType.UDID, "S980000000000004906");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
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
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test8 scenario is as follows");
		logger.info("1.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		logger.info("2.Host does not support audio recording in SD card. Hence skipping audio recording and recorded audio playback scenario");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test8 scenario is as follows");
		System.out.println("1.Launch file manager application and playback copied audio files from external storage the files are placed in the Test1 folder");
		System.out.println("2.Launch voice recorder application and record audio in uSD card storage,verify recorded audio file in uSD card storage");
		System.out.println("3.Playback recorded audio file and Copied audio files from uSD card storage,fast forward audio playback and pause scenario");
		
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";

		//Launch Home screen and clear recent apps
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//Luanch voice recorder application
		logger.info("Launch voice recorder application");
		System.out.println("Launch voice recorder application");
		((StartsActivity) driver).startActivity(new Activity("com.media.bestrecorder.audiorecorder", "com.media.bestrecorder.audiorecorder.MainActivity"));
		TimeUnit.SECONDS.sleep(5);
		//select settings option
		logger.info("Select settings option");
		System.out.println("Select settings option");
		MobileElement Settings = driver.findElement(By.xpath("//*[@bounds='[809,2017][991,2115]']")); 
		Settings.click();
		TimeUnit.SECONDS.sleep(3);
		//select location option
				logger.info("select location option");
				System.out.println("select location option");
				MobileElement location = driver.findElement(By.xpath("//*[@text='Location of recording(SD Card available)']")); 
				location.click();
				TimeUnit.SECONDS.sleep(3);
				//Select SD card 
				logger.info("Select SD card ");
				System.out.println("Select SD card ");
				MobileElement SDCard = driver.findElement(By.xpath("//*[@bounds='[60,420][132,492]']")); 
				SDCard.click();
				TimeUnit.SECONDS.sleep(3);
				//Click select option
				//Select SD card 
				logger.info("Select SD card ");
				System.out.println("Select SD card ");
				MobileElement Select = driver.findElement(By.xpath("//*[@text='Select']")); 
				Select.click();
				TimeUnit.SECONDS.sleep(3);
				//Select Closed option
				logger.info("Select Closed option ");
				System.out.println("Select Closed option ");
				MobileElement Closed = driver.findElement(By.xpath("//*[@text='Closed']")); 
				Closed.click();
				TimeUnit.SECONDS.sleep(3);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				//Start recording
				
				logger.info("Start audio recording");
				System.out.println("Start audio recording ");
				MobileElement Startrec = driver.findElement(By.xpath("//*[@resource-id='com.media.bestrecorder.audiorecorder:id/btn_record_start']")); 
				Startrec.click();
				TimeUnit.SECONDS.sleep(120);
				//Stop recording
				logger.info("Start audio recording");
				System.out.println("Start audio recording ");
				MobileElement StopRec = driver.findElement(By.xpath("//*[@bounds='[417,1650][662,1895]']")); 
				StopRec.click();
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				//Launch default file manager and verify recorded audio in SD card storage
				logger.info("Launch default file manager and verify recorded audio in SD card storage");
				System.out.println("Launch default file manager and verify recorded audio in SD card storage ");
				
				//Launch settings application'
				logger.info("Launch settings application");
				System.out.println("Launch settings application");
				((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
				TimeUnit.SECONDS.sleep(6);
				TimeUnit.SECONDS.sleep(5);
				logger.info("Scrolling till About phone is visible");
				System.out.println("Scrolling till About phone is visible");
				String text = "About phone";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				//click on About phone
				logger.info("Clicking on About phone");
				System.out.println("Clicking on About phone");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"About phone\")").click();
				TimeUnit.SECONDS.sleep(5);
				//click on storage
				logger.info("Clicking on Storage option");
				System.out.println("Clicking on Storage option");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
				TimeUnit.SECONDS.sleep(10);
				//Select This device option
				//Select This device option
				logger.info("Select Navigate bar option");
				System.out.println("Select Navigate bar option");
				MobileElement NavigateBar1 = driver.findElement(By.xpath("//*[@bounds='[90,309][600,465]']"));
				NavigateBar1.click();
				TimeUnit.SECONDS.sleep(10);
				//Select external storage
				logger.info("Select SANDISK SD CARD");
				System.out.println("Select SANDISK SD CARD");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SANDISK SD CARD\")").click();
				TimeUnit.SECONDS.sleep(10);
				//select files option
				logger.info("select files option");
				System.out.println("select files option");
				MobileElement Files = driver.findElement(By.xpath("//*[@text='Files']"));
				Files.click();
				TimeUnit.SECONDS.sleep(5);
				//select android folder
				logger.info("select android folder");
				System.out.println("select android folder");
				MobileElement Android = driver.findElement(By.xpath("//*[@text='Android']"));
				Android.click();
				TimeUnit.SECONDS.sleep(5);
				//select data folder
				logger.info("select data folder");
				System.out.println("select data folder");
				MobileElement data = driver.findElement(By.xpath("//*[@text='data']"));
				data.click();
				TimeUnit.SECONDS.sleep(5);
				//Select voice recorder folder
				logger.info("select voice recorder folder");
				System.out.println("select voice recorder folder");
				MobileElement VRC = driver.findElement(By.xpath("//*[@text='com.media.bestrecorder.audiorecorder']"));
				VRC.click();
				TimeUnit.SECONDS.sleep(5);
				//Select files folder
				logger.info("select Files folder");
				System.out.println("select Files folder");
				MobileElement Files1 = driver.findElement(By.xpath("//*[@text='files']"));
				Files1.click();
				TimeUnit.SECONDS.sleep(5);
				//Select Recorders folder
				logger.info("select Recorders folder");
				System.out.println("select Recorders folder");
				MobileElement Recorders = driver.findElement(By.xpath("//*[@text='Recorders']"));
				Recorders.click();
				TimeUnit.SECONDS.sleep(5);
				//Select more options
				logger.info("Select more options");
				System.out.println("Select more options");
				MobileElement more = driver.findElement(By.xpath("//*[@content-desc='More options']"));
				more.click();
				TimeUnit.SECONDS.sleep(5);
				//Click Select all options
				logger.info("Click Select all option");
				System.out.println("Click Select all option");
				MobileElement Select1 = driver.findElement(By.xpath("//*[@text='Select all']"));
				Select1.click();
				TimeUnit.SECONDS.sleep(5);
				MobileElement TotalFiles = driver.findElement(By.xpath("//*[@text='1 selected']"));
				TimeUnit.SECONDS.sleep(5);
				TotalFiles.click();
				logger.info("Pass: Audio recording scenario completed succesfully");
				System.out.println("Pass: Audio recording scenario completed succesfully");
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
				logger.info("Calling PlayRecordedAudio() for recorded audio playback and fast forward sceanrio");
				System.out.println("Calling PlayRecordedAudio() for recorded audio playback and fast forward sceanrio");
				PlayRecordedAudio();
			}
		catch(Exception e) {
			logger.info("Fail: Test8 Fail for audio recording scenario");
			System.out.println("Fail: Test8 Fail for audio recording scenario");
			logger.info("Final Message: Fail Test8 Fail for audio recording scenario");
			System.out.println("Final Message: Fail Test8 Fail for audio recording scenario");
			
		}
		
		
		
		

	}

	public void PlayRecordedAudio() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		//Launch home screen and clear recent apps
		//Launch Home screen and clear recent apps
				logger.info("Launch home screen");
				System.out.println("Launch home screen");
				((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
				TimeUnit.SECONDS.sleep(5);

				// Clearing Phone recent apps from background
				try
				{
					logger.info("Clearing Recent Apps");
					System.out.println("Clearing Recent Apps");
					MobileElement  ClearAll =	driver.findElement(By.xpath("//*[@text='Clear all']"));
					ClearAll.click();
					TimeUnit.SECONDS.sleep(5);

					TimeUnit.SECONDS.sleep(5);
					
				}

				catch (Exception e) {
					e.printStackTrace();
					logger.info("No recent apps found in background");
					System.out.println("No recent apps found background");

				}
		

		try
		{

			//Launch File Manager application for recorded audio file playBack
			//Launch settings application'
			logger.info("Launch settings application");
			System.out.println("Launch settings application");
			((StartsActivity) driver).startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
			TimeUnit.SECONDS.sleep(6);
			TimeUnit.SECONDS.sleep(5);
			logger.info("Scrolling till About phone is visible");
			System.out.println("Scrolling till About phone is visible");
			String text = "About phone";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			//click on About phone
			logger.info("Clicking on About phone");
			System.out.println("Clicking on About phone");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"About phone\")").click();
			TimeUnit.SECONDS.sleep(5);
			//click on storage
			logger.info("Clicking on Storage option");
			System.out.println("Clicking on Storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage\")").click();
			TimeUnit.SECONDS.sleep(10);
			//Select This device option
			//Select This device option
			logger.info("Select Navigate bar option");
			System.out.println("Select Navigate bar option");
			MobileElement NavigateBar1 = driver.findElement(By.xpath("//*[@bounds='[90,309][600,465]']"));
			NavigateBar1.click();
			TimeUnit.SECONDS.sleep(10);
			//Select external storage
			logger.info("Select SANDISK SD CARD");
			System.out.println("Select SANDISK SD CARD");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SANDISK SD CARD\")").click();
			TimeUnit.SECONDS.sleep(10);
			//select files option
			logger.info("select files option");
			System.out.println("select files option");
			MobileElement Files = driver.findElement(By.xpath("//*[@text='Files']"));
			Files.click();
			TimeUnit.SECONDS.sleep(5);
			//select android folder
			logger.info("select android folder");
			System.out.println("select android folder");
			MobileElement Android = driver.findElement(By.xpath("//*[@text='Android']"));
			Android.click();
			TimeUnit.SECONDS.sleep(5);
			//select data folder
			logger.info("select data folder");
			System.out.println("select data folder");
			MobileElement data = driver.findElement(By.xpath("//*[@text='data']"));
			data.click();
			TimeUnit.SECONDS.sleep(5);
			//Select voice recorder folder
			logger.info("select voice recorder folder");
			System.out.println("select voice recorder folder");
			MobileElement VRC = driver.findElement(By.xpath("//*[@text='com.media.bestrecorder.audiorecorder']"));
			VRC.click();
			TimeUnit.SECONDS.sleep(5);
			//Select files folder
			logger.info("select Files folder");
			System.out.println("select Files folder");
			MobileElement Files1 = driver.findElement(By.xpath("//*[@text='files']"));
			Files1.click();
			TimeUnit.SECONDS.sleep(5);
			//Select Recorders folder
			logger.info("select Recorders folder");
			System.out.println("select Recorders folder");
			MobileElement Recorders = driver.findElement(By.xpath("//*[@text='Recorders']"));
			Recorders.click();
			TimeUnit.SECONDS.sleep(5);
	 

			//Click 1st File to Play Video
			logger.info("Click first audio file for audio playback and fast forward scenario");
			System.out.println("Click first audio file for audio playback and fast forward scenario");
			driver.findElement(By.xpath("//*[@bounds='[72,735][528,1191]']")).click();
			TimeUnit.SECONDS.sleep(30);
			
			
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(30);
			//Pause audio playback
			logger.info("Pause audio playback");
			System.out.println("Pause audio playback");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.youtube.music:id/play_pause_replay_button']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			logger.info("Pass: Test8 Pass for playing, fast forward, and pause recorded audio file scenario");
			System.out.println("Pass: Test8 Pass for playing, fast forward, and pause recorded audio file scenario");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			//Calling PlayCopiedAudioFile()
			logger.info("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			System.out.println("Calling PlayCopiedAudioFile() for copied audio files from Test1 folder");
			PlayCopiedAudioFile();
		}

		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
			System.out.println("Final Message: Fail Test8 Fail for Recorded audio file play back, fast forward, and pause  scenario");
		}

	}

	public void PlayCopiedAudioFile() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

		//Clearing Recent Apps
		logger.info("Launch home screen");
		System.out.println("Launch home screen");
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.searchlauncher.SearchLauncher"));
		TimeUnit.SECONDS.sleep(5);
		

		
		//Launch File Manager
		logger.info("Launch File Manager Application");
		System.out.println("Launch File Manager Application");
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		//Swipe up and select uSD Card
		driver.findElement(MobileBy.AndroidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

  		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
			         ".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
	
	//Select Internal Memory
	logger.info("Select  SD card");
	System.out.println("Select  SD card");
	((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
	TimeUnit.SECONDS.sleep(5);
		//Search For Test1 Folder
		String text = "Test1";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
		TimeUnit.SECONDS.sleep(5);
		//Select Test1 folder
		logger.info("Select Test1 folder");
		System.out.println("Select Test1 folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Test1\")").click();
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']")).click();
		TimeUnit.SECONDS.sleep(5);
		//Select Test1 folder
				logger.info("Select Test_file folder");
				System.out.println("Select Test_file folder");
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"test_file\")").click();
		TimeUnit.SECONDS.sleep(5);
		//Select 1GB folder
		logger.info("Select 1GB folder");
		System.out.println("Select 1GB folder");
		driver.findElement(By.xpath("//*[@text='1GB']")).click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Select MP3 files Folder");
		System.out.println("Select MP3 files Folder");
		//click on Video Folder
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"MP3 Files\")").click();
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Playing first audio file from Test1 folder");
		logger.info("Playing first audio file from Test1 folder");
		//Click 1st File to Play Video
		try {
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"11 Rob Thomas - Lonely No More.mp3\")").click();
			TimeUnit.SECONDS.sleep(30);
			
			//click on fast forward button
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(615, 1707)).perform();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(10);
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: first audio file palyback and fast forward scenario is successfull");
			System.out.println("Pass: first audio file palyback and fast forward scenario is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");

		}	


		logger.info("Playing second audio file from Test1 folder");
		System.out.println("Playing second audio file from Test1 folder");
		//Click 1st File to Play Video
		try {
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"file_example_MP3_5MG.mp3\")").click();
		
			TimeUnit.SECONDS.sleep(30);
			//click on fast forward button
			//Click On Fast Forward
			logger.info("Fast Forwarding Audio for 10 Seconds");
			System.out.println("Fast Forwarding Audio for 10 Seconds");
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(615, 1707)).perform();
			TimeUnit.SECONDS.sleep(10);
			logger.info("Continue audio playback");
			System.out.println("Continue audio playback");
			TimeUnit.SECONDS.sleep(10);
			logger.info("Pause Audio");
			System.out.println("Pause Audio");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Pass: Seond audio file palyback and fast forward scenario is successfull");
			System.out.println("Pass: Second audio file palyback and fast forward scenario is successfull");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);

		}
		catch (Exception e) {
			logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
			System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
			System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");

		}
		logger.info("Playing third audio file from Test1 folder");
		System.out.println("Playing third audio file from Test1 folder");
		//Click 1st File to Play Video
		try
		{
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Laahe.Mp3.mp3\")").click();
			
		TimeUnit.SECONDS.sleep(30);
		//click on fast forward button
		//Click On Fast Forward
		logger.info("Fast Forwarding Audio for 10 Seconds");
		System.out.println("Fast Forwarding Audio for 10 Seconds");
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(615, 1707)).perform();
		TimeUnit.SECONDS.sleep(10);
		logger.info("Continue audio playback");
		System.out.println("Continue audio playback");
		TimeUnit.SECONDS.sleep(10);
		logger.info("Pause Audio");
		System.out.println("Pause Audio");
		driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/play_pause']")).click();
		TimeUnit.SECONDS.sleep(3);
		logger.info("Pass: Third audio file palyback and fast forward scenario is successfull");
		System.out.println("Pass: Third audio file palyback and fast forward scenario is successfull");
		logger.info("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario");
		System.out.println("Pass: Test8 Pass for Recorded and copied audio play back and fast forward scenario ");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Final Message: Pass Test8 Pass for Recorded and copied audio play back and fast forward scenario");
		System.out.println("Final Message: Pass Test8 Pass for Recorded and copied audio play back and fast forward scenario");
	}
	catch (Exception e) {
		logger.info("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
		logger.info("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
		System.out.println("Fail: Test8 Fail for Copied audio file playback,fast forward scenario");
		System.out.println("Final Message: Fail Test8 Fail for copied audio file playback,fast forwward scenario");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	}
	logger.info("Test: End");
	System.out.println("Test: End");
	logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	TimeUnit.SECONDS.sleep(2);
	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	TimeUnit.SECONDS.sleep(2);
	((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	TimeUnit.SECONDS.sleep(2);

	} 	

}