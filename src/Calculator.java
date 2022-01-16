import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startCalculator();

        while (true) {
            System.out.print("Сандарды жазыныз: ");
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                exitCalculator();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Туура эмес иштеп калды, башынан иштетиниз.");

                Number firstNumber = NumberService.parseAndValidate(symbols[0]);
                Number secondNumber = NumberService.parseAndValidate(symbols[2], firstNumber.getType());
                String result = ActionService.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Сумма: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
//                exitCalculator();
//                break;
            }
        }
        scanner.close();
    }

    private static void startCalculator() {
        System.out.println("Мен жазган калькуляторго кош келиниз! \n" +
                           "Бул калькулятор 1ден 10го чейинки араб жана рим сандары менен ийтейт.\n" +
                           "Кошуу(+), Кемитуу(-), Кобойтуу(*), Болуу(/) белгилерин колдонунуз.");
        System.out.println("Программаны токтоткунуз келсе, 'exit' созун жазыныз.");
    }

    private static void exitCalculator() {
        System.out.println("Саламатта калыныз!");
    }
}
