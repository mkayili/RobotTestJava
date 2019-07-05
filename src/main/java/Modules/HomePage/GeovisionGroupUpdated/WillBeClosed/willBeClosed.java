package Modules.HomePage.GeovisionGroupUpdated.WillBeClosed;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class willBeClosed extends geovisionGroupUpdated {
    private AndroidDriver driver;
    public willBeClosed(AndroidDriver driver){
        super(driver);
        this.driver=driver;
    }

    public  void Run() {
        try{
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            MobileElement willbeClosedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]");
            MobileElement willbeClosedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");
            if(willbeClosedText.getText().equals("0")) {
                willbeClosedButton.click();
                Reports.report("OK","geovisionGroupUpdated","Will Be Closed butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
                int count = Integer.parseInt(willbeClosedText.getText());
                //System.out.println(count);
                willbeClosedButton.click();
                Reports.report("OK","geovisionGroupUpdated","Will Be Closed butonu ekranda mevcut. Butona tıklandı ...");
                try{
                    TimeUnit.SECONDS.sleep(2);

                }catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                MobileElement onayButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                onayButonu.click();

                /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                List<MobileElement> elements = driver.findElementsByClassName("android.widget.TextView");
                System.out.println(elements.size());
                for(int i = 0; i < elements.size(); i++) {
                    System.out.println(elements.get(i).toString());
                }*/
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //WebDriver webDriver = new We
                //MobileElement scroll = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView");
                /*Dimension size = driver.manage().window().getSize();
                int width = (int)size.getWidth()/2;
                int startPoint = (int)(size.getHeight()*0.8);
                int endPoint = (int)(size.getHeight()*0.2);
                new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction().moveTo(PointOption.point(width, endPoint)).release().perform();*/

                System.out.println(ListeyiSay());
                //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView

                /*KisiSec("willBeClosed",1);

                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView");
                    el4.click();
                    Reports.report("OK","Info","Info butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Info","Info butonu bulunamadı...");
                }

                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
                    el5.click();        //Icerdeki info OK buton
                    Reports.report("OK","Info","OK butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Info","OK butonu bulunamadı...");
                }  */

                /*try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement gitButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]");
                    gitButonu.click();//Git butonu


                }catch (NoSuchElementException e) {

                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement googlemapKapat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.TextView");
                    googlemapKapat.click();//Kapat butonu
                }catch (NoSuchElementException e) {

                }*/




                /*
                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement continueButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]");
                    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]

                    continueButonu.click();//Continue butonu                                         /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]
                    Reports.report("OK","Map","Continue butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Map","Continue butonu bulunamadı...");
                }
                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement silinsinmiYes = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    silinsinmiYes.click();
                    Reports.report("OK","AskForCancel","Yes butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","AskForCancel","Yes butonu bulunamadı...");
                }

                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement warningOk = (MobileElement) driver.findElementById("android:id/button1");
                    warningOk.click();
                    Reports.report("OK","Warning","OK(warning) butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Warning","OK(warning) butonu bulunamadı...");
                }

                try {
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement silinsinmiNo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]");
                    silinsinmiNo.click();
                    Reports.report("OK","AskForCancel","No butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","AskForCancel","No butonu bulunamadı...");
                }


                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoEkleme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    fotoEkleme.click();
                    Reports.report("OK","Foto","Fotograf ekleme butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Foto","Fotograf ekleme butonu bulunamadı...");
                }
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
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Foto","Save butonu bulunamadı...");
                }

                try {
                    try{
                        TimeUnit.SECONDS.sleep(2);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotoEkleme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                    fotoEkleme.click();
                    Reports.report("OK","Foto","Fotograf ekleme butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Foto","Fotograf ekleme butonu bulunamadı...");
                }
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
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Foto","Save butonu bulunamadı...");
                }

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

                }*/
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Will Be Closed butonu ekranda mevcut değil...");
        }
    }
}
