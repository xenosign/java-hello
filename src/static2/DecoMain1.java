package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello, java";

        DecoUtil1 utils = new DecoUtil1();

        String deco = utils.deco(s);

        System.out.println("Before : " + s);
        System.out.println("After : " + deco);
    }

    // Deco 는 사실 멤버 변수도 없고, 기능만 제공하는데 객체를 생성하고 사용하는 불필요한 과정이 필요하다
}

