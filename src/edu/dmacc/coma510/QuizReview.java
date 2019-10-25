package edu.dmacc.coma510;

public class QuizReview {

    public static void main(String[] args) {
        System.out.println(QuizReview.quiz(2, 3));
        System.out.println(QuizReview.quiz(4, 5));
    }

    //Write a method that takes 2 ints as parameters.  The method should return the
    // sum of each number and the product of each number as an int.
    //Example: p1 = 2, p2 = 3 : result = 11 -- (p1 + p2) + (p1 * p2)
    //         p1 = 4, p2 = 5 : result = 29 -- (p1 + p2) + (p1 * p2)

    public static int quiz(int p1, int p2) {
        int sum = p1 + p2;
        int product = p1 * p2;
        return sum + product;
    }
}
