package static2.ex;

import static static2.ex.MathArrUtils.*;

public class MathArrMain {
    // alt + enter => 동작 자동 추천
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println("합계 : " + sum(arr));
        System.out.println("평균 : " + avg(arr));
        System.out.println("최소값 : " + min(arr));
        System.out.println("최대값 : " + max(arr));

    }
}
