package ws1.Observables;

public class AlarmClockRecord {
    private Integer interval;
    private Integer remainingTime;
    public AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener pal) {
        this.interval = interval;
        this.remainingTime = 0;
        this.alarmListener = pal;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setRemainingTime(Integer remainingTime) {
       this.remainingTime = remainingTime;
    }
}
