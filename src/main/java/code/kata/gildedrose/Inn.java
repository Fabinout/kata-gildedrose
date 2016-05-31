package code.kata.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Inn {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String DEXTERITY_VEST = "+5 Dexterity Vest";
    public static final String ELIXIR_OF_THE_MONGOOSE = "Elixir of the Mongoose";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";

    private List<Item> items;

    public Inn() {
        items = new ArrayList<Item>();
        items.add(new Item(DEXTERITY_VEST, 10, 20));
        items.add(new AgedBrie( 2, 0));
        items.add(new Item(ELIXIR_OF_THE_MONGOOSE, 5, 7));
        items.add(new Item(SULFURAS_HAND_OF_RAGNAROS, 0, 80));
        items.add(new Item(BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT, 15, 20));
        items.add(new Item(CONJURED_MANA_CAKE, 3, 6));
    }

    public List<Item> getItems() {
        return items;
    }

    public void updateQuality() {

        for (Item item : items) item.updateItem();

    }

}

