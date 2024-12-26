package pp;

public class Light_BrightState implements State {

    @Override
    public void transitiionToState(Context context, String input) {
        if (input.equals("OUT")) {
            System.out.println("Turning light dim, person exited");
            context.setState(new Light_DimState());
        } else {
            System.out.println("Light stayed in bright state");
        }
    }

}