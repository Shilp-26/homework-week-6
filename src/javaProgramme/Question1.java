package javaProgramme;

public class Question1 {

    int a = 10;
    int b = 20;


    public static void main(String[] args) {

        Question1 i = new Question1();
        int result = i.addition();
    }

    public int addition() {
        System.out.println(a+b);
        int result = a + b;
        return result;

    }

}
