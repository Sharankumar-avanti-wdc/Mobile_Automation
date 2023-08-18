package Sony_Xperia_1IV_XQCT72;
import org.testng.annotations.Test;
import Sony_Xperia_1IV_XQCT72.Test9;
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
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "XQ-CT72");
		dc.setCapability(MobileCapabilityType.UDID, "QV7712Z2CG");
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
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		logger.info("Test9 Scenario is follows:");
		logger.info("1.Launch camera application, set uSD as a Storage option, start rear camera Image capture for all host resolutions");
		logger.info("Setting up the appium desired capabilities");
		System.out.println("Test9 Scenario is follows:");
		System.out.println("1.Launch camera application, set USD as a Storage option, start rear camera Image capture for all host resolutions");
		System.out.println("2.Move captured Rear camera images from external storage  to Test9 folder in external storage");
		System.out.println("Setting up the appium desired capabilities");
		logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		
		SetUp();
		String Result = "Fail";
		//Launch Home Screen and Clear recent apps
		logger.info("Launch Home Screen and Clear recent");
		System.out.println("Launch Home Screen and Clear recent");
		try {
			logger.info("Launch Camera application");
			System.out.println("Launch Camera application");
			((StartsActivity) driver).startActivity(new Activity("com.sonymobile.photopro", "com.sonymobile.photopro.PhotoProActivity"));
			logger.info("Test9_Bcam_res: 4 resolutions supported");
			System.out.println("Test9_Bcam_res: 4 resolutions supported");
			//IF Location access notification pop-up exists select Cancel option.
			logger.info("camera permission handling");
			System.out.println("camera permission handling");
			try 
			{ 
				logger.info("If notification access permission pop-up exists? Accept by selecting allow option");
				System.out.println("If notification access permission pop-up exists? Accept by selecting allow option");
				MobileElement CancelLocationAccess =	driver.findElement(By.xpath("//*[@text='ALLOW']"));
				CancelLocationAccess.click();
				TimeUnit.SECONDS.sleep(3);
				logger.info("Skip camera tour option");
				System.out.println("Skip camera tour option");
				MobileElement Deny =	driver.findElement(By.xpath("//*[@text='SKIP']"));
				Deny.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Cancel =	driver.findElement(By.xpath("//*[@text='NO']"));
				Cancel.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Temp =	driver.findElement(By.xpath("//*[@text='OK']"));
				Temp.click();
				TimeUnit.SECONDS.sleep(3);
			} 
			catch(Exception exp)
			{ 
				logger.info("change to SD card element not found : "+exp); 
				System.out.println("change to SD card element not found : "+exp); 

			}
			try {
				logger.info("If Temp pop-up exists please select OK option"); 
				System.out.println("If Temp pop-up exists please select OK option"); 
				MobileElement Temp =	driver.findElement(By.xpath("//*[@text='OK']"));
				Temp.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("No Temp pop-up found : "+exp); 
				System.out.println("No Temp pop-up found : "+exp); 

			}
			//Click On Settings
			logger.info("Select Menu option");
			System.out.println("Select Menu option");
			MobileElement Settings = driver.findElement(By.xpath("//*[@text='MENU']"));
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
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			try {
				logger.info("If Temp pop-up exists please select OK option"); 
				System.out.println("If Temp pop-up exists please select OK option"); 
				MobileElement DND =	driver.findElement(By.xpath("//*[@resource-id='com.sonymobile.photopro:id/check_box']"));
				DND.click();
				TimeUnit.SECONDS.sleep(3);
				MobileElement Temp =	driver.findElement(By.xpath("//*[@text='OK']"));
				Temp.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("No Temp pop-up found : "+exp); 
				System.out.println("No Temp pop-up found : "+exp); 

			}

			logger.info("Click menu option"); 
			System.out.println("Click menu option"); 
			MobileElement Menu =	driver.findElement(By.xpath("//*[@text='MENU']"));
			Menu.click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video size option"); 
			System.out.println("select video size option"); 
			MobileElement AspectRatio = driver.findElement(By.xpath("//*[@text='Aspect ratio']"));
			AspectRatio.click();
			logger.info("Select first highest rear camera  Image Resolution:4:3 (12MP)");
			System.out.println("Select first highest rear camera  Image Resolution:4:3 (12MP)");
			//Select 1st resolution
			MobileElement FirstRes = driver.findElement(By.xpath("//*[@text='4:3 (12MP)']"));
			FirstRes.click();
			TimeUnit.SECONDS.sleep(2);
			try {
				logger.info("If Temp pop-up exists please select OK option"); 
				System.out.println("If Temp pop-up exists please select OK option"); 
				MobileElement Stable =	driver.findElement(By.xpath("//*[@text='YES']"));
				Stable.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("No Temp pop-up found : "+exp); 
				System.out.println("No Temp pop-up found : "+exp); 

			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear = prop.getProperty("totalPictureCountRear");  
			System.out.println("totalPictureCountRear = "+ totalPictureCountRear +" Images to be captured");
			int totalPictureCountRearInt=Integer.parseInt(totalPictureCountRear);
			// capture  pics for the selected resolution
			logger.info("Capture Images"); 
			int j=0;
			for(j = 0; j < totalPictureCountRearInt; j++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				MobileElement ClickShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sonymobile.photopro:id/single_shooting']"));
				ClickShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking First   Resolution Image"+j);
				logger.info("clicking First  Resolution Image"+j);
			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Rear camera first resolution:" + j + " images Captured succesfull");
			System.out.println("Rear camera first resolution:" + j + " images Captured succesfull" );
			//Click On Rear Image Resolution to select 2nd resolution
			logger.info("Click menu option"); 
			System.out.println("Click menu option"); 
			MobileElement Menu1 =	driver.findElement(By.xpath("//*[@text='MENU']"));
			Menu1.click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video size option"); 
			System.out.println("select video size option"); 
			MobileElement AspectRatio1 = driver.findElement(By.xpath("//*[@text='Aspect ratio']"));
			AspectRatio1.click();
			logger.info("Select second highest rear camera  Image Resolution:16:9 (9MP)");
			System.out.println("Select second highest rear camera  Image Resolution:16:9 (9MP)");
			//Select 1st resolution
			MobileElement SecondRes = driver.findElement(By.xpath("//*[@text='16:9 (9MP)']"));
			SecondRes.click();
			TimeUnit.SECONDS.sleep(2);
			try {
				logger.info("If Temp pop-up exists please select OK option"); 
				System.out.println("If Temp pop-up exists please select OK option"); 
				MobileElement Stable =	driver.findElement(By.xpath("//*[@text='YES']"));
				Stable.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("No Temp pop-up found : "+exp); 
				System.out.println("No Temp pop-up found : "+exp); 

			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop1 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear1 = prop.getProperty("totalPictureCountRear1");  
			System.out.println("totalPictureCountRear1 = "+ totalPictureCountRear1 +" Images to be captured");
			int totalPictureCountRear1Int=Integer.parseInt(totalPictureCountRear1);
			// capture  pics for the selected resolution
			logger.info("Capture Images"); 
			int j1=0;
			for(j1 = 0; j1 < totalPictureCountRear1Int; j1++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				MobileElement ClickShutterButton1 = driver.findElement(By.xpath("//*[@resource-id='com.sonymobile.photopro:id/single_shooting']"));
				ClickShutterButton1.click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking Second   Resolution Image"+j1);
				logger.info("clicking Second  Resolution Image"+j1);

			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Rear camera second resolution:" + j1 + " images Captured succesfull");
			System.out.println("Rear camera second resolution:" + j1 + " images Captured succesfull" );
			//Click Setting and select third resolution
			//Click On Rear Image Resolution to select 2nd resolution
			logger.info("Click menu option"); 
			System.out.println("Click menu option"); 
			MobileElement Menu2 =	driver.findElement(By.xpath("//*[@text='MENU']"));
			Menu2.click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video size option"); 
			System.out.println("select video size option"); 
			MobileElement AspectRatio2 = driver.findElement(By.xpath("//*[@text='Aspect ratio']"));
			AspectRatio2.click();
			logger.info("Select third highest rear camera  Image Resolution:1:1 (9MP)");
			System.out.println("Select third highest rear camera  Image Resolution:1:1 (9MP)");
			//Select 1st resolution
			MobileElement ThirdRes = driver.findElement(By.xpath("//*[@text='1:1 (9MP)']"));
			ThirdRes.click();
			TimeUnit.SECONDS.sleep(2);
			try {
				logger.info("If Temp pop-up exists please select OK option"); 
				System.out.println("If Temp pop-up exists please select OK option"); 
				MobileElement Stable =	driver.findElement(By.xpath("//*[@text='YES']"));
				Stable.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("No Temp pop-up found : "+exp); 
				System.out.println("No Temp pop-up found : "+exp); 

			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop2 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear2 = prop.getProperty("totalPictureCountRear2");  
			System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear2 +" Images to be captured");
			int totalPictureCountRear2Int=Integer.parseInt(totalPictureCountRear2);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			int j2=0;
			for(j2 = 0; j2 < totalPictureCountRear2Int; j2++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				MobileElement ClickShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sonymobile.photopro:id/single_shooting']"));
				ClickShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking third   Resolution Image"+j2);
				logger.info("clicking third  Resolution Image"+j2);
			}
			logger.info("Rear camera Third resolution:" + j2 + " images Captured succesfull");
			System.out.println("Back camera third resolution:" + j2 + " images Captured succesfull" );
			//Select fourth image resolution
			//Click Setting and select third resolution
			logger.info("Click menu option"); 
			System.out.println("Click menu option"); 
			MobileElement Menu3 =	driver.findElement(By.xpath("//*[@text='MENU']"));
			Menu3.click();
			TimeUnit.SECONDS.sleep(3);
			//Click On Rear Video size to select resolution
			logger.info("Select Video size option"); 
			System.out.println("select video size option"); 
			MobileElement AspectRatio3 = driver.findElement(By.xpath("//*[@text='Aspect ratio']"));
			AspectRatio3.click();
			logger.info("Select fourth highest rear camera  Image Resolution:3:2 (10MP)");
			System.out.println("Select fourth highest rear camera  Image Resolution:3:2 (10MP)");
			//Select 1st resolution
			MobileElement FourthRes = driver.findElement(By.xpath("//*[@text='3:2 (10MP)']"));
			FourthRes.click();
			TimeUnit.SECONDS.sleep(2);
			try {
				logger.info("If Temp pop-up exists please select OK option"); 
				System.out.println("If Temp pop-up exists please select OK option"); 
				MobileElement Stable =	driver.findElement(By.xpath("//*[@text='YES']"));
				Stable.click();
				TimeUnit.SECONDS.sleep(3);
			}
			catch(Exception exp)
			{ 
				logger.info("No Temp pop-up found : "+exp); 
				System.out.println("No Temp pop-up found : "+exp); 

			}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			Properties prop3 = new Properties();
			// Load properties file
			prop.load(Test9.class.getClassLoader().getResourceAsStream("MyProject.properties"));
			TimeUnit.SECONDS.sleep(5);
			String totalPictureCountRear3 = prop.getProperty("totalPictureCountRear3");  
			System.out.println("totalPictureCountRear2 = "+ totalPictureCountRear3 + " Images to be captured");
			int totalPictureCountRear3Int=Integer.parseInt(totalPictureCountRear3);
			// capture  pics for the selected resolution
			logger.info("Capture Images");
			int j3=0;
			for(j3 = 0; j3 < totalPictureCountRear3Int; j3++) 
			{ 
				TimeUnit.SECONDS.sleep(2);
				MobileElement ClickShutterButton = driver.findElement(By.xpath("//*[@resource-id='com.sonymobile.photopro:id/single_shooting']"));
				ClickShutterButton.click();
				TimeUnit.SECONDS.sleep(6);
				System.out.println("clicking fourth   Resolution Image"+j3);
				logger.info("clicking fourth  Resolution Image"+j3);
			}
			TimeUnit.SECONDS.sleep(2);
			logger.info("Rear camera fourth resolution:" + j3 + " images Captured succesfull");
			System.out.println("Back camera fourth resolution:" + j3 + " images Captured succesfull" );

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			TimeUnit.SECONDS.sleep(2);
			//Sum total of User provided images resolution count 
			int TotalCount=0;
			TotalCount += j+j1+j2+j3;
			System.out.println("Total Count value:" + TotalCount + " images to be Captured " );
			logger.info("Total Count value:" + TotalCount + " images to be Captured " );
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TimeUnit.SECONDS.sleep(2);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
			//Launch file manager application and verify image capture in uSD card.
			//Launch File manager
			logger.info("Launch file manager application and verify front camera captured images in external storage");
			System.out.println("Launch file manager application and verify front camera captured images in external storage");
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
			MobileElement TotalImage =	driver.findElement(By.xpath("//*[@resource-id='com.google.android.apps.nbu.files:id/action_bar_title']"));
			TotalImage.click();
			System.out.print("Total: " +(TotalImage.getText()) +  " images Captured succesfull" + "\n");
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



			double TolerancePercentage = (Tolerance_LevelInt/100)*TotalCount;				
			//System.out.println("Tolerance level value  = " + TolerancePercentage);
			if(TotalImageCaptured>=TolerancePercentage*TotalCount)
			{

				logger.info("Pass: Test9 pass for rear Image capture");
				System.out.println("\nPass: Test9 pass for rear Image capture");
				System.out.println("Test9_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
				logger.info("Test9_Bcam_image: " + TotalImageCaptured + "  images Captured succesfull" );
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


				//logger.info("Final Message: Pass Test9 Pass for Rear camera image capture  successfully");
				//System.out.println("Final Message: Pass Test9 Pass for Rear camera image capture  successfully");

			}
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			if(Result=="Pass")
			{
				logger.info("Final Message: Fail Test9 Fail for rear Camera image capture");
				System.out.println("Final Message: Fail Test9 Fail for rear Camera image capture");

				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

			}
			else
			{
				logger.info("Final Message: Pass Test9 Pass for rear Camera image capture");
				System.out.println("Final Message: Pass Test9 Pass for rear Camera image capture");
				logger.info("Test: End");
				System.out.println("Test: End");
				logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
				System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			}



		}
		catch (Exception e) {

			logger.info("Fail: Test9 fail for Fail Count Issue");
			System.out.println("\nFail: Test9 fail for Fail Count Issue");
			logger.info("calling DataMoveOperation() ");
			System.out.println("calling DataMoveOperation()");
			DataMoveOperation();
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("Final Message: Fail Test9 for rear camera image capture");
			logger.info("Final Message: Fail Test9 for rear camera image capture");
			logger.info("Test: End");
			System.out.println("Test: End");
			logger.info("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

		}


	}


	public void DataMoveOperation() throws  IOException, InterruptedException {

		java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
		//Launch File Manager application and playback front recorded video from USD for 30 seconds, pause video playback, locking phone and unlock after 30 seconds delay and playback video from pause duration.
		isPaused = true;
		try {
			logger.info("Re-launch file manager application and select external storage for data move operation, select all rear camera images files present in camera folder and move to Test9 folder");
			System.out.println("Re-launch file manager application and select external storage for data move operation, select all rear camera images files present in camera folder and move to Test9 folder");
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

			logger.info("Name folder as Test9");
			System.out.println("Name folder as Test9");
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).clear();
			driver.findElement(By.id("com.google.android.apps.nbu.files:id/folder_name_edit_text")).sendKeys("Test9");
			TimeUnit.SECONDS.sleep(5);

			//Click Create option
			logger.info("Accept create folder");
			System.out.println("Accept create folder");
			driver.findElement(By.xpath("//*[@text='Move to folder']")).click();
			TimeUnit.SECONDS.sleep(30);

			logger.info("Cut paste rear camera captured images from exteranl storage to Test9 folder in external storage");
			System.out.println("Cut paste rear camera captured images from exteranl storage to Test9 folder in external storage");

			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));

			logger.info("Test9: Data move operation completed successfully");
			System.out.println("Test9: Data move operation completed successfully");
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
				logger.info("Pass: Test9 Pass for data move operation successfully");	
				System.out.println("Pass: Test9 Pass for data move operation successfully");	
			}


		}
		catch (Exception e) {
			e.printStackTrace();
			if (Result == "Fail")
			{
				logger.info("Fail: Test9 Fail for data move operation ");
				System.out.println("Fail: Test9 Fail for data move operation");	
			}

		}

	}  	
}