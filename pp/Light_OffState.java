package pp;

public class Light_OffState implements State {

    @Override
    public void transitiionToState(Context context, String input) {
        // TODO Auto-generated method stub
        if (input.equals("IN")) {
            System.out.println("Turning light on, person entered");
            context.setState(new Light_BrightState());
        } else {
            System.out.println("Light is already off");
        }
    }

}
