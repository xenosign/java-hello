package arrary;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int many = 0;

        System.out.print("입력 받을 숫자의 개수는? : ");
        many = scanner.nextInt();

        int[] arr = new int[many];
        int cnt = 0;

        System.out.println(many + "개의 정수를 입력하세요 : ");
        while (cnt < many) {
            arr[cnt] = scanner.nextInt();
            cnt++;
        }

        int min = 9999999;
        int max = 0;

        for (int cur : arr) {
            if (cur < min) min = cur;
            if (cur > max) max = cur;
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
