package programmers.wordChain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> wordSet = new HashSet<>();

        if (words[0].length() == 1) {
            answer[0] = 1;
            answer[1] = 1;
        } else {
            wordSet.add(words[0]);
        }


        for (int i = 1; i < words.length; i++) {
            String thisWord = words[i - 1];
            String nextWord = words[i];

            char lastLetter = thisWord.charAt(thisWord.length() - 1);
            char nextFirstLetter = nextWord.charAt(0);

            if (lastLetter != nextFirstLetter) {
                int who = (i % n) + 1;
                int turn = (i / n) + 1;
                answer[0] = who;
                answer[1] = turn;
                return answer;
            } else if (wordSet.contains(nextWord) || nextWord.length() == 1) {
                int who = (i % n) + 1;
                int turn = (i / n) + 1;
                answer[0] = who;
                answer[1] = turn;
                return answer;
            } else {
                wordSet.add(nextWord);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int n = 3;
//        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int n = 2;
        String[] words = {"abc", "dca"};

        Solution wordChain = new Solution();
        System.out.println(Arrays.toString(wordChain.solution(n, words)));
    }
}
