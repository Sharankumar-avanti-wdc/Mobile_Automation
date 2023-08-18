package Sony_Xperia_10II_XQ_AU52;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sony_Xperia_10II_XQ_AU52.Test9F;
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
  
  public class Test9F
  {
	  // initializing the driver instance
	  AppiumDriver<MobileElement> driver;
	private boolean isPaused;
	private String Result;
	  	@BeforeTest
		public void SetUp() throws MalformedURLException {
			// set desired capabilities
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-AU52");
			dc.setCapability(MobileCapabilityType.UDID, "QV720DJV3A");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, dc);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	  	
	  	@Test
		public void frontPictureCapture() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		//Log File Generating Script
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test9F.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("Test: Start");
	        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        logger.info("Test9F Scenario is as follows:");
	        logger.info("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
			logger.info("Setting up the appium desired capabilities");
			 System.out.println("Test9F Scenario is as follows:");
		     System.out.println("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		     System.out.println("2.Move captured front camera images to Test9F folder");
		     System.out.println("Setting up the appium desired capabilities");
		     logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			SetUp();
			String Result = "Fail";
	  		
	  		//Launch Home screen and Clear recent apps
	  		logger.info("Launch Home screen and Clear recent apps");
	  		System.out.println("Launch Home screen and Clear recent apps");
	  		try {
	  		//Launch Camera application and start front camera images for all resolutions
	  		logger.info("Launch Camera application and start front camera images for all resolutions");
	  		System.out.println("Launch Camera application and start front camera images for all resolutions");
	  		((StartsActivity) driver).startActivity(new Activity("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
			
	  		logger.info("Test9F_Fcam_res: 4 resolutions supported");
			System.out.println("Test9F_Fcam_res: 4 resolutions supported");
	  		
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
			//Select Photo Mode option
			MobileElement PhotoMode = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"PHOTO\"]"));
			TimeUnit.SECONDS.sleep(2);
			PhotoMode.click();
			
		
			MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//*[@content-desc='Double tap to switch to front camera']"));
			TimeUnit.SECONDS.sleep(2);
			SwitchToFrontCamera.click();
			
			//Skip Eye Direction
			logger.info("If Eye Direction Pop-up exists during switch camera select skip opption");
			System.out.println("If Eye Direction Pop-up exists during switch camera select skip opption");
			try {
				MobileElement SkipEyeDirection = driver.findElement(By.xpath("//*[@text='SKIP']"));
				TimeUnit.SECONDS.sleep(2);
				SkipEyeDirection.click();
			}
			catch(Exception exp)
			{ 
					// Block of code to handle errors
				
			}
			
			
			
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
			
			//Select settings option and select resolution
			MobileElement Settings1 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
			Settings1.click();
			TimeUnit.SECONDS.sleep(5);
			
	  		
		  	//Select Front Image size
		  		logger.info("Select Front Image size");
		  		System.out.println("Select Front Image size");
		  		MobileElement RearImage = driver.findElement(By.xpath("//*[@text='Still image size']"));
	  			RearImage.click();
	  			
	  			
	  		//Select 1st resolution
	  			logger.info("Select First front Image Resoution: 3:4");
	  			System.out.println("Select First front Image Resoution: 3:4\"");
	  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='4:3 (8MP)']"));
	  			FirstRes.click();
		  		TimeUnit.SECONDS.sleep(10);
		  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(2);
		  		
		  		Properties prop = new Properties();
		  		// Load properties file
		  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
		  		System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
		  		int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);
		  		// capture  pics for the selected resolution
		  		logger.info("Capture Images");
		  		int j=0;
		  		for(j = 0; j < totalPictureCountFrontInt; j++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']")).click();
		  			TimeUnit.SECONDS.sleep(6);
		  			System.out.println("clicking First resolution Image"+j);
		  			logger.info("clicking First resolution Image"+j);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  		////
		  	//Select settings option and select resolution
				MobileElement Settings2 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
				Settings2.click();
				TimeUnit.SECONDS.sleep(5);
				
		  		
			  	//Select Front Image size
			  		logger.info("Select Front Image size");
			  		System.out.println("Select Front Image size");
			  		MobileElement RearImage1 = driver.findElement(By.xpath("//*[@text='Still image size']"));
		  			RearImage1.click();
		  			
		  			
		  		//Select second resolution
		  			logger.info("Select second front Image Resoution: 16:9 (6MP)");
		  			System.out.println("Select second front Image Resoution: 16:9 (6MP)");
		  			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='16:9 (6MP)']"));
		  			SecondRes.click();
			  		TimeUnit.SECONDS.sleep(10);
			  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					TimeUnit.SECONDS.sleep(2);
			  		
			  		Properties prop1 = new Properties();
			  		// Load properties file
			  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			  		TimeUnit.SECONDS.sleep(5);
			  		String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
			  		System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1);
			  		int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);
			  		// capture  pics for the selected resolution
			  		logger.info("Capture Images");
			  		int j1=0;
			  		for(j1 = 0; j1 < totalPictureCountFront1Int; j1++) 
			  		{ 
			  			TimeUnit.SECONDS.sleep(2);
			  			driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']")).click();
			  			TimeUnit.SECONDS.sleep(6);
			  			System.out.println("clicking second resolution Image"+j1);
			  			logger.info("clicking second resolution Image"+j1);
			  		}
			  		TimeUnit.SECONDS.sleep(2);
			  		
			  		//
			  		MobileElement Settings3 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
					Settings3.click();
					TimeUnit.SECONDS.sleep(5);
					
			  		
				  	//Select Front Image size
				  		logger.info("Select Front Image size");
				  		System.out.println("Select Front Image size");
				  		MobileElement RearImage2 = driver.findElement(By.xpath("//*[@text='Still image size']"));
			  			RearImage2.click();
			  			
			  			
			  		//Select second resolution
			  			logger.info("Select third  Image Resoution: 1:1 (6MP)");
			  			System.out.println("Select third front Image Resoution: 1:1 (6MP)");
			  			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='1:1 (6MP)']"));
			  			ThirdRes.click();
				  		TimeUnit.SECONDS.sleep(10);
				  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
						((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
						TimeUnit.SECONDS.sleep(2);
				  		
				  		Properties prop2 = new Properties();
				  		// Load properties file
				  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
				  		TimeUnit.SECONDS.sleep(5);
				  		String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
				  		System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
				  		int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
				  		// capture  pics for the selected resolution
				  		logger.info("Capture Images");
				  		int j2=0;
				  		for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
				  		{ 
				  			TimeUnit.SECONDS.sleep(2);
				  			driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']")).click();
				  			TimeUnit.SECONDS.sleep(6);
				  			System.out.println("clicking third resolution Image"+j2);
				  			logger.info("clicking third resolution Image"+j2);
				  		}
				  		TimeUnit.SECONDS.sleep(2);
				  		
				  		//select fourth image resolution
				  		MobileElement Settings4 = driver.findElement(By.xpath("//*[@resource-id='com.sonyericsson.android.camera:id/contextual_setting_shortcut']"));
						Settings3.click();
						TimeUnit.SECONDS.sleep(5);
						
				  		
					  	//Select Front Image size
					  		logger.info("Select Front Image size");
					  		System.out.println("Select Front Image size");
					  		MobileElement RearImage3 = driver.findElement(By.xpath("//*[@text='Still image size']"));
				  			RearImage3.click();
				  			
				  			
				  		//Select second resolution
				  			logger.info("Select fourth  Image Resoution: 1:1 (6MP)");
				  			System.out.println("Select fourth front Image Resoution: 1:1 (6MP)");
				  			MobileElement FourthRes = driver.findElement(By.xpath("//*[@text='21:9 (5MP)']"));
				  			FourthRes.click();
					  		TimeUnit.SECONDS.sleep(10);
					  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
							((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
							TimeUnit.SECONDS.sleep(2);
					  		
					  		Properties prop3 = new Properties();
					  		// Load properties file
					  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
					  		TimeUnit.SECONDS.sleep(5);
					  		String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
					  		System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3);
					  		int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
					  		// capture  pics for the selected resolution
					  		logger.info("Capture Images");
					  		int j3=0;
					  		for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
					  		{ 
					  			TimeUnit.SECONDS.sleep(2);
					  			driver.findElement(By.xpath("//*[@bounds='[425,2104][656,2335]']")).click();
					  			TimeUnit.SECONDS.sleep(6);
					  			System.out.println("clicking third resolution Image"+j3);
					  			logger.info("clicking third resolution Image"+j3);
					  		}
					  		TimeUnit.SECONDS.sleep(2);
		  	
	  		// switch to back camera
	  		TimeUnit.SECONDS.sleep(5);
	  		MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Double-tap to switch to the main camera\"]"));
			
			SwitchToBackCamera.click();
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		Result ="Pass";
	  		int TotalCount=0;
	  		TotalCount += j+j1+j2+j3;

			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			
			//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
			//TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			//Result ="Pass";
			logger.info("Launch file manager application and verify captured images present  in uSD Card");
			System.out.println("Launch file manager application and verify captured images present in uSD Card");
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
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='SD card']"));
			SDCard.click();
			TimeUnit.SECONDS.sleep(6);
			
			//Switch grid view mode
			logger.info("switch to grid view mode to select DCIM folder");
			System.out.println("switch to grid view mode to select DCIM folder");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM2 =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM2.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Camera folder
			logger.info("Select camera folder");
			System.out.println("Select camera folder");
			MobileElement Camera2 =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/title']"));
			Camera2.click();
			TimeUnit.SECONDS.sleep(3);
			//Switch back to list view mode
			logger.info("switch to list view mode ");
			System.out.println("switch to list view mode");
			driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/view_mode_switch']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Click More options
			logger.info("Click More options");
			System.out.println("Click More options");
			MobileElement MoreOptions4 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
			MoreOptions4.click();
			TimeUnit.SECONDS.sleep(6);
			//Click Select All
			logger.info("Click Select all");
			System.out.println("Click select all");
			MobileElement SelectAll3 =	driver.findElement(By.xpath("//*[@text='Select all']"));
			SelectAll3.click();
			TimeUnit.SECONDS.sleep(3);
			
			logger.info("Total Image captured");
			System.out.println("Total Image");
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
			TotalImage.click();
			System.out.print(TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 
			
			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);

			int TotalImageCaptured=Integer.valueOf(TotalImageInt);

			Properties prop5 = new Properties();
			prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	
			
			double TolerancePercentage = Tolerance_LevelInt/100*TotalCount;				
			//	System.out.println("Tolerance level value  = " + TolerancePercentage);
				if(TotalImageCaptured>(Tolerance_LevelInt/100)*TotalCount)
				{
				
					
					logger.info("Pass: Test9 pass for front Image capture");

					System.out.println("\nPass: Test9F pass for front Image capture");
					System.out.println("Test9F_Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
					logger.info("Test9F_Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
					
					

					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
					//calling DataMoveOperation()
					


					
					
				}
				else {
					
					
					
					
					//logger.info("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
					//System.out.println("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
					
				}


				logger.info("calling DataMoveOperation() ");
				System.out.println("calling DataMoveOperation()");
				DataMoveOperation();
				if(Result=="Pass")
				{
					logger.info("Final message: Pass Test9F Pass for front Camera image capture");
					System.out.println("Final message: Pass Test9F Pass for front Camera image capture");
					logger.info("Test: End");
					System.out.println("Test: End");
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					
				}
				else
				{
					
					logger.info("Final message: Fail Test9F Fail for front Camera image capture");
					System.out.println("Final message: Fail Test9F Fail for front Camera image capture");
					logger.info("Test: End");
					System.out.println("Test: End");
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				}
			
			
			
			
			
			
			
			
			
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			
		
		}
		catch (Exception e) {

			logger.info("Fail: Test9F fail for Fail Count Issue");
			System.out.println("\nFail: Test9F fail for Fail Count Issue");
			
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final message: Fail Test9F for front camera image capture");
			logger.info("Final message: Fail Test9F for front camera image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			
			}
}

	public void DataMoveOperation() throws  IOException, InterruptedException {
  		
  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
  			//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
  		isPaused = true;
  		try {
  		logger.info("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
  		System.out.println("Re-launch file manager application and select external storage for data move operation, select all front camera images files present in camera folder and move to Test9F folder");
  		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.nbu.files", "com.google.android.apps.nbu.files.home.HomeActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  		
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
		
		logger.info("Name folder as Test9F");
		System.out.println("Name folder as Test9F");
		driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
		driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F");
		TimeUnit.SECONDS.sleep(5);
		
		//Click Create option
		logger.info("Accept create folder");
		System.out.println("Accept create folder");
		driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
		TimeUnit.SECONDS.sleep(30);
		
		logger.info("Cut paste   operation completed successfully");
		System.out.println("Cut paste   operation completed successfully");
  		
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
  	
		logger.info("Test9F: Data move operation completed successfully");
		 System.out.println("Test9F: Data move operation completed successfully");
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
			logger.info("Pass: Test9F Pass for data move operation successfully");	
			System.out.println("Pass: Test9F Pass for data move operation successfully");	
		}
  		
  		
  		}
  		catch (Exception e) {
            e.printStackTrace();
            if (Result == "Fail")
			{
            	logger.info("Fail: Test9F Fail for data move operation ");
				System.out.println("Fail: Test9F Fail for data move operation");	
			}
		
        }
  		
  	}  	
}