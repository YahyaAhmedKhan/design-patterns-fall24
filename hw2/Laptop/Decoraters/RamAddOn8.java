package Laptop.Decoraters;

import Laptop.Laptop;

/**
 * RamAddOn
 */
public class RamAddOn8 extends DecoratedLaptop {

    public RamAddOn8(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (ramSlots > occupiedRamSlots) {
            occupiedRamSlots++;
            totalRam += 8;
            addons = addons.concat("\n+8GB RAM");
        } else
            throw new RuntimeException("No more RAM slots available");

    }

}