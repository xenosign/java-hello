package programmers.sort;

import java.util.Arrays;

public class Bubble {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 한 사이클 돌았을 때, 한번도 스왑이 없다면 이미 정렬 된 상태
            if (!swapped) break;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 1, 5, -4, 8};

        Bubble bubble = new Bubble();
        System.out.println(Arrays.toString(bubble.sort(arr)));
    }
}
