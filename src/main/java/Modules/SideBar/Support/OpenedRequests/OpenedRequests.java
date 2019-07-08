package Modules.SideBar.Support.OpenedRequests;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.util.List;
import java.util.concurrent.TimeUnit;

    public class OpenedRequests {
        private AndroidDriver driver;

        public OpenedRequests(AndroidDriver driver) {
            this.driver = driver;
        }

        public void check() {
            String str = "";
            try {
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                List<MobileElement> textViews=driver.findElementsByXPath("//*[@class='android.widget.TextView']");
                textViews.get(1).click();
                swipe();
                str = textViews.get(4).getText();

                if(str.equals("")){
                    Reports.report("FAIL", "OpenedRequests list", "OpenedRequests list is Empty");
                }


                MobileElement listitem = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.support.v4.view.ViewPager/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View");
                listitem.click();
                MobileElement sorunlarText= (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView");
                if(sorunlarText.getText().equals("")){
                    Reports.report("FAIL", "OpenedRequests list", "OpenedRequests - Noktayla ilgili sorunlar yazısı çıkmadı");
                }
                List<MobileElement> textViews1=driver.findElementsByXPath("//*[@class='android.widget.ImageView']");
                MobileElement backButton = textViews1.get(0);
                backButton.click();


                Reports.report("OK", "OpenedRequests test", "Düzgün çalışıyor");
            } catch (Exception e) {
                Reports.report("FAIL", "OpenedRequests test", "SUPPORT_OpenedRequests failed...");
            }
        }

        public void swipe(){
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            TouchAction action = new TouchAction(driver);
            PointOption p1 = new PointOption();
            Dimension dimensions = driver.manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.93;
            int h1 = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.59;
            int h2 = screenHeightEnd.intValue();
            action.press(p1.point(0, h1)).moveTo(p1.point(0, h2)).release().perform();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }

