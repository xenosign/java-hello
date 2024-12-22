package tomAndHarry.collection.array;

import java.util.Arrays;

public class ArrayLimits {
    public static void main(String[] args) {
        // 배열의 한계
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        // 1. 배열에 숫자 추가하는 경우
        int[] numbers2 = new int[numbers.length + 1]; // 11칸 짜리 만들기

        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }
        numbers2[numbers.length] = 11;
        numbers = numbers2;

        System.out.println(Arrays.toString(numbers));

        // 2. 배열에서 숫자 삭제하는 경우, 11 을 삭제
        // 여러분들이 작성할 코드
        int[] numbers3 = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers3[i] = numbers[i];
        }
        numbers = numbers3;

        System.out.println(Arrays.toString(numbers)); //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // 3. 배열에서 중간값(5) 삭제하는 경우
        int[] numbers4 = new int[numbers.length - 1];

        for (int i = 0; i < 4; i++) {
            numbers4[i] = numbers[i];
        }
        // [1, 2, 3, 4, ?, ?, ?, ?, ?]
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        for (int i = 5; i < numbers.length; i++) {
            numbers4[i - 1] = numbers[i];
        }

        numbers = numbers4;

        System.out.println(Arrays.toString(numbers)); //  [1, 2, 3, 4, 6, 7, 8, 9, 10]


    }
}
