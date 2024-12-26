public class InTransitState implements State {

    @Override
    public void handleTransition(Context context, String action) {

        switch (action) {
            case "CANCEL":
                context.setState(new CancelledState());
                System.out.println("InTransit Cancelled! Now in CancelledState");
                break;

            case "DELIVER":
                context.setState(new DeliveredState());
                System.out.println("InTransit Delivered! Now in DeliveredState");
                break;

            default:
                System.out.println("Invalid action for InTransitState");
                break;
        }
    }

}
