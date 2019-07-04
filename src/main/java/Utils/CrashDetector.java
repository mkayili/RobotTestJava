package Utils;

public class CrashDetector {
    public CrashDetector() {
        open();
    }

    void open() {
        new Thread() {
            public void run() {

                try {
                    Process p = Runtime.getRuntime().exec("adb logcat | grep FATAL\n");
                    p.waitFor();
                    System.out.println(p.getOutputStream());
                } catch (Exception e) {
                    System.out.println("Çağrı simulasyonu başlatılamadı. Adb ve/veya Emulator ayarlarınızı kontrol ediniz");
                }
            }
        }.start();
    }
}
