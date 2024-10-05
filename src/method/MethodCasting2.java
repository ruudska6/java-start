package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }
    //큰거에서 작은데는 못들어가는데 작은데에서 큰데는 들어갈수있다. => 자동 형변환
    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
