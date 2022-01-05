package ws1.studentcode;

import java.util.Random;

import static ws1.studentcode.RandomSupplier.getRnd;

public class Nimbus1PressureSensor extends Sensor{
    Random md;

    public Nimbus1PressureSensor(String type, Integer interval) {
        super(type, interval);
        md = getRnd();
    }

    @Override
    public int read() { // random number between 950 and 1051
        return (md.nextInt(1051-950)+950);
    }

}
