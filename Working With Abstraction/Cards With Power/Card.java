package WorkingWithAbstraction_Ex.x03_CardsWithPower;

public class Card {

    private RankPowers RankPower;
    private SuitPowers SuitPower;
    private int power;

    public Card(RankPowers rankPower, SuitPowers suitPower) {
        RankPower = rankPower;
        SuitPower = suitPower;
        power = rankPower.getRankPower() + suitPower.getSuitPower();
    }

    public RankPowers getRankPower() {
        return RankPower;
    }

    public void setRankPower(RankPowers rankPower) {
        RankPower = rankPower;
    }

    public SuitPowers getSuitPower() {
        return SuitPower;
    }

    public void setSuitPower(SuitPowers suitPower) {
        SuitPower = suitPower;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
