package JO01WorkingWithAbstractions.E03CardsWithPower;

public enum CardSuit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    CardSuit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}