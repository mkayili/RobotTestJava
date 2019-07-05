package Modules.SideBar.ClearData;

import Modules.SideBar.Logout.Logout;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[7]");
            el4.click();
            Reports.report("OK", "Home Page", "Butona tıklandı...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Home Page", "Buton bulunamadı...");
        }

    }

    //ok butonuna tıklandığında giriş sayfasına yönlendirir.
    public void warningPopUpIsOk() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            String text = "Username";
            MobileElement element = (MobileElement) driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageView[1]"));
            MobileElement el5 = (MobileElement) driver.findElementById("android:id/button2");
            el5.click();
            if (element.getText().equals(text)) {
                Reports.report("OK", "Home Page", "Pop-up çıktı ve OK butonuna tıklandı...");
            }

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Home Page", "Pop-up ekrana gelmedi...");
        }
    }

    public void warningPopUpCancel() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            String text = "Cancel";
            MobileElement element = (MobileElement) driver.findElement(By.id("android:id/alertTitle"));
            MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");

            if (element.getText().equals(text)) {
                el5.click();
            }
            Reports.report("OK", "Home Page", "Pop-up çıktı ve CANCEL butonuna tıklandı...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Home Page", "Pop-up ekrana gelmedi...");
        }
    }
}
