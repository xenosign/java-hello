package static2;

public class DecoData {
    private static int staticValue;
    private int instanceValue;

    // static 메서드
    public static void staticCall() {
        staticValue++;  // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        // instanceValue++; => 인스턴스 변수 접근 불가능
        // instanceMethod(); => 인스턴스 메서드 접근 불가능
        // 인스턴스 변수, 메서드는 인스턴스가 생성 되어야만 힙 영역에 존재!
        // 클래스 영역에서는 아직 생성이 안되었으므로 접근이 불가능!
        // 따라서 클래스 영역에서는 클래스 영역에 존재하는 것에만 접근이 가능하다
    }

    private static void staticMethod() {
        System.out.println("staticValue " + staticValue);
    }

    // 인스턴스 메서드
    public void instanceCall() {
        staticValue++;  // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        instanceValue++; // 인스턴스 메서드 이므로 접근 가능
        instanceMethod(); // 인스턴스 메서드 이므로 접근 가능

    }

    private void instanceMethod() {
        System.out.println("instanceValue " + instanceValue);
    }
}
