package Encapsulation_Ex.x04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {

    }

    public void setToppingType(String toppingType) {
        switch (toppingType){
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default: throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0 && weight <= 50) {
            this.weight = weight;
        }else {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
    }
    public double calculateCalories(){
        return calculateFormula(toppingTypeCoeff());
    }

    private double toppingTypeCoeff() {
        switch (this.toppingType) {
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
                return 0.9;
            default:
                return 0;
        }
    }
    private double calculateFormula(double toppingTypeCoeff){
        return (2 * this.weight) * toppingTypeCoeff;

    }

}
