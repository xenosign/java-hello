package tomAndHarry.recursion.fibonacci;


public class Fibonacci {
    private static int cnt = 0;

    public int solution(int n) {
        if (n <= 1) return n;
        cnt++;

        return solution(n - 1) + solution(n - 2);
    }

    public static void main(String[] args) {
        int num = 7;

        System.out.println(new Fibonacci().solution(num));
        System.out.println("총 재귀 횟수 : " + cnt);
    }
}
