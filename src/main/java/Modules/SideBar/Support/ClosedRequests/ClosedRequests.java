package Modules.SideBar.Support.ClosedRequests;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClosedRequests {
    private AndroidDriver driver;

    public ClosedRequests(AndroidDriver driver) {
        this.driver = driver;
    }

    public void check() {
        String str = "";
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            List<MobileElement> textViews=driver.findElementsByXPath("//*[@class='android.widget.TextView']");
            textViews.get(2).click();
            swipe();
            str = textViews.get(4).getText();

            if(str.equals("")){
                Reports.report("FAIL", "ClosedRequests list", "ClosedRequests list is Empty");
            }
            Reports.report("OK", "aClosedRequests test", "Düzgün çalışıyor");
        } catch (Exception e) {
            Reports.report("FAIL", "ClosedRequests test", "SUPPORT_ClosedRequests failed...");
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
