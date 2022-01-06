package ws1.Observables;

import ws1.Observers.MonitoringScreen;
import ws1.Observers.Observer;
import ws1.TrendSensor.PressureTrendSensor;
import ws1.TrendSensor.Trend;
import ws1.studentcode.AlarmClock;
import ws1.studentcode.Nimbus1Clock;
import ws1.studentcode.Nimbus1PressureSensor;
import ws1.studentcode.Nimbus1TemperatureSensor;

public class WeatherMonitoringSystem {

    private static WeatherMonitoringSystem singleton;
    private Nimbus1TemperatureSensor itsTS;
    private Nimbus1PressureSensor itsPS;
    private PressureTrendSensor itsPTS;
    private MonitoringScreen itsScreen;

    private WeatherMonitoringSystem(){
        System.out.println("WeatherMonitoringSystem was created");
        AlarmClock alarmClock = Nimbus1Clock.theInstance();
        itsTS = new Nimbus1TemperatureSensor("temperature", 700);
        itsPS = new Nimbus1PressureSensor("pressure", 1100);
        itsPTS = new PressureTrendSensor(itsPS);

    }

     public static WeatherMonitoringSystem theInstance() {
         if (singleton == null) {
             singleton = new WeatherMonitoringSystem();
         }
         return singleton;
    }

    public void addTemperatureObserver(Observer<Integer> observer) {
        itsTS.registerObserver(observer);
    }

    public void addPressureObserver(Observer<Integer> observer) {
        itsPS.registerObserver(observer);
    }

    public void addPressureTrendObserver(Observer<Trend> observer) {
        itsPTS.registerObserver(observer);
    }
}
