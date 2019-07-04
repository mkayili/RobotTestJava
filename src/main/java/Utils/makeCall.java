package Utils;

public class makeCall {
    public makeCall() {
        start();
    }

    void start() {
        try {
            Process p = Runtime.getRuntime().exec("adb shell am start -a android.intent.action.CALL -d tel:555-5555\n");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Çağrı simulasyonu başlatılamadı. Adb ve/veya Emulator ayarlarınızı kontrol ediniz");
        }
    }
}
