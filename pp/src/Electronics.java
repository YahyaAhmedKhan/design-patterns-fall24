public abstract class Electronics implements Product{


    int quantity=0;
    public Electronics(int n){
        quantity=n;
    }
    public abstract String name();

    public abstract Float Price() ;
}
