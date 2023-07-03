package Encapsulation_Ex.x04_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }else{
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0 && weight <= 200){
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories(){
       return calculateFormula(doughTypeCoeff(),bakingTechniqueCoeff());
    }

    private double doughTypeCoeff() {
        switch (this.flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1;
            default:
                return 0;
        }
    }

        private double bakingTechniqueCoeff() {
            switch (this.bakingTechnique) {
                case "Crispy":
                    return 0.9;
                case "Chewy":
                    return 1.1;
                case "Homemade":
                    return 1;
                default:
                    return 0;
            }
        }
        private double calculateFormula(double doughCoeff,double bakingCoeff){
            return (2 * this.weight) * doughCoeff * bakingCoeff;

    }
}
