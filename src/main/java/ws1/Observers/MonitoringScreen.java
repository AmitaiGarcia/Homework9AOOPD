package ws1.Observers;

import ws1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        System.out.println("MonitoringScreen was created");
        ws.addTemperatureObserver(new MS_TempObserver(this));
        ws.addPressureObserver(new MS_PressObserver(this));
    }

    public void displayPressure(Integer data) {
        System.out.println("monitoring screen: pressure = " + data + " millibars");
    }

    public void displayTemperature(Integer data) {
        System.out.println("monitoring screen: temperature = " + data + " celsius");
    }
}
