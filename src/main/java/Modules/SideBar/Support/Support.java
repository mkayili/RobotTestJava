package Modules.SideBar.Support;

import Modules.SideBar.Support.ClosedRequests.ClosedRequests;
import Modules.SideBar.Support.OpenedRequests.OpenedRequests;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class Support {
    private AndroidDriver driver;

    public Support(AndroidDriver driver) {
        this.driver = driver;
    }

    public void test(){
        try {

            MobileElement support = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[6]/android.widget.TextView[2]\n");
            support.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            OpenedRequests openedReq = new OpenedRequests(driver);
            ClosedRequests closedReq = new ClosedRequests(driver);
            openedReq.check();
            closedReq.check();

        }catch (Exception e){
            Reports.report("NoElement", "Support", "Support Test Failed...");
        }

    }
}
