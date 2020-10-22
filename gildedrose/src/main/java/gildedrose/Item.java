package gildedrose;

public class Item {
	String name;
	int quality;
	int sellIn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public Item (String name, int sellIn, int quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
	}
}

