package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 100); // 자기 자신의 생성자를 호출
        System.out.println("ClassB 생성자, a = " + a);
    }

    public ClassB(int a, int b) {
        super();  // 기본 생성자가 매개 변수가 없을 경우 생략 가능
        System.out.println("ClassB 생성자, a = " + a + " / b = " + b);
    }
}
