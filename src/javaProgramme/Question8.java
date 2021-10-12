package javaProgramme;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Question8 t = new Question8();
        t.areaOfTriangle();
    }

    public void areaOfTriangle() {
        Scanner area = new Scanner(System.in);
        System.out.println("Enter base and height of the triangle: ");
        float b = area.nextFloat();
        float h = area.nextFloat();
        float a = (b * h) / 2;
        System.out.println("Area of triangle is: " + a);

    }
}
