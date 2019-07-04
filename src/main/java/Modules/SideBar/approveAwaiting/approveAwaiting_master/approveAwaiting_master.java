package Modules.SideBar.approveAwaiting.approveAwaiting_master;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class approveAwaiting_master {

        AndroidDriver driver;
        int ht = 0;
        public approveAwaiting_master(AndroidDriver driver) {
            this.driver = driver;
        }

        public int check() {
            try {
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                MobileElement masterTab = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"MASTER (8)\"]/android.view.View/android.view.View/android.widget.TextView\n\n");
                ht = Integer.parseInt(getInsideParanthesis(masterTab.getText()));
                masterTab.click();
                // awaiting elemanlar�n�n say�s� kontrol edilecek

                Reports.report("OK", "approveAwaiting_master test", "Düzgün çalışıyor");
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




