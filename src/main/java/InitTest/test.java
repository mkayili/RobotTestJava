package InitTest;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Report.Reports;
import Utils.DriverController;

public class test {
    DriverController drv = new DriverController();
    public test(String arg1, String arg2) {
        try {
            Process killBash = new ProcessBuilder("taskkill /IM bash.exe /F").start();
            killBash.waitFor();
            killBash.destroy();
        } catch (Exception e) {

        }

        Reports reports= new Reports(true,drv.getAndroidDriver());
        Login login = new Login(drv.getAndroidDriver());
        geovisionGroupUpdated update = new geovisionGroupUpdated(drv.getAndroidDriver());
        SideBar bar = new SideBar(drv.getAndroidDriver(),arg1, arg2);
        login.userLoginProcess(arg1,arg2);
        update.runTest();
        bar.testMenu();
    }
    public void endSession() {
        drv.endSession();
        drv = new DriverController();
    }
}
