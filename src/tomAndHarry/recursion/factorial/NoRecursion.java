package tomAndHarry.recursion.factorial;

public class NoRecursion {
    public int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int num = 7;
        NoRecursion factorial = new NoRecursion();
        System.out.println(factorial.solution(num));
    }
}
