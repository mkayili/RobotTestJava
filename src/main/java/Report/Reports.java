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
    private static String reportName = "report"+"-" + dateFormat + ".txt";
    //private AndroidDriver driver;
    private static String username,password;
    private static test t;
    //private static BufferedReader br;
    private static boolean restarted=false;
    public Reports(test t,String username, String password) {
        //this.driver = driver;

        this.t = t;
        this.username = username;
        this.password = password;

        /*if (detect)
            open();

        while(true) {
            System.out.println("-");
            if(restart) {
                restart = false;
                System.out.println("restarting...");
                t = null;
                t = new test(username, password);
            }
            try {
                Thread.sleep(1000);
            }catch (Exception e) {

            }

        }*/
        //t = new test(username,password);
    }

    /*void open() {
        new Thread() {
            public void run() {
                System.out.println("Crash Detector starting...");

                try {
                    Process clear = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe", "-c","adb logcat -c").start();
                    clear.waitFor();
                    clear.destroy();
                    ProcessBuilder ps = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe", "-c", "adb logcat -b crash AndroidRuntime:E *:S | tee -a " +reportName );

                    ps.redirectErrorStream(true);

                    Process pr = ps.start();



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
                            System.out.println("reading...");
                            if (st.contains("FATAL")) {
                                System.out.println("FATAL!!!");
                                Reports.report("--------------------","----------"+test.getTestCount()+". test bitti---------","--------------------");
                                t.endSession();
                                restart=true;
                            } else if(st.contains("test bitti")) {
                                restart=true;
                            }
                        }
                        Thread.sleep(2000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();}
            }
        }.start();
    }*/
    public static void report(String status, String page, String messsage){

        String time = new SimpleDateFormat("[HH-mm-ss]").format(Calendar.getInstance().getTime());
        String str = status+" - "+page+" - "+messsage;
        System.out.println(str);
        File file = new File(reportName);
        File file2 = new File("deneme12.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {

        }

        //File file = new File("deneme12.txt");
        /*String lastLine= "";

        String[] lines = new String[5];
        int count = 0;
        boolean fatalFound = false;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null ) {
                //lines[count % lines.length] = line;
                //count++;
                if (line.contains("E/AndroidRuntime")) {
                    fatalFound = true;
                    System.out.println("FATALLLL");
                    //Reports.report("--------------------", "----------" + test.getTestCount() + ". test bitti---------", "--------------------");
                    t.endSession();
                    t = new test(username, password);
                    t.start();
                } else if (line.contains("test bitti")) {
                    t.endSession();
                    t = new test(username, password);
                    t.start();
                }
            }

        } catch (Exception e) {

        }*/


        //System.out.println("son: " + lastLine);



        /*try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                System.out.println("son: "+line);
                lastLine = line;
            }
            if (lastLine.contains("E/AndroidRuntime")) {
                System.out.println("FATALLLL");
                Reports.report("--------------------", "----------" + test.getTestCount() + ". test bitti---------", "--------------------");
                t.endSession();
                t = new test(username, password);
                t.start();
            } else if (lastLine.contains("test bitti")) {
                t.endSession();
                t = new test(username, password);
                t.start();
            }
        }catch (Exception e) {

        }*/






        /*System.out.println(lastLine);
        if(lastLine.contains("E/AndroidRuntime")) {
            System.out.println("FATALLLL");
            Reports.report("--------------------","----------"+test.getTestCount()+". test bitti---------","--------------------");
            t.endSession();
            t = new test(username,password);
            t.start();
        } else if(lastLine.contains("test bitti")) {
            t.endSession();
            t = new test(username,password);
            t.start();
        }*/


        try{

            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.append(str);
            bw.newLine();
            bw.flush();


            String lastLine="";

            java.io.RandomAccessFile fileHandler = null;
            try {
                fileHandler =
                        new java.io.RandomAccessFile( file, "r" );
                long fileLength = fileHandler.length() - 1;
                StringBuilder sb = new StringBuilder();
                int line = 0;

                for(long filePointer = fileLength; filePointer != -1; filePointer--){
                    fileHandler.seek( filePointer );
                    int readByte = fileHandler.readByte();

                    if( readByte == 0xA ) {
                        if (filePointer < fileLength) {
                            line = line + 1;
                        }
                    } else if( readByte == 0xD ) {
                        if (filePointer < fileLength-1) {
                            line = line + 1;
                        }
                    }
                    if (line >= 4) {
                        break;
                    }
                    sb.append( ( char ) readByte );
                }

                lastLine = sb.reverse().toString();
                //return lastLine;
            } catch( java.io.FileNotFoundException e ) {
                e.printStackTrace();
                //return null;
            } catch( java.io.IOException e ) {
                e.printStackTrace();
                //return null;
            }
            finally {
                if (fileHandler != null )
                    try {
                        fileHandler.close();
                    } catch (IOException e) {
                    }
            }

            //System.out.println("okundu: " + lastLine);
            if (lastLine.contains("E/AndroidRuntime")) {
                System.out.println("FATALLLL");
                //Reports.report("--------------------", "----------" + test.getTestCount() + ". test bitti---------", "--------------------");
                //t.endSession();
                t = new test(username, password);
                System.out.println("--------------------"+ "----------" + test.getTestCount() + ". test bitti(FATAL)---------"+ "--------------------");
                bw.append("--------------------"+ "----------" + test.getTestCount() + ". test bitti(FATAL)---------"+ "--------------------");
                bw.newLine();
                //bw.newLine();
                bw.close();
                t.start();
            } else if (lastLine.contains("test bitti(basarili)")) {
                System.out.println("bittii");
                t.endSession();
                bw.newLine();
                bw.close();
                t = new test(username, password);
                t.start();
            } else{
                bw.close();
            }


        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public  String getReportname() {
        return reportName;
    }
}

