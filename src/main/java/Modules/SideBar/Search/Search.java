
package Modules.SideBar.Search;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Search {

    private AndroidDriver driver;

    public Search(AndroidDriver driver) {
        this.driver = driver;
    }

    public void test() {
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            String searchText = "sardunya";

            MobileElement search = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]/android.widget.TextView[2]\n");
            search.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement textBox = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText\n");
            MobileElement searchButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TextView\n");
            try {
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                textBox.sendKeys(searchText);
                searchButton.click();
                TimeUnit.SECONDS.sleep(15);

                List<MobileElement> textViews=driver.findElementsByXPath("//*[@class='android.widget.TextView']");
                String test = textViews.get(3).getText();
                if(searchText.equalsIgnoreCase(test)){
                    Reports.report("OK", "Search Test", "Search succesfully matched");
                }else{
                    Reports.report("FAIL", "Search Test", "Search failed to match");
                }
            } catch (Exception e) {
                Reports.report("FAIL", "Search Test", "Search failed...");
            }

            List<MobileElement> textViews=driver.findElementsByXPath("//*[@class='android.widget.ImageView']");
            MobileElement backButton = textViews.get(0);
            backButton.click();
        }catch (Exception e1){

        }
    }
}
