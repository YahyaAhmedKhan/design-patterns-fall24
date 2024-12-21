public class MediumShirt extends Shirt{

    int quantity=0;
    public MediumShirt(int n){
        super(n);
    }
    @Override
    public String name() {
        return "Medium Shirt";
    }

    @Override
    public Float Price() {
        return 12.0f;
    }
}
