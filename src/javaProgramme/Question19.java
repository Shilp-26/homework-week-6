package javaProgramme;

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        toLowerCase();
    }

    public static void toLowerCase() {
        String stringUpper, stringLower;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter sentence in Uppercase : ");
        stringUpper = scan.nextLine();

        stringLower = stringUpper.toLowerCase();
        System.out.print("Equivalent sentence in Lowercase : " + stringLower);
    }
}
