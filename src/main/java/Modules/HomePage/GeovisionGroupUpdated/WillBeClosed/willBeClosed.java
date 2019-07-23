package Modules.HomePage.GeovisionGroupUpdated.WillBeClosed;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import java.util.concurrent.TimeUnit;

public class willBeClosed extends geovisionGroupUpdated {
    private AndroidDriver driver;
    public willBeClosed(AndroidDriver driver){
        super(driver);
        this.driver=driver;
    }

    public  void runTest() {
        updatedButton();
        try {
            int expectedCount = init();

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement listeScrollview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");

                int count = ListeyiSay("Will Be Closed", listeScrollview);
                if (expectedCount == count) {
                    Reports.report("OK", "Liste", "Beklenen eleman sayısı(" + expectedCount + ") ile listedeki eleman sayısı(" + count + ") aynı...");
                } else {
                    Reports.report("NotMatching", "Liste", "Beklenen eleman sayısı(" + expectedCount + ") ile listedeki eleman sayısı(" + count + ") farklı...");
                }
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Will Be Closed", "Liste bulunamadı...");
            }

            KisiSec("willBeClosed", 1);

            try {
                try {
                    TimeUnit.SECONDS.sleep(2);

                } catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView");
                el4.click();
                Reports.report("OK", "Info", "Info butonu bulundu tıklandı...");
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Info", "Info butonu bulunamadı...");
            }

            try {
                try {
                    TimeUnit.SECONDS.sleep(2);

                } catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
                el5.click();        //Icerdeki info OK buton
                Reports.report("OK", "Info", "OK butonu bulundu tıklandı...");
            } catch (NoSuchElementException e) {
                //Reports.report("NoElement", "Info", "OK butonu bulunamadı...");
            }


            try {
                try {
                    TimeUnit.SECONDS.sleep(2);

                } catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement continueB = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView");
                if (continueButonu(continueB)) {
                    icerdekiButonlariTestEt("Will Be Closed");
                } else {
                    try {
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
                        homePage.click();
                        Reports.report("OK", "Will Be Closed", "Home page butonu bulundu tıklandı...");
                        checkifLoading("Will Be Closed");
                        //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                        updatedButton();
                    } catch (NoSuchElementException e) {
                        Reports.report("NoElement", "Will Be Closed", "Home page butonu bulunamadı...");
                    }
                }

                //Reports.report("OK","Map","Continue butonu bulundu tıklandı...");
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Map", "Continue butonu bulunamadı...");
            }

            init();
            KisiSec("Will Be Closed", 1);

            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement continueB = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView");
                continueButonu(continueB);
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "Map", "Continue butonu bulunamadı...");
            }

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement silinsinmiYes = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                silinsinmiYes.click();
                Reports.report("OK", "AskForCancel", "Yes butonu bulundu tıklandı...");
                try {
                    try {
                        TimeUnit.SECONDS.sleep(2);

                    } catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement warningOk = (MobileElement) driver.findElementById("android:id/button1");
                    warningOk.click();
                    Reports.report("OK", "Warning", "OK(warning) butonu bulundu tıklandı...");
                } catch (NoSuchElementException ex) {
                    Reports.report("NoElement", "Warning", "OK(warning) butonu bulunamadı...");
                }
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "AskForCancel", "Yes butonu bulunamadı...");
            }

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement silinsinmiNo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]");
                silinsinmiNo.click();
                Reports.report("OK", "AskForCancel", "No butonu bulundu tıklandı...");
                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);
                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoEkleme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    fotoEkleme.click();
                    Reports.report("OK","Foto","Fotograf ekleme butonu bulundu tıklandı...");
                    Foto();
                    try {
                        try{
                            TimeUnit.SECONDS.sleep(5);

                        }catch (InterruptedException e) {

                        }
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        MobileElement saveButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]/android.view.View");
                        saveButonu.click();
                        Reports.report("OK","Foto","Save butonu bulundu tıklandı...");
                        try {
                            try{
                                TimeUnit.SECONDS.sleep(2);

                            }catch (InterruptedException e) {

                            }
                            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            MobileElement fotoEkleme2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                            fotoEkleme2.click();
                            Reports.report("OK","Foto","Fotograf ekleme butonu bulundu tıklandı...");
                            Foto();
                            try {
                                try{
                                    TimeUnit.SECONDS.sleep(5);

                                }catch (InterruptedException e) {

                                }
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                MobileElement saveButonu2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]/android.view.View");
                                saveButonu2.click();
                                Reports.report("OK","Foto","Save butonu bulundu tıklandı...");
                                try {
                                    MobileElement requestInfoText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
                                    if(requestInfoText.getText().equals("Your request has been received. It will be controlled as soon as possible. You can follow it on pending approvals or on the rejected menus")) {
                                        MobileElement requestInfoOk = (MobileElement) driver.findElementById("android:id/button1");
                                        requestInfoOk.click();
                                        Reports.report("OK","RequestInfo","Info text dogru onaylandı...");
                                    } else {
                                        Reports.report("NoElement","RequestInfo","Info text farklı...");
                                    }
                                }catch (NoSuchElementException e) {

                                }
                            }catch (NoSuchElementException e) {
                                Reports.report("NoElement","Foto","Save butonu bulunamadı...");
                            }
                        }catch (NoSuchElementException e) {
                            Reports.report("NoElement","Foto","Fotograf ekleme butonu bulunamadı...");
                        }
                    }catch (NoSuchElementException e) {
                        Reports.report("NoElement","Foto","Save butonu bulunamadı...");
                    }
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Foto","Fotograf ekleme butonu bulunamadı...");
                }
            } catch (NoSuchElementException e) {
                Reports.report("NoElement", "AskForCancel", "No butonu bulunamadı...");
            }

                try {
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
                    homePage.click();
                    Reports.report("OK","Will Be Closed","Home page butonu bulundu tıklandı...");
                    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                } catch (NoSuchElementException e) {
                    Reports.report("NoElement","Will Be Closed","Home page butonu bulunamadı...");
                }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Will Be Closed butonu ekranda mevcut değil...");
        }
    }

    public int init() {
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {

        }
        int expectedCount = -1;
        MobileElement willBeClosedButton=null;
        MobileElement willBeClosedText=null;

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            willBeClosedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]");

            willBeClosedText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");

        }catch (NoSuchElementException e) {
            try{
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                willBeClosedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]");
                willBeClosedText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]");

            }catch (NoSuchElementException ex) {
                Reports.report("OK", "geovisionGroupUpdated", "Will Be Closed butonu ekranda mevcut degil ...");
                return -1;
            }
        }
        if (willBeClosedText.getText().equals("0")) {
            willBeClosedButton.click();
            Reports.report("OK", "geovisionGroupUpdated", "Will Be Closed butonu ekranda mevcut. Butona tıklandı ...");
            infoText();
        } else {
            expectedCount = Integer.parseInt(willBeClosedText.getText());
            System.out.println(expectedCount);
            willBeClosedButton.click();
            Reports.report("OK", "geovisionGroupUpdated", "Will Be Closed butonu ekranda mevcut. Butona tıklandı ...");
            try {
                TimeUnit.SECONDS.sleep(2);

            } catch (InterruptedException e) {

            }
            try {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                onayButonu.click();
            } catch (NoSuchElementException e) {

            }
        }
        return expectedCount;

    }
}
