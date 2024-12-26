package pp;

public class Light_DimState implements State {

    @Override
    public void transitiionToState(Context context, String input) {
        if (input.equals("OFF")) {
            System.out.println("Turning light on, person entered");
            context.setState(new Light_OffState());
        } else {
            System.out.println("Light is already dim");
        }
        // TODO Auto-generated method stub
        if (input.equals("IN")) {
            System.out.println("Turning light on, person entered");
            context.setState(new Light_BrightState());
        } else {
        }
    }

}