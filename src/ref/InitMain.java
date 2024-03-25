package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println(data.value1 + " / " + data.value2);
    }

    // 변수의 종류
    // 멤버 변수(필드) : 클래스에 선언, 인스턴스 생성시 자동으로 초기화 된다. 숫자는 0 / boolean 은 false / 참조형은 null 로 초기화 된다
    // 지역 변수 : 메서드에 선언, 매개 변수도 지역 변수의 한 종류이다. 특정 지역에서만 사용되며 메서드 종료시 제거된다. 항상 직접 초기화 필요 
}
