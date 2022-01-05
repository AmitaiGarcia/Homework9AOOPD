package ws1.Observers;

import ws1.TrendSensor.Trend;


public class LogPressTrendObserver implements Observer<Trend> {
    private Log log;
    private String type = "LogPressTrendObserver";

    public LogPressTrendObserver(Log log) {
        System.out.println(getType() + " was created");
        this.log = log;
    }

    @Override
    public void update(Trend data) {
        log.displayPressureTrend(data);
    }

    @Override
    public String getType() {
        return type;
    }
}
