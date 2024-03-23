package method;

public class MethodCasting {
    public static void main(String[] args) {
        double doubleNumber = 1.5;
        int intNumber = 1;

        // 명시적 형변환으로 변환해서 넘기기
        printInt((int) doubleNumber);
        // 큰 데이터 타입으로 변환할 때에는 문제가 없다
        printDouble(intNumber);
    }

    public static void printInt(int num) {
        System.out.println("숫자 : " + num);
    }

    public static void printDouble(double num) {
        System.out.println("숫자 : " + num);
    }
}
