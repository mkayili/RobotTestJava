package Modules.HomePage.GeovisionGroupUpdated.NonFoundOutlets;
import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;


public class nonFoundOutlets extends geovisionGroupUpdated {
    private AndroidDriver driver;

    public nonFoundOutlets(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void runTest() {
        homeButtonTest();
    }

    public void homeButtonTest() {
        try{
            try {
                TimeUnit.SECONDS.sleep(5);

            } catch (InterruptedException e) {

            }
            MobileElement non_foundOutletsButton =null;
            MobileElement non_foundOutletsText =null;
            try {
                non_foundOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]");
                non_foundOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.TextView[1]");
            }catch (NoSuchElementException e) {
                try{
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    non_foundOutletsButton = (MobileElement) driver.findElementByXPath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]");
                    non_foundOutletsText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.TextView[1]");

                }catch (NoSuchElementException ex) {
                    Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut degil ...");
                    return;
                }
            }
            if(non_foundOutletsText.getText().equals("0")) {
                non_foundOutletsButton.click();
                Reports.report("OK","geovisionGroupUpdated","Non Found Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
                int expectedCount = Integer.parseInt(non_foundOutletsText.getText());
                non_foundOutletsButton.click();
                Reports.report("OK","geovisionGroupUpdated","Non Found Outlets butonu ekranda mevcut. Butona tıklandı ...");
                try {
                    TimeUnit.SECONDS.sleep(5);

                } catch (InterruptedException e) {

                }
                try {
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                    onayButonu.click();
                } catch (NoSuchElementException e) {

                }



                ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2] home button
                try {
                    MobileElement scrollView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
                    int count = ListeyiSay("Non Found Outlets", scrollView);
                    if(expectedCount==count){
                        Reports.report("OK","Liste","Beklenen eleman sayısı("+ expectedCount +") ile listedeki eleman sayısı("+ count +") aynı...");
                    } else {
                        Reports.report("NotMatching","Liste","Beklenen eleman sayısı("+ expectedCount +") ile listedeki eleman sayısı("+ count +") farklı...");
                    }
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement","Non Found Outlets","Liste bulunamadı...");
                }
                try {
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
                    homePage.click();
                    Reports.report("OK","Non Found Outlets","Home page butonu bulundu tıklandı...");
                    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement","Non Found Outlets","Home page butonu bulunamadı...");
                }

                updatedButton();


                /*try {
                    MobileElement mainScreenButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]");
                    mainScreenButton.click();
                    Report.Reports.report("OK","Geovision Group Updated","Main Screen butonu ekranda mevcut. Butona tıklandı ...");
                }catch (NoSuchElementException e) {
                    Report.Reports.report("NoElement", "Geovision Group Updated", "Main Screen butonu ekranda mevcut değil...");
                }*/
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Non Found Outlets butonu ekranda mevcut değil...");
        }
    }
}
