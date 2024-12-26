public class OrderedState implements State {

    @Override
    public void handleTransition(Context context, String action) {

        switch (action) {
            case "PICK":
                context.setState(new PickedUpState());
                System.out.println("Ordered Picked! Now in PickedUpState");

                break;
            case "CANCEL":
                context.setState(new CancelledState());
                System.out.println("Ordered Cancelled! Now in CancelledState");
                break;

            default:
                System.out.println("Invalid action for OrderedState");
                break;
        }
    }

}
