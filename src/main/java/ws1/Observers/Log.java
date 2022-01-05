package ws1.Observers;

import ws1.Observables.WeatherMonitoringSystem;
import ws1.TrendSensor.Trend;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        ws.addPressureObserver(new LogPressObserver(this));
        ws.addPressureTrendObserver(new LogPressTrendObserver(this));
    }

    public void displayPressure(int data) {
        System.out.println("log: pressure = " + data + " millibars");
    }

    public void displayPressureTrend(Trend data) {System.out.println("log: pressure trend = " + data.toString());}
}
