// https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java

package programmers.smallRectangle;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int longSide = 0;
        int shortSide = 0;

        for (int i = 0; i < sizes.length; i++) {
            longSide = Math.max(longSide, Math.max(sizes[i][0], sizes[i][1]));
            shortSide = Math.max(shortSide, Math.min(sizes[i][0], sizes[i][1]));
        }

        answer = longSide * shortSide;

        return answer;
    }

    public static void main(String[] args) {
        int[][] ex1 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] ex2 = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}};

        System.out.println(new Solution().solution(ex1));
        System.out.println(new Solution().solution(ex2));
    }
}
