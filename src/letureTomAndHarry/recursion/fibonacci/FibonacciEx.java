package letureTomAndHarry.recursion.fibonacci;

// 팥붕어빵 틀
public class FibonacciEx {
    public int count = 0;

    public int solution(int n) {
        if (n <= 1) return n;

        count++;

        return solution(n - 1) + solution(n - 2);
    }

    public static void main(String[] args) {
        FibonacciEx fibo1 = new FibonacciEx();
        FibonacciEx fibo2 = new FibonacciEx();

        // solution = 3, count = 4
        System.out.println(fibo1.count);  // 시완 : 0, 연비 : 0
        System.out.println(new FibonacciEx().solution(4)); // 3, 3

        System.out.println(fibo2.count);  // 0, 0
        System.out.println(fibo2.solution(4)); // 3, 3

        System.out.println(fibo1.count); // 0, 0
        System.out.println(fibo2.count); // 0, 4
    }
}
