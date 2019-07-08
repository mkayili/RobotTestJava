package Modules.Progress;

import io.appium.java_client.android.AndroidDriver;

public class Progress {
    private AndroidDriver driver;
    private int progress;
    public Progress(AndroidDriver driver) {
        this.driver = driver;
    }

    public void progressIncrease(int n){
        progress += n;
    }

    public int getProgress(){
        return progress;
    }
}
