package OOP.lesson5;

import java.util.Random;

/**
 * Created by Sergey Lang on 16.10.2016.
 */
public class Carriage {
    private boolean light;

    public Carriage() {
        Random random = new Random();
        this.light = random.nextBoolean();
    }

    public boolean isLightOn() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public void lightOn() {
        this.light = true;
    }

    public void lightOff() {
        this.light = false;
    }

    @Override
    public String toString() {
        return "c[" + light + "]";
    }
}
