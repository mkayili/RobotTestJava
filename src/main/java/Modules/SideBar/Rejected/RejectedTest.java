package Modules.SideBar.Rejected;

import Modules.SideBar.Rejected.Rejected_hepsi.Rejected_hepsi;
import Modules.SideBar.Rejected.Rejected_master.Rejected_master;
import Modules.SideBar.Rejected.Rejected_müsteri.Rejected_müsteri;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class RejectedTest {

    private AndroidDriver driver;

    public RejectedTest(AndroidDriver driver) {
        this.driver = driver;
    }

    public void test() {
        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e){

            }
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            int total;
////////////////////////////////////
            MobileElement rejected = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.TextView[2]\n");
            ////////////////////////////
            total = getNumber(rejected.getText());
            rejected.click();

            try{
                TimeUnit.SECONDS.sleep(5);
                Rejected_hepsi hepsi = new Rejected_hepsi(driver);
                int hepsiCount = hepsi.check();
                Rejected_master master = new Rejected_master(driver);
                int masterCount = master.check();
                Rejected_müsteri müsteri = new Rejected_müsteri(driver);
                int müsteriCount = müsteri.check();
                if (hepsiCount != (masterCount + müsteriCount)) {
                    Reports.report("FAIL", "approveAwaiting", "Number of approvesAwaiting does not match" + hepsiCount + " " + masterCount + müsteriCount);
                }
                if (hepsiCount != total) {
                    Reports.report("FAIL", "approveAwaiting", "Number of approvesAwaiting does not match");
                }

            }catch (InterruptedException e){

            }


            MobileElement backButton = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\" \"]/android.view.View/android.widget.ImageView\n");
            backButton.click();

        } catch (Exception e) {
            Reports.report("FAIL", "Rejected_hepsi Test", "Rejected_hepsi failed...");
        }
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
