package Laptop;

/**
 * Laptop
 */
public abstract class Laptop {
    public float cost;
    public String description;
    public int ramSlots;
    public int occupiedRamSlots;
    public int totalRam;
    public int baseStorage;
    public int totalExtraStorage;
    public int extraStorageSlots;
    public int occupiedExtraStorageSlots;
    public String display;
    public int refreshRate;
    public boolean touchScreen;
    public String addons;

    public void printSpecs() {
        System.out.println(String.format("""
                Specs:
                RAM Slots: %d
                Occupied RAM Slots: %d
                Total RAM: %d GB
                Base Storage: %d GB
                Extra Storage Slots: %d
                Total Extra Storage: %d GB
                Occupied Extra Storage Slots: %d
                Display: %s
                Refresh Rate: %d Hz
                Touch Screen: %b

                Addons: %s
                """, ramSlots, occupiedRamSlots, totalRam, baseStorage, extraStorageSlots, totalExtraStorage,
                occupiedExtraStorageSlots,
                display, refreshRate, touchScreen, addons));
    }

}