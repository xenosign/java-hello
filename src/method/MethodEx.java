package method;

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        int action = 0;
        int money = 0;

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택 : ");

            action = scanner.nextInt();

            if (action == 1) {
                printMsg(action);
                money = scanner.nextInt();
                balance = deposit(balance, money);
            } else if (action == 2) {
                printMsg(action);
                money = scanner.nextInt();
                balance = withdraw(balance, money);
            } else if (action == 3) {
                System.out.println("현재 잔액 : " + balance);
            } else {
                System.out.println("시스템을 종료 합니다!");
                break;
            }
        }
    }

    public static void printMsg(int action) {
        String actionType = action == 1 ? "입금" : "출금";
        System.out.print(actionType + "액을 입력하세요 : ");
    }

    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance < money) {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액 : " + balance);
        }
        return balance;
    }
}
