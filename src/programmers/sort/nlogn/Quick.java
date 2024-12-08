package programmers.sort.nlogn;

import java.util.Arrays;

public class Quick {
    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        quickSort(arr, 0, arr.length - 1);

        return arr;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start + 1;
        int right = end;

        while (left <= right) {
            // pivot보다 큰 왼쪽 요소 찾기
            while (left <= end && arr[left] <= pivot) {
                left++;
            }

            // pivot보다 작은 오른쪽 요소 찾기
            while (right > start && arr[right] > pivot) {
                right--;
            }

            // left와 right가 교차하지 않았다면 교환
            if (left < right) {
                swap(arr, left, right);
            }
        }

        // pivot을 기준으로 분할이 완료된 위치에 pivot 배치
        swap(arr, start, right);
        return right;  // pivot의 최종 위치 반환
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] case1 = {5, 3, 8, 4, 9, 1, 6, 2, 7};

        Quick quick = new Quick();
        System.out.println(Arrays.toString((quick.sort(case1))));
    }
}
