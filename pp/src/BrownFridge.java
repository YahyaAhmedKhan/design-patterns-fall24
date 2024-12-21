public class BrownFridge extends Fridge {

    int quantity=0;
    public BrownFridge(int n){
        super(n);

    }
    @Override
    public String name() {
        return "Brown Fridge ";
    }

    @Override
    public Float Price() {
        return 30.0f;
    }
}
