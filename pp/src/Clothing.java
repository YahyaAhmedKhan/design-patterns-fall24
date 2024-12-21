public abstract class Clothing implements Product{

        int quantity=0;
        public Clothing(int n){
                quantity=n;
        }
        public abstract String name();

        public abstract Float Price() ;


}
