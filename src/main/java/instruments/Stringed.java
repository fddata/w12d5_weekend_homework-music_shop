package instruments;

public class Stringed extends Instrument {

    private InstrumentFamily family;
    private int numberOfStrings;

    public Stringed(InstrumentColour colour, String name, String brand, double wholesalePrice, double retailPrice, int numberOfStrings) {
        super(colour, name, brand, wholesalePrice, retailPrice);
        this.family = InstrumentFamily.STRINGS;
        this.numberOfStrings = numberOfStrings;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return  "Twang";
    }
}
