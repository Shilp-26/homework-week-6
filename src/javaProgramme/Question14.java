package javaProgramme;

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
        areaPerimeter();
    }

    public static void areaPerimeter() {
        float h, w, a, p;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter height of rectangle: ");
        h = in.nextFloat();
        System.out.print("Enter width of rectangle: ");
        w = in.nextFloat();

        a = h * w;
        p = 2 * (h + w);

        System.out.println("Area of the rectangle is: " + a + "sq units");
        System.out.println("Perimeter of the rectangle is: " + p + "units");

    }
}
