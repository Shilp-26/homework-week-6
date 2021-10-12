package javaProgramme;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        toLowerCase();
    }

    public static void toLowerCase() {
        String stringUpper, stringLower;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter one word/name in Uppercase : ");
        stringUpper = scan.nextLine();

        stringLower = stringUpper.toLowerCase();
        System.out.print("Equivalent Word/Name in Lowercase : " + stringLower);
    }
}
