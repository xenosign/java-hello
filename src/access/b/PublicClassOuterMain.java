package access.b;

// 강제 import

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 패키지 위치가 다르므로 default 클래스 호출 불가능
        // 강제로 import 를 해도 컴파일 에러가 발생한다
        // DefaultClass1 defaultClass1 = new DefaultClass1();
        // DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
