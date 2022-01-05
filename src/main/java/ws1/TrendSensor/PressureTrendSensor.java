package ws1.TrendSensor;

import ws1.Observables.Observable;
import ws1.Observers.Observer;
import ws1.studentcode.Nimbus1PressureSensor;

public class PressureTrendSensor extends Observable<Trend> implements Observer<Integer> {

Integer readingA;
Integer readingB;
Integer readingC;
Trend lastState;
String type = "PressureTrendSensor";

    public PressureTrendSensor(Nimbus1PressureSensor itsPS) {
        super();
        itsPS.registerObserver(this);
    }

    public Trend calc(){
        if (readingA == null || readingB == null){return null;}
        else if(readingB<readingC && readingA<readingB){return Trend.RISING;}
        else if (readingB>readingC && readingA>readingB){return Trend.FALLING;}
        else {return Trend.STABLE;}
    }

    public void check(){
    Trend trend = calc();
            if(trend!=lastState){
                NotifyObservers(trend);
            }
            lastState=trend;
    }


    @Override
    public void update(Integer data) {
        readingA = readingB;
        readingB = readingC;
        readingC = data;
        check();

    }

    @Override
    public String getType() {
        return type;
    }
}
