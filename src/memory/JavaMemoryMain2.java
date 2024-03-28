package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("Main 시작");
        method1();
        System.out.println("Main 끝");
    }

    static void method1() {
        System.out.println("메소드1 시작");
        Data data = new Data(10);
        method2(data);
        System.out.println("메소드1 끝");
    }

    static void method2(Data data2) {
        System.out.println("메소드2 시작");
        System.out.println("data2 value : " + data2.getValue());
        System.out.println("메소드2 끝");
    }
}
