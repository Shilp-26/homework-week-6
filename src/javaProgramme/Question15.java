package javaProgramme;

public class Question15 {

    public static void main(String[] args) {
        swap();
    }

    public static void swap() {
        int a = 20;
        int b = 30;
        System.out.println("Before: a, b = " + a + ", " + +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
