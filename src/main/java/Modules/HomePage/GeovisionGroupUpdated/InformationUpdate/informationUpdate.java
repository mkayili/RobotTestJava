package Modules.HomePage.GeovisionGroupUpdated.InformationUpdate;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class informationUpdate extends geovisionGroupUpdated {
    private AndroidDriver driver;

    public informationUpdate(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void runTest() {
        //updatedButton();
        int expectedCount = sayiyiAlveSec();
        int count = -1;
        if(expectedCount == 0) {
            Reports.report("OK", "Geovision Group Updated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
            infoText();
        }
        else if(expectedCount>0){
            Reports.report("OK", "Geovision Group Updated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement listeScrollview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
                count = ListeyiSay("Information Update",listeScrollview);
                if(expectedCount==count) {
                    Reports.report("OK","Liste","Beklenen eleman sayısı("+ expectedCount +") ile listedeki eleman sayısı("+ count +") aynı...");
                } else {
                    Reports.report("NotMatching","Liste","Beklenen eleman sayısı("+ expectedCount +") ile listedeki eleman sayısı("+ count +") farklı...");
                }
            } catch (NoSuchElementException e) {
                Reports.report("NoElement","Information Update","Liste alinamadi...");
            }
            int random;
            Random rn = new Random();
            random = rn.nextInt(count)+1;
            //(random%4)+1
            KisiSec("Information Update",2);
            goHome("Information Update");
            updatedButton();
            sayiyiAlveSec();
            KisiSec("Information Update",2);

            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement continueB = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView");
                if(continueButonu(continueB)){
                    icerdekiButonlariTestEt("Information Update");
                } else {
                    goHome("Information Update");
                    updatedButton();
                }
                sayiyiAlveSec();
                KisiSec("Information Update",2);


                if(continueButonu(continueB)){
                    try {
                        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                        MobileElement liste = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView");
                        listeyiDoldur("Information Update",liste);
                    } catch (NoSuchElementException e) {
                        Reports.report("NoElement","Information Update","Liste alinamadi...");
                    }

                } else {
                    goHome("Information Update");
                    updatedButton();
                }
            } catch (NoSuchElementException e) {
                Reports.report("NoElement","Information Update","Continue butonu bulunamadi...");
                goHome("Information Update");
                updatedButton();
            }
        }
        //goMainPage();

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
            //System.out.println(expectedCount);
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

    public int sayiyiAlveSec() {
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {

        }
        int expectedCount=-1;
        MobileElement informationUpdateButton=null;
        MobileElement informationUpdateText=null;
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]");
            informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]");

        }catch (NoSuchElementException e) {
            try{
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
                informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]");

            }catch (NoSuchElementException ex) {
                Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut degil ...");
                return expectedCount;
            }
        }
        expectedCount = Integer.parseInt(informationUpdateText.getText());
        informationUpdateButton.click();
        return expectedCount;
    }

}
