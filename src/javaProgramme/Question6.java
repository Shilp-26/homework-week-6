package javaProgramme;
import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {
        Question6 c = new Question6();
        c.areaOfCircle();
    }

    public void areaOfCircle() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = a.nextDouble();
        double area = (22 * r * r) / 7;
        System.out.println("Area of Circle is: " + area);

    }
}
