package ws1.Observables;

import ws1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;
//https://www.baeldung.com/java-observer-pattern
public abstract class Observable<T> {
    public String Type;
    private List<Observer<T>> itsObservers = new ArrayList<>();

   public void NotifyObservers(T data){
       for (Observer<T> observers : itsObservers){

           observers.update(data);
       }
   }
    public void registerObserver(Observer<T> observer) {
        itsObservers.add(observer);
        System.out.println(observer.getType() + " observes " + this.getType() );
    }
    public String getType(){
        return Type;
    };
}
