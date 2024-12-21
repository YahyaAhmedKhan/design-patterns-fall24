public abstract class Shirt extends Clothing{

    int quantity=0;
    public Shirt(int n){
        super(n);
    }
    public abstract String name() ;


    public abstract Float Price() ;
}
