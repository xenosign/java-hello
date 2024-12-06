// https://school.programmers.co.kr/learn/courses/30/lessons/120835

package programmers.emergency;


import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Integer[] copyArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(copyArr, Collections.reverseOrder());


        for (int i = 0; i < copyArr.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (copyArr[i] == emergency[j]) {
                    answer[j] = i + 1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 76, 24};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
