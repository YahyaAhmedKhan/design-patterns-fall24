package Laptop.Decoraters;

import Laptop.Laptop;

/**
 * DecoratedLaptop
 */
public abstract class DecoratedLaptop extends Laptop {
    Laptop laptop;

    DecoratedLaptop(Laptop lt) {
        this.laptop = lt;
        description = lt.description;
        ramSlots = lt.ramSlots;
        occupiedRamSlots = lt.occupiedRamSlots;
        totalRam = lt.totalRam;
        baseStorage = lt.baseStorage;
        extraStorageSlots = lt.extraStorageSlots;
        totalExtraStorage = lt.totalExtraStorage;
        occupiedExtraStorageSlots = lt.occupiedExtraStorageSlots;
        display = lt.display;
        refreshRate = lt.refreshRate;
        touchScreen = lt.touchScreen;
        addons = lt.addons;
        // specs = lt.specs;

        insertAddOn();
    }

    abstract void insertAddOn();

}