package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstVal = 0;
        int secondVal = 0;
        int sum = 0;

        System.out.print("첫번째 수를 입력 하세요 : ");
        firstVal = scanner.nextInt();
        System.out.print("두번째 수를 입력 하세요 : ");
        secondVal = scanner.nextInt();

        sum = firstVal + secondVal;

        System.out.println("두수의 합은 " + sum);

    }
}
