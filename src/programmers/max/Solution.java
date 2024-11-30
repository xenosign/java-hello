package programmers.max;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public int[] solution(int[] nums) {
        int[] answer = new int[2];

        return answer;
    }

    public static void main(String[] args) {
        int[] case1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int numsCount = 200;
        int[] case2 = new int[numsCount];
        Random random = new Random();

        for (int i = 0; i < 200; i++) {
            // -100000에서 100000 사이의 무작위 정수 생성
            case2[i] = random.nextInt(200001) - 100000;
        }

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(case1)));
        System.out.println(Arrays.toString(solution.solution(case2)));
    }
}
