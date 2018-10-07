package consumables;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new GuitarStrings(6.99, 5.00, "Super Slinkys", "Ernie Ball", 6);
    }

    @Test
    public void getPackSize() {
        assertEquals(6, guitarStrings.getPackSize());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1.99, guitarStrings.calculateMarkup(),0.1);
    }
}