package gildedrose.items;

public class ConjuredItem extends AbstractItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - this.getQuality());
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }
}
