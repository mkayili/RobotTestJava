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

        //test startTest = new test(username,pass);
        Reports reports= new Reports(true,username,pass);
        /*while(true) {
            //Reports.report("--------------------","----------"+i+". test bitti---------","--------------------");
            startTest.endSession();
            startTest = new test(username,pass);
       }*/
    }
}
