package InterfacesAndAbstractClasses_Ex.x04_FoodShortage;

public class Citizen implements Person,Birthable,Identifiable,Buyer{
    private static final int INITIAL_AMOUNT_FOOD = 0;
    private String name;
    private int age;
    private String id;
    private String birthData;
    private int food;

    public Citizen(String name, int age, String id, String birthData) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthData = birthData;
        this.food = INITIAL_AMOUNT_FOOD;
    }

    @Override
    public String getBirthData() {
        return this.birthData;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
