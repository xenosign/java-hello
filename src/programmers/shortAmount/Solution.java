package programmers.shortAmount;

public class Solution {
    public long solution(long price, long money, long count) {
        if (money % price == 0) return 0;

        long totalAmount = 0;

        for (int i = 1; i <= count; i++) {
            totalAmount += i * price;
        }

        long shortAmount = totalAmount - money;

        return Math.max(shortAmount, 0);
    }

    public static void main(String[] args) {
        long[] case1 = {3, 20, 4};
        long[] case2 = {2500, 4, 2500};

        Solution solution = new Solution();

        System.out.println(solution.solution(case1[0], case1[1], case1[2]));
        System.out.println(solution.solution(case2[0], case2[1], case2[2]));
    }
}
