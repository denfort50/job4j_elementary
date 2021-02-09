package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected1 = 2;
        double expected2 = 2.3333333333333335;
        int out1 = Converter.rubleToEuro(in);
        double out2 = Converter.rubleToDollar(in);
        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 euros. Test result : " + passed1);
        System.out.println("140 rubles are 2,3333333333333335 dollars. Test result : " + passed2);
    }
}
