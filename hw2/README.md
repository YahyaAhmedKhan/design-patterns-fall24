# Laptop Decorator

## Description

This is a simple decorator that can be used to decorate a laptop with a custom design. The design can be a custom image or a custom text. The decorator can be used to add additional RAM, storage, or panel upgrades.

## Class Structure

- Laptop
  - DecoratedLaptop
    - RefreshRateAddOn90
    - StorageAddOn512GB
    - RAMAddOn16GB
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
Laptop laptop = new Laptop();
laptop = new RefreshRateAddOn90(laptop);
laptop = new StorageAddOn512GB(laptop);
laptop = new RAMAddOn16GB(laptop);
laptop = new OLEDpanelAddOn(laptop);
```

This will create a laptop with a 90Hz refresh rate, 512GB storage, 16GB RAM, and a panel upgrade.

## Output

```
Laptop{description='90Hz refresh rate, 512GB storage, 16GB RAM, panel upgrade', price=1000}
```

## Installation

To install the decorator, use the following git clone command:

```
git clone https://github.com/YahyaAhmedKhan/design-patterns-fall24

```
