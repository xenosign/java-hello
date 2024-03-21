package cond;

public class Switch {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            default:
                coupon = 3000;
        }

        // 자바 14 버전 부터 나온 switch 문
        int coupon2 = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 3000;
        };
    }
}
