package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class StringedTest {

    Stringed guitar;
    Stringed harp;

    @Before
    public void setUp() {
        guitar = new Stringed(InstrumentColour.CANDYAPPLEGREY, "Telecaster", "Fender", 100.00,150.00, 6);


    }

    @Test
    public void getFamily() {
        assertEquals(InstrumentFamily.STRINGS, guitar.getFamily());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void play() {
        assertEquals("Twang", guitar.play());
    }
}