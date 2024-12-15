package tomAndHarry.recursion.fibonacci;


public class Fibonacci {
    public int solution(int n) {
        if (n <= 1) return n;

        return solution(n - 1) + solution(n - 2);
    }

    public static void main(String[] args) {
        int num = 4;

        System.out.println(new Fibonacci().solution(num));
    }
}
