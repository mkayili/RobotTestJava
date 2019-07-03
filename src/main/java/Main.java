import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main {
    private AndroidDriver driver;
    public Main() {
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
    public AndroidDriver getDriver(){
        return driver;
    }

    public static void main(String[] args) {
        Main deneme = new Main();
        Operations op = new Operations(deneme.getDriver());
        op.userLoginProcess();
        op.gvgUpdated();
    }
}
