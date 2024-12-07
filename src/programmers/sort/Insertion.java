package programmers.sort;

import java.util.Arrays;

public class Insertion {
    public int[] sort(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int key = arr[i];  // 현재 삽입될 숫자를 key로 설정
            int j = i - 1;     // key의 앞 원소부터 비교 시작

            // key보다 큰 원소들을 뒤로 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;  // 적절한 위치에 key 삽입
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 1, 5, -4, 8};

        Insertion insertion = new Insertion();
        System.out.println(Arrays.toString(insertion.sort(arr)));
    }
}
