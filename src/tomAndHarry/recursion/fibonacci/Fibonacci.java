package tomAndHarry.recursion.fibonacci;


public class Fibonacci {
    public int solution(int n) {
        // 종료 조건 : Fibo(1) 은 1, Fibo(0) 은 0 이므로 1 이하일 때는 전달 받은 값을 그대로 리턴하면 된다
        if (n <= 1) return n;

        // 1 이상의 피보나치 순번은 그 이전과 전전의 피보나치 수열의 합을 더한 값이므로 아래와 같이 호출
        // 아래와 같이 호출 된 피보나치는 자신의 값을 모르므로 Fibo(1) 또는 Fibo(0) 이 나올 때 까지 재귀 호출을 하여
        // 자신의 값을 구하고 최종적으로 더해진다
        return solution(n - 1) + solution(n - 2);
    }

    public static void main(String[] args) {
        int num = 4;

        System.out.println(new Fibonacci().solution(num));
    }
}
