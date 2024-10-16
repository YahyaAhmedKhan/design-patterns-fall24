/**
 * CoffeeFactory
 */
public class CoffeeFactory extends CakeFactory {
    public Cake makeCake() {
        return new CoffeeCake();

    };

}