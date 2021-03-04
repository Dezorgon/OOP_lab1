package Vegetables.Modeles;

public abstract class Vegetable {
    private int calorie;
    private int weight;

    public int getCalorie() {
        return calorie;
    }

    public int getWeight() {
        return weight;
    }
    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
