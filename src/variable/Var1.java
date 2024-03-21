package variable;

public class Var1 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 10.5;
        boolean trueOrFalse = true;
        char letter = 'c';
        String word = "hello";

        // int 범위(2,147,483,648) 를 넘어서면 숫자 뒤에 L 붙일 것
        long l = 131231233131L;
        // float 쓰면 f 붙일 것, 소숫점 계산 오류가 많아서 안쓴다
        float f = 10.0f;
        double d = 10.0;

        // 문자열에 다른 타입을 더하면 문자열이 된다
        String str = "a + b = ";
        System.out.println(str + num1);

        int a = 0;
        int b = 0;

        b = a++;
        // a = 1; b = 0;
        System.out.println(a + " / " + b);

        a = 0;
        b = 0;

        b = ++a;

        // a = 1; b = 1;
        System.out.println(a + " / " + b);

        String str1 = "문자열1";
        String str2 = "문자열2";

        System.out.println("문자열".equals("문자열"));   // true
        System.out.println("문자열".equals(str1));     // false
        System.out.println(str.equals(str2));        // false

        int ex1 = 10;
        int ex2 = 20;
        int ex3 = 30;
        int sum = ex1 + ex2 + ex3;
        double avg = sum / 7.0;

        System.out.println(sum);
        System.out.println(avg);

        System.out.println(10 / 3);
    }
}
