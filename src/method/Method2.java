package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
        return;


        // 모든 메서드는 항상 return을 호출해야한다. 그러나 반환타입이 없는 경우는 예외다.
    }
}
