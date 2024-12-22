package letureTomAndHarry.collection.array;

import java.util.Arrays;

public class ArrayLimits {
    public static void main(String[] args) {
        // 1. 배열에 숫자 추가하는 경우
        System.out.println("=== 배열에 숫자 추가하기 ===");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("원본 배열: " + Arrays.toString(numbers));

        // 11을 추가하기 위해 새로운 배열 생성 필요
        int[] newNumbers = new int[numbers.length + 1];

        // 기존 배열의 모든 요소를 새 배열로 복사
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        // 새로운 값 추가
        newNumbers[numbers.length] = 11;
        numbers = newNumbers;
        System.out.println("11 추가 후 (새로운 배열): " + Arrays.toString(numbers));

        // 2. 배열에서 숫자 삭제하는 경우
        System.out.println("\n=== 배열에서 숫자 삭제하기 ===");
        System.out.println("원본 배열: " + Arrays.toString(numbers));

        // 11을 삭제하기 위해 새로운 배열 생성 필요
        int[] afterRemove = new int[numbers.length - 1];

        // 마지막 요소(11)를 제외한 모든 요소를 새 배열로 복사
        for (int i = 0; i < afterRemove.length; i++) {
            afterRemove[i] = numbers[i];
        }

        numbers = afterRemove;
        System.out.println("11 삭제 후 (새로운 배열): " + Arrays.toString(numbers));

        // 3. 배열에서 중간값(5) 삭제하는 경우
        System.out.println("\n=== 배열에서 5 삭제하기 ===");
        System.out.println("원본 배열: " + Arrays.toString(numbers));

        // 5를 삭제하기 위해 새로운 배열 생성
        int[] afterRemoveMiddle = new int[numbers.length - 1];
        int removeIndex = 4;  // 5가 있는 인덱스

        // 1) 삭제할 위치 전까지 복사
        for (int i = 0; i < removeIndex; i++) {
            afterRemoveMiddle[i] = numbers[i];
        }

        // 2) 삭제할 위치 이후부터 한 칸씩 당겨서 복사
        for (int i = removeIndex + 1; i < numbers.length; i++) {
            afterRemoveMiddle[i - 1] = numbers[i];
        }

        numbers = afterRemoveMiddle;
        System.out.println("5 삭제 후 (새로운 배열): " + Arrays.toString(afterRemoveMiddle));
    }
}
