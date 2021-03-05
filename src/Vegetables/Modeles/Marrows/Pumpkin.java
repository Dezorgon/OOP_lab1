package Vegetables.Modeles.Marrows;

import Vegetables.Modeles.Marrow;

public class Pumpkin extends Marrow {
    private static final int caloriePer100gram = 123;

    public Pumpkin(int weight) {
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
