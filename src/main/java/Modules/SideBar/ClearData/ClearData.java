package Modules.SideBar.ClearData;

import Modules.SideBar.Logout.Logout;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ClearData {
    private AndroidDriver driver;
    private Logout logout;

    public ClearData(AndroidDriver driver) {
        this.driver = driver;
    }

    //Sidebar açıldığında önce swipe yapılır sonra Clear All Datas butonu olup olmadığı kontrol edilir.
    public void clearAllDataButton() {
            swipeBar();

            Reports.report("OK", "Login Page",
                    "Sidebar menüde swipe işlemi yapıldı..");
            try {
                MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[7]");
                el4.click();
                Reports.report("OK", "Home Page", "Clear All Datas butonuna tıklandı...");
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Home Page", "Clear All Datas butonu bulunamadı...");
            }

    }

    //ok butonuna tıklandığında giriş sayfasına yönlendirir.
    public void warningPopUpIsOk() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            String text = "Username";
            //MobileElement element = (MobileElement) driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageView[1]"));
            MobileElement el5 = (MobileElement) driver.findElementById("android:id/button2");
            el5.click();

            Reports.report("OK", "Home Page", "Pop-up çıktı ve OK butonuna tıklandı...");


        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Home Page", "Pop-up ekrana gelmedi...");
        }
    }

    public void warningPopUpCancel() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
            el5.click();

            Reports.report("OK", "Home Page", "Pop-up çıktı ve CANCEL butonuna tıklandı...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Home Page", "Pop-up ekrana gelmedi...");
        }
    }
    public void swipeBar(){
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
        } catch (org.openqa.selenium.NoSuchElementException e) {
            Reports.report("NoElement", "Login Page",
                    "Sidebar menüde swipe işlemi yapılamadı..");
        }
    }
}
