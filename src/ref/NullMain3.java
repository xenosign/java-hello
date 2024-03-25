package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        System.out.println(bigData.count);
        System.out.println(bigData.data);

        // NullPointerException 에러 발생
        // data 는 Data 인스턴스인데 초기값 설정이 안되어 있으므로 null 로 초기화. 따라서 NullPointerException 발생
        // System.out.println(bigData.data.value);

        // 문제 해결
        bigData.data = new Data();
        System.out.println(bigData.data.value);
    }
}
