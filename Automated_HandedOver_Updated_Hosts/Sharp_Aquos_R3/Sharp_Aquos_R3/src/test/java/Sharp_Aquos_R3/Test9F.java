package Sharp_Aquos_R3;

import org.testng.annotations.Test;

import Sharp_Aquos_R3.Test9;

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

public class Test9F
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
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AQUOS R3");
		dc.setCapability(MobileCapabilityType.UDID, "357787090740490");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void FrontPictureCapture() throws InterruptedException, SecurityException, IOException {
		TimeUnit.SECONDS.sleep(5);
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
		System.out.println("Launch camera application, set uSD as a Storage option, start Front camera image picture capture for all Host front resolutions");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		SetUp();
		String Result = "Fail";
		// initialize sum
		int TotalCount = 0; 
		int i;
		//clear recent apps
		((StartsActivity) driver).startActivity(new Activity("com.nttdocomo.android.dhome", "com.nttdocomo.android.dhome.HomeActivity"));
		TimeUnit.SECONDS.sleep(5);
		try {
			//Launch Camera Application for Front camera picture Capture for all Host resolutions.
			logger.info("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			System.out.println("Launch Camera Application for Front camera picture Capture for all Host resolutions");
			((StartsActivity) driver).startActivity(new Activity("jp.co.sharp.android.camera", "jp.co.sharp.android.camera.stillimagecamera.Camera"));
			TimeUnit.SECONDS.sleep(5);
			//If Permission request pop-up exists allow permissions
			try 
			{ 
				logger.info("Permission request");
				System.out.println("Permission request");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Agree\")").click();
				TimeUnit.SECONDS.sleep(5);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 

			}
			try
			{
				logger.info("Allow Camera to access this device’s location?");
				System.out.println("Allow Camera to access this device’s location?");
				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"WHILE USING THE APP\")").click();
				TimeUnit.SECONDS.sleep(5);
				driver.findElement(By.xpath("//*[@text='START CAPTURE']")).click();
				TimeUnit.SECONDS.sleep(3);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(5);
			try
			{

				((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Picture\")").click();
				TimeUnit.SECONDS.sleep(5);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			TimeUnit.SECONDS.sleep(2);
			//front camera 4 image resolutions supports
			logger.info("Test9F_Fcam_res: 4 resolutions supported");
			System.out.println("Test9F_Fcam_res: 4 resolutions supported");
			//Click On Settings
			logger.info("Select settings option");
			System.out.println("Select settings option");
			driver.findElement(By.xpath("//*[@bounds='[1226,164][1376,308]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select common");
			System.out.println("select common");
			driver.findElement(By.xpath("//*[@text='COMMON']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Swipe Up and Search for Storage Option and Click 
			logger.info("Save To settings option");
			System.out.println("Save To settings option");
			String text = "Save To";
			driver.findElement(By.xpath("//*[@text='Save To']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select sd card option");
			System.out.println("Select sd card option");
			driver.findElement(By.xpath("//*[@text='SD card']")).click();
			TimeUnit.SECONDS.sleep(5);
			//	driver.findElement(By.xpath("//*[@resource-id='jp.co.sharp.android.camera:id/id_menu_setting_title_arrow']")).click();
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(5);

			//Click On Click on front camera
			logger.info("Click on front camera");
			System.out.println("Click on front camera");
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout[6]/android.widget.ImageButton")).click();
			TimeUnit.SECONDS.sleep(3);
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[1226,164][1376,308]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select 1st resolution
			logger.info("Select first Image Resoution: 10.8M (4656x2328) ");
			System.out.println("Select first Image Resoution:10.8M (4656x2328) ");
			driver.findElement(By.xpath("//*[@bounds='[288,396][776,556]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront = prop.getProperty("totalPictureCountFront");  
			System.out.println("totalPictureCountFront = "+ totalPictureCountFront);
			int totalPictureCountFrontInt=Integer.parseInt(totalPictureCountFront);
			// capture  pics for the selected resolution
			int j=0;
			for(j = 0; j < totalPictureCountFrontInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("jp.co.sharp.android.camera:id/ui_stillcamerashutter")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 1st Resolutions 10.8M (4656x2328) : "+j);
				logger.info("clicking Image of 1st Resolutions 10.8M (4656x2328) : "+j);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("front camera first resolution:" + j + " images Captured succesfull");
			System.out.println("front camera first resolution:" + j + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[1226,164][1376,308]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);

			//Select 2nd resolution
			logger.info("Select second Image Resoution: 12.2M (4656x2620)");
			System.out.println("Select second Image Resoution: 12.2M (4656x2620)");
			driver.findElement(By.xpath("//*[@bounds='[288,656][774,816]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront1 = prop.getProperty("totalPictureCountFront1");  
			System.out.println("totalPictureCountFront1 = "+ totalPictureCountFront1);
			int totalPictureCountFront1Int=Integer.parseInt(totalPictureCountFront1);
			// capture  pics for the selected resolution
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountFront1Int; j1++)  
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("jp.co.sharp.android.camera:id/ui_stillcamerashutter")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 2nd Resolutions 12.2M (4656x2620) : "+j1);
				logger.info("clicking Image of 2nd Resolutions 12.2M (4656x2620) : "+j1);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera second resolution:" + j1 + " images Captured succesfull" );
			logger.info("front camera second resolution:" + j1 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[1226,164][1376,308]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 2ND resolution
			logger.info("Select first third Resoution:16.3M (4656x3492)");
			System.out.println("Select third Image Resoution: 16.3M (4656x3492)");
			driver.findElement(By.xpath("//*[@bounds='[288,916][774,1076]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront2 = prop.getProperty("totalPictureCountFront2");  
			System.out.println("totalPictureCountFront2 = "+ totalPictureCountFront2);
			int totalPictureCountFront2Int=Integer.parseInt(totalPictureCountFront2);
			// capture  pics for the selected resolution
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountFront2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("jp.co.sharp.android.camera:id/ui_stillcamerashutter")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 3rd Resolutions 16.3M (4656x3492): "+j2);
				logger.info("clicking Image of 3rd Resolutions 16.3M (4656x3492): "+j2);

			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("front camera third resolution:" + j2 + " images Captured succesfull" );
			logger.info("front camera third resolution:" + j2 + " images Captured succesfull" );
			//click on camera resolutions
			logger.info("Select  settings");
			System.out.println("Select settings");
			driver.findElement(By.xpath("//*[@bounds='[1226,164][1376,308]']")).click();
			TimeUnit.SECONDS.sleep(3);
			logger.info("Select camera resolution");
			System.out.println("Select camera resolution");
			driver.findElement(By.xpath("//*[@text='Picture Size']")).click();
			TimeUnit.SECONDS.sleep(3);
			//Select 4th resolution
			logger.info("Select fourth Image Resoution: Images with balanced composition are automatically saved.");
			System.out.println("Select fourth Image Resoution: Images with balanced composition are automatically saved.");
			driver.findElement(By.xpath("//*[@bounds='[288,1190][1160,1317]']")).click();
			TimeUnit.SECONDS.sleep(3);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(4);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountFront3 = prop.getProperty("totalPictureCountFront3");  
			System.out.println("totalPictureCountFront3 = "+ totalPictureCountFront3);
			int totalPictureCountFront3Int=Integer.parseInt(totalPictureCountFront3);
			// capture  pics for the selected resolution
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountFront3Int; j3++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.id("jp.co.sharp.android.camera:id/ui_stillcamerashutter")).click();
				TimeUnit.SECONDS.sleep(2);
				System.out.println("clicking Image of 4th Resolutions Images with balanced composition are automatically saved.: "+j3);
				logger.info("clicking Image of 4th Resolutions Images with balanced composition are automatically saved.: "+j3);

			}
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Back camera fourth resolution:" + j3 + " images Captured succesfull" );
			logger.info("Back camera fourth resolution:" + j3 + " images Captured succesfull" );
			TotalCount += j+j1+j2+j3;
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			// switch to back camera
			logger.info("switch to back camera");
			System.out.println("switch to back camera");
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout[2]/android.widget.FrameLayout[6]/android.widget.ImageButton")).click();		
			TimeUnit.SECONDS.sleep(5);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(5);
			Result ="Pass";
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
			MobileElement Camera2 =	driver.findElement(By.xpath("//*[@text='101INCAM']"));
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
			System.out.print("Test9F_Fcam_image: " +TotalImage.getText() +  " images Captured succesfull" + "\n");
			TimeUnit.SECONDS.sleep(3); 
			String str= TotalImage.getText();
			System.out.println("Actual Value:"+str);
			String TotalImageInt= str.replaceAll("[^0-9]", "");
			System.out.println("Interger value:"+TotalImageInt);
			int TotalImageCaptured=Integer.valueOf(TotalImageInt);
			Properties prop5 = new Properties();
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String Tolerance_Level = prop.getProperty("Tolerance_Level");  
			System.out.println("Tolerance_Level = "+ Tolerance_Level);
			int Tolerance_LevelInt=Integer.parseInt(Tolerance_Level);	
			double TolerancePercentage = Tolerance_LevelInt/100*TotalCount;				
			//	System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>(Tolerance_LevelInt/100)*TotalCount)
			{
				logger.info("Pass: Test9F pass for rear Image capture");
				System.out.println("\nPass: Test9F pass for rear Image capture");
				System.out.println("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9F Fcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
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
				logger.info("Fail: Test9F Fail for front camera Image capture");
				System.out.println("\nFail: Test9F Fail for front camera Image capture");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

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
				logger.info("Final message: Pass Test9F Pass for Front camera image capture  successfully");
				System.out.println("Final message: Pass Test9F Pass for Front camera image capture  successfully");
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
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}
	}
	public void DataMoveOperation() throws  IOException, InterruptedException {		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
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
		//Select Test_file folder
		logger.info("Select camera  folder");
		System.out.println("Select camera folder");
		MobileElement Camera = driver.findElement(By.xpath("//*[@text='101INCAM']")); 
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
		logger.info("Cut paste  operation completed successfully");
		System.out.println("Cut paste  operation completed successfully");
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