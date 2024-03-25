package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("1. data = " + data);
        data = null;
        System.out.println("1. data = " + data);
    }

    // GC(Garbage Collection) 의 최후
    // 7번째 줄에서 생성한 인스턴스의 경우는 참조값을 알 수 있는 방법이 없으로 접근이 불가능한 인스턴스가 되고
    // 이는 메모리의 낭비만 초래하므로 JVM GC가 알아서 삭제해 버린다
}
