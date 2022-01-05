package ws1.studentcode;

import java.util.Random;

import static ws1.studentcode.RandomSupplier.getRnd;

public class Nimbus1TempSensor extends Sensor{
Random md;

    public Nimbus1TempSensor(String type, Integer interval) {
        super(type, interval);
        md = getRnd();
    }

    @Override
    public int read() { // random number between 0 and 40
        return (md.nextInt(41));
    }
}
