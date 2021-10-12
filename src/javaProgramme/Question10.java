package javaProgramme;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

    }

}
