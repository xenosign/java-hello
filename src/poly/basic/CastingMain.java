package poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        // parent.childMethod() -> 자식 메서드에 접근이 불가능, 컴파일 에러 발생

        // 이런식으로 다운 캐스팅을 하면 자식 메서드에 접근이 가능하다
        Child child = (Child) poly;
        child.childMethod();
    }
}
