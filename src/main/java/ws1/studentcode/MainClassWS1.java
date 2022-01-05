package ws1.studentcode;

import ws1.Observables.WeatherMonitoringSystem;
import ws1.Observers.Log;
import ws1.Observers.MonitoringScreen;

public class MainClassWS1
{

    public static void main(String[] args) {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();

        new MonitoringScreen(ws);
        new Log(ws);
        
    }
}
