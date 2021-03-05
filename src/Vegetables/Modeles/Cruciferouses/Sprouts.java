package Vegetables.Modeles.Cruciferouses;

import Vegetables.Modeles.Cruciferous;

public class Sprouts extends Cruciferous {
    private static final int caloriePer100gram = 123;

    public Sprouts(int weight) {
        super(weight);
    }

    @Override
    public int getCalorie() {
        return super.getWeight() * caloriePer100gram / 100 ;
    }
    @Override
    public int getCaloriePer100gram() {
        return caloriePer100gram;
    }
}
