package consumables;

public class GuitarStrings extends Consumable {

    public int packSize;

    public GuitarStrings(double retailPrice, double wholesalePrice, String name, String brand, int packSize) {
        super(retailPrice, wholesalePrice, name, brand);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return packSize;
    }
}
