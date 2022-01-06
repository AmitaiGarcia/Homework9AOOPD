package ws1.studentcode;


public class Nimbus1PressureSensor extends Sensor{


    public Nimbus1PressureSensor(String type, Integer interval) {
        super(type, interval);

    }

    @Override
    public int read() { // random number between 950 and 1051
        return RandomSupplier.getRnd().nextInt(100)+950;
    }

}
