package WorkingWithAbstraction.CardRank;

public enum CardRanks {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);

    private int power;

    CardRanks(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
