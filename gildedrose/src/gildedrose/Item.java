package gildedrose;

public class Item
{
	String Name;
	int Quality;
	int SellIn;
	
	
	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getQuality() {
		return Quality;
	}



	public void setQuality(int quality) {
		Quality = quality;
	}



	public int getSellIn() {
		return SellIn;
	}



	public void setSellIn(int sellIn) {
		SellIn = sellIn;
	}



	public Item (String ItemName, int ItemSellIn, int ItemQuality)
	{
	Name = ItemName;
	Quality = ItemQuality;
	SellIn = ItemSellIn;
	}
}

