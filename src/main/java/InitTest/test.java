package InitTest;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Report.Reports;
import Utils.DriverController;

public class test{
    DriverController drv = new DriverController();
    static int testCount=0;
    public test(String arg1, String arg2) {
        try {
            Process killBash = new ProcessBuilder("taskkill /IM bash.exe /F").start();
            killBash.waitFor();
            killBash.destroy();
        } catch (Exception e) {

        }
        testCount++;
        Login login = new Login(drv.getAndroidDriver());
        geovisionGroupUpdated update = new geovisionGroupUpdated(drv.getAndroidDriver());
        SideBar bar = new SideBar(drv.getAndroidDriver(),arg1, arg2);
        login.userLoginProcess(arg1,arg2);
        update.runTest();
        bar.testMenu();
        Reports.report("--------------------","----------"+testCount+". test bitti---------","--------------------");
    }
    public int getTestCount(){
        return testCount;
    }
    public void endSession() {

        drv.endSession();
        //drv = new DriverController();
    }

    public void restart(test t) {
        endSession();
        t = new test("","");

    }
}
