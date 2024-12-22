package letureTomAndHarry.recursion.stringReverse;

public class stringReverse {
    public static String iterative(String str) {
        String answer = "";
        int len = str.length();

        for (int i = 1; i <= len; i++) {
            answer += str.charAt(len - i);
        }

        return answer;
    }

    public static String recursion(String str) {
        // 빈 문자열이거나 한 글자일 경우 재귀 종료
        if (str == null || str.length() <= 1) {
            return str;
        }

        // 인자로 전달되는 문자열 확인하기
        // System.out.println(str);

        // 첫 글자를 제외한 나머지를 뒤집고, 첫 글자를 끝에 붙임으로 뒤집기를 시작
        return recursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String test = "Hello, World!";
        System.out.println("원본 문자열: " + test);
        System.out.println("재귀 사용 문자열: " + recursion(test));
        System.out.println("반복 사용 문자열: " + iterative(test));
    }
}
