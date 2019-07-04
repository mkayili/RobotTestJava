package Modules.SideBar.approveAwaiting.approveAwaiting_müsteri;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class approveAwaiting_müsteri {

    AndroidDriver driver;

    public approveAwaiting_müsteri(AndroidDriver driver) {
        this.driver = driver;
    }

    public int check() {
        int ht = 0;
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            MobileElement müsteriTab = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"MÜŞTERİ (8)\"]/android.view.View/android.view.View/android.widget.TextView\n\n");
            ht = Integer.parseInt(getInsideParanthesis(müsteriTab.getText()));
            müsteriTab.click();
            // awaiting elemanlar�n�n say�s� kontrol edilecek

            Reports.report("OK", "approveAwaiting_müsteri test", "Düzgün çalışıyor");
        } catch (Exception e) {
            Reports.report("Menu action Failed", "approveAwaiting", "approveAwaiting failed...");
        }
        return ht;
    }

    public String getInsideParanthesis(String str) {
        String answer = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        return answer;
    }

}




