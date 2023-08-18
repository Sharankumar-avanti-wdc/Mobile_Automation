

/*
 * package Samsung_Galaxy_M51;
 * 
 * import java.net.MalformedURLException; import java.net.URL;
 * 
 * import org.openqa.selenium.remote.DesiredCapabilities; import
 * org.testng.annotations.AfterTest; import org.testng.annotations.BeforeTest;
 * import io.appium.java_client.MobileElement; import
 * io.appium.java_client.android.AndroidDriver; import
 * io.appium.java_client.remote.MobileCapabilityType;
 * 
 * public class TestsBaseClass { // create an appiumDriver
 * AndroidDriver<MobileElement> driver;
 * 
 * @BeforeTest public void SetUp() throws MalformedURLException { // set desired
 * capabilities DesiredCapabilities dc = new DesiredCapabilities();
 * dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 * dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
 * dc.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-A715F/DS");
 * dc.setCapability(MobileCapabilityType.UDID, "RZ8N70R2HHW");
 * dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
 * 
 * URL url = new URL("http://127.0.0.1:4723/wd/hub"); driver = new
 * AndroidDriver<MobileElement>(url, dc); }
 * 
 * @AfterTest public void TearDown() {
 * 
 * }
 * 
 * 
 * }
 */