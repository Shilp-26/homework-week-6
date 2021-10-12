package javaProgramme;

import java.util.Scanner;

public class Question16 {

    public static void main(String[] args) {
        addBinaryNumbers();
    }

    public static void addBinaryNumbers() {

        Scanner b = new Scanner(System.in);

        System.out.println("Input first number: ");
        int first = b.nextInt(2);

        System.out.println("Input second number: ");
        int second = b.nextInt(2);

        System.out.println("Sum = " + Integer.toBinaryString(first+second));

    }

}
