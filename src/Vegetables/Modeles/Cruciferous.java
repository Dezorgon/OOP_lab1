package Vegetables.Modeles;

public abstract class Cruciferous extends Vegetable {
    String color;

    public Cruciferous(int weight) {
        super(weight);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
