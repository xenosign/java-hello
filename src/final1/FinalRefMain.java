package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data;    // 참조형
        data = new Data();
        // data = new Data();  // 컴파일 에러 발생, 참조값 변경을 시도

        // 하지만 인스턴스의 필드는 변경이 가능하다!
        // 참조값만 파이널일 뿐, 인스턴스의 필드는 파이널이 아니기 때문
        data.value = 20;
        System.out.println(data.value);
        data.value = 30;
        System.out.println(data.value);
    }
}
