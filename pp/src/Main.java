public class Main {
    public static void main(String[] args) {

        //declare Cart Builder with quantity passed as parameters
        CartBuilder cartBuilder=new CartBuilder();
// Build Cart here
        Cart cart1=cartBuilder.BuildCart(new BlackHeadphones(6),new HarryPotter(6));
        //Show Cart Contents
        cart1.ShowProduct();

  System.out.println(" ------------  ");
        System.out.println("  ");
        System.out.println(" ");
        Cart cart2=cartBuilder.BuildCart(new BrownFridgeWithWarranty(2),new BrownFridge(1), new SmallShirt(2));
        //Show Cart Contents
        cart2.ShowProduct();






    }
}