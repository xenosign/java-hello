package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("Main 시작");
        method1(10);
        // option + 윗방향키 = 단어 선택
        System.out.println("Main 끝");
    }

    static void method1(int m1) {
        System.out.println("메소드1 시작");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("메소드1 끝");
    }

    static void method2(int m2) {
        System.out.println("메소드2 시작");
        System.out.println("메소드2 끝");
    }
}
