package InitTest;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Modules.HomePage.CustomerUpdates.ActivateOutlets.activateOutlet;
import Modules.HomePage.CustomerUpdates.customerUpdates;
import Report.Reports;
import Utils.DriverController;

public class test{
    private DriverController drv;
    static int testCount=0;
    private String username,password;
    public test(String arg1, String arg2) {
        this.username = arg1;
        this.password = arg2;
        drv = new DriverController();
        try {
            Process killBash = new ProcessBuilder("taskkill /IM bash.exe /F").start();
            killBash.waitFor();
            killBash.destroy();
        } catch (Exception e) {

        }

    }
    public void start() {
        testCount++;
        Login login = new Login(drv.getAndroidDriver());
        geovisionGroupUpdated update = new geovisionGroupUpdated(drv.getAndroidDriver());
        SideBar bar = new SideBar(drv.getAndroidDriver(),username, password);
        customerUpdates customerUpdates = new customerUpdates(drv.getAndroidDriver());
        //login.forgotPasswordTest();
        login.userLoginProcess(username,password);
        //update.runTest();
        customerUpdates.runTest();
        bar.testMenu();

        Reports.report("--------------------","----------"+testCount+". test bitti(basarili)---------","--------------------");
    }
    public static int getTestCount(){
        return testCount;
    }
    public void endSession() {
        //this = new test(arg1,arg2);
        drv.endSession();
        //drv = new DriverController();
    }

}
