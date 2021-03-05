package Vegetables.Modeles;

public abstract class Marrow extends Vegetable {
    String color;

    public Marrow(int weight) {
        super(weight);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
