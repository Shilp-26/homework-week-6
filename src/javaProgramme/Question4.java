package javaProgramme;

public class Question4 {

    int a = 100;
    int b = 200;
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Question4 t = new Question4();
        t.addition();

        myMethod(100,200);

    }

    public int addition() {
        System.out.println((a + b) / (x + y));//10
        int result = (a + b) / (x + y);
        return result;
    }

    public static void myMethod(int a,int b) {
//        int a = 100;
//        int b = 200;
        int answer = b / a + (x + y);
        System.out.println(answer);//32
    }
}
