package programmers.sort;

import java.util.Arrays;

public class Selection {
    public int[] sort(int[] arr) {
        int minIndex;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

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
