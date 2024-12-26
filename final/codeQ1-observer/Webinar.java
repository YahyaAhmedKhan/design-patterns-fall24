import java.util.ArrayList;
import java.util.List;

public class Webinar implements Subject {

    List<User> observers;

    public Webinar() {
        observers = new ArrayList<User>();
    }

    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub

        observers.add((User) o);
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.remove(o);
    }

    void changeSchedule() {
        notifyObservers("SCHED_CHANGE");
    }

    void changeAvailability() {
        notifyObservers("AVAIL_CHANGE");
    }

    @Override
    public void notifyObservers(String update) {

        for (Observer observer : observers) {
            observer.update(update);
        }
    }

}
