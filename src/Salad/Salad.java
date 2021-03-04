package Salad;
import Vegetables.Modeles.Vegetable;
import java.util.ArrayList;


public class Salad {
    private ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();

    public void cook(){
        System.out.println("MmMMmm");
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
