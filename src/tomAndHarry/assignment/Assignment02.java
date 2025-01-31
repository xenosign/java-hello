package tomAndHarry.assignment;

public class Assignment02 {
    public static void main(String[] args) {
        int tc1 = 1324;
        int tc2 = 1118;
        int tc3 = 1;
        int tc4 = 123456789;

        System.out.println(solution(tc1)); // 10
        System.out.println(solution(tc2)); // 11
        System.out.println(solution(tc3)); // 1
        System.out.println(solution(tc4)); // 45
    }

    public static int solution(int num) {
        // 기저 조건: 한 자리 숫자일 때
        if (num < 10) {
            return num;
        }

        // 현재 자릿수(나머지)와 나머지 자릿수들의 합(재귀)
        return num % 10 + solution(num / 10);
    }
}