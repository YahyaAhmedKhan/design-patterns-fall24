package Stateful;

public class ProductSelectedState implements VendingState {

    public void doAction(VendingContext context) {
        if (context.state instanceof WaitSelectionState) {
            context.setState(this);
            System.out.println("Product selected");
        } else {
            throw new UnsupportedOperationException("Invalid state transition");
        }
    }

}
