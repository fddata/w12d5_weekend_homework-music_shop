import consumables.GuitarStrings;
import instruments.InstrumentColour;
import instruments.Stringed;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    ArrayList<ISell> stock;
    Shop shop;
    Stringed guitar;
    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        stock = new ArrayList<>();
        guitar = new Stringed(InstrumentColour.CANDYAPPLEGREY, "Telecaster", "Fender", 100.00,150.00, 6);
        guitarStrings = new GuitarStrings(6.99, 5.00, "Super Slinkys", "Ernie Ball", 6);
        shop = new Shop("Big Al's Trumpet Emporium", stock);

    }

    @Test
    public void shopStartsEmpty() {
        assertEquals(0, shop.getNumberOfItems());
    }

    @Test
    public void addItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getNumberOfItems());
    }

    @Test
    public void removeItemFromStock() {
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getNumberOfItems());
    }

    @Test
    public void calculateProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitarStrings);
        assertEquals(51.99, shop.calculateProfit(), 0.1);
    }
}