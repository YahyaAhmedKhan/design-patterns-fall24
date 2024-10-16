package Laptop.Decoraters;

import Laptop.Laptop;

/**
 * RamAddOn
 */
public class RamAddOn16 extends DecoratedLaptop {

    public RamAddOn16(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (ramSlots > occupiedRamSlots) {
            occupiedRamSlots++;
            totalRam += 16;
            addons = addons.concat("\n+16GB RAM");
        } else
            throw new RuntimeException("No more RAM slots available");

    }

}