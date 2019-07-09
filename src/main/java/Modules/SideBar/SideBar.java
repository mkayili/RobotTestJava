package Modules.SideBar;

import Modules.LoginPage.Login;
import Modules.SideBar.ClearData.ClearData;
import Modules.SideBar.Logout.Logout;
import Modules.SideBar.Rejected.RejectedTest;
import Modules.SideBar.Search.Search;
import Modules.SideBar.Support.Support;
import Report.Reports;
import Modules.SideBar.approveAwaiting.*;
import Modules.SideBar.approvedPoints.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;


public class SideBar {
    private AndroidDriver driver;
    private String  username,password;
    public SideBar(AndroidDriver driver,String username,String password) {
        this.driver = driver;
        this.username = username;
        this.password = password;
    }

    public void OpenSideBar(){
        try {
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement menubutton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView\n");
            menubutton.click();
            Reports.report("OK", "OpenSideBar", "SideBar opened");
        }catch (Exception e2){
            Reports.report("FAIL", "OpenSideBar", "SideBar could not be opened");
        }
    }

    public void testMenu(){
        try {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Initialize();
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "openMenu", "Menu iconu bu ekranda mevcut degil...");
        }
    }



    private void buttonTest(){
        try {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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


    public void Initialize() {
        try {
            approveAwaitingTest approveAwaiting = new approveAwaitingTest(driver);
            approvedPointsTest approvedPoints = new approvedPointsTest(driver);
            RejectedTest Rejected = new RejectedTest(driver);
            Search search = new Search(driver);
            Support support = new Support(driver);
            ClearData clearData = new ClearData(driver);
            Logout logout = new Logout(driver);
            Login login = new Login(driver);
            OpenSideBar();
            buttonTest();
            approveAwaiting.test();
            approvedPoints.test();
            Rejected.test();
            search.test();
            support.test();

            clearData.clearAllDataButton();
            clearData.warningPopUpIsOk();

            login.userLoginProcess(username,password);
            OpenSideBar();
            buttonTest();
            clearData.clearAllDataButton();
            clearData.warningPopUpCancel();
            logout.logOutProcess();


        } catch (NoSuchElementException e) {
            Reports.report("FAIL", "sideBar", "Bir test failladı");
        }
    }
    public void swipeBar(){
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            TouchAction action = new TouchAction(driver);
            PointOption p1 = new PointOption();
            Dimension dimensions = driver.manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.93;
            int h1 = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.59;
            int h2 = screenHeightEnd.intValue();
            action.press(p1.point(0, h1)).moveTo(p1.point(0, h2)).release().perform();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            Reports.report("NoElement", "Login Page",
                    "Sidebar menüde swipe işlemi yapılamadı..");
        }
    }
}