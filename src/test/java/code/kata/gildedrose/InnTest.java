package code.kata.gildedrose;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Fabien on 31/05/2016.
 */
public class InnTest {

    @Test
    public void updateQuality() throws Exception {

        Inn inn = new Inn();
        LegacyInn legacyInn = new LegacyInn();

        List<Item> items = inn.getItems();
        List<Item> legacyItems = legacyInn.getItems();

        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                Item legacyItem = legacyItems.get(i);
                assertEquals(item, legacyItem);
            }
            inn.updateQuality();
            legacyInn.updateQuality();
        }

    }

}