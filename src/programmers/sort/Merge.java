package programmers.sort;

import java.util.Arrays;

public class Merge {
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);

            merge(arr, temp, left, mid, right);
        }
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        // 두 부분을 비교하며 병합
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // 왼쪽 부분의 남은 요소들을 복사
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    // 테스트를 위한 메인 메소드
    public static void main(String[] args) {
        int[] case1 = {5, 3, 8, 4, 9, 1, 6, 2, 7};

        Merge merge = new Merge();
        merge.sort(case1);

        System.out.println(Arrays.toString(case1));
    }
}