package Laptop.Decoraters;

import Laptop.Laptop;

public class SSDAddOn512 extends DecoratedLaptop {

    public SSDAddOn512(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (extraStorageSlots > occupiedExtraStorageSlots) {
            occupiedExtraStorageSlots++;
            totalExtraStorage += 512;
        } else
            throw new RuntimeException("No more SSD slots available");

        addons = addons.concat("\n+512GB SSD");
    }

}
