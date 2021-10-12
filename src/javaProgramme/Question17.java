package javaProgramme;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {
        decimalToBinary();
    }

    public static void decimalToBinary() {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        a = s.nextInt();
        String bin = Integer.toBinaryString(a);
        System.out.println("Binary Number is: " + bin);
    }
}
