package Report;
import InitTest.*;
import Utils.DriverController;
import io.appium.java_client.android.AndroidDriver;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.UUID;

public class Reports {
    private static String dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(Calendar.getInstance().getTime());
    private static String reportName = "report"+"-" + dateFormat +".txt";
    private AndroidDriver driver;
    public Reports(boolean detect, AndroidDriver driver) {
        this.driver = driver;
        if (detect)
            open();
    }

    void open() {
        new Thread() {
            public void run() {
                System.out.println("Crash Detector starting...");

                try {
                    Process clear = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe","adb logcat -c").start();
                    clear.waitFor();
                    clear.destroy();
                    ProcessBuilder ps = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe", "-c", "adb logcat | grep --line-buffered \"FATAL\" | tee -a " + reportName);

                    ps.redirectErrorStream(true);

                    Process pr = ps.start();


                    InputStream in = pr.getErrorStream();
                    for (int i = 0; i < in.available(); i++) {
                        System.out.println("" + in.read());
                    }

                    pr.waitFor();

                } catch (Exception e) {
                    System.out.println("Crash detector başlatılamadı. gitbash.exe veya Adb ve/veya Emulator ayarlarınızı kontrol ediniz");
                }
                try {
                    File file = new File(reportName);
                    file.createNewFile();
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String st;
                    while (true) {
                        while ((st = br.readLine()) != null) {
                            if (st.contains("FATAL")) {
                                initTest afterFatal = new initTest();
                                stop();
                            }
                        }
                        Thread.sleep(2000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();}
            }
        }.start();
    }
    public static void report(String status, String page, String messsage){
        String str = status+" - "+page+" - "+messsage;
        System.out.println(str);
        try{
            File file = new File(reportName);
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.append(str);
            bw.newLine();
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}

