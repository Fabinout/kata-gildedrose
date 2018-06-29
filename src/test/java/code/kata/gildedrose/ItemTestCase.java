package code.kata.gildedrose;

import org.junit.Test;

import java.util.List;

public class ItemTestCase {


    @Test
    public void test() {
        final Inn inn = new Inn();
        final LegacyInn legacyInn = new LegacyInn();
        List<Item> legacyInnItems = legacyInn.getItems();
        List<Item> innItems = inn.getItems();
        for (int i = 0; i < legacyInnItems.size(); i++) {
            Item legacyItem = legacyInnItems.get(i);
            Item item = innItems.get(i);
            
        }

    }

}
