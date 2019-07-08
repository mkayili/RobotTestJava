package Modules.HomePage.GeovisionGroupUpdated.InformationUpdate;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class informationUpdate extends geovisionGroupUpdated {
    private AndroidDriver driver;

    public informationUpdate(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void run() {
        System.out.println("Information Update calisiyor...");
        try {
            try {
                TimeUnit.SECONDS.sleep(5);

            } catch (InterruptedException e) {

            }

            MobileElement informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[2]");
            MobileElement informationUpdateText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]");
            if (informationUpdateText.getText().equals("0")) {
                informationUpdateButton.click();
                Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
                int expectedCount = Integer.parseInt(informationUpdateText.getText());
                //System.out.println(count);
                informationUpdateButton.click();
                Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut. Butona tıklandı ...");
                try {
                    TimeUnit.SECONDS.sleep(2);

                } catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");

                onayButonu.click();

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
                    int count = ListeyiSay(el);
                    if (expectedCount == count) {
                        Reports.report("OK", "Liste", "Beklenen eleman sayısı(" + expectedCount + ") ile listedeki eleman sayısı(" + count + ") aynı...");
                    } else {
                        Reports.report("NotMatching", "Liste", "Beklenen eleman sayısı(" + expectedCount + ") ile listedeki eleman sayısı(" + count + ") farklı...");
                    }
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement", "Liste", "Liste bulunamadı...");
                }
            }

        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut değil...");
        }
    }
}
