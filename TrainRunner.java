package OOP.lesson5;

import java.util.ArrayList;
import java.util.List;

import static OOP.lesson5.TrainUtils.*;

/**
 * Created by Sergey Lang on 16.10.2016.
 */
public class TrainRunner {
    public static void main(String[] args) {
        List<Carriage> carriages = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            carriages.add(new Carriage());
        }
        CyclicTrain train = new CyclicTrain(carriages);

        train.setExpectedLength(findLength(train));

        System.out.println("isLength result: " + train.isLength(train.getExpectedLength()));
        System.out.println("Length is: " + train.getExpectedLength());

    }
}
