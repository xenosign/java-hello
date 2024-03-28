package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit(int value) {
        // 컴파일 에러 발생, 이미 10 으로 초기화가 된 final 필드에 다시 값을 할당하려고 하기 때문
        // this.value = value;
    }
}
