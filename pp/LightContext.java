package pp;

public class LightContext implements Context {
    private State currState;

    public LightContext() {
        currState = new Light_OffState();
    }

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

    public void enterRoom() {
        currState.transitiionToState(this, "IN");
    }

    public void exitRoom() {
        currState.transitiionToState(this, "OUT");
    }

}
