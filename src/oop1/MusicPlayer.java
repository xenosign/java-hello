package oop1;

public class MusicPlayer {
    boolean isOn = false;
    int volume = 0;

    void on() {
        isOn = true;
        System.out.println("플레이어를 켭니다");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어를 끕니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨 : " + volume);
    }

    void showStatus() {
        System.out.println("플레이어는 " + (isOn == true ? "ON" : "OFF") + " 상태 입니다");
    }
}
