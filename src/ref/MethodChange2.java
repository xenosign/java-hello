package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("호출 전 : " + dataA.value); // 10
        changePrimitive(dataA);
        System.out.println("호출 후 : " + dataA.value); // 20
    }

    // 참조형은 참조 주소가 복사되어 전달 되므로, 결국 매개변수로도 인스턴스 자체에 접근이 가능하므로 실제 인스턴스의 필드가 변경

    public static void changePrimitive(Data dataX) {
        dataX.value = 20;
    }
}
