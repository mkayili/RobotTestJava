import Modules.HomePage.GeovisionGroupUpdated.GvgUpdate;
import Modules.HomePage.SideBar.SideBarLogOut;
import Modules.LoginPage.Login;
import Utils.DriverController;

public class initTests {

    public static void main(String[] args) throws InterruptedException {
        DriverController drv = new DriverController();
        Login login = new Login(drv.getAndroidDriver());
        GvgUpdate update = new GvgUpdate(drv.getAndroidDriver());
        login.userLoginProcess();
        //update.gvgUpdated();
        SideBarLogOut sideBarLogOut = new SideBarLogOut(drv.getAndroidDriver());
        sideBarLogOut.logOutProcess();
    }
}
