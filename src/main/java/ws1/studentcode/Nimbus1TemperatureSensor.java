package ws1.studentcode;

public class Nimbus1TemperatureSensor extends Sensor{


    public Nimbus1TemperatureSensor(String type, Integer interval) {
        super(type, interval);

    }

    @Override
    public int read() { // random number between 0 and 40
        return RandomSupplier.getRnd().nextInt(40);
    }
}
