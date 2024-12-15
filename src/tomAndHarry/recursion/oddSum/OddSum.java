package tomAndHarry.recursion.oddSum;

public class OddSum {
    public static int sumOddNumbers(int n) {
        // n이 0이하면 0 리턴으로 시작
        if (n <= 0) {
            return 0;
        }

        // n이 홀수인 경우, 홀수 n 을 더하고 다음으로 작은 홀수(n-2)를 재귀 호출
        if (n % 2 != 0) {
            return n + sumOddNumbers(n - 2);
        }
        // n이 짝수인 경우, 자기보다 1 작은 숫자를 재귀 호출 (최초의 수가 짝수 일때 홀 수를 처음 호출 해줘야 하므로)
        else {
            return sumOddNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 7;  // 1 + 3 + 5 + 7 = 16
        System.out.println("1부터 " + n + "까지의 홀수의 합: " + sumOddNumbers(n));
    }
}