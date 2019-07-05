package Report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Reports {
    private static String dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(Calendar.getInstance().getTime());
    private static String reportName = "report"+"-" + dateFormat +".txt";

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

