package Encapsulation_Ex.x01_Box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box (double length,double width,double height){
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (dataValidation(length)) {
            this.length = length;
        } else {
        throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (dataValidation(width)) {
            this.width = width;
        }else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) {
        if (dataValidation(height)){
            this.height = height;
        }else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea (){
        return  2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }
    public double calculateLateralSurfaceArea (){
        return 2 * this.height * (this.width + this.length);
    }

    public double calculateVolume (){
        return  this.height * this.length * this.width;
    }

    private boolean dataValidation(double value){
        if (value > 0){
            return true;
        }else {
            return false;
        }
    }
}
