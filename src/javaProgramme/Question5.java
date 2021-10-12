package javaProgramme;

import java.util.Scanner;

public class Question5 {


    public static void main(String[] args) {
        int first, second, add, subtract, multiply, divide;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        Question5 m = new Question5();
        m.multiplication(first, second);

        Question5 d = new Question5();
        d.division(first, second);

        System.out.println("Sum = " + addition(first, second));
        System.out.println("Difference = " + subtraction(first, second));
        System.out.println("Multiplication = " + m.multiplication(first, second));
        System.out.println("Division = " + d.division(first, second));
    }

    public static double addition(double first, double second) {
        return first + second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public double multiplication(double first, double second) {
        return first * second;
    }

    public double division(double first, double second) {
        return first / second;
    }

}