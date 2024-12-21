public abstract class Fridge extends Electronics{

    public Fridge(int n) {
        super(n);
    }

    @Override
    public abstract String name() ;


    public abstract Float Price() ;

}
