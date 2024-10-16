package Laptop.Decoraters;

import Laptop.Laptop;

public class RefreshRateAddOn90 extends DecoratedLaptop {

    public RefreshRateAddOn90(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (refreshRate == 90)
            throw new RuntimeException("Refresh rate already 90Hz");
        else if (refreshRate > 90)
            throw new RuntimeException("Refresh rate higher than 90Hz");
        refreshRate = 90;
        addons = addons.concat("\n+90Hz refresh rate");
    }

}
