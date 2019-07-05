package Modules.SideBar.approvedPoints;

import Modules.SideBar.approvedPoints.approvedPoints_hepsi.approvedPoints_hepsi;
import Modules.SideBar.approvedPoints.approvedPoints_master.approvedPoints_master;
import Modules.SideBar.approvedPoints.approvedPoints_müsteri.approvedPoints_müsteri;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class approvedPointsTest {

    private AndroidDriver driver;

    public approvedPointsTest(AndroidDriver driver) {
        this.driver = driver;
    }

    public void test() {
        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e){

            }
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            int total ;

            MobileElement approved = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView[2]\n\n");
            total = getNumber(approved.getText());

            //total = Integer.parseInt(getInsideParanthesis(approved.getText()));
            approved.click();

            try{
                TimeUnit.SECONDS.sleep(5);
                approvedPoints_hepsi hepsi = new approvedPoints_hepsi(driver);
                int hepsiCount = hepsi.check();
                approvedPoints_master master = new approvedPoints_master(driver);
                int masterCount = master.check();
                approvedPoints_müsteri müsteri = new approvedPoints_müsteri(driver);
                int müsteriCount = müsteri.check();
                if (hepsiCount != (masterCount + müsteriCount)) {
                    Reports.report("FAIL", "ApprovedPointsTest", "Number of approvesAwaiting does not match" + hepsiCount + " " + masterCount + müsteriCount);
                }
                if (hepsiCount != total) {
                    Reports.report("FAIL", "ApprovedPointsTest", "Number of ApprovedPointsTest does not match");
                }

            }catch (InterruptedException e){

            }


            MobileElement backButton = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\" \"]/android.view.View/android.widget.ImageView\n");
            backButton.click();

        } catch (Exception e) {
            Reports.report("FAIL", "approvedPoints", "approvedPoints failed...");
        }
    }
/*
    public String getInsideParanthesis(String str) {
        String answer = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        return answer;
    }
    */


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
