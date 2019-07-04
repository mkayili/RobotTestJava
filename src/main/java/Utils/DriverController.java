package Utils;

import Report.Reports;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverController {
    private AndroidDriver driver;

    public DriverController() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Nexus_S_API_22");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "5.1");
        desiredCapabilities.setCapability("appPackage", "com.geovisiongroup.visiongo");
        desiredCapabilities.setCapability("appActivity", "com.geovisiongroup.visiongo.MainActivity");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
        try{
            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        }catch (Exception e) {
            Reports.report("", "", "Cannot acces remoteUrl");
        }


        //driver = new AndroidDriver(remoteUrl, desiredCapabilities);

    }

    public AndroidDriver getAndroidDriver() {
        return driver;
    }

}
