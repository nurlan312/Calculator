import java.nio.file.attribute.UserDefinedFileAttributeView;

public class ActionService {

    public static String calculate(Number first, Number second, String action) throws Exception {
        int result;
        switch (action) {
            case "+":
                result = first.getValue() + second.getValue();
                break;
            case "-":
                result = first.getValue() - second.getValue();
                break;
            case "*":
                result = first.getValue() * second.getValue();
                break;
            case "/":
                result = first.getValue() / second.getValue();
                break;
            default:
                throw new Exception("Туура эмес белгилерди колдондунуз, бул белгилерди колдонунуз: +, -, *, /.");
        }
        if (first.getType() == NumberType.ROMAN) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}
