package Modules.SideBar;

import Modules.SideBar.Rejected.RejectedTest;
import Report.Reports;
import Modules.SideBar.approveAwaiting.*;
import Modules.SideBar.approvedPoints.*;
import Modules.SideBar.Rejected.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;


public class SideBar {
    private AndroidDriver driver;
    public SideBar(AndroidDriver driver) {
        this.driver = driver;
    }


    public void openMenu() {
        try {
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement menubutton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView\n");
            menubutton.click();
            Reports.report("OK", "openMenu", "Button Check Asamasına Geciliyor...");
            Initialize();
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "openMenu", "Menu iconu bu ekranda mevcut degil...");
        }
    }



    private void buttonTest(){
        try {

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            MobileElement approvesAwaiting = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[2]\n");
            MobileElement approvedPoints = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView[2]\n");
            MobileElement rejected = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.TextView[2]\n");
            MobileElement search = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]/android.widget.TextView[2]\n");
            MobileElement syncPhotos = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[5]/android.widget.TextView[2]\n");
            MobileElement Support = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[6]/android.widget.TextView[2]\n");
            MobileElement educationDocument = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[7]/android.widget.TextView[2]\n");
            MobileElement faq = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[8]/android.widget.TextView[2]\n");
            MobileElement clear = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[9]/android.widget.TextView[2]\n");
            Reports.report("OK", "SideBar button kontrolu", "Bütün buttonlar mevcut");

        }catch (NoSuchElementException e){
            Reports.report("NoElement", "sideBar", "Menude eksik button var...");
        }
    }


    private void Initialize() {
        try {
            approveAwaitingTest approveAwaiting = new approveAwaitingTest(driver);
            approvedPointsTest approvedPoints = new approvedPointsTest(driver);
            RejectedTest Rejected = new RejectedTest(driver);
            buttonTest();
            approveAwaiting.test();
            approvedPoints.test();
            Rejected.test();

        } catch (NoSuchElementException e) {
            Reports.report("FAIL", "sideBar", "Bir test failladı");
        }
    }
}