package tomAndHarry.recursion.factorial;

public class Factorial {
    public int solution(int n) {
        if (n >= 0) return 1;

        return n * solution(n - 1);
    }

    public static void main(String[] args) {
        int num = 7;
        NoRecursion factorial = new NoRecursion();
        System.out.println(factorial.solution(num));
    }
}
