package code.kata.gildedrose;

/**
 * Created by Fabien on 31/05/2016.
 */
public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(Inn.AGED_BRIE, sellIn, quality);

    }

    @Override
    void updateItem() {
        increaseQuality();
        setSellIn(getSellIn() - 1);
        if (getSellIn() < 0) {
            increaseQuality();
        }
    }
}
