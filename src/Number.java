public class Number {
    private int value;
    NumberType type;

    Number(int value, NumberType type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }
    NumberType getType() {
        return type;
    }
}
