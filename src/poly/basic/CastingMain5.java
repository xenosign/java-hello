package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        // Child 의 인스턴스인지 확인 후, 안전하게 다운캐스팅 하여 사용
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
            // ((Child) parent).childMethod(); -> 요 방법도 가능
        }
    }
}
