package construct;

public class MemberConstructMain1 {
    public static void main(String[] args) {
        // 커맨드 or 컨트롤 P => 현재 필요한 파라미터 정보 띄우기
        MemberConstruct member1 = new MemberConstruct("학생1", 16, 90);
        MemberConstruct member2 = new MemberConstruct("학생2", 17, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println(m.name + " / " + m.age + " / " + m.grade);
        }
    }

    // 생성자의 장점
    // 중복 호출 및 코드 감소, 예전에는 init 메서드를 한번 불러야 했지만 이제는 생성하면서 초기화가 가능
    // 사용자 지정 생성자가 있을 경우, 실수로 데이터를 누락하면 컴파일 단계에서 에러가 발생하여 문제를 쉽게 해결(가장 행복한 오류)
    // 사용자 지정 생성자가 없을 경우, 실수로 init 메서드를 안해주면 자동 초기화된 값들로 인해 예상치 못한 버그 발생 가능(해결이 어려운 버그)
    // 좋은 프로그램은 무한한 자유도가 있는 프로그램이 아닌 적절한 제한이 있는 프로그램이다 + 생성자는 최소한의 제약사항을 만들어 준다
}
