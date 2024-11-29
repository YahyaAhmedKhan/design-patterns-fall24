package Stateful;

public class WaitSelectionState implements VendingState {

    public void doAction(VendingContext context) {
        if (context.state instanceof DisplayingCoinsState) {
            context.setState(this);
            System.out.println("Waiting for product selection");
        } else {
            throw new UnsupportedOperationException("Invalid state transition");
        }
    }
}
