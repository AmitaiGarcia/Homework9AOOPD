package ws1.Observables;

import ws1.studentcode.Sensor;

public class SensorsAlarmListener implements AlarmListener {
    private Sensor sensor;

    public SensorsAlarmListener(Sensor sensor){
        this.sensor = sensor;
    }


    @Override
    public void wakeUp() {
        sensor.check();
    }
}
