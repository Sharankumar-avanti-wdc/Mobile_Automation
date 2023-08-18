package Samsung_Galaxy_Tab_A7_Lite;

import org.testng.annotations.Test;
import Samsung_Galaxy_Tab_A7_Lite.Test9;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
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
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
  
  public class Test9
  {
	// initializing the driver instance and declarind desired capabilities
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
	  	
	  	@Test
	  	public void RearPictureCapture() throws InterruptedException, SecurityException, IOException {
	  		TimeUnit.SECONDS.sleep(5);
	  		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
			logger.setUseParentHandlers(false);
			FileHandler fileHandler = new FileHandler("status_log_Test9.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fileHandler.setFormatter(formatter); 
	        logger.info("Test: Start");
	        System.out.println("Test: Start");
	        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        logger.info("Test9 Scenario is follows:");
	        logger.info("1.Launch camera application, set uSD as a Storage option, start rear camera Image capture for all host resolutions");
			logger.info("Setting up the appium desired capabilities");
			 System.out.println("Test9 Scenario is follows:");
		     System.out.println("1.Launch camera application, set USD as a Storage option, start rear camera Image capture for all host resolutions");
		     System.out.println("Setting up the appium desired capabilities");
		     logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	     
			SetUp();
			String Result = "Fail";
			int TotalCount = 0; // initialize sum
			int i;
	  		
	  		//Launch Home Screen and Clear recent apps
	  		logger.info("Launch Home Screen and Clear recent");
	  		System.out.println("Launch Home Screen and Clear recent");
	  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.launcher", "com.sec.android.app.launcher.activities.LauncherActivity"));
	  		TimeUnit.SECONDS.sleep(5);
	  		((PressesKey) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	  		TimeUnit.SECONDS.sleep(5);
	  		
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
	  		//Launch Camera application for rear Picture capture for all host resolution
	  		logger.info("Launch Camera application for rear Picture capture for all host resolution");
	  		System.out.println("Launch Camera application for rear Picture capture for all host resolution");
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
	  		
	  		//Switch to rear camera mode if the current existing is front camera mode
	  		try {
				
	  			logger.info("Switch To Rear Camera mode if current Exiting camera is Front camera mode");
				System.out.println("Switch To Rear Camera mode if current Exiting camera is Front camera mode");
				MobileElement SwitchToBackCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to rear camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToBackCamera.click();
				}
			
			catch(Exception exp)
			{ 
					// Block of code to handle errors
				logger.info("Current Existing Camera is Rear Camera mode."); 
				System.out.println("Current Existing Camera is Rear Camera mode."); 
			}
	  		
	  	//mention default resolution
			logger.info("Test9_Bcam_Image: 0 resolutions supported");
			System.out.println("Test9_Bcam_Image: 0 resolutions supported");
	  		
			logger.info("Test9, we are using only default resolution for capturing images, unable select resolution using Appium inspector,because within sec resolution tab will come back.");
			System.out.println("Test9, we are using only default resolution for capturing images, unable select resolution using Appium inspector,because within sec resolution tab will come back.");
	  		
	  		//Click settings options
	  		logger.info("Click Settings option");
	  		System.out.println("Click Settings option");
	  		MobileElement Settings = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/setting_btn']"));
			TimeUnit.SECONDS.sleep(5);
			Settings.click();
			//Swipe Up and select storage option
			logger.info("Search for Storage location");
			System.out.println("Search for Storage location");
			String text = "Storage location";
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
			TimeUnit.SECONDS.sleep(5);
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
			TimeUnit.SECONDS.sleep(5);
			
			//Select SD Card
			logger.info("Select SD as storage option");
			System.out.println("Select SD as storage option");
			((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SD card\")").click();
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		
	  		
	  	//Click On Rear Image Resolution to select first resolution
	  		//logger.info("Select Rear Image Size");
	  		//System.out.println("Select Rear Image Size");
	  		//MobileElement RearImage = driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/ratio_switcher']"));
  			//RearImage.click();
  			
  			
  		//Select 1st resolution
  			logger.info("Select first Image Resoution: BACK_CAMERA_PICTURE_RATIO_NORMAL");
  			System.out.println("Select first Image Resoution: BACK_CAMERA_PICTURE_RATIO_NORMAL");
  			//MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[359,97][440,178]']"));
  			//FirstRes.click();
	  		//TimeUnit.SECONDS.sleep(2);
	  		
	  		Properties prop = new Properties();
	  		// Load properties file
	  		prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
	  		TimeUnit.SECONDS.sleep(5);
	  		String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
	  		System.out.println("totalPictureCountRear = "+ totalPictureCountRear);
	  		int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
	  		
	  		// capture  pics for the selected resolution
	  		logger.info("Capture Images");
	  		System.out.println("Capture Images");
	  		int j=0;
	  		for(j = 0; j < totalPictureCountRearInt; j++) 
	  		{ 
	  			TimeUnit.SECONDS.sleep(2);
	  			driver.findElement(By.id("com.sec.android.app.camera:id/shutter_button")).click();
	  			 TimeUnit.SECONDS.sleep(6);
	  			System.out.println("clicking First   Resolution Image"+j);
	  			logger.info("clicking First  Resolution Image"+j);
	  		}
	  		TimeUnit.SECONDS.sleep(2);
	  		System.out.println("Back camera first resolution:" + j + " images Captured succesfull");
	  		System.out.println("Back camera first resolution:" + j + " images Captured succesfull" );
	  		
	  	//Sum total of User provided images resolution count 
			TotalCount += j;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	  		TimeUnit.SECONDS.sleep(2);
	  		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	  		TimeUnit.SECONDS.sleep(2);
//Launch file manager application and verify image capture in uSD card.
			
			Result= "Pass";
			logger.info("Launch file manager application and verify recorded video present  in uSD Card");
			System.out.println("Launch file manager application and verify recorded video present in uSD Card");
			((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.myfiles", "com.sec.android.app.myfiles.external.ui.MainActivity"));
	  		TimeUnit.SECONDS.sleep(5);
			
			//Swipe and Select external storage
			logger.info("Swipe up to select uSD card");
			System.out.println("Swipe up to select uSD card");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"SD card\"))"));
			//Click External storage
			logger.info("Select SD card");
			System.out.println("Select SD card");
			MobileElement SDCard1 =	driver.findElement(By.xpath("//*[@text='SD card']"));
			SDCard1.click();
			TimeUnit.SECONDS.sleep(6);

			//Swipe and Select external storage
			logger.info("Swipe up to select DCIM folder");
			System.out.println("Swipe up to select DCIM folder");
			MobileElement element5 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));

			//Select DCIM Folder
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement DCIM2 =	driver.findElement(By.xpath("//*[@text='DCIM']"));
			DCIM2.click();
			TimeUnit.SECONDS.sleep(3);
			//Select Camera folder
			logger.info("Select camera folder");
			System.out.println("Select camera folder");
			MobileElement Camera2 =	driver.findElement(By.xpath("//*[@text='Camera']"));
			Camera2.click();
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

			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.myfiles:id/actionbar_select_count']"));
			TotalImage.click();
			 System.out.print("Test9_Bcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 


			String str= TotalImage.getText();
			//System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);

			int TotalImageCaptured=Integer.valueOf(TotalImageInt);

			Properties prop5 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	



			double TolerancePercentage = (Tolerance_LevelInt/100)*TotalCount;				
			//System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>=TolerancePercentage*TotalCount)
			{
			
				
				logger.info("Pass: Test9 pass for rear Image capture");

				System.out.println("\nPass: Test9 pass for rear Image capture");
				System.out.println("Test9 Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9 Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				
			//	logger.info("Final message: Pass Test9 Pass for Rear camera image capture");
				//System.out.println("Final message: Pass Test9 Pass for Rear camera image capture");

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
				
				logger.info("Fail: Test9 Fail for rear camera Image capture");
				System.out.println("\nFail: Test9 Fail for rear camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				//logger.info("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				//System.out.println("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9 Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9 Fail for Data Move Operation");
				logger.info("Test: End");
		   		 System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
			}
			else {
				Result= "Pass";
				logger.info("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				System.out.println("Final message: Pass Test9 Pass for Rear camera image capture  successfully");
				logger.info("Test: End");
		   		 System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
			}
			
		}
		catch (Exception e) {

			logger.info("Fail: Test9 fail for Fail Count Issue");
			System.out.println("\nFail: Test9 fail for Fail Count Issue");
			logger.info("Fail: Test9 fail for rear Image capture");
			System.out.println("\nFail: Test9 fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
		    DataMoveOperation();
			System.out.println("Final message: Fail Test9 for rear camera image capture");
			logger.info("Final message: Fail Test9 for rear camera image capture");
			logger.info("Test: End");
	   		 System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			
		}
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
			logger.info("Name folder as Test9");
			System.out.println("Name folder as Test9");
			driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).clear();
			driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).sendKeys("Test9");
			TimeUnit.SECONDS.sleep(5);
			
			//Click Create option
			logger.info("click create");
			System.out.println("click create");
			driver.findElement(By.xpath("//*[@text='Create']")).click();
			TimeUnit.SECONDS.sleep(2);
			
			//Select DCIM Folder
			MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Test9\"))"));
			logger.info("Select DCIM folder");
			System.out.println("Select DCIM Folder");
			MobileElement Test9 =	driver.findElement(By.xpath("//*[@text='Test9']"));
			Test9.click();
			TimeUnit.SECONDS.sleep(3);

			//Click Create option
			logger.info("Move here");
			System.out.println("Move here");
			driver.findElement(By.xpath("//*[@text='Move here']")).click();
			TimeUnit.SECONDS.sleep(180);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");
	  		

			//logger.info("Pass: Test10 Datamove of videos files operation completed successfully");
			//System.out.println("Pass: Test10 Datamove of videos files operation completed successfully");
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
				logger.info("Pass: Test9 Pass for data move operation successfully");	
				System.out.println("Pass: Test9 Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9 Fail for data move operation ");
			System.out.println("Fail: Test9 Fail for data move operation");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}
