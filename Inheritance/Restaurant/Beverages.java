package Inheritance_Ex.x05_Restaurant;

import java.math.BigDecimal;

public class Beverages extends Product{
    private double milliliters;


    public Beverages(String name, BigDecimal price,double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
