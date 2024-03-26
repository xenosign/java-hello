package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 시작
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();
    }

    // 사용자는 사실 객체 내부의 데이터는 몰라도 된다, 기능만 알고 잘 쓰기만 하면 될 뿐
    // 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 외부에 제공하는 것 => 캡슐화!
    // 캡슐화가 된 코드는 캡슐 내부의 코드만 변경해도 사용하는 입장에서는 전혀 신경 쓸 필요가 없다
    // 단, 메서드 이름이 변경되면 클라이언트 사이드도 변경해줘야 한다


    // 객체 지향은 절차 지향과 달리 어떤 순서로 개발하느냐가 중요한 것이 아니라 어떻게 하면 객체를 잘 만들 수 있을지가 중요하다
}


