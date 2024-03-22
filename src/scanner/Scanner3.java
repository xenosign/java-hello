package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputVal;

        while (true) {
            System.out.print("문자열을 입력 하세요 : ");
            inputVal = scanner.nextLine();

            if (inputVal.equals("exit")) break;

            System.out.println("입력한 문자열은 : " + inputVal);
        }
    }
}
