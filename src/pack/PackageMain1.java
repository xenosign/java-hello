package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();

        // 다른 패키지의 클래스를 호출 하려면 패키지 위치를 적어줘야만 한다
        pack.a.User user = new pack.a.User();
    }
}
