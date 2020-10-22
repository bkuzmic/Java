package gildedrose.items;

public class BackstagePassesItem extends AbstractItem {

    public BackstagePassesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);

            if (this.getSellIn() < 11) {
                if (this.getQuality() < 50) {
                    this.setQuality(this.getQuality() + 1);
                }
            }

            if (this.getSellIn() < 6) {
                if (this.getQuality() < 50) {
                    this.setQuality(this.getQuality() + 1);
                }
            }
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            this.setQuality(this.getQuality() - this.getQuality());
        }
    }
}
