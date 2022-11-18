import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double earnings = 0;
        double spending = 0;
        int operation;
        double taxEarn, taxEmS;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String menu = "Выберите операцию и введите её номер:" +
                    "\n" + "1. Добавить новый доход" +
                    "\n" + "2. Добавить новый расход" +
                    "\n" + "3. Выбрать сиcтему налогооблажения" + "\n";
            System.out.println(menu);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else
                operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String income = scanner.nextLine();
                    double moneyIn = Double.parseDouble(income);
                    earnings += moneyIn;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String expend = scanner.nextLine();
                    double moneyOut = Double.parseDouble(expend);
                    spending += moneyOut;
                    break;
                case 3:
                    taxEarn = CalcTax.taxEarning(earnings);
                    taxEmS = CalcTax.taxEarningMinusSpendings(earnings, spending);
                    if (taxEmS < taxEarn) {
                        System.out.println("Мы советуем Вам УСН доходы минус расходы " + "\n" +
                                "Ваш налог составит " + taxEmS +
                                "\n" + "Налог на другой системе " + taxEarn + "\n" +
                                "Экономия " + CalcTax.different(CalcTax.taxEarn, CalcTax.taxEmS));
                    } else {
                        System.out.println("Мы советуем Вам УСН доходы " + "\n" + "Ваш налог составит " + taxEarn + "\n" +
                                "Налог на другой системе " + taxEmS + "\n" + "Экономия " +
                                CalcTax.different(CalcTax.taxEarn, CalcTax.taxEmS) + "\n");
                    }
                    break;

                default:
                    System.out.println("Такой команды нет" + "\n");


            }
        }
    }
}