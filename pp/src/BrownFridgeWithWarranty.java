public class BrownFridgeWithWarranty extends Fridge{


    int quantity=0;
    public BrownFridgeWithWarranty(int n){
        super(n);

    }
    @Override
    public String name() {
        return "Brown Fridge with Warranty";
    }

    @Override
    public Float Price() {
        return 50.0f;
    }
}
