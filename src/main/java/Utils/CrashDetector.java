package Utils;

public class CrashDetector {
    public CrashDetector() {
        open();
    }

    void open() {
        try {
            Process p = Runtime.getRuntime().exec("adb logcat | grep FATAL\n");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Crash detector başlatılamadı.");
        }
    }
}
