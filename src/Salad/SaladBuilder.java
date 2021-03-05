package Salad;

import Vegetables.VegetableFactory;
import Vegetables.VegetableNames;

import java.util.Map;

public class SaladBuilder {
    public Salad build(Map<VegetableNames, Integer> vegetableList){
        Salad salad = new Salad();
        for(Map.Entry<VegetableNames, Integer> item : vegetableList.entrySet()){
            salad.addVegetable(VegetableFactory.create(item.getKey(), item.getValue()));
        }
        return salad;
    }
}
