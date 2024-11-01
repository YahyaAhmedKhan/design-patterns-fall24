public interface Subject {
    public void attach(Observer observer);

    public void detach(Observer observer);

    public String getState();

    public void notifyObservers();
}
