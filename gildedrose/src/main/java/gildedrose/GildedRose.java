package gildedrose;

import gildedrose.items.AbstractItem;
import java.util.List;

public class GildedRose {
	List<Item> items;

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public void UpdateQuality() {
		for (Item item : items) {
			((AbstractItem) item).updateQuality();
		}
	}
}