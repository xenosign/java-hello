package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 일시적 다운캐스팅을 사용하여서 Child 인스턴스를 만들지 않고 자식 클래스에 접근 가능
        ((Child) poly).childMethod();
    }
}
