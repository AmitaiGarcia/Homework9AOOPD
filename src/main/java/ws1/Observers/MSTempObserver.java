package ws1.Observers;

public class MSTempObserver implements Observer<Integer> {

    private MonitoringScreen monitoringScreen;
    private String type = "MSTempObserver";

    public MSTempObserver(MonitoringScreen monitoringScreen) {
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
