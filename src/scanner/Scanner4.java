package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String foodName;
//        int foodPrice;
//        int foodQty;
//        int totalPrice;
//
//        System.out.print("음식 이름을 입력해 주세요 : ");
//        foodName = scanner.nextLine();
//        System.out.print("음식 가격을 입력해 주세요 : ");
//        foodPrice = scanner.nextInt();
//        System.out.print("음식 수량을 입력해 주세요 : ");
//        foodQty = scanner.nextInt();
//
//        totalPrice = foodPrice * foodQty;
//
//        System.out.println(foodName + " " + foodQty + "를 주문하셨습니다. 총 가격은 " + totalPrice + "입니다");

//        int firstNum;
//        int secondNum;
//
//        System.out.print("첫 번째 숫자를 입력하세요 : ");
//        firstNum = scanner.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요 : ");
//        secondNum = scanner.nextInt();
//
//        System.out.print("두 숫자 사이의 모든 정수 : ");
//        for (int i = firstNum; i <= secondNum; i++) {
//            System.out.print(i);
//            if (i != secondNum) System.out.print(", ");
//        }

        int inputNum, sum = 0, cnt = 0;
        double avg = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1 을 입력하세요");

//        while (true) {
//            inputNum = scanner.nextInt();
//            if (inputNum == -1) break;
//            sum += inputNum;
//            cnt++;
//        }

        while ((inputNum = scanner.nextInt()) != -1) {
            cnt++;
            inputNum = scanner.nextInt();
            sum += inputNum;
        }

        avg = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + avg);
    }
}
