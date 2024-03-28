package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A " + Data3.count);

        Data3 data2 = new Data3("A");
        System.out.println("A " + Data3.count);

        // 인스턴스를 통한 접근
        // 권장 X, 이건 static 변수인지 인스턴스 변수인지 헷갈린다
        Data3 data3 = new Data3("A");
        System.out.println("A " + data3.count);
    }
}
