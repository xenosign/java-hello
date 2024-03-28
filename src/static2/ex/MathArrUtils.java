package static2.ex;

public class MathArrUtils {

    private MathArrUtils() {
        // 인스턴스 생성을 강제로 막아서 메모리 낭비 못하게 막기
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }
}
