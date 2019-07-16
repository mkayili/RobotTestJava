package InitTest;

import Modules.HomePage.GeovisionGroupUpdated.geovisionGroupUpdated;
import Modules.LoginPage.Login;
import Modules.SideBar.SideBar;
import Report.Reports;
import Utils.DriverController;

import java.io.File;


public class initTest{

    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];

        test startTest = new test(username,password);
        Reports reports= new Reports(startTest,username,password);

        try {
            Process clear = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe", "-c","adb logcat -c").start();
            clear.waitFor();
            clear.destroy();
            ProcessBuilder ps = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe", "-c", "adb logcat -b crash AndroidRuntime:E *:S | tee -a " +reports.getReportname() );

            ps.redirectErrorStream(true);

            Process pr = ps.start();



        } catch (Exception e) {
            System.out.println("Crash detector başlatılamadı. gitbash.exe veya Adb ve/veya Emulator ayarlarınızı kontrol ediniz");
        }

        startTest.start();

        //test startTest = new test(username,pass);


        /*while(true) {
            //Reports.report("--------------------","----------"+i+". test bitti---------","--------------------");
            startTest.endSession();
            startTest = new test(username,pass);
       }*/
    }
}
