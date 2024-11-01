import java.util.ArrayList;

public class ClockTimer implements Subject {

    public ArrayList<Observer> observers;

    int hour = 0;
    int minute = 0;
    int second = 0;

    @Override
    public void attach(Observer observer) {
        // adds the observer to the list
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // removes the observer from the list
        observers.remove(observer);
    }

    ClockTimer() {
        observers = new ArrayList<Observer>();
    }

    void tick() {
        // increments the time by 1 second
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        notifyObservers();
    }

    @Override
    public String getState() {
        // gets the state of the clock as comma separated values
        return (hour + "," + minute + "," + second); //
    }

    @Override
    public void notifyObservers() {
        // notifies all the observers
        for (Observer obs : observers) {
            obs.update(this);
        }
    }

}
