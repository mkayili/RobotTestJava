package Modules.HomePage.GeovisionGroupUpdated;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class GvgUpdate {
    AndroidDriver driver;

    public GvgUpdate(AndroidDriver driver) {
        this.driver = driver;
    }

    public void gvgUpdated() {

        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","Update butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "Update butonuna ulaşılamadı.");
        }
        willBeClosed();
        //informationUpdate();
        //dublicateOutlets();
        //non_foundOutlets();
        //willBeActivated();
        //suggestedNewCustomer();
        /*try {
            MobileElement mainScreenButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]");
            mainScreenButton.click();
            Report.Reports.report("OK","GvgUpdate","initTests Screen butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e) {
            Report.Reports.report("NoElement", "GvgUpdate", "initTests Screen butonu ekranda mevcut değil...");
        }*/
    }

    public void willBeClosed() {
        try{
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            MobileElement willbeClosedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]");
            MobileElement willbeClosedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");
            if(willbeClosedText.getText().equals("0")) {
                willbeClosedButton.click();
                Reports.report("OK","GvgUpdate","Will Be Closed butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
                int count = Integer.parseInt(willbeClosedText.getText());
                //System.out.println(count);
                willbeClosedButton.click();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                onayButonu.click();

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                List<MobileElement> elements = driver.findElementsByClassName("android.widget.TextView");
                System.out.println(elements.size());
                /*for(int i = 0; i < elements.size(); i++) {
                    System.out.println(elements.get(i).toString());
                }*/
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //WebDriver webDriver = new We
                //MobileElement scroll = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");

                /*TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(50, 500));
                action.moveTo(PointOption.point(50, 400));
                action.release();
                action.perform();*/

                /*JavascriptExecutor js = (JavascriptExecutor) driver;
                HashMap<String, String> scrollObject = new HashMap<String, String>();
                scrollObject.put("direction", "down");
                js.executeScript("mobile: scroll", scrollObject);*/


                //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView

                KisiSec("willBeClosed",3);

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView");
                    el4.click();
                    Reports.report("OK","Info","Info butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Info","Info butonu bulunamadı...");
                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
                    el5.click();        //Icerdeki info OK buton

                    Reports.report("OK","Info","OK butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Info","OK butonu bulunamadı...");
                }

                /*try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement gitButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]");
                    gitButonu.click();//Git butonu


                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement googlemapKapat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.TextView");
                    googlemapKapat.click();//Kapat butonu
                }catch (NoSuchElementException e) {

                }*/

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement continueButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]");
                    continueButonu.click();//Continue butonu                                         /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]



                }catch (NoSuchElementException e) {

                }
                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement silinsinmiYes = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    silinsinmiYes.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement warningOk = (MobileElement) driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                    warningOk.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement silinsinmiNo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]");
                    silinsinmiNo.click();


                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoEkleme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    fotoEkleme.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    fotoCekme.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoSilme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                    fotoSilme.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    fotoCekme.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    fotoKabul.click();

                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                    fotoCekme.click();

                }catch (NoSuchElementException e) {


                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    fotoKabul.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotolarOnay = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    fotolarOnay.click();

                }catch (NoSuchElementException e) {

                }
                /*
                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]/android.view.View");
                    el20.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    el21.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    el22.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    el23.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    el24.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]/android.view.View");
                    el25.click();
                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el26 = (MobileElement) driver.findElementById("android:id/button1");
                    el26.click();
                }catch (NoSuchElementException e) {

                }*/



            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Will Be Closed butonu ekranda mevcut değil...");
        }
    }

    public void informationUpdate() {
        try{
            MobileElement informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]");
            MobileElement informationUpdateText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");
            if(informationUpdateText.getText().equals("0")) {
                informationUpdateButton.click();
                Reports.report("OK","GvgUpdate","Information Update butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Information Update butonu ekranda mevcut değil...");
        }
    }

    public void dublicateOutlets() {
        try{
            MobileElement dublicateOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]");
            MobileElement dublicateOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            if(dublicateOutletsText.getText().equals("0")) {
                dublicateOutletsButton.click();
                Reports.report("OK","GvgUpdate","Duplicate Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Duplicate Outlets butonu ekranda mevcut değil...");
        }
    }

    public void non_foundOutlets() {
        try{
            MobileElement non_foundOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]");
            MobileElement non_foundOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.TextView[1]");
            if(non_foundOutletsText.getText().equals("0")) {
                non_foundOutletsButton.click();
                Reports.report("OK","GvgUpdate","Non Found Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Non Found Outlets butonu ekranda mevcut değil...");
        }
    }

    public void willBeActivated() {
        try{
            MobileElement willBeActivatedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]");
            MobileElement willBeActivatedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.TextView[1]");
            if(willBeActivatedText.getText().equals("0")) {
                willBeActivatedButton.click();
                Reports.report("OK","GvgUpdate","Will Be Activated butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Will Be Activated butonu ekranda mevcut değil...");
        }
    }

    public void suggestedNewCustomer() {
        try{
            MobileElement suggestedNewCustomerButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]");
            MobileElement suggestedNewCustomerText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.TextView[1]");
            if(suggestedNewCustomerText.getText().equals("0")) {
                suggestedNewCustomerButton.click();
                Reports.report("OK","GvgUpdate","Suggested New Customer butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Suggested New Customer butonu ekranda mevcut değil...");
        }
    }

    public void infoText() {
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement infoTex = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
            if(infoTex.getText().equals("There are no recommendations in this scenario.")) {
                Reports.report("OK", "Info", "There are no recommendations in this scenario. mesajı görüldü ...");
                try {
                    MobileElement okButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                    okButton.click();
                    Reports.report("OK", "Info", "OK butonu görüldü, tıklandı ...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement", "Info", "OK butonu bulunamadı ...");
                }
            } else {
                Reports.report("WrongText", "Info", "Beklenen mesaj alınamadı ...");
            }
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Info", "There are no recommendations in this scenario. mesajı görülemedi...");
        }
    }

    public void ScrollTouch() {

    }

    public void KisiSec(String page, int sira) {


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + sira +"]/android.view.View[1]/android.widget.TextView[2]");
            el1.click();        //Listedeki ilk buton info
            Reports.report("OK",page,"Info butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",page,"Info butonu bulunamadı...");
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
            el2.click();        //Info uyarı OK buton
            Reports.report("OK","Info","OK butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Info","OK butonu bulunamadı...");
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ sira +"]/android.view.View[1]");
            el3.click();        //Listedeki ilk buton
            Reports.report("OK",page,"Bilgiler bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",page,"Bilgiler bulunamadı...");
        }
    }

    public String getInsideParanthesis(String str){
        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        return answer;
    }
    /*











    */
    //konum bilgisi yetersiz-> tamam butonu /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button
    ///scroll(2)  hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View
    //Warning /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout
    //Info /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout
    //Infotext /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView

}
