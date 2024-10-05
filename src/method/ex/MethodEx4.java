package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cmd = 0;
        int balance = 0;

        while (cmd != 4) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------");
            cmd = sc.nextInt();
            int amount;
            switch (cmd) {
                case 1:
                    System.out.println("입금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = balance - withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요");
                    break;
            }

            System.out.println("시스템을 종료합니다.");
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "을 출금하였습니다. 현재 잔액: " + balance + "원");
            return balance;
        } else if (balance < amount) {
            System.out.println(amount + "를 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    return balance;
    }
}