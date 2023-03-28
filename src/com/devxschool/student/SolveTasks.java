package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class SolveTasks {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("TASK #1");
        /**
         *
         * Create a service to calculate a perimeter of a rectangle.
         * Tasks:
         * 1) have two inputs to your system
         * 2) calculate perimeter
         * 3) print out your result
         *
         * Example output:
         *  Enter your length:
         *  2
         *  Enter your width:
         *  1
         *  Your perimeter is equal to 6.
         *
         */

        //TODO implement your code here...
        int length = 0;
        int width = 0;
        int perimeter = 0;

        System.out.println("enter your length: ");
        length= myObj.nextInt();

        System.out.println("enter your width: ");
        width = myObj.nextInt();

        perimeter = length + length + width + width;
        System.out.println("Your perimeter equals: " + perimeter);
        Validation.testPerimeter(length,width,perimeter);

       Validation.testPerimeter(length, width, perimeter);
        System.out.println("===================================");
       System.out.println("TASK #2");
        /**
         *
        * Write a program, that calculates 10% bonus for a salary
         * Tasks:
         * 1) have a salary input to your system
         * 2) calculate 10% of a salary
         * 3) print out total amount of salary and bonus
         *
         * Example output:
         *  Enter your salary:
         *  100000
         *  Your bonus is 10000
         *  Your total salary is 110000
         */

        //TODO implement your code here...

        int salary = 0;
        double bonus = 0;
        double totalSalary =0;

        System.out.println("Enter your salary: ");
        salary = myObj.nextInt();

        bonus = salary / 10;
        totalSalary = bonus + salary;
        System.out.println("Your total salary with bonus: " + totalSalary);
        Validation.testBonus(salary, bonus, totalSalary);












        Validation.testBonus(salary, bonus, totalSalary);
        System.out.println("***********************************");
        System.out.println("TASK #3");
        /**
         *
         *  Write a program that calculates a multiplication by 9 WITHOUT multiplying
         *  Tasks:
         *  1) have a number input
         *  2) add 0 to the end of the number and save it
         *  3) subtract original number from the saved number
         *  4) print out the result
         *
         *  Example output:
         *   Enter any number I will calculate a multiplication by 9 without multiplying:
         *   754
         *   The result is 6786
         *
         */

        //TODO implement your code here...

        int number = 0;
        int numberWith0 = 0;
        int myResult = 0;
        System.out.println("Enter your number: ");
        number = myObj.nextInt();
        numberWith0 = Integer.parseInt( number + "0");
        myResult = numberWith0 - number;






        System.out.println(number + " * 9 = " + myResult);
        Validation.testMultiplicationBy9(number, myResult);
        System.out.println("***********************************");
        System.out.println("TASK #4");
        /**
         *
         * 5 street performers are singing every day.
         * At the end of the day they collect all money to one bucket and divide their profit equally.
         * For more accuracy and time efficiency they need a program to get a daily profit.
         * Help them out!
         *
         * 1) Have 5 inputs
         * 2) Calculate profit for each person
         * 3) Print out the result
         *
         * Output example:
         *  Jake's: 100.25
         *  Phil's: 88.50
         *  Ryan's: 99.00
         *  Tom's: 69.00
         *  Bill's: 123.45
         *  Each performer gets $96.04
         */

        //TODO implement your code here...

        double jake = 0;
        double phil = 0;
        double ryan = 0;
        double tom = 0;
        double bill = 0;
        double eachDailyProfit = 0;

        System.out.println("jake");
        jake = myObj.nextDouble();
        phil = myObj.nextDouble();
        ryan = myObj.nextDouble();
        tom = myObj.nextDouble();
        bill = myObj.nextDouble();


        eachDailyProfit = (jake + phil + ryan + tom + bill) / 5;
        System.out.println(eachDailyProfit);


        Validation.testProfit(jake, phil, ryan, tom, bill, eachDailyProfit);
        System.out.println("***********************************");
        System.out.println("TASK #5");
        /**
         * Write a program that takes number of minutes from user and converts the number to Years and Days
         *
         * Tasks:
         * 1) have a number long
         * 2) to get years, divide input number to the total number of minutes in year
         * 3) to get days, divide input number to the total minutes in one day, then modulus by total number of days in a year
         *
         *
         *
         * Example output:
         *  Input the number of minutes:
         *  3456789
         *  3456789 minutes is approximately 6 years and 210 days
         *
         */

        //TODO implement your code here...
        System.out.println("Please enter number of minutes: ");
        long min = myObj.nextLong();
        long totalMinInYears = 525600;
        int years = (int) (min / totalMinInYears);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println(min + " Minutes are approximately: " + years + " years and " + days + " days");

        Validation.testMinutes(min, years, days);
        System.out.println("--- The end ---");
    }
}
