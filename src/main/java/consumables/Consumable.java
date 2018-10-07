package consumables;

import interfaces.ISell;

public class Consumable implements ISell {

    private double retailPrice;
    private double wholesalePrice;
    private String name;
    private String brand;

    public Consumable(double retailPrice, double wholesalePrice, String name, String brand) {
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
        this.name = name;
        this.brand = brand;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double calculateMarkup(){
        return (this.retailPrice - this.wholesalePrice);
    }
}
