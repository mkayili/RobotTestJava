package InitTest;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Report.Reports;
import Utils.DriverController;


public class initTest{

    public static void main(String[] args) {
        String username = args[0];
        String pass = args[1];
        test startTest = new test(username,pass);
        int i=0;
        while(true) {
            ++i;
            Reports.report("--------------------","----------"+i+". test bitti---------","--------------------");
            startTest.endSession();
            startTest = new test(username,pass);
       }
    }
}
