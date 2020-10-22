package gildedrose.items;

public class RegularItem extends AbstractItem {

    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - 1);
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }
}
