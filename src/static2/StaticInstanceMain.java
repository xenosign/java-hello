package static2;

import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class StaticInstanceMain {
    public static void main(String[] args) {
        // 정적 호출
        System.out.println("정적 호출");
        staticCall();

        // 인스턴스 호출, 인스턴스를 생성해야만 호출 가능
        System.out.println("인스턴스 호출1");
        DecoData data = new DecoData();
        data.instanceCall();

        // 인스턴스 호출, 인스턴스를 생성해야만 호출 가능
        System.out.println("인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 메서드로 마찬가지로 클래스 메서드는 클래스 명으로 접근을 해야 헷갈리지 않는다
    }
}
