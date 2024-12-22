// https://school.programmers.co.kr/learn/courses/30/lessons/12939

package letureTomAndHarry.maxAndMin;

import java.util.Arrays;

public class Solution {
    // Arrays.sort() 없이 구현, 정석
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int num;

        String[] strArr = s.split(" ");

        //  O(n)
        for (int i = 0; i < strArr.length; i++) {
            num = Integer.parseInt(strArr[i]);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        answer = min + " " + max;

        return answer;
    }

    // 반복문 사용, Arrays.sort() 사용
    public String solution2(String s) {
        String answer = "";
        int min, max;

        String[] strArr = s.split(" ");

        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(numArr);

        min = numArr[0];
        max = numArr[numArr.length - 1];

        answer = min + " " + max;

        return answer;
    }

    // 스트림 사용
    public String solution3(String s) {
        String answer = "";

        String[] strArr = s.split(" ");
        // 정석 스트림
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);

        // 지랄 버전
        int[] sortedNumArr = Arrays.stream(Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray()).sorted().toArray();

        answer = numArr[0] + " " + numArr[numArr.length - 1];

        return answer;
    }


    public static void main(String[] args) {
        String ex1 = "1 2 3 4";
        String ex2 = "-1 -2 -3 -4";
        String ex3 = "-1 -1";

        Solution solutionClass = new Solution();

        System.out.println(solutionClass.solution(ex1));
        System.out.println(solutionClass.solution(ex2));
        System.out.println(solutionClass.solution(ex3));

        System.out.println(solutionClass.solution2(ex1));
        System.out.println(solutionClass.solution2(ex2));
        System.out.println(solutionClass.solution2(ex3));

        System.out.println(solutionClass.solution3(ex1));
        System.out.println(solutionClass.solution3(ex2));
        System.out.println(solutionClass.solution3(ex3));
    }
}
