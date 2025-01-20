package letureTomAndHarry.assignment;

import java.util.Arrays;

public class Assignment01 {
    public static void main(String[] args) {
        int[] tc1 = new int[]{1, 2, 3, 2, 2, 4, 5, 2, 6, 4};
        int[] tc2 = new int[]{1, 2, 3, 4, 5};
        int[] tc3 = new int[]{1, 2, 2, 3, 3};


        System.out.println(Arrays.toString(solution(tc1)));
        System.out.println(Arrays.toString(solution(tc2)));
        System.out.println(Arrays.toString(solution(tc3)));
    }

    public static int[] solution(int[] arr) {
        // 빈 배열이나 null 체크
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }

        // 배열 정렬 (중복된 숫자들을 연속되게 만들기 위함)
        Arrays.sort(arr);

        int currentNumber = arr[0];  // 현재 숫자
        int currentCount = 1;        // 현재 숫자의 등장 횟수
        int maxNumber = arr[0];      // 가장 많이 등장한 숫자
        int maxCount = 1;            // 최대 등장 횟수

        // 정렬된 배열을 순회하며 연속된 같은 숫자 카운트
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentNumber) {
                currentCount++;
            } else {
                // 새로운 숫자를 만났을 때, 이전 카운트와 최대값 비교
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxNumber = currentNumber;
                }
                currentNumber = arr[i];
                currentCount = 1;
            }
        }

        // 마지막 숫자의 카운트 확인
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxNumber = currentNumber;
        }

        return new int[]{maxNumber, maxCount};
    }
}
