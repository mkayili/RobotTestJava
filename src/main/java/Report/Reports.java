package Report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Reports {
    public static void report(String status, String page, String messsage){
        String str = status+" - "+page+" - "+messsage;
        System.out.println(str);

        try{
            File file = new File("C:/Users/geatalay/Desktop/RobotTestJava/report.txt");
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

