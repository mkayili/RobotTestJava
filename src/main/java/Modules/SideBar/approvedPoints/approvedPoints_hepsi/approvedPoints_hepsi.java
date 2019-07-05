package Modules.SideBar.approvedPoints.approvedPoints_hepsi;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class approvedPoints_hepsi {

    int aa = 0;
    private AndroidDriver driver;

    public approvedPoints_hepsi(AndroidDriver driver) {
        this.driver = driver;
    }

    public int check() {
        int ht = 0;
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            List<MobileElement> textViews=driver.findElementsByXPath("//*[@class='android.widget.TextView']");
            ht = getNumber(textViews.get(1).getText());
            textViews.get(1).click();

            // awaiting elemanlar�n�n say�s� kontrol edilecek

            Reports.report("OK", "approveAwaiting_hepsi test", "Düzgün çalışıyor");
        } catch (Exception e) {
            Reports.report("Menu action Failed", "approvedPoints_hepsi test", "approvedPoints_hepsi failed...");
        }
        return ht;
    }

    public Integer getNumber(String str){
        int aa;
        str = str.replaceAll("[^\\d.]", "");
        if (str.length() == 0){
            return 0;
        }else{
            aa = Integer.parseInt(str);
            return aa;
        }
    }
}
