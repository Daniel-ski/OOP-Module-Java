package Encapsulation_Ex.x02_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken (String name,int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double productPerDay (){
        return calculateProductPerDay();
    }
    private double calculateProductPerDay(){
        if (this.age < 6){
            return 2;
        } else if (this.age <= 11) {
            return 1;
        }else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.%n",this.name,this.age,productPerDay());
    }


}
