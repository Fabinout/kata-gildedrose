package code.kata.gildedrose;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTestCase {


    @Test
    @FileParameters("file.csv")
    public void testUpdatedItem(String initialName, int initialSellIn, int initialQuality,
                                String updatedName, int updatedSellIn, int updatedQuality) throws Exception {
        final Inn inn = new Inn();
        final Item itemInitial = new Item(initialName, initialSellIn, initialQuality);
        inn.getItems().clear();
        inn.getItems().add(itemInitial);
        inn.updateQuality();
        final Item updatedItem = inn.getItems().get(0);

        assertThat(updatedItem.getName()).isEqualTo(updatedName);
        assertThat(updatedItem.getSellIn()).isEqualTo(updatedSellIn);
        assertThat(updatedItem.getQuality()).isEqualTo(updatedQuality);
    }
}
