package Encapsulation_Ex.x04_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name,int count) {
        setName(name);
        setToppings(count);
    }

    public void setName(String name) {
        if (name.trim().length() > 0 &&name.trim().length() <= 15) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setToppings(int count) {
        if (count >= 0 && count <= 10){
                this.toppings = new ArrayList<>(count);
        }else{
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(t -> t.calculateCalories()).sum();
    }
}
