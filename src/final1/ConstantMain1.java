package final1;

import static final1.Constant.*;

public class ConstantMain1 {
    public static void main(String[] args) {
        // 최대 참여자 수의 변경이 필요한 경우? 코드 여러곳을 변경해 줘야한다
        // 다른 개발자가 해당 숫자를 보면 1000 의 의미를 파악하기 어렵다
        // 이 때 상수를 사용하면 문제 해결이 가능하다
        // System.out.println("프로그램 최대 참여자 수 : " + 1000);
        System.out.println("프로그램 최대 참여자 수 : " + MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);

        // if (currentUserCount > 1000) {
        if (currentUserCount > MAX_USERS) {
            System.out.println("대기자로 등록합니다");
        } else {
            System.out.println("게임에 참여합니다");
        }
    }
}
