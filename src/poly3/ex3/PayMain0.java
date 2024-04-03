package poly3.ex3;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner scanner = new Scanner(System.in);
        String option;
        int amount;

        while (true) {
            System.out.print("결제 옵션을 입력하세요 : ");
            option = scanner.nextLine();

            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요 : ");
            amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }
    }
}
