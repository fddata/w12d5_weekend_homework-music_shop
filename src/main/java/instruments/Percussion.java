package instruments;

public class Percussion extends Instrument {

    private InstrumentFamily family;
    private int loudnessFactor;

    public Percussion(InstrumentColour colour, String name, String brand, double wholesalePrice, double retailPrice, int loudnessFactor) {
        super(colour, name, brand, wholesalePrice, retailPrice);
        this.family = InstrumentFamily.PERCUSSION;
        this.loudnessFactor = loudnessFactor;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public int getLoudnessFactor() {
        return loudnessFactor;
    }

    public String play(){
        return "Boom boom boom";
    }
}
