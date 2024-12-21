public abstract class  Book implements Product {
int quantity=0;
    public Book(int n){
    quantity=n;
}
    public abstract String name();

    public abstract Float Price() ;


}
