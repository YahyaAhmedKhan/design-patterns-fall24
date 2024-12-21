public class BlackHeadphones extends Headphones {

    public BlackHeadphones(int n) {
        super(n);
    }

    @Override
    public String name() {
        return "black headphones";
    }

    @Override
    public Float Price() {
        return 20.0f;
    }
}
