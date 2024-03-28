package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // 생성자로 final 값 최초 1회 초기화 가능
        ConstructInit data1 = new ConstructInit(10);
        ConstructInit data2 = new ConstructInit(20);
        System.out.println("ConstructInit data1.value : " + data1.value);
        System.out.println("ConstructInit data2.value : " + data2.value);

        // 필드 초기화에서 10으로 값이 할당 되므로, 인스턴스가 달라도 무조건 10 이라는 값을 가짐
        // 대신 이러한 인스턴스가 많아지면 결국 똑같은 10을 가질 수 밖에 없는 변수가 메모리를 차지하게 됨
        // 따라서 이런 경우에는 static final 을 사용하여 static 영역에 하나만 존재하도록 만들어서 메모리 낭비 방지 가능
        FieldInit data3 = new FieldInit(10);
        FieldInit data4 = new FieldInit(20);
        System.out.println("FieldInit data1.value : " + data3.value);
        System.out.println("FieldInit data2.value : " + data4.value);
    }


}
