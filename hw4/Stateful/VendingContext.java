package Stateful;

public class VendingContext {

    VendingState state;

    public void setState(VendingState state) {
        this.state = state;
    }

}
