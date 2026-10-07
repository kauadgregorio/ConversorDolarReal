package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double total(double dollarPrice, double dollars) {
        return dollarPrice * dollars * (1.0 + IOF);
    }
}
