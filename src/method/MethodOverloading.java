package method;

public class MethodOverloading {
    public static void main(String[] args) {
        // 메서드 시그니처
        // 자바는 메서드 구분을 메서드명과 매개변수의 개수, 순서와 타입으로 구분한다
        // 반환 타입은 영향을 미치지 않는다

        // 매개변수 개수로 구분
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        // 매겨변수 타입으로 구분
        myMethod(1, 1.5);
        myMethod(1.5, 1);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }

}
