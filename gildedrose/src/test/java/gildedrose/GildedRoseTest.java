package gildedrose;

import gildedrose.items.AgedBrieItem;
import gildedrose.items.BackstagePassesItem;
import gildedrose.items.ConjuredItem;
import gildedrose.items.RegularItem;
import gildedrose.items.SulfurasItem;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void Sell_by_date_passed_Quality_degrades_twice_as_fast() {
        Item newItem = new RegularItem("+5 Dexterity Vest", 0, 4);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(2, items.get(0).quality);
    }

    @Test
    public void Quality_is_never_negative() {
        Item newItem = new RegularItem("+5 Dexterity Vest", 4, 0);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(0, items.get(0).quality);
    }

    @Test
    public void Aged_Brie_increases_quality() {
        Item newItem = new AgedBrieItem("Aged Brie", 4, 5);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(6, items.get(0).quality);
    }

    @Test
    public void Quality_of_an_item_is_never_more_than_50() {
        Item newItem = new AgedBrieItem("Aged Brie", 7, 50);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(50, items.get(0).quality);
    }

    @Test
    public void Sulfuras_is_legendary_and_Quality_is_always_80() {
        Item newItem = new SulfurasItem("Sulfuras, Hand of Ragnaros", 2, 80);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(80, items.get(0).quality);
    }

    @Test
    public void BackstagePass_increases_Quality_by_2_if_10_days_left() {
        Item newItem = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 10, 9);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(11, items.get(0).quality);
    }

    @Test
    public void BackstagePass_increases_Quality_by_3_if_5_days_left() {
        Item newItem = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 5, 9);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(12, items.get(0).quality);
    }

    @Test
    public void BackstagePass_drops_Quality_to_0_if_sellIn_is_0() {
        Item newItem = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 0, 9);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(0, items.get(0).quality);
    }

    @Test
    public void ConjuredItems_Quality_degrades_twice_as_fast() {
        Item newItem = new ConjuredItem("Conjured Mana Cake", 0, 6);
        List<Item> items = new ArrayList<Item>();
        items.add(newItem);
        GildedRose app = new GildedRose(items);
        app.UpdateQuality();
        Assert.assertEquals(0, items.get(0).quality);
    }
}

