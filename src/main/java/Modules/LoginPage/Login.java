package Modules.LoginPage;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class Login {
    private AndroidDriver driver;

    public Login(AndroidDriver driver) {
        this.driver = driver;
    }

    public void userLoginProcess() {


        //Report.Reports.report("OK", "Login Page", "Uygulamanın açılması "+(endTime-startTime) + "sürdü ...");
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement username = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
            username.click();
            username.sendKeys("TEST90001336");
            driver.hideKeyboard();
            Reports.report("OK", "Login Page",
                    "Username metin alanı ekranda mevcut.İlgili metin girildi ve klavye kapatıldı...");

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Username metin alanı ekranda mevcut değil...");

        }
        try {
            MobileElement password = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
            password.click();
            password.sendKeys("1111");
            driver.hideKeyboard();
            Reports.report("OK", "Login Page", "Password metin alanı mevcut. İlgili metin girildi ve klavye kapatıldı...");

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Password metin alanı mevcut değil...");
        }
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement loginBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
            loginBtn.click();

            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            Reports.report("OK", "Login Page", "Login butonu ekranda mevcut. Butona tıklandı ve giriş yapıldı...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Login butonu ekranda mevcut değil...");
        }

    }
}
