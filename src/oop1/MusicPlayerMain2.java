package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 시작
        MusicPlayerData data = new MusicPlayerData();

        // 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 플레이어 상태
        showStatus(data);

        // 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨은 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨은 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("플레이어는 " + (data.isOn == true ? "ON" : "OFF") + " 상태 입니다");
    }

    // 메서드를 통한 모듈화의 장점
    // 중복 제거 : 중복 로직이 제거 되고, 같은 로직이 필요하면 메서드를 여러번 호출하면 된다
    // 변경 영향 범위 : 기능 수정 시 메서드 내부만 변경하면 끝
    // 메서드 이름 추가 : 메서드 이름을 통해 코드를 좀 더 명확하게 이해 가능

    // 하지만 아직은 데이터와 기능이 분리되어 있으므로, 관리상의 한계가 존재하며
    // 기능은 데이터에 밀접한 연관을 가질 수 밖에 없으므로 데이터와 기능을 묶어서 관리할 필요가 있다
}


