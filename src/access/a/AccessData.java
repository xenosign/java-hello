package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("퍼블릭 : " + publicField);
    }

    void defaultMethod() {
        System.out.println("디폴트 : " + defaultField);
    }

    private void privateMethod() {
        System.out.println("프라이빗 : " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
