package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello, java";
        String deco = DecoUtil2.deco(s);

        System.out.println("Before : " + s);
        System.out.println("After : " + deco);
    }

    // static 을 사용하여 인스턴스 생성 없이 바로 메서드만 사용하여 해결!
}

