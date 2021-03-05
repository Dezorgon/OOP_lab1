package Vegetables;
import Vegetables.Modeles.Cruciferouses.*;
import Vegetables.Modeles.Marrows.*;
import Vegetables.Modeles.Vegetable;

public class VegetableFactory {
    public static Vegetable create(VegetableNames vegetableName, int weight){
        switch (vegetableName) {
            case Cabbage -> {
                return new Cabbage(weight);
            }
            case Cucumber -> {
                return new Cucumber(weight);
            }
            case Pumpkin -> {
                return new Pumpkin(weight);
            }
            case Sprouts -> {
                return new Sprouts(weight);
            }
        }
        return null;
    }
}
