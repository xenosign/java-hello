package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        // instanceof 사용 시 바로 변수 선언 가능
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
