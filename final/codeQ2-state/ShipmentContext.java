public class ShipmentContext implements Context {

    State currentState;

    public ShipmentContext() {
        currentState = new OrderedState();
    }

    @Override
    public void transition(String action) {
        currentState.handleTransition(this, action);
    }

    @Override
    public void setState(State state) {
        currentState = state;
    }

}
