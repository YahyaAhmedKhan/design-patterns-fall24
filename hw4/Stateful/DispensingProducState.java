package Stateful;

public class DispensingProducState implements VendingState {

    @Override
    public void doAction(VendingContext context) {
        if (context.state instanceof ProductSelectedState) {
            context.setState(this);
            System.out.println("Dispensing product");
        } else {
            throw new UnsupportedOperationException("Invalid state transition");
        }
    }

}
