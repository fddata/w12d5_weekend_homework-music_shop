package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WoodwindTest {

    Woodwind clarinet;

    @Before
    public void setUp() throws Exception {
        clarinet = new Woodwind(InstrumentColour.BLACK, "CLR100", "Yamaha", 80.00, 99.99, 1);
    }

    @Test
    public void getFamily() {
        assertEquals(InstrumentFamily.WOODWIND, clarinet.getFamily());
    }

    @Test
    public void getNumberOfReeds() {
        assertEquals(1, clarinet.getNumberOfReeds());
    }

    @Test
    public void play() {
        assertEquals("A windy noise fills the air", clarinet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(19.99, clarinet.calculateMarkup(),0.1);
    }
}