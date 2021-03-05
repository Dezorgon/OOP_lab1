package Salad;
import Vegetables.Modeles.Vegetable;
import java.util.ArrayList;


public class Salad {
    private ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();

    public void cook(){
        for (var vegetable:vegetables) {
            System.out.println(vegetable.getClass().getName());
            System.out.println("Weight: " + vegetable.getWeight());
            System.out.println("Calorie: " + vegetable.getCalorie());
        }
        System.out.println("MmMMmm");
        System.out.println("Total calorie: " + getCalorie());
    }
    public int getCalorie(){
        return vegetables.stream().mapToInt(Vegetable::getCalorie).sum();
    }
    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }
    public void removeVegetable(Vegetable vegetable){
        vegetables.remove(vegetable);
    }
}
