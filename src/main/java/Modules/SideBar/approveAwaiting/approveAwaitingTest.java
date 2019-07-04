package Modules.SideBar.approveAwaiting;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class approveAwaitingTest {

    AndroidDriver driver;

    public approveAwaitingTest(AndroidDriver driver) {
        this.driver = driver;
    }

    public void approveAwaiting() {
        try {
            MobileElement awaiting = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[2]\n");
            int aw = Integer.parseInt(getInsideParanthesis(awaiting.getText()));
            awaiting.click();
            // awaiting elemanlar�n�n say�s� kontrol edilecek

        } catch (Exception e) {
            Reports.report("Menu action Failed", "approveAwaiting", "approveAwaiting failed...");
        }
    }

    public String getInsideParanthesis(String str) {
        String answer = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        return answer;
    }

}
