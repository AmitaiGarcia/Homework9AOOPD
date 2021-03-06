package ws1.Observers;

public class MSPressObserver implements Observer<Integer> {
    private MonitoringScreen monitoringScreen;
    private String type = "MSPRessObserver";

    public MSPressObserver(MonitoringScreen monitoringScreen) {
        System.out.println(getType() + " was created");
        this.monitoringScreen = monitoringScreen;
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayPressure(data);
    }

    @Override
    public String getType() {
        return type;
    }
}
