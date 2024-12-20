package Stateful;

public class DisplayingCoinsState implements VendingState {

    public void doAction(VendingContext context) {
        if (context.state instanceof IdleState) {
            context.setState(this);
            System.out.println("Displaying coins");
        } else {
            throw new UnsupportedOperationException("Invalid state transition");
        }
    }

}
