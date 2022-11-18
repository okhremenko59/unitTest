public class CalcTax {
    static double taxEmS = 0;
    static double taxEarn = 0;

    public static double taxEarningMinusSpendings(double earnings, double spendings) {
        taxEmS = (earnings - spendings) * 15 / 100;
        if (taxEmS >= 0) {
            return taxEmS;
        } else
            return 0;
    }

    public static double taxEarning(double earnings) {
        taxEarn = earnings * 6 / 100;
        if (taxEarn >= 0) {
            return taxEarn;
        } else
            return 0;
    }


    public static double different(double taxEarn, double taxEmS) {
        double diff = 0;
        if (taxEarn > taxEmS) {
            diff = taxEarn - taxEmS;
        } else
            diff = taxEmS - taxEarn;

        return diff;
    }
}
