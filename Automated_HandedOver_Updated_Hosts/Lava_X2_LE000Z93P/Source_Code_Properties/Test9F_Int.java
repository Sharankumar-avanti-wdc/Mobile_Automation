package Lava_X2_LE000Z93P;

import org.testng.annotations.Test;
import Lava_X2_LE000Z93P.Test9;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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

public class Test9F_Int
{
	private static final String Pass = null;
	// initializing the driver instance and declarind desired capabilities
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "LAVA  X2");
		dc.setCapability(MobileCapabilityType.UDID, "X29H22CB001024");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void FrontPictureCapture() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		logger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("status_log_Test9F_Int.log");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter = new SimpleFormatter();  
		fileHandler.setFormatter(formatter); 
		logger.info("Test: Start");
		System.out.println("Test: Start");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9F_Int Scenario is as follows:");
		logger.info("1.Launch camera application, set Internal as a Storage option, start Front camera image picture capture for all Host front resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9F_Int Scenario is as follows:");
		System.out.println("Launch camera application, set Internal as a Storage option, start Front camera image picture capture for all Host front resolutions");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		// initialize sum
		int TotalCount = 0; 
		int i;

		//clear recent apps
		((StartsActivity) driver).startActivity(new Activity("com.android.launcher3", "com.android.launcher3.uioverrides.QuickstepLauncher"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//Launch Camera Application for Front camera picture Capture for all Host resolutions.
			logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			((StartsActivity) driver).startActivity(new Activity("com.android.camera", "com.android.camera.Camera"));
			TimeUnit.SECONDS.sleep(5);
			try 
			{ 
				logger.info("IF Change to uInternal storage notification pop-up exists select Cancel Option");
				System.out.println("IF Change to uInternal storage notification pop-up exists select Cancel Option");

				driver.findElement(By.xpath("//*[@bounds='[100,869][140,909]']")).click();
				TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//*[@text='I know']")).click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch(Exception exp)
			{ 
				logger.info("change to Internal storage element not found : "+exp); 
				System.out.println("change to Internal storage element not found : "+exp); 
			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Test9F_Int_Fcam_res: 4 resolutions supported");
			System.out.println("Test9F_Int_Fcam_res: 4 resolutions supported");
			//click on front camera
			logger.info("click on front camera");
			System.out.println("click on front camera");
			driver.findElement(By.xpath("//*[@bounds='[600,1384][672,1456]']")).click();
			TimeUnit.SECONDS.sleep(5);
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[192,159][240,207]']")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@bounds='[394,514][481,547]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Picture size option");
			System.out.println("Select Picture size option");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 1st resolution
			logger.info("Select first Image Resoution: 5MP(4:3) ");
			System.out.println("Select first Image Resoution:5MP(4:3) ");
			driver.findElement(By.xpath("//*[@text='5MP(4:3)']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
			System.out.println("totalPictureCountFront= "+ totalPictureCountFront);
			int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);
			// capture  pics for the selected resolution
			int j=0;
			for(j = 0; j < totalPictureCountFrontInt; j++)
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 1st Resolutions  : "+j);
				logger.info("clicking Image of 1st Resolutions  : "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("front camera first resolution:" + j + " images Captured succesfull");
			System.out.println("front camera first resolution:" + j + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[192,159][240,207]']")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@bounds='[394,514][481,547]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Picture size option");
			System.out.println("Select Picture size option");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2nd resolution
			logger.info("Select second Image Resoution: 2.1MP(16:9)");
			System.out.println("Select second Image Resoution: 2.1MP(16:9)");
			driver.findElement(By.xpath("//*[@text='2.1MP(16:9)']")).click();
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
			System.out.println("totalPictureCountFront1= "+ totalPictureCountFront1);
			int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);
			// capture  pics for the selected resolution
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountFront1Int; j1++)
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 2nd Resolutions  : "+j1);
				logger.info("clicking Image of 2nd Resolutions  : "+j1);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("front camera second resolution:" + j1 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[192,159][240,207]']")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@bounds='[394,514][481,547]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Picture size option");
			System.out.println("Select Picture size option");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2ND resolution
			logger.info("Select first third Resoution:1MP(18:9)");
			System.out.println("Select third Image Resoution: 1MP(18:9)");
			driver.findElement(By.xpath("//*[@text='1MP(18:9)']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
			System.out.println("totalPictureCountFront2= "+ totalPictureCountFront2);
			int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
			// capture  pics for the selected resolution
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 3rd Resolutions : "+j2);
				logger.info("clicking Image of 3rd Resolutions : "+j2);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("front camera third resolution:" + j2 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[192,159][240,207]']")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@bounds='[394,514][481,547]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select Picture size option");
			System.out.println("Select Picture size option");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 4th resolution
			logger.info("Select fourth Image Resoution: 3.7MP(1:1)");
			System.out.println("Select fourth Image Resoution: 3.7MP(1:1)");
			driver.findElement(By.xpath("//*[@text='3.7MP(1:1)']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9F_Int.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(2);
			String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
			System.out.println("totalPictureCountFront3= "+ totalPictureCountFront3);
			int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
			// capture  pics for the selected resolution
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
			{  
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//*[@resource-id='com.android.camera:id/shutter_button']")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println("clicking Image of 4th Resolutions : "+j3);
				logger.info("clicking Image of 4th Resolutions : "+j3);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera 4th resolution:" + j3 + " images Captured succesfull" );
			logger.info("front camera 4th resolution:" + j3 + " images Captured succesfull" );
			// switch to back camera
			logger.info("click on back camera");
			System.out.println("click on back camera");
			driver.findElement(By.xpath("//*[@bounds='[600,1384][672,1456]']")).click();
			TimeUnit.SECONDS.sleep(5);
			TotalCount += j+j1+j2+j3;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result ="Pass";
			logger.info("Launch file manager application and verify captured images present  in Internal storage");
			System.out.println("Launch file manager application and verify captured images present in Internal storage");
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
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element4 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Click External storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement SDCard =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
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
			MobileElement Camera2 =	driver.findElement(By.xpath("//*[@text='Camera']"));
			Camera2.click();
			TimeUnit.SECONDS.sleep(3);
			try {
				//long press and Hold RAW folder and delete
				MobileElement Folder =	driver.findElement(By.xpath("//*[@text='Raw']"));
				TouchAction touchAction3=new TouchAction(driver);
				touchAction3.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(3)).withElement (ElementOption.element (Folder))).release().perform();
				TimeUnit.SECONDS.sleep(10);
				//Click More options
				logger.info("Click More options");
				System.out.println("Click More options");
				MobileElement MoreOptions4 =	driver.findElement(By.xpath("//*[@content-desc='More options']"));
				MoreOptions4.click();
				TimeUnit.SECONDS.sleep(6);
				logger.info("Click Delete options");
				System.out.println("Click Delete options");
				MobileElement Delete = driver.findElement(By.xpath("//*[@text='Delete permanently']"));
				Delete.click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Click Confirm Delete options");
				System.out.println("Click Confirm Delete options");
				MobileElement ConfirmDelete = driver.findElement(By.xpath("//*[@text='Delete']")); 
				ConfirmDelete.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
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
			//System.out.println("Total Image");
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
			TotalImage.click();
			System.out.print("Test9F_Int_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 
			String str= TotalImage.getText();
			//System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			//System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop7 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	
			double TolerancePercentage = Tolerance_LevelInt/100*TotalCount;				
			//	System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>(Tolerance_LevelInt/100)*TotalCount)
			{
				logger.info("Pass: Test9F_Int pass for front Image capture");
				System.out.println("\nPass: Test9F_Int pass for front Image capture");
				System.out.println("Test9F_Int Fcam_image: " + TotalCount + "  images Captured succesfull" );
				logger.info("Test9F_Int Fcam_image: " + TotalCount + "  images Captured succesfull" );
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				TimeUnit.SECONDS.sleep(5);
				((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
				TimeUnit.SECONDS.sleep(5);
			}
			else {
				logger.info("Fail: Test9F_Int Fail for front camera Image capture");
				System.out.println("\nFail: Test9F_Int Fail for front camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			if(Result == "Fail")
			{
				System.out.println("Final Message: Fail Test9F_Int Fail for Data Move Operation");
				logger.info("Final Message: Fail Test9F_Int Fail for Data Move Operation");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			else {
				Result= "Pass";
				logger.info("Final Message: Pass Test9F_Int Pass for Front camera image capture  successfully");
				System.out.println("Final Message: Pass Test9F_Int Pass for Front camera image capture  successfully");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {
			logger.info("Fail: Test9F_Int fail for Fail Count Issue");
			System.out.println("\nFail: Test9F_Int fail for Fail Count Issue");
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final Message: Fail Test9F_Int for front camera image capture");
			logger.info("Final Message: Fail Test9F_Int for front camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException{	   
		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		isPaused = true;
		try {
			//launch file manager application select uInternal storage-->DCIM folder-->Camera folder-->Select all back camera front camera videos create BCFC_Videos folder and cut paste all videos in BCFC_Cameravideos folder
			logger.info("launch file manager application select Internal storage-->DCIM folder-->Camera folder-->Select all front camera images Test9F_Int and cut paste all images in Test9F_Int folder");
			System.out.println("launch file manager application select Internal storage-->DCIM folder-->Camera folder-->Select all front camera images Test9F_Int and cut paste all images in Test9F_Int folder");
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
			logger.info("Swipe up to select Internal storage");
			System.out.println("Swipe up to select Internal storage");
			MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"Internal storage\"))"));
			TimeUnit.SECONDS.sleep(5);
			//Click External storage
			logger.info("Select Internal storage");
			System.out.println("Select Internal storage");
			MobileElement InternalStorage =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			InternalStorage.click();
			TimeUnit.SECONDS.sleep(6);
			//Select DCIM Folder
			//Select DCIM Folder
			MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					".scrollIntoView(new UiSelector().text(\"DCIM\"))"));
			TimeUnit.SECONDS.sleep(5);
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
			logger.info("Select Internal storage");
			System.out.println("select Internal storage");
			MobileElement uSD =	driver.findElement(By.xpath("//*[@text='Internal storage']"));
			uSD.click();
			TimeUnit.SECONDS.sleep(6);
			//Click  Move to Option
			logger.info("Select ADD NEW Folder option");
			System.out.println("Select ADD NEW Folder option");
			MobileElement CreateFolder =	driver.findElement(By.xpath("//*[@text='Add new folder']"));
			CreateFolder.click();
			TimeUnit.SECONDS.sleep(6);
			logger.info("Name folder as Test9F_Int");
			System.out.println("Name folder as Test9F_Int");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9F_Int");
			TimeUnit.SECONDS.sleep(5);
			//Click Create option
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
			TimeUnit.SECONDS.sleep(120);
			logger.info("Cut paste  video files operation completed successfully");
			System.out.println("Cut paste  video files operation completed successfully");
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result = "Pass";
			if(Result == "Pass")
			{
				logger.info("Pass: Test9F_Int Pass for data move operation successfully");	
				System.out.println("Pass: Test9F_Int Pass for data move operation successfully");	
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
		}
		catch(Exception exp)
		{ 
			exp.printStackTrace();
			Result = "Fail";
			logger.info("Fail: Test9F_Int Fail for data move operation ");
			System.out.println("Fail: Test9F_Int Fail for data move operation");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		}
	}
}


