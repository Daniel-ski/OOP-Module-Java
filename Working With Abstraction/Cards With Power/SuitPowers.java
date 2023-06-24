package WorkingWithAbstraction_Ex.x03_CardsWithPower;

public enum SuitPowers {
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (3);

    private int suitPower;

    SuitPowers(int suitPower){
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
