package method;

public class MethodCasting {

    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number);
        printNumber((int) number); // 명시적 형 변환을 사용해 double을 int로 변환.
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }


}


