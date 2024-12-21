public class HarryPotter extends Fantasy{


    int quantity=0;
    public HarryPotter(int n){
        super(n);
    }
    public String name() {
        return "Harry Potter book";
    }

    @Override
    public Float Price() {
        return 3.0f;
    }
}
