package Modules.HomePage.GeovisionGroupUpdated;

import Modules.HomePage.GeovisionGroupUpdated.InformationUpdate.informationUpdate;
import Modules.HomePage.GeovisionGroupUpdated.WillBeClosed.willBeClosed;
import Modules.HomePage.GeovisionGroupUpdated.NonFoundOutlets.nonFoundOutlets;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class geovisionGroupUpdated {
    AndroidDriver driver;

    public geovisionGroupUpdated(AndroidDriver driver) {
        this.driver = driver;
    }

    public void runTest() {

        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","Update butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "Update butonuna ulaşılamadı.");
        }

        willBeClosed willBeClosedTest = new willBeClosed(driver);
        informationUpdate informationUpdateTest = new informationUpdate(driver);
        nonFoundOutlets nonFoundOutletsTest = new nonFoundOutlets(driver);
        willBeClosedTest.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","Update butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "Update butonuna ulaşılamadı.");
        }
        //informationUpdateTest.runTest();
        nonFoundOutletsTest.runTest();


        /*try {
            MobileElement mainScreenButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]");
            mainScreenButton.click();
            Report.Reports.report("OK","geovisionGroupUpdated","InitTest.initTests Screen butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e) {
            Report.Reports.report("NoElement", "geovisionGroupUpdated", "InitTest.initTests Screen butonu ekranda mevcut değil...");
        }*/
    }


    public void dublicateOutlets() {
        try{
            MobileElement dublicateOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]");
            MobileElement dublicateOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            if(dublicateOutletsText.getText().equals("0")) {
                dublicateOutletsButton.click();
                Reports.report("OK","geovisionGroupUpdated","Duplicate Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Duplicate Outlets butonu ekranda mevcut değil...");
        }
    }


    public void willBeActivated() {
        try{
            MobileElement willBeActivatedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]");
            MobileElement willBeActivatedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.TextView[1]");
            if(willBeActivatedText.getText().equals("0")) {
                willBeActivatedButton.click();
                Reports.report("OK","geovisionGroupUpdated","Will Be Activated butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Will Be Activated butonu ekranda mevcut değil...");
        }
    }

    public void suggestedNewCustomer() {
        try{
            MobileElement suggestedNewCustomerButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]");
            MobileElement suggestedNewCustomerText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.TextView[1]");
            if(suggestedNewCustomerText.getText().equals("0")) {
                suggestedNewCustomerButton.click();
                Reports.report("OK","geovisionGroupUpdated","Suggested New Customer butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Suggested New Customer butonu ekranda mevcut değil...");
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
            Reports.report("OK",page,sira + ". sıradaki Info butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",page,sira + ". sıradaki Info butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(2);

            }catch (InterruptedException e) {

            }
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
            el3.click();        //Listedeki sıra buton
            Reports.report("OK",page,sira + ". sıradaki Bilgiler bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",page,sira + ". sıradaki Bilgiler bulunamadı...");
        }
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
                MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.view.View[1]/android.widget.TextView[1]");

                if (el3.isDisplayed()) {
                    liste.add(el3.getText());
                }
            }catch (NoSuchElementException e) {
                try {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.widget.TextView");
                    //System.out.println(liste);
                    return liste.size();
                }catch (NoSuchElementException x) {
                    Reports.report("Liste alınıyor",Page,"scroll yapılacak");
                    new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction().moveTo(PointOption.point(width, endPoint)).release().perform();
                    i=0;
                }

            }
        }


    }

    public void Foto() {
        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoSilme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
            fotoSilme.click();
            Reports.report("OK","Foto","Fotograf silme butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf silme butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");

        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulundu tıklandı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoKabul.click();
            Reports.report("OK","Foto","Fotograf kabul butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf kabul butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoKabul.click();
            Reports.report("OK","Foto","Fotograf kabul butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf kabul butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotolarOnay = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotolarOnay.click();
            Reports.report("OK","Foto","Fotograf(lar) onay butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf(lar) onay butonu bulunamadı...");
        }
    }

    public String getInsideParanthesis(String str){
        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        return answer;
    }
    /*



    /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView
    Your request has been received. It will be controlled as soon as possible. You can follow it on pending approvals or on the rejected menus TEXT


    MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1"); ınfo ok button
    el1.click();


    2. sıra butonu, butonun ustu, butonun altı,texti, info butonu
    butonun tamamı /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]
    butonun ustu   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]
    butonun altı   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView




    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[2]



    3. sıra butonu,  texti, info butonu
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[1]
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView[1]
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView[2]


    home butonu
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]

    home info butonu
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]

    sidebar butonu
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View

    maps butonu sag alt
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.view.View/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View

    sol alt bilgiler butonu
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.view.View/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View

    arama kısmı
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.EditText

    arama butonu
    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View/android.view.View/android.widget.TextView


    */
    //konum bilgisi yetersiz-> tamam butonu /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button
    ///scroll(2)  hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View
    //Warning /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout
    //Info /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout
    //Infotext /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView

}
