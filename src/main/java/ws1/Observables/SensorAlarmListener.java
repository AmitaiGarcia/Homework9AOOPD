package ws1.Observables;

import ws1.studentcode.Sensor;

public class SensorAlarmListener implements AlarmListener {
    private Sensor sensor;

    public SensorAlarmListener(Sensor sensor){
        this.sensor = sensor;
    }


    @Override
    public void wakeUp() {
        sensor.check();
    }
}
