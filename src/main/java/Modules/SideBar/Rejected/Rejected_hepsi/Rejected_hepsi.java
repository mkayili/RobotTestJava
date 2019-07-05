package Modules.SideBar.Rejected.Rejected_hepsi;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Rejected_hepsi {
    int aa = 0;
    private AndroidDriver driver;

    public Rejected_hepsi(AndroidDriver driver) {
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

            Reports.report("OK", "Rejected_hepsi test", "Düzgün çalışıyor");
        } catch (Exception e) {
            Reports.report("Menu action Failed", "Rejected_hepsi", "Rejected_hepsi failed...");
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


   // ht = Integer.parseInt(getInsideParanthesis(textViews.get(1).getText()));



