package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {

        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,25,35));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;

        // int랑 int 나누면 int기 때문에 3.0으로 해줘야한다. double로 나누면 double 됨.
    }
}
