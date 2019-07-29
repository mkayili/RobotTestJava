package Modules.HomePage.GeovisionGroupUpdated.NonFoundOutlets;
import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class nonFoundOutlets extends geovisionGroupUpdated {
    private AndroidDriver driver;

    public nonFoundOutlets(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void runTest() {
        //updatedButton();
        int expectedCount = sayiyiAlveSec();
        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            MobileElement el = (MobileElement) driver.findElementById("android:id/button1");
            el.click();
        } catch (NoSuchElementException e) {

        }
        if (expectedCount == 0) {
            Reports.report("OK", "Geovision Group Updated", "Non Found Outlets butonu ekranda mevcut. Butona tıklandı ...");
            infoText();
        } else if (expectedCount > 0) {
            Reports.report("OK", "Geovision Group Updated", "Non Found Outlets butonu ekranda mevcut. Butona tıklandı ...");
            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement listeScrollview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
                int count = ListeyiSay("Non Found Outlets", listeScrollview);
                if (expectedCount == count) {
                    Reports.report("OK", "Liste", "Beklenen eleman sayısı(" + expectedCount + ") ile listedeki eleman sayısı(" + count + ") aynı...");
                } else {
                    Reports.report("NotMatching", "Liste", "Beklenen eleman sayısı(" + expectedCount + ") ile listedeki eleman sayısı(" + count + ") farklı...");
                }
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Non Found Outlets", "Liste alinamadi...");
            }

            if (expectedCount > 1) {
                KisiSec("Non Found Outlets", 2);
            } else {
                KisiSec("Non Found Outlets", 1);
            }
            goHome("Non Found Outlets");
            updatedButton();
            sayiyiAlveSec();
            if (expectedCount > 1) {
                KisiSec("Non Found Outlets", 2);
            } else {
                KisiSec("Non Found Outlets", 1);
            }
            try {
                //MobileElement continueB = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                Dimension size = driver.manage().window().getSize();
                int width = (int)size.getWidth();
                int height = (int)size.getHeight();
                Duration gap = Duration.ofSeconds(2);
                new TouchAction(driver).press(PointOption.point(width/2, height/2)).waitAction().release().press(PointOption.point(width/2, height/2)).waitAction().release().perform();
                //new TouchAction(driver).longPress(LongPressOptions.longPressOptions().withDuration(gap),LongPressOptions.longPressOptions().withDuration(gap))

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                new TouchAction(driver).press(PointOption.point(width/2, height/2)).waitAction(WaitOptions.waitOptions(gap)).release().perform();

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement infoText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.TextView");
                    Reports.report("OK","Non Found Outlets","Info texte ulasildi...");
                    try {
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        MobileElement noButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                        noButonu.click();
                        Reports.report("OK","Non Found Outlets","No butonuna basildi...");
                        try {
                            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                            MobileElement el = (MobileElement) driver.findElementById("android:id/button1");
                            el.click();
                        } catch (NoSuchElementException e) {

                        }
                        new TouchAction(driver).press(PointOption.point(width/2, height/2)).waitAction().release().press(PointOption.point(width/2, height/2)).waitAction().release().perform();
                        try {
                            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                            MobileElement el = (MobileElement) driver.findElementById("android:id/button1");
                            el.click();
                        } catch (NoSuchElementException e) {

                        }
                        new TouchAction(driver).press(PointOption.point(width/2, height/2)).waitAction(WaitOptions.waitOptions(gap)).release().perform();
                        if(infoText.isDisplayed()) {
                            try {
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                MobileElement yesButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]");
                                yesButonu.click();
                                Reports.report("OK","Non Found Outlets","Yes butonuna basildi...");

                                try {
                                    //android:id/alertTitle
                                    //android:id/button1
                                    //android:id/message
                                    try {
                                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                        MobileElement el = (MobileElement) driver.findElementById("android:id/button1");
                                        el.click();
                                        String loadingXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View/android.widget.FrameLayout/android.widget.ProgressBar";
                                        //checkifLoading("Non Found Outlets", loadingXpath);
                                        KisiSec("Non Found Outlets", 1);
                                        try {
                                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                            MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1");
                                            el1.click();
                                            KisiSec("Non Found Outlets", 2);
                                            /*Scanner sc = new Scanner(System.in);
                                            sc.next();*/

                                            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                            MobileElement liste = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager");

                                            listeyiDoldur("Non Found Outlets",liste);
                                        } catch (NoSuchElementException e) {

                                        }
                                    } catch (NoSuchElementException e) {

                                    }


                                } catch (NoSuchElementException e) {

                                }

                            } catch (NoSuchElementException e) {
                                Reports.report("NoElement","Non Found Outlets","Yes butonu bulunamadi...");
                                goHome("Non Found Outlets");
                                return;
                            }
                        }

                    } catch (NoSuchElementException ex) {
                        Reports.report("NoElement","Non Found Outlets","No butonu bulunamadi...");
                        goHome("Non Found Outlets");
                        return;
                    }

                } catch (NoSuchElementException e) {
                    Reports.report("NoElement","Non Found Outlets","Info texte ulasilamadi...");
                }


            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Non Found Outlets", "Continue butonu bulunamadi...");
            }
        }
        //goMainPage();
    }

    public int sayiyiAlveSec () {
            try {
                TimeUnit.SECONDS.sleep(5);

            } catch (InterruptedException e) {

            }
            int expectedCount = -1;
            MobileElement non_foundOutletsButton = null;
            MobileElement non_foundOutletsText = null;
            try {
                non_foundOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]");
                non_foundOutletsText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.TextView[1]");
            } catch (NoSuchElementException e) {
                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    non_foundOutletsButton = (MobileElement) driver.findElementByXPath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]");
                    non_foundOutletsText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.TextView[1]");

                } catch (NoSuchElementException ex) {
                    Reports.report("OK", "geovisionGroupUpdated", "Information Update butonu ekranda mevcut degil ...");
                    return expectedCount;
                }
            }
            expectedCount = Integer.parseInt(non_foundOutletsText.getText());
            non_foundOutletsButton.click();
            return expectedCount;
        }


    }


