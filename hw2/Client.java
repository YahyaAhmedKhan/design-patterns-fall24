import Laptop.Inspiron;
import Laptop.Laptop;
import Laptop.Decoraters.*;

public class Client {
    public static void main(String[] args) {
        Laptop lt = new Inspiron();

        lt = new RamAddOn16(lt);
        lt = new SSDAddOn512(lt);
        lt = new OLEDpanelAddOn(lt);
        lt = new RefreshRateAddOn90(lt);

        lt.printSpecs();

    }

}
