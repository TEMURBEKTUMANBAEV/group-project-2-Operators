package com.devxschool.test;

public class Validation {

    public static void checkIfImplemented(Number result) {
        if (result.equals(0) || result.equals(0.0)) {
            throw new RuntimeException("Result cannot be " + result.toString());
        }
    }

    public static void testPerimeter(int l, int w, int aP) {
        checkIfImplemented(aP);
        int eP = 2 * (l + w);
        if (eP != aP) {
            throw new ArithmeticException("Check your function! \nactual: " + aP + "\nexpected: " + eP);
        }
        System.out.println("-- Success! Your function is correct");
    }

    public static void testBonus(int s, double aB, double aTS) {
        checkIfImplemented(aTS);
        double eB = s * 0.1;
        if (eB != aB) {
            throw new ArithmeticException("Check your function! \nactual: " + aB + "\nexpected: " + eB);
        }

        double eTS = s + eB;
        if (eTS != aTS) {
            throw new ArithmeticException("Check your function! \nactual: " + aTS + "\nexpected: " + eTS);
        }

        System.out.println("-- Success! Your function is correct");
    }

    public static void testMultiplicationBy9(int number, int myResult) {
        checkIfImplemented(myResult);
        int eR = number * 9;
        if (eR != myResult) {
            throw new ArithmeticException("Check your function! \nactual: " + eR + "\nexpected: " + myResult);
        }
        System.out.println("-- Success! Your function is correct");
    }

    public static void testProfit(double jake, double phil, double ryan, double tom, double bill, double profit) {
        checkIfImplemented(profit);
        double eP = (jake + phil + ryan + tom + bill) / 5;
        if (eP != profit) {
            throw new ArithmeticException("Check your function! \nactual: " + eP + "\nexpected: " + profit);
        }
        System.out.println("-- Success! Your function is correct");
    }

    public static void testMinutes(long min, int years, int days) {
        int year = (int) (min / 525600);

        if (years != year) {
            throw new ArithmeticException("Check your function! \nactual: " + years + "\nexpected: " + year);
        }
        int remainingMinutes = (int) (min % 525600);
        int day = remainingMinutes / 1440;

        if (days != day) {
            throw new ArithmeticException("Check your function! \nactual: " + days + "\nexpected: " + day);
        }
        System.out.println("-- Success! Your function is correct");
    }
}
