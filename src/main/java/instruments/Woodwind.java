package instruments;

public class Woodwind extends Instrument {

    private InstrumentFamily family;
    private int numberOfReeds;

    public Woodwind(InstrumentColour colour, String name, String brand, double wholesalePrice, double retailPrice, int numberOfReeds) {
        super(colour, name, brand, wholesalePrice, retailPrice);
        this.family = InstrumentFamily.WOODWIND;
        this.numberOfReeds = numberOfReeds;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public int getNumberOfReeds() {
        return numberOfReeds;
    }

    public String play(){
        return  "A windy noise fills the air";
    }
}
