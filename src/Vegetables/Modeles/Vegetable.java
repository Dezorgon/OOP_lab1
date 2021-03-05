package Vegetables.Modeles;

public abstract class Vegetable {
    private final int weight;

    public Vegetable(int weight){
        this.weight = weight;
    }

    public abstract int getCalorie();
    public abstract int getCaloriePer100gram();
    public int getWeight() { return weight; }
}
