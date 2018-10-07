import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;


//    Do i need to pass in stock in the constructor?
    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public int getNumberOfItems(){
        return this.stock.size();
    }

    public double calculateProfit(){
        double total = 0;
        for(ISell item : stock){
            total += item.calculateMarkup();
    }
    return total;
    }
}
