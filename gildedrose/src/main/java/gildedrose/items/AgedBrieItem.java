package gildedrose.items;

public class AgedBrieItem extends AbstractItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality()+ 1);
            }
        }
    }
}
