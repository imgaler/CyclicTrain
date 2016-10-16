package OOP.lesson5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey Lang on 16.10.2016.
 */
public class CyclicTrain implements Train{
    private int currentPosition;
    private int expectedLength;
    private List<Carriage> carriages = new ArrayList<>();

    public CyclicTrain(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    @Override
    public void turnLeft() {
        validCurrentPosition(currentPosition++);
    }

    @Override
    public void turnRight() {
        validCurrentPosition(currentPosition--);
    }



    public void setExpectedLength(int expectedLength) {
        this.expectedLength = expectedLength;
    }

    @Override
    public boolean isLength(int expectedLength) {
        return expectedLength == carriages.size();
    }

    public int validCurrentPosition(int position) {
        if (position > carriages.size() - 1) {
            position = position - carriages.size();
        }
        if (position < 0) {
            position = carriages.size() + position;
        }
        return position;
    }

    public int getExpectedLength() {
        return expectedLength;
    }

    public int getCurrentPosition() {

        return validCurrentPosition(currentPosition);
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = validCurrentPosition(currentPosition);
    }

    @Override
    public void lightOn() {
        carriages.get(this.getCurrentPosition()).isLightOn();
    }

    @Override
    public void lightOff() {
        carriages.get(this.getCurrentPosition()).lightOff();
    }

    @Override
    public boolean isLightOn() {
        return carriages.get(this.getCurrentPosition()).isLightOn();
    }

    @Override
    public String toString() {
        return "t" + carriages;
    }
}
