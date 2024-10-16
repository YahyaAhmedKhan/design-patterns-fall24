package Laptop.Decoraters;

import Laptop.Laptop;

public class OLEDpanelAddOn extends DecoratedLaptop {

    public OLEDpanelAddOn(Laptop lt) {
        super(lt);
    }

    @Override
    void insertAddOn() {
        if (display.equals("OLED"))
            throw new RuntimeException("OLED panel already present");
        display = "OLED";
        addons = addons.concat("\n+OLED panel");
    }

}
