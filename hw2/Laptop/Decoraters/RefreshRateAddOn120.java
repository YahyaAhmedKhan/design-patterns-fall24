package Laptop.Decoraters;

import Laptop.Laptop;

public class RefreshRateAddOn120 extends DecoratedLaptop {

    public RefreshRateAddOn120(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (refreshRate == 120)
            throw new RuntimeException("Refresh rate already 120Hz");
        else if (refreshRate > 120)
            throw new RuntimeException("Refresh rate higher than 120Hz");
        refreshRate = 120;
        addons = addons.concat("\n+120Hz refresh rate");
    }

}