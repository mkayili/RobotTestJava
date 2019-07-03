import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.lang.System.*;

import java.util.concurrent.TimeUnit;


public class Operations {
    float startTime,endTime;
    AndroidDriver driver;
    public Operations(AndroidDriver driver) {
        this.driver = driver;
    }

    public float measureTime(MobileElement e) {
        startTime = System.currentTimeMillis();
        while(e.isDisplayed()) {
        }
        endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public void userLoginProcess() {
        //startTime = System.currentTimeMillis();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Reports.report("OK", "Login Page", "Uygulamanın açılması "+(endTime-startTime) + "sürdü ...");
        try{
            MobileElement username = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
            username.click();
            username.sendKeys("TEST90001336");
            driver.hideKeyboard();
            Reports.report("OK", "Login Page",
                    "Username metin alanı ekranda mevcut.İlgili metin girildi ve klavye kapatıldı...");

        }catch (NoSuchElementException e) {
            Reports.report("NoElement", "Login Page", "Username metin alanı ekranda mevcut değil...");

        }
        try{
            MobileElement password = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
            password.click();
            password.sendKeys("1111");
            driver.hideKeyboard();
            Reports.report("OK","Login Page","Password metin alanı mevcut. İlgili metin girildi ve klavye kapatıldı...");

        }catch (NoSuchElementException e){
            Reports.report("NoElement","Login Page","Password metin alanı mevcut değil...");
        }
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement loginBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
            loginBtn.click();

            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            Reports.report("OK","Login Page","Login butonu ekranda mevcut. Butona tıklandı ve giriş yapıldı...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Login Page", "Login butonu ekranda mevcut değil...");
        }
        //startTime = System.currentTimeMillis();
        //Reports.report("OK","Sync Page","startTime: " + startTime );

    }


    public void gvgUpdated() {

        try{
            driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
            MobileElement UpdatedBtn = (MobileElement) driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]");
            UpdatedBtn.click();
            Reports.report("OK","Home","Update butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e){
            Reports.report("NoElement", "Home", "Update butonuna ulaşılamadı.");
        }
        willBeClosed();
        //informationUpdate();
        //dublicateOutlets();
        //non_foundOutlets();
        //willBeActivated();
        //suggestedNewCustomer();
        /*try {
            MobileElement mainScreenButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[2]");
            mainScreenButton.click();
            Reports.report("OK","GvgUpdate","Main Screen butonu ekranda mevcut. Butona tıklandı ...");
        }catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Main Screen butonu ekranda mevcut değil...");
        }*/
    }

    public void willBeClosed() {
        try{
            MobileElement willbeClosedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]");
            MobileElement willbeClosedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");
            if(willbeClosedText.getText().equals("0")) {
                willbeClosedButton.click();
                Reports.report("OK","GvgUpdate","Will Be Closed butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        }
        catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Will Be Closed butonu ekranda mevcut değil...");
        }
    }

    public void informationUpdate() {
        try{
            MobileElement informationUpdateButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]");
            MobileElement informationUpdateText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");
            if(informationUpdateText.getText().equals("0")) {
                informationUpdateButton.click();
                Reports.report("OK","GvgUpdate","Information Update butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        }
        catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Information Update butonu ekranda mevcut değil...");
        }
    }



    public void dublicateOutlets() {
        try{
            MobileElement dublicateOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]");
            MobileElement dublicateOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            if(dublicateOutletsText.getText().equals("0")) {
                dublicateOutletsButton.click();
                Reports.report("OK","GvgUpdate","Duplicate Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        }
        catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Duplicate Outlets butonu ekranda mevcut değil...");
        }
    }

    public void non_foundOutlets() {
        try{
            MobileElement non_foundOutletsButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]");
            MobileElement non_foundOutletsText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.TextView[1]");
            if(non_foundOutletsText.getText().equals("0")) {
                non_foundOutletsButton.click();
                Reports.report("OK","GvgUpdate","Non Found Outlets butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        }
        catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Non Found Outlets butonu ekranda mevcut değil...");
        }
    }

    public void willBeActivated() {
        try{
            MobileElement willBeActivatedButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]");
            MobileElement willBeActivatedText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.TextView[1]");
            if(willBeActivatedText.getText().equals("0")) {
                willBeActivatedButton.click();
                Reports.report("OK","GvgUpdate","Will Be Activated butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        }
        catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Will Be Activated butonu ekranda mevcut değil...");
        }
    }

    public void suggestedNewCustomer() {
        try{
            MobileElement suggestedNewCustomerButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]");
            MobileElement suggestedNewCustomerText = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.TextView[1]");
            if(suggestedNewCustomerText.getText().equals("0")) {
                suggestedNewCustomerButton.click();
                Reports.report("OK","GvgUpdate","Suggested New Customer butonu ekranda mevcut. Butona tıklandı ...");
                infoText();
            } else {
            }
        }
        catch (NoSuchElementException e) {
            Reports.report("NoElement", "GvgUpdate", "Suggested New Customer butonu ekranda mevcut değil...");
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
            Reports.report("NoElement", "Info", "There are no recommendations in this scenario. mesajı görülemedi ...");
        }
    }


    public String getInsideParanthesis(String str){
        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        return answer;
    }
    //konum bilgisi yetersiz-> tamam butonu /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button

}
