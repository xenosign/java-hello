package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // protected 값, 다른 패키지이지만 상속 관계이므로 사용 가능
        // defaultValue = 1;   // default 값, 다른 패키지라서 호출 불가
        // privateValue = 1;   // private 값, 호출 자체가 불가능

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        printParent(); // public 이라 호출 가능, 그리고 호출 시점은 Parent 클래스 내부에서 자신을 호출하므로 모든 호출 가능
    }
}
