package AndroidCalculator.tests;

import AndroidCalculator.pages.ButtonsFunctionsMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public AndroidDriver<AndroidElement> driver;
    String sessionID;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        try {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei P10 lite");
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
            dc.setCapability(MobileCapabilityType.UDID, "");
            dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
            dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
            sessionID = driver.getSessionId().toString();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        } catch (Exception e) {
            System.out.println("Cause: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }


    @AfterMethod
    public void tearDown() {
        ButtonsFunctionsMethods close_app = new ButtonsFunctionsMethods(driver);
        close_app.CloseApp();
    }
}
