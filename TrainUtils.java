package OOP.lesson5;

/**
 * Created by Sergey Lang on 16.10.2016.
 */
public class TrainUtils {

    public static int findLength(CyclicTrain train) {
        int startLength = 0;
        int finalLength = 0;
        train.getCarriages().get(0).lightOn();
        while (train.getCarriages().get(0).isLightOn()) {
            do {
                train.turnLeft();
                startLength++;
            }
            while (!train.isLightOn());
            train.lightOff();
            finalLength = startLength;
            train.setCurrentPosition(0);
            startLength = 0;
        }
        return finalLength;
    }
}
