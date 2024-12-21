public class CartBuilder {



public CartBuilder(){

}

//add all the products in cart to build the cart
public Cart BuildCart(Product ... product){
    Cart cart=new Cart();
    for (int i = 0; i < product.length; i++) {
        cart.AddProduct(product[i]);
    }
    return cart;

}
}
