package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        // 절차 지향 프로그래밍 시작
        
        int volume = 0;
        boolean isOn = false;

        // 볼륨 증가
        volume++;
        System.out.println("볼륨은 : " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("볼륨은 : " + volume);

        // 플레이어 상태
        System.out.println("플레이어는 " + (isOn == true ? "ON" : "OFF") + " 상태 입니다");

        // 플레이어 켜기, 끄기
        isOn = false;
        System.out.println("플레이어를 종료합니다.");
    }
}
