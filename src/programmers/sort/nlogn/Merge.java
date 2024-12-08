package programmers.sort.nlogn;

import java.util.Arrays;

// 병합 정렬 - O(n log n)
public class Merge {
    public void sort(int[] arr) {
        // 배열이 비어있거나 길이가 1 이하면 정렬할 필요 없음
        if (arr == null || arr.length <= 1) {
            return;
        }

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            // 중간 지점을 계산하여 분할
            int mid = left + (right - left) / 2;

            // 왼쪽 절반 정렬
            mergeSort(arr, temp, left, mid);
            // 오른쪽 절반 정렬
            mergeSort(arr, temp, mid + 1, right);

            // 정렬된 두 배열을 병합
            merge(arr, temp, left, mid, right);
        }
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // 작업할 구간을 임시 배열에 복사
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;      // 왼쪽 배열 시작점
        int j = mid + 1;   // 오른쪽 배열 시작점
        int k = left;      // 결과를 저장할 위치

        // 두 배열을 비교하며 병합
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

        // 왼쪽 배열에 남은 요소들을 복사
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] case1 = {5, 3, 8, 4, 9, 1, 6, 2, 7};

        Merge merge = new Merge();
        merge.sort(case1);

        System.out.println(Arrays.toString(case1));
    }
}