public class SmallShirt extends Shirt{


    public SmallShirt(int n) {
        super(n);
    }

    @Override
    public String name() {
        return "Small Shirt";
    }

    @Override
    public Float Price() {
        return 12.0f;
    }
}
