package tomAndHarry.sort.n2;

import java.util.Arrays;

public class Bubble {
    public int[] sort(int[] arr) {
        // Bubble 과정을 통해 제일 큰 값은 첫번째 반복에서 배열의 제일 뒤에 배치가 되므로 arr.length - 1 까지만 진행
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;    // swap 이 발생했는지 결정하는 flag -> 해당 flag 를 기반으로 정렬 여부 판단

            // 버블 과정을 진행하는 반복문
            // i 번의 반복마다 i 번째로 큰 수는 배열의 뒤에 배치가 되므로,  arr.length - 1 - i 버블 과정
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 한 칸씩 뒤로 이동 하면서 뒤의 값과 비교하여 앞의 값이 크면 서로 교환
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
