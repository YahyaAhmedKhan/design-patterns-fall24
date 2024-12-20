package Stateful;

public class Demo {
    public static void main(String[] args) {
        VendingContext context = new VendingContext();

        new IdleState().doAction(context);
        new DisplayingCoinsState().doAction(context);
        new WaitSelectionState().doAction(context);

        // new RefundingChangeState().doAction(context); // if you want to cancel

        new ProductSelectedState().doAction(context);
        new DispensingProducState().doAction(context);
        new RefundingChangeState().doAction(context);
        new IdleState().doAction(context);

    }
}
