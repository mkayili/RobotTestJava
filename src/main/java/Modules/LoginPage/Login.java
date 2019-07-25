package Modules.LoginPage;

import Report.Reports;
import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
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
            //username.sendKeys(usrname);//dolu hesap TEST90001336 bos TEST90016932
            username.sendKeys(usrname);
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
            Reports.report("OK", "Login Page", "Login butonu ekranda mevcut. Butona tıklandı ...");
            checkifLoading("Login");
            try {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                MobileElement text = (MobileElement) driver.findElementById("android:id/message");
                MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
                if(text.getText().equals("Check your username or password.")) {
                    Reports.report("Fail","Login","Wrong username or password, terminating...");
                    System.exit(1);
                }
                el5.click();
                //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Reports.report("OK", "Login Page", "Warning onay butonu ekranda mevcut. Butona tıklandı ve giriş yapıldı...");
            } catch (NoSuchElementException e) {

            }



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

    public void checkifLoading(String Page) {
        int i=0;
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement loadingSymbol = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.widget.ProgressBar");


            i++;
        }catch (NoSuchElementException e) {
            //Reports.report("NoElement",Page,"Loading bulunamadi...");
            //return;
        }
        while(true) {
            /*try {
                Thread.sleep(100);
            } catch (Exception e) {

            }*/
            try {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                MobileElement loadingSymbol = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.widget.ProgressBar");
                i++;
            }catch (NoSuchElementException e) {
                try {
                    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                    MobileElement text = (MobileElement) driver.findElementById("android:id/message");
                    MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
                    if(text.getText().equals("Check your username or password.")) {
                        Reports.report("Fail","Login","Wrong username or password, terminating...");
                        System.exit(1);
                    }
                    el5.click();
                } catch (NoSuchElementException ex) {
                    if(i<1) Reports.report("NoElement",Page,"Loading bulunamadi...");
                    else Reports.report("OK",Page,"Loading tamamlandi...");
                    break;
                }



            }
        }
    }

    }

