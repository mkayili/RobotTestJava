package Modules.SideBar.approvedPoints.approvedPoints_master;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class approvedPoints_master {
    private  AndroidDriver driver;
    private int ht = 0;
    public approvedPoints_master(AndroidDriver driver) {
        this.driver = driver;
    }

    public int check() {
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            List<MobileElement> textViews=driver.findElementsByXPath("//*[@class='android.widget.TextView']");
            ht = getNumber(textViews.get(2).getText());
            textViews.get(2).click();

            // awaiting elemanlar�n�n say�s� kontrol edilecek

            Reports.report("OK", "approveAwaiting_master test", "Düzgün çalışıyor");
        } catch (Exception e) {
            Reports.report("Menu action Failed", "approveAwaiting_master test", "approvedPoints_master failed...");
        }
        return ht;
    }

    public Integer getNumber(String str){
        int aa ;
        str = str.replaceAll("[^\\d.]", "");
        if (str.length() == 0){
            return 0;
        }else{
            aa = Integer.parseInt(str);
            return aa;
        }
    }
}
