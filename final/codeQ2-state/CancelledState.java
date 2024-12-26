public class CancelledState implements State {

    @Override
    public void handleTransition(Context context, String action) {
        System.out.println("Invalid action for CancelledState");
    }

}
