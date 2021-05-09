package coins;

/**
 * Edit content of this enum to add or remove coins
 */
public enum Coins {
    FIVEHUNDRED(500),
    TWOHUNDRED(200),
    HUNDRED(100),
    FIFTY(50),
    TWENTY(20),
    TEN(10),
    FIVE(5),
    TWO(2),
    ONE(1);

    public final int value;

    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
