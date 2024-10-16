import Laptop.Inspiron;
import Laptop.Laptop;
import Laptop.Decoraters.*;

public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Inspiron();

        laptop = new RamAddOn16(laptop);
        laptop = new SSDAddOn512(laptop);
        laptop = new RefreshRateAddOn90(laptop);
        laptop = new TouchScreenAddOn(laptop);

        laptop.printSpecs();

    }

}
