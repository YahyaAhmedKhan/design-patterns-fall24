package Laptop.Decoraters;

import Laptop.Laptop;

public class SSDAddOn256 extends DecoratedLaptop {

    public SSDAddOn256(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (extraStorageSlots > occupiedExtraStorageSlots) {
            occupiedExtraStorageSlots++;
            totalExtraStorage += 256;
        } else
            throw new RuntimeException("No more SSD slots available");

        addons = addons.concat("\n+256GB SSD");
    }

}
