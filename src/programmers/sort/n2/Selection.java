package programmers.sort.n2;

import java.util.Arrays;

public class Selection {
    public int[] sort(int[] arr) {
        int minIndex;
        int temp;

        // 제일 작은 값을 찾아서 첫번째에 두기 위한 바깥 반복문
        // arr.length - 1 반복에서 제일 큰 값은 알아서 배열의 끝에 위치 되므로 arr.length - 1 까지 진행
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;   // 제일 작은 값을 임의로 배열의 첫번째 값이라고 지정

            // 배열에서 제일 작은 값을 찾는 알고리즘 -> min / max 응용
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 제일 작은 값과 첫번째 배열의 값을 교환
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 1, 5, -4, 8};

        Selection selection = new Selection();
        System.out.println(Arrays.toString(selection.sort(arr)));
    }
}
