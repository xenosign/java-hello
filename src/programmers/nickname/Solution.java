// https://school.programmers.co.kr/learn/courses/30/lessons/340200

package programmers.nickname;

import java.util.Arrays;

public class Solution {
    public String solution(String nickname) {
        String answer = "";
        for (int i = 0; i < nickname.length(); i++) {
            if (nickname.charAt(i) == 'l') {
                answer += "I";
            } else if (nickname.charAt(i) == 'w') {
                answer += "vv";
            } else if (nickname.charAt(i) == 'W') {
                answer += "VV";
            } else if (nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }
        if (answer.length() < 4) {
            answer += "o".repeat(4 - answer.length());
        }

        if (answer.length() > 8) {
            answer = answer.substring(0, 8);
        }
        return answer;
    }

    public static void main(String[] args) {
        String ex1 = "WORLDworld";
        String ex2 = "GO";

        Solution solution = new Solution();

        System.out.println(solution.solution(ex1));
        System.out.println(solution.solution(ex2));
    }
}
