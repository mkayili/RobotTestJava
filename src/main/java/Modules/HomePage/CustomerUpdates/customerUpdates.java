package Modules.HomePage.CustomerUpdates;

import Modules.HomePage.CustomerUpdates.ActivateOutlets.activateOutlet;
import Modules.HomePage.CustomerUpdates.CloseOutlet.closeOutlet;
import Modules.HomePage.CustomerUpdates.IncompleteClaims.incompleteClaims;
import Modules.HomePage.CustomerUpdates.NewOutlets.newOutlet;
import Modules.HomePage.CustomerUpdates.PassiveOutlets.passiveOutlets;
import Modules.HomePage.CustomerUpdates.UpdateOutlet.updateOutlet;


import Report.Reports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class customerUpdates {

    AndroidDriver driver;

    public customerUpdates(AndroidDriver driver) {
        this.driver = driver;
    }

    public void runTest() {

        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement CustomerUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]\n");
            CustomerUpdateButton.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }
        activateOutlet activatedOutlet = new activateOutlet(driver);
        activatedOutlet.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }



        updateOutlet updateOutlet = new updateOutlet(driver);
        updateOutlet.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }


        closeOutlet closeOutlet = new closeOutlet(driver);
        closeOutlet.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }

        passiveOutlets passiveOutlets = new passiveOutlets(driver);
        passiveOutlets.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }

        incompleteClaims incompleteClaims = new incompleteClaims(driver);
        incompleteClaims.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
        }

        newOutlet newOutlet = new newOutlet(driver);
        newOutlet.runTest();
        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","CustomerUpdateButton butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "CustomerUpdateButton butonuna ulaşılamadı.");
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





    public String getInsideParanthesis(String str){
        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        return answer;
    }
}
