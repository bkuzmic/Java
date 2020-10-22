package gildedrose;

import java.util.*;

public class Program {

	        public static void main(String[] args)
	        {
	            System.out.println("OMGHAI!");
	            
	            List<Item> Items = new ArrayList<Item>();
	            Item newItem1 = new Item ("+5 Dexterity Vest", 10, 20);
	 	   	    Items.add(newItem1);
		 	   	Item newItem2 = new Item ("Aged Brie", 2, 0);
	 	   	    Items.add(newItem2);
		 	   	Item newItem3 = new Item ("Elixir of the Mongoose", 5, 7);
	 	   	    Items.add(newItem3);
		 	   	Item newItem4 = new Item ("Sulfuras, Hand of Ragnaros", 0, 80);
	 	   	    Items.add(newItem4);
		 	   	Item newItem5 = new Item ("Sulfuras, Hand of Ragnaros", -1, 80);
	 	   	    Items.add(newItem5);
		 	   	Item newItem6 = new Item ("Backstage passes to a TAFKAL80ETC concert", 15, 20);
	 	   	    Items.add(newItem6);
		 	   	Item newItem7 = new Item ("Backstage passes to a TAFKAL80ETC concert", 10, 49);
	 	   	    Items.add(newItem7);
		 	   	Item newItem8 = new Item ("Backstage passes to a TAFKAL80ETC concert", 5, 49);
	 	   	    Items.add(newItem8);
				// this conjured item does not work properly yet
		 	   	Item newItem9 = new Item ("Conjured Mana Cake", 3, 6);
	 	   	    Items.add(newItem9);

	 	   	    GildedRose app = new GildedRose(Items);


	            for (int i = 0; i < 31; i++)
	            {
	                System.out.println("-------- day " + i + " --------");
	                System.out.println("name, sellIn, quality");
	                for (int j = 0; j < Items.size(); j++)
	                {
	                    System.out.println(Items.get(j).Name + ", " + Items.get(j).SellIn + ", " + Items.get(j).Quality);
	                }
	                System.out.println("");
	                app.UpdateQuality();
	            }
	        }


}
