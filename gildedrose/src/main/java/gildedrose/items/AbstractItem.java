package gildedrose.items;

import gildedrose.Item;

public abstract class AbstractItem extends Item {

    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void updateQuality();
}
