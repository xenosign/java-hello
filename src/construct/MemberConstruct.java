package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        // 중복 부분
        // this.name = name;
        // this.age = age;

        // this 를 이용해 기존 생성자를 불러 중복 부분 해결
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자2 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // 생성자는 인스턴스를 생성하자마자 바로 초기값을 할당하거나 필요한 기능을 수행해야할 때 사용

    // 생성자는 메서드와 비슷하지만 아래의 특성이 존재
    // 생성자 이름은 클래스와 동일해야 한다
    // 생성자는 반환 타입이 없다
    // 나머지는 메서드와 동일하다
}
