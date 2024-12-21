package pp;

public class LightContext implements Context {
    private State currState;

    @Override
    public State getState() {
        // TODO Auto-generated method stub
        return currState;
    }

    @Override
    public void setState(State state) {
        // TODO Auto-generated method stub
        currState = state;
    }

}
