import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Utils.CrashDetector;
import Utils.DriverController;


public class initTests {

    public static void main(String[] args) throws  Exception {
        new CrashDetector(true);
        DriverController drv = new DriverController();
        Login login = new Login(drv.getAndroidDriver());
        geovisionGroupUpdated update = new geovisionGroupUpdated(drv.getAndroidDriver());
        //SideBar bar = new SideBar(drv.getAndroidDriver());
        login.userLoginProcess();
        //bar.openMenu();
        update.gvgUpdated();


    }
}
