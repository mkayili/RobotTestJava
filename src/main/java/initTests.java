import Modules.HomePage.GeovisionGroupUpdated.GvgUpdate;
import Modules.LoginPage.Login;
import Utils.DriverController;

public class initTests {

    public static void main(String[] args) {
        DriverController drv = new DriverController();
        Login login = new Login(drv.getAndroidDriver());
        GvgUpdate update = new GvgUpdate(drv.getAndroidDriver());
        login.userLoginProcess();
        update.gvgUpdated();
    }
}
