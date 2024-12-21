import java.util.ArrayList;
import java.util.List;

public class Cart {
    //Arraylist to store all customer PRODUCTS
    private List<Product> CustomerCart = new ArrayList<Product>();

    //Add products to the cart
    public void AddProduct(Product p){
        CustomerCart.add(p);
    }

    //Display products with their price in the cart
    public void ShowProduct(){
        for(Product p: CustomerCart){
            System.out.println("Product Name: "+p.name());
            System.out.println("Product Price: "+p.Price());
        }
    }

    //calculates and displays total of items in the cart

    public void CalculateTotal(){
        Float total=0f;
        for(Product p: CustomerCart){
           total=total+p.Price()*p.quantity;
        }
        System.out.println("total :"+ total);
    }
}
