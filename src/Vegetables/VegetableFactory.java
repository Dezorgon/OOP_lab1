package Vegetables;
import Vegetables.Modeles.Cruciferouses.*;
import Vegetables.Modeles.Marrows.*;
import Vegetables.Modeles.Vegetable;

public class VegetableFactory {
    public static Vegetable create(VegetableNames vegetableName){
        switch (vegetableName) {
            case Cabbage -> {
                return new Cabbage();
            }
            case Cucumber -> {
                return new Cucumber();
            }
            case Pumpkin -> {
                return new Pumpkin();
            }
            case Sprouts -> {
                return new Sprouts();
            }
        }
        return null;
    }
}
