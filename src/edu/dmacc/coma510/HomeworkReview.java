package edu.dmacc.coma510;

public class HomeworkReview {

    public static void main(String[] args) {
        System.out.println(String.format("Problem 1's answer = %f",HomeworkReview.problem1Average(10, 40, 50)));
        System.out.println(String.format("Problem 2's answer = %f", HomeworkReview.problem2MinOfThree(3.9, 2.8, 6.4)));
    }

    //Problem 1: Average 3 ints and return an double
    public static double problem1Average(int p1, int p2, int p3) {
        return (p1 + p2 + p3) / 3.0;
    }

    public static double problem2MinOfThree(double p1, double p2, double p3) {
        double minOfP1AndP2 = Math.min(p1, p2);
        return Math.min(minOfP1AndP2, p3);
    }
}

