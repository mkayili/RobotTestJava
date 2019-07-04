package Modules.HomePage.SideBar;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class SideBarLogOut {
    private AndroidDriver driver;

    public SideBarLogOut(AndroidDriver driver) {
        this.driver = driver;
    }

    public void logOutProcess() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        try {
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView");
            el3.click();

            try {
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                TouchAction action = new TouchAction(driver);
                PointOption p1 = new PointOption();
                Dimension dimensions = driver.manage().window().getSize();
                Double screenHeightStart = dimensions.getHeight() * 0.93;
                int h1 = screenHeightStart.intValue();
                Double screenHeightEnd = dimensions.getHeight() * 0.59;
                int h2 = screenHeightEnd.intValue();
                action.press(p1.point(0, h1)).moveTo(p1.point(0, h2)).release().perform();

                Reports.report("OK", "Login Page",
                        "Sidebar menüde swipe işlemi yapıldı..");
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Login Page",
                        "Sidebar menüde swipe işlemi yapılamadı..");
            }

            Thread.sleep(2000);
            MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[8]/android.widget.TextView[2]");
            el4.click();
            Reports.report("OK", "Login Page",
                    "Logout butonuna tıklanarak çıkış yapıldı.");

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page",
                    "Logout butonu bulunamadı.");
        }

    }

}

