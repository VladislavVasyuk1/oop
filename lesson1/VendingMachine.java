package lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }

    public chips getChips(String name, double weight){
        for (Product product : products){
            if (product instanceof chips){
                chips chips = (chips)product;
                if (chips.getName().equals(name) && chips.getWeight() == weight)
                    return chips;
            }
        }
        return null;
    }

}
