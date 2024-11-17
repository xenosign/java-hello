// https://school.programmers.co.kr/learn/courses/30/lessons/42748

package programmers.kthNum;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int target = commands[i][2] - 1;

            int[] sliceAndSorted = Arrays.stream(Arrays.copyOfRange(array, start, end)).sorted().toArray();

            answer[i] = sliceAndSorted[target];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] command = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(new Solution().solution(arr, command)));
    }
}
