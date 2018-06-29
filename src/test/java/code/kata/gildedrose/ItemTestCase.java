package code.kata.gildedrose;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ItemTestCase {


    @Test
    public void test() {
        final Inn inn = new Inn();
        final LegacyInn legacyInn = new LegacyInn();
        List<Item> legacyInnItems = legacyInn.getItems();
        List<Item> innItems = inn.getItems();

        for (int day = 0; day < 100; day++) {
            for (int i = 0; i < legacyInnItems.size(); i++) {
                Item legacyItem = legacyInnItems.get(i);
                Item item = innItems.get(i);
                assertThat(item.getName()).isEqualTo(legacyItem.getName());
                assertThat(item.getSellIn()).isEqualTo(legacyItem.getSellIn());
                assertThat(item.getQuality()).isEqualTo(legacyItem.getQuality());
            }
            inn.updateQuality();
            legacyInn.updateQuality();
        }
    }
}
