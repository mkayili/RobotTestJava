package Utils;

import java.io.InputStream;

public class CrashDetector {
    public CrashDetector(boolean detect) {
        if (detect)
            open();
    }

    void open() {
        new Thread() {
            public void run() {
                System.out.println("Crash Detector starting...");

                try {
                    ProcessBuilder ps = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe", "-c", "adb logcat | grep FATAL\n");

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
            }
        }.start();
    }
}
