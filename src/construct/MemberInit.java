package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String inputName, int inputAge, int InputGrade) {
        // 현 상황에서는 매개변수가 코드 블럭상 우선 순위가 높아서 이렇게 매개변수 이름을 변경해 주어야 한다
        // name 을 그대로 쓰면 멤버 변수에 접근이 안되기 때문에
        // 이 케이스는 사실 this 가 생략된 것이라고 생각하면 된다 -> 스코프 상 멤버 변수를 가르킬 수 밖에 없으므로
        name = inputName;
        age = inputAge;
        grade = InputGrade;
    }

    void initMemberByThis(String name, int age, int grade) {
        // 이렇게 this 를 적으면, this 는 자기자신 인스턴스를 가르키기 때문에 아래 처럼 멤버 변수와 매개 변수의 이름이 같아서 생기는
        // 문제를 해결할 수 있다
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 과거에는 멤버 변수를 쉽게 구분하기 위해 무조건 this 를 적어주는 스타일이 존재
    // 요즘은 IDE 가 색으로 표기를 해줘서 요즘은 안쓰기도 한다. 취향 차이
    // 김영한 says : 코딩 스타일에서 취향 차이에 근본은 왜? 이다 왜? 에 대한 답을 못 내는 케이스라면 안쓰는 편이 좋다!
}
