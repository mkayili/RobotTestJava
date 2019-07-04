import Modules.HomePage.GeovisionGroupUpdated.GvgUpdate;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Utils.DriverController;

public class initTests {

    public static void main(String[] args) {
        new CrashDetector(true);
        DriverController drv = new DriverController();
        Login login = new Login(drv.getAndroidDriver());
        GvgUpdate update = new GvgUpdate(drv.getAndroidDriver());
        SideBar bar = new SideBar(drv.getAndroidDriver());
        login.userLoginProcess();
        bar.openMenu();
        //update.gvgUpdated();
    }
}
