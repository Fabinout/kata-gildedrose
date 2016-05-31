package code.kata.gildedrose;

public class Item {

    public static final int MAX_QUALITY = 50;
    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (sellIn != item.sellIn) return false;
        if (quality != item.quality) return false;
        return name.equals(item.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sellIn;
        result = 31 * result + quality;
        return result;
    }

    void increaseQuality() {
        if (getQuality() < MAX_QUALITY) {
            setQuality(getQuality() + 1);
        }
    }

    void updateItem() {

        switch (getName()) {
            case Inn.BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT:
                updateBackstage();

                break;

            case Inn.SULFURAS_HAND_OF_RAGNAROS:
                updateRagnaros();
                break;

            default:
                updateDefault();
                break;

        }
    }

    private void updateRagnaros() {

    }

    private void updateDefault() {
        decreaseQuality();
        decreaseSellin();
        if (getSellIn() < 0) {
            decreaseQuality();
        }
    }

    private void decreaseSellin() {
        setSellIn(getSellIn() - 1);
    }

    private void decreaseQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }

    private void updateBackstage() {

        increaseQuality();

        if (getSellIn() < 11) {
            increaseQuality();
        }

        if (getSellIn() < 6) {
            increaseQuality();
        }

        decreaseSellin();
        if (getSellIn() < 0) {
            setQuality(0);
        }
    }


}
