package Samsung_Galaxy_M32_5G;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Samsung_Galaxy_M32_5G.Test9F;
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
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M32 5G");
			dc.setCapability(MobileCapabilityType.UDID, "RZCRA03GMFL");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
			
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
			System.out.println("Test: Start");
	        logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
	        logger.info("Test9F Scenario is as follows:");
	        logger.info("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
			logger.info("Setting up the appium desired capabilities");
			 System.out.println("Test9F Scenario is as follows:");
		     System.out.println("1.Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		     System.out.println("Setting up the appium desired capabilities");
		     logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			 System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			SetUp();
			String Result = "Fail";
			int TotalCount = 0; // initialize sum
			int i;
	  		//Clear Recent Apps Before Camera Lauch
			logger.info("Launch Home screen and Clear recent apps");
	  		System.out.println("Launch Home screen and Clear recent apps");
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
try {
	  		//Launch Camera Application for Front camera picture Capture for all Host resolutions.
	  		logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
	  		System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
	  		((StartsActivity) driver).startActivity(new Activity("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
	  		logger.info("if SD Card Pop Exists select Cancel Option");
	  		System.out.println("if SD Card Pop Exists select Cancel Option");
	  		try 
	  		{ 
	  			MobileElement changeToSDCard = driver.findElement(By.id("android:id/button2")); 
	  			TimeUnit.SECONDS.sleep(2);
	  			changeToSDCard.click();
	  		} 
	  		catch(Exception exp)
	  		{ 
	  				// Block of code to handle errors
	  			System.out.println("change to SD card element not found : "+exp); 
	  		}
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		//Cancel Location Access
	  		logger.info("if Location Permission Pop up Exists select Cancel Option");
	  		System.out.println("if Location Permission Pop up Exists select Cancel Option");
	  		try 
	  		{ 
	  			MobileElement Location = driver.findElement(By.id("android:id/button2")); 
	  			TimeUnit.SECONDS.sleep(2);
	  			Location.click();
	  		} 
	  		catch(Exception exp)
	  		{ 
	  				// Block of code to handle errors
	  			System.out.println("Disable Location access : "+exp); 
	  		}
	  		TimeUnit.SECONDS.sleep(5);
	  	
	  		//Switch Front Camera
            try {
				
				MobileElement SwitchToFrontCamera = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to front camera\"]"));
				TimeUnit.SECONDS.sleep(2);
				SwitchToFrontCamera.click();
				logger.info("Switch To front Camera if current Exiting camera is in Back camera mode");
				System.out.println("Switch To front Camera if current Exiting camera is in Back camera mode");
			}
			
			catch(Exception exp)
			{ 
					// Block of code to handle errors
				logger.info("Current Existing Camera is Back Camera");
				System.out.println("Current Existing Camera is Back Camera");
			}
          //mention default image resolution
			logger.info("Test9F_Fcam_res: 4 resolutions supported");
				System.out.println("Test9F_Fcam_res: 4 resolutions supported");
	  		//Click On Settings
            logger.info("Click Settings option");
	  		System.out.println("Click Settings option");
				MobileElement Settings = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Go to Settings\"]"));
				Settings.click();
				TimeUnit.SECONDS.sleep(5);
				
				logger.info("Swipe up and select storage location option");
				System.out.println("Swipe up and select storage location option");
				//Swipe Up and Search for Storage Option and Click 
				String text = "Storage location";
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("+ "new UiSelector().text(\""+text+"\"));"));
				TimeUnit.SECONDS.sleep(5);
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Storage location\")").click();
				TimeUnit.SECONDS.sleep(5);
				
				//Select SD Card
				logger.info("Select SD as storage option");
				System.out.println("Select SD as storage option");
				MobileElement SDCard = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
				TimeUnit.SECONDS.sleep(5);
				SDCard.click();
			
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		  		TimeUnit.SECONDS.sleep(2);
	  		
		  	//Click On Rear Image Resolution to select 1ST resolution
		  		logger.info("Select Front Image size");
		  		System.out.println("Select Front Image size");
		  		MobileElement RearImage = driver.findElement(By.xpath("//*[@text='Ratio']"));
	  			RearImage.click();
	  			
	  		//Select 1st resolution
	  			logger.info("Select First front Image Resoution: 3:4");
	  			System.out.println("Select First front Image Resoution: 3:4");
	  			MobileElement FirstRes = driver.findElement(By.xpath("//*[@bounds='[138,73][234,169]']"));
	  			FirstRes.click();
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
		  		System.out.println("Capture Images");
		  		int j=0;
		  		for(j = 0; j < totalPictureCountFrontInt; j++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
		  			 TimeUnit.SECONDS.sleep(2);
		  			System.out.println("clicking First resolution Image"+j);
		  			logger.info("clicking First resolution Image"+j);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		logger.info("front camera first resolution:" + j + " images Captured succesfull");
		  		System.out.println("front camera first resolution:" + j + " images Captured succesfull" );
		  		
		  	//Click On Rear Image Resolution to select 2nd resolution
		  		logger.info("Select Front Image size");
		  		System.out.println("Select Front Image size");
		  		MobileElement RearImage1 = driver.findElement(By.xpath("//*[@text='Ratio']"));
	  			RearImage1.click();
	  			
	  		//Select 2nd resolution
	  			logger.info("Select second front Image Resoution: 9:16");
	  			System.out.println("Select second front Image Resoution: 9:16");
	  			MobileElement SecRes = driver.findElement(By.xpath("//*[@bounds='[254,73][350,169]']"));
	  			SecRes.click();
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
		  		System.out.println("Capture Images");
		  		int j1=0;
		  		for(j1 = 0; j1 < totalPictureCountFront1Int; j1++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
		  			 TimeUnit.SECONDS.sleep(2);
		  			System.out.println("clicking Second resolution Image"+j1);
		  			logger.info("clicking Second resolution Image"+j1);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		System.out.println("front camera second resolution:" + j1 + " images Captured succesfull" );
		  		logger.info("front camera second resolution:" + j1 + " images Captured succesfull" );

		  		
		  	//Click On Rear Image Resolution to select 3rd resolution
		  		logger.info("Select Front Image size");
		  		System.out.println("Select Front Image size");
		  		MobileElement RearImage2 = driver.findElement(By.xpath("//*[@text='Ratio']"));
	  			RearImage2.click();
	  			
	  		//Select 3rd resolution
	  			logger.info("Select Third front Image Resoution: 1:1");
	  			System.out.println("Select Third front Image Resoution: 1:1");
	  			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@bounds='[370,73][466,169]']"));
	  			ThirdRes.click();
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
		  		System.out.println("Capture Images");
		  		int j2=0;
		  		for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
		  			 TimeUnit.SECONDS.sleep(2);
		  			System.out.println("clicking Third resolution Image"+j2);
		  			logger.info("clicking Third resolution Image"+j2);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		System.out.println("front camera third resolution:" + j2 + " images Captured succesfull" );
		  		logger.info("front camera third  resolution:" + j2 + " images Captured succesfull" );
		  		
		  	//Click On Rear Image Resolution to select 4th resolution
		  		logger.info("Select Front Image size");
		  		System.out.println("Select Front Image size");
		  		MobileElement RearImage3 = driver.findElement(By.xpath("//*[@text='Ratio']"));
	  			RearImage3.click();
	  			
	  		//Select 4th resolution
	  			logger.info("Select Fourth front Image Resoution: Full");
	  			System.out.println("Select Fourth front Image Resoution: Full");
	  			MobileElement FourthRes = driver.findElement(By.xpath("//*[@bounds='[486,73][582,169]']"));
	  			FourthRes.click();
		  		TimeUnit.SECONDS.sleep(2);
		  		
		  		Properties prop3 = new Properties();
		  		// Load properties file
		  		prop.load(Test9F.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		  		TimeUnit.SECONDS.sleep(5);
		  		String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
		  		System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront);
		  		int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
		  		// capture  pics for the selected resolution
		  		logger.info("Capture Images");
		  		System.out.println("Capture Images");
		  		int j3=0;
		  		for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
		  		{ 
		  			TimeUnit.SECONDS.sleep(2);
		  			driver.findElement(By.id("com.sec.android.app.camera:id/normal_center_button")).click();
		  			 TimeUnit.SECONDS.sleep(2);
		  			System.out.println("clicking Fourth resolution Image"+j3);
		  			logger.info("clicking Fourth resolution Image"+j3);
		  		}
		  		TimeUnit.SECONDS.sleep(2);
		  		System.out.println("front camera fourth resolution:" + j3 + " images Captured succesfull" );
		  		logger.info("front camera fourth  resolution:" + j3 + " images Captured succesfull" );
	  		// switch to back camera
	  		TimeUnit.SECONDS.sleep(5);
	  		driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
	  		TimeUnit.SECONDS.sleep(5);
	  		
	  		TotalCount += j+j1+j2+j3;

			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			
			//driver.findElement(By.id("com.sec.android.app.camera:id/switch_camera_button")).click();
			//TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
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
			 System.out.print("Test9F_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
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

				System.out.println("\nPass: Test9F pass for rear Image capture");
				System.out.println("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				
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
				
				logger.info("Fail: Test9F Fail for rear camera Image capture");
				System.out.println("\nFail: Test9F Fail for rear camera Image capture");
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
				System.out.println("Final Message: Fail Test9F Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9F Fail for Data Move Operation");
				logger.info("Test: End");
		   		 System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
			}
			else {
				Result= "Pass";
				logger.info("Final message: Pass Test9F Pass for Rear camera image capture  successfully");
				System.out.println("Final message: Pass Test9F Pass for Rear camera image capture  successfully");
				logger.info("Test: End");
		   		 System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				
			}
			
		}
		catch (Exception e) {

			logger.info("Fail: Test9F fail for Fail Count Issue");
			System.out.println("\nFail: Test9F fail for Fail Count Issue");
			logger.info("Fail: Test9F fail for rear Image capture");
			System.out.println("\nFail: Test9F fail for rear Image capture");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			//Calling DataMoveOperation
			logger.info("Calling DataMoveOperation");
			System.out.println("Calling DataMoveOperation");
		    DataMoveOperation();
			System.out.println("Final message: Fail Test9F for rear camera image capture");
			logger.info("Final message: Fail TestF9 for rear camera image capture");
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
				logger.info("Name folder as Test9F");
				System.out.println("Name folder as Test9F");
				driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).clear();
				driver.findElement(By.id("com.sec.android.app.myfiles:id/text_input")).sendKeys("Test9F");
				TimeUnit.SECONDS.sleep(5);
				
				//Click Create option
				logger.info("click create");
				System.out.println("click create");
				driver.findElement(By.xpath("//*[@text='Create']")).click();
				TimeUnit.SECONDS.sleep(2);
				
				//Select DCIM Folder
				MobileElement element3 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
						".scrollIntoView(new UiSelector().text(\"Test9F\"))"));
				logger.info("Select DCIM folder");
				System.out.println("Select DCIM Folder");
				MobileElement Test9F =	driver.findElement(By.xpath("//*[@text='Test9F']"));
				Test9F.click();
				TimeUnit.SECONDS.sleep(3);

				//Click Create option
				logger.info("Move here");
				System.out.println("Move here");
				driver.findElement(By.xpath("//*[@text='Move here']")).click();
				TimeUnit.SECONDS.sleep(120);
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
					logger.info("Pass: Test9F Pass for data move operation successfully");	
					System.out.println("Pass: Test9F Pass for data move operation successfully");	
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				}
			}
			catch(Exception exp)
			{ 
				exp.printStackTrace();
				Result = "Fail";
				logger.info("Fail: Test9F Fail for data move operation ");
				System.out.println("Fail: Test9F Fail for data move operation");
					logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
					System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}
		}
	}

