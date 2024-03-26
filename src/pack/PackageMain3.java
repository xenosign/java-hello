package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 다른 패키지에 위치하는 같은 클래스명을 사용하고 싶으면, 하나는 패키지의 위치를 명시 해줘야 한다
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
