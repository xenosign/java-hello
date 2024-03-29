package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);  // 상속 받은 클래스의 기본 생성자가 매개 변수가 있으므로, 자동 생성 X -> 개발자가 직접 처리 해줘야 함
        System.out.println("ClassC 생성자");
    }
}
