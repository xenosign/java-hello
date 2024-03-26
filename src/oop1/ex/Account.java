package oop1.ex;

import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);

    int balance = 0;
    int money = 0;

    void deposit() {
        System.out.print("입금 금액 : ");
        money = scanner.nextInt();
        scanner.nextLine();
        balance += money;
        System.out.println("잔고 : " + balance);
    }

    void withdraw() {
        System.out.print("출금 금액 : ");
        money = scanner.nextInt();
        scanner.nextLine();
        if (balance < money) {
            System.out.println("잔고 부족");
        } else {
            balance -= money;
            System.out.println("잔고 : " + balance);
        }
    }
}
