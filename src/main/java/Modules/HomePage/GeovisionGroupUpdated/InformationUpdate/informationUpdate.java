package Modules.HomePage.GeovisionGroupUpdated.InformationUpdate;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class informationUpdate extends geovisionGroupUpdated {
    private AndroidDriver driver;

    public informationUpdate(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void runTest() {

        homeButtonTest();
        init();
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement continueB = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView");
            if(continueButonu(continueB)) {
                icerdekiButonlariTestEt("Information Update");
            } else {
                try {
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
                    homePage.click();
                    Reports.report("OK", "Information Update", "Home page butonu bulundu tıklandı...");
                    checkifLoading("Information Update");
                    //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                    updatedButton();
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement", "Information Update", "Home page butonu bulunamadı...");
                }
            }
            init();
            if(continueButonu(continueB)) {
                try {
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    MobileElement liste = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView");
                    listeyiDoldur("Information Update",liste);
                }catch (NoSuchElementException e){
                    Reports.report("NoElement","Information Update","Liste alınamadı...");
                }
            } else {
                try {
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
                    homePage.click();
                    Reports.report("OK","Information Update","Home page butonu bulundu tıklandı...");
                    checkifLoading("Information Update");
                    updatedButton();
                    //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement","Information Update","Home page butonu bulunamadı...");
                }
            }
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Information Update","Continue butonu bulunamadi...");
        }
    }

    public void homeButtonTest() {
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {

        }
        MobileElement informationUpdateButton=null;
        MobileElement informationUpdateText=null;

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]");

            /*hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]


*/          informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]");

        }catch (NoSuchElementException e) {
            try{
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
                informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]");

            }catch (NoSuchElementException ex) {
                Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut degil ...");
                return;
            }
        }
        if (informationUpdateText.getText().equals("0")) {
            informationUpdateButton.click();
            Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
            infoText();
        } else {
            int expectedCount = Integer.parseInt(informationUpdateText.getText());
            System.out.println(expectedCount);
            informationUpdateButton.click();
            Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
            try {
                TimeUnit.SECONDS.sleep(2);

            } catch (InterruptedException e) {

            }

            try {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                onayButonu.click();
            } catch (NoSuchElementException e) {

            }


            KisiSec("Information Update", 1);

            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
                homePage.click();
                Reports.report("OK","Information Update","Home page butonu bulundu tıklandı...");
                checkifLoading("Information Update");
                //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            } catch (NoSuchElementException e) {
                Reports.report("NoElement","Information Update","Home page butonu bulunamadı...");
            }

            updatedButton();

        }
    }
    public void init() {
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {

        }
        MobileElement informationUpdateButton=null;
        MobileElement informationUpdateText=null;

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]");

            /*hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]
                                                                                                  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]


*/          informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]");

        }catch (NoSuchElementException e) {
            try{
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
                informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]");

            }catch (NoSuchElementException ex) {
                Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut degil ...");
                return;
            }
        }
        if (informationUpdateText.getText().equals("0")) {
            informationUpdateButton.click();
            Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
            infoText();
        } else {
            int expectedCount = Integer.parseInt(informationUpdateText.getText());
            System.out.println(expectedCount);
            informationUpdateButton.click();
            Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
            try {
                TimeUnit.SECONDS.sleep(2);

            } catch (InterruptedException e) {

            }
            try {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                onayButonu.click();
            } catch (NoSuchElementException e) {

            }
            if(expectedCount>1) {
                KisiSec("Information Update",2);
            } else {
                KisiSec("Information Update",1);
            }



        }
    }
}



    //liste scroll /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView


    //liste ilk /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]

    //ilk soru  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]
    //          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View
    //ilk text  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.TextView
    //foto but. /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View
    //          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.TextView
    //ilk cev   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ScrollView
    //          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ScrollView/android.view.View
    //          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View
    //ch.box    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]


    //liste 2   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]
    //2. soru   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View
    //2. cevap  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText


    //sehir sec /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View
    //          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[2]
    //sehirler scrollview   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ScrollView
    //sehitler ilk(select)  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]
    //sehirler 2            /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]

    //geri butonu          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]
    //evet butonu          /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]


    //ünlem butonu         /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[2]
    //Bu gelene kadar bekle  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Spinner[2]
    //EditText             /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText
    //Send butonu          /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View

    //rapor butonu         /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]
    //OK butonu            /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button

    //save butonu /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]
    //info text   /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView
    //info text beklenen Your request has been received. It will be controlled as soon as possible. You can follow it on pending approvals or on the rejected menus
    //OK button   /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button


//      /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[1]
    //      /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View[2]
    //      /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]/android.view.View