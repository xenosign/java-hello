package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지, default => 컴파일 에러 발생
        // data.defaultField = 1;
        // data.defaultMethod();

        // private, 컴파일 에러 발생
        // data.privateField = 1;
        // deta.privateMethod();

        // 내부 호출, innerAccess 가 public 이므로 호출 가능. innerAccess 는 클래스의 메서드 이므로 내부의 모든 필드 및 메서드에 접근 가능
        data.innerAccess();
    }
}
