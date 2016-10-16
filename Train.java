package OOP.lesson5;

/**
 * Created by Sergey Lang on 16.10.2016.
 */
public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
