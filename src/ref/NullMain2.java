package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // null 에서 데이터 접근을 시도하여 NullPointerException 에러 발생
    }

    // 참조값 없이 객체를 참조하려고 하면 NullPointerException 에러가 발생한다
    // 즉, 어딜 가야하는데 주소가 없다? 에러가 날 수 밖에 없다
    // 참조값이 없을 때 . 으로 데이터에 접근을 시도하면 발생하는 에러
}
