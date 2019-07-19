package Modules.HomePage.CustomerUpdates.ActivateOutlets;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class activateOutlet {
    AndroidDriver driver;

    public activateOutlet(AndroidDriver driver) {
        this.driver = driver;
    }

    public void runTest() {

        try {
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement CustomerUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]\n");
            CustomerUpdateButton.click();
            Reports.report("OK", "CustomerUpdate", "activateOutlet butonu ekranda mevcut. Butona tıklandı ...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "CustomerUpdate", "activateOutlet butonuna ulaşılamadı.");
        }
    }
}
