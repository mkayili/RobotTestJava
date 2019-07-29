package Modules.HomePage.CustomerUpdates.ActivateOutlets;
import Modules.HomePage.CustomerUpdates.customerUpdates;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class activateOutlet extends customerUpdates{

    AndroidDriver driver;

    public activateOutlet(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void runTest() {
        MobileElement listeScrollview = null;
        int count = 0;
        try {
            customerUpdate();

            selectActivate();
           // MobileElement listeScrollview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Will Be Closed", "Liste alinamadi...");
        }
        listeScrollview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
        int a = scrollElement("activateOutlet", 1, listeScrollview);
        goHome("activateOutlet");
        customerUpdate();
        selectActivate();
        try {
            listeScrollview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
            scrollElement("activateOutlet", a, listeScrollview);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement continueB = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView");
            if(continueButonu(continueB)){
                icerdekiButonlariTestEt("activateOutlet");
                activateOutletTest();
            } else {
                goHome("activateOutlet");
                customerUpdate();
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "CustomerUpdate", "xxxxxx");
        }
    }


    public void selectActivate () {
        MobileElement activateButton = null;
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {}

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            activateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]\n");
            activateButton.click();
            Reports.report("OK", "activate", "activateOutlet bulundu ve tıklandı");
        } catch (NoSuchElementException e) {
            try{
                activateButton = (MobileElement) driver.findElementByXPath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.view.View[2]\n");
                activateButton.click();
                Reports.report("NoElement", "activate", "activateOutlet bulundu ve tıklandı");
            }catch (NoSuchElementException e2) {
                Reports.report("NoElement", "activate", "activateOutlet bulunamadı");
            }
        }

    }
    public void activateOutletTest(){
        try{
            MobileElement yesButton = null;
            MobileElement okButton = null;
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            yesButton = (MobileElement) driver.findElementByXPath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]\n");
            yesButton.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            okButton = (MobileElement) driver.findElementByXPath(" /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button\n");
            okButton.click();

            Reports.report("OK", "activateOutlet", "activateOutletTest finished ");


        }catch(NoSuchElementException e2){
            Reports.report("NoElement", "activate", "activateOutletTest failed");
        }

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

    }


}
