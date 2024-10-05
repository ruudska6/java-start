package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 작은거에서 큰 타입은 변환이 가능하다!!!!!!

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
