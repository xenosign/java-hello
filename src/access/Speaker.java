package access;

public class Speaker {
    private int volume = 0;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨 최대치");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가 합니다");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨을 10 감소 합니다");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
