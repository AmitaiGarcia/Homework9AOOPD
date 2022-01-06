package ws1.studentcode;


import ws1.Observables.Observable;
import ws1.Observables.SensorAlarmListener;

public abstract class Sensor extends Observable<Integer> {
private Integer LastReading = null;
private Integer Interval;


    public Sensor(String type, Integer interval){
        this.Interval = interval;
        this.Type = type;
        System.out.println(getType() + " registered to clock");
        AlarmClock.theInstance().register(interval,new SensorAlarmListener(this));
    }

    public void check(){
        int read = read();
        if (LastReading == null || read != LastReading){
            LastReading = read;
            NotifyObservers(read);
        }
    }
    protected abstract int read();

    public String getType(){
        return Type;
    };
}
