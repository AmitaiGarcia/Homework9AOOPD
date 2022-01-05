package ws1.Observers;

public class MS_TempObserver implements Observer<Integer> {

    private MonitoringScreen monitoringScreen;
    private String type = "MSTempObserver";

    public MS_TempObserver(MonitoringScreen monitoringScreen) {
        System.out.println(getType() + " was created");
        this.monitoringScreen = monitoringScreen;
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayTemperature(data);
    }

    @Override
    public String getType() {
        return type;
    }
}
