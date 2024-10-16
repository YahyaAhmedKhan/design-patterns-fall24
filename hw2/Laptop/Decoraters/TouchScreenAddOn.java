package Laptop.Decoraters;

import Laptop.Laptop;

public class TouchScreenAddOn extends DecoratedLaptop {

    public TouchScreenAddOn(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (touchScreen)
            throw new RuntimeException("Touch screen already present");
        touchScreen = true;
        addons = addons.concat("\n+Touch screen");
    }

}
