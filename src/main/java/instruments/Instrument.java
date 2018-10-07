package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentColour colour;
    private String name;
    private String brand;
    private double wholesalePrice;
    private double retailPrice;

    public Instrument(InstrumentColour colour, String name, String brand, double wholesalePrice, double retailPrice) {
        this.colour = colour;
        this.name = name;
        this.brand = brand;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public double calculateMarkup(){
        return (this.retailPrice - this.wholesalePrice);
    }


}
