package Salad;
import Vegetables.VegetableFactory;
import Vegetables.VegetableNames;

import java.util.List;

public class SaladBuilder {
    public Salad build(List<VegetableNames> vegetableList){
        Salad salad = new Salad();
        vegetableList.forEach(veg -> salad.addVegetable(VegetableFactory.create(veg)));
        return salad;
    }
}
