public class PickedUpState implements State {

    @Override
    public void handleTransition(Context context, String action) {

        switch (action) {
            case "OUT_FOR_DELIVERY":
                context.setState(new InTransitState());
                System.out.println("Picked Up! Now in InTransitState");
                break;

            default:
                System.out.println("Invalid action for PickedUpState");
                break;
        }

    }

}
