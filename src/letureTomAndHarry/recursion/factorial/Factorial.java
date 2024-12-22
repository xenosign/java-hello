package letureTomAndHarry.recursion.factorial;

import tomAndHarry.recursion.factorial.NoRecursion;

public class Factorial {
    public int solution(int n) {
        if (n == 0) return 1; // 종료 조건 설정이 1번

        // fac(4) = 4 * fac(3)
        //        = 4 * 3 * fac(2)
        //        = 4 * 3 * 2 * fac(1)
        //        = 4 * 3 * 2 * 1 * 1
        return n * solution(n - 1);
    }

    public static void main(String[] args) {
        int num = 7;
        NoRecursion factorial = new NoRecursion();
        System.out.println(factorial.solution(num));
    }
}
