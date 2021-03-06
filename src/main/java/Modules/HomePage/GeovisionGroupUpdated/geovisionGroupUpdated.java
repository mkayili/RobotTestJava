package Modules.HomePage.GeovisionGroupUpdated;

import Modules.HomePage.GeovisionGroupUpdated.InformationUpdate.informationUpdate;
import Modules.HomePage.GeovisionGroupUpdated.WillBeClosed.willBeClosed;
import Modules.HomePage.GeovisionGroupUpdated.NonFoundOutlets.nonFoundOutlets;

import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class geovisionGroupUpdated {
    AndroidDriver driver;

    public geovisionGroupUpdated(AndroidDriver driver) {
        this.driver = driver;
    }

    public void runTest() {

        willBeClosed willBeClosedTest = new willBeClosed(driver);
        informationUpdate informationUpdateTest = new informationUpdate(driver);
        nonFoundOutlets nonFoundOutletsTest = new nonFoundOutlets(driver);
        updatedButton();
        willBeClosedTest.runTest();
        //updatedButton();
        informationUpdateTest.runTest();
        //updatedButton();
        nonFoundOutletsTest.runTest();
        goMainPage();


    }


    public void dublicateOutlets() {
        try{
            MobileElement dublicateOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]");
            MobileElement dublicateOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            if(dublicateOutletsText.getText().equals("0")) {
                dublicateOutletsButton.click();
                Reports.report("OK","geovisionGroupUpdated","Duplicate Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Duplicate Outlets butonu ekranda mevcut değil...");
        }
    }


    public void willBeActivated() {
        try{
            MobileElement willBeActivatedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]");
            MobileElement willBeActivatedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.TextView[1]");
            if(willBeActivatedText.getText().equals("0")) {
                willBeActivatedButton.click();
                Reports.report("OK","geovisionGroupUpdated","Will Be Activated butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Will Be Activated butonu ekranda mevcut değil...");
        }
    }

    public void suggestedNewCustomer() {
        try{
            MobileElement suggestedNewCustomerButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]");
            MobileElement suggestedNewCustomerText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.TextView[1]");
            if(suggestedNewCustomerText.getText().equals("0")) {
                suggestedNewCustomerButton.click();
                Reports.report("OK","geovisionGroupUpdated","Suggested New Customer butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement", "geovisionGroupUpdated", "Suggested New Customer butonu ekranda mevcut değil...");
        }
    }

    public void infoText() {
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement infoTex = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
            if(infoTex.getText().equals("There are no recommendations in this scenario.")) {
                Reports.report("OK", "Info", "There are no recommendations in this scenario. mesajı görüldü ...");
                try {
                    MobileElement okButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
                    okButton.click();
                    Reports.report("OK", "Info", "OK butonu görüldü, tıklandı ...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement", "Info", "OK butonu bulunamadı ...");
                }
            } else {
                Reports.report("WrongText", "Info", "Beklenen mesaj alınamadı ...");
            }
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Info", "There are no recommendations in this scenario. mesajı görülemedi...");
        }
    }


    public void KisiSec(String page, int sira) {


        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + sira +"]/android.view.View[1]/android.widget.TextView[3]");
            //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]

            el1.click();        //Listedeki ilk buton info

            Reports.report("OK",page,sira + ". sıradaki Info butonu bulundu tıklandı...");
            try {
                try{
                    TimeUnit.SECONDS.sleep(2);

                }catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
                el2.click();        //Info uyarı OK buton
                Reports.report("OK","Info","OK butonu bulundu tıklandı...");
            }catch (NoSuchElementException e) {
                Reports.report("NoElement","Info","OK butonu bulunamadı...");
            }
        }catch (NoSuchElementException e) {
            //Reports.report("NoElement",page,sira + ". sıradaki Info butonu bulunamadı...");
        }



        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ sira +"]/android.view.View[1]");
            //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]
            //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[1]
            //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]



            el3.click();        //Listedeki sıra buton
            Reports.report("OK",page,sira + ". sıradaki Bilgiler bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",page,sira + ". sıradaki Bilgiler bulunamadı...");
        }
    }

    public void goHome(String page) {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MobileElement homePage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView");
            homePage.click();
            Reports.report("OK",page,"Home page butonu bulundu tıklandı...");
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        } catch (NoSuchElementException e) {
            Reports.report("NoElement",page,"Home page butonu bulunamadı...");
        }
    }

    public int ListeyiSay(String Page,MobileElement element) {
        HashSet<String> liste = new HashSet<String>();
        Point location = element.getLocation();
        Dimension size = driver.manage().window().getSize();
        int width = (int)size.getWidth()/2;
        int startPoint = (int)(location.getY()+element.getSize().getHeight()*0.7);
        int endPoint = (int)(location.getY()+1);
        int i;
        for(i=1;;++i) {
            try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.view.View[1]/android.widget.TextView[2]");

                try {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.view.View[1]/android.widget.TextView[1]");
                    liste.add(el.getText());
                    //System.out.println(el.getText());
                } catch (NoSuchElementException e) {
                    //System.out.println("Liste elemanı alınamadı...");
                }
                /*el3.findElements(By.xpath(""));
                if (el3.isDisplayed()) {
                    liste.add(el3.getText());
                    System.out.println(el3.getText());
                }*/
            }catch (NoSuchElementException e) {
                try {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement el = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[" + i + "]/android.widget.TextView");

                    if(el.getText().equals("All points loaded")) {
                        //System.out.println(liste);
                        return liste.size();
                    }
                    //System.out.println(liste);

                }catch (NoSuchElementException x) {
                    Reports.report("OK",Page,"Liste alınıyor, scroll yapılacak...");
                    new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction().moveTo(PointOption.point(width, endPoint)).release().perform();
                    i=0;
                }

            }
        }


    }

    public void listeyiDoldur(String Page,MobileElement element) {
        List<String> liste = new ArrayList<String>();
        Point location = element.getLocation();
        Dimension size = driver.manage().window().getSize();
        int width = (int)size.getWidth()/2;
        int startPoint = (int)(location.getY()+element.getSize().getHeight()*0.6);
        int endPoint = (int)(location.getY()+5);
        int i=0;
        String ilk = "";
        int firstIndex=1;
        while(true) {
            try{
                i++;
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement listeEl = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[1]/android.view.View/android.widget.TextView");
                

                if(listeEl.getText().equals("Update Address (Update the fields below if there is any change)")) {

                }
                else {
                    MobileElement ikinc = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[2]");
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    if(i==firstIndex) {
                        if(ilk.equals("") || !ilk.equals(listeEl.getText())) {
                            ilk = listeEl.getText();
                        } else {
                            Reports.report("OK",Page,"Listenin sonu...");
                            break;//bitti
                        }
                    }
                    if (!liste.contains(listeEl.getText())) {
                        liste.add(listeEl.getText());
                        try {
                            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                            MobileElement cevapEdittext = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[2]/android.view.View/android.widget.EditText");

                            String cevap = cevapEdittext.getText();//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText
                            //System.out.println(cevap);
                            cevapEdittext.click();
                            cevapEdittext.clear();
                            if(!cevap.matches(".*[a-zA-Z]+.*")) {
                                cevap = cevap.replaceAll("\\(","");
                                cevap = cevap.replaceAll("\\)","");
                                cevap = cevap.replaceAll(" ","");
                                //System.out.println(cevap);
                                cevapEdittext.sendKeys("");
                                try {
                                    int j=0;

                                    do {
                                        Thread.sleep(300);
                                        char c = cevap.charAt(j);
                                        int a = Character.getNumericValue(c);
                                        switch (a) {
                                            case 0:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                                                break;
                                            case 1:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                                                break;
                                            case 2:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                                                break;
                                            case 3:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                                                break;
                                            case 4:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                                                break;
                                            case 5:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                                                break;
                                            case 6:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                                                break;
                                            case 7:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                                                break;
                                            case 8:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                                                break;
                                            case 9:
                                                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
                                                break;
                                            default:
                                                break;
                                        }
                                        j++;
                                    }while(j<cevap.length());

                                } catch (Exception e) {

                                }
                            }else {
                                //System.out.println(cevap);
                                String fixed = cevap.replaceAll("[^\\x20-\\x7e]", "");//Replace non ASCI characters
                                //System.out.println(fixed);
                                cevapEdittext.sendKeys(fixed);
                            }
                            Reports.report("OK",Page,"EditText bulundu, dolduruldu...");
                            driver.hideKeyboard();
                        } catch (NoSuchElementException exc){
                            try {
                                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                                MobileElement scrollList = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[2]/android.view.View/android.view.View/android.view.View");
                                //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View

                                try {
                                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                                    MobileElement scrollListText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TextView");

                                    if(scrollListText.getText().equals("Select")){
                                        scrollList.click();
                                        MobileElement ilkEleman = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]");
                                        ilkEleman.click();
                                        Reports.report("OK",Page,"ScrollList bulundu,ilk cevap secildi ...");
                                    }

                                } catch (NoSuchElementException e) {

                                }

                                //String cevap = cevapEdittext.getText();


                            } catch (NoSuchElementException ex) {
                                try {
                                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                                    MobileElement checkBox = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[2]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View");
                                    MobileElement checkBoxText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[2]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");
                                    checkBox.click();
                                    try {
                                        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                                        MobileElement fotoButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View[1]/android.view.View/android.view.View");
                                        //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]
                                        //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]
                                        //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View/android.view.View
                                        //fotoButton.click();
                                        //Foto2();
                                        Reports.report("OK",Page,"Fotograf cekildi ...");
                                    } catch (NoSuchElementException excep) {
                                        Reports.report("NoElement",Page,"Fotograf butonu bulunamadi  ...");
                                    }
                                } catch (NoSuchElementException exce) {
                                    Reports.report("NoElement",Page,"Cannot find proper answer...");
                                }
                            }
                        }
                    }
                }
            }catch (NoSuchElementException e) {
                try {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement fotoButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.widget.ScrollView/android.view.View/android.view.View["+ i +"]/android.view.View/android.view.View/android.view.View[2]");
                    fotoButton.click();
                    Foto2();
                } catch (NoSuchElementException ex) {
                    if(i!=1){
                        Reports.report("OK",Page,"Liste alınıyor, scroll yapılacak...");
                        new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction().moveTo(PointOption.point(width, endPoint)).release().perform();
                        firstIndex=1;
                        i=0;
                    } else {
                        firstIndex = 2;
                    }
                }

            }

        }
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            MobileElement saveButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
            saveButonu.click();
            Reports.report("OK",Page,"Save butonu bulundu, tiklandi ...");
            try {
                try{
                    TimeUnit.SECONDS.sleep(5);

                }catch (InterruptedException e) {

                }
                MobileElement infoTitle = (MobileElement) driver.findElementById("android:id/alertTitle");

                //if(saveInfoText.getText().equals(""))
                Reports.report("OK",Page,"Info text bulundu ...");
                try{
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    MobileElement infoOnay = (MobileElement) driver.findElementById("android:id/button1");
                    if(infoTitle.getText().equals("Lütfen zorunlu soruları doldurunuz")) {
                        Reports.report("FAIL",Page,"Zorunlu sorular yanitlanamadi...");
                        infoOnay.click();
                        Reports.report("OK",Page,"Info text onay butonu bulundu, tiklandi ...");
                        try {
                            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                            MobileElement geriButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]");
                            geriButonu.click();
                            Reports.report("OK",Page,"Geri butonu bulundu, tiklandi...");
                            try {
                                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                MobileElement infoEvetButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
                                infoEvetButonu.click();
                                Reports.report("OK",Page,"Info evet butonu bulundu, tiklandi...");
                            }catch (NoSuchElementException ex) {
                                //Reports.report("NoElement",Page,"Info evet butonu bulunamadı...");
                                goHome(Page);
                                updatedButton();
                            }

                        } catch (NoSuchElementException ex) {
                            Reports.report("NoElement",Page,"Geri butonu bulunamadi...");
                        }
                        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        MobileElement geriButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]");
                        geriButonu.click();*/
                    } else {
                        infoOnay.click();
                        Reports.report("OK",Page,"Info text onay butonu bulundu, tiklandi ...");
                    }
                }catch (NoSuchElementException e2) {
                    Reports.report("OK",Page,"Info text onay butonu bulunamadi ...");
                }
            } catch (NoSuchElementException ex) {
                Reports.report("NoElement",Page,"Info text bulunamadi ...");
            }
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",Page,"Save butonu bulunamadi ...");
        }
    }

    public void icerdekiButonlariTestEt(String Page) { //rapor geri butonlarını test eder
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement raporButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            raporButonu.click();
            Reports.report("OK",Page,"Rapor butonu bulundu, tiklandi ...");
            MobileElement okButonu = (MobileElement) driver.findElementById("android:id/button1");
            okButonu.click();
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",Page,"Rapor butonu bulunamadı...");
            return;

        }
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            MobileElement supportButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[2]");
            supportButton.click();
            Reports.report("OK",Page,"Support butonu bulundu, tiklandi ...");
            try {
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                MobileElement reportType = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Spinner[2]");
                Reports.report("OK",Page,"Support tipi alındi...");
                try{
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    MobileElement supportEdittext = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
                    supportEdittext.sendKeys("deneme");
                    driver.hideKeyboard();
                    Reports.report("OK",Page,"Support edit text bulundu, metin girildi ...");
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    MobileElement supportSendButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View");
                    supportSendButton.click();
                    Reports.report("OK",Page,"Support send butonu bulundu, tiklnadi ...");
                    /*try{
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        MobileElement saveButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
                    }catch (NoSuchElementException e2) {

                    }*/
                }catch (NoSuchElementException exc) {
                    Reports.report("NoElement",Page,"Support kısmında eksikler var...");
                }
            }catch (NoSuchElementException ex) {
                Reports.report("NoElement",Page,"Support tipi alınamadı...");
            }
        } catch (NoSuchElementException e) {
            Reports.report("NoElement",Page,"Support butonu bulunamadı...");
            return;
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(8);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement geriButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]");
            geriButonu.click();
            Reports.report("OK",Page,"Geri butonu bulundu, tiklandi...");
            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement infoEvetButonu = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
                infoEvetButonu.click();
                Reports.report("OK",Page,"Info evet butonu bulundu, tiklandi...");
            }catch (NoSuchElementException ex) {
                //Reports.report("NoElement",Page,"Info evet butonu bulunamadı...");
            }
        }catch (NoSuchElementException e) {
            Reports.report("NoElement",Page,"Geri butonu bulunamadı...");
            return;
        }
    }
    public void Foto() {
        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoSilme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
            fotoSilme.click();
            Reports.report("OK","Foto","Fotograf silme butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf silme butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");

        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulundu tıklandı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoKabul.click();
            Reports.report("OK","Foto","Fotograf kabul butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf kabul butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoKabul.click();
            Reports.report("OK","Foto","Fotograf kabul butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf kabul butonu bulunamadı...");
        }

        try {
            try{
                TimeUnit.SECONDS.sleep(5);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotolarOnay = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotolarOnay.click();
            Reports.report("OK","Foto","Fotograf(lar) onay butonu bulundu tıklandı...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf(lar) onay butonu bulunamadı...");
        }
    }


    public void Foto2() {
        try {
            try{
                TimeUnit.SECONDS.sleep(8);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement fotoCekme = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
            fotoCekme.click();
            Reports.report("OK","Foto","Fotograf cekme butonu bulundu tıklandı...");
            try {
                try{
                    TimeUnit.SECONDS.sleep(8);

                }catch (InterruptedException e) {

                }
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                MobileElement fotoKabul = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                fotoKabul.click();
                Reports.report("OK","Foto","Fotograf kabul butonu bulundu tıklandı...");
                try {
                    try{
                        TimeUnit.SECONDS.sleep(8);

                    }catch (InterruptedException e) {

                    }
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    MobileElement fotolarOnay = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
                    fotolarOnay.click();
                    Reports.report("OK","Foto","Fotograf(lar) onay butonu bulundu tıklandı...");
                }catch (NoSuchElementException e) {
                    Reports.report("NoElement","Foto","Fotograf(lar) onay butonu bulunamadı...");
                }
            }catch (NoSuchElementException e) {
                Reports.report("NoElement","Foto","Fotograf kabul butonu bulunamadı...");
            }
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Foto","Fotograf cekme butonu bulunamadı...");
        }

    }

    public void checkifLoading(String Page,String xpath) {
        int i=0;
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement loadingSymbol = (MobileElement) driver.findElementByXPath(xpath);
            i++;
        }catch (NoSuchElementException e) {
            //Reports.report("NoElement",Page,"Loading bulunamadi...");
            //return;
        }
        while(true) {

            try {
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                MobileElement loadingSymbol = (MobileElement) driver.findElementByXPath(xpath);
                i++;
            }catch (NoSuchElementException e) {
                if(i<1) {
                    Reports.report("NoElement",Page,"Loading bulunamadi...");
                    Reports.report("FAIL",Page,"Test failed");
                }
                else {
                    Reports.report("OK",Page,"Loading tamamlandi...");
                }
                break;
            }
        }
    }

    public boolean continueButonu(MobileElement continueButonu) {
        try {
            try{
                TimeUnit.SECONDS.sleep(2);

            }catch (InterruptedException e) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // will be closed hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]

            ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]
            continueButonu.click();//Continue butonu                                         /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.support.v4.view.ViewPager/android.view.View/android.view.View[4]/android.widget.HorizontalScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]
            Reports.report("OK","Map","Continue butonu bulundu tıklandı...");
            try{
                TimeUnit.SECONDS.sleep(8);

            }catch (InterruptedException e) {

            }
            try {
                if(continueButonu.getText().equals("Continue")) {
                    Reports.report("Fail","Map","Continue butonu calismiyor...");
                    return false;
                }
            } catch (NoSuchElementException e) {

            }

            return true;
        }catch (NoSuchElementException e) {
            Reports.report("NoElement","Map","Continue butonu bulunamadı...");
            return false;
        }
    }

    public String getInsideParanthesis(String str){
        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        return answer;
    }


    public void updatedButton(){
        try{
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","Update butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "Update butonuna ulaşılamadı.");
        }
    }

    public void goMainPage() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]");
            el1.click();
            Reports.report("OK","Geovision Group Updated","Mainpage butonu bulundu, tiklandi...");
        } catch (NoSuchElementException e) {
            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]");
                el1.click();
                Reports.report("OK","Geovision Group Updated","Mainpage butonu bulundu, tiklandi...");
            }catch (NoSuchElementException ex) {
                Reports.report("NoElement","Geovision Group Updated","Mainpage butonu bulunamadi...");
            }

        }
    }


}
