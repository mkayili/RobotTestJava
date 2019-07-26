package Modules.HomePage.CustomerUpdates;

import Modules.HomePage.CustomerUpdates.ActivateOutlets.activateOutlet;
import Modules.HomePage.CustomerUpdates.CloseOutlet.closeOutlet;
import Modules.HomePage.CustomerUpdates.IncompleteClaims.incompleteClaims;
import Modules.HomePage.CustomerUpdates.NewOutlets.newOutlet;
import Modules.HomePage.CustomerUpdates.PassiveOutlets.passiveOutlets;
import Modules.HomePage.CustomerUpdates.UpdateOutlet.updateOutlet;


import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class customerUpdates {

    AndroidDriver driver;

    public customerUpdates(AndroidDriver driver) {
        this.driver = driver;
    }

    public void runTest() {

        try {
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            customerUpdate();
            Reports.report("OK", "Home", "CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }
        activateOutlet activatedOutlet = new activateOutlet(driver);
        activatedOutlet.runTest();


        updateOutlet updateOutlet = new updateOutlet(driver);
        //updateOutlet.runTest();

        closeOutlet closeOutlet = new closeOutlet(driver);
        //closeOutlet.runTest();

        passiveOutlets passiveOutlets = new passiveOutlets(driver);
        //passiveOutlets.runTest();

        incompleteClaims incompleteClaims = new incompleteClaims(driver);
        //incompleteClaims.runTest();

        newOutlet newOutlet = new newOutlet(driver);
        //newOutlet.runTest();


    }

    public void infoText() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement infoTex = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
            if (infoTex.getText().equals("There are no recommendations in this scenario.")) {
                Reports.report("OK", "Info", "There are no recommendations in this scenario. mesajı görüldü ...");
                try {
                    MobileElement okButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                    okButton.click();
                    Reports.report("OK", "Info", "OK butonu görüldü, tıklandı ...");
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement", "Info", "OK butonu bulunamadı ...");
                }
            } else {
                Reports.report("WrongText", "Info", "Beklenen mesaj alınamadı ...");
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "Info", "There are no recommendations in this scenario. mesajı görülemedi...");
        }
    }

    public void goHome(String page) {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
            homePage.click();
            Reports.report("OK", page, "Home page butonu bulundu tıklandı...");
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", page, "Home page butonu bulunamadı...");
        }
    }

    public void icerdekiButonlariTestEt(String Page) { //rapor geri butonlarını test eder
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement raporButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            raporButonu.click();
            Reports.report("OK",Page,"Rapor butonu bulundu, tiklandi ...");
            MobileElement okButonu = (MobileElement) driver.findElementById("android:id/button1");
            okButonu.click();
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",Page,"Rapor butonu bulunamadı...");
            return;
        }
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            MobileElement supportButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[2]");
            supportButton.click();
            Reports.report("OK",Page,"Support butonu bulundu, tiklandi ...");
            try {
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                MobileElement reportType = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Spinner[2]");
                Reports.report("OK",Page,"Support tipi alındi...");
                try{
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    MobileElement supportEdittext = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
                    supportEdittext.sendKeys("deneme");
                    driver.hideKeyboard();
                    Reports.report("OK",Page,"Support edit text bulundu, metin girildi ...");
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    MobileElement supportSendButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View");
                    supportSendButton.click();
                    Reports.report("OK",Page,"Support send butonu bulundu, tiklnadi ...");
                }catch (NoSuchElementException exc) {
                    Reports.report("NoElement",Page,"Support kısmında eksikler var...");
                }
            }catch (NoSuchElementException ex) {
                Reports.report("NoElement",Page,"Support tipi alınamadı...");
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement",Page,"Support butonu bulunamadı...");
            return;
        }
        return;
    }

    public boolean continueButonu(MobileElement continueButonu) {
        try {
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e) {}
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            continueButonu.click();//Continue butonu
            Reports.report("OK","Map","Continue butonu bulundu tıklandı...");
            try{
                TimeUnit.SECONDS.sleep(8);
            }catch (InterruptedException e) {}
            try {
                if(continueButonu.getText().equals("Continue")) {
                    Reports.report("Fail","Map","Continue butonu calismiyor...");
                    return false;
                }
            } catch (NoSuchElementException e) {}
            return true;
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Map","Continue butonu bulunamadı...");
            return false;
        }
    }

    public void customerUpdate(){
        try{
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            MobileElement CustomerUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]\n");
            CustomerUpdateButton.click();
            Reports.report("OK","Home","Update butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "Update butonuna ulaşılamadı.");
        }
    }

    public int scrollElement(String page, int sira , MobileElement listeScrollview) {

        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + sira +"]/android.view.View[1]/android.widget.TextView[3]");
            el1.click();        //Listedeki ilk buton info
            Reports.report("OK",page,sira + ". sıradaki Info butonu bulundu tıklandı...");
            try {
                try{
                    TimeUnit.SECONDS.sleep(2);

                }catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView\n");
                el2.click();        //Info uyarı OK buton
                Reports.report("OK","Info","OK butonu bulundu tıklandı...");
            }catch (NoSuchElementException e) {
                Reports.report("NoElement","Info","OK butonu bulunamadı...");
            }
        }catch (NoSuchElementException e) {
            //Reports.report("NoElement",page,sira + ". sıradaki Info butonu bulunamadı...");
        }
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ sira +"]/android.view.View[1]");
            el3.click();        //Listedeki sıra buton
            Reports.report("OK",page,sira + ". sıradaki Bilgiler bulundu tıklandı...");
            try{
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button\n");
                el4.click();
                sira = scrollElement(page, sira+1, listeScrollview);
                return sira;
            }catch (NoSuchElementException e){

            }
        }catch (NoSuchElementException e) {
            try {
                MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + sira + "]/android.widget.TextView");
                    if (el.getText().equals("All points loaded")) {
                        return sira;
                }
            }catch(NoSuchElementException e3){
                    scroll(page, listeScrollview);
                    scrollElement(page, 1, listeScrollview);
                }
            }

        return sira;
    }

    public int ListeyiSay(String Page,MobileElement element) {
        HashSet<String> liste = new HashSet<String>();
        Point location = element.getLocation();
        Dimension size = driver.manage().window().getSize();
        int width = (int)size.getWidth()/2;
        int startPoint = (int)(location.getY()+element.getSize().getHeight()*0.7);
        int endPoint = (int)(location.getY()+1);
        int i;
        for(i=1;;++i) {
            try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.view.View[1]/android.widget.TextView[2]");                 //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.TextView[2]
                try {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.view.View[1]/android.widget.TextView[1]");
                    liste.add(el.getText());
                } catch (NoSuchElementException e) {
                    System.out.println("Liste elemanı alınamadı...");
                }
            }catch (NoSuchElementException e) {
                try {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.widget.TextView");                     //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[6]/android.widget.TextView
                    if(el.getText().equals("All points loaded")) {
                        //System.out.println(liste);
                        return liste.size();
                    }
                }catch (NoSuchElementException x) {
                    Reports.report("Liste alınıyor",Page,"scroll yapılacak");
                    new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction().moveTo(PointOption.point(width, endPoint)).release().perform();
                    i=0;
                }
            }
        }
    }
    public void scroll(String Page,MobileElement element){
        Point location = element.getLocation();
        Dimension size = driver.manage().window().getSize();
        int width = (int)size.getWidth()/2;
        int startPoint = (int)(location.getY()+element.getSize().getHeight()*0.7);
        int endPoint = (int)(location.getY()+1);
        new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction().moveTo(PointOption.point(width, endPoint)).release().perform();

    }
}
