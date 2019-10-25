package edu.dmacc.coma510;

import java.util.Scanner;

public class ConditionalExamples {

    public static void main(String[] args) {
//        ConditionalExamples.example1(5);
//        ConditionalExamples.example2(2);
//        ConditionalExamples.example3(2);
//        ConditionalExamples.exercise1();
//        ConditionalExamples.example5();
//        ConditionalExamples.example8();
        ConditionalExamples.exercise3();
    }

    public static void exercise3() {
        int total = 0;
        for (int n = 1; n <= 100; n = n + 1) {
            if (n % 4 == 0  ||  n % 5 == 0) {
                total = total + n;
            }
        }
        System.out.println("total = " + total);
    }

    public static void exercise2() {
        for (int n = 1; n <= 100; n = n + 1) {
            boolean isEven = n % 2 == 0;
            boolean isDivisibleBy4 = n % 4 != 0;
            boolean isDivisibleBy5 = n % 5 != 0;

            if (isEven && isDivisibleBy4 && isDivisibleBy5) {
                System.out.println(n);
            }
        }
    }

    public static void example8() {
        int n = 10;
        do {
            System.out.println(n);
            n = n - 1;
        } while (n > 10);
    }

    public static void example7() {

        for (int n = 5;   n > 0;   n = n - 1) {
            System.out.println(n);
        }
        System.out.println("done");
    }

    public static void example6() {
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("done");
    }

    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        double hours = askForNumber("Enter Hours", scanner);
        double rate = askForNumber("Enter Rate", scanner);
        double pay;
        if (hours > 40.0) {
            double regularPay = 40.0 * rate;
            double overtime = hours - 40.0;
            double overtimeRate = rate * 1.5;
            double overtimePay = overtime * overtimeRate;
            pay = regularPay + overtimePay;
        } else {
            pay = hours * rate;
        }
        System.out.println(String.format("Your pay is %f", pay));
        scanner.close();
    }

    public static double askForNumber(String prompt, Scanner reader) {
        System.out.print(prompt + ": ");
        return reader.nextDouble();
    }

    public static  void example5() {
        // &&, ||, !, &, |, ^
        if (false && false) {
            System.out.println("---");
        }
        if (false && true) {
            System.out.println("---");
        }
        if (true && false) {
            System.out.println("---");
        }
        if (true && true) {
            System.out.println("TRUE");
        }

        if (false || false) {
            System.out.println("---");
        }
        if (false || true) {
            System.out.println("TRUE");
        }
        if (true || false) {
            System.out.println("TRUE");
        }
        if (true || true) {
            System.out.println("TRUE");
        }
    }

    public static void example4(int x) {
        if (x < 2) {
            System.out.println("small");
            if (x % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("not small");
        }
    }

    public static void example3(int x) {
        if (x < 2) {
            System.out.println("small");
        } else if (x < 10) {
            System.out.println("Medium");
        } else {
            System.out.println("LARGE");
        }
        System.out.println("All done");
    }

    public static void example2(int x) {
        if (x > 2) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }
        System.out.println("All done");
    }

    public static void example1(int x) {
        if (x == 10) {
            System.out.println("Smaller");
        }
        if (x > 20) {
            System.out.println("Bigger");
        }
        System.out.println("Prize");
    }
}
