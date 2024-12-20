package Stateful;

public class IdleState implements VendingState {

    public void doAction(VendingContext context) {
        if (context.state instanceof RefundingChangeState || context.state == null) {
            context.setState(this);
            System.out.println("At idle state");
        } else {
            throw new UnsupportedOperationException("Invalid state transition");
        }
    }

}
