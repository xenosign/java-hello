package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();

        // 실행 결과
        // ClassA 생성자
        // ClassB 생성자, a = 10 / b = 20
        // ClassC 생성자

        ClassB classB = new ClassB(10);

        // 실행 결과
        // ClassA 생성자
        // ClassB 생성자, a = 10 / b = 100
        // ClassB 생성자, a = 10
    }
}
