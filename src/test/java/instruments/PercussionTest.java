package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PercussionTest {

    Percussion drums;

    @Before
    public void setUp() {
        drums = new Percussion(InstrumentColour.SUNBURST, "TR909", "Roland", 299.99, 499.99, 85);
    }

    @Test
    public void getFamily() {
        assertEquals(InstrumentFamily.PERCUSSION, drums.getFamily());
    }

    @Test
    public void getLoudnessFactor() {
        assertEquals(85, drums.getLoudnessFactor());
    }

    @Test
    public void play() {
        assertEquals("Boom boom boom", drums.play());
    }
}