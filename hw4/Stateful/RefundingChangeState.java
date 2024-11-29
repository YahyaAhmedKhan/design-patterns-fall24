package Stateful;

public class RefundingChangeState implements VendingState {

    public void doAction(VendingContext context) {
        if (context.state instanceof DispensingProducState || context.state instanceof WaitSelectionState) {
            // System.out.println("Refunding change");
            if (context.state instanceof WaitSelectionState) {
                System.out.println("Cancelled, refunding change");
            } else if (context.state instanceof DispensingProducState) {
                System.out.println("Refunding remaining change");
            }
            context.setState(this);

        } else {
            throw new UnsupportedOperationException("Invalid state transition");
        }
    }
}
