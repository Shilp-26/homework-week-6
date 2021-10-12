package javaProgramme;

public class Question3 {

    static int a = 100;
    int b = 50;

    public static void main(String[] args) {
        Question3 i = new Question3();
        i.addition();

        myMethod();
    }
    public static void myMethod() {
        int b = 50;
        int answer = a / b;
        System.out.println(answer);
    }

    public int addition() {
        System.out.println(a + b);
        int result = a + b;
        return result;


    }
}
