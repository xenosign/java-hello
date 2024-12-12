package tomAndHarry.recursion;

public class stringReverse {
    public static String solution(String str) {
        // 빈 문자열이거나 한 글자일 경우 재귀 종료
        if (str == null || str.length() <= 1) {
            return str;
        }

        // 첫 글자를 제외한 나머지를 뒤집고, 첫 글자를 끝에 붙임으로 뒤집기를 시작
        return solution(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String test = "Hello, World!";
        System.out.println("원본 문자열: " + test);
        System.out.println("뒤집은 문자열: " + solution(test));
    }
}
