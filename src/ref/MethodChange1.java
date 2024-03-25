package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("호출 전 : " + a);
        changePrimitive(a);
        System.out.println("호출 후 : " + a); // 둘 다 10
    }

    // 기본형은 값이 복사되어서 값만 전달 되므로 변화가 없다

    public static void changePrimitive(int x) {
        x = 20;
    }
}
