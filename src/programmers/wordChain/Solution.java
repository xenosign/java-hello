package programmers.wordChain;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        Solution wordChain = new Solution();
        System.out.println(Arrays.toString(wordChain.solution(n, words)));
    }
}
