public interface Context {
    void transition(String action);

    void setState(State state);
}