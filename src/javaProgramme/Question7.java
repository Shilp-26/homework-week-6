package javaProgramme;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Question7 s = new Question7();
        s.celsius();
    }

    public void celsius() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter temperature value in Fahrenheit: ");
        double fahrenheit = c.nextDouble();
        double degree = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(degree + " in celsius");
    }

}
