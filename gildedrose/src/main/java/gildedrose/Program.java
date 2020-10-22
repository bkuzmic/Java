package gildedrose;

import gildedrose.items.AgedBrieItem;
import gildedrose.items.BackstagePassesItem;
import gildedrose.items.ConjuredItem;
import gildedrose.items.RegularItem;
import gildedrose.items.SulfurasItem;
import java.util.*;

public class Program {

	        public static void main(String[] args)
	        {
	            System.out.println("OMGHAI!");
	            
	            List<Item> Items = new ArrayList<Item>();
	            Item newItem1 = new RegularItem("+5 Dexterity Vest", 10, 20);
	 	   	    Items.add(newItem1);
		 	   	Item newItem2 = new AgedBrieItem("Aged Brie", 2, 0);
	 	   	    Items.add(newItem2);
		 	   	Item newItem3 = new RegularItem("Elixir of the Mongoose", 5, 7);
	 	   	    Items.add(newItem3);
		 	   	Item newItem4 = new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80);
	 	   	    Items.add(newItem4);
		 	   	Item newItem5 = new SulfurasItem("Sulfuras, Hand of Ragnaros", -1, 80);
	 	   	    Items.add(newItem5);
		 	   	Item newItem6 = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);
	 	   	    Items.add(newItem6);
		 	   	Item newItem7 = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 10, 49);
	 	   	    Items.add(newItem7);
		 	   	Item newItem8 = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 5, 49);
	 	   	    Items.add(newItem8);
				// this conjured item does not work properly yet
		 	   	Item newItem9 = new ConjuredItem("Conjured Mana Cake", 3, 6);
	 	   	    Items.add(newItem9);

	 	   	    GildedRose app = new GildedRose(Items);


	            for (int i = 0; i < 31; i++)
	            {
	                System.out.println("-------- day " + i + " --------");
	                System.out.println("name, sellIn, quality");
	                for (int j = 0; j < Items.size(); j++)
	                {
	                    System.out.println(Items.get(j).name + ", " + Items.get(j).sellIn + ", " + Items.get(j).quality);
	                }
	                System.out.println("");
	                app.UpdateQuality();
	            }
	        }


}
