package oop1.ex;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        int action;
        int money;

        while (true) {
            System.out.println("1. 입금 / 2. 출금 / 3. 종료");
            action = scanner.nextInt();
            scanner.nextLine();

            if (action == 1) {
                account.deposit();
            } else if (action == 2) {
                account.withdraw();
            } else {
                break;
            }
        }
    }
}
