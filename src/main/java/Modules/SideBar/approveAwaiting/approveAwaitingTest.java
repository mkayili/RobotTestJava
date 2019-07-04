package Modules.SideBar.approveAwaiting;

import Modules.SideBar.approveAwaiting.approveAwaiting_hepsi.*;
import Modules.SideBar.approveAwaiting.approveAwaiting_master.*;
import Modules.SideBar.approveAwaiting.approveAwaiting_müsteri.*;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;


public class approveAwaitingTest {

    AndroidDriver driver;

    public approveAwaitingTest(AndroidDriver driver) {
        this.driver = driver;
    }

    public void approveAwaiting() {
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            int total = 0;
            //android.widget.Button[@content-desc=" "]/android.view.View/android.widget.ImageView

            MobileElement awaiting = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[2]\n");
            System.out.println("text = " + awaiting.getText());
            System.out.println("int = " + getInsideParanthesis(awaiting.getText()));
            total = Integer.parseInt(getInsideParanthesis(awaiting.getText()));

            awaiting.click();
            // awaiting elemanlar�n�n say�s� kontrol edilecek
            approveAwaiting_hepsi hepsi = new approveAwaiting_hepsi(driver);
            int hepsiCount = hepsi.check();
            approveAwaiting_master master = new approveAwaiting_master(driver);
            int masterCount = master.check();
            approveAwaiting_müsteri müsteri = new approveAwaiting_müsteri(driver);
            int müsteriCount = müsteri.check();

            if (hepsiCount != (masterCount + müsteriCount)) {
                Reports.report("FAIL", "approveAwaiting", "Number of approvesAwaiting does not match" + hepsiCount + " " + masterCount + müsteriCount);
            }
            if (hepsiCount != total) {
                Reports.report("FAIL", "approveAwaiting", "Number of approvesAwaiting does not match");
            }

            MobileElement backButton = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\" \"]/android.view.View/android.widget.ImageView\n");
            backButton.click();

        } catch (Exception e) {
            Reports.report("FAIL", "approveAwaiting", "approveAwaiting failed...");
        }
    }

    public String getInsideParanthesis(String str) {
        String answer = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        return answer;
    }

}
