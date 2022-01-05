package ws1.Observers;

public class LogPressObserver implements Observer<Integer> {
    private Log log;
    private String type = "LogPressObserver";

    public LogPressObserver(Log log) {
        System.out.println("LogPressTrendObserver was created");
        this.log = log;
    }

    @Override
    public void update(Integer data) {
        log.displayPressure(data);
    }

    @Override
    public String getType() {
        return type;
    }
}
