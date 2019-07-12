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

    public void userLoginProcess(String usrname, String pass) {


        //Report.Reports.report("OK", "Login Page", "Uygulamanın açılması "+(endTime-startTime) + "sürdü ...");
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MobileElement username = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
            username.click();
            username.sendKeys(usrname);//dolu hesap TEST90001336 bos TEST90016932
            driver.hideKeyboard();
            Reports.report("OK", "Login Page",
                    "Username metin alanı ekranda mevcut.İlgili metin girildi ve klavye kapatıldı...");

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Username metin alanı ekranda mevcut değil...");

        }
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MobileElement password = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
            password.click();
            password.sendKeys(pass);
            driver.hideKeyboard();
            Reports.report("OK", "Login Page", "Password metin alanı mevcut. İlgili metin girildi ve klavye kapatıldı...");

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Password metin alanı mevcut değil...");
        }
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MobileElement loginBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
            loginBtn.click();
            try {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
                el5.click();
                //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Reports.report("OK", "Login Page", "Warning onay butonu ekranda mevcut. Butona tıklandı ve giriş yapıldı...");
            } catch (NoSuchElementException e) {

            }


            Reports.report("OK", "Login Page", "Login butonu ekranda mevcut. Butona tıklandı ve giriş yapıldı...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Login butonu ekranda mevcut değil...");
        }

    }

    public void forgotPasswordTest() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement forgotPassword = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView");
            forgotPassword.click();
            try{
                MobileElement emailField = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
                emailField.sendKeys("asdas@gmail.com");
                MobileElement sendButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView");
                sendButton.click();
                Reports.report("OK", "Forgot Password Page", "Email gönderildi...");
            }catch (NoSuchElementException e) {
                Reports.report("NoElement", "Forgot Password Page", "Email gönderilemedi...");
            }

            try {
                MobileElement popupWarningButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                popupWarningButton.click();
                MobileElement back = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView");
                back.click();
                Reports.report("OK", "Forgot Password Page", "Warning ekranı geçildi login sayfasına dönüldü...");
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Forgot Password Page", "Login sayfasına dönülemedi...");
            }

        } catch (Exception e) {
            Reports.report("FAIL", "Forgot Password", "forgot password process failed");
        }
    }

    }

