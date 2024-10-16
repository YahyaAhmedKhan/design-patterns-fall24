# Laptop Decorator

## Description

This is a simple decorator that can be used to decorate a laptop with a custom design. The design can be a custom image or a custom text. The decorator can be used to add additional RAM, storage, or panel upgrades.

## Class Structure

- Laptop
    - Inspiron
    - Latitude
  - DecoratedLaptop
    - RefreshRateAddOn90
    - RefreshRateAddOn120
    - StorageAddOn256GB
    - StorageAddOn512GB
    - RAMAddOn8
    - RAMAddOn16
    - OLEDpanelAddOn

## Class Explanation

- Laptop: This is the base class that has a description and a price.
- DecoratedLaptop: This is the decorator class that has a laptop and a description.
- RefreshRateAddOn90: This is a decorator that adds a 90Hz refresh rate to the laptop.
- StorageAddOn512GB: This is a decorator that adds a 512GB storage to the laptop.
- RAMAddOn16GB: This is a decorator that adds a 16GB RAM to the laptop.
- OLEDpanelAddOn: This is a decorator that upgrades the panel of the laptop to OLED.

## Usage

To use the decorator, you need to create a laptop and then decorate it with the desired add-ons.

```
Laptop laptop = new Inspiron();

laptop = new RamAddOn16(laptop);
laptop = new SSDAddOn512(laptop);
laptop = new OLEDpanelAddOn(laptop);
laptop = new RefreshRateAddOn90(laptop);

laptop.printSpecs();
```

This will create a laptop with a 90Hz refresh rate, 512GB storage, 16GB RAM, and a panel upgrade.

## Output

```
Specs:
RAM Slots: 2
Occupied RAM Slots: 2
Total RAM: 32 GB
Base Storage: 512 GB
Extra Storage Slots: 1
Total Extra Storage: 512 GB
Occupied Extra Storage Slots: 1
Display: OLED
Refresh Rate: 90 Hz
Touch Screen: false

Addons: 
+16GB RAM
+512GB SSD
+OLED panel
+90Hz refresh rate
```

## Error Handling

If you try to add an add-on that is incompatible with the laptop, an error will be thrown.


```
Laptop laptop = new Inspiron();
laptop = new OLEDpanelAddOn(laptop);
```

## Error thrown

```
Exception in thread "main" java.lang.RuntimeException: OLED panel already present
    at DecoratedLaptop.<init>(DecoratedLaptop.java:10)
    at OLEDpanelAddOn.<init>(OLEDpanelAddOn.java:10)
    at Main.main(Main.java:10)
```

## Installation

To install the decorator, use the following git clone command:

```
git clone https://github.com/YahyaAhmedKhan/design-patterns-fall24
```
